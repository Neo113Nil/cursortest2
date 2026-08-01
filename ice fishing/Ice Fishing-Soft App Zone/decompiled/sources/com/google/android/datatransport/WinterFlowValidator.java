package com.google.android.datatransport;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidator {
    public WinterFlowCacheManagerTransactionManager WinterFlowArrayNetwork;
    public final WinterFlowJSON WinterFlowCacheManagerAgent;
    public WinterFlowWebsocketManager WinterFlowHookDataSource;
    public ArrayList WinterFlowResponseEngine;
    public WinterFlowCacheManagerTransactionManager WinterFlowRouterRouter;
    public Set WinterFlowRouterStructure;
    public WinterFlowDatabaseSchemaStructure WinterFlowSyntax;
    public WinterFlowCacheManagerTransactionManager WinterFlowTransactionAgent;
    public final WinterFlowJSON WinterFlowTransactionManagerStrategy;
    public final WinterFlowJSON WinterFlowUnitTestResponse;
    public WinterFlowJSON WinterFlowVariableVersionControl;

    public WinterFlowValidator() {
        WinterFlowJSON winterFlowJSON = new WinterFlowJSON(new WinterFlowFrontendHandler[16]);
        this.WinterFlowCacheManagerAgent = winterFlowJSON;
        WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = WinterFlowLoaderSessionManager.WinterFlowRouterStructure;
        this.WinterFlowArrayNetwork = new WinterFlowCacheManagerTransactionManager();
        this.WinterFlowVariableVersionControl = winterFlowJSON;
        this.WinterFlowTransactionManagerStrategy = new WinterFlowJSON(new Object[16]);
        this.WinterFlowUnitTestResponse = new WinterFlowJSON(new WinterFlowObjectUI[16]);
    }

    public static final boolean WinterFlowTransactionManagerStrategy(WinterFlowFrontendHandler winterFlowFrontendHandler, WinterFlowJSON winterFlowJSON) {
        Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
        int i = winterFlowJSON.WinterFlowUnitTestResponse;
        for (int i2 = 0; i2 < i; i2++) {
            WinterFlowParserHelper winterFlowParserHelper = ((WinterFlowFrontendHandler) objArr[i2]).WinterFlowRouterStructure;
            if (winterFlowParserHelper instanceof WinterFlowServiceProviderConfiguration) {
                WinterFlowJSON winterFlowJSON2 = ((WinterFlowServiceProviderConfiguration) winterFlowParserHelper).WinterFlowTransactionManagerStrategy;
                if (winterFlowJSON2.WinterFlowResponseEngine(winterFlowFrontendHandler) || WinterFlowTransactionManagerStrategy(winterFlowFrontendHandler, winterFlowJSON2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void WinterFlowArrayNetwork() {
        WinterFlowJSON winterFlowJSON = this.WinterFlowUnitTestResponse;
        if (winterFlowJSON.WinterFlowUnitTestResponse != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
                int i = winterFlowJSON.WinterFlowUnitTestResponse;
                for (int i2 = 0; i2 < i; i2++) {
                    ((WinterFlowObjectUI) objArr[i2]).WinterFlowRouterStructure();
                }
                winterFlowJSON.WinterFlowUnitTestResponse();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void WinterFlowCacheManagerAgent() {
        Set set = this.WinterFlowRouterStructure;
        if (set == null) {
            return;
        }
        this.WinterFlowTransactionAgent = null;
        WinterFlowJSON winterFlowJSON = this.WinterFlowTransactionManagerStrategy;
        int i = 2;
        if (winterFlowJSON.WinterFlowUnitTestResponse != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowRouterRouter;
                int i2 = winterFlowJSON.WinterFlowUnitTestResponse;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = winterFlowJSON.WinterFlowVariableVersionControl[i2];
                    try {
                        if (obj instanceof WinterFlowFrontendHandler) {
                            WinterFlowParserHelper winterFlowParserHelper = ((WinterFlowFrontendHandler) obj).WinterFlowRouterStructure;
                            set.remove(winterFlowParserHelper);
                            winterFlowParserHelper.WinterFlowVariableVersionControl();
                        }
                        if (obj instanceof WinterFlowNodeBandwidth) {
                            if (winterFlowCacheManagerTransactionManager == null || !winterFlowCacheManagerTransactionManager.WinterFlowCacheManagerAgent(obj)) {
                                ((WinterFlowNodeBandwidth) obj).WinterFlowCacheManagerAgent();
                            } else {
                                ((WinterFlowNodeBandwidth) obj).WinterFlowHookDataSource();
                            }
                        }
                    } catch (Throwable th) {
                        WinterFlowWebsocketManager winterFlowWebsocketManager = this.WinterFlowHookDataSource;
                        if (winterFlowWebsocketManager != null) {
                            WinterFlowUnitTestLibrary.WinterFlowValidatorHandler(th, new WinterFlowRepositoryLayer(i, winterFlowWebsocketManager, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        WinterFlowJSON winterFlowJSON2 = this.WinterFlowCacheManagerAgent;
        if (winterFlowJSON2.WinterFlowUnitTestResponse != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.WinterFlowRouterStructure;
                if (set2 != null) {
                    Object[] objArr = winterFlowJSON2.WinterFlowVariableVersionControl;
                    int i3 = winterFlowJSON2.WinterFlowUnitTestResponse;
                    for (int i4 = 0; i4 < i3; i4++) {
                        WinterFlowFrontendHandler winterFlowFrontendHandler = (WinterFlowFrontendHandler) objArr[i4];
                        WinterFlowParserHelper winterFlowParserHelper2 = winterFlowFrontendHandler.WinterFlowRouterStructure;
                        set2.remove(winterFlowParserHelper2);
                        try {
                            winterFlowParserHelper2.WinterFlowRouterStructure();
                        } catch (Throwable th2) {
                            WinterFlowWebsocketManager winterFlowWebsocketManager2 = this.WinterFlowHookDataSource;
                            if (winterFlowWebsocketManager2 != null) {
                                WinterFlowUnitTestLibrary.WinterFlowValidatorHandler(th2, new WinterFlowRepositoryLayer(i, winterFlowWebsocketManager2, winterFlowFrontendHandler));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void WinterFlowHookDataSource() {
        Set set = this.WinterFlowRouterStructure;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                WinterFlowParserHelper winterFlowParserHelper = (WinterFlowParserHelper) it.next();
                it.remove();
                winterFlowParserHelper.WinterFlowCacheManagerAgent();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void WinterFlowRouterStructure() {
        this.WinterFlowRouterStructure = null;
        this.WinterFlowHookDataSource = null;
        WinterFlowJSON winterFlowJSON = this.WinterFlowCacheManagerAgent;
        winterFlowJSON.WinterFlowUnitTestResponse();
        this.WinterFlowArrayNetwork.WinterFlowHookDataSource();
        this.WinterFlowVariableVersionControl = winterFlowJSON;
        this.WinterFlowTransactionManagerStrategy.WinterFlowUnitTestResponse();
        this.WinterFlowUnitTestResponse.WinterFlowUnitTestResponse();
        this.WinterFlowRouterRouter = null;
        this.WinterFlowSyntax = null;
        this.WinterFlowResponseEngine = null;
    }

    public final void WinterFlowUnitTestResponse(Set set, WinterFlowWebsocketManager winterFlowWebsocketManager) {
        WinterFlowRouterStructure();
        this.WinterFlowRouterStructure = set;
        this.WinterFlowHookDataSource = winterFlowWebsocketManager;
    }

    public final void WinterFlowVariableVersionControl(WinterFlowFrontendHandler winterFlowFrontendHandler) {
        if (!this.WinterFlowArrayNetwork.WinterFlowCacheManagerAgent(winterFlowFrontendHandler)) {
            WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = this.WinterFlowTransactionAgent;
            if (winterFlowCacheManagerTransactionManager == null || !winterFlowCacheManagerTransactionManager.WinterFlowCacheManagerAgent(winterFlowFrontendHandler)) {
                this.WinterFlowTransactionManagerStrategy.WinterFlowHookDataSource(winterFlowFrontendHandler);
                return;
            }
            return;
        }
        this.WinterFlowArrayNetwork.WinterFlowServerProtocol(winterFlowFrontendHandler);
        if (!this.WinterFlowVariableVersionControl.WinterFlowResponseEngine(winterFlowFrontendHandler)) {
            WinterFlowJSON winterFlowJSON = this.WinterFlowCacheManagerAgent;
            if (!winterFlowJSON.WinterFlowResponseEngine(winterFlowFrontendHandler)) {
                WinterFlowTransactionManagerStrategy(winterFlowFrontendHandler, winterFlowJSON);
            }
        }
        Set set = this.WinterFlowRouterStructure;
        if (set == null) {
            return;
        }
        set.add(winterFlowFrontendHandler.WinterFlowRouterStructure);
    }
}
