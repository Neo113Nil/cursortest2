package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaFramework extends WinterFlowArrayCache {
    public final WinterFlowTransactionManagerUnitTest WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDatabaseSchemaFramework(int i, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowTransactionManagerUnitTest;
    }

    @Override // com.google.android.datatransport.WinterFlowArrayCache
    public final int WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
        }
        return winterFlowTransactionManagerUnitTest.WinterFlowSyntax;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowTransactionManagerUnitTest.clear();
                break;
            default:
                winterFlowTransactionManagerUnitTest.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = this.WinterFlowTransactionManagerStrategy;
                    Object obj2 = winterFlowTransactionManagerUnitTest.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && winterFlowTransactionManagerUnitTest.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.WinterFlowTransactionManagerStrategy.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowResolverPlatform(winterFlowTransactionManagerUnitTest);
            default:
                WinterFlowStackHandler[] winterFlowStackHandlerArr = new WinterFlowStackHandler[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    winterFlowStackHandlerArr[i2] = new WinterFlowHandlerDecorator(1);
                }
                return new WinterFlowEncryptionLayer(winterFlowTransactionManagerUnitTest, winterFlowStackHandlerArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.WinterFlowTransactionManagerStrategy.remove(entry.getKey(), entry.getValue());
            default:
                WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = this.WinterFlowTransactionManagerStrategy;
                if (!winterFlowTransactionManagerUnitTest.containsKey(obj)) {
                    return false;
                }
                winterFlowTransactionManagerUnitTest.remove(obj);
                return true;
        }
    }
}
