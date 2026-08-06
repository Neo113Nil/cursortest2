package defpackage;

/* loaded from: classes.dex */
public final class mg1 implements defpackage.kj {
    public final java.lang.ThreadLocal adDC3e2L;

    public mg1(java.lang.ThreadLocal threadLocal) {
        this.adDC3e2L = threadLocal;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.mg1) && defpackage.x70.QoRHpC4k(this.adDC3e2L, ((defpackage.mg1) obj).adDC3e2L);
    }

    public final int hashCode() {
        return this.adDC3e2L.hashCode();
    }

    public final java.lang.String toString() {
        return "ThreadLocalKey(threadLocal=" + this.adDC3e2L + ')';
    }
}
