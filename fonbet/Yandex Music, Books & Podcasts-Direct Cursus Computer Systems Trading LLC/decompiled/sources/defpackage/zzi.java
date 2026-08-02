package defpackage;

/* loaded from: classes4.dex */
public final class zzi {
    public static final zzi d = new zzi(false, yzi.d, -1);
    public final boolean a;
    public final yzi b;
    public final int c;

    static {
        yzi yziVar = yzi.a;
    }

    public zzi(boolean z, yzi yziVar, int i) {
        this.a = z;
        this.b = yziVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return this.a == zziVar.a && this.b == zziVar.b && this.c == zziVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String a = h6r.a(this.c);
        StringBuilder sb = new StringBuilder("NetworkInfo(internetAvailable=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", downstreamBandwidthKbps=");
        return su4.o(sb, a, ")");
    }
}
