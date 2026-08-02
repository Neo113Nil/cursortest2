package com.squareup.cash.investing.db;

import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db2.InstrumentQueries;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.ConnectionPool;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingDiscoveryQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ InvestingDiscoveryQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, List list, String str, String str2, long j, boolean z) {
        this.f$3 = instrumentQueries;
        this.f$4 = list;
        this.f$0 = str;
        this.f$2 = str2;
        this.f$1 = j;
        this.f$5 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$5;
        long j = this.f$1;
        String str = this.f$2;
        String str2 = this.f$0;
        Object obj2 = this.f$4;
        Object obj3 = this.f$3;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str2);
                androidStatement.bindLong(1, Long.valueOf(j));
                androidStatement.bindString(2, str);
                androidStatement.bindString(3, (String) obj3);
                androidStatement.bindBoolean(4, (Boolean) obj2);
                androidStatement.bindBoolean(5, Boolean.valueOf(z));
                break;
            default:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                EnumListAdapter enumListAdapter = (EnumListAdapter) ((ConnectionPool) ((InstrumentQueries) obj3).instrumentAdapter).delegate;
                List list = (List) obj2;
                list.getClass();
                androidStatement2.bindString(0, CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new EnumListAdapter$encode$1(enumListAdapter.enumColumnAdapter), 30));
                androidStatement2.bindString(1, str2);
                androidStatement2.bindString(2, str);
                androidStatement2.bindLong(3, Long.valueOf(j));
                androidStatement2.bindBoolean(4, Boolean.valueOf(z));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingDiscoveryQueries$$ExternalSyntheticLambda0(String str, long j, String str2, String str3, Boolean bool, boolean z) {
        this.f$0 = str;
        this.f$1 = j;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = bool;
        this.f$5 = z;
    }
}
