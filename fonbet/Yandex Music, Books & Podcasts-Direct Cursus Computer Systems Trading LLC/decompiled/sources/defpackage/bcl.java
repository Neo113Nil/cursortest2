package defpackage;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class bcl implements Serializable {
    public final long a;
    public final int b;

    public bcl(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!bcl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bcl bclVar = (bcl) obj;
        return this.a == bclVar.a && this.b == bclVar.b;
    }

    public final int hashCode() {
        return (Long.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Position(currentPosition=");
        sb.append(this.a);
        sb.append(", currentWindowIndex=");
        return vz1.r(sb, this.b, ')');
    }
}
