package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSessionManager extends AbstractCollection implements Collection, WinterFlowLoaderProcess {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDatabaseSessionManager(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowDatabaseScript) obj).clear();
                break;
            default:
                ((WinterFlowTransactionManagerUnitTest) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowDatabaseScript) obj2).containsValue(obj);
            default:
                return ((WinterFlowTransactionManagerUnitTest) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowDatabaseScript) this.WinterFlowTransactionManagerStrategy).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowFrameworkNode((WinterFlowDatabaseScript) obj, 2);
            default:
                WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = (WinterFlowTransactionManagerUnitTest) obj;
                WinterFlowStackHandler[] winterFlowStackHandlerArr = new WinterFlowStackHandler[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    winterFlowStackHandlerArr[i2] = new WinterFlowHandlerDecorator(2);
                }
                return new WinterFlowEncryptionLayer(winterFlowTransactionManagerUnitTest, winterFlowStackHandlerArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDatabaseScript winterFlowDatabaseScript = (WinterFlowDatabaseScript) this.WinterFlowTransactionManagerStrategy;
                winterFlowDatabaseScript.WinterFlowCacheManagerAgent();
                int WinterFlowRouterRouter = winterFlowDatabaseScript.WinterFlowRouterRouter(obj);
                if (WinterFlowRouterRouter < 0) {
                    return false;
                }
                winterFlowDatabaseScript.WinterFlowTransactionAgent(WinterFlowRouterRouter);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                ((WinterFlowDatabaseScript) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                collection.getClass();
                ((WinterFlowDatabaseScript) this.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowDatabaseScript) obj).WinterFlowThreadListener;
            default:
                return ((WinterFlowTransactionManagerUnitTest) obj).WinterFlowSyntax;
        }
    }
}
