package l1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f38888a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38889b;

    public d(String str, String str2) {
        this.f38888a = str;
        this.f38889b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (TextUtils.equals(this.f38888a, dVar.f38888a) && TextUtils.equals(this.f38889b, dVar.f38889b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f38889b.hashCode() + (this.f38888a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f38888a);
        sb.append(",value=");
        return u1.h.g(sb, this.f38889b, "]");
    }
}
