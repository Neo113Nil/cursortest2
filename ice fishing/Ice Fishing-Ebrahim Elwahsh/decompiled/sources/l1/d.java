package l1;

import android.text.TextUtils;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f39030a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39031b;

    public d(String str, String str2) {
        this.f39030a = str;
        this.f39031b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (TextUtils.equals(this.f39030a, dVar.f39030a) && TextUtils.equals(this.f39031b, dVar.f39031b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39031b.hashCode() + (this.f39030a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f39030a);
        sb.append(",value=");
        return AbstractC5051n.g(sb, this.f39031b, "]");
    }
}
