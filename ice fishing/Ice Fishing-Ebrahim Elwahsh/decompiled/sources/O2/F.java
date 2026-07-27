package O2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2359b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2360c;

    public F(String str, boolean z8) {
        w.e(str);
        this.f2358a = str;
        w.e("com.google.android.gms");
        this.f2359b = "com.google.android.gms";
        this.f2360c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return w.l(this.f2358a, f6.f2358a) && w.l(this.f2359b, f6.f2359b) && w.l(null, null) && this.f2360c == f6.f2360c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2358a, this.f2359b, null, 4225, Boolean.valueOf(this.f2360c)});
    }

    public final String toString() {
        String str = this.f2358a;
        if (str != null) {
            return str;
        }
        w.h(null);
        throw null;
    }
}
