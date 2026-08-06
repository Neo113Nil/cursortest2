package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class H9 extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final I9 f4466b;

    public H9(X4 x4, TimeProvider timeProvider) {
        super(x4);
        this.f4466b = new I9(x4, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        long optLong;
        I9 i9 = this.f4466b;
        B9 b9 = i9.f4540a.t().f6001B;
        Long valueOf = b9 != null ? Long.valueOf(b9.f4196a) : null;
        if (valueOf != null) {
            C0883xo c0883xo = i9.f4540a.t;
            synchronized (c0883xo) {
                optLong = c0883xo.f7214a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = i9.f4541b.currentTimeMillis();
                i9.f4540a.t.a(optLong);
            }
            if (i9.f4541b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                A9 a9 = (A9) MessageNano.mergeFrom(new A9(), p5.getValueBytes());
                int i2 = a9.f4134a;
                String str = new String(a9.f4135b, z1.a.f8620a);
                String str2 = this.f4466b.f4540a.f5348c.k().get(Integer.valueOf(i2));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f4998a.f5358m.info("Ignoring attribution of type `" + K9.a(i2) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                I9 i92 = this.f4466b;
                Map<Integer, String> k2 = i92.f4540a.f5348c.k();
                k2.put(Integer.valueOf(i2), str);
                i92.f4540a.f5348c.b(k2);
                this.f4998a.f5358m.info("Handling attribution of type `" + K9.a(i2) + '`', new Object[0]);
                return false;
            }
        }
        this.f4998a.f5358m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
