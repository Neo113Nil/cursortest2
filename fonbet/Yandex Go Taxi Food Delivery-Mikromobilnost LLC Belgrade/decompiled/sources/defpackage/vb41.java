package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class vb41 {
    public static final ub41 Companion = new ub41();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public /* synthetic */ vb41(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        if (32767 != (i & 32767)) {
            qje.Z(i, 32767, tb41.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb41)) {
            return false;
        }
        vb41 vb41Var = (vb41) obj;
        return jl40.l(this.a, vb41Var.a) && jl40.l(this.b, vb41Var.b) && jl40.l(this.c, vb41Var.c) && jl40.l(this.d, vb41Var.d) && jl40.l(this.e, vb41Var.e) && jl40.l(this.f, vb41Var.f) && jl40.l(this.g, vb41Var.g) && jl40.l(this.h, vb41Var.h) && jl40.l(this.i, vb41Var.i) && jl40.l(this.j, vb41Var.j) && jl40.l(this.k, vb41Var.k) && jl40.l(this.l, vb41Var.l) && jl40.l(this.m, vb41Var.m) && jl40.l(this.n, vb41Var.n) && jl40.l(this.o, vb41Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder v = b64.v("Localizations(cameraStepCounter=", this.a, ", failureTitle=", this.b, ", failureSubtitle=");
        g8e.D(v, this.c, ", failureButtonCancel=", this.d, ", failureButtonRetry=");
        g8e.D(v, this.e, ", successTitle=", this.f, ", successSubtitle=");
        g8e.D(v, this.g, ", successButtonDone=", this.h, ", cameraCloseConfirmationTitle=");
        g8e.D(v, this.i, ", cameraCloseConfirmationSubtitle=", this.j, ", cameraCloseConfirmationReturn=");
        g8e.D(v, this.k, ", cameraCloseConfirmationConfirm=", this.l, ", cameraPreviewTitle=");
        g8e.D(v, this.m, ", cameraPreviewButtonConfirm=", this.n, ", cameraPreviewButtonRetry=");
        return oyr.t(v, this.o, Extension.C_BRAKE);
    }
}
