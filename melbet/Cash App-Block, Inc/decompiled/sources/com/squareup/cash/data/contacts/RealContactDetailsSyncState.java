package com.squareup.cash.data.contacts;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.room.Room;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import coil3.size.SizeKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactDetailsSyncStateQueries$all$2;
import com.squareup.cash.db2.contacts.Contact_detailed_sync_state;
import com.squareup.cash.ui.gcm.GcmModule$Companion$provideGcmOnSignOutAction$1;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.IntPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.util.android.RealCarrierInfo;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RealContactDetailsSyncState {
    public final SessionQueries details;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider database;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.database = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Country access$parseCountry;
            String networkCountryIso;
            String simCountryIso;
            int i = this.$r8$classId;
            int i2 = 0;
            Provider provider = this.database;
            switch (i) {
                case 0:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    return new RealContactDetailsSyncState(cashAccountDatabaseImpl);
                case 1:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                    sharedPreferences.getClass();
                    return new EnumPreference(sharedPreferences, ContactsSyncState.class, "contacts-sync", ContactsSyncState.DEFAULT);
                case 2:
                    RealCarrierInfo realCarrierInfo = (RealCarrierInfo) provider.invoke();
                    realCarrierInfo.getClass();
                    String language = Locale.getDefault().getLanguage();
                    String country = Locale.getDefault().getCountry();
                    TelephonyManager telephonyManager = realCarrierInfo.telephony;
                    String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
                    if (telephonyManager == null || (simCountryIso = telephonyManager.getSimCountryIso()) == null || (access$parseCountry = SizeKt.access$parseCountry(simCountryIso)) == null) {
                        access$parseCountry = (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) ? null : SizeKt.access$parseCountry(networkCountryIso);
                    }
                    return new DeviceLocationHeuristics(language, country, networkOperatorName, access$parseCountry != null ? access$parseCountry.name() : null, TimeZone.getDefault().getID(), EmptyList.INSTANCE, ByteString.EMPTY);
                case 3:
                    Context context = (Context) provider.invoke();
                    context.getClass();
                    try {
                        return Settings.Global.getString(context.getContentResolver(), "device_name");
                    } catch (Exception unused) {
                        return null;
                    }
                case 4:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                    sharedPreferences2.getClass();
                    return new StringPreference(sharedPreferences2, "gcm-registration-id", 0);
                case 5:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                    sharedPreferences3.getClass();
                    return new BooleanPreference(sharedPreferences3, "incentive-bottom-sheet-viewed", false);
                case 6:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) provider.invoke();
                    sharedPreferences4.getClass();
                    return Room.BooleanKeyValue(sharedPreferences4, "inline_message_v2_tooltip_seen", false, false);
                case 7:
                    Context context2 = (Context) provider.invoke();
                    context2.getClass();
                    return context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                case 8:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) provider.invoke();
                    sharedPreferences5.getClass();
                    return new BooleanPreference(sharedPreferences5, "linked-banks-viewed", false);
                case 9:
                    KeyValue keyValue = (KeyValue) provider.invoke();
                    keyValue.getClass();
                    return new SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1(keyValue, i2);
                case 10:
                    SharedPreferences sharedPreferences6 = (SharedPreferences) provider.invoke();
                    sharedPreferences6.getClass();
                    return Room.BooleanKeyValue(sharedPreferences6, "moneybot-tooltip-viewed", false, false);
                case 11:
                    SharedPreferences sharedPreferences7 = (SharedPreferences) provider.invoke();
                    sharedPreferences7.getClass();
                    return Room.BooleanKeyValue(sharedPreferences7, "os-push-setting-state-cached", false, false);
                case 12:
                    SharedPreferences sharedPreferences8 = (SharedPreferences) provider.invoke();
                    sharedPreferences8.getClass();
                    return Room.LongKeyValue$default(sharedPreferences8, "paper-money-deposit-onboarding-last-viewed");
                case 13:
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    syncValueReader.getClass();
                    return syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.Access, PasscodeSettings.Default.INSTANCE, new Matcher$$ExternalSyntheticLambda9(23));
                case 14:
                    SharedPreferences sharedPreferences9 = (SharedPreferences) provider.invoke();
                    sharedPreferences9.getClass();
                    return new BooleanPreference(sharedPreferences9, "payment-notification-light", true);
                case 15:
                    SharedPreferences sharedPreferences10 = (SharedPreferences) provider.invoke();
                    sharedPreferences10.getClass();
                    return new BooleanPreference(sharedPreferences10, "payment-notification-ringtone-bill-initialized", false);
                case 16:
                    SharedPreferences sharedPreferences11 = (SharedPreferences) provider.invoke();
                    sharedPreferences11.getClass();
                    return new BooleanPreference(sharedPreferences11, "payment-notification-ringtone-cash-initialized", false);
                case 17:
                    SharedPreferences sharedPreferences12 = (SharedPreferences) provider.invoke();
                    sharedPreferences12.getClass();
                    return new BooleanPreference(sharedPreferences12, "payment-notification-ringtone-initialized", false);
                case 18:
                    SharedPreferences sharedPreferences13 = (SharedPreferences) provider.invoke();
                    sharedPreferences13.getClass();
                    return new BooleanPreference(sharedPreferences13, "payment-notification-vibrate", true);
                case 19:
                    SharedPreferences sharedPreferences14 = (SharedPreferences) provider.invoke();
                    sharedPreferences14.getClass();
                    return new StringPreference(sharedPreferences14, "pending-email-registration", 0);
                case 20:
                    SharedPreferences sharedPreferences15 = (SharedPreferences) provider.invoke();
                    sharedPreferences15.getClass();
                    return Room.BooleanKeyValue(sharedPreferences15, "show-personalize-payment-graph", false, false);
                case 21:
                    SharedPreferences sharedPreferences16 = (SharedPreferences) provider.invoke();
                    sharedPreferences16.getClass();
                    return Room.IntKeyValue$default(sharedPreferences16, "personalize-payment-resource-version");
                case 22:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    return new GcmModule$Companion$provideGcmOnSignOutAction$1(cashAccountDatabaseImpl2, 3);
                case 23:
                    SharedPreferences sharedPreferences17 = (SharedPreferences) provider.invoke();
                    sharedPreferences17.getClass();
                    return Room.IntKeyValue$default(sharedPreferences17, "recipient_selector_tooltip_seen_count");
                case 24:
                    SharedPreferences sharedPreferences18 = (SharedPreferences) provider.invoke();
                    sharedPreferences18.getClass();
                    return Room.BooleanKeyValue(sharedPreferences18, "referral-status-viewed", false, false);
                case 25:
                    SharedPreferences sharedPreferences19 = (SharedPreferences) provider.invoke();
                    sharedPreferences19.getClass();
                    return new BooleanPreference(sharedPreferences19, "request-review-prompt", false);
                case 26:
                    SharedPreferences sharedPreferences20 = (SharedPreferences) provider.invoke();
                    sharedPreferences20.getClass();
                    return new BooleanPreference(sharedPreferences20, "should-call-get-reward-status", true);
                case 27:
                    SharedPreferences sharedPreferences21 = (SharedPreferences) provider.invoke();
                    sharedPreferences21.getClass();
                    return new IntPreference(sharedPreferences21);
                case 28:
                    SharedPreferences sharedPreferences22 = (SharedPreferences) provider.invoke();
                    sharedPreferences22.getClass();
                    return Room.BooleanKeyValue(sharedPreferences22, "pdsa_benefits_half_sheet_viewed", false, false);
                default:
                    Context context3 = (Context) provider.invoke();
                    context3.getClass();
                    SharedPreferences sharedPreferences23 = context3.getSharedPreferences("cash", 0);
                    sharedPreferences23.getClass();
                    return sharedPreferences23;
            }
        }
    }

    public RealContactDetailsSyncState(CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.details = cashAccountDatabaseImpl.contactDetailsSyncStateQueries;
    }

    public static void batch$default(RealContactDetailsSyncState realContactDetailsSyncState, List list, Map map, List list2, int i) {
        if ((i & 1) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        List list4 = list2;
        list3.getClass();
        map2.getClass();
        list4.getClass();
        realContactDetailsSyncState.details.transactionWithWrapper(new BankingConfigQueries$$ExternalSyntheticLambda0(list3, realContactDetailsSyncState, map2, list4, 7));
    }

    public final LinkedHashMap lastSyncIdentifiers() {
        SessionQueries sessionQueries = this.details;
        sessionQueries.getClass();
        ContactDetailsSyncStateQueries$all$2 contactDetailsSyncStateQueries$all$2 = ContactDetailsSyncStateQueries$all$2.INSTANCE;
        SqlDriver sqlDriver = sessionQueries.driver;
        WebLoginConfigQueries$$ExternalSyntheticLambda2 webLoginConfigQueries$$ExternalSyntheticLambda2 = new WebLoginConfigQueries$$ExternalSyntheticLambda2(23);
        sqlDriver.getClass();
        List<Contact_detailed_sync_state> executeAsList = new SimpleQuery(714109146, new String[]{"contact_detailed_sync_state"}, sqlDriver, "ContactDetailsSyncState.sq", "all", "SELECT primary_key, latest_lookup_key, row_id, hash\nFROM contact_detailed_sync_state", webLoginConfigQueries$$ExternalSyntheticLambda2).executeAsList();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(executeAsList, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Contact_detailed_sync_state contact_detailed_sync_state : executeAsList) {
            String primary_key = contact_detailed_sync_state.getPrimary_key();
            ContactDetailsSyncState$PrimaryKey.m3515constructorimpl(primary_key);
            Long row_id = contact_detailed_sync_state.getRow_id();
            ContactDetailsSyncState$ContactRow m3510boximpl = row_id != null ? ContactDetailsSyncState$ContactRow.m3510boximpl(row_id.longValue()) : null;
            ContactDetailsSyncState$PrimaryKey m3514boximpl = ContactDetailsSyncState$PrimaryKey.m3514boximpl(primary_key);
            String latest_lookup_key = contact_detailed_sync_state.getLatest_lookup_key();
            ContactDetailsSyncState$LatestLookupKey.m3512constructorimpl(latest_lookup_key);
            linkedHashMap.put(m3514boximpl, new ContactDetailsSyncState$LatestAndRow(latest_lookup_key, m3510boximpl));
        }
        return linkedHashMap;
    }
}
