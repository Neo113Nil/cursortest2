package defpackage;

/* loaded from: classes4.dex */
public final class wol {
    public final t7g a;
    public final dxb b;
    public final long c;

    public wol(t7g t7gVar, dxb dxbVar, long j) {
        this.a = t7gVar;
        this.b = dxbVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wol)) {
            return false;
        }
        wol wolVar = (wol) obj;
        return this.a.equals(wolVar.a) && this.b == wolVar.b && this.c == wolVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WantPlayTrackData(playableId=");
        sb.append(this.a);
        sb.append(", expectedQuality=");
        sb.append(this.b);
        sb.append(", playableStartTime=");
        return hrg.m(this.c, ")", sb);
    }
}
