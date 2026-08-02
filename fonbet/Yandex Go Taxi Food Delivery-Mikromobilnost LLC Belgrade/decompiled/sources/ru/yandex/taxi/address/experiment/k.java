package ru.yandex.taxi.address.experiment;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.jl40;
import defpackage.mv0;
import defpackage.o660;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/address/experiment/k;", "Lru/yandex/taxi/address/experiment/o;", "Lru/yandex/taxi/address/experiment/g;", "Companion", "ru/yandex/taxi/address/experiment/j", "o660", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class k extends o implements g {
    public static final o660 Companion = new o660();
    public static final i3y[] w;
    public final List a;
    public final mv0 b;
    public final mv0 c;
    public final mv0 d;
    public final mv0 e;
    public final mv0 f;
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
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle t;
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle u;
    public final Boolean v;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        w = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new j660(4)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new j660(5)), kotlin.a.b(lazyThreadSafetyMode, new j660(6)), null};
    }

    public k(int i, List list, mv0 mv0Var, mv0 mv0Var2, mv0 mv0Var3, mv0 mv0Var4, mv0 mv0Var5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2, Boolean bool) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mv0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = mv0Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = mv0Var3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = mv0Var4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = mv0Var5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str9;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str10;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str11;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str12;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str13;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = summaryAddressStyle;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = summaryAddressStyle2;
        }
        if ((i & 2097152) == 0) {
            this.v = null;
        } else {
            this.v = bool;
        }
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: a, reason: from getter */
    public final String getP() {
        return this.p;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: b, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: c, reason: from getter */
    public final mv0 getB() {
        return this.b;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: d, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: e, reason: from getter */
    public final String getL() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jl40.l(this.a, kVar.a) && jl40.l(this.b, kVar.b) && jl40.l(this.c, kVar.c) && jl40.l(this.d, kVar.d) && jl40.l(this.e, kVar.e) && jl40.l(this.f, kVar.f) && jl40.l(this.g, kVar.g) && jl40.l(this.h, kVar.h) && jl40.l(this.i, kVar.i) && jl40.l(this.j, kVar.j) && jl40.l(this.k, kVar.k) && jl40.l(this.l, kVar.l) && jl40.l(this.m, kVar.m) && jl40.l(this.n, kVar.n) && jl40.l(this.o, kVar.o) && jl40.l(this.p, kVar.p) && jl40.l(this.q, kVar.q) && jl40.l(this.r, kVar.r) && jl40.l(this.s, kVar.s) && this.t == kVar.t && this.u == kVar.u && jl40.l(this.v, kVar.v);
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: f, reason: from getter */
    public final mv0 getE() {
        return this.e;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: g, reason: from getter */
    public final String getR() {
        return this.r;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: h, reason: from getter */
    public final String getO() {
        return this.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mv0 mv0Var = this.b;
        int hashCode2 = (hashCode + (mv0Var == null ? 0 : mv0Var.hashCode())) * 31;
        mv0 mv0Var2 = this.c;
        int hashCode3 = (hashCode2 + (mv0Var2 == null ? 0 : mv0Var2.hashCode())) * 31;
        mv0 mv0Var3 = this.d;
        int hashCode4 = (hashCode3 + (mv0Var3 == null ? 0 : mv0Var3.hashCode())) * 31;
        mv0 mv0Var4 = this.e;
        int hashCode5 = (hashCode4 + (mv0Var4 == null ? 0 : mv0Var4.hashCode())) * 31;
        mv0 mv0Var5 = this.f;
        int hashCode6 = (hashCode5 + (mv0Var5 == null ? 0 : mv0Var5.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.p;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.q;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.r;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.s;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle = this.t;
        int hashCode20 = (hashCode19 + (summaryAddressStyle == null ? 0 : summaryAddressStyle.hashCode())) * 31;
        NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle2 = this.u;
        int hashCode21 = (hashCode20 + (summaryAddressStyle2 == null ? 0 : summaryAddressStyle2.hashCode())) * 31;
        Boolean bool = this.v;
        return hashCode21 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: i, reason: from getter */
    public final mv0 getD() {
        return this.d;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: j, reason: from getter */
    public final mv0 getF() {
        return this.f;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: k, reason: from getter */
    public final mv0 getC() {
        return this.c;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: l, reason: from getter */
    public final String getM() {
        return this.m;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: m, reason: from getter */
    public final String getN() {
        return this.n;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: n, reason: from getter */
    public final String getQ() {
        return this.q;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: o, reason: from getter */
    public final Boolean getV() {
        return this.v;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: p, reason: from getter */
    public final String getS() {
        return this.s;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: q, reason: from getter */
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle getT() {
        return this.t;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: r, reason: from getter */
    public final String getH() {
        return this.h;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: s, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: t, reason: from getter */
    public final String getK() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffOverride(tariffClasses=");
        sb.append(this.a);
        sb.append(", sourceAddressIcon=");
        sb.append(this.b);
        sb.append(", destinationAddressIcon=");
        sb.append(this.c);
        sb.append(", singleLineAddressIcon=");
        sb.append(this.d);
        sb.append(", focusedSourceAddressIcon=");
        sb.append(this.e);
        sb.append(", focusedDestinationAddressIcon=");
        sb.append(this.f);
        sb.append(", routeSelectorSourceTitleKey=");
        g8e.D(sb, this.g, ", routeSelectorDestinationTitleKey=", this.h, ", summaryTitleKey=");
        g8e.D(sb, this.i, ", summarySourceTitleKey=", this.j, ", summaryDestinationTitleKey=");
        g8e.D(sb, this.k, ", missingArrivedTimeKey=", this.l, ", singleLineAddressTitleKey=");
        g8e.D(sb, this.m, ", sourceSingleLineAddressTitleKey=", this.n, ", destinationSingleLineAddressTitleKey=");
        g8e.D(sb, this.o, ", buttonAddStopKey=", this.p, ", buttonAddEntranceKey=");
        g8e.D(sb, this.q, ", missingTravelTimeTemplate=", this.r, ", loadingTravelTimeTitleKey=");
        sb.append(this.s);
        sb.append(", summaryDestinationAddressStyle=");
        sb.append(this.t);
        sb.append(", summarySourceAddressStyle=");
        sb.append(this.u);
        sb.append(", hideDestination=");
        sb.append(this.v);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // ru.yandex.taxi.address.experiment.g
    /* renamed from: u, reason: from getter */
    public final NewbiesRedesignPointsABExperiment.SummaryAddressStyle getU() {
        return this.u;
    }

    public k() {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }
}
