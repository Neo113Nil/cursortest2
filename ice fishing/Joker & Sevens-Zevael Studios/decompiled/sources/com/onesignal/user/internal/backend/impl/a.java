package com.onesignal.user.internal.backend.impl;

import ac.o;
import bc.a0;
import com.onesignal.common.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements gb.b {
    private final w8.c _httpClient;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0065a extends hc.c {
        int label;
        /* synthetic */ Object result;

        public C0065a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setAlias(null, null, null, null, this);
        }
    }

    public a(w8.c cVar) {
        j.e(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, fc.d dVar) {
        C0065a c0065a;
        int i10;
        w8.a aVar;
        if (dVar instanceof C0065a) {
            c0065a = (C0065a) dVar;
            int i11 = c0065a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0065a.label = i11 - Integer.MIN_VALUE;
                C0065a c0065a2 = c0065a;
                Object obj = c0065a2.result;
                i10 = c0065a2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    c0065a2.label = 1;
                    obj = w8.b.delete$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, null, c0065a2, 2, null);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar = (w8.a) obj;
                if (aVar.isSuccess()) {
                    throw new l8.a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return o.f277a;
            }
        }
        c0065a = new C0065a(dVar);
        C0065a c0065a22 = c0065a;
        Object obj2 = c0065a22.result;
        i10 = c0065a22.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // gb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, fc.d dVar) {
        b bVar;
        int i10;
        w8.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                i10 = bVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject put = new JSONObject().put("identity", f.putMap(new JSONObject(), map));
                    j.d(put, "requestJSONObject");
                    bVar2.label = 1;
                    obj = w8.b.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, null, bVar2, 4, null);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar = (w8.a) obj;
                if (aVar.isSuccess()) {
                    throw new l8.a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                String payload = aVar.getPayload();
                j.b(payload);
                JSONObject jSONObject = new JSONObject(payload).getJSONObject("identity");
                j.d(jSONObject, "responseJSON.getJSONObject(\"identity\")");
                Map<String, Object> map2 = f.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(a0.B(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        i10 = bVar22.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
