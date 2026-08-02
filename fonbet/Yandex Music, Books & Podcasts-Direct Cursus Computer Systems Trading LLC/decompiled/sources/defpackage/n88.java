package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n88 implements drf {
    public final nrf a;
    public final String b;
    public final boolean c;

    public n88(nrf nrfVar, String str, boolean z) {
        nrfVar.getClass();
        this.a = nrfVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n88)) {
            return false;
        }
        n88 n88Var = (n88) obj;
        return Intrinsics.d(this.a, n88Var.a) && Intrinsics.d(this.b, n88Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DislikesBlock(meta=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", hasData=");
        return ouj.r(sb, this.c, ")");
    }
}
