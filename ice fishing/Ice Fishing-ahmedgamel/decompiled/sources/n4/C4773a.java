package n4;

import com.google.android.gms.internal.ads.Wv;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4773a {

    /* renamed from: a, reason: collision with root package name */
    public final String f39652a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39653b;

    public C4773a(String str, String str2) {
        this.f39652a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f39653b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4773a) {
            C4773a c4773a = (C4773a) obj;
            if (this.f39652a.equals(c4773a.f39652a) && this.f39653b.equals(c4773a.f39653b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39652a.hashCode() ^ 1000003) * 1000003) ^ this.f39653b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f39652a);
        sb.append(", version=");
        return Wv.i(sb, this.f39653b, "}");
    }
}
