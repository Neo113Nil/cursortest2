package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class sfc implements b95 {
    public final long a;

    public sfc(long j) {
        this.a = j;
    }

    @Override // defpackage.b95
    public final long a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfc) && d85.c(this.a, ((sfc) obj).a);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) d85.i(this.a)) + ')';
    }
}
