package com.squareup.cash.db2;

import app.cash.sqldelight.driver.android.AndroidStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class WebLoginConfigQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Long f$1;

    public /* synthetic */ WebLoginConfigQueries$$ExternalSyntheticLambda3(Long l, String str) {
        this.f$1 = l;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        Long l = this.f$1;
        AndroidStatement androidStatement = (AndroidStatement) obj;
        androidStatement.getClass();
        switch (i) {
            case 0:
                androidStatement.bindString(0, str);
                androidStatement.bindLong(1, l);
                break;
            default:
                androidStatement.bindLong(0, l);
                androidStatement.bindString(1, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WebLoginConfigQueries$$ExternalSyntheticLambda3(String str, Long l) {
        this.f$0 = str;
        this.f$1 = l;
    }
}
