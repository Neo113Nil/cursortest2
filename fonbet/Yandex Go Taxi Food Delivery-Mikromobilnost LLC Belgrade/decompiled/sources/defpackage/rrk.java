package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rrk extends n15 {
    public final n0l A;
    public final n0l B;
    public final apf C;
    public final x3k x;
    public final ArrayList y;
    public final n0l z;

    /* JADX WARN: Can't wrap try/catch for region: R(20:(2:25|26)|(18:28|(1:30)(1:64)|31|32|(13:34|35|(1:37)(1:59)|38|39|(7:41|(1:43)(1:54)|44|45|(2:47|48)|50|51)|56|(0)(0)|44|45|(0)|50|51)|61|35|(0)(0)|38|39|(0)|56|(0)(0)|44|45|(0)|50|51)|66|(0)(0)|31|32|(0)|61|35|(0)(0)|38|39|(0)|56|(0)(0)|44|45|(0)|50|51) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:25|26|(18:28|(1:30)(1:64)|31|32|(13:34|35|(1:37)(1:59)|38|39|(7:41|(1:43)(1:54)|44|45|(2:47|48)|50|51)|56|(0)(0)|44|45|(0)|50|51)|61|35|(0)(0)|38|39|(0)|56|(0)(0)|44|45|(0)|50|51)|66|(0)(0)|31|32|(0)|61|35|(0)(0)|38|39|(0)|56|(0)(0)|44|45|(0)|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        r0.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a6, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a7, code lost:
    
        r0.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0080, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0081, code lost:
    
        r0.e(r2);
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: JSONException -> 0x0080, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0080, blocks: (B:32:0x0072, B:34:0x007a), top: B:31:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[Catch: JSONException -> 0x00a6, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00a6, blocks: (B:39:0x0098, B:41:0x00a0), top: B:38:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[Catch: JSONException -> 0x00cb, TRY_LEAVE, TryCatch #3 {JSONException -> 0x00cb, blocks: (B:45:0x00bc, B:47:0x00c4), top: B:44:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rrk(JSONObject jSONObject) {
        super(jSONObject, r0);
        x3k x3kVar;
        int length;
        ArrayList arrayList;
        int i;
        n0l n0lVar;
        n0l n0lVar2;
        n0l n0lVar3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        quz quzVar = quz.c;
        apf apfVar = null;
        try {
            optJSONObject5 = jSONObject.optJSONObject("action");
        } catch (JSONException e) {
            quzVar.e(e);
        }
        if (optJSONObject5 != null) {
            x3kVar = new x3k(optJSONObject5, quzVar);
            this.x = x3kVar;
            JSONArray a = b4x.a("items", jSONObject);
            length = a.length();
            arrayList = new ArrayList(length);
            for (i = 0; i < length; i++) {
                try {
                    JSONObject optJSONObject6 = a.optJSONObject(i);
                    if (optJSONObject6 != null) {
                        arrayList.add(new zjk(optJSONObject6));
                    }
                } catch (JSONException e2) {
                    quzVar.e(e2);
                }
            }
            this.y = arrayList;
            if (arrayList.size() >= 1) {
                z3k.c("items does not meet condition items.size() >= 1");
                throw null;
            }
            try {
                optJSONObject4 = jSONObject.optJSONObject("padding_between_items");
            } catch (JSONException e3) {
                quzVar.e(e3);
            }
            if (optJSONObject4 != null) {
                n0lVar = new n0l(optJSONObject4);
                if (n0lVar != null) {
                    this.z = new n0l(new JSONObject("{ \"value\": 8, \"type\": \"numeric\" }"));
                } else {
                    this.z = n0lVar;
                }
                optJSONObject3 = jSONObject.optJSONObject("padding_bottom");
                if (optJSONObject3 != null) {
                    n0lVar2 = new n0l(optJSONObject3);
                    if (n0lVar2 == null) {
                        this.A = new n0l(new JSONObject("{ \"value\": 0, \"type\": \"numeric\" }"));
                    } else {
                        this.A = n0lVar2;
                    }
                    optJSONObject2 = jSONObject.optJSONObject("padding_top");
                    if (optJSONObject2 != null) {
                        n0lVar3 = new n0l(optJSONObject2);
                        if (n0lVar3 != null) {
                            this.B = new n0l(new JSONObject("{ \"value\": 0, \"type\": \"numeric\" }"));
                        } else {
                            this.B = n0lVar3;
                        }
                        optJSONObject = jSONObject.optJSONObject("tail");
                        if (optJSONObject != null) {
                            apfVar = new apf(optJSONObject);
                        }
                        this.C = apfVar;
                        return;
                    }
                    n0lVar3 = null;
                    if (n0lVar3 != null) {
                    }
                    optJSONObject = jSONObject.optJSONObject("tail");
                    if (optJSONObject != null) {
                    }
                    this.C = apfVar;
                    return;
                }
                n0lVar2 = null;
                if (n0lVar2 == null) {
                }
                optJSONObject2 = jSONObject.optJSONObject("padding_top");
                if (optJSONObject2 != null) {
                }
                n0lVar3 = null;
                if (n0lVar3 != null) {
                }
                optJSONObject = jSONObject.optJSONObject("tail");
                if (optJSONObject != null) {
                }
                this.C = apfVar;
                return;
            }
            n0lVar = null;
            if (n0lVar != null) {
            }
            optJSONObject3 = jSONObject.optJSONObject("padding_bottom");
            if (optJSONObject3 != null) {
            }
            n0lVar2 = null;
            if (n0lVar2 == null) {
            }
            optJSONObject2 = jSONObject.optJSONObject("padding_top");
            if (optJSONObject2 != null) {
            }
            n0lVar3 = null;
            if (n0lVar3 != null) {
            }
            optJSONObject = jSONObject.optJSONObject("tail");
            if (optJSONObject != null) {
            }
            this.C = apfVar;
            return;
        }
        x3kVar = null;
        this.x = x3kVar;
        JSONArray a2 = b4x.a("items", jSONObject);
        length = a2.length();
        arrayList = new ArrayList(length);
        while (i < length) {
        }
        this.y = arrayList;
        if (arrayList.size() >= 1) {
        }
    }

    @Override // defpackage.n15
    public final String toString() {
        tjz0 tjz0Var = new tjz0();
        String n15Var = super.toString();
        StringBuilder sb = tjz0Var.a;
        sb.append(n15Var);
        tjz0Var.a(this.x, "action");
        tjz0Var.a(this.y, "items");
        tjz0Var.a(this.z, "paddingBetweenItems");
        tjz0Var.a(this.A, "paddingBottom");
        tjz0Var.a(this.B, "paddingTop");
        tjz0Var.a(this.C, "tail");
        return sb.toString();
    }
}
