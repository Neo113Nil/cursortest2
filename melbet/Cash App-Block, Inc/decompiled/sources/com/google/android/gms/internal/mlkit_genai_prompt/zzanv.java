package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzanv implements ModelJsonParser {
    public static final void InstalledUI(EarningsAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, Function0 function0, Composer composer, int i) {
        List listOf;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-948963855);
        int i2 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 131) != 130)) {
            if (installed instanceof EarningsAppletTileModel.Installed.Default) {
                gapComposer.startReplaceGroup(-1421192644);
                gapComposer.end(false);
                listOf = EmptyList.INSTANCE;
            } else {
                if (!(installed instanceof EarningsAppletTileModel.Installed.Chart)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1421193508, false);
                }
                gapComposer.startReplaceGroup(-1421190941);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, null, Expect_jvmKt.rememberComposableLambda(-2091073598, new ArcadeModal$$ExternalSyntheticLambda3(installed, 10), gapComposer), 7));
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(new InstalledAppletTileHeaderModel(installed.getTitle(), installed.getTitleCaption(), null, 12), listOf, function0, true, null, null, null, gapComposer, 3072 | (i2 & 896), 112);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(installed, appletTileAppearance, function0, i, 11);
        }
    }

    public static final void UI(EarningsAppletTileModel earningsAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1904587249);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(earningsAppletTileModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(coroutineScope) | ((i2 & 896) == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(21, coroutineScope, taxesAppletViewsModule$$ExternalSyntheticLambda1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2093165058, new SectionKt$$ExternalSyntheticLambda2(25, earningsAppletTileModel, appletTileAppearance, (Function0) rememberedValue2), gapComposer);
            boolean z = earningsAppletTileModel instanceof EarningsAppletTileModel.Installed;
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1253591441);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                modifier = SpacerKt.m299paddingVpY3zN4(modifier, 16.0f, 16.0f);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1253451817);
                gapComposer.end(false);
            }
            SharedUIKt.AppletTileRow(modifier, rememberComposableLambda, gapComposer, 48, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(earningsAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 10);
        }
    }

    public static final void UninstalledUI(EarningsAppletTileModel.Uninstalled uninstalled, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1084145877);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            SharedUIKt.AppletTileRowUninstalledContent(2131231337, (i2 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, function02);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(uninstalled, function02, i, 21);
        }
    }

    public static boolean zze(byte b) {
        return b > -65;
    }
}
