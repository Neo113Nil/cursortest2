package defpackage;

import com.ybsdk.feature.ui.stat.internal.domain.UiStatPayloadType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class st11 {
    public final String a;
    public final String b;
    public final UiStatPayloadType c;
    public final String d;
    public final String e;

    public st11(String str, String str2, UiStatPayloadType uiStatPayloadType, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = uiStatPayloadType;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st11)) {
            return false;
        }
        st11 st11Var = (st11) obj;
        return jl40.l(this.a, st11Var.a) && this.b.equals(st11Var.b) && this.c == st11Var.c && this.d.equals(st11Var.d) && this.e.equals(st11Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("UiStatPendingEventEntity(sessionId=", this.a, ", eventName=", this.b, ", payloadType=");
        v.append(this.c);
        v.append(", payload=");
        v.append(this.d);
        v.append(", timestamp=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
