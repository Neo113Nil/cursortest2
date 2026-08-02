package com.squareup.cash.db;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db2.CryptocurrencyConfigQueries$select$2;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$loadCacheableStickers$2;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SessionQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 13:
                StorageLinkQueries$getActiveOnboardingLink$2 storageLinkQueries$getActiveOnboardingLink$2 = StorageLinkQueries$getActiveOnboardingLink$2.INSTANCE;
                break;
            default:
                StorageLinkQueries$getLinkForAccount$2 storageLinkQueries$getLinkForAccount$2 = StorageLinkQueries$getLinkForAccount$2.INSTANCE;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("session");
                return Unit.INSTANCE;
            case 1:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                return localDate.plusMonths(1L);
            case 2:
                LocalDate localDate2 = (LocalDate) obj;
                localDate2.getClass();
                return new DateFilter.Monthly(localDate2.getMonth().getValue(), localDate2.getYear());
            case 3:
                LocalDate localDate3 = (LocalDate) obj;
                localDate3.getClass();
                return localDate3.plusYears(1L);
            case 4:
                LocalDate localDate4 = (LocalDate) obj;
                localDate4.getClass();
                return new DateFilter.Yearly(localDate4.getYear());
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 1);
                return Unit.INSTANCE;
            case 6:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("active_storage_link");
                function12.invoke("storage_link");
                return Unit.INSTANCE;
            case 7:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("active_storage_link");
                return Unit.INSTANCE;
            case 8:
                StorageLinkQueries$createOnboardingLink$2 storageLinkQueries$createOnboardingLink$2 = StorageLinkQueries$createOnboardingLink$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                Long l = androidCursor.getLong(1);
                Long m = re$$ExternalSyntheticOutline0.m(l, androidCursor, 2);
                Long l2 = androidCursor.getLong(3);
                l2.getClass();
                return storageLinkQueries$createOnboardingLink$2.invoke(string2, l, m, l2);
            case 9:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("storage_link");
                return Unit.INSTANCE;
            case 10:
                StorageLinkQueries$getLinkForAccount$2 storageLinkQueries$getLinkForAccount$2 = StorageLinkQueries$getLinkForAccount$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m2 = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                Long l3 = androidCursor2.getLong(1);
                return storageLinkQueries$getLinkForAccount$2.invoke(m2, l3, re$$ExternalSyntheticOutline0.m(l3, androidCursor2, 2));
            case 11:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("active_storage_link");
                function15.invoke("storage_link");
                return Unit.INSTANCE;
            case 12:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("storage_link");
                return Unit.INSTANCE;
            case 13:
                StorageLinkQueries$getActiveOnboardingLink$2 storageLinkQueries$getActiveOnboardingLink$2 = StorageLinkQueries$getActiveOnboardingLink$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                String string3 = androidCursor3.getString(0);
                Long l4 = androidCursor3.getLong(1);
                Long m3 = re$$ExternalSyntheticOutline0.m(l4, androidCursor3, 2);
                Long l5 = androidCursor3.getLong(3);
                l5.getClass();
                return storageLinkQueries$getActiveOnboardingLink$2.invoke(string3, l4, m3, l5);
            case 14:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("storage_link");
                return Unit.INSTANCE;
            case 15:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("bankingConfig");
                return Unit.INSTANCE;
            case 16:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("bitcoinTransactionCustomerIds");
                return Unit.INSTANCE;
            case 17:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("bitcoinTransactionCustomerIds");
                return Unit.INSTANCE;
            case 18:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("blockersConfig");
                return Unit.INSTANCE;
            case 19:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("cashLiteConfig");
                return Unit.INSTANCE;
            case 20:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("clientRoutingConfig");
                return Unit.INSTANCE;
            case 21:
                CryptocurrencyConfigQueries$select$2 cryptocurrencyConfigQueries$select$2 = CryptocurrencyConfigQueries$select$2.INSTANCE;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                return cryptocurrencyConfigQueries$select$2.invoke(androidCursor4.getString(0), androidCursor4.getString(1), androidCursor4.getString(2), androidCursor4.getString(3), androidCursor4.getLong(4));
            case 22:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("cryptocurrencyConfig");
                return Unit.INSTANCE;
            case 23:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 24:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("expressivePaymentsBackgroundConfig");
                return Unit.INSTANCE;
            case 25:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("expressivePaymentsBackgroundConfig");
                return Unit.INSTANCE;
            case 26:
                ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2 expressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2 = ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2.INSTANCE;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                androidCursor5.getClass();
                return expressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2.invoke(androidCursor5.getString(0), androidCursor5.getString(1));
            case 27:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("expressivePaymentsStickerConfig");
                return Unit.INSTANCE;
            case 28:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("expressivePaymentsStickerConfig");
                return Unit.INSTANCE;
            default:
                ExpressivePaymentsStickerConfigQueries$loadCacheableStickers$2 expressivePaymentsStickerConfigQueries$loadCacheableStickers$2 = ExpressivePaymentsStickerConfigQueries$loadCacheableStickers$2.INSTANCE;
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                androidCursor6.getClass();
                return expressivePaymentsStickerConfigQueries$loadCacheableStickers$2.invoke(androidCursor6.getString(0), androidCursor6.getString(1));
        }
    }

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda1(int i, boolean z) {
        this.$r8$classId = i;
    }
}
