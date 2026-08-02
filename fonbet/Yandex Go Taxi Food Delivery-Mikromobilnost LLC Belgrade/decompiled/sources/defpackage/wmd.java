package defpackage;

/* loaded from: classes2.dex */
public final class wmd {
    public final long a;
    public final long b;

    public wmd(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmd)) {
            return false;
        }
        wmd wmdVar = (wmd) obj;
        return this.a == wmdVar.a && this.b == wmdVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetPollingParameters(initStartMessageTimeoutMillis=");
        sb.append(this.a);
        sb.append(", loadMessageTimeoutMillis=");
        return b64.o(sb, this.b, ')');
    }
}
