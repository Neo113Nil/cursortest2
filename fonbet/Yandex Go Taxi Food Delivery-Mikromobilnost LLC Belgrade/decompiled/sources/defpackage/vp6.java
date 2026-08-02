package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vp6 {
    public final sp6 a;
    public final String b;
    public final String c;
    public final q4s d;
    public final ActionButtonEntity e;

    public vp6(sp6 sp6Var, String str, String str2, q4s q4sVar, ActionButtonEntity actionButtonEntity) {
        this.a = sp6Var;
        this.b = str;
        this.c = str2;
        this.d = q4sVar;
        this.e = actionButtonEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp6)) {
            return false;
        }
        vp6 vp6Var = (vp6) obj;
        return this.a.equals(vp6Var.a) && jl40.l(this.b, vp6Var.b) && jl40.l(this.c, vp6Var.c) && this.d.equals(vp6Var.d) && this.e.equals(vp6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "BudgetUinSearchFieldEntity(header=" + this.a + ", hint=" + this.b + ", label=" + this.c + ", validation=" + this.d + ", button=" + this.e + Extension.C_BRAKE;
    }
}
