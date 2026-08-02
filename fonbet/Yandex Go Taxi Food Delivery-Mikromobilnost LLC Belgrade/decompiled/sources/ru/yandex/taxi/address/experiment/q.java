package ru.yandex.taxi.address.experiment;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.search.address.model.Service;
import defpackage.bvf0;
import defpackage.csz;
import defpackage.d6z;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.ly3;
import defpackage.m7x0;
import defpackage.mv0;
import defpackage.o0j;
import defpackage.pdc;
import defpackage.ufu;
import defpackage.up2;
import defpackage.w511;
import defpackage.yp2;
import defpackage.yw0;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes9.dex */
public final class q {
    public final pdc a;
    public final k7x0 b;
    public final yp2 c;
    public final r0 d = bvf0.c(a());
    public final i3y e = kotlin.a.a(new csz(17, this));

    public q(pdc pdcVar, k7x0 k7x0Var, yp2 yp2Var) {
        this.a = pdcVar;
        this.b = k7x0Var;
        this.c = yp2Var;
    }

    public static NewbiesRedesignPointsABExperiment a() {
        return new NewbiesRedesignPointsABExperiment(8388606);
    }

    public static String c(String str, NewbiesRedesignPointsABExperiment newbiesRedesignPointsABExperiment, String str2) {
        String Y = d6z.Y(newbiesRedesignPointsABExperiment, str);
        if (str2 != null) {
            String Y2 = d6z.Y(newbiesRedesignPointsABExperiment, str2);
            if (Y2.length() != 0) {
                return Y2;
            }
        }
        return Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x00c5, code lost:
    
        if (kotlin.collections.a.G(((ru.yandex.taxi.address.experiment.n) r15).a, r45) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x00db, code lost:
    
        if (kotlin.collections.a.G(((ru.yandex.taxi.address.experiment.k) r15).a, r46) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (kotlin.collections.a.G(r2, r10) != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e b(String str, String str2, Service service) {
        mv0 mv0Var;
        mv0 mv0Var2;
        Object obj;
        mv0 mv0Var3;
        String str3;
        String str4;
        String o;
        String str5;
        Boolean v;
        String str6;
        NewbiesRedesignPointsABExperiment newbiesRedesignPointsABExperiment = (NewbiesRedesignPointsABExperiment) this.e.getValue();
        boolean z = newbiesRedesignPointsABExperiment.b;
        String str7 = newbiesRedesignPointsABExperiment.u;
        String str8 = newbiesRedesignPointsABExperiment.q;
        String str9 = newbiesRedesignPointsABExperiment.p;
        String str10 = newbiesRedesignPointsABExperiment.m;
        String str11 = newbiesRedesignPointsABExperiment.l;
        String str12 = newbiesRedesignPointsABExperiment.j;
        String str13 = newbiesRedesignPointsABExperiment.i;
        mv0 mv0Var4 = newbiesRedesignPointsABExperiment.h;
        mv0 mv0Var5 = newbiesRedesignPointsABExperiment.g;
        mv0 mv0Var6 = newbiesRedesignPointsABExperiment.f;
        mv0 mv0Var7 = newbiesRedesignPointsABExperiment.e;
        mv0 mv0Var8 = newbiesRedesignPointsABExperiment.d;
        if (!z || mv0Var8.a() || mv0Var7.a() || mv0Var6.a() || mv0Var5.a() || mv0Var4.a() || !d6z.Z(newbiesRedesignPointsABExperiment, str13) || !d6z.Z(newbiesRedesignPointsABExperiment, str12) || !d6z.Z(newbiesRedesignPointsABExperiment, str11) || !d6z.Z(newbiesRedesignPointsABExperiment, str10) || !d6z.Z(newbiesRedesignPointsABExperiment, str9) || !d6z.Z(newbiesRedesignPointsABExperiment, str8) || !d6z.Z(newbiesRedesignPointsABExperiment, str7)) {
            return null;
        }
        Iterator it = newbiesRedesignPointsABExperiment.x.iterator();
        while (true) {
            if (!it.hasNext()) {
                mv0Var = mv0Var4;
                mv0Var2 = null;
                obj = null;
                break;
            }
            mv0Var2 = null;
            obj = (o) it.next();
            Iterator it2 = it;
            if (obj instanceof i) {
                List list = ((i) obj).a;
                if (service != null) {
                    mv0Var = mv0Var4;
                    str6 = service.getStrName();
                } else {
                    mv0Var = mv0Var4;
                    str6 = null;
                }
            } else {
                mv0Var = mv0Var4;
                if (!(obj instanceof n)) {
                    if (!(obj instanceof k)) {
                        if (!jl40.l(obj, l.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        break;
                    }
                    it = it2;
                    mv0Var4 = mv0Var;
                }
            }
        }
        g gVar = (g) obj;
        String c = c(str10, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getK() : mv0Var2);
        String c2 = c(str9, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getL() : mv0Var2);
        String str14 = newbiesRedesignPointsABExperiment.t;
        if (gVar != null) {
            mv0Var3 = mv0Var5;
            str3 = gVar.getR();
        } else {
            mv0Var3 = mv0Var5;
            str3 = mv0Var2;
        }
        o0j o0jVar = new o0j(c, c2, c(str14, newbiesRedesignPointsABExperiment, str3), c(str7, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getS() : mv0Var2));
        mv0 b = gVar != null ? gVar.getB() : mv0Var2;
        if (b != null && !b.a()) {
            mv0Var8 = b;
        }
        yw0 d = d(mv0Var8);
        mv0 c3 = gVar != null ? gVar.getC() : mv0Var2;
        if (c3 != null && !c3.a()) {
            mv0Var7 = c3;
        }
        yw0 d2 = d(mv0Var7);
        mv0 d3 = gVar != null ? gVar.getD() : mv0Var2;
        if (d3 != null && !d3.a()) {
            mv0Var6 = d3;
        }
        yw0 d4 = d(mv0Var6);
        mv0 e = gVar != null ? gVar.getE() : mv0Var2;
        yw0 d5 = d((e == null || e.a()) ? mv0Var3 : e);
        mv0 f = gVar != null ? gVar.getF() : mv0Var2;
        yw0 d6 = d((f == null || f.a()) ? mv0Var : f);
        String c4 = c(str13, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getG() : mv0Var2);
        String c5 = c(str12, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getH() : mv0Var2);
        String c6 = c(newbiesRedesignPointsABExperiment.k, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getI() : mv0Var2);
        String c7 = c(str11, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getJ() : mv0Var2);
        String c8 = c(newbiesRedesignPointsABExperiment.n, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getQ() : mv0Var2);
        String c9 = c(newbiesRedesignPointsABExperiment.o, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getP() : mv0Var2);
        String c10 = c(str8, newbiesRedesignPointsABExperiment, gVar != null ? gVar.getM() : mv0Var2);
        String str15 = newbiesRedesignPointsABExperiment.r;
        String n = gVar != null ? gVar.getN() : mv0Var2;
        Object Y = str15 != null ? d6z.Y(newbiesRedesignPointsABExperiment, str15) : mv0Var2;
        if (n != 0) {
            String Y2 = d6z.Y(newbiesRedesignPointsABExperiment, n);
            if (Y2.length() != 0) {
                str4 = Y2;
                String str16 = newbiesRedesignPointsABExperiment.s;
                o = gVar == null ? gVar.getO() : mv0Var2;
                Object Y3 = str16 == null ? d6z.Y(newbiesRedesignPointsABExperiment, str16) : mv0Var2;
                if (o != 0) {
                    String Y4 = d6z.Y(newbiesRedesignPointsABExperiment, o);
                    if (Y4.length() != 0) {
                        str5 = Y4;
                        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle = newbiesRedesignPointsABExperiment.v;
                        Object u = gVar != null ? gVar.getU() : mv0Var2;
                        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2 = u == null ? summaryAddressStyle : u;
                        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle3 = newbiesRedesignPointsABExperiment.w;
                        Object t = gVar != null ? gVar.getT() : mv0Var2;
                        return new e(d, d2, d4, d5, d6, c4, c5, c6, c7, c9, c8, o0jVar, c10, str4, str5, null, null, null, false, summaryAddressStyle2, t == null ? summaryAddressStyle3 : t, (gVar != null || (v = gVar.getV()) == null) ? false : v.booleanValue(), 1015808);
                    }
                }
                str5 = Y3;
                NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle4 = newbiesRedesignPointsABExperiment.v;
                if (gVar != null) {
                }
                if (u == null) {
                }
                NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle32 = newbiesRedesignPointsABExperiment.w;
                if (gVar != null) {
                }
                return new e(d, d2, d4, d5, d6, c4, c5, c6, c7, c9, c8, o0jVar, c10, str4, str5, null, null, null, false, summaryAddressStyle2, t == null ? summaryAddressStyle32 : t, (gVar != null || (v = gVar.getV()) == null) ? false : v.booleanValue(), 1015808);
            }
        }
        str4 = Y;
        String str162 = newbiesRedesignPointsABExperiment.s;
        if (gVar == null) {
        }
        if (str162 == null) {
        }
        if (o != 0) {
        }
        str5 = Y3;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle42 = newbiesRedesignPointsABExperiment.v;
        if (gVar != null) {
        }
        if (u == null) {
        }
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle322 = newbiesRedesignPointsABExperiment.w;
        if (gVar != null) {
        }
        return new e(d, d2, d4, d5, d6, c4, c5, c6, c7, c9, c8, o0jVar, c10, str4, str5, null, null, null, false, summaryAddressStyle2, t == null ? summaryAddressStyle322 : t, (gVar != null || (v = gVar.getV()) == null) ? false : v.booleanValue(), 1015808);
    }

    public final yw0 d(mv0 mv0Var) {
        String str = mv0Var.b;
        ufu ufuVar = (ufu) this.a;
        kdc e = ufuVar.e(str);
        String str2 = mv0Var.c;
        kdc i = ufuVar.i(str2);
        String str3 = mv0Var.b;
        long j = up2.b;
        yp2 yp2Var = this.c;
        return new yw0(((m7x0) this.b).a(mv0Var.a), e, i, ly3.g(j, yp2Var, str3), yp2Var.a(str2, AppColor$Palette.Text));
    }
}
