package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Mh implements ProtobufConverter {
    public final C0222bi a;

    public Mh() {
        this(new C0222bi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Yh fromModel(Oh oh) {
        Yh yh = new Yh();
        if (!StringUtils.isNullOrEmpty(oh.a)) {
            yh.a = oh.a;
        }
        yh.b = oh.b.toString();
        yh.c = this.a.fromModel(oh.c).intValue();
        return yh;
    }

    public Mh(C0222bi c0222bi) {
        this.a = c0222bi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Oh toModel(Yh yh) {
        JSONObject jSONObject;
        String str = yh.a;
        String str2 = yh.b;
        if (!StringUtils.isNullOrEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new Oh(str, jSONObject, this.a.toModel(Integer.valueOf(yh.c)));
        }
        jSONObject = new JSONObject();
        return new Oh(str, jSONObject, this.a.toModel(Integer.valueOf(yh.c)));
    }
}
