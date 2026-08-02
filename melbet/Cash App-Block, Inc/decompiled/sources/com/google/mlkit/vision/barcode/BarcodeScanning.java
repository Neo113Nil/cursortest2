package com.google.mlkit.vision.barcode;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import app.cash.zipline.loader.LoaderJniKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.mlkit.vision.barcode.internal.zzg;
import com.google.mlkit.vision.barcode.internal.zzh;
import com.google.mlkit.vision.barcode.internal.zzl;
import com.squareup.cash.account.components.PinkThemeSparklesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel$Metadata$Default;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import java.util.concurrent.Executor;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader$Cache;

/* loaded from: classes6.dex */
public abstract class BarcodeScanning {
    public static Java16RecordComponentsLoader$Cache _cache;

    public static final void GraphErrorUI(StocksAppletTileModel.Installed.GraphError graphError, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig;
        String str = graphError.formattedBalance;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1545186133);
        int i2 = i | (gapComposer.changedInstance(graphError) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str2 = (String) appletTileAppearance.obfuscationMask.invoke(str);
            if (appletTileAppearance.useRedesignedTiles) {
                gapComposer.startReplaceGroup(819627446);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                installedBalanceAppletTileLayoutConfig = new InstalledBalanceAppletTileLayoutConfig(16.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, true, 64.0f);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(819697785);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                installedBalanceAppletTileLayoutConfig = new InstalledBalanceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, false, 60.0f);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledBalanceAppletTile(new InstalledAppletTileHeaderModel(graphError.title, null, null, 12), new InstalledBalanceAppletTileContentModel(str2, graphError.rawBalance, new InstalledBalanceAppletTileContentModel$Metadata$Default(graphError.subtitle), null, 20), !Intrinsics.areEqual(str2, str), taxesAppletViewsModule$$ExternalSyntheticLambda1, false, installedBalanceAppletTileLayoutConfig, gapComposer, ((i2 << 3) & 7168) | 64);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) graphError, (Object) appletTileAppearance, (Function) taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 9);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel, still in use, count: 4, list:
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x018f: MOVE (r20v0 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x0153: MOVE (r20v3 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x0146: MOVE (r20v5 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x00fd: MOVE (r20v6 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void InstalledUI(com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel.Installed.LoadedPriceMovement r29, com.squareup.cash.money.applets.viewmodels.AppletTile.AppletTileAppearance r30, com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1 r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.BarcodeScanning.InstalledUI(com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel$Installed$LoadedPriceMovement, com.squareup.cash.money.applets.viewmodels.AppletTile$AppletTileAppearance, com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: StocksVisual-rAjV9yQ, reason: not valid java name */
    public static final void m2064StocksVisualrAjV9yQ(StocksAppletTileModel.Installed.LoadedPriceMovement loadedPriceMovement, float f, boolean z, Composer composer, int i) {
        float f2;
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2110747051);
        int i2 = (gapComposer2.changedInstance(loadedPriceMovement) ? 4 : 2) | i | (gapComposer2.changed(f) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128);
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            f2 = f;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else if (loadedPriceMovement instanceof StocksAppletTileModel.Installed.LoadedPriceMovement.WithPriceMovement) {
            gapComposer2.startReplaceGroup(-1350636089);
            InvestingGraphContentModel investingGraphContentModel = ((StocksAppletTileModel.Installed.LoadedPriceMovement.WithPriceMovement) loadedPriceMovement).graph;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            InvestingGraphTabsViewKt.m3722MooncakeInvestingGraphRFMEUTM(investingGraphContentModel, SpacerKt.padding(SizeKt.m287sizeVpY3zN4(Modifier.Companion.$$INSTANCE, 80.0f, 44.0f), new PaddingValuesImpl(4.0f, 4.0f, 4.0f, 4.0f)), null, null, false, colors.semantic.service.investing, gapComposer, 48, 60);
            gapComposer.end(false);
            f2 = f;
        } else {
            gapComposer = gapComposer2;
            if (!(loadedPriceMovement instanceof StocksAppletTileModel.Installed.LoadedPriceMovement.ZeroBalance)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1203355821, false);
            }
            gapComposer.startReplaceGroup(-1350398567);
            Icons icons = Icons.Investing24;
            if (z) {
                gapComposer.startReplaceGroup(-1350301289);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.icon.brand;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1350231632);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.service.investing;
                gapComposer.end(false);
            }
            f2 = f;
            SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, j, f2, gapComposer, (i2 << 3) & 896, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PinkThemeSparklesKt$$ExternalSyntheticLambda1(loadedPriceMovement, f2, z, i);
        }
    }

    public static final void UninstalledUI(StocksAppletTileModel.Uninstalled uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(802401049);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.AppletTileRowUninstalledContent(2131233502, (i2 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda12);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 9);
        }
    }

    public static zzh getClient(BarcodeScannerOptions barcodeScannerOptions) {
        zzg zzgVar = (zzg) MlKitContext.getInstance().get(zzg.class);
        return new zzh(barcodeScannerOptions, (zzl) zzgVar.zza.get(barcodeScannerOptions), (Executor) zzgVar.zzb.zza.get(), LoaderJniKt.zzb(zzb.zzd()), zzgVar.zzc);
    }
}
