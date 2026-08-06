package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743se implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0817va f6910a;

    public C0743se() {
        this(new C0817va(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(Map<String, String> map) {
        Mn a2 = this.f6910a.a(map);
        C0556l8 c0556l8 = new C0556l8();
        c0556l8.f6440b = ((C0604n4) a2.f4786b).f6548b;
        Map map2 = (Map) a2.f4785a;
        if (map2 != null) {
            c0556l8.f6439a = new C0530k8[map2.size()];
            int i2 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0556l8.f6439a[i2] = new C0530k8();
                c0556l8.f6439a[i2].f6353a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0556l8.f6439a[i2].f6354b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i2++;
            }
        }
        InterfaceC0293b3 interfaceC0293b3 = a2.f4786b;
        int i3 = ((C0604n4) interfaceC0293b3).f5544a;
        return new Di(c0556l8, interfaceC0293b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0743se(C0817va c0817va) {
        this.f6910a = c0817va;
    }

    public final Map<String, String> a(Di di) {
        throw new UnsupportedOperationException();
    }
}
