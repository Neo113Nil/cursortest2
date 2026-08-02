package androidx.compose.ui.window;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupLayout;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DialogWrapper extends ComponentDialog {
    public final View composeView;
    public final DialogLayout dialogLayout;
    public boolean isPressOutside;
    public Function0 onDismissRequest;
    public DialogProperties properties;

    /* renamed from: androidx.compose.ui.window.DialogWrapper$2, reason: invalid class name */
    public final class AnonymousClass2 extends Lambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ DialogWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(DialogWrapper dialogWrapper, int i) {
            super(1);
            this.$r8$classId = i;
            this.this$0 = dialogWrapper;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            DialogWrapper dialogWrapper = this.this$0;
            switch (i) {
                case 0:
                    if (dialogWrapper.properties.dismissOnBackPress) {
                        dialogWrapper.onDismissRequest.invoke();
                    }
                    return Unit.INSTANCE;
                default:
                    dialogWrapper.show();
                    return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(dialogWrapper, 11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogWrapper(Function0 function0, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dialogProperties.decorFitsSystemWindows ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        int i = 0;
        this.onDismissRequest = function0;
        this.properties = dialogProperties;
        this.composeView = view;
        Window window = getWindow();
        if (window == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Dialog has no window");
            throw null;
        }
        DialogProperties dialogProperties2 = this.properties;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = dialogProperties2.windowType;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        Trace.setDecorFitsSystemWindows(window, this.properties.decorFitsSystemWindows);
        window.setGravity(17);
        if (!this.properties.decorFitsSystemWindows) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            Api28Impl.INSTANCE.setLayoutInDisplayCutout(attributes2);
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl api30Impl = Api30Impl.INSTANCE;
                api30Impl.setFitInsetsSides(attributes2, 0);
                api30Impl.setFitInsetsTypes(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.properties.windowTitle);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo236toPx0680j_4(8.0f));
        dialogLayout.setOutlineProvider(new PopupLayout.AnonymousClass2(1));
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        dialogLayout.setTag(R.id.view_tree_lifecycle_owner, DBUtil.get(view));
        dialogLayout.setTag(R.id.view_tree_view_model_store_owner, Strings.get(view));
        dialogLayout.setTag(R.id.view_tree_saved_state_registry_owner, Countries.get(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, new AnonymousClass2(this, i), 2);
    }

    public static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.properties.dismissOnBackPress || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.onDismissRequest.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.properties.dismissOnClickOutside) {
            DialogLayout dialogLayout = this.dialogLayout;
            dialogLayout.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = dialogLayout.getChildAt(0)) != null) {
                int left = childAt.getLeft() + dialogLayout.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + dialogLayout.getTop();
                int height = childAt.getHeight() + top;
                int roundToInt = MathKt__MathJVMKt.roundToInt(motionEvent.getX());
                if (left <= roundToInt) {
                    if (roundToInt <= width) {
                        int roundToInt2 = MathKt__MathJVMKt.roundToInt(motionEvent.getY());
                        if (top <= roundToInt2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.isPressOutside = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.isPressOutside = false;
                    return onTouchEvent;
                }
            } else if (this.isPressOutside) {
                this.onDismissRequest.invoke();
                this.isPressOutside = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.isPressOutside = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    public final void updateParameters(Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        int i;
        this.onDismissRequest = function0;
        this.properties = dialogProperties;
        SecureFlagPolicy secureFlagPolicy = dialogProperties.securePolicy;
        boolean isFlagSecureEnabled = AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView);
        int ordinal = secureFlagPolicy.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                isFlagSecureEnabled = true;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                isFlagSecureEnabled = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(isFlagSecureEnabled ? 8192 : -8193, PKIFailureInfo.certRevoked);
        int ordinal2 = layoutDirection.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            i = 1;
        }
        DialogLayout dialogLayout = this.dialogLayout;
        dialogLayout.setLayoutDirection(i);
        boolean z = dialogProperties.decorFitsSystemWindows;
        boolean z2 = dialogProperties.usePlatformDefaultWidth;
        Window window2 = dialogLayout.window;
        boolean z3 = (dialogLayout.hasCalledSetLayout && z2 == dialogLayout.usePlatformDefaultWidth && z == dialogLayout.decorFitsSystemWindows) ? false : true;
        dialogLayout.usePlatformDefaultWidth = z2;
        dialogLayout.decorFitsSystemWindows = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !dialogLayout.hasCalledSetLayout) {
                window2.setLayout(i2, -2);
                dialogLayout.hasCalledSetLayout = true;
            }
        }
        setCanceledOnTouchOutside(dialogProperties.dismissOnClickOutside);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }
}
