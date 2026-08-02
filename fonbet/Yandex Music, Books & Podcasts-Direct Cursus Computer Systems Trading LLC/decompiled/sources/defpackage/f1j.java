package defpackage;

import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1j {
    public static final String b = jsg.n("NetworkRequestCompat");
    public final Object a;

    public f1j(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1j) && Intrinsics.d(this.a, ((f1j) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f1d.j(new StringBuilder("NetworkRequestCompat(wrapped="), this.a, ')');
    }
}
