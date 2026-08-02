package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a3o;
import defpackage.agr;
import defpackage.ceo;
import defpackage.d85;
import defpackage.etn;
import defpackage.ff7;
import defpackage.ges;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.ild;
import defpackage.keo;
import defpackage.kes;
import defpackage.lx7;
import defpackage.nuk;
import defpackage.ocg;
import defpackage.oq5;
import defpackage.oqc;
import defpackage.otp;
import defpackage.ozm;
import defpackage.qpc;
import defpackage.qzm;
import defpackage.sn5;
import defpackage.swf;
import defpackage.tdn;
import defpackage.tpc;
import defpackage.tqc;
import defpackage.uif;
import defpackage.v7g;
import defpackage.xmn;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.R;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.sc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1224sc {

    @NotNull
    public static final ozm a = new agr(a.a);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.sc$a */
    public static final class a extends uif implements Function0<Integer> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public static Integer a() {
            return Integer.valueOf(R.drawable.ui_kit_ic_logo_kinopoisk);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return a();
        }
    }

    @NotNull
    public static final wc a(@NotNull Context context) {
        qpc b;
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.styleable.UiKitTheme);
        obtainStyledAttributes.getClass();
        tpc c = a3o.c(obtainStyledAttributes, R.styleable.UiKitTheme_defaultFontFamily);
        if (c == null || (b = c.a) == null) {
            b = zc.b();
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.UiKitTheme_isLightTheme, true);
        long b2 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_buttonPrimaryColor);
        long b3 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_buttonSecondaryColor);
        long b4 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_buttonExtraOneColor);
        long b5 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_buttonInvertedColor);
        long b6 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_buttonExtraTwoColor);
        long b7 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_surfaceInvertedColor);
        long b8 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_surfaceHighlightColor);
        long b9 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_surfaceOneColor);
        long b10 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_surfaceTwoColor);
        long b11 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_surfaceFourColor);
        long b12 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_surfaceThreeColor);
        long b13 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillOneColor);
        long b14 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillInvertedOneColor);
        long b15 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillTwoColor);
        long b16 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillThreeColor);
        long b17 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillFiveColor);
        long b18 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillSixColor);
        long b19 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillSevenColor);
        long b20 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillFourColor);
        long b21 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillEightColor);
        long b22 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillTenColor);
        long b23 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_fillNineColor);
        long b24 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_top10PurpleColor);
        long b25 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_plusVioletColor);
        long b26 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentBadColor);
        long b27 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentSoSoColor);
        long b28 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentBlueLagoonColor);
        long b29 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentPurpleColor);
        long b30 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentErrorRedColor);
        long b31 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentGoodColor);
        long b32 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentBrandSecondaryColor);
        long b33 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_accentSuperappBrandSecondaryColor);
        long b34 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteTenColor);
        long b35 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteNineColor);
        long b36 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteEightColor);
        long b37 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteSevenColor);
        long b38 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteSixColor);
        long b39 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteFiveColor);
        long b40 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteFourColor);
        long b41 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteThreeColor);
        long b42 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteTwoColor);
        long b43 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_whiteOneColor);
        long b44 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackTenColor);
        long b45 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackNineColor);
        long b46 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackEightColor);
        long b47 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackSevenColor);
        long b48 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackSixColor);
        long b49 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackFiveColor);
        long b50 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackFourColor);
        long b51 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackThreeColor);
        long b52 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackTwoColor);
        long b53 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_blackOneColor);
        long b54 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_plusVioletAccentColor);
        long b55 = a3o.b(obtainStyledAttributes, R.styleable.UiKitTheme_plusVioletCustomColor);
        ArrayList d = L4.d(context, obtainStyledAttributes, R.styleable.UiKitTheme_accentBrandGradientPoints);
        C1009d6 c1009d6 = new C1009d6(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_accentBrandGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_accentBrandGradientPositions), swf.i(((Number) d.get(0)).floatValue(), ((Number) d.get(1)).floatValue()), swf.i(((Number) d.get(2)).floatValue(), ((Number) d.get(3)).floatValue()), null);
        ArrayList d2 = L4.d(context, obtainStyledAttributes, R.styleable.UiKitTheme_plusMainGradientPoints);
        C1009d6 c1009d62 = new C1009d6(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_plusMainGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_plusMainGradientPositions), swf.i(((Number) d2.get(0)).floatValue(), ((Number) d2.get(1)).floatValue()), swf.i(((Number) d2.get(2)).floatValue(), ((Number) d2.get(3)).floatValue()), null);
        ArrayList d3 = L4.d(context, obtainStyledAttributes, R.styleable.UiKitTheme_plusGlyphSeparateGradientPoints);
        C1009d6 c1009d63 = new C1009d6(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_plusGlyphSeparateGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_plusGlyphSeparateGradientPositions), swf.i(((Number) d3.get(0)).floatValue(), ((Number) d3.get(1)).floatValue()), swf.i(((Number) d3.get(2)).floatValue(), ((Number) d3.get(3)).floatValue()), null);
        ArrayList b56 = L4.b(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialGradientCenter);
        C0970a9 c0970a9 = new C0970a9(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialGradientPositions), swf.i(((Number) b56.get(0)).floatValue(), ((Number) b56.get(1)).floatValue()), L4.a(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialGradientAngle), null);
        ArrayList b57 = L4.b(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialDarkGradientCenter);
        C0970a9 c0970a92 = new C0970a9(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialDarkGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialDarkGradientPositions), swf.i(((Number) b57.get(0)).floatValue(), ((Number) b57.get(1)).floatValue()), L4.a(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraDiscoRadialDarkGradientAngle), null);
        ArrayList d4 = L4.d(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraGoldGradientPoints);
        C1009d6 c1009d64 = new C1009d6(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraGoldGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraGoldGradientPositions), swf.i(((Number) d4.get(0)).floatValue(), ((Number) d4.get(1)).floatValue()), swf.i(((Number) d4.get(2)).floatValue(), ((Number) d4.get(3)).floatValue()), null);
        ArrayList d5 = L4.d(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraGoldDarkGradientPoints);
        Vb vb = new Vb(z, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, c1009d6, c1009d62, c1009d63, c0970a9, c0970a92, c1009d64, new C1009d6(L4.c(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraGoldDarkGradientColors), L4.e(context, obtainStyledAttributes, R.styleable.UiKitTheme_extraGoldDarkGradientPositions), swf.i(((Number) d5.get(0)).floatValue(), ((Number) d5.get(1)).floatValue()), swf.i(((Number) d5.get(2)).floatValue(), ((Number) d5.get(3)).floatValue()), null), null);
        int i = R.styleable.UiKitTheme_textAppearanceUiKitTitleXXLBold;
        tqc tqcVar = tqc.p;
        ges a2 = a(context, obtainStyledAttributes, b, i, tqcVar);
        int i2 = R.styleable.UiKitTheme_textAppearanceUiKitTitleXXLSemibold;
        tqc tqcVar2 = tqc.o;
        ges a3 = a(context, obtainStyledAttributes, b, i2, tqcVar2);
        int i3 = R.styleable.UiKitTheme_textAppearanceUiKitTitleXXLMedium;
        tqc tqcVar3 = tqc.n;
        ges a4 = a(context, obtainStyledAttributes, b, i3, tqcVar3);
        ges a5 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleLBold, tqcVar);
        ges a6 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleLSemibold, tqcVar2);
        ges a7 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleLMedium, tqcVar3);
        ges a8 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleMBold, tqcVar);
        ges a9 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleMSemibold, tqcVar2);
        ges a10 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleMMedium, tqcVar3);
        ges a11 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleSBold, tqcVar);
        ges a12 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleSSemibold, tqcVar2);
        ges a13 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleSMedium, tqcVar3);
        ges a14 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleXSBold, tqcVar);
        ges a15 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleXSSemibold, tqcVar2);
        ges a16 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTitleXSMedium, tqcVar3);
        ges a17 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextLBold, tqcVar);
        ges a18 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextLSemibold, tqcVar2);
        ges a19 = a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextLMedium, tqcVar3);
        int i4 = R.styleable.UiKitTheme_textAppearanceUiKitTextLRegular;
        tqc tqcVar4 = tqc.m;
        wc wcVar = new wc(vb, new yc(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a(context, obtainStyledAttributes, b, i4, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMBoldLoose, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMSemiboldLoose, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMMediumLoose, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMRegularLoose, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMBold, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMSemibold, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMMedium, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextMRegular, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSBoldLoose, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSSemiboldLoose, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSMediumLoose, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSRegularLoose, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSBold, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSSemibold, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSMedium, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextSRegular, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSBoldCaps, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSSemiboldCaps, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSMediumCaps, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSRegularCaps, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSBold, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSSemibold, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSMedium, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXSRegular, tqcVar4), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXXSBold, tqcVar), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXXSSemibold, tqcVar2), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXXSMedium, tqcVar3), a(context, obtainStyledAttributes, b, R.styleable.UiKitTheme_textAppearanceUiKitTextXXSRegular, tqcVar4)), P7.a(context, R.attr.placeholderDrawable));
        obtainStyledAttributes.recycle();
        return wcVar;
    }

    public static final void a(Vb vb, yc ycVar, Integer num, @NotNull sn5 sn5Var, hq5 hq5Var, int i) {
        int i2;
        sn5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-402247471);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(vb) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(ycVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(sn5Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            oq5Var.a0(2093812230);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = Vb.a(vb);
                oq5Var.k0(K);
            }
            Vb vb2 = (Vb) K;
            oq5Var.p(false);
            Wb.a(vb2, vb);
            etn.m(new qzm[]{Wb.a().a(vb2), zc.a().a(ycVar), androidx.compose.foundation.e.a.a(ceo.a(false, 0.0f, 0L, oq5Var, 0, 7)), keo.a.a(C1085ic.a), a.a(num)}, ild.s(oq5Var, -1250933359, new C1238tc(ycVar, sn5Var)), oq5Var, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uc(vb, ycVar, num, sn5Var, i);
        }
    }

    public static final void a(Context context, @NotNull sn5 sn5Var, hq5 hq5Var, int i) {
        sn5 sn5Var2;
        sn5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1828298185);
        int i2 = (i & 6) == 0 ? i | 2 : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(sn5Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            sn5Var2 = sn5Var;
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            } else {
                context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            }
            int i3 = i2 & (-15);
            oq5Var.q();
            Resources.Theme theme = context.getTheme();
            oq5Var.a0(-312318068);
            boolean f = oq5Var.f(theme);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = a(context);
                oq5Var.k0(K);
            }
            wc wcVar = (wc) K;
            oq5Var.p(false);
            sn5Var2 = sn5Var;
            a(wcVar.a, wcVar.b, wcVar.c, sn5Var2, oq5Var, (i3 << 6) & 7168);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vc(context, sn5Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ges a(Context context, TypedArray typedArray, qpc qpcVar, int i, tqc tqcVar) {
        qpc qpcVar2;
        qpc qpcVar3;
        tqc tqcVar2;
        long b;
        otp otpVar;
        long D;
        lx7 i2 = ff7.i(context);
        ocg.s(typedArray, i);
        int resourceId = typedArray.getResourceId(i, 0);
        ThreadLocal threadLocal = a3o.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, tdn.a);
        obtainStyledAttributes.getClass();
        int i3 = obtainStyledAttributes.getInt(2, -1);
        int i4 = obtainStyledAttributes.getInt(13, -1);
        int i5 = obtainStyledAttributes.getInt(1, -1);
        tpc c = a3o.c(obtainStyledAttributes, 14);
        if (c == null) {
            c = a3o.c(obtainStyledAttributes, 8);
        }
        long j = d85.n;
        long j2 = kes.c;
        long d = a3o.d(obtainStyledAttributes, 0, i2, j2);
        long d2 = a3o.d(obtainStyledAttributes, 15, i2, a3o.d(obtainStyledAttributes, 12, i2, j2));
        if (c != null) {
            qpcVar3 = c.a;
        } else if (i5 == 1) {
            qpcVar3 = qpc.b;
        } else if (i5 == 2) {
            qpcVar3 = qpc.c;
        } else if (i5 == 3) {
            qpcVar3 = qpc.d;
        } else {
            qpcVar2 = null;
            int i6 = (i3 & 2) == 0 ? 1 : 0;
            if (i4 < 0 && i4 < 150) {
                tqcVar2 = tqc.b;
            } else if (150 > i4 && i4 < 250) {
                tqcVar2 = tqc.c;
            } else if (250 > i4 && i4 < 350) {
                tqcVar2 = tqc.d;
            } else if (350 > i4 && i4 < 450) {
                tqcVar2 = tqc.e;
            } else if (450 > i4 && i4 < 550) {
                tqcVar2 = tqc.f;
            } else if (550 > i4 && i4 < 650) {
                tqcVar2 = tqc.g;
            } else if (650 > i4 && i4 < 750) {
                tqcVar2 = tqc.h;
            } else if (750 > i4 && i4 < 850) {
                tqcVar2 = tqc.i;
            } else if (850 > i4 && i4 < 1000) {
                tqcVar2 = tqc.j;
            } else if ((i3 & 1) == 0) {
                tqcVar2 = tqc.p;
            } else {
                tqcVar2 = c != null ? c.b : null;
            }
            String string = obtainStyledAttributes.getString(10);
            b = a3o.b(obtainStyledAttributes, 4);
            if (d85.c(b, j)) {
                otpVar = new otp(b, swf.i(obtainStyledAttributes.getFloat(5, 0.0f), obtainStyledAttributes.getFloat(6, 0.0f)), obtainStyledAttributes.getFloat(7, 0.0f));
            } else {
                otpVar = null;
            }
            if (!obtainStyledAttributes.hasValue(9)) {
                D = v7g.D(obtainStyledAttributes.getFloat(9, 0.0f), 8589934592L);
            } else {
                D = v7g.D(0, 8589934592L);
            }
            ges gesVar = new ges(j, d, tqcVar2, new oqc(i6), null, qpcVar2, string, D, otpVar, 0, d2, null, null, 0, 16637712);
            obtainStyledAttributes.recycle();
            nuk nukVar = new nuk(false);
            yc.V.getClass();
            ges b2 = ges.b(gesVar, 0L, 0L, tqcVar, null, 0L, 0, 0L, nukVar, yc.W, 0, 0, 15138811);
            return b2.a.f != null ? ges.b(b2, 0L, 0L, null, qpcVar, 0L, 0, 0L, null, null, 0, 0, 16777183) : b2;
        }
        qpcVar2 = qpcVar3;
        if ((i3 & 2) == 0) {
        }
        if (i4 < 0) {
        }
        if (150 > i4) {
        }
        if (250 > i4) {
        }
        if (350 > i4) {
        }
        if (450 > i4) {
        }
        if (550 > i4) {
        }
        if (650 > i4) {
        }
        if (750 > i4) {
        }
        if (850 > i4) {
        }
        if ((i3 & 1) == 0) {
        }
        String string2 = obtainStyledAttributes.getString(10);
        b = a3o.b(obtainStyledAttributes, 4);
        if (d85.c(b, j)) {
        }
        if (!obtainStyledAttributes.hasValue(9)) {
        }
        ges gesVar2 = new ges(j, d, tqcVar2, new oqc(i6), null, qpcVar2, string2, D, otpVar, 0, d2, null, null, 0, 16637712);
        obtainStyledAttributes.recycle();
        nuk nukVar2 = new nuk(false);
        yc.V.getClass();
        ges b22 = ges.b(gesVar2, 0L, 0L, tqcVar, null, 0L, 0, 0L, nukVar2, yc.W, 0, 0, 15138811);
        if (b22.a.f != null) {
        }
    }
}
