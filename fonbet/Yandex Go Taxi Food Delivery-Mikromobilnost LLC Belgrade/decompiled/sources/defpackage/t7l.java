package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.m1;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class t7l implements qfy0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.yandex.div.json.expressions.Expression] */
    public static q7l b(yf90 yf90Var, u7l u7lVar, JSONObject jSONObject) {
        exq exqVar = u7lVar.a;
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        ivk ivkVar = m1.h;
        kvo kvoVar = m1.a;
        Expression n = xcx.n(yf90Var, exqVar, jSONObject, "duration", tmsVar, tlsVar, ivkVar, kvoVar);
        if (n == null) {
            n = kvoVar;
        }
        exq exqVar2 = u7lVar.b;
        qkj qkjVar = m1.g;
        tls tlsVar2 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar2 = m1.b;
        Expression o = xcx.o(yf90Var, exqVar2, jSONObject, "interpolator", qkjVar, tlsVar2, kvoVar2);
        if (o == null) {
            o = kvoVar2;
        }
        exq exqVar3 = u7lVar.c;
        sms smsVar = wm11.d;
        tls tlsVar3 = b.g;
        ivk ivkVar2 = m1.i;
        kvo kvoVar3 = m1.c;
        ?? n2 = xcx.n(yf90Var, exqVar3, jSONObject, "pivot_x", smsVar, tlsVar3, ivkVar2, kvoVar3);
        kvo kvoVar4 = n2 == 0 ? kvoVar3 : n2;
        exq exqVar4 = u7lVar.d;
        ivk ivkVar3 = m1.j;
        kvo kvoVar5 = m1.d;
        ?? n3 = xcx.n(yf90Var, exqVar4, jSONObject, "pivot_y", smsVar, tlsVar3, ivkVar3, kvoVar5);
        kvo kvoVar6 = n3 == 0 ? kvoVar5 : n3;
        exq exqVar5 = u7lVar.e;
        ivk ivkVar4 = m1.k;
        kvo kvoVar7 = m1.e;
        ?? n4 = xcx.n(yf90Var, exqVar5, jSONObject, "scale", smsVar, tlsVar3, ivkVar4, kvoVar7);
        if (n4 != 0) {
            kvoVar7 = n4;
        }
        exq exqVar6 = u7lVar.f;
        ivk ivkVar5 = m1.l;
        kvo kvoVar8 = m1.f;
        ?? n5 = xcx.n(yf90Var, exqVar6, jSONObject, "start_delay", tmsVar, tlsVar, ivkVar5, kvoVar8);
        return new q7l(n, o, kvoVar4, kvoVar6, kvoVar7, n5 == 0 ? kvoVar8 : n5);
    }

    @Override // defpackage.qfy0
    public final /* bridge */ /* synthetic */ Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        return b(yf90Var, (u7l) hexVar, jSONObject);
    }
}
