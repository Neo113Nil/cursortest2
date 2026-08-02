package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.blewrapper.internal.config.ManufacturerData;
import io.appmetrica.analytics.blewrapper.internal.config.ScanFilterConfig;
import io.appmetrica.analytics.blewrapper.internal.config.ServiceData;
import io.appmetrica.analytics.blewrapper.internal.config.ServiceUuid;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class L implements Converter {
    public final C0164t a;
    public final T b;
    public final V c;

    public /* synthetic */ L(C0164t c0164t, T t, V v, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0164t() : c0164t, (i & 2) != 0 ? new T() : t, (i & 4) != 0 ? new V() : v);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ScanFilterConfig toModel(C c) {
        String str = c.a;
        String str2 = (str == null || str.length() == 0) ? null : str;
        String str3 = c.b;
        String str4 = (str3 == null || str3.length() == 0) ? null : str3;
        z zVar = c.c;
        ManufacturerData model = zVar != null ? this.a.toModel(zVar) : null;
        A a = c.d;
        ServiceData model2 = a != null ? this.b.toModel(a) : null;
        B b = c.e;
        return new ScanFilterConfig(str2, str4, model, model2, b != null ? this.c.toModel(b) : null);
    }

    public L(C0164t c0164t, T t, V v) {
        this.a = c0164t;
        this.b = t;
        this.c = v;
    }

    public L() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C fromModel(ScanFilterConfig scanFilterConfig) {
        C c = new C();
        String deviceAddress = scanFilterConfig.getDeviceAddress();
        if (deviceAddress != null) {
            c.a = deviceAddress;
        }
        String deviceName = scanFilterConfig.getDeviceName();
        if (deviceName != null) {
            c.b = deviceName;
        }
        ManufacturerData manufacturerData = scanFilterConfig.getManufacturerData();
        if (manufacturerData != null) {
            c.c = this.a.fromModel(manufacturerData);
        }
        ServiceData serviceData = scanFilterConfig.getServiceData();
        if (serviceData != null) {
            c.d = this.b.fromModel(serviceData);
        }
        ServiceUuid serviceUuid = scanFilterConfig.getServiceUuid();
        if (serviceUuid != null) {
            c.e = this.c.fromModel(serviceUuid);
        }
        return c;
    }
}
