package ru.yandex.taxi.address.experiment;

import defpackage.bdc;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.nv0;
import defpackage.smw0;
import defpackage.tb90;
import defpackage.ub90;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xng0;
import defpackage.yw0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes6.dex */
public final class a {
    public final String a;
    public final CharSequence b;
    public final kdc c;
    public final String d;
    public final CharSequence e;
    public final yw0 f;
    public final nv0 g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final AddressItemMode l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle p;
    public final ub90 q;
    public final boolean r;
    public final boolean s;

    public /* synthetic */ a(String str, CharSequence charSequence, String str2, CharSequence charSequence2, yw0 yw0Var, String str3, String str4, String str5, AddressItemMode addressItemMode, boolean z, boolean z2, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle, tb90 tb90Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : charSequence, new bdc(xng0.textMain), (i & 8) != 0 ? null : str2, (i & 16) != 0 ? "" : charSequence2, (i & 32) != 0 ? new yw0(31, null, null, null) : yw0Var, new nv0(0), (i & 128) != 0 ? "" : str3, false, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? AddressItemMode.READ_ONLY : addressItemMode, (i & 4096) != 0 ? true : z, false, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? NewbiesRedesignPointsABExperiment.SummaryAddressStyle.CITY_WITH_ADDRESS : summaryAddressStyle, (i & 65536) != 0 ? null : tb90Var, true, true);
    }

    public static a a(a aVar, String str, CharSequence charSequence, kdc kdcVar, CharSequence charSequence2, yw0 yw0Var, nv0 nv0Var, String str2, AddressItemMode addressItemMode, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str3 = (i & 1) != 0 ? aVar.a : str;
        CharSequence charSequence3 = (i & 2) != 0 ? aVar.b : charSequence;
        kdc kdcVar2 = (i & 4) != 0 ? aVar.c : kdcVar;
        String str4 = aVar.d;
        CharSequence charSequence4 = (i & 16) != 0 ? aVar.e : charSequence2;
        yw0 yw0Var2 = (i & 32) != 0 ? aVar.f : yw0Var;
        nv0 nv0Var2 = (i & 64) != 0 ? aVar.g : nv0Var;
        String str5 = (i & 128) != 0 ? aVar.h : str2;
        boolean z5 = (i & 256) != 0 ? aVar.i : true;
        String str6 = aVar.j;
        String str7 = aVar.k;
        AddressItemMode addressItemMode2 = (i & 2048) != 0 ? aVar.l : addressItemMode;
        boolean z6 = (i & 4096) != 0 ? aVar.m : z;
        boolean z7 = (i & 8192) != 0 ? aVar.n : z2;
        boolean z8 = aVar.o;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle = aVar.p;
        ub90 ub90Var = aVar.q;
        boolean z9 = (i & 131072) != 0 ? aVar.r : z3;
        boolean z10 = (i & 262144) != 0 ? aVar.s : z4;
        aVar.getClass();
        return new a(str3, charSequence3, kdcVar2, str4, charSequence4, yw0Var2, nv0Var2, str5, z5, str6, str7, addressItemMode2, z6, z7, z8, summaryAddressStyle, ub90Var, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h) && this.i == aVar.i && jl40.l(this.j, aVar.j) && jl40.l(this.k, aVar.k) && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && jl40.l(this.q, aVar.q) && this.r == aVar.r && this.s == aVar.s;
    }

    public final int hashCode() {
        int d = smw0.d(this.c, smw0.b(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int hashCode = (this.p.hashCode() + unr0.e(unr0.e(unr0.e((this.l.hashCode() + unr0.b(unr0.b(unr0.e(unr0.b((this.g.hashCode() + ((this.f.hashCode() + smw0.b((d + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m), 31, this.n), 31, this.o)) * 31;
        ub90 ub90Var = this.q;
        return Boolean.hashCode(this.s) + unr0.e((hashCode + (ub90Var != null ? ub90Var.hashCode() : 0)) * 31, 31, this.r);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "AddressItemState(title=", this.a, ", text=", ", textColor=");
        t.append(this.c);
        t.append(", shortText=");
        t.append(this.d);
        t.append(", hint=");
        t.append((Object) this.e);
        t.append(", icon=");
        t.append(this.f);
        t.append(", addressIcons=");
        t.append(this.g);
        t.append(", buttonText=");
        t.append(this.h);
        t.append(", isButtonMinorStyle=");
        unr0.A(", contentDescription=", this.j, ", expandedContentDescription=", t, this.i);
        t.append(this.k);
        t.append(", mode=");
        t.append(this.l);
        t.append(", isVisible=");
        nnm.v(", useCompactInput=", ", showTrailButton=", t, this.m, this.n);
        t.append(this.o);
        t.append(", addressViewStyle=");
        t.append(this.p);
        t.append(", panoramaData=");
        t.append(this.q);
        t.append(", isMapSelectionEnabled=");
        t.append(this.r);
        t.append(", isTitleVisible=");
        return x4e.i(t, this.s, Extension.C_BRAKE);
    }

    public a(String str, CharSequence charSequence, kdc kdcVar, String str2, CharSequence charSequence2, yw0 yw0Var, nv0 nv0Var, String str3, boolean z, String str4, String str5, AddressItemMode addressItemMode, boolean z2, boolean z3, boolean z4, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle, ub90 ub90Var, boolean z5, boolean z6) {
        this.a = str;
        this.b = charSequence;
        this.c = kdcVar;
        this.d = str2;
        this.e = charSequence2;
        this.f = yw0Var;
        this.g = nv0Var;
        this.h = str3;
        this.i = z;
        this.j = str4;
        this.k = str5;
        this.l = addressItemMode;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = summaryAddressStyle;
        this.q = ub90Var;
        this.r = z5;
        this.s = z6;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, false, false, null, null, 524287);
    }
}
