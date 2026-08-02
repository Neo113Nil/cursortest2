package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* loaded from: classes9.dex */
public final class Ln {
    public static K6 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        K6 k6 = new K6("", "", 0);
        k6.d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            k6.a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            k6.b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            k6.setValueBytes(valueBytes);
        }
        return k6;
    }
}
