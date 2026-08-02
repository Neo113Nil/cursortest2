package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class yo1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yo1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                bp1 bp1Var = (bp1) this.b;
                String str2 = ((so1) this.c).a.a;
                bp1Var.getClass();
                str2.getClass();
                uo1 uo1Var = bp1Var.b;
                fnb fnbVar = uo1Var.a;
                LinkedHashMap linkedHashMap = uo1Var.d;
                if (booleanValue) {
                    linkedHashMap.put(str2, str);
                    nmb.p(uo1Var.c, fnbVar.G(), uo1.e, null, null, null, null, null, pkb.Artist, str2, 0, 0, null, 0, false, "ARTISTS_TOP", "collection_artists_top", 0, 0, null, null, null, 0, str, 8339068);
                } else {
                    nmb.j(uo1Var.c, fnbVar.G(), uo1.e, null, null, null, null, null, pkb.Artist, str2, 0, 0, null, 0, false, "ARTISTS_TOP", "collection_artists_top", 0, 0, null, str, 8339068);
                    linkedHashMap.remove(str2);
                }
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                pab pabVar = (pab) this.c;
                pu4 pu4Var = (pu4) this.b;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean h = oq5Var.h(pu4Var) | oq5Var.h(pabVar);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new uv(5, pu4Var, pabVar);
                        oq5Var.k0(K);
                    }
                    zdg.g(0, 6, 0L, oq5Var, null, (Function0) K);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }
}
