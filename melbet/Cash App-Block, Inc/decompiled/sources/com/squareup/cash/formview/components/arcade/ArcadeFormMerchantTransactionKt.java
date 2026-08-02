package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class ArcadeFormMerchantTransactionKt {
    public static final void ArcadeFormMerchantTransaction(LocalizedMoneyFormatter.Factory factory, RealImageLoader realImageLoader, FormBlocker.Element.MerchantTransactionElement merchantTransactionElement, Function0 function0, boolean z, Function1 function1, Composer composer, int i, int i2) {
        Function1 function12;
        int i3;
        GapComposer gapComposer;
        Triple triple;
        factory.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-139480034);
        int i4 = (gapComposer2.changedInstance(factory) ? 4 : 2) | i | (gapComposer2.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer2.changedInstance(merchantTransactionElement) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            function12 = function1;
        } else {
            function12 = function1;
            i3 = i4 | (gapComposer2.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Function1 function13 = i5 != 0 ? null : function12;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = factory.create(MoneyFormatterConfig.COMPACT);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue;
            boolean changed = gapComposer2.changed(merchantTransactionElement.actions);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Boolean.valueOf(!merchantTransactionElement.actions.isEmpty());
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (booleanValue) {
                gapComposer2.startReplaceGroup(-2015819769);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                Object obj = DefaultSizes.border.entries;
                RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
                Icons icons = Icons.Avatar24;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                triple = new Triple(icons, ImageKt.m178borderxT4_qwU(m300paddingVpY3zN4$default, 2.0f, colors.semantic.border.subtle, m340RoundedCornerShape0680j_4), ClipKt.clip(companion, m340RoundedCornerShape0680j_4));
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-2015414878);
                gapComposer2.end(false);
                triple = new Triple(Icons.CategoryShopping24, companion, companion);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1403663539, new MoneybotHomeViewKt$$ExternalSyntheticLambda3((Modifier) triple.second, booleanValue, function13, merchantTransactionElement, function0, (Modifier) triple.third, (Icons) triple.first, realImageLoader, moneyFormatter, z), gapComposer2), gapComposer2, 3072, 7);
            gapComposer = gapComposer2;
            function12 = function13;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(factory, realImageLoader, merchantTransactionElement, function0, z, function12, i, i2);
        }
    }
}
