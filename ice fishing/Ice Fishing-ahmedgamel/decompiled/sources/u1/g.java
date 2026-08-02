package u1;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final G3.e f41006e = new G3.e(26);

    /* renamed from: a, reason: collision with root package name */
    public final Object f41007a;

    /* renamed from: b, reason: collision with root package name */
    public final f f41008b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41009c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f41010d;

    public g(String str, Object obj, f fVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f41009c = str;
        this.f41007a = obj;
        this.f41008b = fVar;
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f41006e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f41009c.equals(((g) obj).f41009c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41009c.hashCode();
    }

    public final String toString() {
        return Wv.i(new StringBuilder("Option{key='"), this.f41009c, "'}");
    }
}
