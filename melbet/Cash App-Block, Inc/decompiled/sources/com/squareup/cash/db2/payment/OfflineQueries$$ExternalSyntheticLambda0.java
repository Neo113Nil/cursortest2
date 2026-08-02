package com.squareup.cash.db2.payment;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.SyncEntityQueries$SelectAllWithEntityTypeQuery;
import com.squareup.cash.data.profile.RealProfileAliasRepository$forAliasTypeProfileValues$1;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.entities.EntityRangesQueries$selectAll$2;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.loyalty.LoyaltyMerchant;
import com.squareup.cash.db2.loyalty.LoyaltyMerchantQueries$loyaltyMerchant$2;
import com.squareup.cash.db2.profile.BalanceDataQueries$select$2;
import com.squareup.cash.db2.profile.CustomerProfile;
import com.squareup.cash.db2.profile.CustomerProfileQueries$customerProfile$2;
import com.squareup.cash.db2.profile.ExtendedProfileDetailsQueries$forCustomerToken$2;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.db2.profile.ScenarioPlanQueries$forClientScenario$2;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibility;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibilityQueries$EligibilityQuery;
import com.squareup.cash.db2.profile.SingleAccountHolderEligibilityQueries$eligibility$2;
import com.squareup.cash.db2.profile.documents.AvailableAccountStatementQueries$selectAll$2;
import com.squareup.cash.db2.profile.documents.CustomerStatementTypeQueries$selectForType$2;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.loyalty.LoyaltyUnit;
import com.squareup.protos.franklin.loyalty.ProgramRewards;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Path;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfflineQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(RewardSlotQueries rewardSlotQueries) {
        this.$r8$classId = 9;
        LoyaltyMerchantQueries$loyaltyMerchant$2 loyaltyMerchantQueries$loyaltyMerchant$2 = LoyaltyMerchantQueries$loyaltyMerchant$2.INSTANCE;
        this.f$1 = rewardSlotQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v37, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v38, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v48, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v57, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v58, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v59, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v60, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v61, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v62, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v63, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v64, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v65, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v66, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v74, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v76, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v78, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v80, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v82, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v84, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v86, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v88, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v90, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v92, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v94, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v96, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v98, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v29, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v31, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v32, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v33, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v34, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v35, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v16, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v17, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v18, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v41, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$1;
        int i2 = 0;
        switch (i) {
            case 0:
                OfflineQueries$pending$2 offlineQueries$pending$2 = OfflineQueries$pending$2.INSTANCE;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                ?? bytes = androidCursor.getBytes(1);
                InitiatePaymentRequest initiatePaymentRequest = bytes != 0 ? (InitiatePaymentRequest) ((WireAdapter) ((zzlj) rewardSlotQueries.rewardAdapter).zza).decode(bytes) : null;
                ?? bytes2 = androidCursor.getBytes(2);
                TransferFundsRequest transferFundsRequest = bytes2 != 0 ? (TransferFundsRequest) ((ScenarioPlan.Adapter) rewardSlotQueries.rewardSlotAdapter).scenario_planAdapter.decode(bytes2) : null;
                Long l = androidCursor.getLong(3);
                l.getClass();
                Long l2 = androidCursor.getLong(4);
                Long l3 = androidCursor.getLong(5);
                l3.getClass();
                String string2 = androidCursor.getString(6);
                Long l4 = androidCursor.getLong(7);
                l4.getClass();
                return offlineQueries$pending$2.invoke(m1431m, initiatePaymentRequest, transferFundsRequest, l, l2, l3, string2, l4);
            case 1:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) badgeQueries$VersionQuery.external_token);
                androidStatement.bindString(1, (String) badgeQueries$VersionQuery.item_type);
                return Unit.INSTANCE;
            case 2:
                EntityRangesQueries$selectAll$2 entityRangesQueries$selectAll$2 = EntityRangesQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                byte[] bytes3 = androidCursor2.getBytes(0);
                ((Path.Companion) ((InstrumentQueries) obj2).instrumentAdapter).getClass();
                Long l5 = androidCursor2.getLong(1);
                l5.getClass();
                return entityRangesQueries$selectAll$2.invoke(bytes3, Integer.valueOf((int) l5.longValue()));
            case 3:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, (byte[]) obj2);
                return Unit.INSTANCE;
            case 4:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, ((PaymentQueries.ForTokenQuery) obj2).token);
                return Unit.INSTANCE;
            case 5:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, ((PaymentQueries.ForTokenQuery) obj2).token);
                return Unit.INSTANCE;
            case 6:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery2 = (BadgeQueries$VersionQuery) obj2;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                Iterator it = ((ArrayList) badgeQueries$VersionQuery2.external_token).iterator();
                while (it.hasNext()) {
                    androidStatement5.bindString(i2, (String) it.next());
                    i2++;
                }
                Iterator it2 = ((ArrayList) badgeQueries$VersionQuery2.item_type).iterator();
                while (it2.hasNext()) {
                    androidStatement5.bindString(i2, (String) it2.next());
                    i2++;
                }
                return Unit.INSTANCE;
            case 7:
                OfflineQueries$PendingQuery offlineQueries$PendingQuery = (OfflineQueries$PendingQuery) obj2;
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindLong(0, Long.valueOf(offlineQueries$PendingQuery.max_recipients));
                androidStatement6.bindLong(1, Long.valueOf(offlineQueries$PendingQuery.limit));
                return Unit.INSTANCE;
            case 8:
                SyncEntityQueries$SelectAllWithEntityTypeQuery syncEntityQueries$SelectAllWithEntityTypeQuery = (SyncEntityQueries$SelectAllWithEntityTypeQuery) obj2;
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindLong(0, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.limit));
                Iterator it3 = ((Collection) syncEntityQueries$SelectAllWithEntityTypeQuery.entity_type).iterator();
                int i3 = 1;
                while (it3.hasNext()) {
                    androidStatement7.bindString(i3, (String) it3.next());
                    i3++;
                }
                androidStatement7.bindLong(i3, Long.valueOf(syncEntityQueries$SelectAllWithEntityTypeQuery.offset));
                return Unit.INSTANCE;
            case 9:
                LoyaltyMerchantQueries$loyaltyMerchant$2 loyaltyMerchantQueries$loyaltyMerchant$2 = LoyaltyMerchantQueries$loyaltyMerchant$2.INSTANCE;
                RewardSlotQueries rewardSlotQueries2 = (RewardSlotQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                String string3 = androidCursor3.getString(1);
                string3.getClass();
                String string4 = androidCursor3.getString(2);
                Long l6 = androidCursor3.getLong(3);
                l6.getClass();
                RecipientConfig$Adapter recipientConfig$Adapter = (RecipientConfig$Adapter) rewardSlotQueries2.rewardSlotAdapter;
                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) rewardSlotQueries2.rewardAdapter;
                Object m = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 4, recipientConfig$Adapter.request_dataAdapter);
                Object m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 5, ((RecipientConfig$Adapter) rewardSlotQueries2.rewardSlotAdapter).pay_dataAdapter);
                ?? bytes4 = androidCursor3.getBytes(6);
                Color color = bytes4 != 0 ? (Color) ((WireAdapter) builder.lazyDecoderFactories).decode(bytes4) : null;
                ?? bytes5 = androidCursor3.getBytes(7);
                Image image = bytes5 != 0 ? (Image) ((WireAdapter) builder.lazyFetcherFactories).decode(bytes5) : null;
                String string5 = androidCursor3.getString(8);
                string5.getClass();
                ?? bytes6 = androidCursor3.getBytes(9);
                MerchantData merchantData = bytes6 != 0 ? (MerchantData) ((WireAdapter) builder.mappers).decode(bytes6) : null;
                String string6 = androidCursor3.getString(10);
                String string7 = androidCursor3.getString(11);
                String m3 = Matcher$$ExternalSyntheticOutline0.m(string7, androidCursor3, 12);
                long longValue = l6.longValue();
                LoyaltyUnit loyaltyUnit = (LoyaltyUnit) m;
                ProgramRewards programRewards = (ProgramRewards) m2;
                string3.getClass();
                loyaltyUnit.getClass();
                programRewards.getClass();
                string5.getClass();
                string7.getClass();
                m3.getClass();
                return new LoyaltyMerchant(m1431m2, string3, string4, longValue, loyaltyUnit, programRewards, color, image, string5, merchantData, string6, string7, m3);
            case 10:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 11:
                OfflineQueries$PendingQuery offlineQueries$PendingQuery2 = (OfflineQueries$PendingQuery) obj2;
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindLong(0, Long.valueOf(offlineQueries$PendingQuery2.max_recipients));
                androidStatement9.bindLong(1, Long.valueOf(offlineQueries$PendingQuery2.limit));
                androidStatement9.bindLong(2, 0L);
                return Unit.INSTANCE;
            case 12:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 13:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 14:
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 15:
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                androidStatement13.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 16:
                BalanceDataQueries$select$2 balanceDataQueries$select$2 = BalanceDataQueries$select$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                Boolean bool = androidCursor4.getBoolean(0);
                bool.getClass();
                Reward$Adapter reward$Adapter = (Reward$Adapter) ((InstrumentQueries) obj2).instrumentAdapter;
                reward$Adapter.getClass();
                Long l7 = androidCursor4.getLong(1);
                l7.getClass();
                Integer valueOf = Integer.valueOf((int) l7.longValue());
                Boolean bool2 = androidCursor4.getBoolean(2);
                bool2.getClass();
                Enum m4 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 3, (EnumColumnAdapter) reward$Adapter.boost_detail_rowsAdapter);
                String string8 = androidCursor4.getString(4);
                WireRepeatedAdapter wireRepeatedAdapter = (WireRepeatedAdapter) reward$Adapter.program_detail_rowsAdapter;
                ?? bytes7 = androidCursor4.getBytes(5);
                bytes7.getClass();
                Object decode = wireRepeatedAdapter.decode(bytes7);
                ?? bytes8 = androidCursor4.getBytes(6);
                ScheduledReloadData scheduledReloadData = bytes8 != 0 ? (ScheduledReloadData) ((WireAdapter) reward$Adapter.avatarsAdapter).decode(bytes8) : null;
                Boolean bool3 = androidCursor4.getBoolean(7);
                bool3.getClass();
                Enum m5 = NavAction$$ExternalSyntheticOutline0.m(androidCursor4, 8, (EnumColumnAdapter) reward$Adapter.boost_attributesAdapter);
                String string9 = androidCursor4.getString(9);
                ScheduledReloadData scheduledReloadData2 = scheduledReloadData;
                Boolean bool4 = androidCursor4.getBoolean(10);
                bool4.getClass();
                ?? bytes9 = androidCursor4.getBytes(11);
                BalanceData.Button button = bytes9 != 0 ? (BalanceData.Button) ((WireAdapter) reward$Adapter.reward_selection_stateAdapter).decode(bytes9) : null;
                ?? bytes10 = androidCursor4.getBytes(12);
                BalanceData.Button button2 = bytes10 != 0 ? (BalanceData.Button) ((WireAdapter) reward$Adapter.boost_detail_bottom_upsellAdapter).decode(bytes10) : null;
                ?? bytes11 = androidCursor4.getBytes(13);
                BalanceData.Button button3 = bytes11 != 0 ? (BalanceData.Button) ((WireAdapter) reward$Adapter.app_linksAdapter).decode(bytes11) : null;
                Boolean bool5 = androidCursor4.getBoolean(14);
                bool5.getClass();
                return balanceDataQueries$select$2.invoke(bool, valueOf, bool2, m4, string8, decode, scheduledReloadData2, bool3, m5, string9, bool4, button, button2, button3, bool5);
            case 17:
                CustomerProfileQueries$customerProfile$2 customerProfileQueries$customerProfile$2 = CustomerProfileQueries$customerProfile$2.INSTANCE;
                ComponentRegistry.Builder builder2 = ((ContactQueries) obj2).customerAdapter;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor5, 0);
                String string10 = androidCursor5.getString(1);
                String string11 = androidCursor5.getString(2);
                String string12 = androidCursor5.getString(3);
                ?? bytes12 = androidCursor5.getBytes(4);
                Image image2 = bytes12 != 0 ? (Image) ((WireAdapter) builder2.lazyFetcherFactories).decode(bytes12) : null;
                ?? bytes13 = androidCursor5.getBytes(5);
                Color color2 = bytes13 != 0 ? (Color) ((WireAdapter) builder2.lazyDecoderFactories).decode(bytes13) : null;
                String string13 = androidCursor5.getString(6);
                String string14 = androidCursor5.getString(7);
                String string15 = androidCursor5.getString(8);
                Boolean bool6 = androidCursor5.getBoolean(9);
                Boolean m6 = Matcher$$ExternalSyntheticOutline0.m(bool6, androidCursor5, 10);
                String string16 = androidCursor5.getString(11);
                Region region = string16 != null ? (Region) ((EnumColumnAdapter) builder2.keyers).decode(string16) : null;
                Long l8 = androidCursor5.getLong(12);
                Enum m7 = NavAction$$ExternalSyntheticOutline0.m(androidCursor5, 13, (EnumColumnAdapter) builder2.interceptors);
                Boolean bool7 = androidCursor5.getBoolean(14);
                bool7.getClass();
                ?? bytes14 = androidCursor5.getBytes(15);
                MerchantData merchantData2 = bytes14 != 0 ? (MerchantData) ((WireAdapter) builder2.mappers).decode(bytes14) : null;
                Boolean bool8 = androidCursor5.getBoolean(16);
                bool8.getClass();
                boolean booleanValue = bool6.booleanValue();
                boolean booleanValue2 = m6.booleanValue();
                BlockState blockState = (BlockState) m7;
                boolean booleanValue3 = bool7.booleanValue();
                boolean booleanValue4 = bool8.booleanValue();
                blockState.getClass();
                return new CustomerProfile(m1431m3, string10, string11, string12, image2, color2, string13, string14, string15, booleanValue, booleanValue2, region, l8, blockState, booleanValue3, merchantData2, booleanValue4);
            case 18:
                AndroidStatement androidStatement14 = (AndroidStatement) obj;
                androidStatement14.getClass();
                androidStatement14.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 19:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery3 = (BadgeQueries$VersionQuery) obj2;
                AndroidStatement androidStatement15 = (AndroidStatement) obj;
                androidStatement15.getClass();
                String str = (String) badgeQueries$VersionQuery3.external_token;
                androidStatement15.bindString(0, str);
                androidStatement15.bindString(1, str);
                String str2 = (String) badgeQueries$VersionQuery3.item_type;
                androidStatement15.bindString(2, str2);
                androidStatement15.bindString(3, str2);
                return Unit.INSTANCE;
            case 20:
                ExtendedProfileDetailsQueries$forCustomerToken$2 extendedProfileDetailsQueries$forCustomerToken$2 = ExtendedProfileDetailsQueries$forCustomerToken$2.INSTANCE;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                String m1431m4 = re$$ExternalSyntheticOutline0.m1431m(androidCursor6, 0);
                WireAdapter wireAdapter = ((BlockersConfig.Adapter) ((InstrumentQueries) obj2).instrumentAdapter).target_balance_amountAdapter;
                ?? bytes15 = androidCursor6.getBytes(1);
                bytes15.getClass();
                return extendedProfileDetailsQueries$forCustomerToken$2.invoke(m1431m4, wireAdapter.decode(bytes15));
            case 21:
                AndroidStatement androidStatement16 = (AndroidStatement) obj;
                androidStatement16.getClass();
                androidStatement16.bindString(0, (String) ((OffersSheetQueries$ForSheetKeyQuery) obj2).sheet_key);
                return Unit.INSTANCE;
            case 22:
                RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 realProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 = RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1.INSTANCE;
                AndroidCursor androidCursor7 = (AndroidCursor) obj;
                String m1431m5 = re$$ExternalSyntheticOutline0.m1431m(androidCursor7, 0);
                Boolean bool9 = androidCursor7.getBoolean(1);
                bool9.getClass();
                return realProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1.invoke(m1431m5, bool9, NavAction$$ExternalSyntheticOutline0.m(androidCursor7, 2, ((Alias$Adapter) ((InstrumentQueries) obj2).instrumentAdapter).sync_stateAdapter));
            case 23:
                RealProfileAliasRepository$forAliasTypeProfileValues$1 realProfileAliasRepository$forAliasTypeProfileValues$1 = RealProfileAliasRepository$forAliasTypeProfileValues$1.INSTANCE;
                AndroidCursor androidCursor8 = (AndroidCursor) obj;
                String m1431m6 = re$$ExternalSyntheticOutline0.m1431m(androidCursor8, 0);
                Boolean bool10 = androidCursor8.getBoolean(1);
                bool10.getClass();
                return realProfileAliasRepository$forAliasTypeProfileValues$1.invoke(m1431m6, bool10, NavAction$$ExternalSyntheticOutline0.m(androidCursor8, 2, ((EnumListAdapter) ((InstrumentQueries) obj2).instrumentAdapter).enumColumnAdapter));
            case 24:
                ScenarioPlanQueries$forClientScenario$2 scenarioPlanQueries$forClientScenario$2 = ScenarioPlanQueries$forClientScenario$2.INSTANCE;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidCursor androidCursor9 = (AndroidCursor) obj;
                androidCursor9.getClass();
                Enum m8 = NavAction$$ExternalSyntheticOutline0.m(androidCursor9, 0, ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).client_scenarioAdapter);
                WireAdapter wireAdapter2 = ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).scenario_planAdapter;
                ?? bytes16 = androidCursor9.getBytes(1);
                bytes16.getClass();
                return scenarioPlanQueries$forClientScenario$2.invoke(m8, wireAdapter2.decode(bytes16));
            case 25:
                SingleAccountHolderEligibilityQueries$eligibility$2 singleAccountHolderEligibilityQueries$eligibility$2 = SingleAccountHolderEligibilityQueries$eligibility$2.INSTANCE;
                SingleAccountHolderEligibility.Adapter adapter = (SingleAccountHolderEligibility.Adapter) ((InstrumentQueries) obj2).instrumentAdapter;
                AndroidCursor androidCursor10 = (AndroidCursor) obj;
                String m1431m7 = re$$ExternalSyntheticOutline0.m1431m(androidCursor10, 0);
                Long l9 = androidCursor10.getLong(1);
                l9.getClass();
                ?? bytes17 = androidCursor10.getBytes(2);
                C4bEligibilityState c4bEligibilityState = bytes17 != 0 ? (C4bEligibilityState) adapter.moneyBtcAppletAdapter.decode(bytes17) : null;
                ?? bytes18 = androidCursor10.getBytes(3);
                C4bEligibilityState c4bEligibilityState2 = bytes18 != 0 ? (C4bEligibilityState) adapter.moneyTaxesAppletAdapter.decode(bytes18) : null;
                ?? bytes19 = androidCursor10.getBytes(4);
                C4bEligibilityState c4bEligibilityState3 = bytes19 != 0 ? (C4bEligibilityState) adapter.moneyFamiliesAppletAdapter.decode(bytes19) : null;
                ?? bytes20 = androidCursor10.getBytes(5);
                C4bEligibilityState c4bEligibilityState4 = bytes20 != 0 ? (C4bEligibilityState) adapter.moneyGlobalBorrowAppletAdapter.decode(bytes20) : null;
                ?? bytes21 = androidCursor10.getBytes(6);
                C4bEligibilityState c4bEligibilityState5 = bytes21 != 0 ? (C4bEligibilityState) adapter.moneyInvestingAppletAdapter.decode(bytes21) : null;
                ?? bytes22 = androidCursor10.getBytes(7);
                C4bEligibilityState c4bEligibilityState6 = bytes22 != 0 ? (C4bEligibilityState) adapter.moneyTabHomeDesignSystemAdapter.decode(bytes22) : null;
                ?? bytes23 = androidCursor10.getBytes(8);
                C4bEligibilityState c4bEligibilityState7 = bytes23 != 0 ? (C4bEligibilityState) adapter.cashCardTabAdapter.decode(bytes23) : null;
                ?? bytes24 = androidCursor10.getBytes(9);
                C4bEligibilityState c4bEligibilityState8 = bytes24 != 0 ? (C4bEligibilityState) adapter.cashOffersTabAdapter.decode(bytes24) : null;
                ?? bytes25 = androidCursor10.getBytes(10);
                C4bEligibilityState c4bEligibilityState9 = bytes25 != 0 ? (C4bEligibilityState) adapter.paymentSendAsGiftCardAdapter.decode(bytes25) : null;
                ?? bytes26 = androidCursor10.getBytes(11);
                C4bEligibilityState c4bEligibilityState10 = bytes26 != 0 ? (C4bEligibilityState) adapter.paymentSendAsBtcAdapter.decode(bytes26) : null;
                ?? bytes27 = androidCursor10.getBytes(12);
                C4bEligibilityState c4bEligibilityState11 = bytes27 != 0 ? (C4bEligibilityState) adapter.paymentSendAsStockAdapter.decode(bytes27) : null;
                ?? bytes28 = androidCursor10.getBytes(13);
                C4bEligibilityState c4bEligibilityState12 = bytes28 != 0 ? (C4bEligibilityState) adapter.paymentPersonalToC4bAdapter.decode(bytes28) : null;
                ?? bytes29 = androidCursor10.getBytes(14);
                C4bEligibilityState c4bEligibilityState13 = bytes29 != 0 ? (C4bEligibilityState) adapter.settingsTaxPasswordAuthAppAdapter.decode(bytes29) : null;
                ?? bytes30 = androidCursor10.getBytes(15);
                C4bEligibilityState c4bEligibilityState14 = bytes30 != 0 ? (C4bEligibilityState) adapter.settingsInvestTrustedContactAppAdapter.decode(bytes30) : null;
                ?? bytes31 = androidCursor10.getBytes(16);
                C4bEligibilityState c4bEligibilityState15 = bytes31 != 0 ? (C4bEligibilityState) adapter.accountSwitcherAdapter.decode(bytes31) : null;
                ?? bytes32 = androidCursor10.getBytes(17);
                C4bEligibilityState c4bEligibilityState16 = bytes32 != 0 ? (C4bEligibilityState) adapter.activityTreehouseAdapter.decode(bytes32) : null;
                ?? bytes33 = androidCursor10.getBytes(18);
                C4bEligibilityState c4bEligibilityState17 = bytes33 != 0 ? (C4bEligibilityState) adapter.documentsBtcAdapter.decode(bytes33) : null;
                ?? bytes34 = androidCursor10.getBytes(19);
                C4bEligibilityState c4bEligibilityState18 = bytes34 != 0 ? (C4bEligibilityState) adapter.documentsStockAdapter.decode(bytes34) : null;
                ?? bytes35 = androidCursor10.getBytes(20);
                C4bEligibilityState c4bEligibilityState19 = bytes35 != 0 ? (C4bEligibilityState) adapter.documentsTaxesAdapter.decode(bytes35) : null;
                ?? bytes36 = androidCursor10.getBytes(21);
                C4bEligibilityState c4bEligibilityState20 = bytes36 != 0 ? (C4bEligibilityState) adapter.dda_tabAdapter.decode(bytes36) : null;
                ?? bytes37 = androidCursor10.getBytes(22);
                C4bEligibilityState c4bEligibilityState21 = bytes37 != 0 ? (C4bEligibilityState) adapter.remittanceSendAdapter.decode(bytes37) : null;
                ?? bytes38 = androidCursor10.getBytes(23);
                C4bEligibilityState c4bEligibilityState22 = bytes38 != 0 ? (C4bEligibilityState) adapter.tapToPayAdapter.decode(bytes38) : null;
                ?? bytes39 = androidCursor10.getBytes(24);
                C4bEligibilityState c4bEligibilityState23 = bytes39 != 0 ? (C4bEligibilityState) adapter.sponsorEligibleAdapter.decode(bytes39) : null;
                ?? bytes40 = androidCursor10.getBytes(25);
                C4bEligibilityState c4bEligibilityState24 = bytes40 != 0 ? (C4bEligibilityState) adapter.moneyEarningsAppletAdapter.decode(bytes40) : null;
                ?? bytes41 = androidCursor10.getBytes(26);
                C4bEligibilityState c4bEligibilityState25 = bytes41 != 0 ? (C4bEligibilityState) adapter.c4bPromotionVisibilityAdapter.decode(bytes41) : null;
                ?? bytes42 = androidCursor10.getBytes(27);
                C4bEligibilityState c4bEligibilityState26 = bytes42 != 0 ? (C4bEligibilityState) adapter.moneybotVisibilityAdapter.decode(bytes42) : null;
                ?? bytes43 = androidCursor10.getBytes(28);
                C4bEligibilityState c4bEligibilityState27 = bytes43 != 0 ? (C4bEligibilityState) adapter.personalizedAdsToggleAdapter.decode(bytes43) : null;
                ?? bytes44 = androidCursor10.getBytes(29);
                C4bEligibilityState c4bEligibilityState28 = bytes44 != 0 ? (C4bEligibilityState) adapter.poolsOnboardingVisibilityAdapter.decode(bytes44) : null;
                ?? bytes45 = androidCursor10.getBytes(30);
                C4bEligibilityState c4bEligibilityState29 = bytes45 != 0 ? (C4bEligibilityState) adapter.workAppletVisibilityAdapter.decode(bytes45) : null;
                ?? bytes46 = androidCursor10.getBytes(31);
                C4bEligibilityState c4bEligibilityState30 = bytes46 != 0 ? (C4bEligibilityState) adapter.nearbyPaymentFeatureVisibilityAdapter.decode(bytes46) : null;
                ?? bytes47 = androidCursor10.getBytes(32);
                C4bEligibilityState c4bEligibilityState31 = bytes47 != 0 ? (C4bEligibilityState) adapter.bitcoinAutoInvestAdapter.decode(bytes47) : null;
                ?? bytes48 = androidCursor10.getBytes(33);
                Object[] objArr = {m1431m7, l9, c4bEligibilityState, c4bEligibilityState2, c4bEligibilityState3, c4bEligibilityState4, c4bEligibilityState5, c4bEligibilityState6, c4bEligibilityState7, c4bEligibilityState8, c4bEligibilityState9, c4bEligibilityState10, c4bEligibilityState11, c4bEligibilityState12, c4bEligibilityState13, c4bEligibilityState14, c4bEligibilityState15, c4bEligibilityState16, c4bEligibilityState17, c4bEligibilityState18, c4bEligibilityState19, c4bEligibilityState20, c4bEligibilityState21, c4bEligibilityState22, c4bEligibilityState23, c4bEligibilityState24, c4bEligibilityState25, c4bEligibilityState26, c4bEligibilityState27, c4bEligibilityState28, c4bEligibilityState29, c4bEligibilityState30, c4bEligibilityState31, bytes48 != 0 ? (C4bEligibilityState) adapter.recurringP2pPaymentFeatureVisibilityAdapter.decode(bytes48) : null};
                if (objArr.length != 34) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 34 arguments");
                    return null;
                }
                String str3 = (String) objArr[0];
                long longValue2 = ((Number) objArr[1]).longValue();
                C4bEligibilityState c4bEligibilityState32 = (C4bEligibilityState) objArr[2];
                C4bEligibilityState c4bEligibilityState33 = (C4bEligibilityState) objArr[3];
                C4bEligibilityState c4bEligibilityState34 = (C4bEligibilityState) objArr[4];
                C4bEligibilityState c4bEligibilityState35 = (C4bEligibilityState) objArr[5];
                C4bEligibilityState c4bEligibilityState36 = (C4bEligibilityState) objArr[6];
                C4bEligibilityState c4bEligibilityState37 = (C4bEligibilityState) objArr[7];
                C4bEligibilityState c4bEligibilityState38 = (C4bEligibilityState) objArr[8];
                C4bEligibilityState c4bEligibilityState39 = (C4bEligibilityState) objArr[9];
                C4bEligibilityState c4bEligibilityState40 = (C4bEligibilityState) objArr[10];
                C4bEligibilityState c4bEligibilityState41 = (C4bEligibilityState) objArr[11];
                C4bEligibilityState c4bEligibilityState42 = (C4bEligibilityState) objArr[12];
                C4bEligibilityState c4bEligibilityState43 = (C4bEligibilityState) objArr[13];
                C4bEligibilityState c4bEligibilityState44 = (C4bEligibilityState) objArr[14];
                C4bEligibilityState c4bEligibilityState45 = (C4bEligibilityState) objArr[15];
                C4bEligibilityState c4bEligibilityState46 = (C4bEligibilityState) objArr[16];
                C4bEligibilityState c4bEligibilityState47 = (C4bEligibilityState) objArr[17];
                C4bEligibilityState c4bEligibilityState48 = (C4bEligibilityState) objArr[18];
                C4bEligibilityState c4bEligibilityState49 = (C4bEligibilityState) objArr[19];
                C4bEligibilityState c4bEligibilityState50 = (C4bEligibilityState) objArr[20];
                C4bEligibilityState c4bEligibilityState51 = (C4bEligibilityState) objArr[21];
                C4bEligibilityState c4bEligibilityState52 = (C4bEligibilityState) objArr[22];
                C4bEligibilityState c4bEligibilityState53 = (C4bEligibilityState) objArr[23];
                C4bEligibilityState c4bEligibilityState54 = (C4bEligibilityState) objArr[24];
                C4bEligibilityState c4bEligibilityState55 = (C4bEligibilityState) objArr[25];
                C4bEligibilityState c4bEligibilityState56 = (C4bEligibilityState) objArr[26];
                C4bEligibilityState c4bEligibilityState57 = (C4bEligibilityState) objArr[27];
                C4bEligibilityState c4bEligibilityState58 = (C4bEligibilityState) objArr[28];
                C4bEligibilityState c4bEligibilityState59 = (C4bEligibilityState) objArr[29];
                C4bEligibilityState c4bEligibilityState60 = (C4bEligibilityState) objArr[30];
                C4bEligibilityState c4bEligibilityState61 = (C4bEligibilityState) objArr[31];
                C4bEligibilityState c4bEligibilityState62 = (C4bEligibilityState) objArr[32];
                C4bEligibilityState c4bEligibilityState63 = (C4bEligibilityState) objArr[33];
                str3.getClass();
                return new SingleAccountHolderEligibility(str3, longValue2, c4bEligibilityState32, c4bEligibilityState33, c4bEligibilityState34, c4bEligibilityState35, c4bEligibilityState36, c4bEligibilityState37, c4bEligibilityState38, c4bEligibilityState39, c4bEligibilityState40, c4bEligibilityState41, c4bEligibilityState42, c4bEligibilityState43, c4bEligibilityState44, c4bEligibilityState45, c4bEligibilityState46, c4bEligibilityState47, c4bEligibilityState48, c4bEligibilityState49, c4bEligibilityState50, c4bEligibilityState51, c4bEligibilityState52, c4bEligibilityState53, c4bEligibilityState54, c4bEligibilityState55, c4bEligibilityState56, c4bEligibilityState57, c4bEligibilityState58, c4bEligibilityState59, c4bEligibilityState60, c4bEligibilityState61, c4bEligibilityState62, c4bEligibilityState63);
            case 26:
                AndroidStatement androidStatement17 = (AndroidStatement) obj;
                androidStatement17.getClass();
                androidStatement17.bindString(0, ((SingleAccountHolderEligibilityQueries$EligibilityQuery) obj2).customerToken);
                return Unit.INSTANCE;
            case 27:
                AndroidStatement androidStatement18 = (AndroidStatement) obj;
                androidStatement18.getClass();
                androidStatement18.bindString(0, ((SingleAccountHolderEligibilityQueries$EligibilityQuery) obj2).customerToken);
                return Unit.INSTANCE;
            case 28:
                AvailableAccountStatementQueries$selectAll$2 availableAccountStatementQueries$selectAll$2 = AvailableAccountStatementQueries$selectAll$2.INSTANCE;
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor11 = (AndroidCursor) obj;
                String m1431m8 = re$$ExternalSyntheticOutline0.m1431m(androidCursor11, 0);
                String string17 = androidCursor11.getString(1);
                String string18 = androidCursor11.getString(2);
                ?? bytes49 = androidCursor11.getBytes(3);
                return availableAccountStatementQueries$selectAll$2.invoke(m1431m8, string17, string18, bytes49 != 0 ? (StatementCoverage) ((Local_tab_content.Adapter) instrumentQueries2.instrumentAdapter).responseAdapter.decode(bytes49) : null);
            default:
                AndroidCursor androidCursor12 = (AndroidCursor) obj;
                return CustomerStatementTypeQueries$selectForType$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m1431m(androidCursor12, 0), androidCursor12.getBoolean(1), androidCursor12.getString(2), NavAction$$ExternalSyntheticOutline0.m(androidCursor12, 3, ((EnumListAdapter) ((InstrumentQueries) obj2).instrumentAdapter).enumColumnAdapter), androidCursor12.getBoolean(4));
        }
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(RewardSlotQueries rewardSlotQueries, byte b) {
        this.$r8$classId = 0;
        OfflineQueries$pending$2 offlineQueries$pending$2 = OfflineQueries$pending$2.INSTANCE;
        this.f$1 = rewardSlotQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries) {
        this.$r8$classId = 2;
        EntityRangesQueries$selectAll$2 entityRangesQueries$selectAll$2 = EntityRangesQueries$selectAll$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, byte b) {
        this.$r8$classId = 16;
        BalanceDataQueries$select$2 balanceDataQueries$select$2 = BalanceDataQueries$select$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, byte b, byte b2) {
        this.$r8$classId = 25;
        SingleAccountHolderEligibilityQueries$eligibility$2 singleAccountHolderEligibilityQueries$eligibility$2 = SingleAccountHolderEligibilityQueries$eligibility$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, byte b, char c) {
        this.$r8$classId = 28;
        AvailableAccountStatementQueries$selectAll$2 availableAccountStatementQueries$selectAll$2 = AvailableAccountStatementQueries$selectAll$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, byte b, int i) {
        this.$r8$classId = 29;
        CustomerStatementTypeQueries$selectForType$2 customerStatementTypeQueries$selectForType$2 = CustomerStatementTypeQueries$selectForType$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, byte b, boolean z) {
        this.$r8$classId = 24;
        ScenarioPlanQueries$forClientScenario$2 scenarioPlanQueries$forClientScenario$2 = ScenarioPlanQueries$forClientScenario$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, char c) {
        this.$r8$classId = 20;
        ExtendedProfileDetailsQueries$forCustomerToken$2 extendedProfileDetailsQueries$forCustomerToken$2 = ExtendedProfileDetailsQueries$forCustomerToken$2.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = 22;
        RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 realProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1 = RealProfileNotificationsRepository$getAliasNotificationPreferences$fromProfile$1.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, short s) {
        this.$r8$classId = 23;
        RealProfileAliasRepository$forAliasTypeProfileValues$1 realProfileAliasRepository$forAliasTypeProfileValues$1 = RealProfileAliasRepository$forAliasTypeProfileValues$1.INSTANCE;
        this.f$1 = instrumentQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(ContactQueries contactQueries) {
        this.$r8$classId = 17;
        CustomerProfileQueries$customerProfile$2 customerProfileQueries$customerProfile$2 = CustomerProfileQueries$customerProfile$2.INSTANCE;
        this.f$1 = contactQueries;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
