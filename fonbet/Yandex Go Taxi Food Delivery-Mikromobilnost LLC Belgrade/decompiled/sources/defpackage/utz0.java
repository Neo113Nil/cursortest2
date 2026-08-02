package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class utz0 implements xtz0 {
    public final ArrayList a;
    public final ArrayList b;
    public final Text.Constant c;
    public final Text.Constant d;
    public final rbv e;
    public final boolean f;

    public utz0(ArrayList arrayList, ArrayList arrayList2, Text.Constant constant, Text.Constant constant2, rbv rbvVar, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = constant;
        this.d = constant2;
        this.e = rbvVar;
        this.f = z;
    }

    @Override // defpackage.xtz0
    public final boolean a() {
        return false;
    }

    public final rbv b() {
        return this.e;
    }

    public final List c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public final Text e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utz0)) {
            return false;
        }
        utz0 utz0Var = (utz0) obj;
        return this.a.equals(utz0Var.a) && this.b.equals(utz0Var.b) && this.c.equals(utz0Var.c) && this.d.equals(utz0Var.d) && jl40.l(this.e, utz0Var.e) && this.f == utz0Var.f;
    }

    public final Text f() {
        return this.c;
    }

    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        int d = xvz.d(this.d, xvz.d(this.c, ly3.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
        rbv rbvVar = this.e;
        return Boolean.hashCode(this.f) + unr0.e((d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        return "Data(leftButtons=" + this.a + ", rightButtons=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", iconAfterTitle=" + this.e + ", isTokenizationShimmerVisible=false, isBackButtonVisibleAfterRequest=" + this.f + Extension.C_BRAKE;
    }
}
