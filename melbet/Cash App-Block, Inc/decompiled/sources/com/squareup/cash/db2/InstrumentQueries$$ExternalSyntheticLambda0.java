package com.squareup.cash.db2;

import android.database.Cursor;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.ui.node.NodeChain;
import androidx.emoji2.text.MetadataRepo;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.CallResult;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.crypto.db.CryptoStatementQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda7;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db.CashAccountDatabaseCallback;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfig;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.db2.activity.CashActivityQueries$RecentsQuery;
import com.squareup.cash.db2.activity.InvestmentActivityQueries$IsFirstDayOfTradingQuery;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsResponse;
import com.squareup.protos.cash.librarian.api.LegalDocumentsResponse;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeResponse;
import com.squareup.protos.cash.registrar.api.GetStatementTypesResponse;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.registrar.api.StatementDescriptor;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.cash.registrar.api.StatementTypeDetails;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.util.cash.ProtoDefaults;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ InstrumentQueries$$ExternalSyntheticLambda0(String str, InstrumentQueries instrumentQueries) {
        this.$r8$classId = 24;
        AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
        this.f$0 = str;
        this.f$1 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v98, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v43, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v86, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v24, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v31, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v12, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 16;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5 composableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5 = (ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5) obj3;
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Long l = androidCursor.getLong(1);
                String string2 = androidCursor.getString(2);
                CurrencyCode currencyCode = string2 != null ? (CurrencyCode) ((EnumColumnAdapter) ((Instrument$Adapter) instrumentQueries.instrumentAdapter).balance_currencyAdapter).decode(string2) : null;
                Long l2 = androidCursor.getLong(3);
                l2.getClass();
                return composableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5.invoke(m1431m, l, currencyCode, l2);
            case 1:
                RewardStatus rewardStatus = (RewardStatus) obj3;
                ((TransactionWrapper) obj).getClass();
                final GpsConfigQueries gpsConfigQueries = ((RealReferralManager) obj2).queries;
                Boolean bool = rewardStatus.code_entry_enabled;
                final boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Integer num = rewardStatus.minimum_code_length;
                final int intValue = num != null ? num.intValue() : 1;
                Boolean bool2 = rewardStatus.reward_screen_enabled;
                final boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                String str = rewardStatus.reward_button_text;
                final String str2 = str == null ? "" : str;
                Integer num2 = rewardStatus.reward_button_priority;
                final int intValue2 = num2 != null ? num2.intValue() : 0;
                String str3 = rewardStatus.reward_header_text;
                final String str4 = str3 == null ? "" : str3;
                String str5 = rewardStatus.reward_main_text;
                final String str6 = str5 == null ? "" : str5;
                Integer num3 = rewardStatus.completed_reward_payments;
                final int intValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = rewardStatus.available_reward_payments;
                final int intValue4 = num4 != null ? num4.intValue() : 0;
                Money money = rewardStatus.reward_payment_amount;
                if (money == null) {
                    money = Moneys.zero(CurrencyCode.USD);
                }
                final Money money2 = money;
                RewardStatus.Expiration expiration = rewardStatus.expiration;
                if (expiration == null) {
                    expiration = ProtoDefaults.REWARD_STATUS_EXPIRATION;
                }
                final RewardStatus.Expiration expiration2 = expiration;
                final String str7 = rewardStatus.code_entry_client_route;
                final ProfileRow profileRow = rewardStatus.referral_status_screen;
                gpsConfigQueries.getClass();
                gpsConfigQueries.driver.execute(-1792294855, "INSERT OR REPLACE INTO rewardStatus\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.db2.referrals.RewardStatusQueries$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        AndroidStatement androidStatement = (AndroidStatement) obj4;
                        androidStatement.getClass();
                        GpsConfigQueries gpsConfigQueries2 = gpsConfigQueries;
                        ((OffersSheet.Adapter) gpsConfigQueries2.gpsConfigAdapter).getClass();
                        androidStatement.bindLong(0, 1L);
                        androidStatement.bindBoolean(1, Boolean.valueOf(booleanValue));
                        OffersSheet.Adapter adapter = (OffersSheet.Adapter) gpsConfigQueries2.gpsConfigAdapter;
                        adapter.getClass();
                        androidStatement.bindLong(2, Long.valueOf(intValue));
                        androidStatement.bindBoolean(3, Boolean.valueOf(booleanValue2));
                        androidStatement.bindString(4, str2);
                        androidStatement.bindLong(5, Long.valueOf(intValue2));
                        androidStatement.bindString(6, str4);
                        androidStatement.bindString(7, str6);
                        androidStatement.bindLong(8, Long.valueOf(intValue3));
                        androidStatement.bindLong(9, Long.valueOf(intValue4));
                        androidStatement.bindBytes(10, (byte[]) adapter.sheet_keyAdapter.encode(money2));
                        RewardStatus.Expiration expiration3 = expiration2;
                        androidStatement.bindString(11, expiration3 != null ? (String) adapter.offer_typeAdapter.encode(expiration3) : null);
                        androidStatement.bindString(12, str7);
                        ProfileRow profileRow2 = profileRow;
                        androidStatement.bindBytes(13, profileRow2 != null ? (byte[]) adapter.offers_sheet_responseAdapter.encode(profileRow2) : null);
                        return Unit.INSTANCE;
                    }
                });
                gpsConfigQueries.notifyQueries(-1792294855, new PasswordInfoQueries$$ExternalSyntheticLambda0(6));
                return Unit.INSTANCE;
            case 2:
                GetAvailableStatementsForStatementTypeResponse getAvailableStatementsForStatementTypeResponse = (GetAvailableStatementsForStatementTypeResponse) obj3;
                InstrumentQueries instrumentQueries2 = (InstrumentQueries) ((MarkwonConfiguration) obj2).imageDestinationProcessor;
                for (StatementDescriptor statementDescriptor : getAvailableStatementsForStatementTypeResponse.statements) {
                    String str8 = statementDescriptor.display_name;
                    str8.getClass();
                    String str9 = statementDescriptor.statement_url;
                    str9.getClass();
                    StatementCoverage statementCoverage = statementDescriptor.statement_coverage;
                    String str10 = statementDescriptor.statement_token;
                    str10.getClass();
                    instrumentQueries2.getClass();
                    instrumentQueries2.driver.execute(-298258625, "INSERT OR REPLACE INTO availableAccountStatement\nVALUES (?, ?, ?, ?)", new OverlayKt$$ExternalSyntheticLambda3(str10, str8, str9, statementCoverage, instrumentQueries2, 15));
                    instrumentQueries2.notifyQueries(-298258625, new ProfileQueries$$ExternalSyntheticLambda4(17));
                }
                List list = getAvailableStatementsForStatementTypeResponse.statements;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str11 = ((StatementDescriptor) it.next()).statement_token;
                    str11.getClass();
                    arrayList.add(str11);
                }
                instrumentQueries2.getClass();
                String createArguments = TransacterImpl.createArguments(arrayList.size());
                SqlDriver sqlDriver = instrumentQueries2.driver;
                String concat = "DELETE FROM availableAccountStatement WHERE statement_token NOT IN ".concat(createArguments);
                arrayList.size();
                sqlDriver.execute(null, concat, new TextStreamsKt$$ExternalSyntheticLambda0(5, arrayList));
                instrumentQueries2.notifyQueries(1045258151, new ProfileQueries$$ExternalSyntheticLambda4(i2));
                return Unit.INSTANCE;
            case 3:
                InstrumentQueries instrumentQueries3 = (InstrumentQueries) ((MarkwonConfiguration) obj3).linkResolver;
                instrumentQueries3.driver.execute(-996262960, "DELETE FROM customerStatementType", null);
                instrumentQueries3.notifyQueries(-996262960, new ProfileQueries$$ExternalSyntheticLambda4(18));
                for (StatementTypeDetails statementTypeDetails : ((GetStatementTypesResponse) obj2).statement_type_details) {
                    String str12 = statementTypeDetails.customer_token;
                    str12.getClass();
                    Boolean bool3 = statementTypeDetails.is_sponsored_account;
                    bool3.getClass();
                    String str13 = statementTypeDetails.display_name;
                    StatementType statementType = statementTypeDetails.statement_type;
                    statementType.getClass();
                    Boolean bool4 = statementTypeDetails.is_active_sponsored_account;
                    instrumentQueries3.getClass();
                    instrumentQueries3.driver.execute(140819743, "INSERT OR REPLACE INTO customerStatementType\nVALUES (?, ?, ?, ?, ?)", new SliderKt$$ExternalSyntheticLambda3(str12, bool3, str13, instrumentQueries3, statementType, bool4, 7));
                    instrumentQueries3.notifyQueries(140819743, new ProfileQueries$$ExternalSyntheticLambda4(19));
                }
                return Unit.INSTANCE;
            case 4:
                EglCore eglCore = (EglCore) obj2;
                for (Document document : ((GetCryptoTaxStatementsResponse) obj3).tax_documents) {
                    SessionQueries sessionQueries = (SessionQueries) eglCore.eglConfig;
                    String str14 = document.token;
                    str14.getClass();
                    String str15 = document.category;
                    if (str15 == null) {
                        LinkResult.Companion companion = com.squareup.protos.franklin.investing.resources.StatementType.Companion;
                        str15 = "BTC_TAX_FORM";
                    }
                    String str16 = str15;
                    String str17 = document.title;
                    str17.getClass();
                    Long l3 = document.document_date;
                    l3.getClass();
                    long longValue = l3.longValue();
                    String str18 = document.url;
                    str18.getClass();
                    String str19 = document.owner_token;
                    str19.getClass();
                    sessionQueries.getClass();
                    sessionQueries.driver.execute(301331796, "INSERT OR REPLACE INTO crypto_statement\nVALUES (?, ?, ?, ?, ?, ?)", new CryptoStatementQueries$$ExternalSyntheticLambda2(str14, str16, str17, longValue, str18, str19));
                    sessionQueries.notifyQueries(301331796, new FlowStarter$$ExternalSyntheticLambda0(i2));
                }
                return Unit.INSTANCE;
            case 5:
                SessionQueries sessionQueries2 = (SessionQueries) ((MetadataRepo) obj3).mTypeface;
                sessionQueries2.driver.execute(-1928046457, "DELETE FROM LegalDocument", null);
                sessionQueries2.notifyQueries(-1928046457, new ProfileQueries$$ExternalSyntheticLambda4(29));
                for (Document document2 : ((LegalDocumentsResponse) obj2).documents) {
                    String str20 = document2.token;
                    str20.getClass();
                    String str21 = document2.category;
                    str21.getClass();
                    String str22 = document2.title;
                    str22.getClass();
                    String str23 = document2.url;
                    str23.getClass();
                    sessionQueries2.getClass();
                    sessionQueries2.driver.execute(2144318408, "INSERT OR REPLACE INTO LegalDocument\nVALUES (?, ?, ?, ?, ?, ?)", new TreehouseAppConfigQueries$$ExternalSyntheticLambda3(str20, 1, str21, str22, str23));
                    sessionQueries2.notifyQueries(2144318408, new PasswordInfoQueries$$ExternalSyntheticLambda0(r9));
                }
                return Unit.INSTANCE;
            case 6:
                CashAccountDatabaseCallback cashAccountDatabaseCallback = (CashAccountDatabaseCallback) obj3;
                ((SqlDriver) obj).getClass();
                Cursor query = ((FrameworkSQLiteDatabase) obj2).query(new CallResult("SELECT * FROM unhandled_sync_entity LIMIT 1"));
                try {
                    if (query.getColumnIndex("entity_type") < 0) {
                        cashAccountDatabaseCallback.clearDataAndRestart();
                    }
                    query.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 7:
                SessionQueries sessionQueries3 = (SessionQueries) obj3;
                ((TransactionWrapper) obj).getClass();
                sessionQueries3.driver.execute(-1590002789, "INSERT INTO storage_link (account_token, signin_group_id, created_at_ms)\n  VALUES (\n    NULL,\n    (SELECT coalesce(max(signin_group_id), 1) FROM storage_link),\n    (strftime('%s','now') * 1000)\n  )", null);
                return sessionQueries3.driver.executeQuery(-1590002788, "SELECT storage_link.account_token, storage_link.id, storage_link.signin_group_id, storage_link.created_at_ms FROM storage_link WHERE id = last_insert_rowid()", (Function1) obj2, 0, null);
            case 8:
                Function3 function3 = (Function3) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string3 = androidCursor2.getString(0);
                String string4 = androidCursor2.getString(1);
                ?? bytes = androidCursor2.getBytes(2);
                return function3.invoke(string3, string4, bytes != 0 ? (BankingConfig.RecurringDepositsDdaUpsell) ((Local_tab_content.Adapter) localTabContentQueries.local_tab_contentAdapter).responseAdapter.decode(bytes) : null);
            case 9:
                com.squareup.protos.franklin.app.CashLiteConfig cashLiteConfig = (com.squareup.protos.franklin.app.CashLiteConfig) obj3;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBytes(0, cashLiteConfig != null ? (byte[]) ((Local_tab_content.Adapter) localTabContentQueries2.local_tab_contentAdapter).responseAdapter.encode(cashLiteConfig) : null);
                return Unit.INSTANCE;
            case 10:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) ((LocalTabContentQueries) obj3).local_tab_contentAdapter).lazyFetcherFactories).encode((ReleaseState) ((RewardQueries.ForIdsQuery) obj2).token));
                return Unit.INSTANCE;
            case 11:
                PinsQueries.Get_pinQuery get_pinQuery = (PinsQueries.Get_pinQuery) obj2;
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) ((EnumColumnAdapter) ((ComponentRegistry.Builder) ((LocalTabContentQueries) obj3).local_tab_contentAdapter).lazyFetcherFactories).encode((ReleaseState) get_pinQuery.application_name));
                androidStatement3.bindLong(1, Long.valueOf(get_pinQuery.file_id));
                return Unit.INSTANCE;
            case 12:
                PinsQueries.Get_pinQuery get_pinQuery2 = (PinsQueries.Get_pinQuery) obj2;
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, (String) ((ExpressivePaymentsStickerConfig.Adapter) ((InstrumentQueries) obj3).instrumentAdapter).release_stateAdapter.encode((ReleaseState) get_pinQuery2.application_name));
                androidStatement4.bindLong(1, Long.valueOf(get_pinQuery2.file_id));
                return Unit.INSTANCE;
            case 13:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, (String) ((ExpressivePaymentsStickerConfig.Adapter) ((InstrumentQueries) obj3).instrumentAdapter).release_stateAdapter.encode((ReleaseState) ((RewardQueries.ForIdsQuery) obj2).token));
                return Unit.INSTANCE;
            case 14:
                List list2 = (List) obj3;
                InstrumentQueries instrumentQueries4 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindBytes(0, list2 != null ? (byte[]) ((StampsConfig.Adapter) instrumentQueries4.instrumentAdapter).stampsAdapter.encode(list2) : null);
                return Unit.INSTANCE;
            case 15:
                InstrumentQueries instrumentQueries5 = (InstrumentQueries) obj2;
                InstrumentQueries.ForCurrencyQuery forCurrencyQuery = (InstrumentQueries.ForCurrencyQuery) obj3;
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, (String) ((EnumColumnAdapter) ((Instrument$Adapter) instrumentQueries5.instrumentAdapter).cash_instrument_typeAdapter).encode((CashInstrumentType) forCurrencyQuery.cash_instrument_type));
                CurrencyCode currencyCode2 = forCurrencyQuery.balance_currency;
                androidStatement7.bindString(1, currencyCode2 != null ? (String) ((EnumColumnAdapter) ((Instrument$Adapter) instrumentQueries5.instrumentAdapter).balance_currencyAdapter).encode(currencyCode2) : null);
                return Unit.INSTANCE;
            case 16:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((EnumColumnAdapter) ((Instrument$Adapter) ((InstrumentQueries) obj2).instrumentAdapter).cash_instrument_typeAdapter).encode((CashInstrumentType) ((RewardQueries.ForIdsQuery) obj3).token));
                return Unit.INSTANCE;
            case 17:
                InstrumentQueries instrumentQueries6 = (InstrumentQueries) obj2;
                BadgeQueries$VersionQuery badgeQueries$VersionQuery = (BadgeQueries$VersionQuery) obj3;
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, (String) ((EnumColumnAdapter) ((Instrument$Adapter) instrumentQueries6.instrumentAdapter).cash_instrument_typeAdapter).encode((CashInstrumentType) badgeQueries$VersionQuery.external_token));
                CurrencyCode currencyCode3 = (CurrencyCode) badgeQueries$VersionQuery.item_type;
                androidStatement9.bindString(1, currencyCode3 != null ? (String) ((EnumColumnAdapter) ((Instrument$Adapter) instrumentQueries6.instrumentAdapter).balance_currencyAdapter).encode(currencyCode3) : null);
                return Unit.INSTANCE;
            case 18:
                RealAppConfigManager$$ExternalSyntheticLambda2 realAppConfigManager$$ExternalSyntheticLambda2 = (RealAppConfigManager$$ExternalSyntheticLambda2) obj3;
                InstrumentQueries instrumentQueries7 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                String string5 = androidCursor3.getString(0);
                String string6 = androidCursor3.getString(1);
                ?? bytes2 = androidCursor3.getBytes(2);
                List list3 = bytes2 != 0 ? (List) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries7.instrumentAdapter).cash_instrument_typeAdapter).decode(bytes2) : null;
                ?? bytes3 = androidCursor3.getBytes(3);
                List list4 = bytes3 != 0 ? (List) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries7.instrumentAdapter).card_brandAdapter).decode(bytes3) : null;
                ?? bytes4 = androidCursor3.getBytes(4);
                return realAppConfigManager$$ExternalSyntheticLambda2.invoke(string5, string6, list3, list4, bytes4 != 0 ? (List) ((WireRepeatedAdapter) ((Instrument$Adapter) instrumentQueries7.instrumentAdapter).balance_currencyAdapter).decode(bytes4) : null);
            case 19:
                RealAppConfigManager$$ExternalSyntheticLambda7 realAppConfigManager$$ExternalSyntheticLambda7 = (RealAppConfigManager$$ExternalSyntheticLambda7) obj3;
                InstrumentQueries instrumentQueries8 = (InstrumentQueries) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                ?? bytes5 = androidCursor4.getBytes(0);
                SuggestedRecipientsData suggestedRecipientsData = bytes5 != 0 ? (SuggestedRecipientsData) ((RecipientConfig$Adapter) instrumentQueries8.instrumentAdapter).pay_dataAdapter.decode(bytes5) : null;
                ?? bytes6 = androidCursor4.getBytes(1);
                SuggestedRecipientsData suggestedRecipientsData2 = bytes6 != 0 ? (SuggestedRecipientsData) ((RecipientConfig$Adapter) instrumentQueries8.instrumentAdapter).request_dataAdapter.decode(bytes6) : null;
                Boolean bool5 = androidCursor4.getBoolean(2);
                bool5.getClass();
                return realAppConfigManager$$ExternalSyntheticLambda7.invoke(suggestedRecipientsData, suggestedRecipientsData2, bool5);
            case 20:
                List list5 = (List) obj3;
                InstrumentQueries instrumentQueries9 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindBytes(0, list5 != null ? (byte[]) ((StampsConfig.Adapter) instrumentQueries9.instrumentAdapter).stampsAdapter.encode(list5) : null);
                return Unit.INSTANCE;
            case 21:
                PaymentQueries paymentQueries = (PaymentQueries) obj3;
                CashActivityQueries$RecentsQuery cashActivityQueries$RecentsQuery = (CashActivityQueries$RecentsQuery) obj2;
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                ComponentRegistry.Builder builder = paymentQueries.customerAdapter;
                NodeChain nodeChain = paymentQueries.paymentAdapter;
                EnumColumnAdapter enumColumnAdapter = (EnumColumnAdapter) builder.interceptors;
                BlockState blockState = cashActivityQueries$RecentsQuery.blocked;
                long j = cashActivityQueries$RecentsQuery.largeLoyaltyMaxNormalCustomers;
                long j2 = cashActivityQueries$RecentsQuery.largeLoyaltyThreshold;
                androidStatement11.bindString(0, (String) enumColumnAdapter.encode(blockState));
                PaymentState paymentState = cashActivityQueries$RecentsQuery.includePaymentState;
                androidStatement11.bindString(1, paymentState != null ? (String) ((EnumColumnAdapter) nodeChain.innerCoordinator).encode(paymentState) : null);
                Orientation orientation = cashActivityQueries$RecentsQuery.requestPaymentOrientation;
                androidStatement11.bindString(2, orientation != null ? (String) ((EnumColumnAdapter) nodeChain.layoutNode).encode(orientation) : null);
                Role role = cashActivityQueries$RecentsQuery.requestPaymentRole;
                androidStatement11.bindString(3, role != null ? (String) ((EnumColumnAdapter) nodeChain.sentinelHead).encode(role) : null);
                PaymentState paymentState2 = cashActivityQueries$RecentsQuery.filterRequestPaymentState;
                androidStatement11.bindString(4, paymentState2 != null ? (String) ((EnumColumnAdapter) nodeChain.innerCoordinator).encode(paymentState2) : null);
                androidStatement11.bindLong(5, Long.valueOf(j2));
                androidStatement11.bindLong(6, Long.valueOf(j2));
                androidStatement11.bindLong(7, Long.valueOf(j));
                androidStatement11.bindLong(8, Long.valueOf(cashActivityQueries$RecentsQuery.minRecents));
                androidStatement11.bindLong(9, Long.valueOf(j2));
                androidStatement11.bindLong(10, Long.valueOf(j2));
                androidStatement11.bindLong(11, Long.valueOf(j));
                return Unit.INSTANCE;
            case 22:
                InvestmentActivityQueries$IsFirstDayOfTradingQuery investmentActivityQueries$IsFirstDayOfTradingQuery = (InvestmentActivityQueries$IsFirstDayOfTradingQuery) obj3;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj2;
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindLong(0, Long.valueOf(investmentActivityQueries$IsFirstDayOfTradingQuery.marketOpenForToday));
                Role role2 = investmentActivityQueries$IsFirstDayOfTradingQuery.role;
                androidStatement12.bindString(1, role2 != null ? (String) ((EnumColumnAdapter) ((NodeChain) rewardSlotQueries.rewardSlotAdapter).sentinelHead).encode(role2) : null);
                PaymentState paymentState3 = investmentActivityQueries$IsFirstDayOfTradingQuery.state;
                androidStatement12.bindString(2, paymentState3 != null ? (String) ((EnumColumnAdapter) ((NodeChain) rewardSlotQueries.rewardSlotAdapter).innerCoordinator).encode(paymentState3) : null);
                return Unit.INSTANCE;
            case 23:
                AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                androidStatement13.bindString(0, (String) ((Alias$Adapter) ((InstrumentQueries) obj2).instrumentAdapter).sync_stateAdapter.encode(aliasSyncState));
                Iterator it2 = ((Collection) obj3).iterator();
                while (it2.hasNext()) {
                    androidStatement13.bindString(r9, (String) it2.next());
                    r9++;
                }
                return Unit.INSTANCE;
            case 24:
                AliasSyncState aliasSyncState2 = AliasSyncState.SYNCED;
                AliasSyncState aliasSyncState3 = AliasSyncState.NEW;
                InstrumentQueries instrumentQueries10 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement14 = (AndroidStatement) obj;
                androidStatement14.getClass();
                androidStatement14.bindString(0, (String) ((Alias$Adapter) instrumentQueries10.instrumentAdapter).sync_stateAdapter.encode(aliasSyncState2));
                androidStatement14.bindString(1, (String) obj3);
                androidStatement14.bindString(2, (String) ((Alias$Adapter) instrumentQueries10.instrumentAdapter).sync_stateAdapter.encode(aliasSyncState3));
                return Unit.INSTANCE;
            case 25:
                PinsQueries.Get_pinQuery get_pinQuery3 = (PinsQueries.Get_pinQuery) obj3;
                InstrumentQueries instrumentQueries11 = (InstrumentQueries) obj2;
                AndroidStatement androidStatement15 = (AndroidStatement) obj;
                androidStatement15.getClass();
                for (AliasSyncState aliasSyncState4 : (Collection) get_pinQuery3.application_name) {
                    int i3 = r11 + 1;
                    androidStatement15.bindString(r11, aliasSyncState4 != null ? (String) ((Alias$Adapter) instrumentQueries11.instrumentAdapter).sync_stateAdapter.encode(aliasSyncState4) : null);
                    r11 = i3;
                }
                androidStatement15.bindLong(r11, Long.valueOf(get_pinQuery3.file_id));
                return Unit.INSTANCE;
            case 26:
                BadgeQueries$VersionQuery badgeQueries$VersionQuery2 = (BadgeQueries$VersionQuery) obj3;
                ContactQueries contactQueries = (ContactQueries) obj2;
                AndroidStatement androidStatement16 = (AndroidStatement) obj;
                androidStatement16.getClass();
                String str24 = (String) badgeQueries$VersionQuery2.external_token;
                androidStatement16.bindString(0, str24);
                androidStatement16.bindString(1, str24);
                BlockState blockState2 = (BlockState) badgeQueries$VersionQuery2.item_type;
                androidStatement16.bindString(2, blockState2 != null ? (String) ((EnumColumnAdapter) contactQueries.customerAdapter.interceptors).encode(blockState2) : null);
                return Unit.INSTANCE;
            case 27:
                ContactQueries contactQueries2 = (ContactQueries) obj2;
                AndroidStatement androidStatement17 = (AndroidStatement) obj;
                androidStatement17.getClass();
                BlockState blockState3 = (BlockState) ((RewardQueries.ForIdsQuery) obj3).token;
                androidStatement17.bindString(0, blockState3 != null ? (String) ((EnumColumnAdapter) contactQueries2.customerAdapter.interceptors).encode(blockState3) : null);
                return Unit.INSTANCE;
            case 28:
                InstrumentQueries instrumentQueries12 = (InstrumentQueries) obj3;
                ((TransactionWrapper) obj).getClass();
                instrumentQueries12.driver.execute(-547544237, "DELETE FROM entity_range", null);
                return instrumentQueries12.driver.executeQuery(-547544236, "SELECT changes()", (Function1) obj2, 0, null);
            default:
                InstrumentQueries instrumentQueries13 = (InstrumentQueries) obj3;
                ((TransactionWrapper) obj).getClass();
                instrumentQueries13.driver.execute(4978606, "DELETE FROM sync_entity", null);
                return instrumentQueries13.driver.executeQuery(4978607, "SELECT changes()", (Function1) obj2, 0, null);
        }
    }

    public /* synthetic */ InstrumentQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, Query query, int i) {
        this.$r8$classId = i;
        this.f$1 = instrumentQueries;
        this.f$0 = query;
    }

    public /* synthetic */ InstrumentQueries$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ InstrumentQueries$$ExternalSyntheticLambda0(Collection collection, InstrumentQueries instrumentQueries) {
        this.$r8$classId = 23;
        AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
        this.f$0 = collection;
        this.f$1 = instrumentQueries;
    }
}
