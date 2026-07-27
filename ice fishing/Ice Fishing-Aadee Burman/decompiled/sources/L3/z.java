package L3;

import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f1752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1753b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1754c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f1755d;

    public z(String str, String str2, HashMap hashMap, IBinder iBinder) {
        this.f1752a = str;
        this.f1753b = str2;
        this.f1754c = hashMap;
        this.f1755d = iBinder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!this.f1752a.equals(zVar.f1752a) || !this.f1753b.equals(zVar.f1753b) || !this.f1754c.equals(zVar.f1754c)) {
            return false;
        }
        IBinder iBinder = zVar.f1755d;
        IBinder iBinder2 = this.f1755d;
        return iBinder2 == null ? iBinder == null : iBinder2.equals(iBinder);
    }

    public final int hashCode() {
        int hashCode = ((((this.f1752a.hashCode() ^ 1000003) * 1000003) ^ this.f1753b.hashCode()) * 1000003) ^ this.f1754c.hashCode();
        IBinder iBinder = this.f1755d;
        return (hashCode * 1000003) ^ (iBinder == null ? 0 : iBinder.hashCode());
    }

    public final String toString() {
        String obj = this.f1754c.toString();
        String valueOf = String.valueOf(this.f1755d);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.f1752a);
        sb.append(", referrer=");
        u1.h.i(sb, this.f1753b, ", extraQueryParams=", obj, ", windowToken=");
        return u1.h.g(sb, valueOf, "}");
    }
}
