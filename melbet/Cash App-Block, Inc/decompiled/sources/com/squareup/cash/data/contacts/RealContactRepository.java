package com.squareup.cash.data.contacts;

import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.AliasQueries$CustomerIdForAliasQuery;
import com.squareup.cash.db2.contacts.AliasQueries$customerIdForAlias$2;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.CustomerQueries$ForIdQuery;
import com.squareup.cash.db2.contacts.SelectForSyncState;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.entities.PaymentQueries$recents$2;
import com.squareup.cash.db2.entities.PaymentQueries.RecentsQuery;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.recipients.RecipientQueries$recipients$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactRepository implements ContactsSyncRoutine {
    public final InstrumentQueries aliasQueries;
    public final Analytics analytics;
    public final SessionQueries contactAliasQueries;
    public final ContactQueries contactQueries;
    public final RewardSlotQueries customerQueries;
    public final SessionQueries databaseQueries;
    public final CoroutineContext ioDispatcher;
    public final PaymentQueries paymentQueries;
    public final PermissionChecker permissionChecker;
    public final RealProfileManager profileManager;
    public final ContactQueries recipientQueries;

    public RealContactRepository(PermissionChecker permissionChecker, CoroutineContext coroutineContext, RealProfileManager realProfileManager, Analytics analytics, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.permissionChecker = permissionChecker;
        this.ioDispatcher = coroutineContext;
        this.profileManager = realProfileManager;
        this.analytics = analytics;
        this.contactQueries = cashAccountDatabaseImpl.contactQueries;
        this.paymentQueries = cashAccountDatabaseImpl.paymentQueries;
        this.aliasQueries = cashAccountDatabaseImpl.aliasQueries;
        this.customerQueries = cashAccountDatabaseImpl.customerQueries;
        this.contactAliasQueries = cashAccountDatabaseImpl.contactAliasQueries;
        this.recipientQueries = cashAccountDatabaseImpl.recipientQueries;
        this.databaseQueries = cashAccountDatabaseImpl.databaseQueries;
    }

    public static ArrayList hashedListBy(List list, AliasSyncState aliasSyncState) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SelectForSyncState) obj).getSync_state() == aliasSyncState) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SelectForSyncState) it.next()).getHashed_alias());
        }
        return arrayList2;
    }

    public static int upsertAliasRequireTransaction$default(RealContactRepository realContactRepository, String str, String str2, String str3, int i) {
        String str4;
        int i2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        SessionQueries sessionQueries = realContactRepository.contactAliasQueries;
        InstrumentQueries instrumentQueries = realContactRepository.aliasQueries;
        if (str3 == null) {
            str2.getClass();
            str4 = str2;
        } else {
            str4 = str3;
        }
        String hash = Aliases.hash(str4);
        AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
        AliasSyncState aliasSyncState2 = AliasSyncState.SYNCED;
        instrumentQueries.getClass();
        SqlDriver sqlDriver = instrumentQueries.driver;
        sqlDriver.execute(null, StringsKt__IndentKt.trimMargin$default("\n        |UPDATE alias\n        |SET sync_state = ?\n        |WHERE hashed_alias = ?\n        |AND sync_state != ?\n        "), new InstrumentQueries$$ExternalSyntheticLambda0(hash, instrumentQueries));
        boolean z = false;
        instrumentQueries.notifyQueries(-2147191746, new WebLoginConfigQueries$$ExternalSyntheticLambda2(12, z));
        if (realContactRepository.noRowsWereModified()) {
            sqlDriver.execute(1451105044, "INSERT OR IGNORE INTO alias\nVALUES (?, ?, ?, ?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(hash, str3, str2, instrumentQueries));
            instrumentQueries.notifyQueries(1451105044, new WebLoginConfigQueries$$ExternalSyntheticLambda2(13, z));
            i2 = 1;
        } else {
            i2 = 0;
        }
        sessionQueries.getClass();
        SqlDriver sqlDriver2 = sessionQueries.driver;
        str.getClass();
        sqlDriver2.execute(954620239, "UPDATE contact_alias\nSET in_address_book = 1\nWHERE hashed_alias = ?\nAND lookup_key = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(hash, str, 15));
        sessionQueries.notifyQueries(954620239, new WebLoginConfigQueries$$ExternalSyntheticLambda2(17, z));
        if (realContactRepository.noRowsWereModified()) {
            sqlDriver2.execute(-1135318750, "INSERT INTO contact_alias (hashed_alias, lookup_key)\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(hash, str, 16));
            sessionQueries.notifyQueries(-1135318750, new WebLoginConfigQueries$$ExternalSyntheticLambda2(18, z));
        }
        return i2;
    }

    public final RealContactRepository$contacts$$inlined$map$1 contactById(String str) {
        str.getClass();
        RealContactRepository$contactById$1 realContactRepository$contactById$1 = RealContactRepository$contactById$1.INSTANCE;
        ContactQueries contactQueries = this.contactQueries;
        contactQueries.getClass();
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new ContactQueries.ContactByIdQuery(contactQueries, str, new ContactQueries$$ExternalSyntheticLambda2(contactQueries, 1), 0)), this.ioDispatcher), 6);
    }

    public final RealContactRepository$contacts$$inlined$map$1 contacts() {
        BlockState blockState = BlockState.BLOCKED;
        RealContactRepository$contacts$1 realContactRepository$contacts$1 = RealContactRepository$contacts$1.INSTANCE;
        ContactQueries contactQueries = this.contactQueries;
        contactQueries.getClass();
        int i = 0;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardQueries.ForIdsQuery(contactQueries, blockState, new ContactQueries$$ExternalSyntheticLambda2(contactQueries, i), 21)), this.ioDispatcher), i);
    }

    public final Flow contactsStatusForCustomer(String str) {
        str.getClass();
        if (!this.permissionChecker.hasContacts()) {
            return new AppLockMonitor$special$$inlined$map$2(ContactsStatus.CONTACTS_DISABLED, 19);
        }
        InstrumentQueries instrumentQueries = this.aliasQueries;
        instrumentQueries.getClass();
        return new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new AliasQueries$CustomerIdForAliasQuery(instrumentQueries, str, new WebLoginConfigQueries$$ExternalSyntheticLambda2(11, false), 1)), this.ioDispatcher), 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.data.contacts.ContactsSyncRoutine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object contactsSync(List list, ContactSync$SyncReason contactSync$SyncReason, ContinuationImpl continuationImpl) {
        RealContactRepository$contactsSync$1 realContactRepository$contactsSync$1;
        int i;
        if (continuationImpl instanceof RealContactRepository$contactsSync$1) {
            realContactRepository$contactsSync$1 = (RealContactRepository$contactsSync$1) continuationImpl;
            int i2 = realContactRepository$contactsSync$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realContactRepository$contactsSync$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realContactRepository$contactsSync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realContactRepository$contactsSync$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealProfileManager realProfileManager = this.profileManager;
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(StateFlowKt.runUntil(DBUtil.toFlow(realProfileManager.profileQueries.selectRegion()), realProfileManager.signOutSignal), realProfileManager.ioDispatcher);
                    realContactRepository$contactsSync$1.L$0 = list;
                    realContactRepository$contactsSync$1.label = 1;
                    obj = FlowKt.first(mapToOneOrNull, realContactRepository$contactsSync$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = realContactRepository$contactsSync$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return TransactorKt.transactionWithResult$default(this.contactQueries, new CaptureCheckFaceKt$$ExternalSyntheticLambda11(22, this, list, (SelectRegion) obj));
            }
        }
        realContactRepository$contactsSync$1 = new RealContactRepository$contactsSync$1(this, continuationImpl);
        Object obj2 = realContactRepository$contactsSync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realContactRepository$contactsSync$1.label;
        if (i != 0) {
        }
        return TransactorKt.transactionWithResult$default(this.contactQueries, new CaptureCheckFaceKt$$ExternalSyntheticLambda11(22, this, list, (SelectRegion) obj2));
    }

    public final FlowQuery$mapToList$$inlined$map$1 customerFirstNameById(String str) {
        str.getClass();
        RewardSlotQueries rewardSlotQueries = this.customerQueries;
        rewardSlotQueries.getClass();
        return DBUtil.mapToOneOrNull(DBUtil.toFlow(new CustomerQueries$ForIdQuery(rewardSlotQueries, str, new ContactQueries$$ExternalSyntheticLambda1(11))), this.ioDispatcher);
    }

    public final boolean noRowsWereModified() {
        return ((Number) this.databaseQueries.changes().executeAsOne()).longValue() == 0;
    }

    public final RealContactRepository$recents$$inlined$mapItems$1 recents(long j) {
        BlockState blockState = BlockState.BLOCKED;
        PaymentState paymentState = PaymentState.COMPLETE;
        Orientation orientation = Orientation.BILL;
        Role role = Role.RECIPIENT;
        PaymentState paymentState2 = PaymentState.FAILED;
        PaymentQueries paymentQueries = this.paymentQueries;
        paymentQueries.getClass();
        blockState.getClass();
        orientation.getClass();
        PaymentQueries$recents$2 paymentQueries$recents$2 = PaymentQueries$recents$2.INSTANCE;
        return new RealContactRepository$recents$$inlined$mapItems$1(DBUtil.mapToList(DBUtil.toFlow(paymentQueries.new RecentsQuery(blockState, paymentState, orientation, role, paymentState2, j, new StorageLinkQueries$$ExternalSyntheticLambda8(paymentQueries))), this.ioDispatcher), 0);
    }

    public final RealContactRepository$contacts$$inlined$map$1 recipients() {
        BlockState blockState = BlockState.BLOCKED;
        ContactQueries contactQueries = this.recipientQueries;
        contactQueries.getClass();
        RecipientQueries$recipients$2 recipientQueries$recipients$2 = RecipientQueries$recipients$2.INSTANCE;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(contactQueries, blockState, new RecipientQueries$$ExternalSyntheticLambda0(contactQueries), 7)), this.ioDispatcher), 8);
    }

    public final Flow shouldShowConfirm(Recipient recipient) {
        String cashtag = recipient.getCashtag();
        int i = 9;
        CoroutineContext coroutineContext = this.ioDispatcher;
        if (cashtag != null) {
            String lookupKey = recipient.getLookupKey();
            String str = lookupKey == null ? "" : lookupKey;
            String customerId = recipient.getCustomerId();
            String str2 = customerId == null ? "" : customerId;
            RewardSlotQueries rewardSlotQueries = this.customerQueries;
            rewardSlotQueries.getClass();
            return new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new BadgeQueries$VersionQuery(rewardSlotQueries, str, str2, new ContactQueries$$ExternalSyntheticLambda1(i), 4)), coroutineContext);
        }
        String sms = recipient.getSms() != null ? recipient.getSms() : recipient.getEmail() != null ? recipient.getEmail() : null;
        if (sms == null) {
            return new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, 19);
        }
        InstrumentQueries instrumentQueries = this.aliasQueries;
        instrumentQueries.getClass();
        AliasQueries$customerIdForAlias$2 aliasQueries$customerIdForAlias$2 = AliasQueries$customerIdForAlias$2.INSTANCE;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new AliasQueries$CustomerIdForAliasQuery(instrumentQueries, sms, new WebLoginConfigQueries$$ExternalSyntheticLambda2(10), 0)), coroutineContext), i);
    }
}
