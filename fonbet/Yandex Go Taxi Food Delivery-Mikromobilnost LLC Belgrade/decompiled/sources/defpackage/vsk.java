package defpackage;

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
public final class vsk implements qfy0 {
    public final JsonParserComponent a;

    public vsk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rsk a(yf90 yf90Var, wsk wskVar, JSONObject jSONObject) {
        exq exqVar = wskVar.a;
        sms smsVar = wm11.d;
        tls tlsVar = b.g;
        z3k z3kVar = v0.i;
        kvo kvoVar = v0.a;
        ?? n = xcx.n(yf90Var, exqVar, jSONObject, CaretView.ALPHA_PROPERTY, smsVar, tlsVar, z3kVar, kvoVar);
        if (n != 0) {
            kvoVar = n;
        }
        exq exqVar2 = wskVar.b;
        qkj qkjVar = v0.f;
        tls tlsVar2 = DivAlignmentHorizontal.FROM_STRING;
        kvo kvoVar2 = v0.b;
        Expression o = xcx.o(yf90Var, exqVar2, jSONObject, "content_alignment_horizontal", qkjVar, tlsVar2, kvoVar2);
        if (o == null) {
            o = kvoVar2;
        }
        exq exqVar3 = wskVar.c;
        qkj qkjVar2 = v0.g;
        tls tlsVar3 = DivAlignmentVertical.FROM_STRING;
        kvo kvoVar3 = v0.c;
        Expression o2 = xcx.o(yf90Var, exqVar3, jSONObject, "content_alignment_vertical", qkjVar2, tlsVar3, kvoVar3);
        if (o2 == null) {
            o2 = kvoVar3;
        }
        exq exqVar4 = wskVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        List s = xcx.s(yf90Var, exqVar4, jSONObject, "filters", jsonParserComponent.u3, jsonParserComponent.s3);
        Expression d = xcx.d(yf90Var, wskVar.e, jSONObject, "image_url", wm11.e, b.e);
        exq exqVar5 = wskVar.f;
        wms wmsVar = wm11.a;
        tls tlsVar4 = b.f;
        kvo kvoVar4 = v0.d;
        ?? o3 = xcx.o(yf90Var, exqVar5, jSONObject, "preload_required", wmsVar, tlsVar4, kvoVar4);
        kvo kvoVar5 = o3 == 0 ? kvoVar4 : o3;
        exq exqVar6 = wskVar.g;
        qkj qkjVar3 = v0.h;
        tls tlsVar5 = DivImageScale.FROM_STRING;
        kvo kvoVar6 = v0.e;
        ?? o4 = xcx.o(yf90Var, exqVar6, jSONObject, "scale", qkjVar3, tlsVar5, kvoVar6);
        if (o4 != 0) {
            kvoVar6 = o4;
        }
        return new rsk(kvoVar, o, o2, s, d, kvoVar5, kvoVar6);
    }
}
