package defpackage;

import java.util.ArrayList;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class s14 {
    public static c24 a(yit yitVar) {
        String e;
        yitVar.getClass();
        if (yitVar instanceof o20) {
            o20 o20Var = (o20) yitVar;
            ArrayList arrayList = o20Var.b;
            lt ltVar = o20Var.a;
            return new t14(new rab(ltVar.c, xp3.M(arrayList), null, vz1.w(kg5.M(ltVar.e, WebPath$Storage.AVATARS)), ltVar.g, ltVar.d == WarningContent.EXPLICIT, o20Var.c), ltVar, arrayList);
        }
        if (yitVar instanceof hm1) {
            hm1 hm1Var = (hm1) yitVar;
            u51 u51Var = hm1Var.a;
            return new u14(new q91(u51Var.b, vz1.w(kg5.M(u51Var.c, WebPath$Storage.AVATARS)), hm1Var.b), u51Var);
        }
        if (yitVar instanceof s3m) {
            s3m s3mVar = (s3m) yitVar;
            eul eulVar = s3mVar.a;
            return new a24(new rab(eulVar.c, "", null, vz1.w(op7.b(eulVar).a), null, false, s3mVar.b), eulVar);
        }
        if (yitVar instanceof a2g) {
            a2g a2gVar = (a2g) yitVar;
            eul eulVar2 = a2gVar.a;
            return new x14(new v1g(eulVar2.c, vz1.w(op7.b(eulVar2).a), null, qo6.e), a2gVar.b, a2gVar.c, eulVar2);
        }
        if (yitVar instanceof umk) {
            umk umkVar = (umk) yitVar;
            eul eulVar3 = umkVar.a;
            String str = umkVar.c;
            return new z14(new rmk(eulVar3.c, str != null ? str : "", vz1.w(kg5.M(eulVar3.d, WebPath$Storage.AVATARS)), umkVar.f), umkVar);
        }
        if (yitVar instanceof te4) {
            te4 te4Var = (te4) yitVar;
            lf4 lf4Var = te4Var.c;
            lt ltVar2 = te4Var.a;
            String str2 = ltVar2.c;
            u9b u9bVar = ltVar2.e;
            e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
            v1g v1gVar = new v1g(str2, e != null ? e : "", ltVar2.g, qo6.b);
            String valueOf = String.valueOf(lf4Var.a);
            kf4 kf4Var = lf4Var.b;
            if (kf4Var == null) {
                kf4Var = kf4.d;
            }
            return new v14(new se4(v1gVar, valueOf, kf4Var), te4Var.b, te4Var.d, ltVar2);
        }
        if (yitVar instanceof r1g) {
            r1g r1gVar = (r1g) yitVar;
            lt ltVar3 = r1gVar.a;
            String str3 = ltVar3.c;
            u9b u9bVar2 = ltVar3.e;
            e = u9bVar2 != null ? u9bVar2.e(wct.s(), WebPath$Storage.AVATARS) : null;
            return new w14(new v1g(str3, e != null ? e : "", ltVar3.g, qo6.b), r1gVar.b, r1gVar.c, ltVar3);
        }
        if (yitVar instanceof fej) {
            fej fejVar = (fej) yitVar;
            lt ltVar4 = fejVar.a;
            Boolean bool = fejVar.d;
            return new y14(g0g.I(ltVar4, bool != null ? bool.booleanValue() : false), ltVar4, fejVar.c, fejVar.b);
        }
        if (yitVar instanceof e6i) {
            return null;
        }
        if (!(yitVar instanceof llu)) {
            b6e.s();
            return null;
        }
        llu lluVar = (llu) yitVar;
        dou douVar = lluVar.a;
        np npVar = lluVar.b;
        op opVar = npVar.b;
        String str4 = douVar.c;
        String str5 = douVar.d;
        String str6 = str5.length() > 0 ? str5 : null;
        String pathForSize = new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
        String str7 = npVar.a;
        Integer b0 = y2x.b0(opVar.b);
        return new b24(new klu(str4, str6, pathForSize, str7, b0 != null ? b0.intValue() : c3x.U(d85.n), npVar.c), douVar);
    }
}
