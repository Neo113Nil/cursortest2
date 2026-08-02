package defpackage;

/* loaded from: classes6.dex */
public final class xqr {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public xqr(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xqr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xqr xqrVar = (xqr) obj;
        return this.a == xqrVar.a && this.b == xqrVar.b && this.c == xqrVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(false) * 31, 31, this.a), 31, false), 31, false), 31, true), 31, false), 31, false), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SupplementalDelegateProperties(releaseTimeoutMs=null, expDoNotRecreateWrapper=false, enableDecoderFallback=");
        sb.append(this.a);
        sb.append(", experimental_enableSurfaceControl=false, eventLoggerEnabled=false, shouldHandleZeroStartPositionAsDefault=true, allowDisabledTrackVariant=false, monitorFrameDrops=false, allowDisabledAudioTrackVariant=");
        sb.append(this.b);
        sb.append(", allowPendingAudioTrackDisabling=");
        return ouj.r(sb, this.c, ", experimentalAllowPreloadWithoutInitCodecs=false)");
    }
}
