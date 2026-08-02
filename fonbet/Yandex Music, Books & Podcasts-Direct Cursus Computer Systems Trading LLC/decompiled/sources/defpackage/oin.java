package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oin implements pin {
    public final String a;
    public final JSONObject b;

    public oin(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oin)) {
            return false;
        }
        oin oinVar = (oin) obj;
        return Intrinsics.d(this.a, oinVar.a) && Intrinsics.d(this.b, oinVar.b);
    }

    @Override // defpackage.pin
    public final JSONObject getData() {
        return this.b;
    }

    @Override // defpackage.pin
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(id=" + this.a + ", data=" + this.b + ')';
    }
}
