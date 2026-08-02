package com.squareup.cash.badging.db;

import androidx.room.TransactorKt;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.db.QueryResult;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.protos.cash.badging.api.ItemType;
import java.time.Instant;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class BadgeQueries$ClearQuery extends ExecutableQuery {
    public final Instant cleared_at;
    public final /* synthetic */ LocalTabContentQueries this$0;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final ItemType f1050type;
    public final Long version;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeQueries$ClearQuery(LocalTabContentQueries localTabContentQueries, Instant instant, Long l, String str, ItemType itemType, AvatarsKt$$ExternalSyntheticLambda2 avatarsKt$$ExternalSyntheticLambda2) {
        super(avatarsKt$$ExternalSyntheticLambda2);
        str.getClass();
        this.this$0 = localTabContentQueries;
        this.cleared_at = instant;
        this.version = l;
        this.token = str;
        this.f1050type = itemType;
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        LocalTabContentQueries localTabContentQueries = this.this$0;
        QueryResult queryResult = (QueryResult) TransactorKt.transactionWithResult$default(localTabContentQueries, new UtilsKt$$ExternalSyntheticLambda0(27, localTabContentQueries, this, function1));
        localTabContentQueries.notifyQueries(1274216888, new AvatarsKt$$ExternalSyntheticLambda2(14));
        return queryResult;
    }

    public final String toString() {
        return "Badge.sq:clear";
    }
}
