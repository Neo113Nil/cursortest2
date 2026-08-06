package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718rf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0667pf f6821a = new C0667pf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0563lf fromModel(C0693qf c0693qf) {
        C0563lf c0563lf = new C0563lf();
        if (!TextUtils.isEmpty(c0693qf.f6778a)) {
            c0563lf.f6449a = c0693qf.f6778a;
        }
        c0563lf.f6450b = c0693qf.f6779b.toString();
        c0563lf.f6451c = c0693qf.f6780c;
        c0563lf.f6452d = c0693qf.f6781d;
        c0563lf.f6453e = this.f6821a.fromModel(c0693qf.f6782e).intValue();
        return c0563lf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0693qf toModel(C0563lf c0563lf) {
        JSONObject jSONObject;
        String str = c0563lf.f6449a;
        String str2 = c0563lf.f6450b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0693qf(str, jSONObject, c0563lf.f6451c, c0563lf.f6452d, this.f6821a.toModel(Integer.valueOf(c0563lf.f6453e)));
        }
        jSONObject = new JSONObject();
        return new C0693qf(str, jSONObject, c0563lf.f6451c, c0563lf.f6452d, this.f6821a.toModel(Integer.valueOf(c0563lf.f6453e)));
    }
}
