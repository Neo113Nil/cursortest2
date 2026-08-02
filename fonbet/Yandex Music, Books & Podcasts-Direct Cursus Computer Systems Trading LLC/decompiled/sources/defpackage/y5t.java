package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y5t implements b6t {
    public final l5t a;
    public final Exception b;
    public final boolean c;

    public y5t(l5t l5tVar, IOException iOException, boolean z) {
        l5tVar.getClass();
        this.a = l5tVar;
        this.b = iOException;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5t)) {
            return false;
        }
        y5t y5tVar = (y5t) obj;
        return this.a == y5tVar.a && Intrinsics.d(this.b, y5tVar.b) && this.c == y5tVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Exception exc = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (exc == null ? 0 : exc.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(entityType=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", isConnected=");
        return ouj.r(sb, this.c, ")");
    }
}
