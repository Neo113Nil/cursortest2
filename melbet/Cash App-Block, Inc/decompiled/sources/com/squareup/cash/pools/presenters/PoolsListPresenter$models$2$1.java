package com.squareup.cash.pools.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.asset.AssetPoolViewPoolList;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.viewmodels.PoolSection;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PoolsListPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $category$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $state$delegate;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PoolsListPresenter$models$2$1(PoolsListPresenter poolsListPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = poolsListPresenter;
        this.$state$delegate = mutableState;
        this.$category$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PoolsListPresenter$models$2$1(this.this$0, this.$state$delegate, this.$category$delegate, continuation, 0);
            default:
                return new PoolsListPresenter$models$2$1(this.this$0, this.$state$delegate, this.$category$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PoolsListPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        int i = this.$r8$classId;
        MutableState mutableState2 = this.$state$delegate;
        PoolsListPresenter poolsListPresenter = this.this$0;
        MutableState mutableState3 = this.$category$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((PoolsListViewModel) mutableState2.getValue()) instanceof PoolsListViewModel.Loaded) {
                        PoolsListViewModel poolsListViewModel = (PoolsListViewModel) mutableState2.getValue();
                        poolsListViewModel.getClass();
                        PoolsListViewModel.Loaded loaded = (PoolsListViewModel.Loaded) poolsListViewModel;
                        List list = loaded.poolSections;
                        PoolCategory poolCategory = loaded.category;
                        PoolListNuxAssets poolListNuxAssets = loaded.nuxAssets;
                        poolCategory.getClass();
                        mutableState2.setValue(new PoolsListViewModel.Loaded(list, true, poolCategory, poolListNuxAssets));
                    } else if (((PoolsListViewModel) mutableState2.getValue()) instanceof PoolsListViewModel.Error) {
                        mutableState2.setValue(new PoolsListViewModel.Loading((PoolCategory) mutableState3.getValue()));
                    }
                    PoolCategory poolCategory2 = (PoolCategory) mutableState3.getValue();
                    this.L$0 = mutableState2;
                    this.label = 1;
                    obj = PoolsListPresenter.access$refreshData(poolsListPresenter, poolCategory2, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState2.setValue((PoolsListViewModel) obj);
                break;
            default:
                String str = (String) poolsListPresenter.flowToken;
                Analytics analytics = (Analytics) poolsListPresenter.analytics;
                PoolsListScreen poolsListScreen = (PoolsListScreen) poolsListPresenter.args;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolCategory poolCategory3 = (PoolCategory) mutableState2.getValue();
                    this.L$0 = mutableState3;
                    this.label = 1;
                    obj = PoolsListPresenter.access$refreshData(poolsListPresenter, poolCategory3, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    } else {
                        mutableState = mutableState3;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((PoolsListViewModel) obj);
                if (((PoolsListViewModel) mutableState3.getValue()) instanceof PoolsListViewModel.Error) {
                    String name = poolsListScreen.appletState.name();
                    String str2 = poolsListScreen.origin;
                    str.getClass();
                    name.getClass();
                    analytics.track(new AssetPoolViewPoolList(null, null, str, str2, name), null);
                } else if (((PoolsListViewModel) mutableState3.getValue()) instanceof PoolsListViewModel.Loaded) {
                    PoolsListViewModel poolsListViewModel2 = (PoolsListViewModel) mutableState3.getValue();
                    poolsListViewModel2.getClass();
                    List list2 = ((PoolsListViewModel.Loaded) poolsListViewModel2).poolSections;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((PoolSection) obj2).isOwned) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    String name2 = poolsListScreen.appletState.name();
                    PoolSection poolSection = (PoolSection) CollectionsKt.firstOrNull((List) arrayList);
                    int size = poolSection != null ? poolSection.poolsList.size() : 0;
                    PoolSection poolSection2 = (PoolSection) CollectionsKt.firstOrNull((List) arrayList2);
                    int size2 = poolSection2 != null ? poolSection2.poolsList.size() : 0;
                    String str3 = poolsListScreen.origin;
                    Integer num = new Integer(size2);
                    Integer num2 = new Integer(size);
                    str.getClass();
                    name2.getClass();
                    analytics.track(new AssetPoolViewPoolList(num2, num, str, str3, name2), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
