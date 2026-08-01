package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerHook implements Map.Entry, WinterFlowLoaderProcess {
    public WinterFlowHandlerHook WinterFlowRouterRouter;
    public boolean WinterFlowSyntax;
    public final WinterFlowCacheServer WinterFlowTransactionManagerStrategy;
    public WinterFlowHandlerHook WinterFlowUnitTestResponse;
    public final WinterFlowClassDecorator WinterFlowVariableVersionControl;

    public WinterFlowHandlerHook(WinterFlowClassDecorator winterFlowClassDecorator, WinterFlowCacheServer winterFlowCacheServer) {
        this.WinterFlowVariableVersionControl = winterFlowClassDecorator;
        this.WinterFlowTransactionManagerStrategy = winterFlowCacheServer;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WinterFlowHandlerHook) {
            WinterFlowHandlerHook winterFlowHandlerHook = (WinterFlowHandlerHook) obj;
            return this.WinterFlowVariableVersionControl.equals(winterFlowHandlerHook.WinterFlowVariableVersionControl) && this.WinterFlowTransactionManagerStrategy == winterFlowHandlerHook.WinterFlowTransactionManagerStrategy;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.WinterFlowVariableVersionControl;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.WinterFlowTransactionManagerStrategy.hashCode() + (this.WinterFlowVariableVersionControl.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.WinterFlowVariableVersionControl + ", value=" + this.WinterFlowTransactionManagerStrategy + ")";
    }
}
