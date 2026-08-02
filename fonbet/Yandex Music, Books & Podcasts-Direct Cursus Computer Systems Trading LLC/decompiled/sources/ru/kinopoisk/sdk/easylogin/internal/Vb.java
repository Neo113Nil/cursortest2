package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aqi;
import defpackage.d85;
import defpackage.su4;
import defpackage.szf;
import defpackage.vz1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B÷\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u0004\u0012\u0006\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0004\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0006\u00107\u001a\u00020\u0004\u0012\u0006\u00108\u001a\u00020\u0004\u0012\u0006\u00109\u001a\u00020\u0004\u0012\u0006\u0010:\u001a\u00020\u0004\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020;\u0012\u0006\u0010C\u001a\u00020;¢\u0006\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/Vb;", "", "", "isLight", "Ld85;", "buttonPrimary", "buttonSecondary", "buttonExtraOne", "buttonInverted", "buttonExtraTwo", "surfaceInverted", "surfaceHighlight", "surfaceOne", "surfaceTwo", "surfaceFour", "surfaceThree", "fillOne", "fillInvertedOne", "fillTwo", "fillThree", "fillFive", "fillSix", "fillSeven", "fillFour", "fillEight", "fillTen", "fillNine", "top10Purple", "plusViolet", "accentBad", "accentSoSo", "accentBlueLagoon", "accentPurple", "accentErrorRed", "accentGood", "accentBrandSecondary", "accentSuperappBrandSecondary", "whiteTen", "whiteNine", "whiteEight", "whiteSeven", "whiteSix", "whiteFive", "whiteFour", "whiteThree", "whiteTwo", "whiteOne", "blackTen", "blackNine", "blackEight", "blackSeven", "blackSix", "blackFive", "blackFour", "blackThree", "blackTwo", "blackOne", "plusVioletAccent", "plusVioletCustom", "Lru/kinopoisk/sdk/easylogin/internal/d6;", "accentBrand", "plusMain", "plusGlyphSeparate", "Lru/kinopoisk/sdk/easylogin/internal/a9;", "extraDiscoRadial", "extraDiscoRadialDark", "extraGold", "extraGoldDark", "<init>", "(ZJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLru/kinopoisk/sdk/easylogin/internal/d6;Lru/kinopoisk/sdk/easylogin/internal/d6;Lru/kinopoisk/sdk/easylogin/internal/d6;Lru/kinopoisk/sdk/easylogin/internal/a9;Lru/kinopoisk/sdk/easylogin/internal/a9;Lru/kinopoisk/sdk/easylogin/internal/d6;Lru/kinopoisk/sdk/easylogin/internal/d6;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "android_ui_uikit_mobilebase"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class Vb {

    @NotNull
    public final aqi A;

    @NotNull
    public final aqi B;

    @NotNull
    public final aqi C;

    @NotNull
    public final aqi D;

    @NotNull
    public final aqi E;

    @NotNull
    public final aqi F;

    @NotNull
    public final aqi G;

    @NotNull
    public final aqi H;

    @NotNull
    public final aqi I;

    @NotNull
    public final aqi J;

    @NotNull
    public final aqi K;

    @NotNull
    public final aqi L;

    @NotNull
    public final aqi M;

    @NotNull
    public final aqi N;

    @NotNull
    public final aqi O;

    @NotNull
    public final aqi P;

    @NotNull
    public final aqi Q;

    @NotNull
    public final aqi R;

    @NotNull
    public final aqi S;

    @NotNull
    public final aqi T;

    @NotNull
    public final aqi U;

    @NotNull
    public final aqi V;

    @NotNull
    public final aqi W;

    @NotNull
    public final aqi X;

    @NotNull
    public final aqi Y;

    @NotNull
    public final aqi Z;

    @NotNull
    public final aqi a;

    @NotNull
    public final aqi a0;

    @NotNull
    public final aqi b;

    @NotNull
    public final aqi b0;

    @NotNull
    public final aqi c;

    @NotNull
    public final aqi c0;

    @NotNull
    public final aqi d;

    @NotNull
    public final aqi d0;

    @NotNull
    public final aqi e;

    @NotNull
    public final aqi e0;

    @NotNull
    public final aqi f;

    @NotNull
    public final aqi f0;

    @NotNull
    public final aqi g;

    @NotNull
    public final aqi g0;

    @NotNull
    public final aqi h;

    @NotNull
    public final aqi h0;

    @NotNull
    public final aqi i;

    @NotNull
    public final aqi i0;

    @NotNull
    public final aqi j;

    @NotNull
    public final aqi j0;

    @NotNull
    public final aqi k;

    @NotNull
    public final aqi l;

    @NotNull
    public final aqi m;

    @NotNull
    public final aqi n;

    @NotNull
    public final aqi o;

    @NotNull
    public final aqi p;

    @NotNull
    public final aqi q;

    @NotNull
    public final aqi r;

    @NotNull
    public final aqi s;

    @NotNull
    public final aqi t;

    @NotNull
    public final aqi u;

    @NotNull
    public final aqi v;

    @NotNull
    public final aqi w;

    @NotNull
    public final aqi x;

    @NotNull
    public final aqi y;

    @NotNull
    public final aqi z;

    public Vb(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, C1009d6 c1009d6, C1009d6 c1009d62, C1009d6 c1009d63, C0970a9 c0970a9, C0970a9 c0970a92, C1009d6 c1009d64, C1009d6 c1009d65, DefaultConstructorMarker defaultConstructorMarker) {
        c1009d6.getClass();
        c1009d62.getClass();
        c1009d63.getClass();
        c0970a9.getClass();
        c0970a92.getClass();
        c1009d64.getClass();
        c1009d65.getClass();
        this.a = szf.g0(Boolean.valueOf(z));
        this.b = vz1.j(j);
        this.c = vz1.j(j2);
        this.d = vz1.j(j3);
        this.e = vz1.j(j4);
        this.f = vz1.j(j5);
        this.g = vz1.j(j6);
        this.h = vz1.j(j7);
        this.i = vz1.j(j8);
        this.j = vz1.j(j9);
        this.k = vz1.j(j10);
        this.l = vz1.j(j11);
        this.m = vz1.j(j12);
        this.n = vz1.j(j13);
        this.o = vz1.j(j14);
        this.p = vz1.j(j15);
        this.q = vz1.j(j16);
        this.r = vz1.j(j17);
        this.s = vz1.j(j18);
        this.t = vz1.j(j19);
        this.u = vz1.j(j20);
        this.v = vz1.j(j21);
        this.w = vz1.j(j22);
        this.x = vz1.j(j23);
        this.y = vz1.j(j24);
        this.z = vz1.j(j25);
        this.A = vz1.j(j26);
        this.B = vz1.j(j27);
        this.C = vz1.j(j28);
        this.D = vz1.j(j29);
        this.E = vz1.j(j30);
        this.F = vz1.j(j31);
        this.G = vz1.j(j32);
        this.H = vz1.j(j33);
        this.I = vz1.j(j34);
        this.J = vz1.j(j35);
        this.K = vz1.j(j36);
        this.L = vz1.j(j37);
        this.M = vz1.j(j38);
        this.N = vz1.j(j39);
        this.O = vz1.j(j40);
        this.P = vz1.j(j41);
        this.Q = vz1.j(j42);
        this.R = vz1.j(j43);
        this.S = vz1.j(j44);
        this.T = vz1.j(j45);
        this.U = vz1.j(j46);
        this.V = vz1.j(j47);
        this.W = vz1.j(j48);
        this.X = vz1.j(j49);
        this.Y = vz1.j(j50);
        this.Z = vz1.j(j51);
        this.a0 = vz1.j(j52);
        this.b0 = vz1.j(j53);
        this.c0 = vz1.j(j54);
        this.d0 = szf.g0(c1009d6);
        this.e0 = szf.g0(c1009d62);
        this.f0 = szf.g0(c1009d63);
        this.g0 = szf.g0(c0970a9);
        this.h0 = szf.g0(c0970a92);
        this.i0 = szf.g0(c1009d64);
        this.j0 = szf.g0(c1009d65);
    }

    public static Vb a(Vb vb) {
        boolean booleanValue = ((Boolean) vb.a.getValue()).booleanValue();
        long j = ((d85) vb.b.getValue()).a;
        long j2 = ((d85) vb.c.getValue()).a;
        long j3 = ((d85) vb.d.getValue()).a;
        long j4 = ((d85) vb.e.getValue()).a;
        long j5 = ((d85) vb.f.getValue()).a;
        long j6 = ((d85) vb.g.getValue()).a;
        long j7 = ((d85) vb.h.getValue()).a;
        long j8 = ((d85) vb.i.getValue()).a;
        long j9 = ((d85) vb.j.getValue()).a;
        long j10 = ((d85) vb.k.getValue()).a;
        long j11 = ((d85) vb.l.getValue()).a;
        long j12 = ((d85) vb.m.getValue()).a;
        long j13 = ((d85) vb.n.getValue()).a;
        long j14 = ((d85) vb.o.getValue()).a;
        long j15 = ((d85) vb.p.getValue()).a;
        long j16 = ((d85) vb.q.getValue()).a;
        long j17 = ((d85) vb.r.getValue()).a;
        long j18 = ((d85) vb.s.getValue()).a;
        long j19 = ((d85) vb.t.getValue()).a;
        long j20 = ((d85) vb.u.getValue()).a;
        long j21 = ((d85) vb.v.getValue()).a;
        long j22 = ((d85) vb.w.getValue()).a;
        long j23 = ((d85) vb.x.getValue()).a;
        long j24 = ((d85) vb.y.getValue()).a;
        long j25 = ((d85) vb.z.getValue()).a;
        long j26 = ((d85) vb.A.getValue()).a;
        long j27 = ((d85) vb.B.getValue()).a;
        long j28 = ((d85) vb.C.getValue()).a;
        long j29 = ((d85) vb.D.getValue()).a;
        long j30 = ((d85) vb.E.getValue()).a;
        long j31 = ((d85) vb.F.getValue()).a;
        long j32 = ((d85) vb.G.getValue()).a;
        long j33 = ((d85) vb.H.getValue()).a;
        long j34 = ((d85) vb.I.getValue()).a;
        long j35 = ((d85) vb.J.getValue()).a;
        long j36 = ((d85) vb.K.getValue()).a;
        long j37 = ((d85) vb.L.getValue()).a;
        long j38 = ((d85) vb.M.getValue()).a;
        long j39 = ((d85) vb.N.getValue()).a;
        long j40 = ((d85) vb.O.getValue()).a;
        long j41 = ((d85) vb.P.getValue()).a;
        long j42 = ((d85) vb.Q.getValue()).a;
        long j43 = ((d85) vb.R.getValue()).a;
        long j44 = ((d85) vb.S.getValue()).a;
        long j45 = ((d85) vb.T.getValue()).a;
        long j46 = ((d85) vb.U.getValue()).a;
        long j47 = ((d85) vb.V.getValue()).a;
        long j48 = ((d85) vb.W.getValue()).a;
        long j49 = ((d85) vb.X.getValue()).a;
        long j50 = ((d85) vb.Y.getValue()).a;
        long j51 = ((d85) vb.Z.getValue()).a;
        long j52 = ((d85) vb.a0.getValue()).a;
        long j53 = ((d85) vb.b0.getValue()).a;
        long j54 = ((d85) vb.c0.getValue()).a;
        C1009d6 c1009d6 = (C1009d6) vb.d0.getValue();
        C1009d6 c1009d62 = (C1009d6) vb.e0.getValue();
        C1009d6 c1009d63 = (C1009d6) vb.f0.getValue();
        C0970a9 c0970a9 = (C0970a9) vb.g0.getValue();
        C0970a9 c0970a92 = (C0970a9) vb.h0.getValue();
        C1009d6 c1009d64 = (C1009d6) vb.i0.getValue();
        C1009d6 c1009d65 = (C1009d6) vb.j0.getValue();
        c1009d6.getClass();
        c1009d62.getClass();
        c1009d63.getClass();
        c0970a9.getClass();
        c0970a92.getClass();
        c1009d64.getClass();
        c1009d65.getClass();
        return new Vb(booleanValue, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, c1009d6, c1009d62, c1009d63, c0970a9, c0970a92, c1009d64, c1009d65, null);
    }

    public final long b() {
        return ((d85) this.D.getValue()).a;
    }

    public final long c() {
        return ((d85) this.q.getValue()).a;
    }

    public final long d() {
        return ((d85) this.t.getValue()).a;
    }

    public final long e() {
        return ((d85) this.w.getValue()).a;
    }

    public final long f() {
        return ((d85) this.m.getValue()).a;
    }

    public final long g() {
        return ((d85) this.s.getValue()).a;
    }

    public final long h() {
        return ((d85) this.r.getValue()).a;
    }

    public final long i() {
        return ((d85) this.v.getValue()).a;
    }

    public final long j() {
        return ((d85) this.j.getValue()).a;
    }

    public final boolean k() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    @NotNull
    public final String toString() {
        boolean booleanValue = ((Boolean) this.a.getValue()).booleanValue();
        String i = d85.i(((d85) this.b.getValue()).a);
        String i2 = d85.i(((d85) this.c.getValue()).a);
        String i3 = d85.i(((d85) this.d.getValue()).a);
        String i4 = d85.i(((d85) this.e.getValue()).a);
        String i5 = d85.i(((d85) this.f.getValue()).a);
        String i6 = d85.i(((d85) this.g.getValue()).a);
        String i7 = d85.i(((d85) this.h.getValue()).a);
        String i8 = d85.i(((d85) this.i.getValue()).a);
        String i9 = d85.i(((d85) this.j.getValue()).a);
        String i10 = d85.i(((d85) this.k.getValue()).a);
        String i11 = d85.i(((d85) this.l.getValue()).a);
        String i12 = d85.i(((d85) this.m.getValue()).a);
        String i13 = d85.i(((d85) this.n.getValue()).a);
        String i14 = d85.i(((d85) this.o.getValue()).a);
        String i15 = d85.i(((d85) this.p.getValue()).a);
        String i16 = d85.i(((d85) this.q.getValue()).a);
        String i17 = d85.i(((d85) this.r.getValue()).a);
        String i18 = d85.i(((d85) this.s.getValue()).a);
        String i19 = d85.i(((d85) this.t.getValue()).a);
        String i20 = d85.i(((d85) this.u.getValue()).a);
        String i21 = d85.i(((d85) this.v.getValue()).a);
        String i22 = d85.i(((d85) this.w.getValue()).a);
        String i23 = d85.i(((d85) this.x.getValue()).a);
        String i24 = d85.i(((d85) this.y.getValue()).a);
        String i25 = d85.i(((d85) this.z.getValue()).a);
        String i26 = d85.i(((d85) this.A.getValue()).a);
        String i27 = d85.i(((d85) this.B.getValue()).a);
        String i28 = d85.i(((d85) this.C.getValue()).a);
        String i29 = d85.i(((d85) this.D.getValue()).a);
        String i30 = d85.i(((d85) this.E.getValue()).a);
        String i31 = d85.i(((d85) this.F.getValue()).a);
        String i32 = d85.i(((d85) this.G.getValue()).a);
        String i33 = d85.i(((d85) this.H.getValue()).a);
        String i34 = d85.i(((d85) this.I.getValue()).a);
        String i35 = d85.i(((d85) this.J.getValue()).a);
        String i36 = d85.i(((d85) this.K.getValue()).a);
        String i37 = d85.i(((d85) this.L.getValue()).a);
        String i38 = d85.i(((d85) this.M.getValue()).a);
        String i39 = d85.i(((d85) this.N.getValue()).a);
        String i40 = d85.i(((d85) this.O.getValue()).a);
        String i41 = d85.i(((d85) this.P.getValue()).a);
        String i42 = d85.i(((d85) this.Q.getValue()).a);
        String i43 = d85.i(((d85) this.R.getValue()).a);
        String i44 = d85.i(((d85) this.S.getValue()).a);
        String i45 = d85.i(((d85) this.T.getValue()).a);
        String i46 = d85.i(((d85) this.U.getValue()).a);
        String i47 = d85.i(((d85) this.V.getValue()).a);
        String i48 = d85.i(((d85) this.W.getValue()).a);
        String i49 = d85.i(((d85) this.X.getValue()).a);
        String i50 = d85.i(((d85) this.Y.getValue()).a);
        String i51 = d85.i(((d85) this.Z.getValue()).a);
        String i52 = d85.i(((d85) this.a0.getValue()).a);
        String i53 = d85.i(((d85) this.b0.getValue()).a);
        String i54 = d85.i(((d85) this.c0.getValue()).a);
        C1009d6 c1009d6 = (C1009d6) this.d0.getValue();
        C1009d6 c1009d62 = (C1009d6) this.e0.getValue();
        C1009d6 c1009d63 = (C1009d6) this.f0.getValue();
        C1009d6 c1009d64 = (C1009d6) this.i0.getValue();
        C1009d6 c1009d65 = (C1009d6) this.j0.getValue();
        StringBuilder sb = new StringBuilder("UiKitColors(isLight=");
        sb.append(booleanValue);
        sb.append(", buttonPrimary=");
        sb.append(i);
        sb.append(", buttonSecondary=");
        su4.v(sb, i2, ", buttonExtraOne=", i3, ", buttonInverted=");
        su4.v(sb, i4, ", buttonExtraTwo=", i5, ", surfaceInverted=");
        su4.v(sb, i6, ", surfaceHighlight=", i7, ", surfaceOne=");
        su4.v(sb, i8, ", surfaceTwo=", i9, ", surfaceFour=");
        su4.v(sb, i10, ", surfaceThree=", i11, ", fillOne=");
        su4.v(sb, i12, ", fillInvertedOne=", i13, ", fillTwo=");
        su4.v(sb, i14, ", fillThree=", i15, ", fillFive=");
        su4.v(sb, i16, ", fillSix=", i17, ", fillSeven=");
        su4.v(sb, i18, ", fillFour=", i19, ", fillEight=");
        su4.v(sb, i20, ", fillTen=", i21, ", fillNine=");
        su4.v(sb, i22, ", top10Purple=", i23, ", plusViolet=");
        su4.v(sb, i24, ", accentBad=", i25, ", accentSoSo=");
        su4.v(sb, i26, ", accentBlueLagoon=", i27, ", accentPurple=");
        su4.v(sb, i28, ", accentErrorRed=", i29, ", accentGood=");
        su4.v(sb, i30, ", accentBrandSecondary=", i31, ", accentSuperappBrandSecondary=");
        su4.v(sb, i32, ", whiteTen=", i33, ", whiteNine=");
        su4.v(sb, i34, ", whiteEight=", i35, ", whiteSeven=");
        su4.v(sb, i36, ", whiteSix=", i37, ", whiteFive=");
        su4.v(sb, i38, ", whiteFour=", i39, ", whiteThree=");
        su4.v(sb, i40, ", whiteTwo=", i41, ", whiteOne=");
        su4.v(sb, i42, ", blackTen=", i43, ", blackNine=");
        su4.v(sb, i44, ", blackEight=", i45, ", blackSeven=");
        su4.v(sb, i46, ", blackSix=", i47, ", blackFive=");
        su4.v(sb, i48, ", blackFour=", i49, ", blackThree=");
        su4.v(sb, i50, ", blackTwo=", i51, ", blackOne=");
        su4.v(sb, i52, ", plusVioletAccent=", i53, ", plusVioletCustom=");
        sb.append(i54);
        sb.append("accentBrand=");
        sb.append(c1009d6);
        sb.append(", plusMain=");
        sb.append(c1009d62);
        sb.append(", plusGlyphSeparate=");
        sb.append(c1009d63);
        sb.append(", extraGold=");
        sb.append(c1009d64);
        sb.append(", extraGoldDark=");
        sb.append(c1009d65);
        sb.append(")");
        return sb.toString();
    }

    public final long a() {
        return ((d85) this.z.getValue()).a;
    }
}
