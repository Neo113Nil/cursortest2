package com.google.android.datatransport;

import java.io.Serializable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public enum WinterFlowTransactionManagerProtocol {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(WinterFlowMicroserviceCloud.class, WinterFlowMicroserviceCloud.WinterFlowUnitTestResponse),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class WinterFlowVariableVersionControl;

    WinterFlowTransactionManagerProtocol(Class cls, Serializable serializable) {
        this.WinterFlowVariableVersionControl = cls;
    }
}
