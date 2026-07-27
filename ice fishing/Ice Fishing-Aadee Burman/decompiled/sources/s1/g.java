package s1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final M2.i f40449e = new M2.i(23);

    /* renamed from: a, reason: collision with root package name */
    public final Object f40450a;

    /* renamed from: b, reason: collision with root package name */
    public final f f40451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40452c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f40453d;

    public g(String str, Object obj, f fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f40452c = str;
        this.f40450a = obj;
        this.f40451b = fVar;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f40449e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f40452c.equals(((g) obj).f40452c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40452c.hashCode();
    }

    public final String toString() {
        return u1.h.g(new StringBuilder("Option{key='"), this.f40452c, "'}");
    }
}
