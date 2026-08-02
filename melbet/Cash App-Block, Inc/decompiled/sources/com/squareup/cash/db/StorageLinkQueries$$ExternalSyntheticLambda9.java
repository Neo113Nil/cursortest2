package com.squareup.cash.db;

import app.cash.sqldelight.driver.android.AndroidStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StorageLinkQueries$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Long f$0;

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda9(int i, Long l) {
        this.$r8$classId = i;
        this.f$0 = l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Long l = this.f$0;
        AndroidStatement androidStatement = (AndroidStatement) obj;
        androidStatement.getClass();
        switch (i) {
            case 0:
                androidStatement.bindLong(0, l);
                break;
            default:
                androidStatement.bindLong(0, l);
                break;
        }
        return Unit.INSTANCE;
    }
}
