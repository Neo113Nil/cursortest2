package defpackage;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ifj implements Serializable {
    private static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    public ifj(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ifj) {
            return up6.s(this.a, ((ifj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}
