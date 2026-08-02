package com.squareup.cash.offers.views.listing;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1 implements Function1 {
    public final /* synthetic */ List $items;
    public final /* synthetic */ Function1 $key;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LazyScopeExtensionsKt$itemsWithImpressions$$inlined$items$1(int i, Function1 function1, List list) {
        this.$r8$classId = i;
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        List list = this.$items;
        Function1 function1 = this.$key;
        switch (i) {
        }
        return function1.invoke(list.get(((Number) obj).intValue()));
    }
}
