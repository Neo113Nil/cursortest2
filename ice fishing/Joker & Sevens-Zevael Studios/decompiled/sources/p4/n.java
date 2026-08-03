package p4;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import bc.w;
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
import o4.u;
import org.fortheloss.st.R;
import x4.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends u {

    /* renamed from: k, reason: collision with root package name */
    public static n f5490k;

    /* renamed from: l, reason: collision with root package name */
    public static n f5491l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f5492m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5493a;

    /* renamed from: b, reason: collision with root package name */
    public final o4.b f5494b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase f5495c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.c f5496d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5497e;

    /* renamed from: f, reason: collision with root package name */
    public final e f5498f;

    /* renamed from: g, reason: collision with root package name */
    public final y4.f f5499g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5500h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f5501i;

    /* renamed from: j, reason: collision with root package name */
    public final x4.n f5502j;

    static {
        o4.o.f("WorkManagerImpl");
        f5490k = null;
        f5491l = null;
        f5492m = new Object();
    }

    public n(Context context, o4.b bVar, a5.c cVar) {
        b4.k kVar;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        y4.l lVar = (y4.l) cVar.f262h;
        pc.j.e(applicationContext, "context");
        pc.j.e(lVar, "queryExecutor");
        int i12 = 10;
        if (z12) {
            kVar = new b4.k(applicationContext, null);
            kVar.f989i = true;
        } else {
            if (xc.h.t("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            b4.k kVar2 = new b4.k(applicationContext, "androidx.work.workdb");
            kVar2.f988h = new c6.f(i12, applicationContext);
            kVar = kVar2;
        }
        ArrayList arrayList = kVar.f983c;
        kVar.f986f = lVar;
        arrayList.add(b.f5451a);
        kVar.a(d.f5455g);
        kVar.a(new f(applicationContext, 2, 3));
        kVar.a(d.f5456h);
        kVar.a(d.f5457i);
        kVar.a(new f(applicationContext, 5, 6));
        kVar.a(d.f5458j);
        kVar.a(d.f5459k);
        kVar.a(d.f5460l);
        kVar.a(new f(applicationContext));
        kVar.a(new f(applicationContext, 10, 11));
        kVar.a(d.f5452d);
        kVar.a(d.f5453e);
        kVar.a(d.f5454f);
        kVar.f991k = false;
        kVar.f992l = true;
        LinkedHashSet linkedHashSet = kVar.f995o;
        Executor executor = kVar.f986f;
        if (executor == null && kVar.f987g == null) {
            a4.e eVar = n.a.f4972f;
            kVar.f987g = eVar;
            kVar.f986f = eVar;
        } else if (executor != null && kVar.f987g == null) {
            kVar.f987g = executor;
        } else if (executor == null) {
            kVar.f986f = kVar.f987g;
        }
        HashSet hashSet = kVar.f996p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(a4.d.g("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        h4.c cVar2 = kVar.f988h;
        h4.c iVar = cVar2 == null ? new p6.i() : cVar2;
        if (kVar.f993m > 0) {
            if (kVar.f982b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        Context context2 = kVar.f981a;
        String str = kVar.f982b;
        b4.l lVar2 = kVar.f994n;
        boolean z13 = kVar.f989i;
        int i13 = kVar.f990j;
        if (i13 == 0) {
            throw null;
        }
        if (i13 == 1) {
            Object systemService = context2.getSystemService("activity");
            pc.j.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            i13 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = kVar.f986f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = kVar.f987g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z14 = kVar.f991k;
        boolean z15 = kVar.f992l;
        ArrayList arrayList2 = kVar.f984d;
        ArrayList arrayList3 = kVar.f985e;
        boolean z16 = false;
        b4.b bVar2 = new b4.b(context2, str, iVar, lVar2, arrayList, z13, i13, executor2, executor3, z14, z15, linkedHashSet, arrayList2, arrayList3);
        Package r11 = WorkDatabase.class.getPackage();
        pc.j.b(r11);
        String name = r11.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        pc.j.b(canonicalName);
        pc.j.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            pc.j.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String replace = canonicalName.replace('.', '_');
        pc.j.d(replace, "replace(...)");
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? concat : name + '.' + concat, true, WorkDatabase.class.getClassLoader());
            pc.j.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            b4.h hVar = workDatabase.f757d;
            LinkedHashMap linkedHashMap = workDatabase.f760g;
            workDatabase.f756c = workDatabase.e(bVar2);
            Set<Class> i14 = workDatabase.i();
            BitSet bitSet = new BitSet();
            for (Class cls2 : i14) {
                int size = arrayList3.size() - 1;
                if (size >= 0) {
                    i10 = -1;
                    while (true) {
                        i11 = size;
                        size = i11 - 1;
                        z11 = z16;
                        if (cls2.isAssignableFrom(arrayList3.get(i11).getClass())) {
                            bitSet.set(i11);
                            break;
                        } else if (size < 0) {
                            break;
                        } else {
                            z16 = z11;
                        }
                    }
                } else {
                    z11 = z16;
                    i10 = -1;
                }
                i11 = i10;
                if (i11 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls2, arrayList3.get(i11));
                z16 = z11;
            }
            boolean z17 = z16;
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i15 = size2 - 1;
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    if (i15 < 0) {
                        break;
                    } else {
                        size2 = i15;
                    }
                }
            }
            for (c4.a aVar : workDatabase.g(linkedHashMap)) {
                int i16 = aVar.f1223a;
                int i17 = aVar.f1224b;
                LinkedHashMap linkedHashMap2 = lVar2.f997a;
                if (linkedHashMap2.containsKey(Integer.valueOf(i16))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i16));
                    z10 = (map == null ? w.f1068g : map).containsKey(Integer.valueOf(i17));
                } else {
                    z10 = z17 ? 1 : 0;
                }
                if (!z10) {
                    lVar2.a(aVar);
                }
            }
            workDatabase.h().setWriteAheadLoggingEnabled(bVar2.f953g == 3 ? true : z17 ? 1 : 0);
            workDatabase.f759f = bVar2.f951e;
            workDatabase.f755b = bVar2.f954h;
            pc.j.e(bVar2.f955i, "executor");
            new ArrayDeque();
            workDatabase.f758e = bVar2.f952f;
            Map j3 = workDatabase.j();
            BitSet bitSet2 = new BitSet();
            for (Map.Entry entry : j3.entrySet()) {
                Class cls3 = (Class) entry.getKey();
                for (Class cls4 : (List) entry.getValue()) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i18 = size3 - 1;
                            if (cls4.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else if (i18 < 0) {
                                break;
                            } else {
                                size3 = i18;
                            }
                        }
                    }
                    size3 = -1;
                    if (!(size3 >= 0 ? true : z17 ? 1 : 0)) {
                        throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                    }
                    workDatabase.f763j.put(cls4, arrayList2.get(size3));
                }
            }
            int size4 = arrayList2.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i19 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i19 < 0) {
                        break;
                    } else {
                        size4 = i19;
                    }
                }
            }
            Context applicationContext2 = context.getApplicationContext();
            o4.o oVar = new o4.o(bVar.f5190f);
            synchronized (o4.o.f5216b) {
                o4.o.f5217c = oVar;
            }
            x4.n nVar = new x4.n(applicationContext2, cVar);
            this.f5502j = nVar;
            String str2 = h.f5477a;
            s4.b bVar3 = new s4.b(applicationContext2, this);
            y4.j.a(applicationContext2, SystemJobService.class, true);
            o4.o.d().a(h.f5477a, "Created SystemJobScheduler and enabled SystemJobService");
            q4.b bVar4 = new q4.b(applicationContext2, bVar, nVar, this);
            g[] gVarArr = new g[2];
            gVarArr[z17 ? 1 : 0] = bVar3;
            gVarArr[1] = bVar4;
            List asList = Arrays.asList(gVarArr);
            e eVar2 = new e(context, bVar, cVar, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f5493a = applicationContext3;
            this.f5494b = bVar;
            this.f5496d = cVar;
            this.f5495c = workDatabase;
            this.f5497e = asList;
            this.f5498f = eVar2;
            this.f5499g = new y4.f(workDatabase, 1);
            this.f5500h = z17;
            if (m.a(applicationContext3)) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f5496d.a(new y4.d(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static n a(Context context) {
        n nVar;
        Object obj = f5492m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    nVar = f5490k;
                    if (nVar == null) {
                        nVar = f5491l;
                    }
                }
                return nVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (nVar != null) {
            return nVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r6 = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (p4.n.f5491l != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r3 = r7.f5186b;
        r2 = new a5.c();
        r2.f261g = new android.os.Handler(android.os.Looper.getMainLooper());
        r2.f263i = new a5.b(0, r2);
        r2.f262h = new y4.l(r3);
        p4.n.f5491l = new p4.n(r6, r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        p4.n.f5490k = p4.n.f5491l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, o4.b bVar) {
        synchronized (f5492m) {
            try {
                n nVar = f5490k;
                if (nVar != null && f5491l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public final void c() {
        synchronized (f5492m) {
            try {
                this.f5500h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f5501i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f5501i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList d10;
        String str = s4.b.f6446k;
        Context context = this.f5493a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d10 = s4.b.d(context, jobScheduler)) != null && !d10.isEmpty()) {
            int size = d10.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = d10.get(i10);
                i10++;
                s4.b.b(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f5495c;
        q t3 = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t3.f8342a;
        workDatabase_Impl.b();
        x4.h hVar = (x4.h) t3.f8352k;
        i4.i a6 = hVar.a();
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.d(a6);
            h.a(this.f5494b, workDatabase, this.f5497e);
        } catch (Throwable th) {
            workDatabase_Impl.k();
            hVar.d(a6);
            throw th;
        }
    }

    public final void e(i iVar, a5.c cVar) {
        e3.n nVar = new e3.n(3);
        nVar.f2101h = this;
        nVar.f2102i = iVar;
        nVar.f2103j = cVar;
        this.f5496d.a(nVar);
    }
}
