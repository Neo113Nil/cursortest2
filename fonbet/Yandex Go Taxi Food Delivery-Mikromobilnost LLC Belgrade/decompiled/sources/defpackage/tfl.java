package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivText$Image$Accessibility;
import com.yandex.div2.DivText$Image$IndexingDirection;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.v2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tfl implements zsq0, nyi {
    public final JsonParserComponent a;

    public tfl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.T8;
        i3y i3yVar2 = jsonParserComponent.E3;
        DivText$Image$Accessibility divText$Image$Accessibility = (DivText$Image$Accessibility) wwg.M(yf90Var, jSONObject, "accessibility", i3yVar);
        qkj qkjVar = v2.g;
        tls tlsVar = DivTextAlignmentVertical.FROM_STRING;
        kvo kvoVar = v2.a;
        kbs kbsVar = q5z.b;
        ?? e = a.e(yf90Var, jSONObject, "alignment_vertical", qkjVar, tlsVar, kbsVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        sqk sqkVar = (sqk) wwg.M(yf90Var, jSONObject, "height", i3yVar2);
        if (sqkVar == null) {
            sqkVar = v2.b;
        }
        sqk sqkVar2 = sqkVar;
        qkj qkjVar2 = v2.h;
        tls tlsVar2 = DivText$Image$IndexingDirection.FROM_STRING;
        kvo kvoVar3 = v2.c;
        ?? e2 = a.e(yf90Var, jSONObject, "indexing_direction", qkjVar2, tlsVar2, kbsVar, kvoVar3);
        kvo kvoVar4 = e2 == 0 ? kvoVar3 : e2;
        wms wmsVar = wm11.a;
        tls tlsVar3 = b.f;
        kvo kvoVar5 = v2.d;
        ?? e3 = a.e(yf90Var, jSONObject, "preload_required", wmsVar, tlsVar3, kbsVar, kvoVar5);
        kvo kvoVar6 = e3 == 0 ? kvoVar5 : e3;
        Expression b = a.b(yf90Var, jSONObject, "start", wm11.b, b.h, v2.j);
        Expression e4 = a.e(yf90Var, jSONObject, "tint_color", wm11.f, b.b, kbsVar, null);
        qkj qkjVar3 = v2.i;
        tls tlsVar4 = DivBlendMode.FROM_STRING;
        kvo kvoVar7 = v2.e;
        ?? e5 = a.e(yf90Var, jSONObject, "tint_mode", qkjVar3, tlsVar4, kbsVar, kvoVar7);
        if (e5 != 0) {
            kvoVar7 = e5;
        }
        Expression b2 = a.b(yf90Var, jSONObject, "url", wm11.e, b.e, kbsVar);
        sqk sqkVar3 = (sqk) wwg.M(yf90Var, jSONObject, "width", i3yVar2);
        if (sqkVar3 == null) {
            sqkVar3 = v2.f;
        }
        return new cfl(divText$Image$Accessibility, kvoVar2, sqkVar2, kvoVar4, kvoVar6, b, e4, kvoVar7, b2, sqkVar3);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, cfl cflVar) {
        JSONObject jSONObject = new JSONObject();
        DivText$Image$Accessibility divText$Image$Accessibility = cflVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.b0(yf90Var, jSONObject, "accessibility", divText$Image$Accessibility, jsonParserComponent.T8);
        a.h(yf90Var, jSONObject, "alignment_vertical", cflVar.b, DivTextAlignmentVertical.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "height", cflVar.c, jsonParserComponent.E3);
        a.h(yf90Var, jSONObject, "indexing_direction", cflVar.d, DivText$Image$IndexingDirection.TO_STRING);
        a.g(yf90Var, jSONObject, "preload_required", cflVar.e);
        a.g(yf90Var, jSONObject, "start", cflVar.f);
        a.h(yf90Var, jSONObject, "tint_color", cflVar.g, b.a);
        a.h(yf90Var, jSONObject, "tint_mode", cflVar.h, DivBlendMode.TO_STRING);
        a.h(yf90Var, jSONObject, "url", cflVar.i, b.c);
        wwg.b0(yf90Var, jSONObject, "width", cflVar.j, jsonParserComponent.E3);
        return jSONObject;
    }
}
