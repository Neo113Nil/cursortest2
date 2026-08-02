package defpackage;

/* loaded from: classes4.dex */
public final class t8n {
    public final ges a;
    public final ges b;
    public final long c;

    public t8n(ges gesVar, ges gesVar2, long j) {
        this.a = gesVar;
        this.b = gesVar2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8n)) {
            return false;
        }
        t8n t8nVar = (t8n) obj;
        return this.a.equals(t8nVar.a) && this.b.equals(t8nVar.b) && d85.c(this.c, t8nVar.c);
    }

    public final int hashCode() {
        int d = tlm.d(this.b, this.a.hashCode() * 31, 31);
        int i = d85.o;
        met metVar = net.b;
        return ((Long.hashCode(this.c) + d) * 31) + 1656453233;
    }

    public final String toString() {
        String i = d85.i(this.c);
        StringBuilder sb = new StringBuilder("QueueCarouselConfig(artistTitle=");
        sb.append(this.a);
        sb.append(", backgroundTitle=");
        sb.append(this.b);
        sb.append(", placeholderBgColor=");
        return su4.o(sb, i, ", noCoverPlaceholder=https://avatars.mds.yandex.net/get-music-misc/29541/img.69a1a762f5e70a2c205f855f/%%)");
    }
}
