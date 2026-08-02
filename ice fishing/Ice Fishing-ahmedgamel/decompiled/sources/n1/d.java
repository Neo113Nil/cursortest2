package n1;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f39626a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39627b;

    public d(String str, String str2) {
        this.f39626a = str;
        this.f39627b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (TextUtils.equals(this.f39626a, dVar.f39626a) && TextUtils.equals(this.f39627b, dVar.f39627b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39627b.hashCode() + (this.f39626a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f39626a);
        sb.append(",value=");
        return Wv.i(sb, this.f39627b, "]");
    }
}
