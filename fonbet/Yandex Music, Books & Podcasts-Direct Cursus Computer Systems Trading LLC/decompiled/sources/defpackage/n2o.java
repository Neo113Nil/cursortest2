package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class n2o implements b95 {
    public final int a;

    public n2o(int i) {
        this.a = i;
    }

    @Override // defpackage.b95
    public final long a(Context context) {
        return c3x.f(c95.a.a(context, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2o) && this.a == ((n2o) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("ResourceColorProvider(resId="), this.a, ')');
    }
}
