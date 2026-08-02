package com.squareup.cash.boost.db;

import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class RewardMerchantQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ RewardMerchantQueries$$ExternalSyntheticLambda3(String str, String str2, String str3, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$2;
        AndroidStatement androidStatement = (AndroidStatement) obj;
        Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, this.f$0, 1, this.f$1);
        switch (i) {
            case 0:
                androidStatement.bindString(2, str);
                break;
            default:
                androidStatement.bindString(2, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
