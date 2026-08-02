package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r8r0 {
    public final boolean a;
    public final int b;

    public r8r0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8r0)) {
            return false;
        }
        r8r0 r8r0Var = (r8r0) obj;
        return this.a == r8r0Var.a && this.b == r8r0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SettingsItemUiElement(visible=" + this.a + ", trailResId=" + this.b + Extension.C_BRAKE;
    }
}
