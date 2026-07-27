package P2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f2430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2431b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2432c;

    public F(String str, boolean z3) {
        w.e(str);
        this.f2430a = str;
        w.e("com.google.android.gms");
        this.f2431b = "com.google.android.gms";
        this.f2432c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f3 = (F) obj;
        return w.l(this.f2430a, f3.f2430a) && w.l(this.f2431b, f3.f2431b) && w.l(null, null) && this.f2432c == f3.f2432c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2430a, this.f2431b, null, 4225, Boolean.valueOf(this.f2432c)});
    }

    public final String toString() {
        String str = this.f2430a;
        if (str != null) {
            return str;
        }
        w.h(null);
        throw null;
    }
}
