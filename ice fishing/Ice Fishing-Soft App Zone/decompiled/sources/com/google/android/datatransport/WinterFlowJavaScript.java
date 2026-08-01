package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaScript implements Set, WinterFlowLoaderProcess {
    public final WinterFlowDatabaseSchemaStructure WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowJavaScript(WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaStructure;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(entry.getKey()), entry.getValue());
            default:
                return winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowTransactionManagerStrategy;
        collection.getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Collection<Map.Entry> collection2 = collection;
                if (!collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection3 = collection;
                if (!collection3.isEmpty()) {
                    Iterator it = collection3.iterator();
                    while (it.hasNext()) {
                        if (!winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(it.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
        }
        return winterFlowDatabaseSchemaStructure.WinterFlowSyntax();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return WinterFlowConfigurationException.WinterFlowVariableVersionControl(new WinterFlowServerFrontend(this, winterFlowTransactionManagerLayer, 0));
            default:
                return WinterFlowConfigurationException.WinterFlowVariableVersionControl(new WinterFlowServerFrontend(this, winterFlowTransactionManagerLayer, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
        }
        return winterFlowDatabaseSchemaStructure.WinterFlowVariableVersionControl;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                objArr.getClass();
                break;
            default:
                objArr.getClass();
                break;
        }
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.WinterFlowVariableVersionControl) {
        }
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }
}
