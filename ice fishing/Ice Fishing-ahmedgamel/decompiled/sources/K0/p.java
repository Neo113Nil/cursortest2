package K0;

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
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g1.C4523c;
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
import n.C4743b;
import n.ExecutorC4742a;
import t0.C4986A;
import u0.C5052b;
import u0.C5058h;
import v0.AbstractC5103a;
import x2.C5195i;
import y0.InterfaceC5201a;
import z0.C5253i;

/* loaded from: classes.dex */
public final class p extends y {

    /* renamed from: k, reason: collision with root package name */
    public static p f1529k;

    /* renamed from: l, reason: collision with root package name */
    public static p f1530l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f1531m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1532a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.b f1533b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f1534c;

    /* renamed from: d, reason: collision with root package name */
    public final Z2.e f1535d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1536e;

    /* renamed from: f, reason: collision with root package name */
    public final f f1537f;

    /* renamed from: g, reason: collision with root package name */
    public final C4523c f1538g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1539h;
    public BroadcastReceiver.PendingResult i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.i f1540j;

    static {
        s.f("WorkManagerImpl");
        f1529k = null;
        f1530l = null;
        f1531m = new Object();
    }

    public p(Context context, J0.b bVar, Z2.e eVar) {
        C5058h c5058h;
        int i;
        boolean z3;
        boolean z6 = context.getResources().getBoolean(C5275R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        T0.l queryExecutor = (T0.l) eVar.f4170u;
        kotlin.jvm.internal.h.e(context2, "context");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        if (z6) {
            c5058h = new C5058h(context2, null);
            c5058h.i = true;
        } else {
            if (Q7.j.c0("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            C5058h c5058h2 = new C5058h(context2, "androidx.work.workdb");
            c5058h2.f41021h = new l(context2);
            c5058h = c5058h2;
        }
        c5058h.f41019f = queryExecutor;
        b bVar2 = b.f1487a;
        ArrayList arrayList = c5058h.f41016c;
        arrayList.add(bVar2);
        c5058h.a(d.f1491g);
        c5058h.a(new g(context2, 2, 3));
        c5058h.a(d.f1492h);
        c5058h.a(d.i);
        c5058h.a(new g(context2, 5, 6));
        c5058h.a(d.f1493j);
        c5058h.a(d.f1494k);
        c5058h.a(d.f1495l);
        c5058h.a(new g(context2));
        c5058h.a(new g(context2, 10, 11));
        c5058h.a(d.f1488d);
        c5058h.a(d.f1489e);
        c5058h.a(d.f1490f);
        c5058h.f41023k = false;
        c5058h.f41024l = true;
        Executor executor = c5058h.f41019f;
        if (executor == null && c5058h.f41020g == null) {
            ExecutorC4742a executorC4742a = C4743b.f39445j;
            c5058h.f41020g = executorC4742a;
            c5058h.f41019f = executorC4742a;
        } else if (executor != null && c5058h.f41020g == null) {
            c5058h.f41020g = executor;
        } else if (executor == null) {
            c5058h.f41019f = c5058h.f41020g;
        }
        HashSet hashSet = c5058h.f41028p;
        LinkedHashSet linkedHashSet = c5058h.f41027o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(AbstractC4404f.e(intValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC5201a interfaceC5201a = c5058h.f41021h;
        InterfaceC5201a c5195i = interfaceC5201a == null ? new C5195i() : interfaceC5201a;
        if (c5058h.f41025m > 0) {
            if (c5058h.f41015b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z9 = c5058h.i;
        int i6 = c5058h.f41022j;
        if (i6 == 0) {
            throw null;
        }
        Context context3 = c5058h.f41014a;
        if (i6 != 1) {
            i = i6;
        } else {
            Object systemService = context3.getSystemService("activity");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = c5058h.f41019f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = c5058h.f41020g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C5052b c5052b = new C5052b(context3, c5058h.f41015b, c5195i, c5058h.f41026n, arrayList, z9, i, executor2, executor3, c5058h.f41023k, c5058h.f41024l, linkedHashSet, c5058h.f41017d, c5058h.f41018e);
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
        String concat = Q7.q.O(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls = Class.forName(fullPackage.length() == 0 ? concat : fullPackage + '.' + concat, true, WorkDatabase.class.getClassLoader());
            kotlin.jvm.internal.h.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            workDatabase.getClass();
            workDatabase.f5368c = workDatabase.e(c5052b);
            Set i9 = workDatabase.i();
            BitSet bitSet = new BitSet();
            Iterator it2 = i9.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = workDatabase.f5372g;
                ArrayList arrayList2 = c5052b.f40999n;
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
                    for (AbstractC5103a abstractC5103a : workDatabase.g(linkedHashMap)) {
                        int i12 = abstractC5103a.f41358a;
                        C4986A c4986a = c5052b.f40990d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c4986a.f40533n;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            z3 = (map == null ? v7.q.f41443n : map).containsKey(Integer.valueOf(abstractC5103a.f41359b));
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            c4986a.b(abstractC5103a);
                        }
                    }
                    workDatabase.h().setWriteAheadLoggingEnabled(c5052b.f40993g == 3);
                    workDatabase.f5371f = c5052b.f40991e;
                    workDatabase.f5367b = c5052b.f40994h;
                    Executor executor4 = c5052b.i;
                    kotlin.jvm.internal.h.e(executor4, "executor");
                    new ArrayDeque();
                    workDatabase.f5370e = c5052b.f40992f;
                    Map j6 = workDatabase.j();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = j6.entrySet().iterator();
                    while (true) {
                        boolean hasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c5052b.f40998m;
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
                            s sVar = new s(bVar.f1364a);
                            synchronized (s.f1403b) {
                                s.f1404c = sVar;
                            }
                            S0.i iVar = new S0.i(applicationContext, eVar);
                            this.f1540j = iVar;
                            String str = i.f1516a;
                            N0.b bVar3 = new N0.b(applicationContext, this);
                            T0.j.a(applicationContext, SystemJobService.class, true);
                            s.d().a(i.f1516a, "Created SystemJobScheduler and enabled SystemJobService");
                            List asList = Arrays.asList(bVar3, new L0.b(applicationContext, bVar, iVar, this));
                            f fVar = new f(context, bVar, eVar, workDatabase, asList);
                            Context applicationContext2 = context.getApplicationContext();
                            this.f1532a = applicationContext2;
                            this.f1533b = bVar;
                            this.f1535d = eVar;
                            this.f1534c = workDatabase;
                            this.f1536e = asList;
                            this.f1537f = fVar;
                            this.f1538g = new C4523c(11, workDatabase);
                            this.f1539h = false;
                            if (o.a(applicationContext2)) {
                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                            }
                            this.f1535d.i(new T0.e(applicationContext2, this));
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
                            workDatabase.f5374j.put(cls4, arrayList3.get(size4));
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
        Object obj = f1531m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f1529k;
                    if (pVar == null) {
                        pVar = f1530l;
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
    
        if (K0.p.f1530l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        K0.p.f1530l = new K0.p(r4, r5, new Z2.e((java.util.concurrent.ExecutorService) r5.f1368e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        K0.p.f1529k = K0.p.f1530l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, J0.b bVar) {
        synchronized (f1531m) {
            try {
                p pVar = f1529k;
                if (pVar != null && f1530l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void d() {
        synchronized (f1531m) {
            try {
                this.f1539h = true;
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
        WorkDatabase workDatabase = this.f1534c;
        Context context = this.f1532a;
        String str = N0.b.f1901x;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e9 = N0.b.e(context, jobScheduler)) != null && !e9.isEmpty()) {
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                N0.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        S0.q t6 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2827a;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) t6.f2836k;
        C5253i a9 = hVar.a();
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.n(a9);
            i.a(this.f1533b, workDatabase, this.f1536e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.n(a9);
            throw th;
        }
    }

    public final void f(j jVar, Z2.e eVar) {
        Z2.e eVar2 = this.f1535d;
        C2.y yVar = new C2.y(10);
        yVar.f425u = this;
        yVar.f426v = jVar;
        yVar.f427w = eVar;
        eVar2.i(yVar);
    }
}
