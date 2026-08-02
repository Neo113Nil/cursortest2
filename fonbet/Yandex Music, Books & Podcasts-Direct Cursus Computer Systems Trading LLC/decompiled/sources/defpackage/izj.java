package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class izj {
    public final long a;
    public final q0k b;

    public izj() {
        long h = c3x.h(4284900966L);
        q0k a = a.a(0.0f, 0.0f, 3);
        this.a = h;
        this.b = a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!izj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        izj izjVar = (izj) obj;
        return d85.c(this.a, izjVar.a) && Intrinsics.d(this.b, izjVar.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        dfi.q(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
