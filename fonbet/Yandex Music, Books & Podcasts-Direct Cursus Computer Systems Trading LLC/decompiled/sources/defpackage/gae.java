package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class gae {
    public static final yci a = d.m(vci.a, 24);

    public static final void a(bde bdeVar, yci yciVar, long j, hq5 hq5Var, int i, int i2) {
        long j2;
        if ((i2 & 4) != 0) {
            yciVar = vci.a;
        }
        yci yciVar2 = yciVar;
        if ((i2 & 8) != 0) {
            oq5 oq5Var = (oq5) hq5Var;
            j2 = d85.b(((d85) oq5Var.j(sb6.a)).a, ((Number) oq5Var.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
        } else {
            j2 = j;
        }
        b(wyf.Z(bdeVar, hq5Var), null, yciVar2, j2, hq5Var, 56 | (i & 7168), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if ((r29 & 8) != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014c, code lost:
    
        if (java.lang.Float.isInfinite(defpackage.nmq.b(r3)) != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w4k w4kVar, String str, yci yciVar, long j, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        long j2;
        yci yciVar3;
        long j3;
        xmn r;
        yci yciVar4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1142959010);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(w4kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && oq5Var.e(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
                oq5Var.S();
                yciVar3 = yciVar2;
                j3 = j2;
            } else {
                oq5Var.U();
                int i5 = i & 1;
                yci yciVar5 = vci.a;
                if (i5 == 0 || oq5Var.y()) {
                    if (i4 != 0) {
                        yciVar2 = yciVar5;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = d85.b(((d85) oq5Var.j(sb6.a)).a, ((Number) oq5Var.j(mb6.a)).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                        i3 &= -7169;
                    }
                    oq5Var.q();
                    boolean z = (((i3 & 7168) ^ 3072) > 2048 && oq5Var.e(j2)) || (i3 & 3072) == 2048;
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (z || K == kjnVar) {
                        K = d85.c(j2, d85.n) ? null : new d43(j2, 5);
                        oq5Var.k0(K);
                    }
                    m85 m85Var = (m85) K;
                    if (str != null) {
                        oq5Var.Z(980491077);
                        boolean z2 = (i3 & 112) == 32;
                        Object K2 = oq5Var.K();
                        if (z2 || K2 == kjnVar) {
                            K2 = new r23(str, 4);
                            oq5Var.k0(K2);
                        }
                        yciVar4 = nfp.b(yciVar5, false, (Function1) K2);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(980649859);
                        oq5Var.p(false);
                        yciVar4 = yciVar5;
                    }
                    if (!nmq.a(w4kVar.i(), 9205357640488583168L)) {
                        long i6 = w4kVar.i();
                        if (Float.isInfinite(nmq.d(i6))) {
                        }
                        ug3.a(a.d(yciVar2.f(yciVar5), w4kVar, null, hd6.b, 0.0f, m85Var, 22).f(yciVar4), oq5Var, 0);
                        yciVar3 = yciVar2;
                        j3 = j2;
                    }
                    yciVar5 = a;
                    ug3.a(a.d(yciVar2.f(yciVar5), w4kVar, null, hd6.b, 0.0f, m85Var, 22).f(yciVar4), oq5Var, 0);
                    yciVar3 = yciVar2;
                    j3 = j2;
                } else {
                    oq5Var.S();
                }
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new eae(w4kVar, str, yciVar3, j3, i, i2, 0);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 3072) != 0) {
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
