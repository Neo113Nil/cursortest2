package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

/* loaded from: classes11.dex */
public abstract class rpb1 {
    public static final void a(boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1536903994);
        int i2 = (btsVar.k(null) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            throw null;
        }
        btsVar.Y();
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vxd(z, i, i3);
        }
    }

    public static final void b(x940 x940Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1478205039);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x940Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 18;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(233081459, true, new ut9(21, tlsVar, x940Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(x940Var, tlsVar, i, i3);
        }
    }

    public static final void c(CharSequence charSequence, ModalButtonResultType modalButtonResultType, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1441235175);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.c(modalButtonResultType == null ? -1 : modalButtonResultType.ordinal()) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 m = an91.m(ljs0.c(c530.a, 1.0f), 8.0f, 0.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ve30(14, modalButtonResultType, tlsVar);
                btsVar.o0(Q);
            }
            ohb1.b(m, false, null, (sls) Q, wwg.S(1234876378, true, new or9(6, charSequence), btsVar), btsVar, 24582, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) charSequence, (Object) modalButtonResultType, tlsVar, i, 3);
        }
    }

    public static final void d(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(660965932);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(-1588896648);
            btsVar.t(false);
        } else {
            btsVar.e0(-1588896647);
            qgy.b(charSequence, null, an91.m(c530.a, 16.0f, 0.0f, 2), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).g.a, null, btsVar, 3456, 0, 12274);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 13, charSequence);
        }
    }

    public static final void e(f530 f530Var, ovi0 ovi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2113963324);
        int i2 = (btsVar.k(ovi0Var) ? 32 : 16) | i;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (ovi0Var == null) {
            btsVar.e0(24157278);
            btsVar.t(false);
        } else {
            btsVar.e0(24157279);
            v0b1.a(ovi0Var, ljs0.m(f530Var, 40.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 0, 1020);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kk30(f530Var, ovi0Var, i, 1);
        }
    }

    public static final void f(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(189585672);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (charSequence == null) {
            btsVar.e0(64817694);
            btsVar.t(false);
        } else {
            btsVar.e0(64817695);
            qgy.b(charSequence, null, an91.m(c530.a, 16.0f, 0.0f, 2), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).e.d, null, btsVar, 3456, 0, 12274);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 12, charSequence);
        }
    }

    public static final long g(r5z0 r5z0Var) {
        return r5z0Var.b.toMillis(r5z0Var.a);
    }
}
