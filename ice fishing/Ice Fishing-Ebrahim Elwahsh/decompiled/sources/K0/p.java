package K0;

import B2.z;
import J0.s;
import J0.y;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;
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
import n.C4798b;
import n.ExecutorC4797a;
import u0.C5091b;
import u0.C5097h;
import v0.AbstractC5116a;
import y0.InterfaceC5220a;
import z0.C5266i;

/* loaded from: classes.dex */
public final class p extends y {

    /* renamed from: k, reason: collision with root package name */
    public static p f1527k;

    /* renamed from: l, reason: collision with root package name */
    public static p f1528l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1529m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1530a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.b f1531b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f1532c;

    /* renamed from: d, reason: collision with root package name */
    public final Y2.e f1533d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1534e;

    /* renamed from: f, reason: collision with root package name */
    public final f f1535f;

    /* renamed from: g, reason: collision with root package name */
    public final I0.j f1536g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1537h;
    public BroadcastReceiver.PendingResult i;

    /* renamed from: j, reason: collision with root package name */
    public final f4.p f1538j;

    static {
        s.f("WorkManagerImpl");
        f1527k = null;
        f1528l = null;
        f1529m = new Object();
    }

    public p(Context context, J0.b bVar, Y2.e eVar) {
        C5097h c5097h;
        int i;
        boolean z8;
        boolean z9 = context.getResources().getBoolean(C5284R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        T0.l queryExecutor = (T0.l) eVar.f3963u;
        kotlin.jvm.internal.h.e(context2, "context");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        if (z9) {
            c5097h = new C5097h(context2, null);
            c5097h.i = true;
        } else {
            if (M7.j.T("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            C5097h c5097h2 = new C5097h(context2, "androidx.work.workdb");
            c5097h2.f41035h = new l(context2);
            c5097h = c5097h2;
        }
        c5097h.f41033f = queryExecutor;
        b bVar2 = b.f1484a;
        ArrayList arrayList = c5097h.f41030c;
        arrayList.add(bVar2);
        c5097h.a(d.f1488g);
        c5097h.a(new g(context2, 2, 3));
        c5097h.a(d.f1489h);
        c5097h.a(d.i);
        c5097h.a(new g(context2, 5, 6));
        c5097h.a(d.f1490j);
        c5097h.a(d.f1491k);
        c5097h.a(d.f1492l);
        c5097h.a(new g(context2));
        c5097h.a(new g(context2, 10, 11));
        c5097h.a(d.f1485d);
        c5097h.a(d.f1486e);
        c5097h.a(d.f1487f);
        c5097h.f41037k = false;
        c5097h.f41038l = true;
        Executor executor = c5097h.f41033f;
        if (executor == null && c5097h.f41034g == null) {
            ExecutorC4797a executorC4797a = C4798b.f39613v;
            c5097h.f41034g = executorC4797a;
            c5097h.f41033f = executorC4797a;
        } else if (executor != null && c5097h.f41034g == null) {
            c5097h.f41034g = executor;
        } else if (executor == null) {
            c5097h.f41033f = c5097h.f41034g;
        }
        HashSet hashSet = c5097h.f41042p;
        LinkedHashSet linkedHashSet = c5097h.f41041o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(CL.i(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC5220a interfaceC5220a = c5097h.f41035h;
        InterfaceC5220a eVar2 = interfaceC5220a == null ? new x2.e() : interfaceC5220a;
        if (c5097h.f41039m > 0) {
            if (c5097h.f41029b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z10 = c5097h.i;
        int i4 = c5097h.f41036j;
        if (i4 == 0) {
            throw null;
        }
        Context context3 = c5097h.f41028a;
        if (i4 != 1) {
            i = i4;
        } else {
            Object systemService = context3.getSystemService("activity");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = c5097h.f41033f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = c5097h.f41034g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C5091b c5091b = new C5091b(context3, c5097h.f41029b, eVar2, c5097h.f41040n, arrayList, z10, i, executor2, executor3, c5097h.f41037k, c5097h.f41038l, linkedHashSet, c5097h.f41031d, c5097h.f41032e);
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
        String concat = M7.q.F(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? concat : fullPackage + '.' + concat, true, WorkDatabase.class.getClassLoader());
            kotlin.jvm.internal.h.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            workDatabase.getClass();
            workDatabase.f5480c = workDatabase.e(c5091b);
            Set i9 = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = i9.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.f5484g;
                ArrayList arrayList2 = c5091b.f41013n;
                if (hasNext) {
                    Class cls2 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            if (cls2.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            } else if (i10 < 0) {
                                break;
                            } else {
                                size = i10;
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
                            int i11 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i11 < 0) {
                                break;
                            } else {
                                size2 = i11;
                            }
                        }
                    }
                    for (AbstractC5116a abstractC5116a : workDatabase.g(linkedHashMap)) {
                        int i12 = abstractC5116a.f41328a;
                        h8.d dVar = c5091b.f41004d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.f38261u;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            z8 = (map == null ? r7.q.f40359n : map).containsKey(Integer.valueOf(abstractC5116a.f41329b));
                        } else {
                            z8 = false;
                        }
                        if (!z8) {
                            dVar.a(abstractC5116a);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(c5091b.f41007g == 3);
                    workDatabase.f5483f = c5091b.f41005e;
                    workDatabase.f5479b = c5091b.f41008h;
                    Executor executor4 = c5091b.i;
                    kotlin.jvm.internal.h.e(executor4, "executor");
                    new ArrayDeque();
                    workDatabase.f5482e = c5091b.f41006f;
                    Map j9 = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = j9.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c5091b.f41012m;
                        if (!hasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i13 < 0) {
                                        break;
                                    } else {
                                        size3 = i13;
                                    }
                                }
                            }
                            Context applicationContext = context.getApplicationContext();
                            s sVar = new s(bVar.f1289a);
                            synchronized (s.f1328b) {
                                s.f1329c = sVar;
                            }
                            f4.p pVar = new f4.p(applicationContext, eVar);
                            this.f1538j = pVar;
                            String str = i.f1513a;
                            N0.c cVar = new N0.c(applicationContext, this);
                            T0.j.a(applicationContext, SystemJobService.class, true);
                            s.d().a(i.f1513a, "Created SystemJobScheduler and enabled SystemJobService");
                            List asList = Arrays.asList(cVar, new L0.b(applicationContext, bVar, pVar, this));
                            f fVar = new f(context, bVar, eVar, workDatabase, asList);
                            Context applicationContext2 = context.getApplicationContext();
                            this.f1530a = applicationContext2;
                            this.f1531b = bVar;
                            this.f1533d = eVar;
                            this.f1532c = workDatabase;
                            this.f1534e = asList;
                            this.f1535f = fVar;
                            this.f1536g = new I0.j(13, workDatabase);
                            this.f1537h = false;
                            if (o.a(applicationContext2)) {
                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                            }
                            this.f1533d.i(new T0.e(applicationContext2, this));
                            return;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls3 = (Class) entry.getKey();
                        for (Class cls4 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i14 = size4 - 1;
                                    if (cls4.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    } else if (i14 < 0) {
                                        break;
                                    } else {
                                        size4 = i14;
                                    }
                                }
                            }
                            size4 = -1;
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            workDatabase.f5486j.put(cls4, arrayList3.get(size4));
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
        Object obj = f1529m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f1527k;
                    if (pVar == null) {
                        pVar = f1528l;
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
    
        if (K0.p.f1528l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        K0.p.f1528l = new K0.p(r4, r5, new Y2.e((java.util.concurrent.ExecutorService) r5.f1293e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        K0.p.f1527k = K0.p.f1528l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, J0.b bVar) {
        synchronized (f1529m) {
            try {
                p pVar = f1527k;
                if (pVar != null && f1528l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void d() {
        synchronized (f1529m) {
            try {
                this.f1537h = true;
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
        ArrayList e6;
        WorkDatabase workDatabase = this.f1532c;
        Context context = this.f1530a;
        String str = N0.c.f1945x;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e6 = N0.c.e(context, jobScheduler)) != null && !e6.isEmpty()) {
            Iterator it = e6.iterator();
            while (it.hasNext()) {
                N0.c.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        S0.q t9 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t9.f2939a;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) t9.f2948k;
        C5266i a9 = hVar.a();
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.n(a9);
            i.a(this.f1531b, workDatabase, this.f1534e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.n(a9);
            throw th;
        }
    }

    public final void f(j jVar, Y2.e eVar) {
        Y2.e eVar2 = this.f1533d;
        z zVar = new z(8);
        zVar.f321u = this;
        zVar.f322v = jVar;
        zVar.f323w = eVar;
        eVar2.i(zVar);
    }
}
