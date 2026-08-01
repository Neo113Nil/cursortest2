package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowParserCloud extends AbstractSet {
    public final /* synthetic */ Map WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowParserCloud(Map map, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((WinterFlowDataSourceNetwork) this.WinterFlowTransactionManagerStrategy).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                ((WinterFlowDataSourceNetwork) this.WinterFlowTransactionManagerStrategy).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((WinterFlowDataSourceNetwork) this.WinterFlowTransactionManagerStrategy).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.WinterFlowVariableVersionControl;
        Map map = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowSessionManagerServer((WinterFlowUnitTestSystem) map);
            default:
                return new WinterFlowObjectNetwork((WinterFlowDataSourceNetwork) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((WinterFlowDataSourceNetwork) this.WinterFlowTransactionManagerStrategy).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.WinterFlowVariableVersionControl;
        Map map = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowUnitTestSystem) map).WinterFlowUnitTestResponse;
            default:
                return ((WinterFlowDataSourceNetwork) map).size();
        }
    }
}
