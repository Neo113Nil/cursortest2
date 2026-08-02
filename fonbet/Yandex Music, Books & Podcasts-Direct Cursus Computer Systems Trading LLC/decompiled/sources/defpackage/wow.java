package defpackage;

/* loaded from: classes4.dex */
public final class wow extends zow {
    public final boolean a;
    public final long b;

    public wow(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.zow
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wow)) {
            return false;
        }
        wow wowVar = (wow) obj;
        return this.a == wowVar.a && this.b == wowVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vz1.q("Play(", ")", this.a);
    }
}
