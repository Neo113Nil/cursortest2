package com.anythink.core.common.h;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    HashMap<String, List<ad>> f14231a = new HashMap<>(2);

    public final synchronized void a(String str, ad adVar) {
        try {
            List<ad> list = this.f14231a.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f14231a.put(str, list);
            }
            list.add(adVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ad a(String str) {
        try {
            HashMap<String, List<ad>> hashMap = this.f14231a;
            ad adVar = null;
            if (hashMap == null) {
                return null;
            }
            List<ad> list = hashMap.get(str);
            if (list != null && list.size() != 0) {
                for (ad adVar2 : list) {
                    double d9 = adVar2.price;
                    if (adVar != null && d9 <= adVar.price) {
                    }
                    adVar = adVar2;
                }
                if (adVar != null) {
                    list.remove(adVar);
                }
                return adVar;
            }
            return null;
        } finally {
        }
    }
}
