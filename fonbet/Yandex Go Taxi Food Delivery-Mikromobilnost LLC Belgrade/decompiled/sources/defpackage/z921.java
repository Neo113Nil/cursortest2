package defpackage;

import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class z921 {
    public final SimpleIdFormFieldEntity a;
    public final ja21 b;
    public final sb21 c;

    public z921(SimpleIdFormFieldEntity simpleIdFormFieldEntity, ja21 ja21Var, sb21 sb21Var) {
        this.a = simpleIdFormFieldEntity;
        this.b = ja21Var;
        this.c = sb21Var;
    }

    public static z921 a(z921 z921Var, SimpleIdFormFieldEntity simpleIdFormFieldEntity, ja21 ja21Var, sb21 sb21Var, int i) {
        if ((i & 1) != 0) {
            simpleIdFormFieldEntity = z921Var.a;
        }
        if ((i & 2) != 0) {
            ja21Var = z921Var.b;
        }
        if ((i & 4) != 0) {
            sb21Var = z921Var.c;
        }
        z921Var.getClass();
        return new z921(simpleIdFormFieldEntity, ja21Var, sb21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z921)) {
            return false;
        }
        z921 z921Var = (z921) obj;
        return this.a == z921Var.a && jl40.l(this.b, z921Var.b) && this.c.equals(z921Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UpgradeEditState(currentStep=" + this.a + ", form=" + this.b + ", innSuggest=" + this.c + Extension.C_BRAKE;
    }
}
