package ru.yandex.taxi.ui;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.core.view.e;
import defpackage.bx60;
import defpackage.n751;
import defpackage.np31;
import defpackage.q651;
import defpackage.tls;
import defpackage.u651;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\u0018J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0013R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/yandex/taxi/ui/InsetsAnimationCallback;", "Landroidx/core/view/e;", "Ljava/lang/Runnable;", "Lbx60;", "Landroid/view/View$OnAttachStateChangeListener;", "", "dispatchMode", "Lkotlin/Function1;", "Ln751;", "Lzy11;", "onInsetsUpdated", "<init>", "(ILtls;)V", "insets", "fireInsetsUpdate", "(Ln751;)V", "Landroid/view/View;", "view", "setupListeners", "(Landroid/view/View;)V", "clearListeners", "Lu651;", "animation", "onPrepare", "(Lu651;)V", "Lq651;", "bounds", "onStart", "(Lu651;Lq651;)Lq651;", "", "runningAnimations", "onProgress", "(Ln751;Ljava/util/List;)Ln751;", "onEnd", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "run", "()V", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "Ltls;", "", "prepared", "Z", "runningAnimation", "savedInsets", "Ln751;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsetsAnimationCallback extends e implements Runnable, bx60, View.OnAttachStateChangeListener {
    private final tls onInsetsUpdated;
    private boolean prepared;
    private boolean runningAnimation;
    private n751 savedInsets;

    public InsetsAnimationCallback(int i, tls tlsVar) {
        super(i);
        this.onInsetsUpdated = tlsVar;
    }

    private final void fireInsetsUpdate(n751 insets) {
        this.onInsetsUpdated.invoke(insets);
    }

    public final void clearListeners(View view) {
        b.u(view, null);
        ViewCompat$Api21Impl.o(view, null);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 insets) {
        this.savedInsets = insets;
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return insets;
            }
        } else if (!this.runningAnimation) {
            fireInsetsUpdate(insets);
        }
        return insets;
    }

    @Override // androidx.core.view.e
    public void onEnd(u651 animation) {
        this.prepared = false;
        this.runningAnimation = false;
        n751 n751Var = this.savedInsets;
        if (animation.a.b() != 0 && n751Var != null) {
            fireInsetsUpdate(n751Var);
        }
        this.savedInsets = null;
    }

    @Override // androidx.core.view.e
    public void onPrepare(u651 animation) {
        this.prepared = true;
        this.runningAnimation = true;
    }

    @Override // androidx.core.view.e
    public n751 onProgress(n751 insets, List<u651> runningAnimations) {
        fireInsetsUpdate(insets);
        return insets;
    }

    @Override // androidx.core.view.e
    public q651 onStart(u651 animation, q651 bounds) {
        this.prepared = false;
        return bounds;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        WeakHashMap weakHashMap = b.a;
        np31.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            n751 n751Var = this.savedInsets;
            if (n751Var != null) {
                fireInsetsUpdate(n751Var);
                this.savedInsets = null;
            }
        }
    }

    public final void setupListeners(View view) {
        b.u(view, this);
        ViewCompat$Api21Impl.o(view, this);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }
}
