package io.appmetrica.analytics.impl;

import defpackage.uza;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Xa extends Aj {
    public final Ya b;

    public Xa(S5 s5, TimeProvider timeProvider) {
        super(s5);
        this.b = new Ya(s5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        long optLong;
        Ya ya = this.b;
        Ra ra = ya.a.u().C;
        Long valueOf = ra != null ? Long.valueOf(ra.a) : null;
        if (valueOf != null) {
            as asVar = ya.a.t;
            synchronized (asVar) {
                optLong = asVar.a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = ya.b.currentTimeMillis();
                ya.a.t.a(optLong);
            }
            if (ya.b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                Qa qa = (Qa) MessageNano.mergeFrom(new Qa(), k6.getValueBytes());
                int i = qa.a;
                String str = new String(qa.b, uza.a);
                String str2 = this.b.a.c.k().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.a.m.info("Ignoring attribution of type `" + AbstractC0186ab.a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                Ya ya2 = this.b;
                Map<Integer, String> k = ya2.a.c.k();
                k.put(Integer.valueOf(i), str);
                ya2.a.c.b(k);
                this.a.m.info("Handling attribution of type `" + AbstractC0186ab.a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.a.m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
