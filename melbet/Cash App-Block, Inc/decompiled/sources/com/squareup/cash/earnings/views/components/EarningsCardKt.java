package com.squareup.cash.earnings.views.components;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class EarningsCardKt {
    public static final ComposableLambdaImpl lambda$744192063 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(10), false, 744192063);

    /* renamed from: lambda$-530682875, reason: not valid java name */
    public static final ComposableLambdaImpl f389lambda$530682875 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(1), false, -530682875);

    public static final void EarningsActivitySection(EarningsHomeViewModel.EarningsActivity earningsActivity, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1723460879);
        int i2 = (gapComposer.changedInstance(earningsActivity) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            UiCallbackModel uiCallbackModel = earningsActivity.embedded;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1254398451, new ArcadeModal$$ExternalSyntheticLambda3(earningsActivity, 7), gapComposer);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            AvatarsKt.ActivityEmbeddedView(uiCallbackModel, null, rememberComposableLambda, lambda$744192063, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer, 3456, 114);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(earningsActivity, i, 6);
        }
    }

    public static final void EarningsCard(String str, String str2, String str3, Function0 function0, Painter painter, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function02;
        GapComposer gapComposer;
        Modifier modifier2;
        function0.getClass();
        painter.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(995806076);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? gapComposer2.changed(painter) : gapComposer2.changedInstance(painter) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2 | 196608;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            MoneybotTheme.m3623Cardjb40ds(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, 0L, RecyclerView.DECELERATION_RATE, null, null, Expect_jvmKt.rememberComposableLambda(-187157118, new SwipeToDismissKt$$ExternalSyntheticLambda2(str, str2, function02, painter, str3, 8), gapComposer2), gapComposer, 1572864, 62);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(i, 4, modifier2, str, str2, str3, painter, function0);
        }
    }
}
