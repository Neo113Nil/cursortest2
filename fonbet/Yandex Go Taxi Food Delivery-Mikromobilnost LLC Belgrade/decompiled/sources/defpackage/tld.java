package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class tld implements b70 {
    public static final tld a = new tld();
    public static final List b = scc.g("totalPrice", ClidProvider.TIMESTAMP, "maxPoints");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ykd ykdVar = (ykd) obj;
        bfxVar.A1("totalPrice");
        amd amdVar = amd.a;
        foe foeVar = l80.a;
        nld nldVar = ykdVar.a;
        if (bfxVar instanceof ek00) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            amdVar.a(bfxVar, cVar, nldVar);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            amdVar.a(ek00Var2, cVar, nldVar);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1(ClidProvider.TIMESTAMP);
        cVar.d(mlz.a).a(bfxVar, cVar, Long.valueOf(ykdVar.b));
        bfxVar.A1("maxPoints");
        ep60 ep60Var = new ep60(vld.a, true);
        ald aldVar = ykdVar.c;
        if (aldVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, aldVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        nld nldVar = null;
        Long l = null;
        ald aldVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                amd amdVar = amd.a;
                foe foeVar = l80.a;
                nldVar = (nld) new ep60(amdVar, true).b(xdxVar, cVar);
            } else if (h2 == 1) {
                l = (Long) cVar.d(mlz.a).b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new ykd(nldVar, l.longValue(), aldVar);
                }
                vld vldVar = vld.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var = new ep60(vldVar, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = ep60Var.b(xdxVar, cVar);
                }
                aldVar = (ald) b2;
            }
        }
    }
}
