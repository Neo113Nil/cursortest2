package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nzh {
    public final String a;
    public final String b;

    public nzh(JSONObject jSONObject) {
        String string = jSONObject.getString(Constants.KEY_MESSAGE);
        string.getClass();
        String string2 = jSONObject.getString("serializeId");
        string2.getClass();
        this.a = string;
        this.b = string2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzh)) {
            return false;
        }
        nzh nzhVar = (nzh) obj;
        return Intrinsics.d(this.a, nzhVar.a) && Intrinsics.d(this.b, nzhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("MessageError(message=", this.a, ", serializeId=", this.b, ")");
    }
}
