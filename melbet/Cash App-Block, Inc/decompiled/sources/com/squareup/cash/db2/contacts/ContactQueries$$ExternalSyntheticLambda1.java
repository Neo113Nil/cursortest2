package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.entities.PaymentQueries$lastTransactionDate$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ContactQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ContactQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("contact");
                return Unit.INSTANCE;
            case 1:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("contact");
                return Unit.INSTANCE;
            case 2:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("contact");
                return Unit.INSTANCE;
            case 3:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("contact");
                return Unit.INSTANCE;
            case 4:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("contact");
                return Unit.INSTANCE;
            case 5:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 6:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("contact");
                function16.invoke("contact_alias");
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("alias");
                function17.invoke("customer");
                return Unit.INSTANCE;
            case 8:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("customer");
                return Unit.INSTANCE;
            case 9:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Boolean bool = androidCursor.getBoolean(0);
                bool.getClass();
                return bool;
            case 10:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 11:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 12:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("customer");
                return Unit.INSTANCE;
            case 13:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("customer");
                return Unit.INSTANCE;
            case 14:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("alias");
                function111.invoke("customer");
                return Unit.INSTANCE;
            case 15:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("loyaltyAccount");
                return Unit.INSTANCE;
            case 16:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("loyaltyAccount");
                return Unit.INSTANCE;
            case 17:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("loyaltyAccount");
                return Unit.INSTANCE;
            case 18:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 19:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("entity_range");
                return Unit.INSTANCE;
            case 20:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("entity_range");
                return Unit.INSTANCE;
            case 21:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("entity_range");
                return Unit.INSTANCE;
            case 22:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("payment");
                return Unit.INSTANCE;
            case 23:
                Function1 function119 = (Function1) obj;
                function119.getClass();
                function119.invoke("payment");
                function119.invoke("pendingPayment");
                function119.invoke("pendingTransfer");
                return Unit.INSTANCE;
            case 24:
                Function1 function120 = (Function1) obj;
                function120.getClass();
                function120.invoke("payment");
                return Unit.INSTANCE;
            case 25:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                return PaymentQueries$lastTransactionDate$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0), androidCursor2.getLong(1));
            case 26:
                Function1 function121 = (Function1) obj;
                function121.getClass();
                function121.invoke("sync_entity");
                return Unit.INSTANCE;
            case 27:
                Function1 function122 = (Function1) obj;
                function122.getClass();
                function122.invoke("sync_entity");
                return Unit.INSTANCE;
            case 28:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            default:
                Function1 function123 = (Function1) obj;
                function123.getClass();
                function123.invoke("sync_entity");
                return Unit.INSTANCE;
        }
    }
}
