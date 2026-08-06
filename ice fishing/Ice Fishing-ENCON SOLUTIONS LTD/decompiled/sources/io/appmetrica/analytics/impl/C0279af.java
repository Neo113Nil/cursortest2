package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279af implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0667pf f5566a;

    public C0279af() {
        this(new C0667pf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0589mf fromModel(C0331cf c0331cf) {
        C0589mf c0589mf = new C0589mf();
        if (!TextUtils.isEmpty(c0331cf.f5747a)) {
            c0589mf.f6516a = c0331cf.f5747a;
        }
        c0589mf.f6517b = c0331cf.f5748b.toString();
        c0589mf.f6518c = this.f5566a.fromModel(c0331cf.f5749c).intValue();
        return c0589mf;
    }

    public C0279af(C0667pf c0667pf) {
        this.f5566a = c0667pf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0331cf toModel(C0589mf c0589mf) {
        JSONObject jSONObject;
        String str = c0589mf.f6516a;
        String str2 = c0589mf.f6517b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0331cf(str, jSONObject, this.f5566a.toModel(Integer.valueOf(c0589mf.f6518c)));
        }
        jSONObject = new JSONObject();
        return new C0331cf(str, jSONObject, this.f5566a.toModel(Integer.valueOf(c0589mf.f6518c)));
    }
}
