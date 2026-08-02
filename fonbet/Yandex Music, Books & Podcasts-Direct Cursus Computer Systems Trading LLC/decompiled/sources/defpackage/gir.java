package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class gir extends hdg {
    public final String d;
    public final JSONArray e;

    public gir(String str, JSONArray jSONArray) {
        this.d = str;
        this.e = jSONArray;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gir)) {
            return false;
        }
        gir girVar = (gir) obj;
        return Intrinsics.d(this.d, girVar.d) && Intrinsics.d(this.e, girVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "ArrayStoredValue(name=" + this.d + ", value=" + this.e + ')';
    }
}
