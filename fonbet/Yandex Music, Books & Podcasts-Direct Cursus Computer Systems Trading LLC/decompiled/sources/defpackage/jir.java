package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jir extends hdg {
    public final String d;
    public final JSONObject e;

    public jir(String str, JSONObject jSONObject) {
        this.d = str;
        this.e = jSONObject;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jir)) {
            return false;
        }
        jir jirVar = (jir) obj;
        return Intrinsics.d(this.d, jirVar.d) && Intrinsics.d(this.e, jirVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "DictStoredValue(name=" + this.d + ", value=" + this.e + ')';
    }
}
