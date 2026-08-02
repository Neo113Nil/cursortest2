package com.squareup.cash.history.backend.real;

import androidx.compose.ui.node.NodeChain;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.clientsync.errors.PaymentAccountMismatchError;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.observability.RealAccountMismatchReporter;
import com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import com.squareup.cash.clientsync.readers.AndroidSyncEntitySpecs$Payment$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PaymentSenderMismatchReporter;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.SyncPayment;
import com.squareup.protos.franklin.ui.InvestmentOrderType;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.RollupData;
import com.squareup.protos.franklin.ui.RollupType;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiPayment;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class PaymentSyncEntityStorageObserver extends SyncEntityStorageObserver {
    public final RealAccountMismatchReporter accountMismatchReporter;
    public final PaymentQueries paymentQueries;

    public PaymentSyncEntityStorageObserver(RealAccountMismatchReporter realAccountMismatchReporter, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        super(new AndroidSyncEntitySpecs$Payment$1[]{AndroidSyncValueSpecs.Payment, AndroidSyncValueSpecs.Transfer, AndroidSyncValueSpecs.Transaction, AndroidSyncValueSpecs.LoanActivity, AndroidSyncValueSpecs.SponsoredAccount}, 1);
        this.accountMismatchReporter = realAccountMismatchReporter;
        this.paymentQueries = cashAccountDatabaseImpl.paymentQueries;
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver, com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver.Typed
    public final void onAfterUpdateEntity(UpdateEntity.Result result) {
        String str;
        Boolean bool;
        SyncEntity entity = result.getStorageOperation().getEntity();
        if (((AndroidSyncEntitySpecs$Payment$1) this.specsByType.get(entity.getEntityType())) != null) {
            SyncPayment syncPayment = ((com.squareup.protos.franklin.common.SyncEntity) entity.getEntityProto()).payment;
            syncPayment.getClass();
            UiPayment uiPayment = syncPayment.payment;
            uiPayment.getClass();
            if (uiPayment.render_data == null) {
                Timber.Forest.e(new IllegalArgumentException(String.format("Received null render data for payment %s", Arrays.copyOf(new Object[]{uiPayment.token}, 1))));
            }
            RealAccountMismatchReporter realAccountMismatchReporter = this.accountMismatchReporter;
            realAccountMismatchReporter.getClass();
            String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(realAccountMismatchReporter.sessionManager);
            Role role = uiPayment.role;
            int i = role == null ? -1 : RealAccountMismatchReporter.WhenMappings.$EnumSwitchMapping$0[role.ordinal()];
            String str2 = i != 1 ? i != 2 ? null : uiPayment.recipient_id : uiPayment.sender_id;
            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) realAccountMismatchReporter.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PaymentSenderMismatchReporter.INSTANCE)).enabled() && ((str2 == null || !RealAccountMismatchReporter.SPECIAL_TOKEN_REGEX.matches(str2)) && !Intrinsics.areEqual(str2, activeAccountTokenOrNull))) {
                realAccountMismatchReporter.errorReporter.report(new PaymentAccountMismatchError(uiPayment.role, activeAccountTokenOrNull, str2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            }
            final String entityId = entity.getEntityId();
            final String str3 = uiPayment.token;
            str3.getClass();
            final Orientation orientation = uiPayment.orientation;
            orientation.getClass();
            final Role role2 = uiPayment.role;
            role2.getClass();
            final String str4 = uiPayment.sender_id;
            str4.getClass();
            final String str5 = uiPayment.recipient_id;
            str5.getClass();
            final PaymentState paymentState = uiPayment.state;
            Money money = uiPayment.amount;
            final Long l = money != null ? money.amount : null;
            final CurrencyCode currencyCode = money != null ? money.currency_code : null;
            final Money money2 = uiPayment.sender_amount;
            final Money money3 = uiPayment.recipient_amount;
            Long l2 = uiPayment.created_at;
            final long longValue = l2 != null ? l2.longValue() : 0L;
            Long l3 = uiPayment.updated_at;
            final long longValue2 = l3 != null ? l3.longValue() : 0L;
            Long l4 = uiPayment.captured_at;
            final long longValue3 = l4 != null ? l4.longValue() : 0L;
            Long l5 = uiPayment.refunded_at;
            final long longValue4 = l5 != null ? l5.longValue() : 0L;
            Long l6 = uiPayment.paid_out_at;
            final long longValue5 = l6 != null ? l6.longValue() : 0L;
            Long l7 = uiPayment.display_date;
            final long longValue6 = l7 != null ? l7.longValue() : 0L;
            SyncPayment syncPayment2 = ((com.squareup.protos.franklin.common.SyncEntity) entity.getEntityProto()).payment;
            final boolean booleanValue = (syncPayment2 == null || (bool = syncPayment2.is_badged) == null) ? false : bool.booleanValue();
            final String str6 = uiPayment.render_data;
            if (uiPayment.role == Role.SENDER) {
                str = uiPayment.recipient_id;
                str.getClass();
            } else {
                str = uiPayment.sender_id;
                str.getClass();
            }
            final String str7 = str;
            Long l8 = uiPayment.outstanding_until;
            final Long valueOf = Long.valueOf(l8 != null ? l8.longValue() : 0L);
            final String str8 = uiPayment.external_id;
            final Money money4 = uiPayment.boost_amount;
            final Long l9 = uiPayment.scheduled_for;
            final String str9 = uiPayment.payment_schedule_token;
            final Long l10 = uiPayment.hidden_until;
            final RollupType rollupType = uiPayment.rollup_type;
            RollupData rollupData = uiPayment.rollup_data;
            RollupData.Subtype subtype = rollupData != null ? rollupData.subtype : null;
            RollupData.Subtype.InvestmentOrderType investmentOrderType = subtype instanceof RollupData.Subtype.InvestmentOrderType ? (RollupData.Subtype.InvestmentOrderType) subtype : null;
            final InvestmentOrderType value = investmentOrderType != null ? investmentOrderType.getValue() : null;
            final String str10 = uiPayment.payment_type;
            final String str11 = uiPayment.gifted_investment_entity_token;
            final String str12 = uiPayment.lending_loan_token;
            final String str13 = uiPayment.associated_payment_token;
            final Long entityVersion = entity.getEntityVersion();
            final TransactionType transactionType = uiPayment.transaction_type;
            final PaymentQueries paymentQueries = this.paymentQueries;
            paymentQueries.getClass();
            paymentQueries.driver.execute(2050390630, "INSERT OR REPLACE INTO payment (\n  entity_id,\n  token,\n  orientation,\n  role,\n  sender_id,\n  recipient_id,\n  state,\n  amount,\n  amount_currency,\n  sender_amount,\n  recipient_amount,\n  created_at,\n  updated_at,\n  captured_at,\n  refunded_at,\n  paid_out_at,\n  display_date,\n  is_badged,\n  render_data,\n  their_id,\n  outstanding_until,\n  external_id,\n  boost_amount,\n  scheduled_for,\n  scheduled_payment_token,\n  hidden_until,\n  rollup_type,\n  investment_order_type,\n  payment_type,\n  gifted_investment_entity_token,\n  lending_loan_token,\n  associated_payment_token,\n  sync_entity_version,\n  transaction_type\n)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.db2.entities.PaymentQueries$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AndroidStatement androidStatement = (AndroidStatement) obj;
                    Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, entityId, 1, str3);
                    NodeChain nodeChain = paymentQueries.paymentAdapter;
                    androidStatement.bindString(2, (String) ((EnumColumnAdapter) nodeChain.layoutNode).encode(orientation));
                    Role role3 = role2;
                    androidStatement.bindString(3, role3 != null ? (String) ((EnumColumnAdapter) nodeChain.sentinelHead).encode(role3) : null);
                    androidStatement.bindString(4, str4);
                    androidStatement.bindString(5, str5);
                    PaymentState paymentState2 = paymentState;
                    androidStatement.bindString(6, paymentState2 != null ? (String) ((EnumColumnAdapter) nodeChain.innerCoordinator).encode(paymentState2) : null);
                    androidStatement.bindLong(7, l);
                    CurrencyCode currencyCode2 = currencyCode;
                    androidStatement.bindString(8, currencyCode2 != null ? (String) ((EnumColumnAdapter) nodeChain.outerCoordinator).encode(currencyCode2) : null);
                    Money money5 = money2;
                    androidStatement.bindBytes(9, money5 != null ? (byte[]) ((WireAdapter) nodeChain.tail).encode(money5) : null);
                    Money money6 = money3;
                    androidStatement.bindBytes(10, money6 != null ? (byte[]) ((WireAdapter) nodeChain.head).encode(money6) : null);
                    androidStatement.bindLong(11, Long.valueOf(longValue));
                    androidStatement.bindLong(12, Long.valueOf(longValue2));
                    androidStatement.bindLong(13, Long.valueOf(longValue3));
                    androidStatement.bindLong(14, Long.valueOf(longValue4));
                    androidStatement.bindLong(15, Long.valueOf(longValue5));
                    androidStatement.bindLong(16, Long.valueOf(longValue6));
                    androidStatement.bindBoolean(17, Boolean.valueOf(booleanValue));
                    androidStatement.bindString(18, str6);
                    androidStatement.bindString(19, str7);
                    androidStatement.bindLong(20, valueOf);
                    androidStatement.bindString(21, str8);
                    Money money7 = money4;
                    androidStatement.bindBytes(22, money7 != null ? (byte[]) ((WireAdapter) nodeChain.current).encode(money7) : null);
                    androidStatement.bindLong(23, l9);
                    androidStatement.bindString(24, str9);
                    androidStatement.bindLong(25, l10);
                    RollupType rollupType2 = rollupType;
                    androidStatement.bindString(26, rollupType2 != null ? (String) ((EnumColumnAdapter) nodeChain.buffer).encode(rollupType2) : null);
                    InvestmentOrderType investmentOrderType2 = value;
                    androidStatement.bindString(27, investmentOrderType2 != null ? (String) ((EnumColumnAdapter) nodeChain.stack).encode(investmentOrderType2) : null);
                    androidStatement.bindString(28, str10);
                    androidStatement.bindString(29, str11);
                    androidStatement.bindString(30, str12);
                    androidStatement.bindString(31, str13);
                    androidStatement.bindLong(32, entityVersion);
                    TransactionType transactionType2 = transactionType;
                    androidStatement.bindString(33, transactionType2 != null ? (String) ((EnumColumnAdapter) nodeChain.cachedDiffer).encode(transactionType2) : null);
                    return Unit.INSTANCE;
                }
            });
            paymentQueries.notifyQueries(2050390630, new ContactQueries$$ExternalSyntheticLambda1(23));
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteAllEntities() {
        PaymentQueries paymentQueries = this.paymentQueries;
        paymentQueries.driver.execute(2027418063, "DELETE FROM payment", null);
        paymentQueries.notifyQueries(2027418063, new ContactQueries$$ExternalSyntheticLambda1(22));
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onDeleteEntity(String str, SyncEntityType syncEntityType, Object obj) {
        UiPayment uiPayment;
        String str2;
        SyncPayment syncPayment = (SyncPayment) obj;
        str.getClass();
        syncEntityType.getClass();
        if (syncPayment != null && (uiPayment = syncPayment.payment) != null && (str2 = uiPayment.token) != null) {
            str = str2;
        }
        PaymentQueries paymentQueries = this.paymentQueries;
        paymentQueries.getClass();
        paymentQueries.driver.execute(-874821822, "DELETE FROM payment\nWHERE token = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 12));
        paymentQueries.notifyQueries(-874821822, new ContactQueries$$ExternalSyntheticLambda1(24));
    }

    @Override // com.squareup.cash.clientsync.pipeline.SyncEntityStorageObserver
    public final void onUpdateEntity(String str, SyncEntityType syncEntityType, Object obj) {
        str.getClass();
        syncEntityType.getClass();
        ((SyncPayment) obj).getClass();
    }
}
