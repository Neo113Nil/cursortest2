package Y1;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3903a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f3903a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3903a.equals(((c) obj).f3903a);
    }

    public final int hashCode() {
        return this.f3903a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return Wv.i(new StringBuilder("Encoding{name=\""), this.f3903a, "\"}");
    }
}
