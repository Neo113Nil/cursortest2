package ru.yandex.taxi.address.experiment;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.o0j;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.yw0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

/* loaded from: classes9.dex */
public final class e {
    public final yw0 a;
    public final yw0 b;
    public final yw0 c;
    public final yw0 d;
    public final yw0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final o0j l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final NextButtonShowStrategy q;
    public final String r;
    public final String s;
    public final boolean t;
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle u;
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle v;
    public final boolean w;

    public e(yw0 yw0Var, yw0 yw0Var2, yw0 yw0Var3, yw0 yw0Var4, yw0 yw0Var5, String str, String str2, String str3, String str4, String str5, String str6, o0j o0jVar, String str7, String str8, String str9, NextButtonShowStrategy nextButtonShowStrategy, String str10, String str11, boolean z, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2, boolean z2, int i) {
        boolean z3 = (i & 32768) == 0;
        NextButtonShowStrategy nextButtonShowStrategy2 = (i & 65536) != 0 ? NextButtonShowStrategy.NONE : nextButtonShowStrategy;
        String str12 = (i & 131072) != 0 ? "" : str10;
        String str13 = (i & 262144) == 0 ? str11 : "";
        boolean z4 = (i & 524288) != 0 ? false : z;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle3 = (i & 1048576) != 0 ? NewbiesRedesignPointsABExperiment.SummaryAddressStyle.CITY_WITH_ADDRESS : summaryAddressStyle;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle4 = (i & 2097152) != 0 ? NewbiesRedesignPointsABExperiment.SummaryAddressStyle.CITY_WITH_ADDRESS : summaryAddressStyle2;
        boolean z5 = (i & SelfTester_JCP.ENCRYPT_CBC) == 0 ? z2 : false;
        this.a = yw0Var;
        this.b = yw0Var2;
        this.c = yw0Var3;
        this.d = yw0Var4;
        this.e = yw0Var5;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = o0jVar;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = z3;
        this.q = nextButtonShowStrategy2;
        this.r = str12;
        this.s = str13;
        this.t = z4;
        this.u = summaryAddressStyle3;
        this.v = summaryAddressStyle4;
        this.w = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && jl40.l(this.c, eVar.c) && jl40.l(this.d, eVar.d) && jl40.l(this.e, eVar.e) && jl40.l(this.f, eVar.f) && jl40.l(this.g, eVar.g) && jl40.l(this.h, eVar.h) && jl40.l(this.i, eVar.i) && jl40.l(this.j, eVar.j) && jl40.l(this.k, eVar.k) && jl40.l(this.l, eVar.l) && jl40.l(this.m, eVar.m) && jl40.l(this.n, eVar.n) && jl40.l(this.o, eVar.o) && this.p == eVar.p && this.q == eVar.q && jl40.l(this.r, eVar.r) && jl40.l(this.s, eVar.s) && this.t == eVar.t && this.u == eVar.u && this.v == eVar.v && this.w == eVar.w;
    }

    public final int hashCode() {
        int b = unr0.b((this.l.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31, 31, this.m);
        String str = this.n;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.o;
        return Boolean.hashCode(this.w) + ((this.v.hashCode() + ((this.u.hashCode() + unr0.e(unr0.b(unr0.b((this.q.hashCode() + unr0.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.p)) * 31, 31, this.r), 31, this.s), 31, this.t)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewbiesRedesignPointsABConfig(sourceIcon=");
        sb.append(this.a);
        sb.append(", destinationIcon=");
        sb.append(this.b);
        sb.append(", singleLineIcon=");
        sb.append(this.c);
        sb.append(", focusedSourceIcon=");
        sb.append(this.d);
        sb.append(", focusedDestinationIcon=");
        sb.append(this.e);
        sb.append(", routeSelectorSourceTitle=");
        sb.append(this.f);
        sb.append(", routeSelectorDestinationTitle=");
        g8e.D(sb, this.g, ", summaryTitle=", this.h, ", summarySourceTitle=");
        g8e.D(sb, this.i, ", buttonAddStopTitle=", this.j, ", buttonAddEntranceTitle=");
        sb.append(this.k);
        sb.append(", destinationTitle=");
        sb.append(this.l);
        sb.append(", singleLineTitle=");
        g8e.D(sb, this.m, ", sourceSingleLineAddressTitle=", this.n, ", destinationSingleLineAddressTitle=");
        tse0.y(this.o, ", useCompactInput=", ", nextButtonShowStrategy=", sb, this.p);
        sb.append(this.q);
        sb.append(", nextButtonText=");
        sb.append(this.r);
        sb.append(", nextButtonNoDestinationText=");
        tse0.y(this.s, ", expandableTransitionAnimationEnabled=", ", summarySourceStyle=", sb, this.t);
        sb.append(this.u);
        sb.append(", summaryDestinationStyle=");
        sb.append(this.v);
        sb.append(", hideDestination=");
        return x4e.i(sb, this.w, Extension.C_BRAKE);
    }
}
