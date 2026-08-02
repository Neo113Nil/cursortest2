package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0280di implements ProtobufConverter {
    public final C0222bi a = new C0222bi();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Xh fromModel(C0251ci c0251ci) {
        Xh xh = new Xh();
        if (!StringUtils.isNullOrEmpty(c0251ci.a)) {
            xh.a = c0251ci.a;
        }
        xh.b = c0251ci.b.toString();
        xh.c = c0251ci.c;
        xh.d = c0251ci.d;
        xh.e = this.a.fromModel(c0251ci.e).intValue();
        return xh;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0251ci toModel(Xh xh) {
        JSONObject jSONObject;
        String str = xh.a;
        String str2 = xh.b;
        if (!StringUtils.isNullOrEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0251ci(str, jSONObject, xh.c, xh.d, this.a.toModel(Integer.valueOf(xh.e)));
        }
        jSONObject = new JSONObject();
        return new C0251ci(str, jSONObject, xh.c, xh.d, this.a.toModel(Integer.valueOf(xh.e)));
    }
}
