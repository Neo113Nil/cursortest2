package com.squareup.cash.db2.payment;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.profile.CustomerProfileQueries$localContactProfile$2;
import com.squareup.cash.db2.profile.DirectDepositAccountQueries$select$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfflineQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda1() {
        this.$r8$classId = 21;
        CustomerProfileQueries$localContactProfile$2 customerProfileQueries$localContactProfile$2 = CustomerProfileQueries$localContactProfile$2.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Boolean bool = androidCursor.getBoolean(0);
                bool.getClass();
                break;
            case 1:
                break;
            case 2:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("loyaltyProgram");
                break;
            case 3:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("loyaltyProgram");
                break;
            case 4:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("loyaltyProgram");
                break;
            case 5:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                Boolean bool2 = androidCursor2.getBoolean(0);
                bool2.getClass();
                break;
            case 6:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("pendingPayment");
                break;
            case 7:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("pendingPayment");
                break;
            case 8:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("pendingPayment");
                break;
            case 9:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("pendingPayment");
                break;
            case 10:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("pendingPayment");
                break;
            case 11:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("pendingPayment");
                break;
            case 12:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("pendingTransfer");
                break;
            case 13:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("pendingTransfer");
                break;
            case 14:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("pendingTransfer");
                break;
            case 15:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("pendingTransfer");
                break;
            case 16:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("pendingTransfer");
                break;
            case 17:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("balanceData");
                break;
            case 18:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("balanceData");
                break;
            case 19:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("effective_limits");
                break;
            case 20:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("effective_limits");
                break;
            case 21:
                CustomerProfileQueries$localContactProfile$2 customerProfileQueries$localContactProfile$2 = CustomerProfileQueries$localContactProfile$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                break;
            case 22:
                Function1 function119 = (Function1) obj;
                function119.getClass();
                function119.invoke("directDepositAccount");
                break;
            case 23:
                Function1 function120 = (Function1) obj;
                function120.getClass();
                function120.invoke("directDepositAccount");
                break;
            case 24:
                DirectDepositAccountQueries$select$2 directDepositAccountQueries$select$2 = DirectDepositAccountQueries$select$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor4, 0);
                String string2 = androidCursor4.getString(1);
                string2.getClass();
                Boolean bool3 = androidCursor4.getBoolean(2);
                bool3.getClass();
                break;
            case 25:
                Function1 function121 = (Function1) obj;
                function121.getClass();
                function121.invoke("extendedProfileDetails");
                break;
            case 26:
                Function1 function122 = (Function1) obj;
                function122.getClass();
                function122.invoke("featureFlags");
                break;
            case 27:
                Function1 function123 = (Function1) obj;
                function123.getClass();
                function123.invoke("instrumentLinkingOption");
                break;
            case 28:
                Function1 function124 = (Function1) obj;
                function124.getClass();
                function124.invoke("instrumentLinkingOption");
                break;
            default:
                Function1 function125 = (Function1) obj;
                function125.getClass();
                function125.invoke("notificationPreference");
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OfflineQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }
}
