package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wcg0 {
    public final ibv a;
    public final boolean b;
    public final Text.Resource c;
    public final boolean d;
    public final boolean e;

    public wcg0(ibv ibvVar, boolean z, Text.Resource resource, boolean z2, boolean z3) {
        this.a = ibvVar;
        this.b = z;
        this.c = resource;
        this.d = z2;
        this.e = z3;
    }

    public final Text a() {
        return this.c;
    }

    public final rbv b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcg0)) {
            return false;
        }
        wcg0 wcg0Var = (wcg0) obj;
        return this.a.equals(wcg0Var.a) && this.b == wcg0Var.b && this.c.equals(wcg0Var.c) && this.d == wcg0Var.d && this.e == wcg0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(uw51.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrReaderViewState(flashlightIcon=");
        sb.append(this.a);
        sb.append(", isFlashlightOn=");
        sb.append(this.b);
        sb.append(", flashlightContentDescription=");
        sb.append(this.c);
        sb.append(", isLoadingVisible=");
        sb.append(this.d);
        sb.append(", bottomSheetShowing=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
