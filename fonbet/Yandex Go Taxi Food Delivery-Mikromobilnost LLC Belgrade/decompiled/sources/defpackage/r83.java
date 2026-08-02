package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class r83 extends e530 implements v0y {
    public float a;

    public final long E0(long j, boolean z) {
        int round;
        int h = n8e.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h * this.a)) <= 0) {
            return 0L;
        }
        if (!z || on70.d(round, h, j)) {
            return (round << 32) | (h & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        return 0L;
    }

    public final long F0(long j, boolean z) {
        int round;
        int i = n8e.i(j);
        if (i == Integer.MAX_VALUE || (round = Math.round(i / this.a)) <= 0) {
            return 0L;
        }
        if (!z || on70.d(i, round, j)) {
            return (i << 32) | (round & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        return 0L;
    }

    public final long G0(long j, boolean z) {
        int j2 = n8e.j(j);
        int round = Math.round(j2 * this.a);
        if (round <= 0) {
            return 0L;
        }
        if (!z || on70.d(round, j2, j)) {
            return (round << 32) | (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        return 0L;
    }

    public final long H0(long j, boolean z) {
        int k = n8e.k(j);
        int round = Math.round(k / this.a);
        if (round <= 0) {
            return 0L;
        }
        if (!z || on70.d(k, round, j)) {
            return (k << 32) | (round & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        return 0L;
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.a) : x910Var.k0(i);
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.a) : x910Var.e0(i);
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        long F0 = F0(j, true);
        if (k6w.a(F0, 0L)) {
            F0 = E0(j, true);
            if (k6w.a(F0, 0L)) {
                F0 = H0(j, true);
                if (k6w.a(F0, 0L)) {
                    F0 = G0(j, true);
                    if (k6w.a(F0, 0L)) {
                        F0 = F0(j, false);
                        if (k6w.a(F0, 0L)) {
                            F0 = E0(j, false);
                            if (k6w.a(F0, 0L)) {
                                F0 = H0(j, false);
                                if (k6w.a(F0, 0L)) {
                                    F0 = G0(j, false);
                                    if (k6w.a(F0, 0L)) {
                                        F0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!k6w.a(F0, 0L)) {
            int i = (int) (F0 >> 32);
            int i2 = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & F0);
            if (!((i >= 0) & (i2 >= 0))) {
                kxv.a("width and height must be >= 0");
            }
            j = p8e.h(i, i, i2, i2);
        }
        o l0 = x910Var.l0(j);
        return kVar.w(l0.a, l0.b, b.f(), new q83(l0, 0));
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.a) : x910Var.V(i);
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.a) : x910Var.y(i);
    }
}
