package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uqq0 {
    public final boolean a;
    public final boolean b;

    public uqq0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqq0)) {
            return false;
        }
        uqq0 uqq0Var = (uqq0) obj;
        return this.a == uqq0Var.a && this.b == uqq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("SendingMessagesSettingsState(isStarred=", ", isSilent=", Extension.C_BRAKE, this.a, this.b);
    }

    public uqq0() {
        this(false, false);
    }
}
