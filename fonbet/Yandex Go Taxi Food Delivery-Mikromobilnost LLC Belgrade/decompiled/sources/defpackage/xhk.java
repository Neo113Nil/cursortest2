package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.p;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class xhk implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static whk c(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        z3k z3kVar = p.e;
        kvo kvoVar = p.a;
        ?? e = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar, z3kVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        qkj qkjVar = p.d;
        tls tlsVar2 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = p.b;
        ?? e2 = a.e(yf90Var, jSONObject, "interpolator", qkjVar, tlsVar2, q5z.b, kvoVar3);
        if (e2 != 0) {
            kvoVar3 = e2;
        }
        z3k z3kVar2 = p.f;
        kvo kvoVar4 = p.c;
        ?? e3 = a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar, z3kVar2, kvoVar4);
        if (e3 != 0) {
            kvoVar4 = e3;
        }
        return new whk(kvoVar2, kvoVar3, kvoVar4);
    }

    public static JSONObject d(yf90 yf90Var, whk whkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "duration", whkVar.a);
        a.h(yf90Var, jSONObject, "interpolator", whkVar.b, DivAnimationInterpolator.TO_STRING);
        a.g(yf90Var, jSONObject, "start_delay", whkVar.c);
        wwg.Z(yf90Var, jSONObject, "type", "change_bounds");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (whk) obj);
    }
}
