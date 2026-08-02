package defpackage;

import android.graphics.drawable.NinePatchDrawable;
import android.util.Log;
import com.yandex.xplat.common.c;
import java.util.LinkedHashMap;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes11.dex */
public class wbz0 implements jh51, iy60, gdy, lq31, dxb0, uxe, izn, g8p, d5s {
    public static final wbz0 a = new wbz0();
    public static final wbz0 b = new wbz0();
    public static final wbz0 c = new wbz0();
    public static final wbz0 w = new wbz0();
    public static final /* synthetic */ wbz0 x = new wbz0();
    public static final wbz0 y = new wbz0();

    public wbz0() {
        bvf0.c(yxc.a);
    }

    public static final int d(int i, String str, String str2) {
        b6w m = y6i0.m(y6i0.n(i, str.length()), 1);
        int i2 = m.a;
        int i3 = m.b;
        int i4 = m.c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (!c.f(i2, Integer.valueOf(str2.length()), str).equals(str2)) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return i2;
        }
        return str.length();
    }

    public static s8b k(String[] strArr) {
        efr efrVar = s8b.e;
        LinkedHashMap linkedHashMap = t8b.a;
        efrVar.getClass();
        int i = 0;
        if (strArr != null) {
            int i2 = 0;
            while (i2 < strArr.length) {
                int i3 = i2 + 1;
                try {
                    by4 by4Var = (by4) linkedHashMap.get(strArr[i2]);
                    if (by4Var != null) {
                        i |= 1 << by4Var.getOrdinalValue();
                    }
                    i2 = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    w511.i(e.getMessage());
                    return null;
                }
            }
        }
        return new s8b(i);
    }

    public static nqx l(NinePatchDrawable ninePatchDrawable, float f, float f2, float f3, float f4, int i, Integer num) {
        return new nqx(ninePatchDrawable, i, f, f2, f3, f4, 1.0f, 1.75f, 2.0f, 1.0f, 3, 2, num.intValue(), Integer.MAX_VALUE);
    }

    public static boolean p(int i, String str, String str2) {
        return c.f(i, Integer.valueOf(str2.length()), str).equals(str2);
    }

    @Override // defpackage.gdy
    public void a(hey heyVar) {
        heyVar.onStart();
    }

    @Override // defpackage.dxb0
    public z910 b(float f) {
        return new r69(f);
    }

    @Override // defpackage.gdy
    public void c(hey heyVar) {
    }

    public boolean e(w3c w3cVar, wbz0 wbz0Var) {
        return true;
    }

    @Override // defpackage.g8p
    public i8p f(float f, float f2, float f3) {
        return new i8p(sy01.e(f2, f3, f, 255, 0), 255, false);
    }

    public boolean g(tbz0 tbz0Var) {
        return true;
    }

    @Override // defpackage.uxe
    public TariffOrderFlow get() {
        return TariffOrderFlow.DELIVERY_FLOW;
    }

    public boolean h(ubz0 ubz0Var) {
        return true;
    }

    public String i() {
        throw new IllegalStateException();
    }

    public void j(yyn yynVar) {
        yynVar.a(mkb1.class, wqa1.a);
        yynVar.a(fub1.class, x9b1.a);
        yynVar.a(nkb1.class, bra1.a);
        yynVar.a(ykb1.class, mra1.a);
        yynVar.a(rkb1.class, hra1.a);
        yynVar.a(xkb1.class, sra1.a);
        yynVar.a(oeb1.class, sja1.a);
        yynVar.a(keb1.class, rja1.a);
        yynVar.a(hib1.class, roa1.a);
        yynVar.a(mtb1.class, j7b1.a);
        yynVar.a(jeb1.class, fja1.a);
        yynVar.a(beb1.class, yia1.a);
        yynVar.a(upb1.class, pza1.a);
        yynVar.a(gvb1.class, dna1.a);
        yynVar.a(mhb1.class, tna1.a);
        yynVar.a(tgb1.class, xma1.a);
        yynVar.a(aqb1.class, tza1.a);
        yynVar.a(htb1.class, v6b1.a);
        yynVar.a(jtb1.class, b7b1.a);
        yynVar.a(gtb1.class, p6b1.a);
        yynVar.a(cmb1.class, lta1.a);
        yynVar.a(zub1.class, kfa1.a);
        yynVar.a(kmb1.class, qta1.a);
        yynVar.a(brb1.class, i1b1.a);
        yynVar.a(hrb1.class, x1b1.a);
        yynVar.a(frb1.class, s1b1.a);
        yynVar.a(drb1.class, n1b1.a);
        yynVar.a(zrb1.class, t3b1.a);
        yynVar.a(asb1.class, x3b1.a);
        yynVar.a(fsb1.class, h4b1.a);
        yynVar.a(csb1.class, d4b1.a);
        yynVar.a(jlb1.class, gta1.a);
        yynVar.a(hsb1.class, p4b1.a);
        yynVar.a(jsb1.class, q4b1.a);
        yynVar.a(lsb1.class, t4b1.a);
        yynVar.a(nsb1.class, x4b1.a);
        yynVar.a(ysb1.class, l5b1.a);
        yynVar.a(wsb1.class, u5b1.a);
        yynVar.a(xrb1.class, r2b1.a);
        yynVar.a(tib1.class, upa1.a);
        yynVar.a(urb1.class, l3b1.a);
        yynVar.a(srb1.class, v2b1.a);
        yynVar.a(wrb1.class, q3b1.a);
        yynVar.a(ltb1.class, e7b1.a);
        yynVar.a(lub1.class, wab1.a);
        yynVar.a(lcb1.class, lga1.a);
        yynVar.a(acb1.class, ufa1.a);
        yynVar.a(zbb1.class, tfa1.a);
        yynVar.a(fcb1.class, kga1.a);
        yynVar.a(rcb1.class, bha1.a);
        yynVar.a(mcb1.class, sga1.a);
        yynVar.a(xcb1.class, gha1.a);
        yynVar.a(ycb1.class, hha1.a);
        yynVar.a(cdb1.class, oha1.a);
        yynVar.a(kdb1.class, zha1.a);
        yynVar.a(ldb1.class, aia1.a);
        yynVar.a(b4a1.class, lea1.a);
        yynVar.a(p4a1.class, yea1.a);
        yynVar.a(i4a1.class, mea1.a);
        yynVar.a(mib1.class, hpa1.a);
        yynVar.a(ueb1.class, zja1.a);
        yynVar.a(fu91.class, b5a1.a);
        yynVar.a(ut91.class, j5a1.a);
        yynVar.a(mgb1.class, jma1.a);
        yynVar.a(lu91.class, q5a1.a);
        yynVar.a(gu91.class, z5a1.a);
        yynVar.a(oy91.class, u8a1.a);
        yynVar.a(ey91.class, v8a1.a);
        yynVar.a(qv91.class, b6a1.a);
        yynVar.a(gv91.class, i6a1.a);
        yynVar.a(xz91.class, iaa1.a);
        yynVar.a(mz91.class, taa1.a);
        yynVar.a(u0a1.class, gba1.a);
        yynVar.a(k0a1.class, mba1.a);
        yynVar.a(v3a1.class, wda1.a);
        yynVar.a(u3a1.class, bea1.a);
        yynVar.a(f1a1.class, xba1.a);
        yynVar.a(v0a1.class, yba1.a);
        yynVar.a(s1a1.class, ica1.a);
        yynVar.a(g1a1.class, jca1.a);
        yynVar.a(tub1.class, d8b1.a);
        yynVar.a(mub1.class, lka1.a);
        yynVar.a(qub1.class, bta1.a);
        yynVar.a(pub1.class, wsa1.a);
        yynVar.a(nub1.class, ina1.a);
        yynVar.a(sub1.class, t7b1.a);
        yynVar.a(rub1.class, q7b1.a);
        yynVar.a(uub1.class, h8b1.a);
        yynVar.a(oub1.class, soa1.a);
        yynVar.a(xub1.class, bbb1.a);
        yynVar.a(wub1.class, cbb1.a);
        yynVar.a(vub1.class, zab1.a);
        yynVar.a(ptb1.class, n8b1.a);
        yynVar.a(iib1.class, yoa1.a);
        yynVar.a(xib1.class, zpa1.a);
        yynVar.a(lbb1.class, lfa1.a);
        yynVar.a(nhb1.class, boa1.a);
        yynVar.a(sib1.class, ipa1.a);
        yynVar.a(sgb1.class, qma1.a);
        yynVar.a(zeb1.class, ska1.a);
        yynVar.a(ffb1.class, dla1.a);
        yynVar.a(veb1.class, rka1.a);
        yynVar.a(gfb1.class, ila1.a);
        yynVar.a(ilb1.class, qsa1.a);
        yynVar.a(clb1.class, hsa1.a);
        yynVar.a(tt91.class, v4a1.a);
        yynVar.a(iub1.class, kab1.a);
        yynVar.a(kub1.class, tab1.a);
        yynVar.a(jub1.class, pab1.a);
        yynVar.a(hbb1.class, zea1.a);
        yynVar.a(wdb1.class, ria1.a);
        yynVar.a(vdb1.class, qia1.a);
        yynVar.a(pdb1.class, kia1.a);
        yynVar.a(kpb1.class, zya1.a);
        yynVar.a(qpb1.class, fza1.a);
        yynVar.a(ppb1.class, eza1.a);
        yynVar.a(yx91.class, f8a1.a);
        yynVar.a(rx91.class, k8a1.a);
        yynVar.a(dqb1.class, uza1.a);
        yynVar.a(pqb1.class, i0b1.a);
        yynVar.a(fqb1.class, zza1.a);
        yynVar.a(iqb1.class, h0b1.a);
        yynVar.a(vy91.class, g9a1.a);
        yynVar.a(py91.class, h9a1.a);
        yynVar.a(vtb1.class, e9b1.a);
        yynVar.a(utb1.class, c9b1.a);
        yynVar.a(gub1.class, cab1.a);
        yynVar.a(hub1.class, gab1.a);
        yynVar.a(jrb1.class, a2b1.a);
        yynVar.a(qrb1.class, m2b1.a);
        yynVar.a(lrb1.class, f2b1.a);
        yynVar.a(orb1.class, g2b1.a);
        yynVar.a(xhb1.class, ioa1.a);
        yynVar.a(d0a1.class, uaa1.a);
        yynVar.a(yz91.class, fba1.a);
        yynVar.a(rhb1.class, hoa1.a);
        yynVar.a(xgb1.class, pna1.a);
        yynVar.a(sqb1.class, p0b1.a);
        yynVar.a(yqb1.class, a1b1.a);
        yynVar.a(vqb1.class, u0b1.a);
        yynVar.a(hz91.class, u9a1.a);
        yynVar.a(az91.class, v9a1.a);
        yynVar.a(gob1.class, lwa1.a);
        yynVar.a(job1.class, xwa1.a);
        yynVar.a(mob1.class, ywa1.a);
        yynVar.a(pw91.class, j7a1.a);
        yynVar.a(ow91.class, l7a1.a);
        yynVar.a(vnb1.class, vva1.a);
        yynVar.a(aob1.class, fwa1.a);
        yynVar.a(dob1.class, gwa1.a);
        yynVar.a(aw91.class, p6a1.a);
        yynVar.a(zv91.class, x6a1.a);
        yynVar.a(nob1.class, hxa1.a);
        yynVar.a(rob1.class, ixa1.a);
        yynVar.a(uob1.class, oxa1.a);
        yynVar.a(xob1.class, aya1.a);
        yynVar.a(kx91.class, t7a1.a);
        yynVar.a(fx91.class, z7a1.a);
        yynVar.a(stb1.class, t8b1.a);
        yynVar.a(rtb1.class, w8b1.a);
        yynVar.a(djb1.class, aqa1.a);
        yynVar.a(ijb1.class, kqa1.a);
        yynVar.a(ejb1.class, jqa1.a);
        yynVar.a(njb1.class, pqa1.a);
        yynVar.a(zsb1.class, x5b1.a);
        yynVar.a(atb1.class, b6b1.a);
        yynVar.a(m2a1.class, cda1.a);
        yynVar.a(f2a1.class, mda1.a);
        yynVar.a(wtb1.class, f9b1.a);
        yynVar.a(osb1.class, b5b1.a);
        yynVar.a(psb1.class, k5b1.a);
        yynVar.a(e2a1.class, vca1.a);
        yynVar.a(t1a1.class, wca1.a);
        yynVar.a(ttb1.class, x8b1.a);
        yynVar.a(snb1.class, wta1.a);
        yynVar.a(rnb1.class, ova1.a);
        yynVar.a(hnb1.class, xua1.a);
        yynVar.a(ymb1.class, wua1.a);
        yynVar.a(lnb1.class, bva1.a);
        yynVar.a(nnb1.class, nva1.a);
        yynVar.a(vmb1.class, rua1.a);
        yynVar.a(omb1.class, vta1.a);
        yynVar.a(umb1.class, lua1.a);
        yynVar.a(rmb1.class, gua1.a);
        yynVar.a(gpb1.class, pya1.a);
        yynVar.a(rfb1.class, xla1.a);
        yynVar.a(bpb1.class, fya1.a);
        yynVar.a(hpb1.class, uya1.a);
        yynVar.a(qfb1.class, tla1.a);
        yynVar.a(cgb1.class, yla1.a);
        yynVar.a(ntb1.class, k8b1.a);
        yynVar.a(ctb1.class, f6b1.a);
        yynVar.a(dub1.class, t9b1.a);
        yynVar.a(ftb1.class, k6b1.a);
        yynVar.a(dtb1.class, g6b1.a);
        yynVar.a(xtb1.class, j9b1.a);
        yynVar.a(z2a1.class, nda1.a);
        yynVar.a(s2a1.class, rda1.a);
        yynVar.a(ytb1.class, o9b1.a);
        yynVar.a(kfb1.class, nla1.a);
    }

    public boolean m(w3c w3cVar, wbz0 wbz0Var) {
        return false;
    }

    public boolean n(vbz0 vbz0Var) {
        return false;
    }

    @Override // defpackage.izn
    public mzn o(int i) {
        return null;
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        ga0 ga0Var = hv20.x;
        if (Log.isLoggable(ga0Var.a, 6)) {
            String str = ga0Var.b;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }

    public double q() {
        throw new IllegalStateException();
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return false;
    }

    public /* synthetic */ wbz0(boolean z) {
    }
}
