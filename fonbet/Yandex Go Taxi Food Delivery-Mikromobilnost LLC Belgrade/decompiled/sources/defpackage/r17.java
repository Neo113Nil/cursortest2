package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class r17 {
    public final boolean a;
    public final float b;

    public r17(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r17)) {
            return false;
        }
        r17 r17Var = (r17) obj;
        return this.a == r17Var.a && Float.compare(this.b, r17Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ButtonPressState(isPressed=" + this.a + ", scale=" + this.b + Extension.C_BRAKE;
    }
}
