package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ji0 extends xci implements zdo, yr5, ipa, qof {
    public final uoi o;
    public final boolean p;
    public final float q;
    public final a95 r;
    public final uif s;
    public yk3 t;
    public float u;
    public boolean w;
    public ydo y;
    public beo z;
    public long v = 0;
    public final gpi x = new gpi();

    /* JADX WARN: Multi-variable type inference failed */
    public ji0(uoi uoiVar, boolean z, float f, a95 a95Var, Function0 function0) {
        this.o = uoiVar;
        this.p = z;
        this.q = f;
        this.r = a95Var;
        this.s = (uif) function0;
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.xci
    public final void K0() {
        x97.y(G0(), null, null, new s1n(this, (Continuation) null, 21), 3);
    }

    @Override // defpackage.xci
    public final void L0() {
        ydo ydoVar = this.y;
        if (ydoVar != null) {
            a0();
            aeo aeoVar = ydoVar.d;
            beo beoVar = (beo) aeoVar.a.get(this);
            if (beoVar != null) {
                beoVar.c();
                LinkedHashMap linkedHashMap = aeoVar.a;
                beo beoVar2 = (beo) linkedHashMap.get(this);
                if (beoVar2 != null) {
                }
                linkedHashMap.remove(this);
                ydoVar.c.add(beoVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.jvm.functions.Function0, uif] */
    public final void S0(tqm tqmVar) {
        beo beoVar;
        if (!(tqmVar instanceof rqm)) {
            if (tqmVar instanceof sqm) {
                beo beoVar2 = this.z;
                if (beoVar2 != null) {
                    beoVar2.d();
                    return;
                }
                return;
            }
            if (!(tqmVar instanceof qqm) || (beoVar = this.z) == null) {
                return;
            }
            beoVar.d();
            return;
        }
        rqm rqmVar = (rqm) tqmVar;
        long j = this.v;
        float f = this.u;
        ydo ydoVar = this.y;
        if (ydoVar == null) {
            ydoVar = wxf.h(wxf.i((View) men.t(this, AndroidCompositionLocals_androidKt.f)));
            this.y = ydoVar;
        }
        beo a = ydoVar.a(this);
        a.b(rqmVar, this.p, j, eeh.b(f), this.r.a(), ((udo) this.s.invoke()).d, new k5(5, this));
        this.z = a;
        vq1.Z(this);
    }

    @Override // defpackage.zdo
    public final void a0() {
        this.z = null;
        vq1.Z(this);
    }

    @Override // defpackage.qof
    public final void j(long j) {
        this.w = true;
        jx7 jx7Var = bcx.F(this).y;
        this.v = nt0.Q(j);
        float f = this.q;
        this.u = Float.isNaN(f) ? vdo.a(jx7Var, this.p, this.v) : jx7Var.n0(f);
        gpi gpiVar = this.x;
        Object[] objArr = gpiVar.a;
        int i = gpiVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            S0((tqm) objArr[i2]);
        }
        gpiVar.c();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        opfVar.a();
        yk3 yk3Var = this.t;
        if (yk3Var != null) {
            yk3Var.o(opfVar, this.u, this.r.a());
        }
        mu3 s = opfVar.a.b.s();
        beo beoVar = this.z;
        if (beoVar != null) {
            long j = this.v;
            beoVar.e(((udo) this.s.invoke()).d, eeh.b(this.u), j, this.r.a());
            beoVar.draw(vd0.a(s));
        }
    }
}
