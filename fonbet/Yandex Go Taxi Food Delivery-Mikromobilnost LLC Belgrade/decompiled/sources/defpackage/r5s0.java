package defpackage;

import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r5s0 implements qas0 {
    public final CheckType a;
    public final ux5 b;

    public r5s0(CheckType checkType, ux5 ux5Var) {
        this.a = checkType;
        this.b = ux5Var;
    }

    public final ux5 a() {
        return this.b;
    }

    public final CheckType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5s0)) {
            return false;
        }
        r5s0 r5s0Var = (r5s0) obj;
        return this.a == r5s0Var.a && jl40.l(this.b, r5s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowBiometric(type=" + this.a + ", biometricHelper=" + this.b + Extension.C_BRAKE;
    }
}
