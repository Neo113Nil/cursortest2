package io.appmetrica.analytics.impl;

import defpackage.gw00;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0788v7 {
    public final C0604op a = new C0604op();
    public Map b = kotlin.collections.b.f();
    public Map c = kotlin.collections.b.f();
    public IdentifiersResult d;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #1 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:20:0x002c, B:21:0x0041, B:23:0x0047, B:27:0x0066, B:28:0x0061, B:31:0x0079, B:32:0x0090, B:34:0x0096, B:38:0x00b8, B:40:0x00ba, B:47:0x00be, B:49:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        Map f;
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
            HashMap b = Vc.b(identifiersResult.id);
            if (b != null) {
                f = new LinkedHashMap(gw00.d(b.size()));
                for (Map.Entry entry : b.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    f.put(key, new IdentifiersResult(String.valueOf(Or.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                f = kotlin.collections.b.f();
            }
            this.c = f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(f.size()));
            for (Map.Entry entry2 : f.entrySet()) {
                Object key2 = entry2.getKey();
                String str3 = ((IdentifiersResult) entry2.getValue()).id;
                if (str3 != null) {
                    try {
                        a = Vc.a(new JSONArray(str3));
                    } catch (Throwable unused) {
                    }
                    if (a != null) {
                        a = EmptyList.a;
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
            C0604op c0604op = this.a;
            String a = Vc.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", c0604op.a(new IdentifiersResult(a, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
