package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryBatch extends RuntimeException {
    public final transient WinterFlowEncryptionMicroservice WinterFlowVariableVersionControl;

    public WinterFlowRepositoryBatch(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        this.WinterFlowVariableVersionControl = winterFlowEncryptionMicroservice;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.WinterFlowVariableVersionControl.toString();
    }
}
