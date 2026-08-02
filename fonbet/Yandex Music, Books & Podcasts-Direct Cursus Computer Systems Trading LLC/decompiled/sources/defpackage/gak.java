package defpackage;

import android.graphics.Path;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gak extends nwt {
    public ai3 b;
    public float f;
    public ai3 g;
    public float k;
    public float m;
    public boolean p;
    public amr q;
    public final nh0 r;
    public nh0 s;
    public final Object t;
    public float c = 1.0f;
    public List d = nzt.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    public gak() {
        nh0 a = ph0.a();
        this.r = a;
        this.s = a;
        this.t = btf.a(bwf.c, xuj.x);
    }

    @Override // defpackage.nwt
    public final void a(jpa jpaVar) {
        jpa jpaVar2;
        amr amrVar;
        if (this.n) {
            o5g.Q(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        ai3 ai3Var = this.b;
        if (ai3Var != null) {
            jpaVar2 = jpaVar;
            jpa.C(jpaVar2, this.s, ai3Var, this.c, null, 56);
        } else {
            jpaVar2 = jpaVar;
        }
        ai3 ai3Var2 = this.g;
        if (ai3Var2 != null) {
            amr amrVar2 = this.q;
            if (this.o || amrVar2 == null) {
                amr amrVar3 = new amr(this.f, this.j, this.h, this.i, 16);
                this.q = amrVar3;
                this.o = false;
                amrVar = amrVar3;
            } else {
                amrVar = amrVar2;
            }
            jpa.C(jpaVar2, this.s, ai3Var2, this.e, amrVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [arf, java.lang.Object] */
    public final void e() {
        float f = this.k;
        nh0 nh0Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = nh0Var;
            return;
        }
        if (Intrinsics.d(this.s, nh0Var)) {
            this.s = ph0.a();
        } else {
            int i = this.s.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.s.a.rewind();
            this.s.i(i);
        }
        ?? r0 = this.t;
        ((oh0) r0.getValue()).a.setPath(nh0Var != null ? nh0Var.a : null, false);
        float length = ((oh0) r0.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((oh0) r0.getValue()).a(f4, f5, this.s);
        } else {
            ((oh0) r0.getValue()).a(f4, length, this.s);
            ((oh0) r0.getValue()).a(0.0f, f5, this.s);
        }
    }

    public final String toString() {
        return this.r.toString();
    }
}
