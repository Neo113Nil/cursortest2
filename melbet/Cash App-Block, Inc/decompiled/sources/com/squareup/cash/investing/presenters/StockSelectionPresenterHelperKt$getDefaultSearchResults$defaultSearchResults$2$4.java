package com.squareup.cash.investing.presenters;

import app.cash.local.presenters.brand.checkout.CheckoutTipStateKt$rememberCheckoutTipState$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.investing.backend.api.DiscoveryHeader;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.JobKt;
import okhttp3.Cookie;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4 extends SuspendLambda implements Function4 {
    public final /* synthetic */ EntitySelectionBlocker $data;
    public final /* synthetic */ CashAccountDatabaseImpl $database;
    public final /* synthetic */ CoroutineContext $ioDispatcher;
    public final /* synthetic */ boolean $limitReached;
    public final /* synthetic */ Set $previouslyOrCurrentlySelected;
    public final /* synthetic */ Set $selectedInvestmentEntities;
    public final /* synthetic */ AndroidStringManager $stringManager;
    public /* synthetic */ List L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ Map L$2;
    public Set L$3;
    public AndroidStringManager L$4;
    public Set L$5;
    public MapBuilder L$6;
    public MapBuilder L$7;
    public InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected L$8;
    public MapBuilder L$9;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4(EntitySelectionBlocker entitySelectionBlocker, Set set, AndroidStringManager androidStringManager, Set set2, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, boolean z, Continuation continuation) {
        super(4, continuation);
        this.$data = entitySelectionBlocker;
        this.$previouslyOrCurrentlySelected = set;
        this.$stringManager = androidStringManager;
        this.$selectedInvestmentEntities = set2;
        this.$ioDispatcher = coroutineContext;
        this.$database = cashAccountDatabaseImpl;
        this.$limitReached = z;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        CashAccountDatabaseImpl cashAccountDatabaseImpl = this.$database;
        boolean z = this.$limitReached;
        StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4 stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4 = new StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4(this.$data, this.$previouslyOrCurrentlySelected, this.$stringManager, this.$selectedInvestmentEntities, this.$ioDispatcher, cashAccountDatabaseImpl, z, (Continuation) obj4);
        stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4.L$0 = (List) obj;
        stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4.L$1 = (List) obj2;
        stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4.L$2 = (Map) obj3;
        return stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MapBuilder mapBuilder;
        Set set;
        Set set2;
        boolean z;
        MapBuilder mapBuilder2;
        AndroidStringManager androidStringManager;
        Object withContext;
        MapBuilder mapBuilder3;
        AndroidStringManager androidStringManager2;
        InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected selected;
        Set set3;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list = this.L$0;
        List list2 = this.L$1;
        Map map = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            mapBuilder = new MapBuilder();
            EntitySelectionBlocker entitySelectionBlocker = this.$data;
            boolean z3 = entitySelectionBlocker instanceof EntitySelectionBlocker.MultiSelectData;
            set = this.$previouslyOrCurrentlySelected;
            AndroidStringManager androidStringManager3 = this.$stringManager;
            set2 = this.$selectedInvestmentEntities;
            z = this.$limitReached;
            if (!z3 || set.isEmpty()) {
                mapBuilder2 = mapBuilder;
                androidStringManager = androidStringManager3;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!set.contains(((InvestmentEntityWithPrice.Owned) obj2).token.value)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard standard = new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard(androidStringManager.get(R.string.my_portfolio_title));
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Cookie.Companion.access$SearchResultItemModel((InvestmentEntityWithPrice) it.next()));
                    }
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Cookie.Companion.access$updateStatus((InvestingStockSelectionViewModel.SearchResultItemModel) it2.next(), set2, z));
                    }
                    mapBuilder.put(standard, arrayList4);
                }
                arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!set.contains(((InvestmentEntityWithPrice.Following) obj3).token.value)) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard standard2 = new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard(androidStringManager.get(R.string.my_followings_title));
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(Cookie.Companion.access$SearchResultItemModel((InvestmentEntityWithPrice) it3.next()));
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(Cookie.Companion.access$updateStatus((InvestingStockSelectionViewModel.SearchResultItemModel) it4.next(), set2, z));
                    }
                    mapBuilder.put(standard2, arrayList6);
                }
                for (Map.Entry entry : map.entrySet()) {
                    DiscoveryHeader discoveryHeader = (DiscoveryHeader) entry.getKey();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (!set.contains(((InvestmentEntityWithPrice.Unowned) obj4).token.value)) {
                            arrayList7.add(obj4);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        arrayList7 = null;
                    }
                    if (arrayList7 != null) {
                        InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard standard3 = new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Standard(discoveryHeader.text);
                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            arrayList8.add(Cookie.Companion.access$SearchResultItemModel((InvestmentEntityWithPrice) it5.next()));
                        }
                        ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10));
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            arrayList9.add(Cookie.Companion.access$updateStatus((InvestingStockSelectionViewModel.SearchResultItemModel) it6.next(), set2, z));
                        }
                        mapBuilder.put(standard3, arrayList9);
                    }
                }
                mapBuilder2.getClass();
                return new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections(mapBuilder2.build());
            }
            String str = androidStringManager3.get(R.string.my_selected_title);
            EntitySelectionBlocker.MultiSelectData.MultiSelectConfig multiSelectConfig = ((EntitySelectionBlocker.MultiSelectData) entitySelectionBlocker).multiSelectConfig;
            InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected selected2 = new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections.Header.Selected(str, multiSelectConfig.infoText, set2.size() + "/" + multiSelectConfig.maxSelections);
            CheckoutTipStateKt$rememberCheckoutTipState$1$1 checkoutTipStateKt$rememberCheckoutTipState$1$1 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(this.$database, set, set2, z, (Continuation) null, 4);
            this.L$0 = list;
            this.L$1 = list2;
            this.L$2 = map;
            this.L$3 = set;
            this.L$4 = androidStringManager3;
            this.L$5 = set2;
            this.L$6 = mapBuilder;
            this.L$7 = mapBuilder;
            this.L$8 = selected2;
            this.L$9 = mapBuilder;
            this.Z$0 = z;
            this.label = 1;
            withContext = JobKt.withContext(this.$ioDispatcher, checkoutTipStateKt$rememberCheckoutTipState$1$1, this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            mapBuilder3 = mapBuilder;
            androidStringManager2 = androidStringManager3;
            selected = selected2;
            set3 = set2;
            z2 = z;
            mapBuilder2 = mapBuilder3;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = this.Z$0;
            mapBuilder = this.L$9;
            selected = this.L$8;
            mapBuilder3 = this.L$7;
            mapBuilder2 = this.L$6;
            set3 = this.L$5;
            androidStringManager2 = this.L$4;
            Set set4 = this.L$3;
            SafeTrace.throwOnFailure(obj);
            set = set4;
            withContext = obj;
        }
        mapBuilder.put(selected, withContext);
        z = z2;
        mapBuilder = mapBuilder3;
        set2 = set3;
        androidStringManager = androidStringManager2;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
        if (arrayList != null) {
        }
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
        }
        if (arrayList2.isEmpty()) {
        }
        if (arrayList2 != null) {
        }
        while (r0.hasNext()) {
        }
        mapBuilder2.getClass();
        return new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections(mapBuilder2.build());
    }
}
