package com.squareup.cash.data.contacts;

import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.contacts.AliasQueries$$ExternalSyntheticLambda11;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.ContactQueries$$ExternalSyntheticLambda1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__IndentKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealContactRepository$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealContactRepository f$0;

    public /* synthetic */ RealContactRepository$$ExternalSyntheticLambda5(RealContactRepository realContactRepository, int i) {
        this.$r8$classId = i;
        this.f$0 = realContactRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RealContactRepository realContactRepository = this.f$0;
        switch (i) {
            case 0:
                ((TransactionWrapper) obj).getClass();
                ContactQueries contactQueries = realContactRepository.contactQueries;
                contactQueries.driver.execute(-1302854870, "DELETE FROM contact", null);
                contactQueries.notifyQueries(-1302854870, new ContactQueries$$ExternalSyntheticLambda1(6));
                SessionQueries sessionQueries = realContactRepository.contactAliasQueries;
                sessionQueries.driver.execute(761530909, "DELETE FROM contact_alias", null);
                sessionQueries.notifyQueries(761530909, new WebLoginConfigQueries$$ExternalSyntheticLambda2(21, false));
                InstrumentQueries instrumentQueries = realContactRepository.aliasQueries;
                instrumentQueries.driver.execute(510808506, "DELETE FROM alias", null);
                instrumentQueries.notifyQueries(510808506, new WebLoginConfigQueries$$ExternalSyntheticLambda2(8, false));
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                list.getClass();
                InstrumentQueries instrumentQueries2 = realContactRepository.aliasQueries;
                AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
                List list2 = list;
                instrumentQueries2.getClass();
                String createArguments = TransacterImpl.createArguments(list2.size());
                SqlDriver sqlDriver = instrumentQueries2.driver;
                String trimMargin$default = StringsKt__IndentKt.trimMargin$default("\n        |UPDATE alias\n        |SET sync_state = ?\n        |WHERE hashed_alias IN " + createArguments + "\n        ");
                list2.size();
                QueryResult execute = sqlDriver.execute(null, trimMargin$default, new InstrumentQueries$$ExternalSyntheticLambda0(list2, instrumentQueries2));
                instrumentQueries2.notifyQueries(1019131269, new WebLoginConfigQueries$$ExternalSyntheticLambda2(7, false));
                return execute;
            default:
                List list3 = (List) obj;
                list3.getClass();
                InstrumentQueries instrumentQueries3 = realContactRepository.aliasQueries;
                List list4 = list3;
                instrumentQueries3.getClass();
                String createArguments2 = TransacterImpl.createArguments(list4.size());
                SqlDriver sqlDriver2 = instrumentQueries3.driver;
                String trimMargin$default2 = StringsKt__IndentKt.trimMargin$default("\n        |DELETE FROM alias\n        |WHERE hashed_alias IN " + createArguments2 + "\n        ");
                list4.size();
                QueryResult execute2 = sqlDriver2.execute(null, trimMargin$default2, new AliasQueries$$ExternalSyntheticLambda11(0, list4));
                instrumentQueries3.notifyQueries(-2130402268, new WebLoginConfigQueries$$ExternalSyntheticLambda2(6, false));
                return execute2;
        }
    }
}
