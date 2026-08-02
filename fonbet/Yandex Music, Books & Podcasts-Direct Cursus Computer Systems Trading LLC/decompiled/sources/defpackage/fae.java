package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class fae {
    public static final yci a = d.m(vci.a, bae.a);

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (java.lang.Float.isInfinite(defpackage.nmq.b(r9)) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w4k w4kVar, String str, yci yciVar, long j, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        int i4;
        yci yciVar3;
        boolean z;
        Object K;
        yci yciVar4;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2142239481);
        int i5 = (oq5Var.h(w4kVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= oq5Var.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 256 : 128;
            i3 = i5 | (!oq5Var.e(j) ? 2048 : 1024);
            if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                oq5Var.U();
                i4 = i & 1;
                yci yciVar5 = vci.a;
                if (i4 == 0 && !oq5Var.y()) {
                    oq5Var.S();
                } else if (i6 != 0) {
                    yciVar2 = yciVar5;
                }
                yciVar3 = yciVar2;
                oq5Var.q();
                z = (((i3 & 7168) ^ 3072) <= 2048 && oq5Var.e(j)) || (i3 & 3072) == 2048;
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!z || K == kjnVar) {
                    K = !d85.c(j, d85.n) ? null : new d43(j, 5);
                    oq5Var.k0(K);
                }
                m85 m85Var = (m85) K;
                oq5Var.Z(-2144891392);
                if (str == null) {
                    boolean z2 = (i3 & 112) == 32;
                    Object K2 = oq5Var.K();
                    if (z2 || K2 == kjnVar) {
                        K2 = new r23(str, 3);
                        oq5Var.k0(K2);
                    }
                    yciVar4 = nfp.b(yciVar5, false, (Function1) K2);
                } else {
                    yciVar4 = yciVar5;
                }
                oq5Var.p(false);
                if (!nmq.a(w4kVar.i(), 9205357640488583168L)) {
                    long i7 = w4kVar.i();
                    if (Float.isInfinite(nmq.d(i7))) {
                    }
                    ug3.a(a.d(yciVar3.f(yciVar5), w4kVar, null, hd6.b, 0.0f, m85Var, 22).f(yciVar4), oq5Var, 0);
                }
                yciVar5 = a;
                ug3.a(a.d(yciVar3.f(yciVar5), w4kVar, null, hd6.b, 0.0f, m85Var, 22).f(yciVar4), oq5Var, 0);
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new eae(w4kVar, str, yciVar3, j, i, i2, 1);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i3 = i5 | (!oq5Var.e(j) ? 2048 : 1024);
        if ((i3 & 1171) == 1170) {
        }
        oq5Var.U();
        i4 = i & 1;
        yci yciVar52 = vci.a;
        if (i4 == 0) {
        }
        if (i6 != 0) {
        }
        yciVar3 = yciVar2;
        oq5Var.q();
        if (((i3 & 7168) ^ 3072) <= 2048) {
        }
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!z) {
        }
        K = !d85.c(j, d85.n) ? null : new d43(j, 5);
        oq5Var.k0(K);
        m85 m85Var2 = (m85) K;
        oq5Var.Z(-2144891392);
        if (str == null) {
        }
        oq5Var.p(false);
        if (!nmq.a(w4kVar.i(), 9205357640488583168L)) {
        }
        yciVar52 = a;
        ug3.a(a.d(yciVar3.f(yciVar52), w4kVar, null, hd6.b, 0.0f, m85Var2, 22).f(yciVar4), oq5Var, 0);
        r = oq5Var.r();
        if (r == null) {
        }
    }
}
