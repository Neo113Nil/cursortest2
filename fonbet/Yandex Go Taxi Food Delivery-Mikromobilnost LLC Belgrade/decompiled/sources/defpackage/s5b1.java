package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.j;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.entities.exceptions.UnsupportedObjectInjectEbsException;
import ru.rt.ebs.cryptosdk.entities.models.DesignOptions;
import ru.rt.ebs.cryptosdk.entities.models.VideoResolutionRestrictions;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;
import ru.rt.ebs.cryptosdk.presentation.base.BaseFragment;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes11.dex */
public abstract class s5b1 {
    public static final void a(g611 g611Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        int i3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(374375834);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(g611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            kdc kdcVar = g611Var.j.a;
            String str = g611Var.h;
            if (str == null) {
                btsVar2.e0(-1002068591);
                str = ohb1.e(btsVar2, kyh0.mobility_hub_multimodality_scooter);
            } else {
                btsVar2.e0(-1002069242);
            }
            btsVar2.t(false);
            String str2 = str;
            boolean k = btsVar2.k(g611Var.j) | btsVar2.k(kdcVar);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                MtTransportType mtTransportType = MtTransportType.UNKNOWN;
                String str3 = g611Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                ib11 ib11Var = new ib11(mtTransportType, str2, kdcVar, new bdc(xng0.textMain), null, str3, null, false, false, null, null, null, 4048);
                btsVar2.o0(ib11Var);
                Q = ib11Var;
            }
            ib11 ib11Var2 = (ib11) Q;
            ety0 ety0Var = xya1.e(btsVar2).h.a;
            ety0 ety0Var2 = xya1.d(btsVar2).f.c;
            float f = 0.0f;
            float f2 = a5l0.f(ety0Var, 0.0f, btsVar2, 2);
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Float.valueOf(0.0f));
                btsVar2.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.j(null);
                btsVar2.o0(Q3);
            }
            oz40 oz40Var2 = (oz40) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = f.j(null);
                btsVar2.o0(Q4);
            }
            oz40 oz40Var3 = (oz40) Q4;
            float i4 = fwiVar.i(ety0Var.b.c);
            Float f3 = (Float) oz40Var2.getValue();
            if (f3 != null) {
                float floatValue = f3.floatValue();
                Float f4 = (Float) oz40Var3.getValue();
                if (f4 != null) {
                    f = ((y7m) y6i0.a(new y7m(((fwiVar.I(((f4.floatValue() + floatValue) / 2.0f) - ((Number) oz40Var.getValue()).floatValue()) - f2) - i4) - (i4 / 2.0f)), new y7m(0.0f))).a;
                }
            }
            boolean e = btsVar2.e(g611Var);
            Object Q5 = btsVar2.Q();
            if (e || Q5 == o430Var) {
                Q5 = new j24(21, g611Var);
                btsVar2.o0(Q5);
            }
            f530 a = fnq0.a(f530Var, (tls) Q5);
            Object Q6 = btsVar2.Q();
            if (Q6 == o430Var) {
                Q6 = new w5(15, oz40Var);
                btsVar2.o0(Q6);
            }
            f530 y = eja1.y(a, (tls) Q6);
            a S = wwg.S(-385912971, true, new fn1(g611Var, ety0Var, f, 1), btsVar2);
            a3d.a.getClass();
            btsVar = btsVar2;
            i3 = 1;
            a5l0.c(y, 0.0f, 0.0f, null, 0.0f, ety0Var2, null, S, a3d.b, wwg.S(2127849386, true, new t0(g611Var, ety0Var2, ib11Var2, oz40Var2, ety0Var, oz40Var3, 5), btsVar2), btsVar, 918552576, 94);
        } else {
            btsVar = btsVar2;
            i3 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(g611Var, f530Var, i, i3);
        }
    }

    public static final void b(t631 t631Var, dsv dsvVar, Orientation orientation, csv csvVar, hsv hsvVar, long j) {
        float intBitsToFloat;
        xy40 xy40Var = hsvVar.b;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dsvVar.c >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (dsvVar.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (d(dsvVar)) {
            hsvVar.a = 0;
            xy40Var.j();
        }
        if (!c(dsvVar) && !d(dsvVar)) {
            if (xy40Var.b == 3) {
                int i = hsvVar.a;
                hsvVar.a = i + 1;
                xy40Var.p(i, dsvVar);
            } else {
                xy40Var.g(dsvVar);
            }
            if (hsvVar.a == 3) {
                hsvVar.a = 0;
            }
            Object[] objArr = xy40Var.a;
            int i2 = xy40Var.b;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((dsv) objArr[i3]).c >> 32));
            }
            int i4 = xy40Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = xy40Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((dsv) objArr2[i5]).c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            intBitsToFloat3 = f2 / xy40Var.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (orientation != null) {
            int i6 = csvVar.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            floatToRawIntBits = orientation == Orientation.Horizontal ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        t631Var.a.a(dsvVar.b, wu60.f(floatToRawIntBits, j));
    }

    public static final boolean c(dsv dsvVar) {
        return dsvVar.h && !dsvVar.d;
    }

    public static final boolean d(dsv dsvVar) {
        return !dsvVar.h && dsvVar.d;
    }

    public static void e(Object obj, x3v x3vVar) {
        if (!(obj instanceof BaseActivity)) {
            if (!(obj instanceof BaseFragment)) {
                throw new UnsupportedObjectInjectEbsException(obj.getClass().getName());
            }
            EbsLogger.INSTANCE.info("Inject to BaseFragment");
            BaseFragment baseFragment = (BaseFragment) obj;
            wrr wrrVar = (wrr) ((amp0) x3vVar).c;
            baseFragment.setDesignOptions((DesignOptions) wrrVar.z);
            baseFragment.setViewModelFactory(wrrVar.i());
            VideoResolutionRestrictions videoResolutionRestrictions = (VideoResolutionRestrictions) wrrVar.A;
            if (videoResolutionRestrictions == null) {
                videoResolutionRestrictions = null;
            }
            baseFragment.setVideoResolutionRestrictions(videoResolutionRestrictions);
            return;
        }
        EbsLogger.INSTANCE.info("Inject to BaseActivity");
        BaseActivity baseActivity = (BaseActivity) obj;
        amp0 amp0Var = (amp0) x3vVar;
        wrr wrrVar2 = (wrr) amp0Var.c;
        baseActivity.setDesignOptions((DesignOptions) wrrVar2.z);
        u650 u650Var = (u650) amp0Var.b;
        mc50 mc50Var = u650Var.a;
        if (mc50Var == null) {
            mc50Var = new mc50();
            u650Var.a = mc50Var;
        }
        baseActivity.setNavigatorHolder(mc50Var);
        baseActivity.setViewModelFactory(wrrVar2.i());
    }

    public static final long f(dsv dsvVar, Orientation orientation, csv csvVar, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = dsvVar.g;
        if (orientation != null) {
            int i = csvVar.a;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            if (orientation == Orientation.Horizontal) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        long e = wu60.e(g(dsvVar, orientation, csvVar), j2);
        if (z || !dsvVar.i) {
            return e;
        }
        return 0L;
    }

    public static final long g(dsv dsvVar, Orientation orientation, csv csvVar) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (orientation == null) {
            return dsvVar.c;
        }
        int i = csvVar.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (dsvVar.c >> 32));
        } else {
            if (i != 2) {
                return dsvVar.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (dsvVar.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
        if (orientation == Orientation.Horizontal) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & floatToRawIntBits);
    }
}
