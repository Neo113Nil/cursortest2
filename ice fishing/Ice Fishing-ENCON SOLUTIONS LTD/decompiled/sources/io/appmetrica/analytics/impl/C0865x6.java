package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865x6 {

    /* renamed from: a, reason: collision with root package name */
    public final Tl f7188a = new Tl();

    /* renamed from: b, reason: collision with root package name */
    public Map f7189b;

    /* renamed from: c, reason: collision with root package name */
    public Map f7190c;

    /* renamed from: d, reason: collision with root package name */
    public IdentifiersResult f7191d;

    public C0865x6() {
        i1.s sVar = i1.s.f3417a;
        this.f7189b = sVar;
        this.f7190c = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #3 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:22:0x0059, B:23:0x006e, B:25:0x0074, B:29:0x0093, B:30:0x008e, B:33:0x00a4, B:34:0x00bb, B:36:0x00c1, B:40:0x00e3, B:42:0x00e5, B:49:0x00e9, B:51:0x00a2, B:52:0x002a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap hashMap;
        Map map;
        RandomAccess a2;
        try {
            IdentifiersResult identifiersResult2 = this.f7191d;
            String str = identifiersResult2 != null ? identifiersResult2.id : null;
            if (str != null) {
                if (str.length() != 0) {
                    String str2 = identifiersResult.id;
                    if (str2 != null) {
                        if (str2.length() == 0) {
                        }
                    }
                }
            }
            this.f7191d = identifiersResult;
            String str3 = identifiersResult.id;
            if (str3 == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            ArrayList a3 = AbstractC0430gb.a(new JSONArray(jSONObject.optString(next)));
                            if (a3 != null) {
                                hashMap.put(next, a3);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (hashMap != null) {
                map = new LinkedHashMap(i1.v.G(hashMap.size()));
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    map.put(key, new IdentifiersResult(String.valueOf(AbstractC0572lo.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                map = i1.s.f3417a;
            }
            this.f7190c = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap(i1.v.G(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                String str4 = ((IdentifiersResult) entry2.getValue()).id;
                if (str4 != null) {
                    try {
                        a2 = AbstractC0430gb.a(new JSONArray(str4));
                    } catch (Throwable unused3) {
                    }
                    if (a2 != null) {
                        a2 = i1.r.f3416a;
                    }
                    linkedHashMap.put(key2, a2);
                }
                a2 = null;
                if (a2 != null) {
                }
                linkedHashMap.put(key2, a2);
            }
            this.f7189b = linkedHashMap;
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap hashMap) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f7189b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Tl tl = this.f7188a;
            String a2 = AbstractC0430gb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f7191d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", tl.a(new IdentifiersResult(a2, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
