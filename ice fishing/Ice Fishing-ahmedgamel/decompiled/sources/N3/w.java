package N3;

import android.os.IBinder;
import com.google.android.gms.internal.ads.Wv;
import java.util.HashMap;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f2024a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2025b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2026c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2027d;

    public w(String str, String str2, HashMap hashMap, IBinder iBinder) {
        this.f2024a = str;
        this.f2025b = str2;
        this.f2026c = hashMap;
        this.f2027d = iBinder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f2024a.equals(wVar.f2024a) || !this.f2025b.equals(wVar.f2025b) || !this.f2026c.equals(wVar.f2026c)) {
            return false;
        }
        IBinder iBinder = wVar.f2027d;
        IBinder iBinder2 = this.f2027d;
        return iBinder2 == null ? iBinder == null : iBinder2.equals(iBinder);
    }

    public final int hashCode() {
        int hashCode = ((((this.f2024a.hashCode() ^ 1000003) * 1000003) ^ this.f2025b.hashCode()) * 1000003) ^ this.f2026c.hashCode();
        IBinder iBinder = this.f2027d;
        return (hashCode * 1000003) ^ (iBinder == null ? 0 : iBinder.hashCode());
    }

    public final String toString() {
        String obj = this.f2026c.toString();
        String valueOf = String.valueOf(this.f2027d);
        StringBuilder sb = new StringBuilder("HsdpPrewarmRequest{targetAppPackageName=");
        sb.append(this.f2024a);
        sb.append(", referrer=");
        AbstractC5128c.h(sb, this.f2025b, ", extraQueryParams=", obj, ", windowToken=");
        return Wv.i(sb, valueOf, "}");
    }
}
