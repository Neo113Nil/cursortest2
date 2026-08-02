package io.appmetrica.analytics.impl;

import defpackage.c5b;
import defpackage.e5b;
import defpackage.tah;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0570q7 {
    public final Wo a = new Wo();
    public Map b;
    public Map c;
    public IdentifiersResult d;

    public C0570q7() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.b = e5bVar;
        e5bVar.getClass();
        this.c = e5bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #1 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:20:0x002c, B:21:0x0041, B:23:0x0047, B:27:0x0066, B:28:0x0061, B:31:0x007a, B:32:0x0091, B:34:0x0097, B:38:0x00b9, B:40:0x00bb, B:47:0x00bf, B:49:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        Map map;
        RandomAccess a;
        try {
            IdentifiersResult identifiersResult2 = this.d;
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
            this.d = identifiersResult;
            HashMap b = Fc.b(identifiersResult.id);
            if (b != null) {
                map = new LinkedHashMap(tah.a(b.size()));
                for (Map.Entry entry : b.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    map.put(key, new IdentifiersResult(String.valueOf(AbstractC0734vr.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                map = e5b.a;
                map.getClass();
            }
            this.c = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                Object key2 = entry2.getKey();
                String str3 = ((IdentifiersResult) entry2.getValue()).id;
                if (str3 != null) {
                    try {
                        a = Fc.a(new JSONArray(str3));
                    } catch (Throwable unused) {
                    }
                    if (a != null) {
                        a = c5b.a;
                    }
                    linkedHashMap.put(key2, a);
                }
                a = null;
                if (a != null) {
                }
                linkedHashMap.put(key2, a);
            }
            this.b = linkedHashMap;
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
                List list2 = (List) this.b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Wo wo = this.a;
            String a = Fc.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", wo.a(new IdentifiersResult(a, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
