package com.squareup.cash.db2.payment;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PendingTransferQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ PendingTransferQueries$$ExternalSyntheticLambda2(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                PendingTransferQueries$pendingTransfer$2 pendingTransferQueries$pendingTransfer$2 = PendingTransferQueries$pendingTransfer$2.INSTANCE;
                break;
            default:
                PendingTransferQueries$transfersToRetry$2 pendingTransferQueries$transfersToRetry$2 = PendingTransferQueries$transfersToRetry$2.INSTANCE;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransferType transferType;
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                PendingTransferQueries$transfersToRetry$2 pendingTransferQueries$transfersToRetry$2 = PendingTransferQueries$transfersToRetry$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Long l = androidCursor.getLong(1);
                Long m = re$$ExternalSyntheticOutline0.m(l, androidCursor, 2);
                Long l2 = androidCursor.getLong(3);
                l2.getClass();
                ScenarioPlan.Adapter adapter = (ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter;
                Object m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 4, adapter.scenario_planAdapter);
                Boolean bool = androidCursor.getBoolean(5);
                bool.getClass();
                String string2 = androidCursor.getString(6);
                transferType = string2 != null ? (TransferType) adapter.client_scenarioAdapter.decode(string2) : null;
                Boolean bool2 = androidCursor.getBoolean(7);
                Long l3 = androidCursor.getLong(8);
                Long l4 = androidCursor.getLong(9);
                String string3 = androidCursor.getString(10);
                long longValue = l.longValue();
                long longValue2 = m.longValue();
                long longValue3 = l2.longValue();
                TransferFundsRequest transferFundsRequest = (TransferFundsRequest) m2;
                boolean booleanValue = bool.booleanValue();
                m1431m.getClass();
                transferFundsRequest.getClass();
                return new PendingTransfer(m1431m, longValue, longValue2, longValue3, transferFundsRequest, booleanValue, transferType, bool2, l3, l4, string3);
            default:
                PendingTransferQueries$pendingTransfer$2 pendingTransferQueries$pendingTransfer$2 = PendingTransferQueries$pendingTransfer$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                Long l5 = androidCursor2.getLong(1);
                Long m3 = re$$ExternalSyntheticOutline0.m(l5, androidCursor2, 2);
                Long l6 = androidCursor2.getLong(3);
                l6.getClass();
                ScenarioPlan.Adapter adapter2 = (ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter;
                Object m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 4, adapter2.scenario_planAdapter);
                Boolean bool3 = androidCursor2.getBoolean(5);
                bool3.getClass();
                String string4 = androidCursor2.getString(6);
                transferType = string4 != null ? (TransferType) adapter2.client_scenarioAdapter.decode(string4) : null;
                Boolean bool4 = androidCursor2.getBoolean(7);
                Long l7 = androidCursor2.getLong(8);
                Long l8 = androidCursor2.getLong(9);
                String string5 = androidCursor2.getString(10);
                long longValue4 = l5.longValue();
                long longValue5 = m3.longValue();
                long longValue6 = l6.longValue();
                TransferFundsRequest transferFundsRequest2 = (TransferFundsRequest) m4;
                boolean booleanValue2 = bool3.booleanValue();
                m1431m2.getClass();
                transferFundsRequest2.getClass();
                return new PendingTransfer(m1431m2, longValue4, longValue5, longValue6, transferFundsRequest2, booleanValue2, transferType, bool4, l7, l8, string5);
        }
    }
}
