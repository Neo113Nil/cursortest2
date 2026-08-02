package com.squareup.cash.amountslider;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda4;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ChangeCurrencyAmountCaptionKt {
    public static final Pair SPACER_SMALL_CONTENT = new Pair("Spacer", new InlineTextContent(new Placeholder(7, Room.getSp(4), Room.getSp(0)), TickersAmountCaptionKt.f141lambda$1982236353));
    public static final Pair SWITCHER_ICON_CONTENT = new Pair("Switcher icon", new InlineTextContent(new Placeholder(4, Room.getSp(16), Room.getSp(16)), TickersAmountCaptionKt.lambda$663561872));

    public static final void ChangeCurrencyAmountCaption(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        Modifier modifier2;
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2097499151);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean z = (i3 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new y0$$ExternalSyntheticLambda0(27, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default, false, null, null, (Function0) rememberedValue, 15);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(str);
            Pair pair = SPACER_SMALL_CONTENT;
            KeyMappingKt.appendInlineContent(builder, (String) pair.first, "�");
            Pair pair2 = SWITCHER_ICON_CONTENT;
            KeyMappingKt.appendInlineContent(builder, (String) pair2.first, "�");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1164Text25TpFw(0, 0, 0, 3, 0, 48, 1780, colors.semantic.text.brand, (Composer) gapComposer, m183clickableoSLSa3U$default, annotatedString, (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsKt.mapOf(pair2, pair), (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteErrorDialogKt$$ExternalSyntheticLambda4(str, modifier2, function0, i);
        }
    }
}
