package R2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f2751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2752b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2753c;

    public F(String str, boolean z6) {
        w.e(str);
        this.f2751a = str;
        w.e("com.google.android.gms");
        this.f2752b = "com.google.android.gms";
        this.f2753c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f2 = (F) obj;
        return w.l(this.f2751a, f2.f2751a) && w.l(this.f2752b, f2.f2752b) && w.l(null, null) && this.f2753c == f2.f2753c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2751a, this.f2752b, null, 4225, Boolean.valueOf(this.f2753c)});
    }

    public final String toString() {
        String str = this.f2751a;
        if (str != null) {
            return str;
        }
        w.h(null);
        throw null;
    }
}
