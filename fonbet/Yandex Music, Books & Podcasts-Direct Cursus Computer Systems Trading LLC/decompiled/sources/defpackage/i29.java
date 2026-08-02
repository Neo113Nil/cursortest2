package defpackage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i29 implements u1f, dp8 {
    public final String A;
    public final szb B;
    public final w79 C;
    public final List D;
    public final ix8 E;
    public final ix8 F;
    public final szb G;
    public final szb H;
    public final List I;
    public final List J;
    public final szb K;
    public final szb L;
    public final szb M;
    public final szb N;
    public final List O;
    public final szb P;
    public final szb Q;
    public final List R;
    public final qv9 S;
    public final List T;
    public final sq8 U;
    public final un8 V;
    public final un8 W;
    public final List X;
    public final List Y;
    public final List Z;
    public final tc8 a;
    public final szb a0;
    public final bd8 b;
    public final l1a b0;
    public final sm8 c;
    public final List c0;
    public final List d;
    public final bk9 d0;
    public final szb e;
    public Integer e0;
    public final szb f;
    public final szb g;
    public final List h;
    public final zx8 i;
    public final do8 j;
    public final List k;
    public final op8 l;
    public final szb m;
    public final szb n;
    public final szb o;
    public final szb p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final wz8 u;
    public final List v;
    public final bk9 w;
    public final szb x;
    public final List y;
    public final List z;

    public i29(tc8 tc8Var, bd8 bd8Var, sm8 sm8Var, List list, szb szbVar, szb szbVar2, szb szbVar3, List list2, zx8 zx8Var, do8 do8Var, List list3, op8 op8Var, szb szbVar4, szb szbVar5, szb szbVar6, szb szbVar7, List list4, List list5, List list6, List list7, wz8 wz8Var, List list8, bk9 bk9Var, szb szbVar8, List list9, List list10, String str, szb szbVar9, w79 w79Var, List list11, ix8 ix8Var, ix8 ix8Var2, szb szbVar10, szb szbVar11, List list12, List list13, szb szbVar12, szb szbVar13, szb szbVar14, szb szbVar15, List list14, szb szbVar16, szb szbVar17, List list15, qv9 qv9Var, List list16, sq8 sq8Var, un8 un8Var, un8 un8Var2, List list17, List list18, List list19, szb szbVar18, l1a l1aVar, List list20, bk9 bk9Var2) {
        this.a = tc8Var;
        this.b = bd8Var;
        this.c = sm8Var;
        this.d = list;
        this.e = szbVar;
        this.f = szbVar2;
        this.g = szbVar3;
        this.h = list2;
        this.i = zx8Var;
        this.j = do8Var;
        this.k = list3;
        this.l = op8Var;
        this.m = szbVar4;
        this.n = szbVar5;
        this.o = szbVar6;
        this.p = szbVar7;
        this.q = list4;
        this.r = list5;
        this.s = list6;
        this.t = list7;
        this.u = wz8Var;
        this.v = list8;
        this.w = bk9Var;
        this.x = szbVar8;
        this.y = list9;
        this.z = list10;
        this.A = str;
        this.B = szbVar9;
        this.C = w79Var;
        this.D = list11;
        this.E = ix8Var;
        this.F = ix8Var2;
        this.G = szbVar10;
        this.H = szbVar11;
        this.I = list12;
        this.J = list13;
        this.K = szbVar12;
        this.L = szbVar13;
        this.M = szbVar14;
        this.N = szbVar15;
        this.O = list14;
        this.P = szbVar16;
        this.Q = szbVar17;
        this.R = list15;
        this.S = qv9Var;
        this.T = list16;
        this.U = sq8Var;
        this.V = un8Var;
        this.W = un8Var2;
        this.X = list17;
        this.Y = list18;
        this.Z = list19;
        this.a0 = szbVar18;
        this.b0 = l1aVar;
        this.c0 = list20;
        this.d0 = bk9Var2;
    }

    @Override // defpackage.dp8
    public final un8 A() {
        return this.V;
    }

    @Override // defpackage.dp8
    public final List B() {
        return this.h;
    }

    @Override // defpackage.dp8
    public final op8 C() {
        return this.l;
    }

    @Override // defpackage.dp8
    public final un8 D() {
        return this.W;
    }

    @Override // defpackage.dp8
    public final sq8 E() {
        return this.U;
    }

    public final int F() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num = this.e0;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(i29.class).hashCode();
        int i19 = 0;
        tc8 tc8Var = this.a;
        int b = hashCode + (tc8Var != null ? tc8Var.b() : 0);
        bd8 bd8Var = this.b;
        int b2 = this.c.b() + b + (bd8Var != null ? bd8Var.b() : 0);
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((bd8) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i20 = b2 + i;
        szb szbVar = this.e;
        int hashCode2 = i20 + (szbVar != null ? szbVar.hashCode() : 0);
        szb szbVar2 = this.f;
        int hashCode3 = this.g.hashCode() + hashCode2 + (szbVar2 != null ? szbVar2.hashCode() : 0);
        List list2 = this.h;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                i2 += ((bn8) it2.next()).b();
            }
        } else {
            i2 = 0;
        }
        int i21 = hashCode3 + i2;
        zx8 zx8Var = this.i;
        int b3 = i21 + (zx8Var != null ? zx8Var.b() : 0);
        do8 do8Var = this.j;
        int b4 = b3 + (do8Var != null ? do8Var.b() : 0);
        List list3 = this.k;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                i3 += ((mo8) it3.next()).b();
            }
        } else {
            i3 = 0;
        }
        int i22 = b4 + i3;
        op8 op8Var = this.l;
        int hashCode4 = this.m.hashCode() + i22 + (op8Var != null ? op8Var.b() : 0);
        szb szbVar3 = this.n;
        int hashCode5 = this.p.hashCode() + this.o.hashCode() + hashCode4 + (szbVar3 != null ? szbVar3.hashCode() : 0);
        List list4 = this.q;
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            i4 = 0;
            while (it4.hasNext()) {
                i4 += ((tw8) it4.next()).g();
            }
        } else {
            i4 = 0;
        }
        int i23 = hashCode5 + i4;
        List list5 = this.r;
        if (list5 != null) {
            Iterator it5 = list5.iterator();
            i5 = 0;
            while (it5.hasNext()) {
                i5 += ((bd8) it5.next()).b();
            }
        } else {
            i5 = 0;
        }
        int i24 = i23 + i5;
        List list6 = this.s;
        if (list6 != null) {
            Iterator it6 = list6.iterator();
            i6 = 0;
            while (it6.hasNext()) {
                i6 += ((rx8) it6.next()).b();
            }
        } else {
            i6 = 0;
        }
        int i25 = i24 + i6;
        List list7 = this.t;
        if (list7 != null) {
            Iterator it7 = list7.iterator();
            i7 = 0;
            while (it7.hasNext()) {
                i7 += ((hy8) it7.next()).b();
            }
        } else {
            i7 = 0;
        }
        int i26 = i25 + i7;
        wz8 wz8Var = this.u;
        int b5 = i26 + (wz8Var != null ? wz8Var.b() : 0);
        List list8 = this.v;
        if (list8 != null) {
            Iterator it8 = list8.iterator();
            i8 = 0;
            while (it8.hasNext()) {
                i8 += ((g09) it8.next()).b();
            }
        } else {
            i8 = 0;
        }
        int hashCode6 = this.x.hashCode() + this.w.b() + b5 + i8;
        List list9 = this.y;
        if (list9 != null) {
            Iterator it9 = list9.iterator();
            i9 = 0;
            while (it9.hasNext()) {
                i9 += ((bd8) it9.next()).b();
            }
        } else {
            i9 = 0;
        }
        int i27 = hashCode6 + i9;
        List list10 = this.z;
        if (list10 != null) {
            Iterator it10 = list10.iterator();
            i10 = 0;
            while (it10.hasNext()) {
                i10 += ((bd8) it10.next()).b();
            }
        } else {
            i10 = 0;
        }
        int i28 = i27 + i10;
        String str = this.A;
        int hashCode7 = this.B.hashCode() + i28 + (str != null ? str.hashCode() : 0);
        w79 w79Var = this.C;
        int b6 = hashCode7 + (w79Var != null ? w79Var.b() : 0);
        List list11 = this.D;
        if (list11 != null) {
            Iterator it11 = list11.iterator();
            i11 = 0;
            while (it11.hasNext()) {
                i11 += ((bd8) it11.next()).b();
            }
        } else {
            i11 = 0;
        }
        int i29 = b6 + i11;
        ix8 ix8Var = this.E;
        int b7 = i29 + (ix8Var != null ? ix8Var.b() : 0);
        ix8 ix8Var2 = this.F;
        int hashCode8 = this.H.hashCode() + this.G.hashCode() + b7 + (ix8Var2 != null ? ix8Var2.b() : 0);
        List list12 = this.I;
        if (list12 != null) {
            Iterator it12 = list12.iterator();
            i12 = 0;
            while (it12.hasNext()) {
                i12 += ((bd8) it12.next()).b();
            }
        } else {
            i12 = 0;
        }
        int i30 = hashCode8 + i12;
        List list13 = this.J;
        if (list13 != null) {
            Iterator it13 = list13.iterator();
            i13 = 0;
            while (it13.hasNext()) {
                i13 += ((bd8) it13.next()).b();
            }
        } else {
            i13 = 0;
        }
        int i31 = i30 + i13;
        szb szbVar4 = this.K;
        int hashCode9 = i31 + (szbVar4 != null ? szbVar4.hashCode() : 0);
        szb szbVar5 = this.L;
        int hashCode10 = hashCode9 + (szbVar5 != null ? szbVar5.hashCode() : 0);
        szb szbVar6 = this.M;
        int hashCode11 = this.N.hashCode() + hashCode10 + (szbVar6 != null ? szbVar6.hashCode() : 0);
        List list14 = this.O;
        if (list14 != null) {
            Iterator it14 = list14.iterator();
            i14 = 0;
            while (it14.hasNext()) {
                i14 += ((bd8) it14.next()).b();
            }
        } else {
            i14 = 0;
        }
        int i32 = hashCode11 + i14;
        szb szbVar7 = this.P;
        int hashCode12 = this.Q.hashCode() + i32 + (szbVar7 != null ? szbVar7.hashCode() : 0);
        List list15 = this.R;
        if (list15 != null) {
            Iterator it15 = list15.iterator();
            i15 = 0;
            while (it15.hasNext()) {
                i15 += ((iu9) it15.next()).b();
            }
        } else {
            i15 = 0;
        }
        int i33 = hashCode12 + i15;
        qv9 qv9Var = this.S;
        int b8 = i33 + (qv9Var != null ? qv9Var.b() : 0);
        List list16 = this.T;
        if (list16 != null) {
            Iterator it16 = list16.iterator();
            i16 = 0;
            while (it16.hasNext()) {
                i16 += ((xv9) it16.next()).b();
            }
        } else {
            i16 = 0;
        }
        int i34 = b8 + i16;
        sq8 sq8Var = this.U;
        int b9 = i34 + (sq8Var != null ? sq8Var.b() : 0);
        un8 un8Var = this.V;
        int b10 = b9 + (un8Var != null ? un8Var.b() : 0);
        un8 un8Var2 = this.W;
        int b11 = b10 + (un8Var2 != null ? un8Var2.b() : 0);
        List list17 = this.X;
        int hashCode13 = b11 + (list17 != null ? list17.hashCode() : 0);
        List list18 = this.Y;
        if (list18 != null) {
            Iterator it17 = list18.iterator();
            i17 = 0;
            while (it17.hasNext()) {
                i17 += ((ix9) it17.next()).b();
            }
        } else {
            i17 = 0;
        }
        int i35 = hashCode13 + i17;
        List list19 = this.Z;
        if (list19 != null) {
            Iterator it18 = list19.iterator();
            i18 = 0;
            while (it18.hasNext()) {
                i18 += ((zy9) it18.next()).b();
            }
        } else {
            i18 = 0;
        }
        int hashCode14 = this.a0.hashCode() + i35 + i18;
        l1a l1aVar = this.b0;
        int g = hashCode14 + (l1aVar != null ? l1aVar.g() : 0);
        List list20 = this.c0;
        if (list20 != null) {
            Iterator it19 = list20.iterator();
            while (it19.hasNext()) {
                i19 += ((l1a) it19.next()).g();
            }
        }
        int b12 = this.d0.b() + g + i19;
        this.e0 = Integer.valueOf(b12);
        return b12;
    }

    @Override // defpackage.dp8
    public final bk9 a() {
        return this.w;
    }

    @Override // defpackage.dp8
    public final szb b() {
        return this.g;
    }

    @Override // defpackage.dp8
    public final bk9 c() {
        return this.d0;
    }

    @Override // defpackage.dp8
    public final List d() {
        return this.k;
    }

    @Override // defpackage.dp8
    public final List e() {
        return this.q;
    }

    @Override // defpackage.dp8
    public final qv9 f() {
        return this.S;
    }

    @Override // defpackage.dp8
    public final List g() {
        return this.c0;
    }

    @Override // defpackage.dp8
    public final String getId() {
        return this.A;
    }

    @Override // defpackage.dp8
    public final szb getVisibility() {
        return this.a0;
    }

    @Override // defpackage.dp8
    public final szb h() {
        return this.n;
    }

    @Override // defpackage.dp8
    public final List i() {
        return this.Z;
    }

    @Override // defpackage.dp8
    public final ix8 j() {
        return this.E;
    }

    @Override // defpackage.dp8
    public final szb k() {
        return this.M;
    }

    @Override // defpackage.dp8
    public final List l() {
        return this.X;
    }

    @Override // defpackage.dp8
    public final szb m() {
        return this.L;
    }

    @Override // defpackage.dp8
    public final List n() {
        return this.s;
    }

    @Override // defpackage.dp8
    public final szb o() {
        return this.f;
    }

    @Override // defpackage.dp8
    public final wz8 p() {
        return this.u;
    }

    @Override // defpackage.dp8
    public final tc8 q() {
        return this.a;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((w29) rj3.b.j4.getValue()).b(rj3.a, this);
    }

    @Override // defpackage.dp8
    public final ix8 s() {
        return this.F;
    }

    @Override // defpackage.dp8
    public final List t() {
        return this.O;
    }

    @Override // defpackage.dp8
    public final szb u() {
        return this.e;
    }

    @Override // defpackage.dp8
    public final w79 v() {
        return this.C;
    }

    @Override // defpackage.dp8
    public final List w() {
        return this.Y;
    }

    @Override // defpackage.dp8
    public final List x() {
        return this.R;
    }

    @Override // defpackage.dp8
    public final l1a y() {
        return this.b0;
    }

    @Override // defpackage.dp8
    public final List z() {
        return this.v;
    }
}
