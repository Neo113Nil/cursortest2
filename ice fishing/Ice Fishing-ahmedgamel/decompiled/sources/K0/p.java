package K0;

import J0.r;
import J0.x;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import m.R0;
import n.C4757b;
import n.ExecutorC4756a;
import u0.C5053b;
import u0.C5059h;
import v0.AbstractC5095a;
import x1.C5184b;
import y0.InterfaceC5196a;
import z0.C5220i;

/* loaded from: classes.dex */
public final class p extends x {

    /* renamed from: k, reason: collision with root package name */
    public static p f1638k;

    /* renamed from: l, reason: collision with root package name */
    public static p f1639l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1640m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1641a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.b f1642b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f1643c;

    /* renamed from: d, reason: collision with root package name */
    public final b3.e f1644d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1645e;

    /* renamed from: f, reason: collision with root package name */
    public final f f1646f;

    /* renamed from: g, reason: collision with root package name */
    public final n4.c f1647g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1648h;
    public BroadcastReceiver.PendingResult i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.i f1649j;

    static {
        r.f("WorkManagerImpl");
        f1638k = null;
        f1639l = null;
        f1640m = new Object();
    }

    public p(Context context, J0.b bVar, b3.e eVar) {
        C5059h c5059h;
        int i;
        boolean z6;
        boolean z9 = context.getResources().getBoolean(C5248R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        T0.l queryExecutor = (T0.l) eVar.f5557u;
        kotlin.jvm.internal.h.e(context2, "context");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        if (z9) {
            c5059h = new C5059h(context2, null);
            c5059h.i = true;
        } else {
            if (Q7.j.s0("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            C5059h c5059h2 = new C5059h(context2, "androidx.work.workdb");
            c5059h2.f40983h = new l(context2);
            c5059h = c5059h2;
        }
        c5059h.f40981f = queryExecutor;
        b bVar2 = b.f1596a;
        ArrayList arrayList = c5059h.f40978c;
        arrayList.add(bVar2);
        c5059h.a(d.f1600g);
        c5059h.a(new g(context2, 2, 3));
        c5059h.a(d.f1601h);
        c5059h.a(d.i);
        c5059h.a(new g(context2, 5, 6));
        c5059h.a(d.f1602j);
        c5059h.a(d.f1603k);
        c5059h.a(d.f1604l);
        c5059h.a(new g(context2));
        c5059h.a(new g(context2, 10, 11));
        c5059h.a(d.f1597d);
        c5059h.a(d.f1598e);
        c5059h.a(d.f1599f);
        c5059h.f40985k = false;
        c5059h.f40986l = true;
        Executor executor = c5059h.f40981f;
        if (executor == null && c5059h.f40982g == null) {
            ExecutorC4756a executorC4756a = C4757b.f39603d;
            c5059h.f40982g = executorC4756a;
            c5059h.f40981f = executorC4756a;
        } else if (executor != null && c5059h.f40982g == null) {
            c5059h.f40982g = executor;
        } else if (executor == null) {
            c5059h.f40981f = c5059h.f40982g;
        }
        HashSet hashSet = c5059h.f40990p;
        LinkedHashSet linkedHashSet = c5059h.f40989o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(Wv.f(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC5196a interfaceC5196a = c5059h.f40983h;
        InterfaceC5196a c5184b = interfaceC5196a == null ? new C5184b() : interfaceC5196a;
        if (c5059h.f40987m > 0) {
            if (c5059h.f40977b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z10 = c5059h.i;
        int i4 = c5059h.f40984j;
        if (i4 == 0) {
            throw null;
        }
        Context context3 = c5059h.f40976a;
        if (i4 != 1) {
            i = i4;
        } else {
            Object systemService = context3.getSystemService("activity");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = c5059h.f40981f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = c5059h.f40982g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C5053b c5053b = new C5053b(context3, c5059h.f40977b, c5184b, c5059h.f40988n, arrayList, z10, i, executor2, executor3, c5059h.f40985k, c5059h.f40986l, linkedHashSet, c5059h.f40979d, c5059h.f40980e);
        Package r72 = WorkDatabase.class.getPackage();
        kotlin.jvm.internal.h.b(r72);
        String fullPackage = r72.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        kotlin.jvm.internal.h.b(canonicalName);
        kotlin.jvm.internal.h.d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            kotlin.jvm.internal.h.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String concat = Q7.q.e0(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? concat : fullPackage + '.' + concat, true, WorkDatabase.class.getClassLoader());
            kotlin.jvm.internal.h.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            workDatabase.getClass();
            workDatabase.f5333c = workDatabase.e(c5053b);
            Set i6 = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = i6.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.f5337g;
                ArrayList arrayList2 = c5053b.f40961n;
                if (hasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i9 = size - 1;
                            if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            } else if (i9 < 0) {
                                break;
                            } else {
                                size = i9;
                            }
                        }
                    }
                    size = -1;
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls2, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i10 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i10 < 0) {
                                break;
                            } else {
                                size2 = i10;
                            }
                        }
                    }
                    for (AbstractC5095a abstractC5095a : workDatabase.g(linkedHashMap)) {
                        int i11 = abstractC5095a.f41078a;
                        R0 r02 = c5053b.f40952d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) r02.f39127n;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i11))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i11));
                            z6 = (map == null ? v7.q.f41222n : map).containsKey(Integer.valueOf(abstractC5095a.f41079b));
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            r02.a(abstractC5095a);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(c5053b.f40955g == 3);
                    workDatabase.f5336f = c5053b.f40953e;
                    workDatabase.f5332b = c5053b.f40956h;
                    Executor executor4 = c5053b.i;
                    kotlin.jvm.internal.h.e(executor4, "executor");
                    new ArrayDeque();
                    workDatabase.f5335e = c5053b.f40954f;
                    Map j6 = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = j6.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c5053b.f40960m;
                        if (!hasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i12 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i12 < 0) {
                                        break;
                                    } else {
                                        size3 = i12;
                                    }
                                }
                            }
                            Context applicationContext = context.getApplicationContext();
                            r rVar = new r(bVar.f1393a);
                            synchronized (r.f1431b) {
                                r.f1432c = rVar;
                            }
                            S0.i iVar = new S0.i(applicationContext, eVar);
                            this.f1649j = iVar;
                            String str = i.f1625a;
                            N0.b bVar3 = new N0.b(applicationContext, this);
                            T0.j.a(applicationContext, SystemJobService.class, true);
                            r.d().a(i.f1625a, "Created SystemJobScheduler and enabled SystemJobService");
                            List asList = Arrays.asList(bVar3, new L0.b(applicationContext, bVar, iVar, this));
                            f fVar = new f(context, bVar, eVar, workDatabase, asList);
                            Context applicationContext2 = context.getApplicationContext();
                            this.f1641a = applicationContext2;
                            this.f1642b = bVar;
                            this.f1644d = eVar;
                            this.f1643c = workDatabase;
                            this.f1645e = asList;
                            this.f1646f = fVar;
                            this.f1647g = new n4.c(14, workDatabase);
                            this.f1648h = false;
                            if (o.a(applicationContext2)) {
                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                            }
                            this.f1644d.h(new T0.e(applicationContext2, this));
                            return;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i13 = size4 - 1;
                                    if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    } else if (i13 < 0) {
                                        break;
                                    } else {
                                        size4 = i13;
                                    }
                                }
                            }
                            size4 = -1;
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.f5339j.put(cls4, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static p b(Context context) {
        p pVar;
        Object obj = f1640m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f1638k;
                    if (pVar == null) {
                        pVar = f1639l;
                    }
                }
                return pVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (pVar != null) {
            return pVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (K0.p.f1639l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        K0.p.f1639l = new K0.p(r4, r5, new b3.e((java.util.concurrent.ExecutorService) r5.f1397e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        K0.p.f1638k = K0.p.f1639l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, J0.b bVar) {
        synchronized (f1640m) {
            try {
                p pVar = f1638k;
                if (pVar != null && f1639l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void d() {
        synchronized (f1640m) {
            try {
                this.f1648h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList e9;
        WorkDatabase workDatabase = this.f1643c;
        Context context = this.f1641a;
        String str = N0.b.f1903x;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e9 = N0.b.e(context, jobScheduler)) != null && !e9.isEmpty()) {
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                N0.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        S0.q t6 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2956a;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) t6.f2965k;
        C5220i a9 = hVar.a();
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.n(a9);
            i.a(this.f1642b, workDatabase, this.f1645e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.n(a9);
            throw th;
        }
    }

    public final void f(j jVar, b3.e eVar) {
        b3.e eVar2 = this.f1644d;
        E2.x xVar = new E2.x(10);
        xVar.f884u = this;
        xVar.f885v = jVar;
        xVar.f886w = eVar;
        eVar2.h(xVar);
    }
}
