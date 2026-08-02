package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes9.dex */
public final class Oc {
    public static final void a(Oc oc) {
        synchronized (oc) {
            try {
                if (!Qc.c) {
                    Context context = Jb.I.a;
                    Tl tl = new Tl(context);
                    LinkedHashMap linkedHashMap = Jb.I.v.a;
                    Object obj = linkedHashMap.get(2);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(2, obj);
                    }
                    ((List) obj).add(tl);
                    C0775un c0775un = Jb.I.v;
                    X8 x8 = new X8(context);
                    LinkedHashMap linkedHashMap2 = c0775un.a;
                    Object obj2 = linkedHashMap2.get(3);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(3, obj2);
                    }
                    ((List) obj2).add(x8);
                    Qc.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
