package com.google.android.datatransport;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueryComponent extends CancellationException {
    public final transient WinterFlowControllerTransaction WinterFlowVariableVersionControl;

    public WinterFlowQueryComponent(String str, Throwable th, WinterFlowControllerTransaction winterFlowControllerTransaction) {
        super(str);
        this.WinterFlowVariableVersionControl = winterFlowControllerTransaction;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowQueryComponent)) {
            return false;
        }
        WinterFlowQueryComponent winterFlowQueryComponent = (WinterFlowQueryComponent) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowQueryComponent.getMessage(), getMessage()) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowQueryComponent.WinterFlowVariableVersionControl, this.WinterFlowVariableVersionControl) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowQueryComponent.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.WinterFlowVariableVersionControl.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.WinterFlowVariableVersionControl;
    }
}
