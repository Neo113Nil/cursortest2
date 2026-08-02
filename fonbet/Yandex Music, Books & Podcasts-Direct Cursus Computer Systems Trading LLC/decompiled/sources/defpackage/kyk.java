package defpackage;

/* loaded from: classes6.dex */
public final class kyk {
    public final boolean a;
    public final boolean b;

    public kyk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyk)) {
            return false;
        }
        kyk kykVar = (kyk) obj;
        return this.a == kykVar.a && this.b == kykVar.b;
    }

    public final int hashCode() {
        return k5r.e(k5r.e(tlm.c(0L, Boolean.hashCode(false) * 31, 31), 31, this.a), 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackConfig(autoplay=false, startPosition=0, loopPlayback=");
        sb.append(this.a);
        sb.append(", isMuted=");
        return ouj.r(sb, this.b, ", additionalParameters=null)");
    }
}
