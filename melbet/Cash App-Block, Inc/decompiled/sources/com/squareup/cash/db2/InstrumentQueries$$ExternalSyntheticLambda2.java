package com.squareup.cash.db2;

import app.cash.sqldelight.driver.android.AndroidCursor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InstrumentQueries$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 26:
                int i2 = TreehouseAppConfigQueries$forAppName$2.$r8$clinit;
                break;
            default:
                SyncDetailsQueries$selectAll$2 syncDetailsQueries$selectAll$2 = SyncDetailsQueries$selectAll$2.INSTANCE;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                InstrumentQueries$walletAddressForCurrency$2 instrumentQueries$walletAddressForCurrency$2 = InstrumentQueries$walletAddressForCurrency$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                break;
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("institutionsConfig");
                break;
            case 2:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("instrumentLinkingConfig");
                break;
            case 3:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("invitationConfig");
                break;
            case 4:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("invitationEntity");
                break;
            case 5:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("invitationEntity");
                break;
            case 6:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("invitationEntity");
                break;
            case 7:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("loyaltyHiddenPaymentTypes");
                break;
            case 8:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("loyaltyHiddenPaymentTypes");
                break;
            case 9:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("offlineConfig");
                break;
            case 10:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("lending_transaction_customer_ids");
                break;
            case 11:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("banking_transaction_customer_ids");
                break;
            case 12:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("referral_customer_ids");
                break;
            case 13:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("paymentHistoryConfig");
                break;
            case 14:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("banking_transaction_customer_ids");
                function114.invoke("lending_transaction_customer_ids");
                function114.invoke("referral_customer_ids");
                function114.invoke("transfer_customer_ids");
                break;
            case 15:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("transfer_customer_ids");
                break;
            case 16:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("reactionConfig");
                break;
            case 17:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("recipientConfig");
                break;
            case 18:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("stampsConfig");
                break;
            case 19:
                Function1 function119 = (Function1) obj;
                function119.getClass();
                function119.invoke("supportConfig");
                break;
            case 20:
                Function1 function120 = (Function1) obj;
                function120.getClass();
                function120.invoke("sync_details");
                break;
            case 21:
                Function1 function121 = (Function1) obj;
                function121.getClass();
                function121.invoke("sync_details");
                break;
            case 22:
                Function1 function122 = (Function1) obj;
                function122.getClass();
                function122.invoke("sync_details");
                break;
            case 23:
                SyncDetailsQueries$selectAll$2 syncDetailsQueries$selectAll$2 = SyncDetailsQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                break;
            case 24:
                Function1 function123 = (Function1) obj;
                function123.getClass();
                function123.invoke("sync_details");
                break;
            case 25:
                Function1 function124 = (Function1) obj;
                function124.getClass();
                function124.invoke("sync_details");
                break;
            case 26:
                int i = TreehouseAppConfigQueries$forAppName$2.$r8$clinit;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                break;
            case 27:
                Function1 function125 = (Function1) obj;
                function125.getClass();
                function125.invoke("treehouseAppConfig");
                break;
            case 28:
                Function1 function126 = (Function1) obj;
                function126.getClass();
                function126.invoke("treehouseAppConfig");
                break;
            default:
                Function1 function127 = (Function1) obj;
                function127.getClass();
                function127.invoke("webLoginConfig");
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InstrumentQueries$$ExternalSyntheticLambda2(int i, boolean z) {
        this.$r8$classId = i;
    }
}
