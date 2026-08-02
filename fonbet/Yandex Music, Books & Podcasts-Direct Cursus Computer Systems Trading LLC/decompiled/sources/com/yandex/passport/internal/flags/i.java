package com.yandex.passport.internal.flags;

import android.content.SharedPreferences;
import defpackage.u75;
import defpackage.uah;
import defpackage.vlv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final d a;
    public final com.yandex.passport.internal.flags.experiments.i b;
    public final com.yandex.passport.internal.flags.experiments.k c;
    public final com.yandex.passport.internal.flags.experiments.b d;
    public final List e;

    public i(d dVar, com.yandex.passport.internal.flags.experiments.i iVar, com.yandex.passport.internal.flags.experiments.k kVar, com.yandex.passport.internal.flags.experiments.b bVar) {
        dVar.getClass();
        iVar.getClass();
        kVar.getClass();
        bVar.getClass();
        this.a = dVar;
        this.b = iVar;
        this.c = kVar;
        this.d = bVar;
        int i = 0;
        int i2 = 1;
        this.e = u75.h(new h(new vlv(i2, kVar, com.yandex.passport.internal.flags.experiments.k.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", i, 9)), new h(new vlv(i2, iVar, com.yandex.passport.internal.flags.experiments.i.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", i, 10)));
    }

    public final void a() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Start of collecting experiment flags for the current Passport session", 8);
        }
        Set<String> keySet = this.b.a.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (!Intrinsics.d(str, "__last__updated__time") && !Intrinsics.d(str, "__last__enqueue__time")) {
                arrayList.add(obj);
            }
        }
        ArrayList g0 = CollectionsKt.g0(arrayList, CollectionsKt.w0(this.c.a.getAll().keySet()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = g0.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            com.yandex.passport.internal.flags.experiments.k kVar = this.c;
            kVar.getClass();
            str2.getClass();
            String string = kVar.a.getString(str2, null);
            if (string != null) {
                linkedHashMap.put(str2, string);
            } else {
                com.yandex.passport.internal.flags.experiments.i iVar = this.b;
                iVar.getClass();
                String string2 = iVar.a.getString(str2, null);
                if (string2 != null) {
                    linkedHashMap.put(str2, string2);
                }
            }
        }
        com.yandex.passport.internal.flags.experiments.b bVar = this.d;
        Map o = uah.o(linkedHashMap);
        bVar.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Rewriting the actual experiments of this Passport session", 8);
        }
        SharedPreferences.Editor edit = bVar.a.edit();
        edit.clear();
        for (Map.Entry entry : o.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.apply();
        bVar.b = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ezc, kotlin.jvm.functions.Function1] */
    public final Object b(g gVar) {
        gVar.getClass();
        if (this.d.b) {
            String str = (String) new vlv(1, this.d, com.yandex.passport.internal.flags.experiments.b.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0, 8).invoke(gVar.a);
            Object a = str != null ? gVar.a(str) : null;
            if (a != null) {
                return a;
            }
        } else {
            for (h hVar : this.e) {
                hVar.getClass();
                String str2 = (String) hVar.a.invoke(gVar.a);
                Object a2 = str2 != null ? gVar.a(str2) : null;
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return gVar.b;
    }
}
