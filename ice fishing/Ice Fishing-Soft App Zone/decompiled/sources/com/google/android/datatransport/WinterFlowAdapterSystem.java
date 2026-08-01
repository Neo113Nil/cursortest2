package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAdapterSystem implements WinterFlowRendererProvider {
    public final ThreadLocal WinterFlowVariableVersionControl;

    public WinterFlowAdapterSystem(ThreadLocal threadLocal) {
        this.WinterFlowVariableVersionControl = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowAdapterSystem) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, ((WinterFlowAdapterSystem) obj).WinterFlowVariableVersionControl);
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.WinterFlowVariableVersionControl + ')';
    }
}
