package defpackage;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class gb5 extends s5 implements yr5 {
    public String H;
    public Function0 I;
    public Function0 J;
    public boolean K;
    public final yoi L;
    public final yoi X;

    public gb5(cje cjeVar, uoi uoiVar, meo meoVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z) {
        super(uoiVar, cjeVar, z, str2, meoVar, function0);
        this.H = str;
        this.I = function02;
        this.J = function03;
        this.K = true;
        yoi yoiVar = yug.a;
        this.L = new yoi();
        this.X = new yoi();
    }

    @Override // defpackage.xci
    public final void M0() {
        d1();
    }

    @Override // defpackage.s5
    public final void V0(jfp jfpVar) {
        if (this.I != null) {
            String str = this.H;
            k5 k5Var = new k5(23, this);
            s9f[] s9fVarArr = wfp.a;
            jfpVar.o(hfp.c, new sa(str, k5Var));
        }
    }

    @Override // defpackage.s5
    public final Object W0(pfm pfmVar, Continuation continuation) {
        boolean z = this.u;
        Continuation continuation2 = null;
        eb5 eb5Var = (!z || this.J == null) ? null : new eb5(this, 0);
        int i = 1;
        eb5 eb5Var2 = (!z || this.I == null) ? null : new eb5(this, i);
        mn4 mn4Var = new mn4(this, continuation2, i);
        eb5 eb5Var3 = new eb5(this, 2);
        kr3 kr3Var = g6s.a;
        Object Q = gld.Q(new xg(pfmVar, mn4Var, eb5Var2, eb5Var, eb5Var3, (Continuation) null, 20), continuation);
        nm6 nm6Var = nm6.a;
        if (Q != nm6Var) {
            Q = Unit.a;
        }
        return Q == nm6Var ? Q : Unit.a;
    }

    @Override // defpackage.s5
    public final void Z0() {
        d1();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // defpackage.s5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a1(KeyEvent keyEvent) {
        boolean z;
        db5 db5Var;
        long R = saf.R(keyEvent);
        Continuation continuation = null;
        if (this.I != null) {
            yoi yoiVar = this.L;
            if (yoiVar.e(R) == null) {
                yoiVar.h(R, x97.y(G0(), null, null, new ja4(this, continuation, 8), 3));
                z = true;
                yoi yoiVar2 = this.X;
                db5Var = (db5) yoiVar2.e(R);
                if (db5Var != null) {
                    rar rarVar = db5Var.a;
                    if (rarVar.b()) {
                        rarVar.g(null);
                        if (!db5Var.b) {
                            this.v.invoke();
                            yoiVar2.g(R);
                            return z;
                        }
                    } else {
                        yoiVar2.g(R);
                    }
                }
                return z;
            }
        }
        z = false;
        yoi yoiVar22 = this.X;
        db5Var = (db5) yoiVar22.e(R);
        if (db5Var != null) {
        }
        return z;
    }

    @Override // defpackage.s5
    public final void b1(KeyEvent keyEvent) {
        Function0 function0;
        long R = saf.R(keyEvent);
        yoi yoiVar = this.L;
        boolean z = false;
        if (yoiVar.e(R) != null) {
            r2f r2fVar = (r2f) yoiVar.e(R);
            if (r2fVar != null) {
                if (r2fVar.b()) {
                    r2fVar.g(null);
                } else {
                    z = true;
                }
            }
            yoiVar.g(R);
        }
        if (this.J == null) {
            if (z) {
                return;
            }
            this.v.invoke();
            return;
        }
        yoi yoiVar2 = this.X;
        if (yoiVar2.e(R) == null) {
            if (z) {
                return;
            }
            yoiVar2.h(R, new db5(x97.y(G0(), null, null, new fb5(this, R, null), 3)));
        } else {
            if (!z && (function0 = this.J) != null) {
                function0.invoke();
            }
            yoiVar2.g(R);
        }
    }

    public final void d1() {
        char c;
        long j;
        long j2;
        char c2;
        yoi yoiVar = this.L;
        Object[] objArr = yoiVar.c;
        long[] jArr = yoiVar.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((r2f) objArr[(i << 3) + i3]).g(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        yoiVar.a();
        yoi yoiVar2 = this.X;
        Object[] objArr2 = yoiVar2.c;
        long[] jArr2 = yoiVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((db5) objArr2[(i4 << 3) + i6]).a.g(null);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        yoiVar2.a();
    }
}
