package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bgr implements vwt {
    public final Object a;

    public bgr(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.vwt
    public final Object a(a aVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bgr) && Intrinsics.d(this.a, ((bgr) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f1d.j(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
