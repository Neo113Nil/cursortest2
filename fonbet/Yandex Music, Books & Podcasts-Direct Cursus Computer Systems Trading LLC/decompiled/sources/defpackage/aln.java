package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aln implements bnq {
    public final View a;

    public aln(View view) {
        this.a = view;
    }

    public static x97 a(int i, int i2, int i3) {
        if (i == -2) {
            return r38.n;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new q38(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new q38(i5);
        }
        return null;
    }

    public lmq b() {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        x97 a = a(layoutParams != null ? layoutParams.width : -1, view.getWidth(), view.getPaddingRight() + view.getPaddingLeft());
        if (a == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        x97 a2 = a(layoutParams2 != null ? layoutParams2.height : -1, view.getHeight(), view.getPaddingBottom() + view.getPaddingTop());
        if (a2 == null) {
            return null;
        }
        return new lmq(a, a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aln) {
            return Intrinsics.d(this.a, ((aln) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.bnq
    public Object s(rkn rknVar) {
        lmq b = b();
        if (b != null) {
            return b;
        }
        zt3 zt3Var = new zt3(1, qxe.b(rknVar));
        zt3Var.s();
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        dhu dhuVar = new dhu(this, viewTreeObserver, zt3Var);
        viewTreeObserver.addOnPreDrawListener(dhuVar);
        zt3Var.u(new lma(29, this, viewTreeObserver, dhuVar));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }
}
