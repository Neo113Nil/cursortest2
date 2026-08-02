package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class zwl {
    public static final zwl c = new zwl(true, true);
    public static final zwl d = new zwl(false, false);
    public final boolean a;
    public final boolean b;

    public zwl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zwl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        zwl zwlVar = (zwl) obj;
        return this.a == zwlVar.a && this.b == zwlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("DocumentActionsCallbacksConfig(onFinishEnabled=", ", onAwakeEnabled=", Extension.C_BRAKE, this.a, this.b);
    }
}
