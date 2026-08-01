package com.google.android.datatransport;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceNetwork extends AbstractMap {
    public static final /* synthetic */ int WinterFlowResponseEngine = 0;
    public volatile WinterFlowParserCloud WinterFlowRouterRouter;
    public Map WinterFlowSyntax;
    public Map WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public List WinterFlowVariableVersionControl;

    public static WinterFlowDataSourceNetwork WinterFlowTransactionManagerStrategy() {
        WinterFlowDataSourceNetwork winterFlowDataSourceNetwork = new WinterFlowDataSourceNetwork();
        winterFlowDataSourceNetwork.WinterFlowVariableVersionControl = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        winterFlowDataSourceNetwork.WinterFlowTransactionManagerStrategy = map;
        winterFlowDataSourceNetwork.WinterFlowSyntax = map;
        return winterFlowDataSourceNetwork;
    }

    public final Set WinterFlowArrayNetwork() {
        return this.WinterFlowTransactionManagerStrategy.isEmpty() ? Collections.EMPTY_SET : this.WinterFlowTransactionManagerStrategy.entrySet();
    }

    public final Map.Entry WinterFlowCacheManagerAgent(int i) {
        return (Map.Entry) this.WinterFlowVariableVersionControl.get(i);
    }

    public final void WinterFlowHookDataSource() {
        if (this.WinterFlowUnitTestResponse) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object WinterFlowRouterRouter(int i) {
        WinterFlowHookDataSource();
        Object obj = ((WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.remove(i)).WinterFlowTransactionManagerStrategy;
        if (!this.WinterFlowTransactionManagerStrategy.isEmpty()) {
            Iterator it = WinterFlowVariableVersionControl().entrySet().iterator();
            List list = this.WinterFlowVariableVersionControl;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new WinterFlowCloudInheritance(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final int WinterFlowRouterStructure(Comparable comparable) {
        int i;
        int size = this.WinterFlowVariableVersionControl.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.get(i2)).WinterFlowVariableVersionControl);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.get(i4)).WinterFlowVariableVersionControl);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: WinterFlowUnitTestResponse, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        WinterFlowHookDataSource();
        int WinterFlowRouterStructure = WinterFlowRouterStructure(comparable);
        if (WinterFlowRouterStructure >= 0) {
            return ((WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.get(WinterFlowRouterStructure)).setValue(obj);
        }
        WinterFlowHookDataSource();
        if (this.WinterFlowVariableVersionControl.isEmpty() && !(this.WinterFlowVariableVersionControl instanceof ArrayList)) {
            this.WinterFlowVariableVersionControl = new ArrayList(16);
        }
        int i = -(WinterFlowRouterStructure + 1);
        if (i >= 16) {
            return WinterFlowVariableVersionControl().put(comparable, obj);
        }
        if (this.WinterFlowVariableVersionControl.size() == 16) {
            WinterFlowCloudInheritance winterFlowCloudInheritance = (WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.remove(15);
            WinterFlowVariableVersionControl().put(winterFlowCloudInheritance.WinterFlowVariableVersionControl, winterFlowCloudInheritance.WinterFlowTransactionManagerStrategy);
        }
        this.WinterFlowVariableVersionControl.add(i, new WinterFlowCloudInheritance(this, comparable, obj));
        return null;
    }

    public final SortedMap WinterFlowVariableVersionControl() {
        WinterFlowHookDataSource();
        if (this.WinterFlowTransactionManagerStrategy.isEmpty() && !(this.WinterFlowTransactionManagerStrategy instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.WinterFlowTransactionManagerStrategy = treeMap;
            this.WinterFlowSyntax = treeMap.descendingMap();
        }
        return (SortedMap) this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        WinterFlowHookDataSource();
        if (!this.WinterFlowVariableVersionControl.isEmpty()) {
            this.WinterFlowVariableVersionControl.clear();
        }
        if (this.WinterFlowTransactionManagerStrategy.isEmpty()) {
            return;
        }
        this.WinterFlowTransactionManagerStrategy.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return WinterFlowRouterStructure(comparable) >= 0 || this.WinterFlowTransactionManagerStrategy.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.WinterFlowRouterRouter == null) {
            this.WinterFlowRouterRouter = new WinterFlowParserCloud(this, 1);
        }
        return this.WinterFlowRouterRouter;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDataSourceNetwork)) {
            return super.equals(obj);
        }
        WinterFlowDataSourceNetwork winterFlowDataSourceNetwork = (WinterFlowDataSourceNetwork) obj;
        int size = size();
        if (size == winterFlowDataSourceNetwork.size()) {
            int size2 = this.WinterFlowVariableVersionControl.size();
            if (size2 != winterFlowDataSourceNetwork.WinterFlowVariableVersionControl.size()) {
                return ((AbstractSet) entrySet()).equals(winterFlowDataSourceNetwork.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (WinterFlowCacheManagerAgent(i).equals(winterFlowDataSourceNetwork.WinterFlowCacheManagerAgent(i))) {
                }
            }
            if (size2 != size) {
                return this.WinterFlowTransactionManagerStrategy.equals(winterFlowDataSourceNetwork.WinterFlowTransactionManagerStrategy);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int WinterFlowRouterStructure = WinterFlowRouterStructure(comparable);
        return WinterFlowRouterStructure >= 0 ? ((WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.get(WinterFlowRouterStructure)).WinterFlowTransactionManagerStrategy : this.WinterFlowTransactionManagerStrategy.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.WinterFlowVariableVersionControl.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((WinterFlowCloudInheritance) this.WinterFlowVariableVersionControl.get(i2)).hashCode();
        }
        return this.WinterFlowTransactionManagerStrategy.size() > 0 ? this.WinterFlowTransactionManagerStrategy.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        WinterFlowHookDataSource();
        Comparable comparable = (Comparable) obj;
        int WinterFlowRouterStructure = WinterFlowRouterStructure(comparable);
        if (WinterFlowRouterStructure >= 0) {
            return WinterFlowRouterRouter(WinterFlowRouterStructure);
        }
        if (this.WinterFlowTransactionManagerStrategy.isEmpty()) {
            return null;
        }
        return this.WinterFlowTransactionManagerStrategy.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.WinterFlowTransactionManagerStrategy.size() + this.WinterFlowVariableVersionControl.size();
    }
}
