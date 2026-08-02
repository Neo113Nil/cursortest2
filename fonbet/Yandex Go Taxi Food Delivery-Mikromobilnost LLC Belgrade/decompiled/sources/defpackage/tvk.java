package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class tvk implements qfy0 {
    public final JsonParserComponent a;

    public tvk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pvk a(yf90 yf90Var, xvk xvkVar, JSONObject jSONObject) {
        kbs kbsVar = q5z.b;
        abl0 abl0Var = q5z.c;
        boolean z = xvkVar instanceof vvk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return new nvk(((lqk) jsonParserComponent.A3.getValue()).a(yf90Var, ((vvk) xvkVar).a, jSONObject));
        }
        if (xvkVar instanceof uvk) {
            alk alkVar = (alk) jsonParserComponent.J2.getValue();
            blk blkVar = ((uvk) xvkVar).a;
            alkVar.getClass();
            return new mvk(new xkk(xcx.k(yf90Var, blkVar.a, jSONObject, "locale", wm11.c), (String) xcx.a(blkVar.b, jSONObject, "raw_text_variable", abl0Var, kbsVar)));
        }
        if (!(xvkVar instanceof wvk)) {
            w511.b();
            return null;
        }
        v3l v3lVar = (v3l) jsonParserComponent.Z5.getValue();
        w3l w3lVar = ((wvk) xvkVar).a;
        v3lVar.getClass();
        return new ovk(new s3l((String) xcx.a(w3lVar.a, jSONObject, "raw_text_variable", abl0Var, kbsVar)));
    }
}
