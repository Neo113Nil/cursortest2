package com.squareup.cash.growtools.presenters.manager.activity;

import com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilterGroup;
import com.squareup.protos.cash.activity.api.v1.ProductClassifierSearchFilter;
import com.squareup.protos.cash.activity.api.v1.SearchFilterContains;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class GrowToolsActivitySearchRequestHandler extends DefaultSearchPageRequestHandler {
    public final List classifiers;
    public final ActivityItemLayout$$ExternalSyntheticLambda4 pageSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GrowToolsActivitySearchRequestHandler(ActivityClientService activityClientService, List list) {
        super(activityClientService, new ActivitySearchFilter[0]);
        list.getClass();
        this.classifiers = list;
        this.pageSize = new ActivityItemLayout$$ExternalSyntheticLambda4(3);
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler
    public final List getFilterGroups() {
        List list = this.classifiers;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.ProductClassifier(new ProductClassifierSearchFilter((ActivityProductClassifier) it.next(), SearchFilterContains.CONTAINS, 4))));
        }
        return CollectionsKt__CollectionsJVMKt.listOf(new ActivitySearchFilterGroup(arrayList));
    }

    @Override // com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler
    public final Function1 getPageSize() {
        return this.pageSize;
    }
}
