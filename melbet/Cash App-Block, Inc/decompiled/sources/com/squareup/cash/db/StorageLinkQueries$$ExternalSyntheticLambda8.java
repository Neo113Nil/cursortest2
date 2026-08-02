package com.squareup.cash.db;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.util.leakdetector.api.LeakDetector;
import app.cash.util.leakdetector.api.NoOpLeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzjm;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.common.internal.zze;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.appmessages.InAppNotificationModel;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.appmessages.views.InAppNotificationView;
import com.squareup.cash.appmessages.views.TooltipAppMessageView;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlags;
import com.squareup.cash.badging.db.BadgeCountQueries$ForGroupQuery;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.data.profile.RealProfileAliasRepository$allProfileValues$1;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.BlockersConfigQueries$selectAll$2;
import com.squareup.cash.db2.ClientRoutingConfig;
import com.squareup.cash.db2.ClientRoutingConfigQueries$selectAll$2;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.Intervals;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.db2.OfflineConfigQueries$intervals$2;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.cash.db2.ReactionConfigQueries$select$2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.activity.ActivityRecipient;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.PaymentQueries$recents$2;
import com.squareup.cash.db2.entities.SyncEntityQueries$selectAllWithEntityType$2;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.payment.PendingPaymentQueries$listAllPendingByCreatedDateDesc$2;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.db2.payment.PendingTransferQueries$listAllPendingByCreatedDateDesc$2;
import com.squareup.cash.db2.profile.FeatureFlagsQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$tokensToStates$2;
import com.squareup.cash.marketcapabilities.db.MarketCapabilitiesConfigQueries$select$2;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.storage.RealStorageLinkerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.treehouse.android.configuration.EndpointType;
import com.squareup.cash.treehouse.android.configuration.TreehouseAppConfigurationsQueries$forId$2;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.collections.immutable.ImmutableList;
import okio.Path;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final /* synthetic */ class StorageLinkQueries$$ExternalSyntheticLambda8 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 13;
        int i = BlockersConfigQueries$selectAll$2.$r8$clinit;
        this.f$0 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v54, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v58, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v15, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v23, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v32, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v34, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v62, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 5;
        boolean z = true;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Object string2 = androidCursor.getString(0);
                Long l = androidCursor.getLong(1);
                Object m = re$$ExternalSyntheticOutline0.m(l, androidCursor, 2);
                Object obj3 = androidCursor.getLong(3);
                obj3.getClass();
                return ((RealStorageLinkerKt$$ExternalSyntheticLambda2) obj2).invoke(string2, l, m, obj3);
            case 1:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                ((zze) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).getClass();
                Long l2 = androidCursor2.getLong(0);
                l2.getClass();
                return Integer.valueOf((int) l2.longValue());
            case 2:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((BadgeCountQueries$ForGroupQuery) obj2).group_name);
                return Unit.INSTANCE;
            case 3:
                ThemeInfo themeInfo = (ThemeInfo) obj;
                themeInfo.getClass();
                return ((BlockersScreens) ((Screen) obj2)).getBlockersData().isTaxesFlow() ? Trace.taxesStyle(themeInfo) : themeInfo;
            case 4:
                ClientRoute clientRoute = (ClientRoute) obj;
                clientRoute.getClass();
                return zzjm.format((RealClientRouteFormatter) obj2, clientRoute).toString();
            case 5:
                Map map = (Map) obj;
                map.getClass();
                List list = (List) map.get((SyncValueType) ((SyncValueSpec) obj2).valueType);
                return list == null ? EmptyList.INSTANCE : list;
            case 6:
                ((View) obj).getClass();
                ((NoOpLeakDetector) ((LeakDetector) obj2)).getClass();
                return Unit.INSTANCE;
            case 7:
                View view = (View) obj2;
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                if (dialogListenerEvent instanceof DialogListenerEvent.OnDialogCanceled) {
                    ((DialogResultListener) view).onDialogCanceled(((DialogListenerEvent.OnDialogCanceled) dialogListenerEvent).getScreen());
                } else {
                    if (!(dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    DialogListenerEvent.OnDialogResult onDialogResult = (DialogListenerEvent.OnDialogResult) dialogListenerEvent;
                    ((DialogResultListener) view).onDialogResult(onDialogResult.getScreen(), onDialogResult.getResult());
                }
                return Unit.INSTANCE;
            case 8:
                ((ParcelableSnapshotMutableIntState) obj2).setIntValue(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 9:
                InAppNotificationView inAppNotificationView = (InAppNotificationView) obj;
                inAppNotificationView.getClass();
                inAppNotificationView.setModel((InAppNotificationModel) obj2);
                return Unit.INSTANCE;
            case 10:
                TooltipAppMessageView tooltipAppMessageView = (TooltipAppMessageView) obj;
                tooltipAppMessageView.getClass();
                tooltipAppMessageView.setModel((TooltipAppMessageViewModel) obj2);
                return Unit.INSTANCE;
            case 11:
                ImmutableList immutableList = (ImmutableList) obj2;
                Screen screen = (Screen) obj;
                screen.getClass();
                if (immutableList == null || !immutableList.isEmpty()) {
                    Iterator<E> it = immutableList.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((MainScreensViewModel$Tab) it.next()).getScreenMatcher().invoke(screen)).booleanValue()) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 12:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(((StorageLinkQueries$SelectByIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 13:
                int i3 = BlockersConfigQueries$selectAll$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Boolean bool = androidCursor3.getBoolean(0);
                String string3 = androidCursor3.getString(1);
                ?? bytes = androidCursor3.getBytes(2);
                return new BlockersConfig(bool, string3, bytes != 0 ? (Money) ((BlockersConfig.Adapter) localTabContentQueries.local_tab_contentAdapter).target_balance_amountAdapter.decode(bytes) : null);
            case 14:
                int i4 = ClientRoutingConfigQueries$selectAll$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ?? bytes2 = androidCursor4.getBytes(0);
                List list2 = bytes2 != 0 ? (List) ((WireRepeatedAdapter) ((KeysetHandle) localTabContentQueries2.local_tab_contentAdapter).entries).decode(bytes2) : null;
                ?? bytes3 = androidCursor4.getBytes(1);
                return new ClientRoutingConfig(list2, bytes3 != 0 ? (List) ((WireRepeatedAdapter) ((KeysetHandle) localTabContentQueries2.local_tab_contentAdapter).annotationsMap).decode(bytes3) : null);
            case 15:
                int i5 = OfflineConfigQueries$intervals$2.$r8$clinit;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                androidCursor5.getClass();
                ?? bytes4 = androidCursor5.getBytes(0);
                return new Intervals(bytes4 != 0 ? (List) ((WireRepeatedAdapter) ((OfflineConfig.Adapter) instrumentQueries.instrumentAdapter).retry_intervalsAdapter).decode(bytes4) : null);
            case 16:
                ReactionConfigQueries$select$2 reactionConfigQueries$select$2 = ReactionConfigQueries$select$2.INSTANCE;
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                Long m2 = re$$ExternalSyntheticOutline0.m(androidCursor6, 0);
                ?? bytes5 = androidCursor6.getBytes(1);
                return reactionConfigQueries$select$2.invoke(m2, bytes5 != 0 ? (List) ((ReactionConfig.Adapter) instrumentQueries2.instrumentAdapter).extendedReactionsAdapter.decode(bytes5) : null);
            case 17:
                PaymentQueries$recents$2 paymentQueries$recents$2 = PaymentQueries$recents$2.INSTANCE;
                PaymentQueries paymentQueries = (PaymentQueries) obj2;
                AndroidCursor androidCursor7 = (AndroidCursor) obj;
                androidCursor7.getClass();
                String string4 = androidCursor7.getString(0);
                String string5 = androidCursor7.getString(1);
                Boolean bool2 = androidCursor7.getBoolean(2);
                Boolean bool3 = androidCursor7.getBoolean(3);
                String string6 = androidCursor7.getString(4);
                string6.getClass();
                String string7 = androidCursor7.getString(5);
                String string8 = androidCursor7.getString(6);
                Boolean bool4 = androidCursor7.getBoolean(7);
                Boolean m3 = Matcher$$ExternalSyntheticOutline0.m(bool4, androidCursor7, 8);
                Boolean bool5 = androidCursor7.getBoolean(9);
                bool5.getClass();
                String string9 = androidCursor7.getString(10);
                String string10 = androidCursor7.getString(11);
                ?? bytes6 = androidCursor7.getBytes(12);
                Image image = bytes6 != 0 ? (Image) ((WireAdapter) paymentQueries.customerAdapter.lazyFetcherFactories).decode(bytes6) : null;
                String string11 = androidCursor7.getString(13);
                String string12 = androidCursor7.getString(14);
                String string13 = androidCursor7.getString(15);
                Boolean bool6 = androidCursor7.getBoolean(16);
                Boolean m4 = Matcher$$ExternalSyntheticOutline0.m(bool6, androidCursor7, 17);
                Long l3 = androidCursor7.getLong(18);
                l3.getClass();
                ComponentRegistry.Builder builder = paymentQueries.customerAdapter;
                Enum m5 = NavAction$$ExternalSyntheticOutline0.m(androidCursor7, 19, (EnumColumnAdapter) builder.interceptors);
                ?? bytes7 = androidCursor7.getBytes(20);
                MerchantData merchantData = bytes7 != 0 ? (MerchantData) ((WireAdapter) builder.mappers).decode(bytes7) : null;
                ?? bytes8 = androidCursor7.getBytes(21);
                Color color = bytes8 != 0 ? (Color) ((WireAdapter) builder.lazyDecoderFactories).decode(bytes8) : null;
                String string14 = androidCursor7.getString(22);
                Object[] objArr = {string4, string5, bool2, bool3, string6, string7, string8, bool4, m3, bool5, string9, string10, image, string11, string12, string13, bool6, m4, l3, m5, merchantData, color, string14 != null ? (Region) ((EnumColumnAdapter) builder.keyers).decode(string14) : null, androidCursor7.getString(23), androidCursor7.getString(24), androidCursor7.getString(25)};
                if (objArr.length != 26) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 26 arguments");
                    return null;
                }
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                Boolean bool7 = (Boolean) objArr[2];
                Boolean bool8 = (Boolean) objArr[3];
                String str3 = (String) objArr[4];
                String str4 = (String) objArr[5];
                String str5 = (String) objArr[6];
                boolean booleanValue = ((Boolean) objArr[7]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[8]).booleanValue();
                boolean booleanValue3 = ((Boolean) objArr[9]).booleanValue();
                String str6 = (String) objArr[10];
                String str7 = (String) objArr[11];
                Image image2 = (Image) objArr[12];
                String str8 = (String) objArr[13];
                String str9 = (String) objArr[14];
                String str10 = (String) objArr[15];
                boolean booleanValue4 = ((Boolean) objArr[16]).booleanValue();
                boolean booleanValue5 = ((Boolean) objArr[17]).booleanValue();
                long longValue = ((Number) objArr[18]).longValue();
                BlockState blockState = (BlockState) objArr[19];
                MerchantData merchantData2 = (MerchantData) objArr[20];
                Color color2 = (Color) objArr[21];
                Region region = (Region) objArr[22];
                String str11 = (String) objArr[23];
                String str12 = (String) objArr[24];
                String str13 = (String) objArr[25];
                str3.getClass();
                blockState.getClass();
                return new ActivityRecipient(str, str2, bool7, bool8, str3, str4, str5, booleanValue, booleanValue2, booleanValue3, str6, str7, image2, str8, str9, str10, booleanValue4, booleanValue5, longValue, blockState, merchantData2, color2, region, str11, str12, str13);
            case 18:
                SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
                AndroidCursor androidCursor8 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor8, 0);
                ((ResourceFileSystem.Companion) ((InstrumentQueries) obj2).instrumentAdapter).getClass();
                Long l4 = androidCursor8.getLong(1);
                l4.getClass();
                Integer valueOf = Integer.valueOf((int) l4.longValue());
                byte[] bytes9 = androidCursor8.getBytes(2);
                bytes9.getClass();
                Long l5 = androidCursor8.getLong(3);
                Long l6 = androidCursor8.getLong(4);
                Integer valueOf2 = l6 != null ? Integer.valueOf((int) l6.longValue()) : null;
                Long l7 = androidCursor8.getLong(5);
                Long l8 = androidCursor8.getLong(6);
                l8.getClass();
                return syncEntityQueries$selectAllWithEntityType$2.invoke(m1431m, valueOf, bytes9, l5, valueOf2, l7, Integer.valueOf((int) l8.longValue()));
            case 19:
                PendingPaymentQueries$listAllPendingByCreatedDateDesc$2 pendingPaymentQueries$listAllPendingByCreatedDateDesc$2 = PendingPaymentQueries$listAllPendingByCreatedDateDesc$2.INSTANCE;
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor9 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor9, 0);
                Long l9 = androidCursor9.getLong(1);
                Long m6 = re$$ExternalSyntheticOutline0.m(l9, androidCursor9, 2);
                Long l10 = androidCursor9.getLong(3);
                l10.getClass();
                Object m7 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor9, 4, (WireAdapter) ((zzlj) instrumentQueries3.instrumentAdapter).zza);
                zzlj zzljVar = (zzlj) instrumentQueries3.instrumentAdapter;
                Object m8 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor9, 5, (WireAdapter) zzljVar.zzb);
                Enum m9 = NavAction$$ExternalSyntheticOutline0.m(androidCursor9, 6, (EnumColumnAdapter) zzljVar.zzc);
                Boolean bool9 = androidCursor9.getBoolean(7);
                bool9.getClass();
                Long l11 = androidCursor9.getLong(8);
                l11.getClass();
                ?? bytes10 = androidCursor9.getBytes(9);
                InvestPaymentData investPaymentData = bytes10 != 0 ? (InvestPaymentData) ((WireAdapter) zzljVar.zze).decode(bytes10) : null;
                String string15 = androidCursor9.getString(10);
                ClientScenario clientScenario = string15 != null ? (ClientScenario) ((EnumColumnAdapter) zzljVar.zzd).decode(string15) : null;
                ?? bytes11 = androidCursor9.getBytes(11);
                InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = bytes11 != 0 ? (InitiatePersonalizedPaymentRequest) ((WireAdapter) zzljVar.zzf).decode(bytes11) : null;
                Boolean bool10 = androidCursor9.getBoolean(12);
                long longValue2 = l9.longValue();
                long longValue3 = m6.longValue();
                long longValue4 = l10.longValue();
                InitiatePaymentRequest initiatePaymentRequest = (InitiatePaymentRequest) m7;
                Money money = (Money) m8;
                Orientation orientation = (Orientation) m9;
                boolean booleanValue6 = bool9.booleanValue();
                long longValue5 = l11.longValue();
                initiatePaymentRequest.getClass();
                money.getClass();
                orientation.getClass();
                return new PendingPayment(m1431m2, longValue2, longValue3, longValue4, initiatePaymentRequest, money, orientation, booleanValue6, longValue5, investPaymentData, clientScenario, initiatePersonalizedPaymentRequest, bool10);
            case 20:
                PendingTransferQueries$listAllPendingByCreatedDateDesc$2 pendingTransferQueries$listAllPendingByCreatedDateDesc$2 = PendingTransferQueries$listAllPendingByCreatedDateDesc$2.INSTANCE;
                InstrumentQueries instrumentQueries4 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor10 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor10, 0);
                Long l12 = androidCursor10.getLong(1);
                Long m10 = re$$ExternalSyntheticOutline0.m(l12, androidCursor10, 2);
                Long l13 = androidCursor10.getLong(3);
                l13.getClass();
                Object m11 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor10, 4, ((ScenarioPlan.Adapter) instrumentQueries4.instrumentAdapter).scenario_planAdapter);
                Boolean bool11 = androidCursor10.getBoolean(5);
                bool11.getClass();
                String string16 = androidCursor10.getString(6);
                TransferType transferType = string16 != null ? (TransferType) ((ScenarioPlan.Adapter) instrumentQueries4.instrumentAdapter).client_scenarioAdapter.decode(string16) : null;
                Boolean bool12 = androidCursor10.getBoolean(7);
                Long l14 = androidCursor10.getLong(8);
                Long l15 = androidCursor10.getLong(9);
                String string17 = androidCursor10.getString(10);
                long longValue6 = l12.longValue();
                long longValue7 = m10.longValue();
                long longValue8 = l13.longValue();
                TransferFundsRequest transferFundsRequest = (TransferFundsRequest) m11;
                boolean booleanValue7 = bool11.booleanValue();
                m1431m3.getClass();
                transferFundsRequest.getClass();
                return new PendingTransfer(m1431m3, longValue6, longValue7, longValue8, transferFundsRequest, booleanValue7, transferType, bool12, l14, l15, string17);
            case 21:
                AndroidCursor androidCursor11 = (AndroidCursor) obj;
                androidCursor11.getClass();
                return (FeatureFlag) BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor11, 0, ((Local_tab_content.Adapter) ((InstrumentQueries) obj2).instrumentAdapter).responseAdapter);
            case 22:
                RealProfileAliasRepository$allProfileValues$1 realProfileAliasRepository$allProfileValues$1 = RealProfileAliasRepository$allProfileValues$1.INSTANCE;
                AndroidCursor androidCursor12 = (AndroidCursor) obj;
                String m1431m4 = re$$ExternalSyntheticOutline0.m1431m(androidCursor12, 0);
                Boolean bool13 = androidCursor12.getBoolean(1);
                bool13.getClass();
                return realProfileAliasRepository$allProfileValues$1.invoke(m1431m4, bool13, NavAction$$ExternalSyntheticOutline0.m(androidCursor12, 2, ((EnumListAdapter) ((InstrumentQueries) obj2).instrumentAdapter).enumColumnAdapter));
            case 23:
                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) obj2;
                EmptyList emptyList = realFeatureFlagManager.localOnlyFlags;
                InstrumentQueries instrumentQueries5 = realFeatureFlagManager.featureFlagQueries;
                emptyList.getClass();
                EmptyIterator.INSTANCE.getClass();
                ArrayList plus = CollectionsKt.plus((Iterable) emptyList, (Collection) realFeatureFlagManager.localFlags);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
                Iterator it2 = plus.iterator();
                while (it2.hasNext()) {
                    String str14 = ((FeatureFlag) it2.next()).name;
                    str14.getClass();
                    arrayList.add(str14);
                }
                instrumentQueries5.getClass();
                String createArguments = TransacterImpl.createArguments(arrayList.size());
                SqlDriver sqlDriver = instrumentQueries5.driver;
                String trimMargin$default = StringsKt__IndentKt.trimMargin$default("\n        |DELETE FROM featureFlags\n        |WHERE local = 1\n        |AND name NOT IN " + createArguments + "\n        ");
                arrayList.size();
                sqlDriver.execute(null, trimMargin$default, new FeatureFlagsQueries$$ExternalSyntheticLambda0(0, arrayList));
                instrumentQueries5.notifyQueries(-159175843, new WebLoginConfigQueries$$ExternalSyntheticLambda0(i2));
                return Unit.INSTANCE;
            case 24:
                InvestmentHoldingQueries$tokensToStates$2 investmentHoldingQueries$tokensToStates$2 = InvestmentHoldingQueries$tokensToStates$2.INSTANCE;
                AndroidCursor androidCursor13 = (AndroidCursor) obj;
                String m1431m5 = re$$ExternalSyntheticOutline0.m1431m(androidCursor13, 0);
                EnumColumnAdapter enumColumnAdapter = (EnumColumnAdapter) ((InvestmentEntityQueries) obj2).investment_holdingAdapter.closeBits;
                String string18 = androidCursor13.getString(1);
                string18.getClass();
                return investmentHoldingQueries$tokensToStates$2.invoke(m1431m5, enumColumnAdapter.decode(string18));
            case 25:
                MarketCapabilitiesConfigQueries$select$2 marketCapabilitiesConfigQueries$select$2 = MarketCapabilitiesConfigQueries$select$2.INSTANCE;
                AndroidCursor androidCursor14 = (AndroidCursor) obj;
                String m1431m6 = re$$ExternalSyntheticOutline0.m1431m(androidCursor14, 0);
                WireRepeatedAdapter wireRepeatedAdapter = ((ReactionConfig.Adapter) ((GpsConfigQueries) obj2).gpsConfigAdapter).extendedReactionsAdapter;
                ?? bytes12 = androidCursor14.getBytes(1);
                bytes12.getClass();
                return marketCapabilitiesConfigQueries$select$2.invoke(m1431m6, wireRepeatedAdapter.decode(bytes12));
            case 26:
                ThemeInfo themeInfo2 = (ThemeInfo) obj2;
                ((Context) obj).getClass();
                return themeInfo2;
            case 27:
                Context context = (Context) obj2;
                ((InternalArcadeFlags) obj).getClass();
                return (context.getResources().getConfiguration().uiMode & 48) == 32 ? Trace.moonCakeDark(context) : Trace.moonCakeLight(context);
            case 28:
                Path path = (Path) obj;
                path.getClass();
                if (!path.equals((Path) obj2) && !RealSandboxer.preferencesKeepSet.contains(path.name())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                TreehouseAppConfigurationsQueries$forId$2 treehouseAppConfigurationsQueries$forId$2 = TreehouseAppConfigurationsQueries$forId$2.INSTANCE;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidCursor androidCursor15 = (AndroidCursor) obj;
                String m1431m7 = re$$ExternalSyntheticOutline0.m1431m(androidCursor15, 0);
                String string19 = androidCursor15.getString(1);
                return treehouseAppConfigurationsQueries$forId$2.invoke(m1431m7, string19 != null ? (EndpointType) ((Alias$Adapter) gpsConfigQueries.gpsConfigAdapter).sync_stateAdapter.decode(string19) : null, androidCursor15.getString(2), androidCursor15.getLong(3));
        }
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(LocalTabContentQueries localTabContentQueries, byte b) {
        this.$r8$classId = 14;
        int i = ClientRoutingConfigQueries$selectAll$2.$r8$clinit;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InstrumentQueries instrumentQueries) {
        this.$r8$classId = 15;
        int i = OfflineConfigQueries$intervals$2.$r8$clinit;
        this.f$0 = instrumentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InstrumentQueries instrumentQueries, byte b) {
        this.$r8$classId = 16;
        ReactionConfigQueries$select$2 reactionConfigQueries$select$2 = ReactionConfigQueries$select$2.INSTANCE;
        this.f$0 = instrumentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InstrumentQueries instrumentQueries, byte b, boolean z) {
        this.$r8$classId = 22;
        RealProfileAliasRepository$allProfileValues$1 realProfileAliasRepository$allProfileValues$1 = RealProfileAliasRepository$allProfileValues$1.INSTANCE;
        this.f$0 = instrumentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InstrumentQueries instrumentQueries, char c) {
        this.$r8$classId = 18;
        SyncEntityQueries$selectAllWithEntityType$2 syncEntityQueries$selectAllWithEntityType$2 = SyncEntityQueries$selectAllWithEntityType$2.INSTANCE;
        this.f$0 = instrumentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = 19;
        PendingPaymentQueries$listAllPendingByCreatedDateDesc$2 pendingPaymentQueries$listAllPendingByCreatedDateDesc$2 = PendingPaymentQueries$listAllPendingByCreatedDateDesc$2.INSTANCE;
        this.f$0 = instrumentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InstrumentQueries instrumentQueries, short s) {
        this.$r8$classId = 20;
        PendingTransferQueries$listAllPendingByCreatedDateDesc$2 pendingTransferQueries$listAllPendingByCreatedDateDesc$2 = PendingTransferQueries$listAllPendingByCreatedDateDesc$2.INSTANCE;
        this.f$0 = instrumentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(PaymentQueries paymentQueries) {
        this.$r8$classId = 17;
        PaymentQueries$recents$2 paymentQueries$recents$2 = PaymentQueries$recents$2.INSTANCE;
        this.f$0 = paymentQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 25;
        MarketCapabilitiesConfigQueries$select$2 marketCapabilitiesConfigQueries$select$2 = MarketCapabilitiesConfigQueries$select$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(GpsConfigQueries gpsConfigQueries, byte b) {
        this.$r8$classId = 29;
        TreehouseAppConfigurationsQueries$forId$2 treehouseAppConfigurationsQueries$forId$2 = TreehouseAppConfigurationsQueries$forId$2.INSTANCE;
        this.f$0 = gpsConfigQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(InvestmentEntityQueries investmentEntityQueries) {
        this.$r8$classId = 24;
        InvestmentHoldingQueries$tokensToStates$2 investmentHoldingQueries$tokensToStates$2 = InvestmentHoldingQueries$tokensToStates$2.INSTANCE;
        this.f$0 = investmentEntityQueries;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
