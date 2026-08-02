package com.squareup.cash.bitcoin.views.applet.disclosure;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes5.dex */
public abstract class BitcoinDisclosureWidgetViewKt {
    static {
        new BitcoinHomeDisclosureWidgetViewModel("Some Disclosure with [link](https://www.cashapp.com)", "https://www.cashapp.com");
    }

    public static final void BitcoinDisclosureWidgetView(BitcoinHomeDisclosureWidgetViewModel bitcoinHomeDisclosureWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        int access$packBytes;
        bitcoinHomeDisclosureWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1972223043);
        int i2 = i | (gapComposer2.changed(bitcoinHomeDisclosureWidgetViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = bitcoinHomeDisclosureWidgetViewModel.disclosure;
            TextStyle textStyle = Strings.getTypography(gapComposer2).bodyXSmall;
            access$packBytes = TextOverflow.access$packBytes(3, (r8 >> 8) & 255, (LineBreak.Simple >> 16) & 255);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, access$packBytes, 14680063);
            long j = Strings.getColors(gapComposer2).semantic.text.standard;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer2).linkXSmall.spanStyle, Strings.getColors(gapComposer2).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, false, 21);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, fillMaxWidth, m994copyp1EtxEg$default, j, markdownSpanValues, null, null, 0, 0, 3, gapComposer, 0, 960);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinHomeDisclosureWidgetViewModel, function1, i, 4);
        }
    }
}
