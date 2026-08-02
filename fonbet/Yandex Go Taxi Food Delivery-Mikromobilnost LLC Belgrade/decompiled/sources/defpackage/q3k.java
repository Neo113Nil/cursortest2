package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class q3k implements qfy0 {
    public final /* synthetic */ int a;

    public /* synthetic */ q3k(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        lvo e;
        switch (this.a) {
            case 0:
                s3k s3kVar = (s3k) hexVar;
                exq exqVar = s3kVar.a;
                tms tmsVar = wm11.b;
                tls tlsVar = b.h;
                x8e x8eVar = r3k.e;
                kvo kvoVar = r3k.a;
                ?? n = xcx.n(yf90Var, exqVar, jSONObject, "bottom", tmsVar, tlsVar, x8eVar, kvoVar);
                kvo kvoVar2 = n == 0 ? kvoVar : n;
                exq exqVar2 = s3kVar.b;
                x8e x8eVar2 = r3k.f;
                kvo kvoVar3 = r3k.b;
                ?? n2 = xcx.n(yf90Var, exqVar2, jSONObject, "left", tmsVar, tlsVar, x8eVar2, kvoVar3);
                kvo kvoVar4 = n2 == 0 ? kvoVar3 : n2;
                exq exqVar3 = s3kVar.c;
                x8e x8eVar3 = r3k.g;
                kvo kvoVar5 = r3k.c;
                ?? n3 = xcx.n(yf90Var, exqVar3, jSONObject, "right", tmsVar, tlsVar, x8eVar3, kvoVar5);
                kvo kvoVar6 = n3 == 0 ? kvoVar5 : n3;
                exq exqVar4 = s3kVar.d;
                x8e x8eVar4 = r3k.h;
                kvo kvoVar7 = r3k.d;
                ?? n4 = xcx.n(yf90Var, exqVar4, jSONObject, "top", tmsVar, tlsVar, x8eVar4, kvoVar7);
                if (n4 != 0) {
                    kvoVar7 = n4;
                }
                return new n3k(kvoVar2, kvoVar4, kvoVar6, kvoVar7);
            case 1:
                s8k s8kVar = (s8k) hexVar;
                exq exqVar5 = s8kVar.a;
                tms tmsVar2 = wm11.b;
                tls tlsVar2 = b.h;
                return new l8k(xcx.l(yf90Var, exqVar5, jSONObject, "end", tmsVar2, tlsVar2), xcx.d(yf90Var, s8kVar.b, jSONObject, "start", tmsVar2, tlsVar2));
            case 2:
                bak bakVar = (bak) hexVar;
                exq exqVar6 = bakVar.a;
                ums umsVar = wm11.c;
                return new q9k(xcx.c(yf90Var, exqVar6, jSONObject, "name", umsVar), xcx.c(yf90Var, bakVar.b, jSONObject, "value", umsVar));
            case 3:
                mnk mnkVar = (mnk) hexVar;
                exq exqVar7 = mnkVar.a;
                qkj qkjVar = a0.b;
                tls tlsVar3 = DivSizeUnit.FROM_STRING;
                kvo kvoVar8 = a0.a;
                ?? o = xcx.o(yf90Var, exqVar7, jSONObject, "unit", qkjVar, tlsVar3, kvoVar8);
                if (o != 0) {
                    kvoVar8 = o;
                }
                return new jnk(kvoVar8, xcx.d(yf90Var, mnkVar.b, jSONObject, "value", wm11.d, b.g));
            case 4:
                qqk qqkVar = (qqk) hexVar;
                exq exqVar8 = qqkVar.a;
                ums umsVar2 = wm11.c;
                Expression f = xcx.f(yf90Var, exqVar8, jSONObject, "key", pqk.b);
                exq exqVar9 = qqkVar.b;
                z3k z3kVar = pqk.c;
                lvo lvoVar = pqk.a;
                abl0 abl0Var = q5z.c;
                if (exqVar9.b && jSONObject.has("placeholder")) {
                    e = a.e(yf90Var, jSONObject, "placeholder", umsVar2, abl0Var, z3kVar, lvoVar);
                } else {
                    int i = exqVar9.a;
                    e = i == 2 ? (Expression) ((cxq) exqVar9).c : i == 3 ? a.e(yf90Var, jSONObject, ((bxq) exqVar9).c, umsVar2, abl0Var, z3kVar, lvoVar) : null;
                }
                if (e != null) {
                    lvoVar = e;
                }
                return new hqk(f, lvoVar, xcx.k(yf90Var, qqkVar.c, jSONObject, "regex", umsVar2));
            case 5:
                mrk mrkVar = (mrk) hexVar;
                exq exqVar10 = mrkVar.a;
                abl0 abl0Var2 = q5z.c;
                kbs kbsVar = q5z.b;
                return new jrk((String) xcx.a(exqVar10, jSONObject, "name", abl0Var2, kbsVar), (DivEvaluableType) xcx.a(mrkVar.b, jSONObject, "type", DivEvaluableType.FROM_STRING, kbsVar));
            case 6:
                return new luk(xcx.d(yf90Var, ((awk) hexVar).a, jSONObject, "color", wm11.f, b.b));
            case 7:
                czk czkVar = (czk) hexVar;
                return new uyk(xcx.d(yf90Var, czkVar.a, jSONObject, "color", wm11.f, b.b), xcx.e(yf90Var, czkVar.b, jSONObject, "position", wm11.d, b.g, vez0.a));
            case 8:
                z6l z6lVar = (z6l) hexVar;
                return new j5l(xcx.d(yf90Var, z6lVar.a, jSONObject, "color", wm11.f, b.b), xcx.e(yf90Var, z6lVar.b, jSONObject, "position", wm11.d, b.g, ea91.a));
            case 9:
                e8l e8lVar = (e8l) hexVar;
                exq exqVar11 = e8lVar.a;
                ums umsVar3 = wm11.c;
                return new w7l(xcx.k(yf90Var, exqVar11, jSONObject, "text", umsVar3), xcx.c(yf90Var, e8lVar.b, jSONObject, "value", umsVar3));
            default:
                ool oolVar = (ool) hexVar;
                exq exqVar12 = oolVar.a;
                tms tmsVar3 = wm11.b;
                tls tlsVar4 = b.h;
                return new hol(xcx.e(yf90Var, exqVar12, jSONObject, "height", tmsVar3, tlsVar4, ma91.a), xcx.e(yf90Var, oolVar.b, jSONObject, "width", tmsVar3, tlsVar4, ma91.b));
        }
    }
}
