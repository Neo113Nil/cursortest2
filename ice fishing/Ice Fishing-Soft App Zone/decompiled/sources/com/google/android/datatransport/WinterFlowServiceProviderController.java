package com.google.android.datatransport;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderController extends WinterFlowRouterLayer {
    public final WinterFlowDebugEvent WinterFlowCacheManagerListener;
    public WinterFlowLoaderHook WinterFlowPackageIDE;
    public WinterFlowObjectSession WinterFlowSoftwareEngine;
    public WinterFlowObjectSession WinterFlowSoftwareProtocol;
    public final View WinterFlowStrategyTool;
    public WinterFlowObjectSession WinterFlowUserManagerUserManager;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowServiceProviderController(Context context, WinterFlowObjectSession winterFlowObjectSession, WinterFlowDatabaseSchemaLayer winterFlowDatabaseSchemaLayer, WinterFlowEncryptionComponent winterFlowEncryptionComponent, int i, WinterFlowListenerService winterFlowListenerService) {
        super(context, winterFlowDatabaseSchemaLayer, i, r4, r5, winterFlowListenerService);
        View view = (View) winterFlowObjectSession.WinterFlowUnitTestResponse(context);
        WinterFlowDebugEvent winterFlowDebugEvent = new WinterFlowDebugEvent();
        this.WinterFlowStrategyTool = view;
        this.WinterFlowCacheManagerListener = winterFlowDebugEvent;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object WinterFlowTransactionManagerStrategy = winterFlowEncryptionComponent != null ? winterFlowEncryptionComponent.WinterFlowTransactionManagerStrategy(valueOf) : null;
        SparseArray<Parcelable> sparseArray = WinterFlowTransactionManagerStrategy instanceof SparseArray ? (SparseArray) WinterFlowTransactionManagerStrategy : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (winterFlowEncryptionComponent != null) {
            setSavableRegistryEntry(winterFlowEncryptionComponent.WinterFlowArrayNetwork(valueOf, new WinterFlowProxyAlgorithm(this, 2)));
        }
        WinterFlowServiceProviderBatch winterFlowServiceProviderBatch = WinterFlowServiceProviderBatch.WinterFlowBandwidthObject;
        this.WinterFlowSoftwareProtocol = winterFlowServiceProviderBatch;
        this.WinterFlowUserManagerUserManager = winterFlowServiceProviderBatch;
        this.WinterFlowSoftwareEngine = winterFlowServiceProviderBatch;
    }

    private final void setSavableRegistryEntry(WinterFlowLoaderHook winterFlowLoaderHook) {
        WinterFlowLoaderHook winterFlowLoaderHook2 = this.WinterFlowPackageIDE;
        if (winterFlowLoaderHook2 != null) {
            ((WinterFlowObjectPackage) winterFlowLoaderHook2).WinterFlowCompilerVariable();
        }
        this.WinterFlowPackageIDE = winterFlowLoaderHook;
    }

    public final void WinterFlowRouterRouter() {
        setSavableRegistryEntry(null);
    }

    public final WinterFlowDebugEvent getDispatcher() {
        return this.WinterFlowCacheManagerListener;
    }

    public final WinterFlowObjectSession getReleaseBlock() {
        return this.WinterFlowSoftwareEngine;
    }

    public final WinterFlowObjectSession getResetBlock() {
        return this.WinterFlowUserManagerUserManager;
    }

    public /* bridge */ /* synthetic */ WinterFlowLoaderFramework getSubCompositionView() {
        return null;
    }

    public final WinterFlowObjectSession getUpdateBlock() {
        return this.WinterFlowSoftwareProtocol;
    }

    public final void setReleaseBlock(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowSoftwareEngine = winterFlowObjectSession;
        setRelease(new WinterFlowProxyAlgorithm(this, 3));
    }

    public final void setResetBlock(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowUserManagerUserManager = winterFlowObjectSession;
        setReset(new WinterFlowProxyAlgorithm(this, 4));
    }

    public final void setUpdateBlock(WinterFlowObjectSession winterFlowObjectSession) {
        this.WinterFlowSoftwareProtocol = winterFlowObjectSession;
        setUpdate(new WinterFlowProxyAlgorithm(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
