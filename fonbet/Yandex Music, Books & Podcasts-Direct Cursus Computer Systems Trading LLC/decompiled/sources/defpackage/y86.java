package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public abstract class y86 implements fft, rof {
    public final Context a;
    public final v86 b;
    public final jyr c;

    public y86(ContextWrapper contextWrapper) {
        contextWrapper.getClass();
        v86 v86Var = new v86(contextWrapper);
        this.a = contextWrapper;
        this.b = v86Var;
        this.c = btf.b(new r25(29, this));
    }

    public abstract void a(q96 q96Var);

    public final ViewGroup.LayoutParams b(int i, int i2) {
        return (t86) this.b.q.a(-2, -2);
    }

    @Override // defpackage.fft
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout e() {
        return (ConstraintLayout) this.c.getValue();
    }

    public abstract void d(ConstraintLayout constraintLayout);

    @Override // defpackage.hdu
    public final Context getCtx() {
        return this.a;
    }

    @Override // defpackage.rof
    public final void j(View view) {
        view.getClass();
        this.b.j(view);
    }
}
