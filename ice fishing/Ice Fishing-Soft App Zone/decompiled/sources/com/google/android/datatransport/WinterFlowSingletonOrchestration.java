package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSingletonOrchestration extends WinterFlowArrayCache {
    public final WinterFlowDatabaseScript WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSingletonOrchestration(WinterFlowDatabaseScript winterFlowDatabaseScript, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowDatabaseScript;
    }

    @Override // com.google.android.datatransport.WinterFlowArrayCache
    public final int WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
        }
        return winterFlowDatabaseScript.WinterFlowThreadListener;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.WinterFlowVariableVersionControl;
        collection.getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowDatabaseScript.clear();
                break;
            default:
                winterFlowDatabaseScript.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int WinterFlowUnitTestResponse = winterFlowDatabaseScript.WinterFlowUnitTestResponse(entry.getKey());
                if (WinterFlowUnitTestResponse < 0) {
                    return false;
                }
                Object[] objArr = winterFlowDatabaseScript.WinterFlowTransactionManagerStrategy;
                objArr.getClass();
                return WinterFlowManagerRequest.WinterFlowThreadListener(objArr[WinterFlowUnitTestResponse], entry.getValue());
            default:
                return winterFlowDatabaseScript.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                return this.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
        }
        return winterFlowDatabaseScript.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowFrameworkNode(winterFlowDatabaseScript, 0);
            default:
                return new WinterFlowFrameworkNode(winterFlowDatabaseScript, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                    int WinterFlowUnitTestResponse = winterFlowDatabaseScript.WinterFlowUnitTestResponse(entry.getKey());
                    if (WinterFlowUnitTestResponse >= 0) {
                        Object[] objArr = winterFlowDatabaseScript.WinterFlowTransactionManagerStrategy;
                        objArr.getClass();
                        if (WinterFlowManagerRequest.WinterFlowThreadListener(objArr[WinterFlowUnitTestResponse], entry.getValue())) {
                            winterFlowDatabaseScript.WinterFlowTransactionAgent(WinterFlowUnitTestResponse);
                            break;
                        }
                    }
                }
                break;
            default:
                winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                int WinterFlowUnitTestResponse2 = winterFlowDatabaseScript.WinterFlowUnitTestResponse(obj);
                if (WinterFlowUnitTestResponse2 >= 0) {
                    winterFlowDatabaseScript.WinterFlowTransactionAgent(WinterFlowUnitTestResponse2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        collection.getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                break;
            default:
                winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseScript winterFlowDatabaseScript = this.WinterFlowTransactionManagerStrategy;
        collection.getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                break;
            default:
                winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                break;
        }
        return super.retainAll(collection);
    }
}
