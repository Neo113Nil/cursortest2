package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775tk {
    public static P5 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        P5 p5 = new P5("", "", 0);
        p5.f4907d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            p5.f4904a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            p5.f4905b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            p5.setValueBytes(valueBytes);
        }
        return p5;
    }
}
