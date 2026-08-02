package defpackage;

import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class zjk extends n15 {
    public final ArrayList A;
    public final String B;
    public final xjg C;
    public final r9l D;
    public final rbh E;
    public final r9l F;
    public final String x;
    public final String y;
    public final ArrayList z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:(2:41|42)|43|(1:45)(2:65|(1:67)(1:68))|46|47|(7:49|50|51|52|(2:54|55)|57|58)|62|50|51|52|(0)|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r3.size() < 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        r0.e(r2);
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103 A[Catch: JSONException -> 0x010a, TRY_LEAVE, TryCatch #2 {JSONException -> 0x010a, blocks: (B:52:0x00fb, B:54:0x0103), top: B:51:0x00fb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zjk(JSONObject jSONObject) {
        super(jSONObject, r0);
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        xjg xjgVar;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        quz quzVar = quz.c;
        rbh rbhVar = null;
        try {
            str = b4x.m("alignment_horizontal", jSONObject);
        } catch (JSONException e) {
            quzVar.e(e);
            str = null;
        }
        if ("left".equals(str)) {
            this.x = "left";
        } else if ("center".equals(str)) {
            this.x = "center";
        } else if ("right".equals(str)) {
            this.x = "right";
        } else {
            this.x = "left";
        }
        try {
            str2 = b4x.m("alignment_vertical", jSONObject);
        } catch (JSONException e2) {
            quzVar.e(e2);
            str2 = null;
        }
        if ("top".equals(str2)) {
            this.y = "top";
        } else if ("center".equals(str2)) {
            this.y = "center";
        } else if ("bottom".equals(str2)) {
            this.y = "bottom";
        } else {
            this.y = "top";
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(C0553n3.g);
            arrayList = optJSONArray != null ? lfk.a(optJSONArray) : null;
            if (arrayList != null) {
            }
        } catch (JSONException e3) {
            quzVar.e(e3);
        }
        this.z = arrayList;
        JSONArray a = b4x.a("children", jSONObject);
        int length = a.length();
        ArrayList arrayList2 = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject optJSONObject3 = a.optJSONObject(i);
                if (optJSONObject3 != null) {
                    arrayList2.add(new yjk(optJSONObject3));
                }
            } catch (JSONException e4) {
                quzVar.e(e4);
            }
        }
        this.A = arrayList2;
        if (arrayList2.size() >= 1) {
            z3k.c("children does not meet condition children.size() >= 1");
            throw null;
        }
        try {
            str3 = b4x.m("direction", jSONObject);
        } catch (JSONException e5) {
            quzVar.e(e5);
            str3 = null;
        }
        if ("vertical".equals(str3)) {
            this.B = "vertical";
        } else if ("horizontal".equals(str3)) {
            this.B = "horizontal";
        } else {
            this.B = "vertical";
        }
        try {
            optJSONObject2 = jSONObject.optJSONObject("frame");
        } catch (JSONException e6) {
            quzVar.e(e6);
        }
        if (optJSONObject2 != null) {
            xjgVar = new xjg(optJSONObject2, 22);
            this.C = xjgVar;
            this.D = new r9l(b4x.b("height", jSONObject), 0);
            optJSONObject = jSONObject.optJSONObject("padding_modifier");
            if (optJSONObject != null) {
                rbhVar = new rbh(optJSONObject, quzVar);
            }
            this.E = rbhVar;
            this.F = new r9l(b4x.b("width", jSONObject), 0);
            return;
        }
        xjgVar = null;
        this.C = xjgVar;
        this.D = new r9l(b4x.b("height", jSONObject), 0);
        optJSONObject = jSONObject.optJSONObject("padding_modifier");
        if (optJSONObject != null) {
        }
        this.E = rbhVar;
        this.F = new r9l(b4x.b("width", jSONObject), 0);
        return;
        arrayList = null;
        this.z = arrayList;
        JSONArray a2 = b4x.a("children", jSONObject);
        int length2 = a2.length();
        ArrayList arrayList22 = new ArrayList(length2);
        while (i < length2) {
        }
        this.A = arrayList22;
        if (arrayList22.size() >= 1) {
        }
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(this.x, "alignmentHorizontal");
        tjz0Var.a(this.y, "alignmentVertical");
        tjz0Var.a(this.z, C0553n3.g);
        tjz0Var.a(this.A, "children");
        tjz0Var.a(this.B, "direction");
        tjz0Var.a(this.C, "frame");
        tjz0Var.a(this.D, "height");
        tjz0Var.a(this.E, "paddingModifier");
        tjz0Var.a(this.F, "width");
        return sb.toString();
    }
}
