package defpackage;

import com.yx360.design.BrandTheme;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class qnm {
    public static final qnm a = new qnm();
    public static final lsm b = lsm.a;
    public static final dab1 c = dab1.D;
    public static final xpb1 d = xpb1.E;
    public static final wfz e = wfz.C;
    public static final l76 f = l76.B;
    public static final h2b1 g = h2b1.D;
    public static final qtb1 h = qtb1.C;

    static {
        jsm jsmVar = jsm.a;
    }

    public static qom b(fid fidVar) {
        return (qom) ((bts) fidVar).m(ltm.a);
    }

    public static spm c(fid fidVar) {
        return (spm) ((bts) fidVar).m(mtm.a);
    }

    public static ytm d(fid fidVar) {
        return (ytm) ((bts) fidVar).m(ltm.b);
    }

    public final void a(boolean z, BrandTheme brandTheme, wls wlsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        BrandTheme brandTheme2;
        wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(11508539);
        if ((i & 6) == 0) {
            i3 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.c(brandTheme == null ? -1 : brandTheme.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.a(false) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(wlsVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            wlsVar2 = wlsVar;
            brandTheme2 = brandTheme;
            z2 = z;
        } else {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            mtm.a(z, brandTheme, wlsVar, false, btsVar, (i3 & HProv.PP_DELETE_SAVED_PASSWD) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
            z2 = z;
            brandTheme2 = brandTheme;
            wlsVar2 = wlsVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fo1(this, z2, brandTheme2, wlsVar2, i, i2);
        }
    }
}
