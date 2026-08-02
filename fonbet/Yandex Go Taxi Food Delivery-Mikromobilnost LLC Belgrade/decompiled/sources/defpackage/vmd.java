package defpackage;

/* loaded from: classes2.dex */
public final class vmd {
    public final long a;
    public final long b;

    public vmd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmd)) {
            return false;
        }
        vmd vmdVar = (vmd) obj;
        return this.a == vmdVar.a && this.b == vmdVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetPollingParameters1(initStartMessageTimeoutMillis=");
        sb.append(this.a);
        sb.append(", loadMessageTimeoutMillis=");
        return b64.o(sb, this.b, ')');
    }
}
