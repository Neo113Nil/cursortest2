package androidx.compose.ui.window;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.glance.layout.SpacerKt$Spacer$3;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.squareup.cash.R;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PopupLayout extends AbstractComposeView {
    public Api33Impl$$ExternalSyntheticLambda0 backCallback;
    public final DerivedSnapshotState canCalculatePosition$delegate;
    public final View composeView;
    public final ParcelableSnapshotMutableState content$delegate;
    public final boolean isNested;
    public final int[] locationOnScreen;
    public Function0 onDismissRequest;
    public final WindowManager.LayoutParams params;
    public IntRect parentBounds;
    public final ParcelableSnapshotMutableState parentLayoutCoordinates$delegate;
    public LayoutDirection parentLayoutDirection;
    public final ParcelableSnapshotMutableState popupContentSize$delegate;
    public final PopupLayoutHelperImpl29 popupLayoutHelper;
    public PopupPositionProvider positionProvider;
    public final Rect previousWindowVisibleFrame;
    public PopupProperties properties;
    public boolean shouldCreateCompositionOnAttachedToWindow;
    public final SnapshotStateObserver snapshotStateObserver;
    public final WindowManager windowManager;

    /* renamed from: androidx.compose.ui.window.PopupLayout$2, reason: invalid class name */
    public final class AnonymousClass2 extends ViewOutlineProvider {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            switch (this.$r8$classId) {
                case 0:
                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
                    outline.setAlpha(RecyclerView.DECELERATION_RATE);
                    break;
                case 1:
                    outline.setRect(0, 0, view.getWidth(), view.getHeight());
                    outline.setAlpha(RecyclerView.DECELERATION_RATE);
                    break;
                default:
                    outline.setOval(0, 0, view.getWidth(), view.getHeight());
                    break;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PopupLayout(Function0 function0, PopupProperties popupProperties, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, boolean z) {
        super(view.getContext(), null, 6, r4);
        PopupLayoutHelperImpl29 popupLayoutHelperImpl30 = Build.VERSION.SDK_INT >= 30 ? new PopupLayoutHelperImpl30() : new PopupLayoutHelperImpl29();
        int i = 0;
        this.onDismissRequest = function0;
        this.properties = popupProperties;
        this.composeView = view;
        this.isNested = z;
        this.popupLayoutHelper = popupLayoutHelperImpl30;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.windowManager = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        PopupProperties popupProperties2 = this.properties;
        boolean isFlagSecureEnabled = AndroidPopup_androidKt.isFlagSecureEnabled(view);
        boolean z2 = popupProperties2.inheritSecurePolicy;
        int i2 = popupProperties2.flags;
        if (z2 && isFlagSecureEnabled) {
            i2 |= PKIFailureInfo.certRevoked;
        } else if (z2 && !isFlagSecureEnabled) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.properties.windowType;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize$delegate = Updater.mutableStateOf$default(null);
        this.parentLayoutCoordinates$delegate = Updater.mutableStateOf$default(null);
        this.canCalculatePosition$delegate = Updater.derivedStateOf(new KeyHandle$keyPair$2(this, 5));
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new SnapshotStateObserver(new AndroidPopup_androidKt$Popup$7$1(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, DBUtil.get(view));
        setTag(R.id.view_tree_view_model_store_owner, Strings.get(view));
        setTag(R.id.view_tree_saved_state_registry_owner, Countries.get(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo236toPx0680j_4(8.0f));
        setOutlineProvider(new AnonymousClass2(i));
        this.content$delegate = Updater.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.f12lambda$1131826196);
        this.locationOnScreen = new int[2];
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-857613600);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.content$delegate.getValue()).invoke(gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SpacerKt$Spacer$3(this, i, 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.properties.dismissOnBackPress) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final IntRect getDisplayBounds() {
        int i = this.properties.flags & 512;
        View view = this.composeView;
        Rect rect = this.previousWindowVisibleFrame;
        PopupLayoutHelperImpl29 popupLayoutHelperImpl29 = this.popupLayoutHelper;
        if (i == 0) {
            popupLayoutHelperImpl29.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            popupLayoutHelperImpl29.getWindowBounds(rect, view);
        }
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui(z, i, i2, i3, i4);
        this.properties.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.getClass();
        this.windowManager.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnMeasure$ui(int i, int i2) {
        this.properties.getClass();
        IntRect displayBounds = getDisplayBounds();
        super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.getWidth(), PKIFailureInfo.systemUnavail), View.MeasureSpec.makeMeasureSpec(displayBounds.getHeight(), PKIFailureInfo.systemUnavail));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
        if (!this.properties.dismissOnBackPress || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = new Api33Impl$$ExternalSyntheticLambda0(this.onDismissRequest, 0);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = this.snapshotStateObserver;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.properties.dismissOnClickOutside) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < RecyclerView.DECELERATION_RATE || motionEvent.getX() >= getWidth() || motionEvent.getY() < RecyclerView.DECELERATION_RATE || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.onDismissRequest;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function02 = this.onDismissRequest;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    public final void setContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        setParentCompositionContext(compositionContext);
        this.content$delegate.setValue(function2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1076setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(String str) {
    }

    public final void updateParameters(Function0 function0, PopupProperties popupProperties, LayoutDirection layoutDirection) {
        int i;
        this.onDismissRequest = function0;
        if (!Intrinsics.areEqual(this.properties, popupProperties)) {
            popupProperties.getClass();
            this.properties = popupProperties;
            boolean isFlagSecureEnabled = AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView);
            boolean z = popupProperties.inheritSecurePolicy;
            int i2 = popupProperties.flags;
            if (z && isFlagSecureEnabled) {
                i2 |= PKIFailureInfo.certRevoked;
            } else if (z && !isFlagSecureEnabled) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.flags = i2;
            this.popupLayoutHelper.getClass();
            this.windowManager.updateViewLayout(this, layoutParams);
        }
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void updateParentBounds$ui() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates == null) {
                return;
            }
            long mo838getSizeYbymL2g = layoutCoordinates.mo838getSizeYbymL2g();
            long mo842localToScreenMKHz9U = this.isNested ? layoutCoordinates.mo842localToScreenMKHz9U(0L) : layoutCoordinates.mo843localToWindowMKHz9U(0L);
            IntRect m1053IntRectVbeCjmY = IntRectKt.m1053IntRectVbeCjmY((Math.round(Float.intBitsToFloat((int) (mo842localToScreenMKHz9U >> 32))) << 32) | (BodyPartID.bodyIdMax & Math.round(Float.intBitsToFloat((int) (mo842localToScreenMKHz9U & BodyPartID.bodyIdMax)))), mo838getSizeYbymL2g);
            if (m1053IntRectVbeCjmY.equals(this.parentBounds)) {
                return;
            }
            this.parentBounds = m1053IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void updatePosition() {
        IntSize intSize;
        final IntRect intRect = this.parentBounds;
        if (intRect == null || (intSize = (IntSize) this.popupContentSize$delegate.getValue()) == null) {
            return;
        }
        final long j = intSize.packedValue;
        IntRect displayBounds = getDisplayBounds();
        final long height = (displayBounds.getHeight() & BodyPartID.bodyIdMax) | (displayBounds.getWidth() << 32);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        this.snapshotStateObserver.observeReads(this, AndroidPopup_androidKt$Popup$5$1$1.INSTANCE$5, new Function0() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PopupLayout popupLayout = this;
                Ref$LongRef.this.element = popupLayout.positionProvider.mo190calculatePositionllwVHH4(intRect, height, popupLayout.parentLayoutDirection, j);
                return Unit.INSTANCE;
            }
        });
        long j2 = ref$LongRef.element;
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & BodyPartID.bodyIdMax);
        boolean z = this.properties.excludeFromSystemGesture;
        PopupLayoutHelperImpl29 popupLayoutHelperImpl29 = this.popupLayoutHelper;
        if (z) {
            int i = (int) (height & BodyPartID.bodyIdMax);
            popupLayoutHelperImpl29.getClass();
            setSystemGestureExclusionRects(CollectionsKt__CollectionsKt.mutableListOf(new Rect(0, 0, (int) (height >> 32), i)));
        }
        popupLayoutHelperImpl29.getClass();
        this.windowManager.updateViewLayout(this, layoutParams);
    }
}
