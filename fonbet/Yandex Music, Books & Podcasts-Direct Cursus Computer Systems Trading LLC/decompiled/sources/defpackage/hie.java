package defpackage;

import com.connectsdk.device.ConnectableDevice;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hie {
    public final String a;
    public final nzh b;
    public final JSONObject c;
    public final String d;
    public final String e;
    public final String f;

    public hie(JSONObject jSONObject) {
        String string = jSONObject.getString("channelId");
        string.getClass();
        JSONObject B = vnj.B("error", jSONObject);
        nzh nzhVar = B == null ? null : new nzh(B);
        JSONObject B2 = vnj.B("data", jSONObject);
        String string2 = jSONObject.getString(ConnectableDevice.KEY_ID);
        string2.getClass();
        String F = vnj.F("refId", jSONObject);
        String string3 = jSONObject.getString("type");
        string3.getClass();
        this.a = string;
        this.b = nzhVar;
        this.c = B2;
        this.d = string2;
        this.e = F;
        this.f = string3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hie)) {
            return false;
        }
        hie hieVar = (hie) obj;
        return Intrinsics.d(this.a, hieVar.a) && Intrinsics.d(this.b, hieVar.b) && Intrinsics.d(this.c, hieVar.c) && Intrinsics.d(this.d, hieVar.d) && Intrinsics.d(this.e, hieVar.e) && Intrinsics.d(this.f, hieVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nzh nzhVar = this.b;
        int hashCode2 = (hashCode + (nzhVar == null ? 0 : nzhVar.hashCode())) * 31;
        JSONObject jSONObject = this.c;
        int c = k5r.c((hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomingWebMessage(channelId=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", refId=");
        return ouj.q(sb, this.e, ", type=", this.f, ")");
    }
}
