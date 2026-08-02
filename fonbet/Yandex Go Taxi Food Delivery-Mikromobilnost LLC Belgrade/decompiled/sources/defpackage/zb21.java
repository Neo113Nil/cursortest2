package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zb21 {
    public final boolean a;
    public final boolean b;
    public final ArrayList c;
    public final kao d;
    public final boolean e;
    public final Text f;
    public final d451 g;

    public zb21(boolean z, boolean z2, ArrayList arrayList, kao kaoVar, boolean z3, Text.Constant constant, d451 d451Var) {
        this.a = z;
        this.b = z2;
        this.c = arrayList;
        this.d = kaoVar;
        this.e = z3;
        this.f = constant;
        this.g = d451Var;
    }

    public final Text a() {
        return this.f;
    }

    public final boolean b() {
        return this.e;
    }

    public final kao c() {
        return this.d;
    }

    public final List d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb21)) {
            return false;
        }
        zb21 zb21Var = (zb21) obj;
        return this.a == zb21Var.a && this.b == zb21Var.b && this.c.equals(zb21Var.c) && jl40.l(this.d, zb21Var.d) && this.e == zb21Var.e && jl40.l(this.f, zb21Var.f) && jl40.l(this.g, zb21Var.g);
    }

    public final boolean f() {
        return this.b;
    }

    public final d451 g() {
        return this.g;
    }

    public final int hashCode() {
        int b = ly3.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        kao kaoVar = this.d;
        int e = unr0.e((b + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31, 31, this.e);
        Text text = this.f;
        int hashCode = (e + (text == null ? 0 : text.hashCode())) * 31;
        d451 d451Var = this.g;
        return hashCode + (d451Var != null ? d451Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("UpgradeViewState(showInitialLoading=", ", showSubmissionLoading=", ", fields=", this.a, this.b);
        u.append(this.c);
        u.append(", error=");
        u.append(this.d);
        u.append(", areControlsEnabled=");
        u.append(this.e);
        u.append(", agreement=");
        u.append(this.f);
        u.append(", widget=");
        u.append(this.g);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
