package defpackage;

import com.yandex.go.beginners.safety.name.domain.model.SafetyNameInputScreenState$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uvl0 {
    public final SafetyNameInputScreenState$Type a;
    public final String b;

    public uvl0(SafetyNameInputScreenState$Type safetyNameInputScreenState$Type, String str) {
        this.a = safetyNameInputScreenState$Type;
        this.b = str;
    }

    public static uvl0 a(uvl0 uvl0Var, SafetyNameInputScreenState$Type safetyNameInputScreenState$Type) {
        String str = uvl0Var.b;
        uvl0Var.getClass();
        return new uvl0(safetyNameInputScreenState$Type, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvl0)) {
            return false;
        }
        uvl0 uvl0Var = (uvl0) obj;
        return this.a == uvl0Var.a && jl40.l(this.b, uvl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SafetyNameInputScreenState(screenType=" + this.a + ", inputValue=" + this.b + Extension.C_BRAKE;
    }
}
