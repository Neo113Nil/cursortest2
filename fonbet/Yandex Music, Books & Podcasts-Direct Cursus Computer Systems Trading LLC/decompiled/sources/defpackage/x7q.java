package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x7q implements y7q {
    public final k7q a;
    public final l7q b;
    public final boolean c;

    public x7q(k7q k7qVar, l7q l7qVar, boolean z) {
        k7qVar.getClass();
        l7qVar.getClass();
        this.a = k7qVar;
        this.b = l7qVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7q)) {
            return false;
        }
        x7q x7qVar = (x7q) obj;
        return Intrinsics.d(this.a, x7qVar.a) && Intrinsics.d(this.b, x7qVar.b) && this.c == x7qVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preparing(queueDescriptor=");
        sb.append(this.a);
        sb.append(", queueStartInfo=");
        sb.append(this.b);
        sb.append(", playWhenReady=");
        return ouj.r(sb, this.c, ")");
    }
}
