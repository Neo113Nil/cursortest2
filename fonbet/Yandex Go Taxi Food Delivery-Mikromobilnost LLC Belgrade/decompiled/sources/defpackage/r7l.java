package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.m1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class r7l implements zsq0, nyi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    public static q7l c(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        ivk ivkVar = m1.h;
        kvo kvoVar = m1.a;
        ?? e = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar, ivkVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        qkj qkjVar = m1.g;
        tls tlsVar2 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = m1.b;
        ?? e2 = a.e(yf90Var, jSONObject, "interpolator", qkjVar, tlsVar2, q5z.b, kvoVar3);
        kvo kvoVar4 = e2 == 0 ? kvoVar3 : e2;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        ivk ivkVar2 = m1.i;
        kvo kvoVar5 = m1.c;
        ?? e3 = a.e(yf90Var, jSONObject, "pivot_x", smsVar, tlsVar3, ivkVar2, kvoVar5);
        kvo kvoVar6 = e3 == 0 ? kvoVar5 : e3;
        ivk ivkVar3 = m1.j;
        kvo kvoVar7 = m1.d;
        ?? e4 = a.e(yf90Var, jSONObject, "pivot_y", smsVar, tlsVar3, ivkVar3, kvoVar7);
        kvo kvoVar8 = e4 == 0 ? kvoVar7 : e4;
        ivk ivkVar4 = m1.k;
        kvo kvoVar9 = m1.e;
        ?? e5 = a.e(yf90Var, jSONObject, "scale", smsVar, tlsVar3, ivkVar4, kvoVar9);
        if (e5 != 0) {
            kvoVar9 = e5;
        }
        ivk ivkVar5 = m1.l;
        kvo kvoVar10 = m1.f;
        ?? e6 = a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar, ivkVar5, kvoVar10);
        return new q7l(kvoVar2, kvoVar4, kvoVar6, kvoVar8, kvoVar9, e6 == 0 ? kvoVar10 : e6);
    }

    public static JSONObject d(yf90 yf90Var, q7l q7lVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "duration", q7lVar.a);
        a.h(yf90Var, jSONObject, "interpolator", q7lVar.b, DivAnimationInterpolator.TO_STRING);
        a.g(yf90Var, jSONObject, "pivot_x", q7lVar.c);
        a.g(yf90Var, jSONObject, "pivot_y", q7lVar.d);
        a.g(yf90Var, jSONObject, "scale", q7lVar.e);
        a.g(yf90Var, jSONObject, "start_delay", q7lVar.f);
        wwg.Z(yf90Var, jSONObject, "type", "scale");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, jSONObject);
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return d(yf90Var, (q7l) obj);
    }
}
