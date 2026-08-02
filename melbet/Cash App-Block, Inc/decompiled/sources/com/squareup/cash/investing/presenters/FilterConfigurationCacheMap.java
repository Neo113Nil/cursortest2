package com.squareup.cash.investing.presenters;

import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.util.cache.Cache;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class FilterConfigurationCacheMap {
    public final LinkedHashMap map;
    public final CoroutineScope scope;
    public final Flow signOut;

    public FilterConfigurationCacheMap(LinkedHashMap linkedHashMap, Flow flow, CoroutineScope coroutineScope) {
        this.map = linkedHashMap;
        this.signOut = flow;
        this.scope = coroutineScope;
    }

    public final Cache getCache(CategoryToken categoryToken) {
        categoryToken.getClass();
        LinkedHashMap linkedHashMap = this.map;
        Object obj = linkedHashMap.get(categoryToken);
        if (obj == null) {
            obj = new Cache(this.signOut, this.scope);
            linkedHashMap.put(categoryToken, obj);
        }
        return (Cache) obj;
    }
}
