package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r7m0 {
    public final lur0 a;
    public final x6m0 b;
    public final Throwable c;
    public final String d;
    public final s7m0 e;
    public final s7m0 f;
    public final boolean g;
    public final boolean h;
    public final ColorModel i;

    public r7m0(lur0 lur0Var, x6m0 x6m0Var, Throwable th, String str, s7m0 s7m0Var, s7m0 s7m0Var2, boolean z, boolean z2, ColorModel colorModel) {
        this.a = lur0Var;
        this.b = x6m0Var;
        this.c = th;
        this.d = str;
        this.e = s7m0Var;
        this.f = s7m0Var2;
        this.g = z;
        this.h = z2;
        this.i = colorModel;
    }

    public static r7m0 a(r7m0 r7m0Var, lur0 lur0Var, x6m0 x6m0Var, Throwable th, String str, s7m0 s7m0Var, s7m0 s7m0Var2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            lur0Var = r7m0Var.a;
        }
        lur0 lur0Var2 = lur0Var;
        if ((i & 2) != 0) {
            x6m0Var = r7m0Var.b;
        }
        x6m0 x6m0Var2 = x6m0Var;
        if ((i & 4) != 0) {
            th = r7m0Var.c;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            str = r7m0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            s7m0Var = r7m0Var.e;
        }
        s7m0 s7m0Var3 = s7m0Var;
        s7m0 s7m0Var4 = (i & 32) != 0 ? r7m0Var.f : s7m0Var2;
        boolean z3 = (i & 64) != 0 ? r7m0Var.g : z;
        boolean z4 = (i & 128) != 0 ? r7m0Var.h : z2;
        ColorModel colorModel = r7m0Var.i;
        r7m0Var.getClass();
        return new r7m0(lur0Var2, x6m0Var2, th2, str2, s7m0Var3, s7m0Var4, z3, z4, colorModel);
    }

    public final s7m0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7m0)) {
            return false;
        }
        r7m0 r7m0Var = (r7m0) obj;
        return this.a.equals(r7m0Var.a) && jl40.l(this.b, r7m0Var.b) && jl40.l(this.c, r7m0Var.c) && jl40.l(this.d, r7m0Var.d) && jl40.l(this.e, r7m0Var.e) && jl40.l(this.f, r7m0Var.f) && this.g == r7m0Var.g && this.h == r7m0Var.h && jl40.l(this.i, r7m0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x6m0 x6m0Var = this.b;
        int hashCode2 = (hashCode + (x6m0Var == null ? 0 : x6m0Var.hashCode())) * 31;
        Throwable th = this.c;
        int hashCode3 = (hashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        s7m0 s7m0Var = this.e;
        int hashCode5 = (hashCode4 + (s7m0Var == null ? 0 : s7m0Var.hashCode())) * 31;
        s7m0 s7m0Var2 = this.f;
        int e = unr0.e(unr0.e((hashCode5 + (s7m0Var2 == null ? 0 : s7m0Var2.hashCode())) * 31, 31, this.g), 31, this.h);
        ColorModel colorModel = this.i;
        return e + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsAccountState(shimmerTimerStatus=");
        sb.append(this.a);
        sb.append(", info=");
        sb.append(this.b);
        sb.append(", exception=");
        sb.append(this.c);
        sb.append(", pendingName=");
        sb.append(this.d);
        sb.append(", previewTheme=");
        sb.append(this.e);
        sb.append(", selectedTheme=");
        sb.append(this.f);
        sb.append(", canAnimateBalance=");
        nnm.v(", showFullscreenLoading=", ", progressBackgroundColor=", sb, this.g, this.h);
        return n.o(sb, this.i, Extension.C_BRAKE);
    }
}
