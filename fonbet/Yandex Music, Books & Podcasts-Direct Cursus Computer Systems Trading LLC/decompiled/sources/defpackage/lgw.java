package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class lgw extends mgw {
    public final long c;

    public lgw(long j) {
        this.c = j;
    }

    @Override // defpackage.o5g
    public final List B() {
        return null;
    }

    @Override // defpackage.mgw
    public final long T() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lgw) && this.c == ((lgw) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return dfi.e(this.c, "NoRetry(errorCode=", ")");
    }
}
