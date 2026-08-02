package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class t68 {
    public static final t68 a = new t68();
    public static final Pattern b = Pattern.compile("(\\p{L})(\\d{3})(\\p{L}{2})(\\d{2,3})");
    public static final Pattern c = Pattern.compile("(\\p{L}{2})(\\d{3})(\\d{2,3})");

    public final void a(hk2 hk2Var, String str, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2034713123);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(hk2Var) : btsVar.e(hk2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int h = hk2Var.h(bmt0.a(((zm51) btsVar.m(an51.a)).e.a, 0L, lzr.E, 65531));
            try {
                hk2Var.d(str);
            } finally {
                hk2Var.g(h);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(this, hk2Var, str, i, 24);
        }
    }

    public final void b(hk2 hk2Var, String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(96827196);
        int i2 = (btsVar.e(hk2Var) ? 4 : 2) | i | (btsVar.k(str) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int h = hk2Var.h(bmt0.a(((zm51) btsVar.m(an51.a)).f.a, 0L, lzr.G, 65531));
            try {
                hk2Var.d(str);
            } finally {
                hk2Var.g(h);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(this, hk2Var, str, i, 21);
        }
    }
}
