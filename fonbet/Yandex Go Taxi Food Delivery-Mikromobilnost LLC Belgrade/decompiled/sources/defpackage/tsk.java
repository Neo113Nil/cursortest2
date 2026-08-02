package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.v0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class tsk implements zsq0, nyi {
    public final JsonParserComponent a;

    public tsk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final rsk a(yf90 yf90Var, JSONObject jSONObject) {
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        z3k z3kVar = v0.i;
        kvo kvoVar = v0.a;
        ?? e = a.e(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, z3kVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        qkj qkjVar = v0.f;
        tls tlsVar2 = DivAlignmentHorizontal.FROM_STRING;
        kvo kvoVar3 = v0.b;
        kbs kbsVar = q5z.b;
        Expression e2 = a.e(yf90Var, jSONObject, "content_alignment_horizontal", qkjVar, tlsVar2, kbsVar, kvoVar3);
        if (e2 == null) {
            e2 = kvoVar3;
        }
        qkj qkjVar2 = v0.g;
        tls tlsVar3 = DivAlignmentVertical.FROM_STRING;
        kvo kvoVar4 = v0.c;
        Expression e3 = a.e(yf90Var, jSONObject, "content_alignment_vertical", qkjVar2, tlsVar3, kbsVar, kvoVar4);
        if (e3 == null) {
            e3 = kvoVar4;
        }
        List O = wwg.O(yf90Var, jSONObject, "filters", this.a.s3);
        Expression b = a.b(yf90Var, jSONObject, "image_url", wm11.e, b.e, kbsVar);
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar5 = v0.d;
        ?? e4 = a.e(yf90Var, jSONObject, "preload_required", wmsVar, tlsVar4, kbsVar, kvoVar5);
        kvo kvoVar6 = e4 == 0 ? kvoVar5 : e4;
        qkj qkjVar3 = v0.h;
        tls tlsVar5 = DivImageScale.FROM_STRING;
        kvo kvoVar7 = v0.e;
        ?? e5 = a.e(yf90Var, jSONObject, "scale", qkjVar3, tlsVar5, kbsVar, kvoVar7);
        return new rsk(kvoVar2, e2, e3, O, b, kvoVar6, e5 == 0 ? kvoVar7 : e5);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, rsk rskVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, rskVar.a);
        a.h(yf90Var, jSONObject, "content_alignment_horizontal", rskVar.b, DivAlignmentHorizontal.TO_STRING);
        a.h(yf90Var, jSONObject, "content_alignment_vertical", rskVar.c, DivAlignmentVertical.TO_STRING);
        wwg.c0(yf90Var, jSONObject, "filters", rskVar.d, this.a.s3);
        a.h(yf90Var, jSONObject, "image_url", rskVar.e, b.c);
        a.g(yf90Var, jSONObject, "preload_required", rskVar.f);
        a.h(yf90Var, jSONObject, "scale", rskVar.g, DivImageScale.TO_STRING);
        wwg.Z(yf90Var, jSONObject, "type", "image");
        return jSONObject;
    }
}
