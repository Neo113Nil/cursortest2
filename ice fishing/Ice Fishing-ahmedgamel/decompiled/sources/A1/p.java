package A1;

import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f77a;

    public p(String str) {
        this.f77a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f77a.equals(((p) obj).f77a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f77a.hashCode();
    }

    public final String toString() {
        return Wv.i(new StringBuilder("StringHeaderFactory{value='"), this.f77a, "'}");
    }
}
