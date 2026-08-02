package com.squareup.cash.db2.payment;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class PendingPaymentQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ PendingPaymentQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                break;
            case 2:
                PendingPaymentQueries$pendingRequest$2 pendingPaymentQueries$pendingRequest$2 = PendingPaymentQueries$pendingRequest$2.INSTANCE;
                break;
            default:
                PendingPaymentQueries$paymentsToRetry$2 pendingPaymentQueries$paymentsToRetry$2 = PendingPaymentQueries$paymentsToRetry$2.INSTANCE;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest;
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                PendingPaymentQueries$paymentsToRetry$2 pendingPaymentQueries$paymentsToRetry$2 = PendingPaymentQueries$paymentsToRetry$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Long l = androidCursor.getLong(1);
                Long m = re$$ExternalSyntheticOutline0.m(l, androidCursor, 2);
                Long l2 = androidCursor.getLong(3);
                l2.getClass();
                zzlj zzljVar = (zzlj) instrumentQueries.instrumentAdapter;
                Object m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 4, (WireAdapter) zzljVar.zza);
                Object m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 5, (WireAdapter) zzljVar.zzb);
                Enum m4 = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 6, (EnumColumnAdapter) zzljVar.zzc);
                Boolean bool = androidCursor.getBoolean(7);
                bool.getClass();
                Long l3 = androidCursor.getLong(8);
                l3.getClass();
                ?? bytes = androidCursor.getBytes(9);
                InvestPaymentData investPaymentData = bytes != 0 ? (InvestPaymentData) ((WireAdapter) zzljVar.zze).decode(bytes) : null;
                String string2 = androidCursor.getString(10);
                ClientScenario clientScenario = string2 != null ? (ClientScenario) ((EnumColumnAdapter) zzljVar.zzd).decode(string2) : null;
                ?? bytes2 = androidCursor.getBytes(11);
                initiatePersonalizedPaymentRequest = bytes2 != 0 ? (InitiatePersonalizedPaymentRequest) ((WireAdapter) zzljVar.zzf).decode(bytes2) : null;
                Boolean bool2 = androidCursor.getBoolean(12);
                long longValue = l.longValue();
                long longValue2 = m.longValue();
                long longValue3 = l2.longValue();
                InitiatePaymentRequest initiatePaymentRequest = (InitiatePaymentRequest) m2;
                Money money = (Money) m3;
                Orientation orientation = (Orientation) m4;
                boolean booleanValue = bool.booleanValue();
                long longValue4 = l3.longValue();
                initiatePaymentRequest.getClass();
                money.getClass();
                orientation.getClass();
                return new PendingPayment(m1431m, longValue, longValue2, longValue3, initiatePaymentRequest, money, orientation, booleanValue, longValue4, investPaymentData, clientScenario, initiatePersonalizedPaymentRequest, bool2);
            case 1:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                return (InitiatePaymentRequest) BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 0, (WireAdapter) ((zzlj) instrumentQueries.instrumentAdapter).zza);
            default:
                PendingPaymentQueries$pendingRequest$2 pendingPaymentQueries$pendingRequest$2 = PendingPaymentQueries$pendingRequest$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                Long l4 = androidCursor3.getLong(1);
                Long m5 = re$$ExternalSyntheticOutline0.m(l4, androidCursor3, 2);
                Long l5 = androidCursor3.getLong(3);
                l5.getClass();
                zzlj zzljVar2 = (zzlj) instrumentQueries.instrumentAdapter;
                Object m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 4, (WireAdapter) zzljVar2.zza);
                Object m7 = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor3, 5, (WireAdapter) zzljVar2.zzb);
                Enum m8 = NavAction$$ExternalSyntheticOutline0.m(androidCursor3, 6, (EnumColumnAdapter) zzljVar2.zzc);
                Boolean bool3 = androidCursor3.getBoolean(7);
                bool3.getClass();
                Long l6 = androidCursor3.getLong(8);
                l6.getClass();
                ?? bytes3 = androidCursor3.getBytes(9);
                InvestPaymentData investPaymentData2 = bytes3 != 0 ? (InvestPaymentData) ((WireAdapter) zzljVar2.zze).decode(bytes3) : null;
                String string3 = androidCursor3.getString(10);
                ClientScenario clientScenario2 = string3 != null ? (ClientScenario) ((EnumColumnAdapter) zzljVar2.zzd).decode(string3) : null;
                ?? bytes4 = androidCursor3.getBytes(11);
                initiatePersonalizedPaymentRequest = bytes4 != 0 ? (InitiatePersonalizedPaymentRequest) ((WireAdapter) zzljVar2.zzf).decode(bytes4) : null;
                Boolean bool4 = androidCursor3.getBoolean(12);
                long longValue5 = l4.longValue();
                long longValue6 = m5.longValue();
                long longValue7 = l5.longValue();
                InitiatePaymentRequest initiatePaymentRequest2 = (InitiatePaymentRequest) m6;
                Money money2 = (Money) m7;
                Orientation orientation2 = (Orientation) m8;
                boolean booleanValue2 = bool3.booleanValue();
                long longValue8 = l6.longValue();
                initiatePaymentRequest2.getClass();
                money2.getClass();
                orientation2.getClass();
                return new PendingPayment(m1431m2, longValue5, longValue6, longValue7, initiatePaymentRequest2, money2, orientation2, booleanValue2, longValue8, investPaymentData2, clientScenario2, initiatePersonalizedPaymentRequest, bool4);
        }
    }
}
