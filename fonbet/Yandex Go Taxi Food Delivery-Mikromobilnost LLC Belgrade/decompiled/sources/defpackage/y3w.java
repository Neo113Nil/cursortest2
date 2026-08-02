package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class y3w {
    public final JSONObject a;
    public final long b;

    public y3w(JSONObject jSONObject, long j) {
        this.a = jSONObject;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3w)) {
            return false;
        }
        y3w y3wVar = (y3w) obj;
        return this.a.equals(y3wVar.a) && this.b == y3wVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstructionItem(jsonObject=" + this.a + ", duration=" + this.b + Extension.C_BRAKE;
    }
}
