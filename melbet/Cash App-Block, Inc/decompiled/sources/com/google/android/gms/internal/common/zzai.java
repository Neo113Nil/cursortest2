package com.google.android.gms.internal.common;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class zzai {
    /* renamed from: MooncakeDiscoverText-sSOGCe0, reason: not valid java name */
    public static final void m2001MooncakeDiscoverTextsSOGCe0(Modifier modifier, Text text, TextStyle textStyle, long j, Function1 function1, int i, int i2, int i3, Map map, Composer composer, int i4) {
        TextStyle textStyle2;
        long j2;
        Function1 function12;
        int i5;
        int i6;
        Map map2;
        RecomposeScopeImpl endRestartGroup;
        ComposeUtilsKt$$ExternalSyntheticLambda1 composeUtilsKt$$ExternalSyntheticLambda1;
        Function1 function13;
        int i7;
        int i8;
        int i9;
        TextStyle textStyle3;
        long j3;
        Map map3;
        TextStyle textStyle4;
        TextStyle m994copyp1EtxEg$default;
        text.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(926545422);
        int i10 = i4 | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(text) ? 32 : 16) | 1797248 | (gapComposer.changed(i3) ? 8388608 : 4194304) | 100663296;
        if (gapComposer.shouldExecute(i10 & 1, (38347923 & i10) != 38347922)) {
            gapComposer.startDefaults();
            if ((i4 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                TextStyle currentTextStyle = MooncakeTheme.getCurrentTextStyle(gapComposer, 0);
                int i11 = i10 & (-897);
                long j4 = Color.Unspecified;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14(20);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function13 = (Function1) rememberedValue;
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                i7 = Integer.MAX_VALUE;
                i8 = i11;
                i9 = 2;
                textStyle3 = currentTextStyle;
                j3 = j4;
                map3 = emptyMap;
            } else {
                gapComposer.skipToGroupEnd();
                textStyle3 = textStyle;
                j3 = j;
                function13 = function1;
                i7 = i2;
                map3 = map;
                i8 = i10 & (-897);
                i9 = i;
            }
            gapComposer.endDefaults();
            com.squareup.protos.cash.discover.api.app.v1.model.TextStyle textStyle5 = text.text_style;
            Color color = null;
            if (textStyle5 == null) {
                gapComposer.startReplaceGroup(-279740400);
                gapComposer.end(false);
                textStyle4 = null;
            } else {
                gapComposer.startReplaceGroup(960807441);
                switch (textStyle5) {
                    case BIG_MONEY:
                        gapComposer.startReplaceGroup(-927779042);
                        MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography == null) {
                            mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography.bigMoney;
                        gapComposer.end(false);
                        break;
                    case HEADER_1:
                        gapComposer.startReplaceGroup(-927776867);
                        MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography2 == null) {
                            mooncakeTypography2 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography2.header1;
                        gapComposer.end(false);
                        break;
                    case HEADER_2:
                        gapComposer.startReplaceGroup(-927774723);
                        MooncakeTypography mooncakeTypography3 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography3 == null) {
                            mooncakeTypography3 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography3.header2;
                        gapComposer.end(false);
                        break;
                    case HEADER_3:
                        gapComposer.startReplaceGroup(-927772579);
                        MooncakeTypography mooncakeTypography4 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography4 == null) {
                            mooncakeTypography4 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography4.header3;
                        gapComposer.end(false);
                        break;
                    case HEADER_4:
                        gapComposer.startReplaceGroup(-927770435);
                        MooncakeTypography mooncakeTypography5 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography5 == null) {
                            mooncakeTypography5 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography5.header4;
                        gapComposer.end(false);
                        break;
                    case INPUT:
                        gapComposer.startReplaceGroup(-927768389);
                        MooncakeTypography mooncakeTypography6 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography6 == null) {
                            mooncakeTypography6 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography6.input;
                        gapComposer.end(false);
                        break;
                    case MAIN_TITLE:
                        gapComposer.startReplaceGroup(-927766241);
                        MooncakeTypography mooncakeTypography7 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography7 == null) {
                            mooncakeTypography7 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography7.mainTitle;
                        gapComposer.end(false);
                        break;
                    case MAIN_BODY:
                        gapComposer.startReplaceGroup(-927764002);
                        MooncakeTypography mooncakeTypography8 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography8 == null) {
                            mooncakeTypography8 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography8.mainBody;
                        gapComposer.end(false);
                        break;
                    case SMALL_TITLE:
                        gapComposer.startReplaceGroup(-927761728);
                        MooncakeTypography mooncakeTypography9 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography9 == null) {
                            mooncakeTypography9 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography9.smallTitle;
                        gapComposer.end(false);
                        break;
                    case SMALL_BODY:
                        gapComposer.startReplaceGroup(-927759425);
                        MooncakeTypography mooncakeTypography10 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography10 == null) {
                            mooncakeTypography10 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography10.smallBody;
                        gapComposer.end(false);
                        break;
                    case STRONG_CAPTION:
                        gapComposer.startReplaceGroup(-927757021);
                        MooncakeTypography mooncakeTypography11 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography11 == null) {
                            mooncakeTypography11 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography11.strongCaption;
                        gapComposer.end(false);
                        break;
                    case CAPTION:
                        gapComposer.startReplaceGroup(-927754723);
                        MooncakeTypography mooncakeTypography12 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography12 == null) {
                            mooncakeTypography12 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography12.caption;
                        gapComposer.end(false);
                        break;
                    case IDENTIFIER:
                        gapComposer.startReplaceGroup(-927752512);
                        MooncakeTypography mooncakeTypography13 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography13 == null) {
                            mooncakeTypography13 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        textStyle4 = mooncakeTypography13.identifier;
                        gapComposer.end(false);
                        break;
                    case ARCADE_KEYPAD_TOTAL:
                        gapComposer.startReplaceGroup(-927749983);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadTotal;
                        gapComposer.end(false);
                        break;
                    case ARCADE_HERO_NUMERICS:
                        gapComposer.startReplaceGroup(-927747390);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                        gapComposer.end(false);
                        break;
                    case ARCADE_HERO:
                        gapComposer.startReplaceGroup(-927745062);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).hero;
                        gapComposer.end(false);
                        break;
                    case ARCADE_HEADER:
                        gapComposer.startReplaceGroup(-927742916);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header;
                        gapComposer.end(false);
                        break;
                    case ARCADE_KEYPAD_NUMBERS:
                        gapComposer.startReplaceGroup(-927740445);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadNumbers;
                        gapComposer.end(false);
                        break;
                    case ARCADE_LARGE_LABEL:
                        gapComposer.startReplaceGroup(-927737854);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall;
                        gapComposer.end(false);
                        break;
                    case ARCADE_TAB_TITLE:
                        gapComposer.startReplaceGroup(-927735356);
                        textStyle4 = LazyGridKt.getLegacyTabTitle((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography));
                        gapComposer.end(false);
                        break;
                    case ARCADE_SECTION_TITLE:
                        gapComposer.startReplaceGroup(-927732670);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                        gapComposer.end(false);
                        break;
                    case ARCADE_PAGE_TITLE:
                        gapComposer.startReplaceGroup(-927730137);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle;
                        gapComposer.end(false);
                        break;
                    case ARCADE_LABEL:
                        gapComposer.startReplaceGroup(-927727615);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        gapComposer.end(false);
                        break;
                    case ARCADE_BODY:
                        gapComposer.startReplaceGroup(-927725312);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        gapComposer.end(false);
                        break;
                    case ARCADE_INPUT:
                        gapComposer.startReplaceGroup(-927723013);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input;
                        gapComposer.end(false);
                        break;
                    case ARCADE_BUTTON:
                        gapComposer.startReplaceGroup(-927720836);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button;
                        gapComposer.end(false);
                        break;
                    case ARCADE_COMPACT_BUTTON:
                        gapComposer.startReplaceGroup(-927718365);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact;
                        gapComposer.end(false);
                        break;
                    case ARCADE_CELL_BODY:
                        gapComposer.startReplaceGroup(-927715841);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                        gapComposer.end(false);
                        break;
                    case ARCADE_HELP_TEXT:
                        gapComposer.startReplaceGroup(-927713442);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText;
                        gapComposer.end(false);
                        break;
                    case ARCADE_DISCLAIMER:
                        gapComposer.startReplaceGroup(-927711040);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        gapComposer.end(false);
                        break;
                    case ARCADE_META_TEXT:
                        gapComposer.startReplaceGroup(-927708608);
                        textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                        gapComposer.end(false);
                        break;
                    default:
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -927779129, false);
                }
                gapComposer.end(false);
            }
            TextStyle textStyle6 = textStyle4 == null ? textStyle3 : textStyle4;
            TextDecoration textDecoration = text.text_decoration;
            if (textDecoration != null) {
                int ordinal = textDecoration.ordinal();
                if (ordinal == 0) {
                    m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle6, 0L, 0L, null, null, 0L, null, 0L, androidx.compose.ui.text.style.TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle6, 0L, 0L, null, null, 0L, null, 0L, androidx.compose.ui.text.style.TextDecoration.Underline, null, null, 0, 0L, null, null, 0, 16773119);
                }
                textStyle6 = m994copyp1EtxEg$default;
            }
            int i12 = i7;
            String str = text.text;
            if (str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    composeUtilsKt$$ExternalSyntheticLambda1 = new ComposeUtilsKt$$ExternalSyntheticLambda1(modifier, text, textStyle3, j3, function13, i9, i12, i3, map3, i4, 2);
                    endRestartGroup.block = composeUtilsKt$$ExternalSyntheticLambda1;
                }
                return;
            }
            TextStyle textStyle7 = textStyle3;
            long j5 = j3;
            int i13 = i9;
            com.squareup.protos.cash.ui.Color color2 = text.text_color;
            if (color2 == null) {
                gapComposer.startReplaceGroup(-279234356);
            } else {
                gapComposer.startReplaceGroup(960823765);
                color = ComposeUtilsKt.toComposeColor(color2, gapComposer);
            }
            gapComposer.end(false);
            long j6 = color != null ? color.value : j5;
            int i14 = i8 << 3;
            TextStyle textStyle8 = textStyle6;
            Function1 function14 = function13;
            Map map4 = map3;
            KeypadKt.m3651TextPdH14aY(i12, 0, i3, i13, (i14 & 234881024) | (i14 & 112) | 221184, 54, 704, j6, (Composer) gapComposer, modifier, textStyle8, (TextLineBalancing) null, str, map4, function14, false);
            i6 = i12;
            i5 = i13;
            map2 = map4;
            function12 = function14;
            j2 = j5;
            textStyle2 = textStyle7;
        } else {
            gapComposer.skipToGroupEnd();
            textStyle2 = textStyle;
            j2 = j;
            function12 = function1;
            i5 = i;
            i6 = i2;
            map2 = map;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            composeUtilsKt$$ExternalSyntheticLambda1 = new ComposeUtilsKt$$ExternalSyntheticLambda1(modifier, text, textStyle2, j2, function12, i5, i6, i3, map2, i4, 3);
            endRestartGroup.block = composeUtilsKt$$ExternalSyntheticLambda1;
        }
    }

    public static final Throwable getError(Async async) {
        async.getClass();
        Async.Fail fail = async instanceof Async.Fail ? (Async.Fail) async : null;
        if (fail != null) {
            return fail.error;
        }
        return null;
    }

    public static final boolean isCancellationError(Async async) {
        async.getClass();
        if (!(async instanceof Async.Fail)) {
            return false;
        }
        Throwable th = ((Async.Fail) async).error;
        if (th instanceof CancellationException) {
            return true;
        }
        return (th instanceof StripeException) && (th.getCause() instanceof CancellationException);
    }

    public static void zza(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(Boxes$$ExternalSyntheticOutline1.m(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }
}
