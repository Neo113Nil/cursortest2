package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionSession extends WinterFlowRouterGateway {
    public final WinterFlowUIRouter WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowExceptionSession(WinterFlowUIRouter winterFlowUIRouter, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowUIRouter;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowUIRouter winterFlowUIRouter = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
        }
        return winterFlowUIRouter.WinterFlowTransactionManagerStrategy;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowUIRouter winterFlowUIRouter = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = winterFlowUIRouter.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && winterFlowUIRouter.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return winterFlowUIRouter.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowUIRouter winterFlowUIRouter = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowLoaderScheduler winterFlowLoaderScheduler = winterFlowUIRouter.WinterFlowVariableVersionControl;
                WinterFlowStackHandler[] winterFlowStackHandlerArr = new WinterFlowStackHandler[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    winterFlowStackHandlerArr[i2] = new WinterFlowHandlerDecorator(0);
                }
                return new WinterFlowLoaderComponent(winterFlowLoaderScheduler, winterFlowStackHandlerArr);
            default:
                WinterFlowLoaderScheduler winterFlowLoaderScheduler2 = winterFlowUIRouter.WinterFlowVariableVersionControl;
                WinterFlowStackHandler[] winterFlowStackHandlerArr2 = new WinterFlowStackHandler[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    winterFlowStackHandlerArr2[i3] = new WinterFlowHandlerDecorator(1);
                }
                return new WinterFlowLoaderComponent(winterFlowLoaderScheduler2, winterFlowStackHandlerArr2);
        }
    }
}
