package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class q6y0 implements r1y0 {
    public final i501 a;
    public final g301 b;
    public final o2y0 c;
    public final long d;
    public final e58 e;
    public final String f;
    public final boolean g;
    public final CharSequence h;
    public final List i;
    public final m6y0 j;
    public final q48 k;
    public final DriveState l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final Long q;
    public final kdc r;
    public final yfb s;
    public final ArrayList t;
    public final e401 u;
    public final n6y0 v;
    public final String w;
    public final ad11 x;
    public final boolean y;

    public q6y0(i501 i501Var, g301 g301Var, o2y0 o2y0Var, long j, e58 e58Var, String str, boolean z, CharSequence charSequence, List list, m6y0 m6y0Var, q48 q48Var, DriveState driveState, long j2, boolean z2, boolean z3, boolean z4, Long l, kdc kdcVar, yfb yfbVar, ArrayList arrayList, e401 e401Var, n6y0 n6y0Var, String str2, ad11 ad11Var, boolean z5) {
        this.a = i501Var;
        this.b = g301Var;
        this.c = o2y0Var;
        this.d = j;
        this.e = e58Var;
        this.f = str;
        this.g = z;
        this.h = charSequence;
        this.i = list;
        this.j = m6y0Var;
        this.k = q48Var;
        this.l = driveState;
        this.m = j2;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = l;
        this.r = kdcVar;
        this.s = yfbVar;
        this.t = arrayList;
        this.u = e401Var;
        this.v = n6y0Var;
        this.w = str2;
        this.x = ad11Var;
        this.y = z5;
    }

    public static q6y0 c(q6y0 q6y0Var, i501 i501Var, int i) {
        i501 i501Var2 = (i & 1) != 0 ? q6y0Var.a : i501Var;
        g301 g301Var = q6y0Var.b;
        o2y0 o2y0Var = q6y0Var.c;
        long j = q6y0Var.d;
        e58 e58Var = q6y0Var.e;
        String str = q6y0Var.f;
        boolean z = q6y0Var.g;
        CharSequence charSequence = q6y0Var.h;
        List list = q6y0Var.i;
        m6y0 m6y0Var = q6y0Var.j;
        q48 q48Var = q6y0Var.k;
        DriveState driveState = q6y0Var.l;
        long j2 = q6y0Var.m;
        boolean z2 = (i & 8192) != 0 ? q6y0Var.n : false;
        boolean z3 = q6y0Var.o;
        boolean z4 = q6y0Var.p;
        Long l = q6y0Var.q;
        kdc kdcVar = q6y0Var.r;
        yfb yfbVar = q6y0Var.s;
        ArrayList arrayList = q6y0Var.t;
        e401 e401Var = q6y0Var.u;
        n6y0 n6y0Var = q6y0Var.v;
        String str2 = q6y0Var.w;
        ad11 ad11Var = q6y0Var.x;
        boolean z5 = q6y0Var.y;
        q6y0Var.getClass();
        return new q6y0(i501Var2, g301Var, o2y0Var, j, e58Var, str, z, charSequence, list, m6y0Var, q48Var, driveState, j2, z2, z3, z4, l, kdcVar, yfbVar, arrayList, e401Var, n6y0Var, str2, ad11Var, z5);
    }

    public final CharSequence A() {
        return this.h;
    }

    public final long B() {
        return this.d;
    }

    public final kdc C() {
        return this.r;
    }

    public final g301 D() {
        return this.b;
    }

    public final boolean E() {
        return this.p;
    }

    public final boolean F() {
        return this.g;
    }

    public final String a() {
        return this.c.b().a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6y0)) {
            return false;
        }
        q6y0 q6y0Var = (q6y0) obj;
        return jl40.l(this.a, q6y0Var.a) && jl40.l(this.b, q6y0Var.b) && jl40.l(this.c, q6y0Var.c) && this.d == q6y0Var.d && jl40.l(this.e, q6y0Var.e) && jl40.l(this.f, q6y0Var.f) && this.g == q6y0Var.g && jl40.l(this.h, q6y0Var.h) && jl40.l(this.i, q6y0Var.i) && this.j.equals(q6y0Var.j) && jl40.l(this.k, q6y0Var.k) && this.l == q6y0Var.l && this.m == q6y0Var.m && this.n == q6y0Var.n && this.o == q6y0Var.o && this.p == q6y0Var.p && jl40.l(this.q, q6y0Var.q) && jl40.l(this.r, q6y0Var.r) && jl40.l(this.s, q6y0Var.s) && this.t.equals(q6y0Var.t) && jl40.l(this.u, q6y0Var.u) && jl40.l(this.v, q6y0Var.v) && jl40.l(this.w, q6y0Var.w) && jl40.l(this.x, q6y0Var.x) && this.y == q6y0Var.y;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return String.valueOf(this.c.hashCode());
    }

    public final String getTitle() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g301 g301Var = this.b;
        int c = qv10.c((this.c.hashCode() + ((hashCode + (g301Var == null ? 0 : g301Var.hashCode())) * 31)) * 31, 31, this.d);
        e58 e58Var = this.e;
        int hashCode2 = (this.j.hashCode() + unr0.c(smw0.b(unr0.e(unr0.b((c + (e58Var == null ? 0 : e58Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31;
        q48 q48Var = this.k;
        int e = unr0.e(unr0.e(unr0.e(qv10.c((this.l.hashCode() + ((hashCode2 + (q48Var == null ? 0 : q48Var.hashCode())) * 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        Long l = this.q;
        int hashCode3 = (e + (l == null ? 0 : l.hashCode())) * 31;
        kdc kdcVar = this.r;
        int b = ly3.b((this.s.hashCode() + ((hashCode3 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31)) * 31, 31, this.t);
        e401 e401Var = this.u;
        int hashCode4 = (b + (e401Var == null ? 0 : e401Var.hashCode())) * 31;
        n6y0 n6y0Var = this.v;
        return Boolean.hashCode(this.y) + ((this.x.hashCode() + unr0.b((hashCode4 + (n6y0Var != null ? n6y0Var.hashCode() : 0)) * 31, 31, this.w)) * 31);
    }

    public final List m() {
        return this.i;
    }

    public final q48 n() {
        return this.k;
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderTracking(cardSwipeBehaviour=");
        sb.append(this.a);
        sb.append(", trackingCard=");
        sb.append(this.b);
        sb.append(", orderHolder=");
        sb.append(this.c);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", carIconStrategy=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", isProcessingTitle=");
        sb.append(this.g);
        sb.append(", subtitle=");
        sb.append((Object) this.h);
        sb.append(", actions=");
        sb.append(this.i);
        sb.append(", feedback=");
        sb.append(this.j);
        sb.append(", carData=");
        sb.append(this.k);
        sb.append(", orderState=");
        sb.append(this.l);
        x4e.A(this.m, ", startTime=", ", isProgressVisible=", sb);
        nnm.v(", isTimerVisible=", ", isChevronVisible=", sb, this.n, this.o);
        sb.append(this.p);
        sb.append(", progressDuration=");
        sb.append(this.q);
        sb.append(", titleColor=");
        sb.append(this.r);
        sb.append(", checkInState=");
        sb.append(this.s);
        sb.append(", promoPlaqueItems=");
        sb.append(this.t);
        sb.append(", popUp=");
        sb.append(this.u);
        sb.append(", moneyNotEnoughHeader=");
        sb.append(this.v);
        sb.append(", titleContentDescription=");
        sb.append(this.w);
        sb.append(", travelCompanionStatus=");
        sb.append(this.x);
        sb.append(", isBodyAccessibilityAvailable=");
        sb.append(this.y);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public final e58 v() {
        return this.e;
    }

    public final yfb w() {
        return this.s;
    }

    public final m6y0 x() {
        return this.j;
    }

    public final o2y0 y() {
        return this.c;
    }

    public final DriveState z() {
        return this.l;
    }
}
