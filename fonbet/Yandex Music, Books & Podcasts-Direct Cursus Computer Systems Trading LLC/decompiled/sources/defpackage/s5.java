package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s5 extends cw7 implements ofm, waf, ofp, w9t {
    public static final e3s G = new e3s(12);
    public k4e A;
    public final yoi B;
    public long C;
    public uoi D;
    public boolean E;
    public final e3s F;
    public uoi q;
    public cje r;
    public String s;
    public meo t;
    public boolean u;
    public Function0 v;
    public final fpc w;
    public iur x;
    public sv7 y;
    public rqm z;

    public s5(uoi uoiVar, cje cjeVar, boolean z, String str, meo meoVar, Function0 function0) {
        this.q = uoiVar;
        this.r = cjeVar;
        this.s = str;
        this.t = meoVar;
        this.u = z;
        this.v = function0;
        boolean z2 = false;
        this.w = new fpc(uoiVar, 0, new m5(1, this, s5.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        yoi yoiVar = yug.a;
        this.B = new yoi();
        this.C = 0L;
        uoi uoiVar2 = this.q;
        this.D = uoiVar2;
        if (uoiVar2 == null && this.r != null) {
            z2 = true;
        }
        this.E = z2;
        this.F = G;
    }

    @Override // defpackage.ofp
    public final boolean E0() {
        return true;
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.xci
    public final void K0() {
        if (!this.E) {
            Y0();
        }
        if (this.u) {
            S0(this.w);
        }
    }

    @Override // defpackage.xci
    public final void L0() {
        X0();
        if (this.D == null) {
            this.q = null;
        }
        sv7 sv7Var = this.y;
        if (sv7Var != null) {
            T0(sv7Var);
        }
        this.y = null;
    }

    @Override // defpackage.waf
    public final boolean Q(KeyEvent keyEvent) {
        return false;
    }

    public abstract Object W0(pfm pfmVar, Continuation continuation);

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        meo meoVar = this.t;
        if (meoVar != null) {
            wfp.q(jfpVar, meoVar.a);
        }
        String str = this.s;
        k5 k5Var = new k5(0, this);
        s9f[] s9fVarArr = wfp.a;
        jfpVar.o(hfp.b, new sa(str, k5Var));
        if (this.u) {
            this.w.X(jfpVar);
        } else {
            wfp.c(jfpVar);
        }
        V0(jfpVar);
    }

    public final void X0() {
        uoi uoiVar = this.q;
        yoi yoiVar = this.B;
        if (uoiVar != null) {
            rqm rqmVar = this.z;
            if (rqmVar != null) {
                uoiVar.b(new qqm(rqmVar));
            }
            k4e k4eVar = this.A;
            if (k4eVar != null) {
                uoiVar.b(new l4e(k4eVar));
            }
            Object[] objArr = yoiVar.c;
            long[] jArr = yoiVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                uoiVar.b(new qqm((rqm) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.z = null;
        this.A = null;
        yoiVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    @Override // defpackage.waf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(KeyEvent keyEvent) {
        boolean z;
        Y0();
        long R = saf.R(keyEvent);
        boolean z2 = this.u;
        Continuation continuation = null;
        yoi yoiVar = this.B;
        if (!z2 || saf.U(keyEvent) != 2 || !a.m(keyEvent)) {
            if (this.u && saf.U(keyEvent) == 1 && a.m(keyEvent)) {
                rqm rqmVar = (rqm) yoiVar.g(R);
                if (rqmVar != null) {
                    if (this.q != null) {
                        x97.y(G0(), null, null, new p5(this, rqmVar, continuation, 2), 3);
                    }
                    b1(keyEvent);
                }
                if (rqmVar != null) {
                    return true;
                }
            }
            return false;
        }
        if (yoiVar.b(R)) {
            z = false;
        } else {
            rqm rqmVar2 = new rqm(this.C);
            yoiVar.h(R, rqmVar2);
            if (this.q != null) {
                x97.y(G0(), null, null, new p5(this, rqmVar2, continuation, 1), 3);
            }
            z = true;
        }
        if (!a1(keyEvent) && !z) {
            return false;
        }
    }

    public final void Y0() {
        cje cjeVar;
        if (this.y == null && (cjeVar = this.r) != null) {
            if (this.q == null) {
                this.q = new uoi();
            }
            this.w.X0(this.q);
            uoi uoiVar = this.q;
            uoiVar.getClass();
            sv7 b = cjeVar.b(uoiVar);
            S0(b);
            this.y = b;
        }
    }

    @Override // defpackage.ofm
    public final void Z() {
        k4e k4eVar;
        uoi uoiVar = this.q;
        if (uoiVar != null && (k4eVar = this.A) != null) {
            uoiVar.b(new l4e(k4eVar));
        }
        this.A = null;
        iur iurVar = this.x;
        if (iurVar != null) {
            iurVar.Z();
        }
    }

    public abstract boolean a1(KeyEvent keyEvent);

    public abstract void b1(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r3.y == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c1(uoi uoiVar, cje cjeVar, boolean z, String str, meo meoVar, Function0 function0) {
        boolean z2;
        sv7 sv7Var;
        boolean z3 = true;
        boolean z4 = false;
        if (Intrinsics.d(this.D, uoiVar)) {
            z2 = false;
        } else {
            X0();
            this.D = uoiVar;
            this.q = uoiVar;
            z2 = true;
        }
        if (!Intrinsics.d(this.r, cjeVar)) {
            this.r = cjeVar;
            z2 = true;
        }
        boolean z5 = this.u;
        fpc fpcVar = this.w;
        if (z5 != z) {
            if (z) {
                S0(fpcVar);
            } else {
                T0(fpcVar);
                X0();
            }
            neg.w(this);
            this.u = z;
        }
        if (!Intrinsics.d(this.s, str)) {
            this.s = str;
            neg.w(this);
        }
        if (!Intrinsics.d(this.t, meoVar)) {
            this.t = meoVar;
            neg.w(this);
        }
        this.v = function0;
        boolean z6 = this.E;
        uoi uoiVar2 = this.D;
        if (z6 != (uoiVar2 == null && this.r != null)) {
            if (uoiVar2 == null && this.r != null) {
                z4 = true;
            }
            this.E = z4;
            if (!z4) {
            }
        }
        z3 = z2;
        if (z3 && ((sv7Var = this.y) != null || !this.E)) {
            if (sv7Var != null) {
                T0(sv7Var);
            }
            this.y = null;
            Y0();
        }
        fpcVar.X0(this.q);
    }

    @Override // defpackage.w9t
    public final Object h() {
        return this.F;
    }

    @Override // defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.C = (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L);
        Y0();
        int i = 0;
        Continuation continuation = null;
        if (this.u && gfmVar == gfm.b) {
            int i2 = ffmVar.d;
            if (i2 == 4) {
                x97.y(G0(), null, null, new q5(this, continuation, i), 3);
            } else if (i2 == 5) {
                x97.y(G0(), null, null, new q5(this, continuation, 1), 3);
            }
        }
        if (this.x == null) {
            r5 r5Var = new r5(i, this);
            ffm ffmVar2 = eur.a;
            iur iurVar = new iur(null, null, null, r5Var);
            S0(iurVar);
            this.x = iurVar;
        }
        iur iurVar2 = this.x;
        if (iurVar2 != null) {
            iurVar2.o(ffmVar, gfmVar, j);
        }
    }

    public void Z0() {
    }

    public void V0(jfp jfpVar) {
    }
}
