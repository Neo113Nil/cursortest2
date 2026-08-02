package com.squareup.cash.db2;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db2.contacts.AliasQueries$customerIdForAlias$2;
import com.squareup.cash.db2.contacts.ContactDetailsSyncStateQueries$all$2;
import com.squareup.cash.db2.contacts.ContactQueries$withContactAliasId$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class WebLoginConfigQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WebLoginConfigQueries$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 10:
                AliasQueries$customerIdForAlias$2 aliasQueries$customerIdForAlias$2 = AliasQueries$customerIdForAlias$2.INSTANCE;
                break;
            case 23:
                ContactDetailsSyncStateQueries$all$2 contactDetailsSyncStateQueries$all$2 = ContactDetailsSyncStateQueries$all$2.INSTANCE;
                break;
            default:
                WebLoginConfigQueries$expiresAt$2 webLoginConfigQueries$expiresAt$2 = WebLoginConfigQueries$expiresAt$2.INSTANCE;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                WebLoginConfigQueries$expiresAt$2 webLoginConfigQueries$expiresAt$2 = WebLoginConfigQueries$expiresAt$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return webLoginConfigQueries$expiresAt$2.invoke(androidCursor.getLong(0));
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("webLoginConfig");
                return Unit.INSTANCE;
            case 2:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 3:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 4:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                Boolean bool = androidCursor2.getBoolean(0);
                bool.getClass();
                return bool;
            case 5:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("alias");
                return Unit.INSTANCE;
            case 6:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("alias");
                function13.invoke("contact_alias");
                return Unit.INSTANCE;
            case 7:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("alias");
                return Unit.INSTANCE;
            case 8:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("alias");
                function15.invoke("contact_alias");
                return Unit.INSTANCE;
            case 9:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("alias");
                return Unit.INSTANCE;
            case 10:
                AliasQueries$customerIdForAlias$2 aliasQueries$customerIdForAlias$2 = AliasQueries$customerIdForAlias$2.INSTANCE;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                return aliasQueries$customerIdForAlias$2.invoke(androidCursor3.getString(0));
            case 11:
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                androidCursor4.getClass();
                Boolean bool2 = androidCursor4.getBoolean(0);
                bool2.getClass();
                return bool2;
            case 12:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("alias");
                return Unit.INSTANCE;
            case 13:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("alias");
                return Unit.INSTANCE;
            case 14:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("alias");
                return Unit.INSTANCE;
            case 15:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("alias");
                return Unit.INSTANCE;
            case 16:
                Function1 function111 = (Function1) obj;
                function111.getClass();
                function111.invoke("contact_alias");
                return Unit.INSTANCE;
            case 17:
                Function1 function112 = (Function1) obj;
                function112.getClass();
                function112.invoke("contact_alias");
                return Unit.INSTANCE;
            case 18:
                Function1 function113 = (Function1) obj;
                function113.getClass();
                function113.invoke("contact_alias");
                return Unit.INSTANCE;
            case 19:
                Function1 function114 = (Function1) obj;
                function114.getClass();
                function114.invoke("contact_alias");
                return Unit.INSTANCE;
            case 20:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 21:
                Function1 function115 = (Function1) obj;
                function115.getClass();
                function115.invoke("contact_alias");
                return Unit.INSTANCE;
            case 22:
                Function1 function116 = (Function1) obj;
                function116.getClass();
                function116.invoke("contact_detailed_sync_state");
                return Unit.INSTANCE;
            case 23:
                ContactDetailsSyncStateQueries$all$2 contactDetailsSyncStateQueries$all$2 = ContactDetailsSyncStateQueries$all$2.INSTANCE;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor5, 0);
                String string2 = androidCursor5.getString(1);
                string2.getClass();
                Long l = androidCursor5.getLong(2);
                String string3 = androidCursor5.getString(3);
                string3.getClass();
                return contactDetailsSyncStateQueries$all$2.invoke(m1431m, string2, l, string3);
            case 24:
                Function1 function117 = (Function1) obj;
                function117.getClass();
                function117.invoke("contact_detailed_sync_state");
                return Unit.INSTANCE;
            case 25:
                Function1 function118 = (Function1) obj;
                function118.getClass();
                function118.invoke("contact_detailed_sync_state");
                return Unit.INSTANCE;
            case 26:
                Function1 function119 = (Function1) obj;
                function119.getClass();
                function119.invoke("contact_detailed_sync_state");
                return Unit.INSTANCE;
            case 27:
                Function1 function120 = (Function1) obj;
                function120.getClass();
                function120.invoke("contact");
                function120.invoke("contact_alias");
                return Unit.INSTANCE;
            case 28:
                Function1 function121 = (Function1) obj;
                function121.getClass();
                function121.invoke("contact");
                return Unit.INSTANCE;
            default:
                AndroidCursor androidCursor6 = (AndroidCursor) obj;
                return ContactQueries$withContactAliasId$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m1431m(androidCursor6, 0), androidCursor6.getString(1), androidCursor6.getString(2), androidCursor6.getString(3), androidCursor6.getString(4));
        }
    }

    public /* synthetic */ WebLoginConfigQueries$$ExternalSyntheticLambda2(int i, boolean z) {
        this.$r8$classId = i;
    }
}
