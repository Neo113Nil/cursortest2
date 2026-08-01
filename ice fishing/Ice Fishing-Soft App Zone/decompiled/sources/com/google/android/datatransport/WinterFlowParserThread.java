package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowParserThread extends WinterFlowConcurrencyQueue {
    public abstract WinterFlowParserThread WinterFlowArrayNetwork(Object obj);

    public abstract WinterFlowParserThread WinterFlowCacheManagerAgent(int i, Object obj);

    public abstract WinterFlowParserThread WinterFlowRouterRouter(int i);

    public abstract WinterFlowParserThread WinterFlowSyntax(int i, Object obj);

    public abstract WinterFlowDataSourceController WinterFlowTransactionManagerStrategy();

    public abstract WinterFlowParserThread WinterFlowUnitTestResponse(WinterFlowManagerCache winterFlowManagerCache);

    public WinterFlowParserThread WinterFlowVariableVersionControl(Collection collection) {
        WinterFlowDataSourceController WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy();
        WinterFlowTransactionManagerStrategy.addAll(collection);
        return WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final List subList(int i, int i2) {
        return new WinterFlowBatchUtility(this, i, i2);
    }
}
