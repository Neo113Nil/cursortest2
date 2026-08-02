package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0805yc {
    public static final void a(C0805yc c0805yc) {
        synchronized (c0805yc) {
            try {
                if (!Ac.c) {
                    Context context = C0747wb.I.a;
                    Il il = new Il(context);
                    LinkedHashMap linkedHashMap = C0747wb.I.v.a;
                    Object obj = linkedHashMap.get(2);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(2, obj);
                    }
                    ((List) obj).add(il);
                    C0182cn c0182cn = C0747wb.I.v;
                    S8 s8 = new S8(context);
                    LinkedHashMap linkedHashMap2 = c0182cn.a;
                    Object obj2 = linkedHashMap2.get(3);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(3, obj2);
                    }
                    ((List) obj2).add(s8);
                    Ac.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
