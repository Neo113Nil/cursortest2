package com.squareup.cash.shopping.presenters;

import androidx.constraintlayout.compose.ConstrainScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.api.FiltersResults;
import com.squareup.cash.shopping.backend.api.SearchQuery;
import com.squareup.cash.shopping.backend.real.RealProductSearchRepository;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.viewmodels.ProductSearchViewModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProductSearchPresenter$ProductSearchEffect$1$1 extends SuspendLambda implements Function2 {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference0Impl(CallableReference.NO_RECEIVER, ProductSearchPresenter.class, "state", "<v#2>", 0)};
    public final /* synthetic */ Function1 $onStateChange;
    public final /* synthetic */ ProductSearchPresenter.State $state;
    public /* synthetic */ Object L$0;
    public ReadWriteProperty L$1;
    public List L$2;
    public SearchQuery L$3;
    public DeferredCoroutine L$4;
    public ReadWriteProperty L$5;
    public int label;
    public final /* synthetic */ ProductSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductSearchPresenter$ProductSearchEffect$1$1(ProductSearchPresenter.State state, ProductSearchPresenter productSearchPresenter, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$state = state;
        this.this$0 = productSearchPresenter;
        this.$onStateChange = function1;
    }

    public static final ProductSearchPresenter.State invokeSuspend$lambda$1(ReadWriteProperty readWriteProperty) {
        return (ProductSearchPresenter.State) readWriteProperty.getValue(null, $$delegatedProperties[0]);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductSearchPresenter$ProductSearchEffect$1$1 productSearchPresenter$ProductSearchEffect$1$1 = new ProductSearchPresenter$ProductSearchEffect$1$1(this.$state, this.this$0, this.$onStateChange, continuation);
        productSearchPresenter$ProductSearchEffect$1$1.L$0 = obj;
        return productSearchPresenter$ProductSearchEffect$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductSearchPresenter$ProductSearchEffect$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0175, code lost:
    
        if (r0 != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r5, r26) == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadWriteProperty dimensionProperty;
        char c;
        List list;
        SearchQuery searchQuery;
        ReadWriteProperty readWriteProperty;
        DeferredCoroutine async$default;
        Object access$performSearch;
        ReadWriteProperty readWriteProperty2;
        Object await;
        ProductSearchViewModel copy$default;
        ProductSearchPresenter productSearchPresenter = this.this$0;
        RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = productSearchPresenter.analyticsHelper;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        KProperty[] kPropertyArr = $$delegatedProperties;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            dimensionProperty = new ConstrainScope.DimensionProperty(this.$onStateChange, this.$state);
            ProductSearchPresenter.State invokeSuspend$lambda$1 = invokeSuspend$lambda$1(dimensionProperty);
            if ((invokeSuspend$lambda$1.isRestoringState && invokeSuspend$lambda$1.hasSavedResults) || invokeSuspend$lambda$1(dimensionProperty).isInitialState) {
                return Unit.INSTANCE;
            }
            List list2 = invokeSuspend$lambda$1(dimensionProperty).isInitialQuery ? invokeSuspend$lambda$1(dimensionProperty).filters : EmptyList.INSTANCE;
            c = 0;
            dimensionProperty.setValue(null, kPropertyArr[0], ProductSearchPresenter.State.copy$default(invokeSuspend$lambda$1(dimensionProperty), new ProductSearchViewModel.Loading(invokeSuspend$lambda$1(dimensionProperty).searchText, !list2.isEmpty(), invokeSuspend$lambda$1(dimensionProperty).viewModel.getShouldShowFilters()), list2, false, false, false, false, 0, null, null, 2036));
            if (!invokeSuspend$lambda$1(dimensionProperty).isInitialQuery && !invokeSuspend$lambda$1(dimensionProperty).isRetrying) {
                long j = productSearchPresenter.searchInputDelay;
                this.L$0 = coroutineScope;
                this.L$1 = dimensionProperty;
                this.L$2 = list2;
                this.label = 1;
            }
            list = list2;
        } else if (i == 1) {
            list = this.L$2;
            dimensionProperty = this.L$1;
            SafeTrace.throwOnFailure(obj);
            c = 0;
        } else {
            if (i == 2) {
                searchQuery = this.L$3;
                list = this.L$2;
                readWriteProperty = this.L$1;
                SafeTrace.throwOnFailure(obj);
                c = 0;
                async$default = JobKt.async$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1(productSearchPresenter, searchQuery, null, 10), 3);
                ProductSearchPresenter.State invokeSuspend$lambda$12 = invokeSuspend$lambda$1(readWriteProperty);
                ArrayList filtersProto = ProductSearchPresenter.toFiltersProto(list);
                this.L$0 = null;
                this.L$1 = readWriteProperty;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = async$default;
                this.L$5 = readWriteProperty;
                this.label = 3;
                access$performSearch = ProductSearchPresenter.access$performSearch(productSearchPresenter, invokeSuspend$lambda$12, filtersProto, this);
                if (access$performSearch != coroutineSingletons) {
                    readWriteProperty2 = readWriteProperty;
                    readWriteProperty.setValue(null, kPropertyArr[c], (ProductSearchPresenter.State) access$performSearch);
                    this.L$0 = null;
                    this.L$1 = readWriteProperty2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    await = async$default.await(this);
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = this.L$2;
                ReadWriteProperty readWriteProperty3 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                readWriteProperty2 = readWriteProperty3;
                c = 0;
                await = obj;
                boolean z = !((FiltersResults) await).filters.isEmpty();
                ProductSearchPresenter.State invokeSuspend$lambda$13 = invokeSuspend$lambda$1(readWriteProperty2);
                ProductSearchViewModel productSearchViewModel = invokeSuspend$lambda$1(readWriteProperty2).viewModel;
                if (productSearchViewModel instanceof ProductSearchViewModel.Loading) {
                    copy$default = ProductSearchViewModel.Loading.copy$default((ProductSearchViewModel.Loading) productSearchViewModel, z);
                } else {
                    if (!(productSearchViewModel instanceof ProductSearchViewModel.Loaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    copy$default = ProductSearchViewModel.Loaded.copy$default((ProductSearchViewModel.Loaded) productSearchViewModel, z);
                }
                readWriteProperty2.setValue(null, kPropertyArr[c], ProductSearchPresenter.State.copy$default(invokeSuspend$lambda$13, copy$default, null, false, false, false, false, 0, null, null, 2046));
                return Unit.INSTANCE;
            }
            ReadWriteProperty readWriteProperty4 = this.L$5;
            async$default = this.L$4;
            List list4 = this.L$2;
            readWriteProperty2 = this.L$1;
            SafeTrace.throwOnFailure(obj);
            readWriteProperty = readWriteProperty4;
            c = 0;
            access$performSearch = obj;
            readWriteProperty.setValue(null, kPropertyArr[c], (ProductSearchPresenter.State) access$performSearch);
            this.L$0 = null;
            this.L$1 = readWriteProperty2;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 4;
            await = async$default.await(this);
        }
        SearchQuery searchQuery2 = new SearchQuery(invokeSuspend$lambda$1(dimensionProperty).searchText, realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP), realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH));
        RealProductSearchRepository realProductSearchRepository = productSearchPresenter.repository;
        this.L$0 = coroutineScope;
        this.L$1 = dimensionProperty;
        this.L$2 = list;
        this.L$3 = searchQuery2;
        this.label = 2;
        if (realProductSearchRepository.refreshFiltersInBackground(searchQuery2, this) != coroutineSingletons) {
            searchQuery = searchQuery2;
            readWriteProperty = dimensionProperty;
            async$default = JobKt.async$default(coroutineScope, null, null, new ShoppingWebBridge$loadUrl$1(productSearchPresenter, searchQuery, null, 10), 3);
            ProductSearchPresenter.State invokeSuspend$lambda$122 = invokeSuspend$lambda$1(readWriteProperty);
            ArrayList filtersProto2 = ProductSearchPresenter.toFiltersProto(list);
            this.L$0 = null;
            this.L$1 = readWriteProperty;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = async$default;
            this.L$5 = readWriteProperty;
            this.label = 3;
            access$performSearch = ProductSearchPresenter.access$performSearch(productSearchPresenter, invokeSuspend$lambda$122, filtersProto2, this);
            if (access$performSearch != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
