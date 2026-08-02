package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.TouchResponse;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.tracing.Trace;
import coil3.memory.MemoryCacheService;
import com.android.volley.Response;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.zzb;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.ClockFaceView;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import radiography.internal.ComposeLayoutInfoKt$$ExternalSyntheticLambda6;

/* loaded from: classes4.dex */
public final class BottomSheetDialog extends AppCompatDialog {
    public zzah backOrchestrator;
    public BottomSheetBehavior behavior;
    public FrameLayout bottomSheet;
    public final AnonymousClass5 bottomSheetCallback;
    public boolean cancelable;
    public boolean canceledOnTouchOutside;
    public boolean canceledOnTouchOutsideSet;
    public FrameLayout container;
    public CoordinatorLayout coordinator;
    public EdgeToEdgeCallback edgeToEdgeCallback;
    public boolean edgeToEdgeEnabled;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$5, reason: invalid class name */
    public final class AnonymousClass5 extends BottomSheetBehavior.BottomSheetCallback {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass5(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void onSlide$com$google$android$material$bottomsheet$BottomSheetDialog$5(View view, float f) {
        }

        private final void onSlide$com$withpersona$sdk2$inquiry$steps$ui$inputSelect$InputSelectBottomSheetController$setupIfNeeded$2(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(View view, float f) {
            int i = this.$r8$classId;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(View view, int i) {
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    if (i == 5) {
                        ((BottomSheetDialog) obj).cancel();
                        break;
                    }
                    break;
                default:
                    ComposeLayoutInfoKt$$ExternalSyntheticLambda6 composeLayoutInfoKt$$ExternalSyntheticLambda6 = (ComposeLayoutInfoKt$$ExternalSyntheticLambda6) ((Response) obj).error;
                    if (composeLayoutInfoKt$$ExternalSyntheticLambda6 != null) {
                        composeLayoutInfoKt$$ExternalSyntheticLambda6.invoke(Integer.valueOf(i));
                        break;
                    }
                    break;
            }
        }
    }

    public final class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {
        public final WindowInsetsCompat insetsCompat;
        public final Boolean lightBottomSheet;
        public boolean lightStatusBar;
        public Window window;

        public EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat) {
            this.insetsCompat = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(view).materialShapeDrawable;
            ColorStateList backgroundTintList = materialShapeDrawable != null ? materialShapeDrawable.drawableState.fillColor : view.getBackgroundTintList();
            if (backgroundTintList != null) {
                this.lightBottomSheet = Boolean.valueOf(MaterialColors.isColorLight(backgroundTintList.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListOrNull = SelfieUtilsKt.getColorStateListOrNull(view.getBackground());
            Integer valueOf = colorStateListOrNull != null ? Integer.valueOf(colorStateListOrNull.getDefaultColor()) : null;
            if (valueOf != null) {
                this.lightBottomSheet = Boolean.valueOf(MaterialColors.isColorLight(valueOf.intValue()));
            } else {
                this.lightBottomSheet = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onLayout(View view) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(View view, float f) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(View view, int i) {
            setPaddingForPosition(view);
        }

        public final void setPaddingForPosition(View view) {
            int top = view.getTop();
            WindowInsetsCompat windowInsetsCompat = this.insetsCompat;
            if (top < windowInsetsCompat.getSystemWindowInsetTop()) {
                Window window = this.window;
                if (window != null) {
                    Boolean bool = this.lightBottomSheet;
                    boolean booleanValue = bool == null ? this.lightStatusBar : bool.booleanValue();
                    MemoryCacheService memoryCacheService = new MemoryCacheService(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    (i >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService)).setAppearanceLightStatusBars(booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.window;
                if (window2 != null) {
                    boolean z = this.lightStatusBar;
                    MemoryCacheService memoryCacheService2 = new MemoryCacheService(window2.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    (i2 >= 35 ? new WindowInsetsControllerCompat.Impl35(window2, memoryCacheService2) : i2 >= 30 ? new WindowInsetsControllerCompat.Impl30(window2, memoryCacheService2) : new WindowInsetsControllerCompat.Impl26(window2, memoryCacheService2)).setAppearanceLightStatusBars(z);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void setWindow(Window window) {
            if (this.window == window) {
                return;
            }
            this.window = window;
            if (window != null) {
                this.lightStatusBar = new WindowInsetsControllerCompat(window, window.getDecorView()).mImpl.isAppearanceLightStatusBars();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomSheetDialog(Context context, int i) {
        super(context, i);
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new AnonymousClass5(this, 0);
        getDelegate().requestWindowFeature(1);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.edgeToEdgeEnabled = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        super.cancel();
    }

    public final void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout2);
            this.behavior = from;
            from.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
            this.backOrchestrator = new zzah(this.behavior, this.bottomSheet);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z;
        FrameLayout frameLayout;
        CoordinatorLayout coordinatorLayout;
        EdgeToEdgeCallback edgeToEdgeCallback;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.edgeToEdgeEnabled) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                    frameLayout = this.container;
                    if (frameLayout != null) {
                        frameLayout.setFitsSystemWindows(!z);
                    }
                    coordinatorLayout = this.coordinator;
                    if (coordinatorLayout != null) {
                        coordinatorLayout.setFitsSystemWindows(!z);
                    }
                    Trace.setDecorFitsSystemWindows(window, !z);
                    edgeToEdgeCallback = this.edgeToEdgeCallback;
                    if (edgeToEdgeCallback != null) {
                        edgeToEdgeCallback.setWindow(window);
                    }
                }
            }
            z = false;
            frameLayout = this.container;
            if (frameLayout != null) {
            }
            coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
            }
            Trace.setDecorFitsSystemWindows(window, !z);
            edgeToEdgeCallback = this.edgeToEdgeCallback;
            if (edgeToEdgeCallback != null) {
            }
        }
        zzah zzahVar = this.backOrchestrator;
        if (zzahVar == null) {
            return;
        }
        View view = (View) zzahVar.zzc;
        boolean z2 = this.cancelable;
        MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate = (MaterialBackOrchestrator$Api33BackCallbackDelegate) zzahVar.f68zza;
        if (z2) {
            if (materialBackOrchestrator$Api33BackCallbackDelegate != null) {
                materialBackOrchestrator$Api33BackCallbackDelegate.startListeningForBackCallbacks((MaterialBackHandler) zzahVar.zzb, view, false);
            }
        } else if (materialBackOrchestrator$Api33BackCallbackDelegate != null) {
            materialBackOrchestrator$Api33BackCallbackDelegate.stopListeningForBackCallbacks(view);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(PKIFailureInfo.systemUnavail);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate;
        EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.setWindow(null);
        }
        zzah zzahVar = this.backOrchestrator;
        if (zzahVar == null || (materialBackOrchestrator$Api33BackCallbackDelegate = (MaterialBackOrchestrator$Api33BackCallbackDelegate) zzahVar.f68zza) == null) {
            return;
        }
        materialBackOrchestrator$Api33BackCallbackDelegate.stopListeningForBackCallbacks((View) zzahVar.zzc);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.state != 5) {
            return;
        }
        bottomSheetBehavior.setState(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        zzah zzahVar;
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
            if (getWindow() == null || (zzahVar = this.backOrchestrator) == null) {
                return;
            }
            View view = (View) zzahVar.zzc;
            boolean z2 = this.cancelable;
            MaterialBackOrchestrator$Api33BackCallbackDelegate materialBackOrchestrator$Api33BackCallbackDelegate = (MaterialBackOrchestrator$Api33BackCallbackDelegate) zzahVar.f68zza;
            if (z2) {
                if (materialBackOrchestrator$Api33BackCallbackDelegate != null) {
                    materialBackOrchestrator$Api33BackCallbackDelegate.startListeningForBackCallbacks((MaterialBackHandler) zzahVar.zzb, view, false);
                }
            } else if (materialBackOrchestrator$Api33BackCallbackDelegate != null) {
                materialBackOrchestrator$Api33BackCallbackDelegate.stopListeningForBackCallbacks(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(view, 0, null));
    }

    public final FrameLayout wrapInBottomSheet(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            FrameLayout frameLayout = this.container;
            zzb zzbVar = new zzb(this, 27);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(frameLayout, zzbVar);
        }
        this.bottomSheet.removeAllViews();
        FrameLayout frameLayout2 = this.bottomSheet;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new Toolbar.AnonymousClass4(this, 8));
        int i2 = 1;
        ViewCompat.setAccessibilityDelegate(this.bottomSheet, new ClockFaceView.AnonymousClass2(this, i2));
        this.bottomSheet.setOnTouchListener(new TouchResponse.AnonymousClass1(i2));
        return this.container;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(null, i, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(view, 0, layoutParams));
    }
}
