package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class qfy {
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
    public final String p;
    public final String q;
    public final String r;
    public final String s;

    public qfy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
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
        this.p = str16;
        this.q = str17;
        this.r = str18;
        this.s = str19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfy)) {
            return false;
        }
        qfy qfyVar = (qfy) obj;
        return jl40.l(this.a, qfyVar.a) && jl40.l(this.b, qfyVar.b) && jl40.l(this.c, qfyVar.c) && jl40.l(this.d, qfyVar.d) && jl40.l(this.e, qfyVar.e) && jl40.l(this.f, qfyVar.f) && jl40.l(this.g, qfyVar.g) && jl40.l(this.h, qfyVar.h) && jl40.l(this.i, qfyVar.i) && jl40.l(this.j, qfyVar.j) && jl40.l(this.k, qfyVar.k) && jl40.l(this.l, qfyVar.l) && jl40.l(this.m, qfyVar.m) && jl40.l(this.n, qfyVar.n) && jl40.l(this.o, qfyVar.o) && jl40.l(this.p, qfyVar.p) && jl40.l(this.q, qfyVar.q) && jl40.l(this.r, qfyVar.r) && jl40.l(this.s, qfyVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder v = b64.v("LimitPageTexts(title=", this.a, ", commonLimitsInputTitle=", this.b, ", memberAdd=");
        g8e.D(v, this.c, ", buttonSetTitle=", this.d, ", buttonSettingTitle=");
        g8e.D(v, this.e, ", buttonRemoveTitle=", this.f, ", setCommonLimitWarningDialogTitle=");
        g8e.D(v, this.g, ", setCommonLimitWarningDialogMessage=", this.h, ", setCommonLimitWarningDialogPositiveButton=");
        g8e.D(v, this.i, ", setCommonLimitWarningDialogNegativeButton=", this.j, ", resetCommonLimitWarningDialogTitle=");
        g8e.D(v, this.k, ", resetCommonLimitWarningDialogMessage=", this.l, ", resetCommonLimitWarningDialogPositiveButton=");
        g8e.D(v, this.m, ", resetCommonLimitWarningDialogNegativeButton=", this.n, ", membersEmptyViewTitle=");
        g8e.D(v, this.o, ", membersEmptyViewSubtitle=", this.p, ", membersEmptyInviteButtonText=");
        g8e.D(v, this.q, ", limitsNoLimit=", this.r, ", validationLimitError=");
        return oyr.t(v, this.s, Extension.C_BRAKE);
    }
}
