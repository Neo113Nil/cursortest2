package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sw3 {
    public final String a;
    public final ug6 b;
    public final uda0 c;
    public final boolean d;

    public /* synthetic */ sw3(String str, rg6 rg6Var, uda0 uda0Var, int i) {
        this((i & 1) != 0 ? null : str, (ug6) ((i & 2) != 0 ? null : rg6Var), (i & 4) != 0 ? null : uda0Var, false);
    }

    public static sw3 a(sw3 sw3Var, ug6 ug6Var, int i) {
        String str = sw3Var.a;
        if ((i & 2) != 0) {
            ug6Var = sw3Var.b;
        }
        uda0 uda0Var = sw3Var.c;
        boolean z = (i & 8) != 0 ? sw3Var.d : true;
        sw3Var.getClass();
        return new sw3(str, ug6Var, uda0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw3)) {
            return false;
        }
        sw3 sw3Var = (sw3) obj;
        return jl40.l(this.a, sw3Var.a) && jl40.l(this.b, sw3Var.b) && jl40.l(this.c, sw3Var.c) && this.d == sw3Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ug6 ug6Var = this.b;
        int hashCode2 = (hashCode + (ug6Var == null ? 0 : ug6Var.hashCode())) * 31;
        uda0 uda0Var = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (uda0Var != null ? uda0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AutoTopupPaymentMethodsState(bottomSheetTitle=" + this.a + ", bottomSheetState=" + this.b + ", paymentMethods=" + this.c + ", navigatedToSettings=" + this.d + Extension.C_BRAKE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sw3() {
        this((String) null, (rg6) (0 == true ? 1 : 0), (uda0) (0 == true ? 1 : 0), 15);
    }

    public sw3(String str, ug6 ug6Var, uda0 uda0Var, boolean z) {
        this.a = str;
        this.b = ug6Var;
        this.c = uda0Var;
        this.d = z;
    }
}
