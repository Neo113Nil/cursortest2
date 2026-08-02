package com.squareup.cash.bitcoin.views.exchange;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda2;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class BitcoinExchangeSubtitleKt {
    public static final Pair SPACER_SMALL_CONTENT = new Pair("Spacer", new InlineTextContent(new Placeholder(7, Room.getSp(8), Room.getSp(0)), BitcoinExchangeViewKt.lambda$746500205));
    public static final Pair RECURRING_ICON_CONTENT = new Pair("Recurring icon", new InlineTextContent(new Placeholder(7, Room.getSp(16), Room.getSp(16)), BitcoinExchangeViewKt.lambda$1817449382));

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0038  */
    /* renamed from: BitcoinExchangeSubtitle-5stqomU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3418BitcoinExchangeSubtitle5stqomU(BitcoinTransferViewModel.Content.Subtitle subtitle, int i, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        RecomposeScopeImpl endRestartGroup;
        subtitle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1482724041);
        int i7 = i2 | (gapComposer.changedInstance(subtitle) ? 4 : 2);
        if ((i3 & 2) == 0) {
            i4 = i;
            if (gapComposer.changed(i4)) {
                i5 = 32;
                i6 = i7 | i5;
                if (gapComposer.shouldExecute(i6 & 1, (i6 & 19) == 18)) {
                    gapComposer.skipToGroupEnd();
                } else {
                    gapComposer.startDefaults();
                    if ((i2 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                        gapComposer.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i6 &= -113;
                        }
                    } else if ((i3 & 2) != 0) {
                        i6 &= -113;
                        i4 = 1;
                    }
                    gapComposer.endDefaults();
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    BitcoinTransferViewModel.Content.Icon icon = subtitle.icon;
                    BitcoinTransferViewModel.Content.Icon icon2 = BitcoinTransferViewModel.Content.Icon.RECURRING;
                    Pair pair = SPACER_SMALL_CONTENT;
                    Pair pair2 = RECURRING_ICON_CONTENT;
                    if (icon == icon2) {
                        KeyMappingKt.appendInlineContent(builder, (String) pair2.first, "�");
                        KeyMappingKt.appendInlineContent(builder, (String) pair.first, "�");
                    }
                    builder.append(subtitle.label);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    Map mapOf = MapsKt__MapsKt.mapOf(pair2, pair);
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    int i8 = i4;
                    Room.m1164Text25TpFw(0, 0, 0, i8, (i6 << 21) & 234881024, 48, 1778, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, annotatedString, textStyle, (TextLineBalancing) null, mapOf, (Function1) null, false);
                    i4 = i8;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new ClusterItemKt$$ExternalSyntheticLambda2(subtitle, i4, i2, i3, 2);
                    return;
                }
                return;
            }
        } else {
            i4 = i;
        }
        i5 = 16;
        i6 = i7 | i5;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 19) == 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
