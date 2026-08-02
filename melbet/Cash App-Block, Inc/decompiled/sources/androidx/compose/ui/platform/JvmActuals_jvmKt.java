package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.platform.DerivedSize;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$CardTab;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$MerchantProfile;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$OffersCollection;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$OffersDetail;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$ProfileDirectory;
import com.squareup.cash.cdf.boost.AppLocation;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.cdf.boost.BoostAddSelect;
import com.squareup.cash.cdf.boost.BoostRemoveSelect;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class JvmActuals_jvmKt {
    public static final void InstalledUI(PaychecksAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        Pair pair;
        ComposableLambdaImpl composableLambdaImpl;
        InstalledServiceAppletTileContentModel.Emphasis emphasis;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(759106649);
        int i2 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changed(true) ? 256 : 128) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            if (z) {
                gapComposer.startReplaceGroup(-437564831);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), new Dp(64.0f));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-437217228);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), new Dp(28.0f));
                gapComposer.end(false);
                pair = pair2;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) pair.first;
            float f = ((Dp) pair.second).value;
            String str = installed.title;
            gapComposer.startReplaceGroup(1544500900);
            gapComposer.end(false);
            ComposableLambdaImpl composableLambdaImpl2 = null;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(str, null, null, 8);
            if (z) {
                gapComposer.startReplaceGroup(1544662752);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1352267043, new TrackRowKt$$ExternalSyntheticLambda0(f, 7), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1544708663);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            gapComposer.startReplaceGroup(1544849124);
            String str2 = installed.emphasis;
            if (str2 == null) {
                gapComposer.startReplaceGroup(1544943208);
                gapComposer.end(false);
                emphasis = null;
            } else {
                gapComposer.startReplaceGroup(1544943209);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                InstalledServiceAppletTileContentModel.Emphasis emphasis2 = new InstalledServiceAppletTileContentModel.Emphasis(str2, colors.semantic.text.standard, null);
                gapComposer.end(false);
                emphasis = emphasis2;
            }
            String str3 = installed.brief;
            if (z) {
                gapComposer.startReplaceGroup(1545208196);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1545240437);
                composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(-1526605046, new PoolDetailsViewKt$$ExternalSyntheticLambda28(f, 6), gapComposer);
                gapComposer.end(false);
            }
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(emphasis, str3, null, composableLambdaImpl2, 4));
            gapComposer.end(false);
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, taxesAppletViewsModule$$ExternalSyntheticLambda1, true, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, (i2 << 3) & 7168, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(installed, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 13);
        }
    }

    /* renamed from: PaychecksIcon-8Feqmps, reason: not valid java name */
    public static final void m937PaychecksIcon8Feqmps(float f, Composer composer, int i) {
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1098268719);
        int i2 = (gapComposer.changed(f) ? 4 : 2) | i;
        int i3 = 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Icons icons = Icons.Paychecks24;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            f2 = f;
            SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, colors.semantic.background.brand, f2, gapComposer, ((i2 << 6) & 896) | 6, 0);
        } else {
            f2 = f;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda0(f2, i, i3);
        }
    }

    public static final void UI(PaychecksAppletTileModel paychecksAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-678812521);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(paychecksAppletTileModel) ? 4 : 2) | i;
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
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-501199576, new PoolToastKt$$ExternalSyntheticLambda0(18, paychecksAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, appletTileAppearance), gapComposer);
            gapComposer.startReplaceGroup(-1796752171);
            SharedUIKt.AppletTileRow(null, rememberComposableLambda, gapComposer, 48, 1);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(paychecksAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 9);
        }
    }

    public static final void UninstalledUI(PaychecksAppletTileModel.Uninstalled uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(117218235);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.AppletTileRowUninstalledContent(2131233230, (i3 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda12);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaycheckCirclesKt$$ExternalSyntheticLambda3(uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, i2);
        }
    }

    public static final String simpleIdentityToString(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final BoostAddSelect toAddCdfEvent(DerivedSize.Companion companion, String str, String str2, String str3, String str4, AppPresentation appPresentation, Integer num, Integer num2) {
        AppLocation appLocation;
        AppLocation appLocation2;
        String str5;
        String str6;
        AppLocation appLocation3;
        str.getClass();
        str3.getClass();
        appPresentation.getClass();
        if (companion instanceof BoostAppLocation$ProfileDirectory) {
            str6 = ((BoostAppLocation$ProfileDirectory) companion).flowToken;
            appLocation3 = AppLocation.Directory;
        } else {
            if (!(companion instanceof BoostAppLocation$MerchantProfile)) {
                if (companion instanceof BoostAppLocation$CardTab) {
                    appLocation = AppLocation.CardTab;
                } else if (companion instanceof BoostAppLocation$OffersCollection) {
                    appLocation = AppLocation.OffersCollection;
                } else {
                    if (!(companion instanceof BoostAppLocation$OffersDetail)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    appLocation = AppLocation.OffersDetail;
                }
                appLocation2 = appLocation;
                str5 = null;
                return new BoostAddSelect(appLocation2, null, str3, str, str2, str5, str4, appPresentation, num, num2);
            }
            str6 = ((BoostAppLocation$MerchantProfile) companion).referrerFlowToken;
            appLocation3 = AppLocation.MerchantProfile;
        }
        str5 = str6;
        appLocation2 = appLocation3;
        return new BoostAddSelect(appLocation2, null, str3, str, str2, str5, str4, appPresentation, num, num2);
    }

    public static final BoostRemoveSelect toRemoveCdfEvent(DerivedSize.Companion companion, String str, String str2, String str3, AppPresentation appPresentation, Integer num, Integer num2) {
        AppLocation appLocation;
        AppLocation appLocation2;
        String str4;
        String str5;
        AppLocation appLocation3;
        str.getClass();
        str3.getClass();
        appPresentation.getClass();
        if (companion instanceof BoostAppLocation$ProfileDirectory) {
            str5 = ((BoostAppLocation$ProfileDirectory) companion).flowToken;
            appLocation3 = AppLocation.Directory;
        } else {
            if (!(companion instanceof BoostAppLocation$MerchantProfile)) {
                if (companion instanceof BoostAppLocation$CardTab) {
                    appLocation = AppLocation.CardTab;
                } else if (companion instanceof BoostAppLocation$OffersCollection) {
                    appLocation = AppLocation.OffersCollection;
                } else {
                    if (!(companion instanceof BoostAppLocation$OffersDetail)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    appLocation = AppLocation.OffersDetail;
                }
                appLocation2 = appLocation;
                str4 = null;
                return new BoostRemoveSelect(appLocation2, null, str3, str, str2, str4, appPresentation, num, num2);
            }
            str5 = ((BoostAppLocation$MerchantProfile) companion).referrerFlowToken;
            appLocation3 = AppLocation.MerchantProfile;
        }
        str4 = str5;
        appLocation2 = appLocation3;
        return new BoostRemoveSelect(appLocation2, null, str3, str, str2, str4, appPresentation, num, num2);
    }
}
