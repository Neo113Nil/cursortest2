package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final String f3985a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final String f3986b = "type";

    /* renamed from: c, reason: collision with root package name */
    public final String f3987c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final String f3988d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [i1.r] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<E> list) {
        ?? r2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f3985a;
        if (list != null) {
            r2 = new ArrayList(i1.k.E(list));
            for (E e2 : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f3986b, e2.f3982a);
                    jSONObject.put(this.f3987c, e2.f3983b);
                    jSONObject.put(this.f3988d, z.a(e2.f3984c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r2.add(jSONObject);
            }
        } else {
            r2 = i1.r.f3416a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r2));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(String str) {
        JSONArray optJSONArray;
        E e2;
        int i2;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.f3985a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.f3986b);
                        long j2 = optJSONObject.getLong(this.f3987c);
                        String string2 = optJSONObject.getString(this.f3988d);
                        int[] b2 = A.b(4);
                        int length2 = b2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i2 = 0;
                                break;
                            }
                            i2 = b2[i4];
                            if (kotlin.jvm.internal.i.a(z.a(i2), string2)) {
                                break;
                            }
                            i4++;
                        }
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        e2 = new E(string, j2, i2);
                    } catch (Throwable unused) {
                        e2 = null;
                    }
                    if (e2 != null) {
                        arrayList.add(e2);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return i1.r.f3416a;
        }
    }
}
