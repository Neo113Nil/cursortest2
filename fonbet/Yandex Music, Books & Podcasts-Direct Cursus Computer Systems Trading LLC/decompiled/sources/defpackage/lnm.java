package defpackage;

/* loaded from: classes6.dex */
public final class lnm {
    public final ssm a;

    public lnm(ssm ssmVar) {
        this.a = ssmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lnm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((lnm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + tlm.c(1900L, tlm.c(6000L, Long.hashCode(3000L) * 31, 31), 31);
    }

    public final String toString() {
        return "PreloadPrioritySettings(preloadPriorityTaskManager=" + this.a + ", criticalBufferSizeMs=3000, minBufferSizeMsToWatchDifferenceBetweenBuffer=6000, differenceBetweenBufferSizeMs=1900)";
    }
}
