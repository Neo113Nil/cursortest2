package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderRequest extends WinterFlowResolverRefactoring {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowLoaderRequest(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    public WinterFlowAPIStructure WinterFlowCacheManagerAgent(int i) {
        Matcher matcher = (Matcher) ((WinterFlowStackProvider) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl;
        WinterFlowCacheManagerListener WinterFlowArrayHelper = WinterFlowDecoratorUI.WinterFlowArrayHelper(matcher.start(i), matcher.end(i));
        if (WinterFlowArrayHelper.WinterFlowVariableVersionControl < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new WinterFlowAPIStructure(group, WinterFlowArrayHelper);
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((WinterFlowStackProvider) obj).WinterFlowVariableVersionControl).groupCount() + 1;
            default:
                return ((WinterFlowUIRouter) obj).WinterFlowTransactionManagerStrategy;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj == null ? true : obj instanceof WinterFlowAPIStructure) {
                    return super.contains((WinterFlowAPIStructure) obj);
                }
                return false;
            default:
                return ((WinterFlowUIRouter) this.WinterFlowTransactionManagerStrategy).containsValue(obj);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection
    public boolean isEmpty() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowAlgorithmEngine(new WinterFlowProcessorFramework(new WinterFlowServiceValidator(0, new WinterFlowCacheManagerListener(0, size() - 1, 1)), new WinterFlowCompilerCloud(13, this), 1));
            default:
                WinterFlowLoaderScheduler winterFlowLoaderScheduler = ((WinterFlowUIRouter) this.WinterFlowTransactionManagerStrategy).WinterFlowVariableVersionControl;
                WinterFlowStackHandler[] winterFlowStackHandlerArr = new WinterFlowStackHandler[8];
                for (int i = 0; i < 8; i++) {
                    winterFlowStackHandlerArr[i] = new WinterFlowHandlerDecorator(2);
                }
                return new WinterFlowLoaderComponent(winterFlowLoaderScheduler, winterFlowStackHandlerArr);
        }
    }
}
