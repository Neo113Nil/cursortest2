package ru.yandex.taxi.widget.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.epo0;
import defpackage.hpo0;
import defpackage.jxi;
import defpackage.mx60;
import defpackage.ndh0;
import defpackage.sph0;
import defpackage.vpa;
import defpackage.xw31;
import defpackage.yes0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@jxi
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/yandex/taxi/widget/progress/SimpleSpinnerModalView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/lang/Runnable;", "onDismissAnimationEndAction", "Lzy11;", "dismiss", "(Ljava/lang/Runnable;)V", "onAttachedToWindow", "()V", "startSpinner", "Lmx60;", "callback", "setOnBackPressedCallback", "(Lmx60;)V", "requestAccessibilityFocus", "Landroid/view/View;", "spinner", "Landroid/view/View;", "", "notAnimateAfterAttach", "Z", "isHidden", "dismissed", "onBackPressedCallback", "Lmx60;", "Companion", "yes0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SimpleSpinnerModalView extends FrameLayout {
    public static final yes0 Companion = new yes0();
    private boolean dismissed;
    private boolean isHidden;
    private boolean notAnimateAfterAttach;
    private mx60 onBackPressedCallback;
    private final View spinner;

    public SimpleSpinnerModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(sph0.simple_spinner, this);
        this.spinner = findViewById(ndh0.spinner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss(Runnable onDismissAnimationEndAction) {
        int i = 1;
        this.dismissed = true;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(ndh0.simple_spinner, null);
        cma1.b(0.0f, this).withEndAction(new hpo0(i, viewGroup, this, onDismissAnimationEndAction));
        mx60 mx60Var = this.onBackPressedCallback;
        if (mx60Var != null) {
            mx60Var.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismiss$lambda$1(ViewGroup viewGroup, SimpleSpinnerModalView simpleSpinnerModalView, Runnable runnable) {
        viewGroup.removeView(simpleSpinnerModalView);
        runnable.run();
    }

    public static final SimpleSpinnerModalView getCurrentlyShownView(ViewGroup viewGroup) {
        Companion.getClass();
        return yes0.a(viewGroup);
    }

    public static final void hide(ViewGroup viewGroup, Runnable runnable) {
        Companion.getClass();
        SimpleSpinnerModalView a = yes0.a(viewGroup);
        if (a != null) {
            a.dismiss(runnable);
        }
    }

    public static final SimpleSpinnerModalView show(ViewGroup viewGroup) {
        Companion.getClass();
        return yes0.c(viewGroup, false, false);
    }

    public static final void showDisablingBackPress(ViewGroup viewGroup) {
        Companion.getClass();
        yes0.d(viewGroup, null);
    }

    public static final SimpleSpinnerModalView showWithDismissOnBackPress(ViewGroup viewGroup, Runnable runnable) {
        Companion.getClass();
        return yes0.d(viewGroup, new epo0(24, viewGroup, runnable));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.dismissed) {
            return;
        }
        setAlpha(0.0f);
        if (this.isHidden) {
            return;
        }
        cma1.b(1.0f, this).withEndAction(null);
        if (this.notAnimateAfterAttach) {
            this.spinner.setVisibility(8);
        } else {
            startSpinner();
        }
    }

    public final void requestAccessibilityFocus() {
        xw31.w(this.spinner);
    }

    public final void setOnBackPressedCallback(mx60 callback) {
        this.onBackPressedCallback = callback;
    }

    public final void startSpinner() {
        if (this.isHidden) {
            cma1.b(1.0f, this).withEndAction(null);
        }
        this.spinner.setVisibility(0);
    }

    public static final SimpleSpinnerModalView show(ViewGroup viewGroup, boolean z) {
        Companion.getClass();
        return yes0.c(viewGroup, z, false);
    }

    public static final SimpleSpinnerModalView show(ViewGroup viewGroup, boolean z, boolean z2) {
        Companion.getClass();
        return yes0.c(viewGroup, z, z2);
    }

    public static final void hide(ViewGroup viewGroup) {
        Companion.getClass();
        yes0.b(viewGroup);
    }

    public static final void showWithDismissOnBackPress(ViewGroup viewGroup, Runnable runnable, Runnable runnable2) {
        Companion.getClass();
        yes0.d(viewGroup, new hpo0(2, viewGroup, runnable2, runnable));
    }

    public SimpleSpinnerModalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SimpleSpinnerModalView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SimpleSpinnerModalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void dismiss() {
        dismiss(new vpa(28));
    }
}
