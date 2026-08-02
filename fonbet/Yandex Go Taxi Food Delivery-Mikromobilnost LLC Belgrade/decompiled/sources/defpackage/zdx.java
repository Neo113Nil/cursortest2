package defpackage;

import kotlin.text.Regex;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class zdx extends m5j0 {
    public final byte[] b;

    public zdx(JSONObject jSONObject) {
        this.b = jSONObject.toString().getBytes(uza.a);
    }

    @Override // defpackage.m5j0
    public final long a() {
        return this.b.length;
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        wg10 wg10Var;
        Regex regex = wg10.e;
        try {
            wg10Var = qje.o("application/json");
        } catch (IllegalArgumentException unused) {
            wg10Var = null;
        }
        if (wg10Var != null) {
            return wg10Var;
        }
        ny61.g("mime type not parsed");
        return null;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        oq6Var.write(this.b);
    }
}
