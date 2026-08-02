package defpackage;

/* loaded from: classes6.dex */
public final class dw1 {
    public final boolean a;

    public dw1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!dw1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a == ((dw1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("AudioDelegateConfig(audioBecomingNoisy=false, automaticallyHandleAudioFocus="), this.a, ')');
    }
}
