package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class s2h implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ s2h(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.d(1);
                return Unit.a;
            case 1:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                float density = (np3Var.getDensity() * t2h.a) / nmq.b(np3Var.a.e());
                Float valueOf = Float.valueOf(0.0f);
                long j = d85.m;
                Pair pair = new Pair(valueOf, new d85(j));
                Float valueOf2 = Float.valueOf(density);
                long j2 = d85.b;
                return np3Var.b(new g83(y9w.U(new Pair[]{pair, new Pair(valueOf2, new d85(j2)), new Pair(Float.valueOf(1.0f - density), new d85(j2)), new Pair(Float.valueOf(1.0f), new d85(j))}, 14), 7));
            case 2:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                jpa.A0(opfVar, u2h.a, 0L, opfVar.a.e(), 0.0f, null, null, 6, 58);
                return Unit.a;
            case 3:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, -5.0f);
                wfp.w(jfpVar);
                return Unit.a;
            case 4:
                ((loa) obj).getClass();
                return Unit.a;
            case 5:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, -1.0f);
                return Unit.a;
            case 6:
                e4h e4hVar = (e4h) obj;
                e4hVar.getClass();
                return e4hVar.getClass();
            case 7:
                String str = (String) obj;
                return hrg.A(str, "'", str, "'");
            case 8:
                String str2 = (String) obj;
                return hrg.A(str2, "'", str2, "'");
            case 9:
                List list = (List) obj;
                list.getClass();
                return y5g.A0(list, cyt.a);
            case 10:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.w(jfpVar3);
                return Unit.a;
            case 11:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.w(jfpVar4);
                return Unit.a;
            case 12:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.a(0.99f);
                return Unit.a;
            case 13:
                zco zcoVar3 = (zco) obj;
                zcoVar3.getClass();
                zcoVar3.a(0.99f);
                return Unit.a;
            case 14:
                ((mwk) obj).getClass();
                return Unit.a;
            case 15:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, ygh.class).E(new s2h(21));
                o18Var.b(hag.I(yb.class)).E(new s2h(26));
                o18Var.b(hag.I(zfh.class)).E(new s2h(27));
                o18Var.b(hag.I(knv.class)).E(new s2h(28));
                o18Var.b(hag.I(bth.class)).E(new s2h(29));
                o18Var.b(hag.I(juh.class)).E(new s2h(16));
                o18Var.b(hag.I(psh.class)).E(new s2h(17));
                o18Var.b(hag.I(eth.class)).D(new s2h(18));
                o18Var.b(hag.I(ovh.class)).E(new s2h(19));
                o18Var.b(hag.I(qvh.class)).E(new s2h(20));
                o18Var.b(hag.I(rrc.class)).E(new s2h(22));
                o18Var.b(hag.I(kuh.class)).E(new s2h(23));
                o18Var.b(hag.I(iuh.class)).E(new s2h(24));
                o18Var.b(hag.I(rvh.class)).E(new s2h(25));
                return Unit.a;
            case 16:
                ((l13) obj).getClass();
                return new juh();
            case 17:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new psh((bth) l13Var.a.D(hag.I(bth.class), l13Var, l13Var.b));
            case 18:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(psh.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (eth) ((psh) qdcVar.C(I)).e.getValue();
            case 19:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(psh.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return (ovh) ((psh) qdcVar2.C(I2)).b.getValue();
            case 20:
                ((l13) obj).getClass();
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(psh.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return (qvh) ((psh) qdcVar3.C(I3)).c.getValue();
            case 21:
                ((l13) obj).getClass();
                return new ygh();
            case 22:
                ((l13) obj).getClass();
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(psh.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                return (rrc) ((psh) qdcVar4.C(I4)).d.getValue();
            case 23:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I5 = hag.I(k1l.class);
                qdc qdcVar5 = l13Var2.a;
                Set set = l13Var2.b;
                k1l k1lVar = (k1l) qdcVar5.D(I5, l13Var2, set);
                fan fanVar = (fan) qdcVar5.D(hag.I(fan.class), l13Var2, set);
                lum lumVar = new lum();
                lumVar.a = k1lVar;
                lumVar.b = fanVar;
                lumVar.c = btf.b(new qkp(2));
                return new kuh(lumVar);
            case 24:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                pd0 pd0Var = ((ed0) l13Var3.a.D(hag.I(ed0.class), l13Var3, l13Var3.b)).a;
                bdt I6 = hag.I(kc0.class);
                qdc qdcVar6 = pd0Var.a;
                qdcVar6.getClass();
                return new iuh((kc0) qdcVar6.C(I6), new mmo(2), btf.b(new h4d(l13Var3, 2)));
            case 25:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new rvh(l13Var4.b(hag.I(qvh.class), true), l13Var4.b(hag.I(rrc.class), true));
            case 26:
                ((l13) obj).getClass();
                return new yb();
            case 27:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new zfh((prn) l13Var5.a.D(hag.I(prn.class), l13Var5, l13Var5.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I7 = hag.I(Context.class);
                qdc qdcVar7 = l13Var6.a;
                Set set2 = l13Var6.b;
                return new knv((Context) qdcVar7.D(I7, l13Var6, set2), l13Var6.b(hag.I(vnv.class), true), l13Var6.b(hag.I(oq7.class), true), l13Var6.b(hag.I(m9q.class), true), l13Var6.b(hag.I(lmv.class), true), (cnv) qdcVar7.D(hag.I(cnv.class), l13Var6, set2));
            default:
                ((l13) obj).getClass();
                return new bth();
        }
    }
}
