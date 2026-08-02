package app.cash.sqldelight.paging3;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.Transacter;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class OffsetQueryPagingSource extends PagingSource implements Query.Listener {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.mutableProperty1(new MutablePropertyReference1Impl(OffsetQueryPagingSource.class, "currentQuery", "getCurrentQuery()Lapp/cash/sqldelight/Query;", 0))};
    public final CoroutineContext context;
    public final QueryPagingSourceKt$toInt$1 countQuery;
    public final ConstrainScope.DimensionProperty currentQuery$delegate;
    public final int initialOffset;
    public final CartBannerViewKt$$ExternalSyntheticLambda2 queryProvider;
    public final Transacter transacter;

    public OffsetQueryPagingSource(CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda2, QueryPagingSourceKt$toInt$1 queryPagingSourceKt$toInt$1, Transacter transacter, CoroutineContext coroutineContext, int i) {
        transacter.getClass();
        this.currentQuery$delegate = new ConstrainScope.DimensionProperty(this);
        registerInvalidatedCallback(new Worker$$ExternalSyntheticLambda0(this, 29));
        this.queryProvider = cartBannerViewKt$$ExternalSyntheticLambda2;
        this.countQuery = queryPagingSourceKt$toInt$1;
        this.transacter = transacter;
        this.context = coroutineContext;
        this.initialOffset = i;
    }

    @Override // androidx.paging.PagingSource
    public final Object getRefreshKey(PagingState pagingState) {
        pagingState.getClass();
        Integer num = pagingState.anchorPosition;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (pagingState.config.initialLoadSize / 2)));
        }
        return null;
    }

    @Override // androidx.paging.PagingSource
    public final Object load(PagingSource.LoadParams loadParams, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.context, new EventBridge$sendEvent$1(loadParams, this, null, 23), continuationImpl);
    }
}
