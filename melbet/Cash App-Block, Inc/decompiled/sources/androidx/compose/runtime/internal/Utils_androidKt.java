package androidx.compose.runtime.internal;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.cdf.notificationsoptin.NotificationPromptEntryPoint;
import com.squareup.cash.cdf.notificationsoptin.NotificationsOptInOSTapAllow;
import com.squareup.cash.cdf.notificationsoptin.NotificationsOptInOSTapDontAllow;
import com.squareup.cash.cdf.notificationsoptin.NotificationsOptInOSViewImpression;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel$Metadata$Default;
import com.squareup.cash.notifications.NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class Utils_androidKt {
    public static final void GraphErrorUI(BitcoinAppletTileModel.Installed.GraphError graphError, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(941482569);
        int i2 = i | (gapComposer.changedInstance(graphError) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Function1 function1 = appletTileAppearance.obfuscationMask;
            String str = graphError.formattedBalance;
            String str2 = (String) function1.invoke(str);
            if (appletTileAppearance.useRedesignedTiles) {
                gapComposer.startReplaceGroup(1571007320);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                installedBalanceAppletTileLayoutConfig = new InstalledBalanceAppletTileLayoutConfig(16.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, true, 64.0f);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1571077659);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal2)).getClass();
                installedBalanceAppletTileLayoutConfig = new InstalledBalanceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, false, 60.0f);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledBalanceAppletTile(new InstalledAppletTileHeaderModel(graphError.title, null, null, 12), new InstalledBalanceAppletTileContentModel((String) appletTileAppearance.obfuscationMask.invoke(str), graphError.rawBalance, new InstalledBalanceAppletTileContentModel$Metadata$Default(graphError.errorMessage), null, 4), !Intrinsics.areEqual(str2, str), taxesAppletViewsModule$$ExternalSyntheticLambda1, false, installedBalanceAppletTileLayoutConfig, gapComposer, 64 | ((i2 << 3) & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(graphError, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 20);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel, still in use, count: 4, list:
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x0191: MOVE (r22v0 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x0155: MOVE (r22v3 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x0148: MOVE (r22v5 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
          (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) from 0x0108: MOVE (r22v6 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel) = (r10v11 com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void InstalledUI(com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel.Installed.Loaded r31, com.squareup.cash.money.applets.viewmodels.AppletTile.AppletTileAppearance r32, com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1 r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.internal.Utils_androidKt.InstalledUI(com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel$Installed$Loaded, com.squareup.cash.money.applets.viewmodels.AppletTile$AppletTileAppearance, com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void UninstalledUI(BitcoinAppletTileModel.Uninstalled uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(185927195);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.AppletTileRowUninstalledContent(2131231125, (i2 << 6) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda12);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 3);
        }
    }

    public static final void logError(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object requestNotificationPermissionWithAnalytics(AndroidPermissionManager$create$1 androidPermissionManager$create$1, Analytics analytics, NotificationPromptEntryPoint notificationPromptEntryPoint, ContinuationImpl continuationImpl) {
        NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1 notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1;
        int i;
        Boolean bool;
        if (continuationImpl instanceof NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1) {
            notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1 = (NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1) continuationImpl;
            int i2 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadOnlyPermissions readOnlyPermissions = androidPermissionManager$create$1.$readonly;
                    ReadOnlyPermissions readOnlyPermissions2 = androidPermissionManager$create$1.$readonly;
                    if (readOnlyPermissions.check()) {
                        return Boolean.TRUE;
                    }
                    androidPermissionManager$create$1.request();
                    analytics.track(new NotificationsOptInOSViewImpression(notificationPromptEntryPoint), null);
                    ChannelFlowBuilder merge = FlowKt.merge(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(readOnlyPermissions2.granted(), 11), new MoneyTabPresenter$models$lambda$31$$inlined$map$1(readOnlyPermissions2.denied(), 12));
                    notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.L$1 = analytics;
                    notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.L$2 = notificationPromptEntryPoint;
                    notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.label = 1;
                    obj = FlowKt.first(merge, notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    notificationPromptEntryPoint = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.L$2;
                    analytics = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    analytics.track(new NotificationsOptInOSTapDontAllow(notificationPromptEntryPoint), null);
                } else {
                    analytics.track(new NotificationsOptInOSTapAllow(notificationPromptEntryPoint), null);
                }
                return bool;
            }
        }
        notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1 = new NotificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1(continuationImpl);
        Object obj2 = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPermissionUtilsKt$requestNotificationPermissionWithAnalytics$1.label;
        if (i != 0) {
        }
        bool = (Boolean) obj2;
        if (bool.booleanValue()) {
        }
        return bool;
    }
}
