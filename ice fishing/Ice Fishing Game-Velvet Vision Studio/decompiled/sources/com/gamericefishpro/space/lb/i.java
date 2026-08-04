package com.gamericefishpro.space.lb;

import android.content.Context;
import com.gamericefishpro.space.b0.o;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.pi.a0;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final com.gamericefishpro.space.p4.d b;
    public static final com.gamericefishpro.space.p4.d c;
    public static final com.gamericefishpro.space.p4.d d;
    public final com.gamericefishpro.space.db.e a;

    static {
        Intrinsics.checkNotNullParameter("fire-global", "name");
        b = new com.gamericefishpro.space.p4.d("fire-global");
        Intrinsics.checkNotNullParameter("fire-count", "name");
        c = new com.gamericefishpro.space.p4.d("fire-count");
        Intrinsics.checkNotNullParameter("last-used-date", "name");
        d = new com.gamericefishpro.space.p4.d("last-used-date");
    }

    public i(Context context, String str) {
        this.a = new com.gamericefishpro.space.db.e(context, com.gamericefishpro.space.m5.a.u("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            com.gamericefishpro.space.db.e eVar = this.a;
            eVar.getClass();
            for (Map.Entry entry : ((Map) a0.y(kotlin.coroutines.g.d, new e0(eVar, null, 1))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((com.gamericefishpro.space.p4.d) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new h(0, jCurrentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized com.gamericefishpro.space.p4.d c(com.gamericefishpro.space.p4.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return com.gamericefishpro.space.hj.c.W(((com.gamericefishpro.space.p4.d) entry.getKey()).a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(com.gamericefishpro.space.p4.b bVar, String str) {
        try {
            com.gamericefishpro.space.p4.d key = c(bVar, str);
            if (key == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) com.gamericefishpro.space.d9.h.A(bVar, key, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.d(key);
            } else {
                Intrinsics.checkNotNullParameter(key, "key");
                bVar.f(key, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(com.gamericefishpro.space.p4.d key, long j) {
        com.gamericefishpro.space.th.a aVar;
        kotlin.coroutines.g gVar;
        long jLongValue;
        com.gamericefishpro.space.db.e eVar = this.a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        aVar = null;
        o oVar = new o(eVar, key, aVar, 4);
        gVar = kotlin.coroutines.g.d;
        jLongValue = ((Long) a0.y(gVar, oVar)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        com.gamericefishpro.space.db.e eVar2 = this.a;
        Long lValueOf = Long.valueOf(j);
        eVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return true;
    }
}
