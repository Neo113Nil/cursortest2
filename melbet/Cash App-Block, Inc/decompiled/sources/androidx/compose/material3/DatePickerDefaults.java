package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.squareup.cash.R;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DatePickerDefaults {
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    public static final IntRange YearRange = new IntRange(1900, 2100, 1);
    public static final DatePickerDefaults$AllDates$1 AllDates = new DatePickerDefaults$AllDates$1();

    public static DatePickerColors colors(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        ColorScheme colorScheme = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
        DatePickerColors datePickerColors = colorScheme.defaultDatePickerColorsCached;
        if (datePickerColors != null) {
            gapComposer.startReplaceGroup(642290457);
            gapComposer.end(false);
            return datePickerColors;
        }
        gapComposer.startReplaceGroup(642416503);
        long fromToken = ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.ContainerColor);
        long fromToken2 = ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.HeaderSupportingTextColor);
        long fromToken3 = ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.HeaderHeadlineColor);
        long fromToken4 = ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.WeekdaysLabelTextColor);
        long fromToken5 = ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.RangeSelectionMonthSubheadColor);
        long j = colorScheme.onSurfaceVariant;
        ColorSchemeKeyTokens colorSchemeKeyTokens = DatePickerModalTokens.SelectionYearUnselectedLabelTextColor;
        long fromToken6 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens);
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens), 14);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = DatePickerModalTokens.DateTodayLabelTextColor;
        long fromToken7 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = DatePickerModalTokens.SelectionYearSelectedLabelTextColor;
        long fromToken8 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3);
        long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens3), 14);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = DatePickerModalTokens.SelectionYearSelectedContainerColor;
        long fromToken9 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4);
        long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens4), 14);
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = DatePickerModalTokens.DateUnselectedLabelTextColor;
        long fromToken10 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens5);
        long m675copywmQWz5c$default4 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens5), 14);
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = DatePickerModalTokens.DateSelectedLabelTextColor;
        long fromToken11 = ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens6);
        long m675copywmQWz5c$default5 = Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens6), 14);
        ColorSchemeKeyTokens colorSchemeKeyTokens7 = DatePickerModalTokens.DateSelectedContainerColor;
        DatePickerColors datePickerColors2 = new DatePickerColors(fromToken, fromToken2, fromToken3, fromToken4, fromToken5, j, fromToken6, m675copywmQWz5c$default, fromToken7, fromToken8, m675copywmQWz5c$default2, fromToken9, m675copywmQWz5c$default3, fromToken10, m675copywmQWz5c$default4, fromToken11, m675copywmQWz5c$default5, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens7), Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens7), 14), ColorSchemeKt.fromToken(colorScheme, colorSchemeKeyTokens2), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.DateTodayContainerOutlineColor), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.RangeSelectionActiveIndicatorContainerColor), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.SelectionDateInRangeLabelTextColor), ColorSchemeKt.fromToken(colorScheme, DividerTokens.Color), OutlinedTextFieldDefaults.getDefaultOutlinedTextFieldColors(colorScheme, gapComposer));
        colorScheme.defaultDatePickerColorsCached = datePickerColors2;
        gapComposer.end(false);
        return datePickerColors2;
    }

    /* renamed from: DatePickerHeadline-ISIPfiY, reason: not valid java name */
    public final void m522DatePickerHeadlineISIPfiY(Long l, int i, DatePickerFormatterImpl datePickerFormatterImpl, Modifier modifier, long j, Composer composer, int i2) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1913724796);
        int i3 = i2 | (gapComposer2.changed(l) ? 4 : 2) | (gapComposer2.changed(i) ? 32 : 16) | (gapComposer2.changed(datePickerFormatterImpl) ? 256 : 128) | (gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(2088426481);
            Locale locale = ((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLocales().get(0);
            gapComposer2.end(false);
            String formatDate = datePickerFormatterImpl.formatDate(l, locale, false);
            String formatDate2 = datePickerFormatterImpl.formatDate(l, locale, true);
            String str = "";
            if (formatDate2 == null) {
                gapComposer2.startReplaceGroup(380185931);
                if (i == 0) {
                    gapComposer2.startReplaceGroup(843549871);
                    formatDate2 = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_no_selection_description);
                    gapComposer2.end(false);
                } else if (i == 1) {
                    gapComposer2.startReplaceGroup(843552842);
                    formatDate2 = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_input_no_input_description);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(380407362);
                    gapComposer2.end(false);
                    formatDate2 = "";
                }
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(843542258);
                gapComposer2.end(false);
            }
            if (formatDate == null) {
                gapComposer2.startReplaceGroup(380507587);
                if (i == 0) {
                    gapComposer2.startReplaceGroup(843560257);
                    formatDate = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_headline);
                    gapComposer2.end(false);
                } else if (i == 1) {
                    gapComposer2.startReplaceGroup(843562784);
                    formatDate = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_input_headline);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(380705954);
                    gapComposer2.end(false);
                    formatDate = "";
                }
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(843557408);
                gapComposer2.end(false);
            }
            if (i == 0) {
                gapComposer2.startReplaceGroup(843570444);
                str = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_headline_description);
                gapComposer2.end(false);
            } else if (i == 1) {
                gapComposer2.startReplaceGroup(843573323);
                str = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_input_headline_description);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(381043234);
                gapComposer2.end(false);
            }
            String format2 = String.format(str, Arrays.copyOf(new Object[]{formatDate2}, 1));
            boolean changed = gapComposer2.changed(format2);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(format2, 2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            TextKt.m561TextNvy7gAk(formatDate, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue), j, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, gapComposer, (i3 >> 6) & 896, 24576, 245752);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerDefaults$$ExternalSyntheticLambda1(this, l, i, datePickerFormatterImpl, modifier, j, i2);
        }
    }

    /* renamed from: DatePickerTitle-FNtVw6o, reason: not valid java name */
    public final void m523DatePickerTitleFNtVw6o(int i, int i2, long j, Composer composer, Modifier modifier) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-390880814);
        int i3 = i2 | (gapComposer2.changed(i) ? 4 : 2) | (gapComposer2.changed(j) ? 256 : 128);
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            if (i == 0) {
                gapComposer2.startReplaceGroup(-1974299164);
                TextKt.m561TextNvy7gAk(Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_date_picker_title), modifier, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, gapComposer2, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, 0, 262136);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                if (i == 1) {
                    gapComposer.startReplaceGroup(-1974291869);
                    TextKt.m561TextNvy7gAk(Icons$Filled.m568getString2EP1pXo(gapComposer, R.string.m3c_date_input_title), modifier, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, gapComposer, i3 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, 0, 262136);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1073325776);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(this, i, modifier, j, i2);
        }
    }
}
