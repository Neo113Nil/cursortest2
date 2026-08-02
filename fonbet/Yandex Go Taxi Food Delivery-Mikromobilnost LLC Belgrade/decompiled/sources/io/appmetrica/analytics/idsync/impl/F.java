package io.appmetrica.analytics.idsync.impl;

import defpackage.jl40;
import defpackage.tcc;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class F implements Converter {
    public final String a = "request_state";
    public final String b = "type";
    public final String c = "last_attempt";
    public final String d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<E> list) {
        ?? r2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.a;
        if (list != null) {
            r2 = new ArrayList(tcc.n(list, 10));
            for (E e : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.b, e.a);
                    jSONObject.put(this.c, e.b);
                    jSONObject.put(this.d, e.c.a);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r2.add(jSONObject);
            }
        } else {
            r2 = EmptyList.a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r2));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(String str) {
        JSONArray optJSONArray;
        E a;
        try {
            ArrayList arrayList = new ArrayList();
            if (str != null && (optJSONArray = new JSONObject(str).optJSONArray(this.a)) != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (a = a(optJSONObject)) != null) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return EmptyList.a;
        }
    }

    public final E a(JSONObject jSONObject) {
        A a;
        try {
            String string = jSONObject.getString(this.b);
            long j = jSONObject.getLong(this.c);
            z zVar = A.b;
            String string2 = jSONObject.getString(this.d);
            zVar.getClass();
            A[] values = A.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    a = null;
                    break;
                }
                a = values[i];
                if (jl40.l(a.a, string2)) {
                    break;
                }
                i++;
            }
            if (a == null) {
                a = A.NONE;
            }
            return new E(string, j, a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
