package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class LoyaltyAccountQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ LoyaltyAccountQueries$$ExternalSyntheticLambda3(long j, long j2, Long l, Long l2, String str, String str2) {
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = l;
        this.f$5 = l2;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        long j = this.f$3;
        long j2 = this.f$2;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str2, 1, str);
                androidStatement.bindLong(2, Long.valueOf(j2));
                androidStatement.bindLong(3, Long.valueOf(j));
                androidStatement.bindString(4, (String) obj3);
                androidStatement.bindString(5, (String) obj2);
                break;
            default:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(j2));
                androidStatement2.bindLong(1, Long.valueOf(j));
                androidStatement2.bindLong(2, (Long) obj3);
                androidStatement2.bindLong(3, (Long) obj2);
                androidStatement2.bindString(4, str2);
                androidStatement2.bindString(5, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LoyaltyAccountQueries$$ExternalSyntheticLambda3(String str, String str2, long j, long j2, String str3, String str4) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = str3;
        this.f$5 = str4;
    }
}
