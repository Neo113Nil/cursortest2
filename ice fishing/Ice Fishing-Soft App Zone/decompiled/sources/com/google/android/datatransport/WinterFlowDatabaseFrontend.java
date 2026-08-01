package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseFrontend extends UnsupportedOperationException {
    public final WinterFlowDebugDatabaseSchema WinterFlowVariableVersionControl;

    public WinterFlowDatabaseFrontend(WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema) {
        this.WinterFlowVariableVersionControl = winterFlowDebugDatabaseSchema;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.WinterFlowVariableVersionControl));
    }
}
