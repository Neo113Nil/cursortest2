package com.squareup.cash.db;

import app.cash.sqldelight.driver.android.AndroidStatement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class StorageLinkQueries$$ExternalSyntheticLambda13 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda13(long j, String str, int i) {
        this.$r8$classId = i;
        this.f$1 = j;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        long j = this.f$1;
        AndroidStatement androidStatement = (AndroidStatement) obj;
        androidStatement.getClass();
        switch (i) {
            case 0:
                androidStatement.bindString(0, str);
                androidStatement.bindLong(1, Long.valueOf(j));
                break;
            case 1:
                androidStatement.bindLong(0, Long.valueOf(j));
                androidStatement.bindString(1, str);
                break;
            case 2:
                androidStatement.bindString(0, str);
                androidStatement.bindLong(1, Long.valueOf(j));
                break;
            default:
                androidStatement.bindLong(0, Long.valueOf(j));
                androidStatement.bindString(1, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StorageLinkQueries$$ExternalSyntheticLambda13(String str, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = j;
    }
}
