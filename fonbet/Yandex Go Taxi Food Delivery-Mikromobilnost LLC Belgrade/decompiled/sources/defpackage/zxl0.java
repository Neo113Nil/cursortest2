package defpackage;

import com.yandex.go.design.compose.spinner.SpinnerState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zxl0 implements cyl0 {
    public final String a;
    public final String b;
    public final SpinnerState c = SpinnerState.ERROR;

    public zxl0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cyl0
    public final SpinnerState a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxl0)) {
            return false;
        }
        zxl0 zxl0Var = (zxl0) obj;
        return this.a.equals(zxl0Var.a) && this.b.equals(zxl0Var.b);
    }

    @Override // defpackage.cyl0
    public final String getSubtitle() {
        return null;
    }

    @Override // defpackage.cyl0
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("NetworkError(title=", this.a, ", skipButtonText=", this.b, Extension.C_BRAKE);
    }
}
