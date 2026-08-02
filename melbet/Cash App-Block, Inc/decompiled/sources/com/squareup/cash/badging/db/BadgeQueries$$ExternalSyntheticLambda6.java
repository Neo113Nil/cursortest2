package com.squareup.cash.badging.db;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeQueries$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ LocalTabContentQueries f$1;
    public final /* synthetic */ ItemType f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda6(long j, String str, LocalTabContentQueries localTabContentQueries, ItemType itemType) {
        this.$r8$classId = 2;
        this.f$3 = j;
        this.f$0 = str;
        this.f$1 = localTabContentQueries;
        this.f$2 = itemType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ItemType itemType = this.f$2;
        LocalTabContentQueries localTabContentQueries = this.f$1;
        String str = this.f$0;
        long j = this.f$3;
        AndroidStatement androidStatement = (AndroidStatement) obj;
        androidStatement.getClass();
        switch (i) {
            case 0:
                androidStatement.bindString(0, str);
                androidStatement.bindString(1, (String) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode(itemType));
                androidStatement.bindLong(2, Long.valueOf(j));
                break;
            case 1:
                androidStatement.bindString(0, str);
                androidStatement.bindString(1, (String) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode(itemType));
                androidStatement.bindLong(2, Long.valueOf(j));
                break;
            default:
                androidStatement.bindLong(0, Long.valueOf(j));
                androidStatement.bindString(1, str);
                androidStatement.bindString(2, (String) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode(itemType));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda6(String str, LocalTabContentQueries localTabContentQueries, ItemType itemType, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = localTabContentQueries;
        this.f$2 = itemType;
        this.f$3 = j;
    }
}
