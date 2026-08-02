package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nzi {
    public final boolean a;
    public final dko b;
    public final List c;

    public nzi(boolean z, dko dkoVar, List list) {
        list.getClass();
        this.a = z;
        this.b = dkoVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzi)) {
            return false;
        }
        nzi nziVar = (nzi) obj;
        return this.a == nziVar.a && this.b.equals(nziVar.b) && Intrinsics.d(this.c, nziVar.c);
    }

    public final int hashCode() {
        return k5r.d((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 961, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConfig(isConsoleLoggingEnabled=");
        sb.append(this.a);
        sb.append(", sslContextCreator=");
        sb.append(this.b);
        sb.append(", interceptors=");
        return vz1.u(sb, this.c, ", stethoProxy=null, dns=null)");
    }
}
