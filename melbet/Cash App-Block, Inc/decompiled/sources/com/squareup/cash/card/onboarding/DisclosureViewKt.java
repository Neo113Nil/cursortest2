package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class DisclosureViewKt {
    public static final void Disclosure(DisclosureViewModel disclosureViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1961550229);
        int i2 = (gapComposer.changedInstance(disclosureViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            if (rememberScrollState.getCanScrollForward()) {
                gapComposer.startReplaceGroup(782418135);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(782362397);
                Unit unit = Unit.INSTANCE;
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 6);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-72186570, new CashCardKt$$ExternalSyntheticLambda1(disclosureViewModel, function1, rememberScrollState), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 12, modifier2, disclosureViewModel, function1);
        }
    }

    public static final void DisclosureMarkdownText(String str, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1230931502);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            long j = Strings.getColors(gapComposer).semantic.text.subtle;
            boolean z = true;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).linkXSmall.spanStyle, Strings.getColors(gapComposer).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).bodyXSmall.spanStyle, Strings.getColors(gapComposer).semantic.text.standard, null, 0L, JpegConstants.COM_MARKER));
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m300paddingVpY3zN4$default, textStyle, j, markdownSpanValues, null, null, 0, 0, 0, gapComposer, i2 & 14, 1984);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str, function1, i, 7);
        }
    }
}
