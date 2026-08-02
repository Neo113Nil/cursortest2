package com.squareup.cash.db2;

import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class TreehouseAppConfigQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ TreehouseAppConfigQueries$$ExternalSyntheticLambda3(String str, int i, String str2, String str3, String str4) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$3;
        String str2 = this.f$2;
        AndroidStatement androidStatement = (AndroidStatement) obj;
        Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, this.f$0, 1, this.f$1);
        switch (i) {
            case 0:
                androidStatement.bindString(2, str2);
                androidStatement.bindString(3, str);
                break;
            default:
                androidStatement.bindString(2, str2);
                androidStatement.bindLong(3, null);
                androidStatement.bindString(4, str);
                androidStatement.bindString(5, null);
                break;
        }
        return Unit.INSTANCE;
    }
}
