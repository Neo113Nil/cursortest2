package com.gamericefishpro.space.s5;

import android.app.ActivityManager;
import android.content.Context;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ph.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final com.gamericefishpro.space.ei.g a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public com.gamericefishpro.space.a8.b h;
    public boolean i;
    public final s j;
    public final long k;
    public final com.gamericefishpro.space.c5.e l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public final ArrayList o;
    public boolean p;
    public boolean q;
    public final boolean r;

    public q(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = s.d;
        this.k = -1L;
        this.l = new com.gamericefishpro.space.c5.e(1);
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.o = new ArrayList();
        this.p = true;
        this.r = true;
        Intrinsics.checkNotNullParameter(klass, "<this>");
        this.a = com.gamericefishpro.space.ei.b0.a(klass);
        this.b = context;
        this.c = str;
    }

    public final void a(com.gamericefishpro.space.w5.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        for (com.gamericefishpro.space.w5.a aVar : migrations) {
            Integer numValueOf = Integer.valueOf(aVar.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.b));
        }
        com.gamericefishpro.space.w5.a[] migrations2 = (com.gamericefishpro.space.w5.a[]) Arrays.copyOf(migrations, migrations.length);
        com.gamericefishpro.space.c5.e eVar = this.l;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(migrations2, "migrations");
        for (com.gamericefishpro.space.w5.a aVar2 : migrations2) {
            eVar.b(aVar2);
        }
    }

    public final t b() throws Throwable {
        String name;
        com.gamericefishpro.space.s4.f fVarF;
        LinkedHashMap linkedHashMap;
        List list;
        int size;
        boolean[] zArr;
        Iterator it;
        Object objB;
        Object objB2;
        boolean zContainsKey;
        Throwable th;
        boolean z;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            com.gamericefishpro.space.o.a aVar = com.gamericefishpro.space.o.b.e;
            this.g = aVar;
            this.f = aVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet migrationStartAndEndVersions = this.n;
        Intrinsics.checkNotNullParameter(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        LinkedHashSet migrationsNotRequiredFrom = this.m;
        Intrinsics.checkNotNullParameter(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (!migrationStartAndEndVersions.isEmpty()) {
            Iterator it2 = migrationStartAndEndVersions.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        com.gamericefishpro.space.d6.e eVar = this.h;
        if (eVar == null) {
            eVar = new com.gamericefishpro.space.lb.e(4);
        }
        com.gamericefishpro.space.d6.e eVar2 = eVar;
        if (this.k > 0) {
            if (this.c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z2 = this.i;
        s sVar = this.j;
        sVar.getClass();
        Context context = this.b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (sVar == s.d) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            sVar = (activityManager == null || activityManager.isLowRamDevice()) ? s.e : s.i;
        }
        Executor executor2 = this.f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z3 = true;
        s sVar2 = sVar;
        Throwable th2 = null;
        a configuration = new a(context, this.c, eVar2, this.l, this.d, z2, sVar2, executor2, executor3, null, this.p, this.q, migrationsNotRequiredFrom, null, null, null, this.e, this.o, false, null, null);
        configuration.v = this.r;
        Class klass = d5.C(this.a);
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter("_Impl", "suffix");
        Package r5 = klass.getPackage();
        if (r5 == null || (name = r5.getName()) == null) {
            name = "";
        }
        String canonicalName = klass.getCanonicalName();
        Intrinsics.b(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullParameter(canonicalName, "<this>");
        String strReplace = canonicalName.replace('.', '_');
        Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
        sb.append(strReplace);
        sb.append("_Impl");
        String string = sb.toString();
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? string : name + '.' + string, true, klass.getClassLoader());
            Intrinsics.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            t tVar = (t) cls.getDeclaredConstructor(null).newInstance(null);
            tVar.getClass();
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            tVar.k = configuration.v;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            try {
                fVarF = tVar.f();
                Intrinsics.c(fVarF, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                while (true) {
                    int i = -1;
                    if (!it.hasNext()) {
                        Throwable th3 = th2;
                        boolean z4 = z3;
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i2 = size2 - 1;
                                if (size2 >= size || !zArr[size2]) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        }
                        for (com.gamericefishpro.space.w5.a aVar2 : tVar.d(linkedHashMap)) {
                            int i3 = aVar2.a;
                            int i4 = aVar2.b;
                            com.gamericefishpro.space.c5.e eVar3 = configuration.d;
                            eVar3.getClass();
                            Intrinsics.checkNotNullParameter(eVar3, "<this>");
                            LinkedHashMap linkedHashMap2 = eVar3.a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i3))) {
                                Map mapC = (Map) linkedHashMap2.get(Integer.valueOf(i3));
                                if (mapC == null) {
                                    mapC = m0.c();
                                }
                                zContainsKey = mapC.containsKey(Integer.valueOf(i4));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                eVar3.b(aVar2);
                            }
                        }
                        Intrinsics.checkNotNullParameter(tVar, "<this>");
                        Intrinsics.checkNotNullParameter(configuration, "configuration");
                        LinkedHashMap linkedHashMapM = tVar.m();
                        List list2 = configuration.q;
                        boolean[] zArr2 = new boolean[list2.size()];
                        for (Map.Entry entry : linkedHashMapM.entrySet()) {
                            com.gamericefishpro.space.ki.b bVar = (com.gamericefishpro.space.ki.b) entry.getKey();
                            for (com.gamericefishpro.space.ki.b kclass : (List) entry.getValue()) {
                                int size3 = list2.size() - 1;
                                if (size3 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                while (true) {
                                    int i5 = size3 - 1;
                                    if (((com.gamericefishpro.space.ei.g) kclass).d(list2.get(size3))) {
                                        zArr2[size3] = z4;
                                        break;
                                    }
                                    if (i5 < 0) {
                                        size3 = -1;
                                        break;
                                    }
                                    size3 = i5;
                                }
                                if (size3 < 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + ((com.gamericefishpro.space.ei.g) kclass).b() + ") for " + ((com.gamericefishpro.space.ei.g) bVar).b() + " is missing in the database configuration.").toString());
                                }
                                Object converter = list2.get(size3);
                                Intrinsics.checkNotNullParameter(kclass, "kclass");
                                Intrinsics.checkNotNullParameter(converter, "converter");
                                tVar.j.put(kclass, converter);
                            }
                        }
                        int size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i6 = size4 - 1;
                                if (!zArr2[size4]) {
                                    throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                }
                                if (i6 < 0) {
                                    break;
                                }
                                size4 = i6;
                            }
                        }
                        tVar.c = configuration.h;
                        tVar.d = new y(configuration.i, 0);
                        Executor executor4 = tVar.c;
                        if (executor4 == null) {
                            Intrinsics.h("internalQueryExecutor");
                            throw th3;
                        }
                        com.gamericefishpro.space.ui.c cVarB = com.gamericefishpro.space.pi.a0.b(kotlin.coroutines.e.c(com.gamericefishpro.space.pi.a0.k(executor4), com.gamericefishpro.space.pi.a0.d()));
                        tVar.a = cVarB;
                        CoroutineContext coroutineContext = cVarB.d;
                        y yVar = tVar.d;
                        if (yVar == null) {
                            Intrinsics.h("internalTransactionExecutor");
                            throw th3;
                        }
                        tVar.b = coroutineContext.o(com.gamericefishpro.space.pi.a0.k(yVar));
                        tVar.h = configuration.f;
                        p pVar = tVar.e;
                        if (pVar == null) {
                            Intrinsics.h("connectionManager");
                            throw th3;
                        }
                        Object objC = pVar.c();
                        if (objC == null) {
                            objB = th3;
                            break;
                        }
                        objB = objC;
                        while (!(objB instanceof com.gamericefishpro.space.x5.b)) {
                            if (!(objB instanceof b)) {
                                objB = th3;
                                break;
                            }
                            objB = ((b) objB).b();
                        }
                        p pVar2 = tVar.e;
                        if (pVar2 == null) {
                            Intrinsics.h("connectionManager");
                            throw th3;
                        }
                        Object objC2 = pVar2.c();
                        if (objC2 == null) {
                            objB2 = th3;
                            break;
                        }
                        objB2 = objC2;
                        while (!(objB2 instanceof com.gamericefishpro.space.x5.a)) {
                            if (!(objB2 instanceof b)) {
                                objB2 = th3;
                                break;
                            }
                            objB2 = ((b) objB2).b();
                        }
                        return tVar;
                    }
                    com.gamericefishpro.space.ki.b bVar2 = (com.gamericefishpro.space.ki.b) it.next();
                    int size5 = list.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i7 = size5 - 1;
                            th = th2;
                            z = z3;
                            if (((com.gamericefishpro.space.ei.g) bVar2).d(list.get(size5))) {
                                zArr[size5] = z;
                                i = size5;
                                break;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size5 = i7;
                            z3 = z;
                            th2 = th;
                        }
                    } else {
                        th = th2;
                        z = z3;
                    }
                    if (i < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + ((com.gamericefishpro.space.ei.g) bVar2).b() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(bVar2, list.get(i));
                    z3 = z;
                    th2 = th;
                }
            } catch (com.gamericefishpro.space.oh.l unused) {
                fVarF = null;
            }
            tVar.e = fVarF == null ? new p(configuration, new com.gamericefishpro.space.a7.c(22, tVar)) : new p(configuration, fVarF);
            tVar.f = tVar.e();
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            linkedHashMap = new LinkedHashMap();
            Set setK = tVar.k();
            list = configuration.r;
            size = list.size();
            zArr = new boolean[size];
            it = setK.iterator();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + string + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e3);
        }
    }
}
