package com.squareup.cash.db2.profile;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.profile.documents.LegalDocumentQueries$selectAll$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda4() {
        this.$r8$classId = 0;
        ProfileQueries$selectPhotoUrl$2 profileQueries$selectPhotoUrl$2 = ProfileQueries$selectPhotoUrl$2.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ProfileQueries$selectPhotoUrl$2 profileQueries$selectPhotoUrl$2 = ProfileQueries$selectPhotoUrl$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return profileQueries$selectPhotoUrl$2.invoke(androidCursor.getString(0));
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("notificationPreference");
                return Unit.INSTANCE;
            case 2:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("profileAlias");
                return Unit.INSTANCE;
            case 3:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("profileAlias");
                return Unit.INSTANCE;
            case 4:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("profileAlias");
                return Unit.INSTANCE;
            case 5:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("profile");
                return Unit.INSTANCE;
            case 6:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("profile");
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("profile");
                return Unit.INSTANCE;
            case 8:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("profile");
                return Unit.INSTANCE;
            case 9:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("profile");
                return Unit.INSTANCE;
            case 10:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("profile");
                return Unit.INSTANCE;
            case 11:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("scenarioPlan");
                return Unit.INSTANCE;
            case 12:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("scenarioPlan");
                return Unit.INSTANCE;
            case 13:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("singleAccountHolderEligibility");
                return Unit.INSTANCE;
            case 14:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 15:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("singleAccountHolderEligibility");
                return Unit.INSTANCE;
            case 16:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("availableAccountStatement");
                return Unit.INSTANCE;
            case 17:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("availableAccountStatement");
                return Unit.INSTANCE;
            case 18:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("customerStatementType");
                return Unit.INSTANCE;
            case 19:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("customerStatementType");
                return Unit.INSTANCE;
            case 20:
                Function1 function119 = (Function1) obj;
                function119.getClass();
                function119.invoke("documentCategory");
                return Unit.INSTANCE;
            case 21:
                Function1 function120 = (Function1) obj;
                function120.getClass();
                function120.invoke("documentCategory");
                return Unit.INSTANCE;
            case 22:
                Function1 function121 = (Function1) obj;
                function121.getClass();
                function121.invoke("documentCategory");
                return Unit.INSTANCE;
            case 23:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 24:
                Function1 function122 = (Function1) obj;
                function122.getClass();
                function122.invoke("document");
                return Unit.INSTANCE;
            case 25:
                Function1 function123 = (Function1) obj;
                function123.getClass();
                function123.invoke("document");
                return Unit.INSTANCE;
            case 26:
                Function1 function124 = (Function1) obj;
                function124.getClass();
                function124.invoke("document");
                return Unit.INSTANCE;
            case 27:
                LegalDocumentQueries$selectAll$2 legalDocumentQueries$selectAll$2 = LegalDocumentQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string2 = androidCursor2.getString(1);
                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor2, 2);
                Long l = androidCursor2.getLong(3);
                String string3 = androidCursor2.getString(4);
                string3.getClass();
                return legalDocumentQueries$selectAll$2.invoke(m1431m, string2, m, l, string3, androidCursor2.getString(5));
            case 28:
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Boolean bool = androidCursor3.getBoolean(0);
                bool.getClass();
                return bool;
            default:
                Function1 function125 = (Function1) obj;
                function125.getClass();
                function125.invoke("LegalDocument");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }
}
