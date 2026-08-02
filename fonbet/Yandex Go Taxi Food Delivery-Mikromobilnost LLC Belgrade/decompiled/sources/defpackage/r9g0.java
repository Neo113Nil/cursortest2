package defpackage;

import com.ybsdk.widgets.common.k;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r9g0 implements w9g0 {
    public final k a;
    public final kao b;
    public final lfv c;

    public r9g0(k kVar, kao kaoVar, lfv lfvVar) {
        this.a = kVar;
        this.b = kaoVar;
        this.c = lfvVar;
    }

    @Override // defpackage.w9g0
    public final lfv c() {
        return this.c;
    }

    public final kao e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9g0)) {
            return false;
        }
        r9g0 r9g0Var = (r9g0) obj;
        return jl40.l(this.a, r9g0Var.a) && jl40.l(this.b, r9g0Var.b) && this.c.equals(r9g0Var.c);
    }

    public final k f() {
        return this.a;
    }

    public final int hashCode() {
        k kVar = this.a;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        kao kaoVar = this.b;
        return this.c.hashCode() + ((hashCode + (kaoVar != null ? kaoVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Error(operationProgressOverlayDialog=" + this.a + ", errorViewState=" + this.b + ", toolbar=" + this.c + Extension.C_BRAKE;
    }
}
