package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vi60 {
    public final String a;
    public final Long b;

    public vi60(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final Long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi60)) {
            return false;
        }
        vi60 vi60Var = (vi60) obj;
        return jl40.l(this.a, vi60Var.a) && this.b.equals(vi60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.b(1074119144, 961, this.a);
    }

    public final String toString() {
        return "NotificationParams(id=DeliveryDefaultNotification, text=" + this.a + ", imageTag=null, cancellationTimeMs=" + this.b + Extension.C_BRAKE;
    }
}
