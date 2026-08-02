package io.appmetrica.analytics.locationinternal.impl;

import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class M0 implements ProtobufConverter {
    public final Y a = new Y();
    public final C0940d2 b = new C0940d2();
    public final q2 c = new q2();
    public final C0954i d = new C0954i();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LocationConfig toModel(U0 u0) {
        Q0[] q0Arr = u0.a;
        ArrayList arrayList = new ArrayList(q0Arr.length);
        for (Q0 q0 : q0Arr) {
            arrayList.add(this.a.toModel(q0));
        }
        C0940d2 c0940d2 = this.b;
        X0 x0 = u0.b;
        if (x0 == null) {
            x0 = new X0();
        }
        c0940d2.getClass();
        RetryPolicyConfig retryPolicyConfig = new RetryPolicyConfig(x0.a, x0.b);
        byte[][] bArr = u0.c;
        ArrayList arrayList2 = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList2.add(new String(bArr2, uza.a));
        }
        q2 q2Var = this.c;
        Z0 z0 = u0.d;
        if (z0 == null) {
            z0 = new Z0();
        }
        p2 model = q2Var.toModel(z0);
        C0954i c0954i = this.d;
        P0 p0 = u0.e;
        if (p0 == null) {
            p0 = new P0();
        }
        c0954i.getClass();
        return new LocationConfig(arrayList, retryPolicyConfig, arrayList2, model, new C0951h(p0.a, p0.b));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U0 fromModel(LocationConfig locationConfig) {
        U0 u0 = new U0();
        int size = locationConfig.getConditionalArgumentsList$location_yandex_release().size();
        Q0[] q0Arr = new Q0[size];
        for (int i = 0; i < size; i++) {
            q0Arr[i] = this.a.fromModel(locationConfig.getConditionalArgumentsList$location_yandex_release().get(i));
        }
        u0.a = q0Arr;
        u0.b = this.b.fromModel(locationConfig.getRetryPolicyConfig());
        int size2 = locationConfig.getHosts$location_yandex_release().size();
        byte[][] bArr = new byte[size2][];
        for (int i2 = 0; i2 < size2; i2++) {
            bArr[i2] = locationConfig.getHosts$location_yandex_release().get(i2).getBytes(uza.a);
        }
        u0.c = bArr;
        u0.d = this.c.fromModel(locationConfig.getThrottlingConfig());
        u0.e = this.d.fromModel(locationConfig.getCacheControl());
        return u0;
    }
}
