package defpackage;

import com.yandex.messaging.PushPriority;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class y9i0 {
    public final String a;
    public final String b;
    public final PushPriority c;
    public final PushPriority d;

    public y9i0(String str, String str2, PushPriority pushPriority, PushPriority pushPriority2) {
        this.a = str;
        this.b = str2;
        this.c = pushPriority;
        this.d = pushPriority2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9i0)) {
            return false;
        }
        y9i0 y9i0Var = (y9i0) obj;
        return this.a.equals(y9i0Var.a) && jl40.l(this.b, y9i0Var.b) && this.c == y9i0Var.c && this.d == y9i0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RawPushData(messengerData=", this.a, ", xivaData=", this.b, ", priority=");
        v.append(this.c);
        v.append(", originalPriority=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
