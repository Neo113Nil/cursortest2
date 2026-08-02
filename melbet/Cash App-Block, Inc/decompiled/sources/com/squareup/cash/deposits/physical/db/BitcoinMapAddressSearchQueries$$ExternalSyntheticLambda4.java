package com.squareup.cash.deposits.physical.db;

import app.cash.sqldelight.driver.android.AndroidStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ Double f$5;
    public final /* synthetic */ Double f$6;

    public /* synthetic */ BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4(String str, long j, String str2, String str3, String str4, Double d, Double d2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = j;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = d;
        this.f$6 = d2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Double d = this.f$6;
        Double d2 = this.f$5;
        String str = this.f$4;
        String str2 = this.f$3;
        String str3 = this.f$2;
        long j = this.f$1;
        String str4 = this.f$0;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str4);
                androidStatement.bindLong(1, Long.valueOf(j));
                androidStatement.bindString(2, str3);
                androidStatement.bindString(3, str2);
                androidStatement.bindString(4, str);
                androidStatement.bindDouble(5, d2);
                androidStatement.bindDouble(6, d);
                break;
            case 1:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, str4);
                androidStatement2.bindLong(1, Long.valueOf(j));
                androidStatement2.bindString(2, str3);
                androidStatement2.bindString(3, str2);
                androidStatement2.bindString(4, str);
                androidStatement2.bindDouble(5, d2);
                androidStatement2.bindDouble(6, d);
                break;
            default:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, str4);
                androidStatement3.bindLong(1, Long.valueOf(j));
                androidStatement3.bindString(2, str3);
                androidStatement3.bindString(3, str2);
                androidStatement3.bindString(4, str);
                androidStatement3.bindDouble(5, d2);
                androidStatement3.bindDouble(6, d);
                break;
        }
        return Unit.INSTANCE;
    }
}
