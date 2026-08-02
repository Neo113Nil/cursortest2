package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class seo {
    public final lm4 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public usr h;
    public boolean i;
    public TimeUnit l;
    public boolean r;
    public boolean s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public teo j = teo.a;
    public long k = -1;
    public final p97 m = new p97(2);
    public final LinkedHashSet n = new LinkedHashSet();
    public final LinkedHashSet o = new LinkedHashSet();
    public final ArrayList p = new ArrayList();
    public boolean q = true;
    public final boolean t = true;

    public seo(Context context, Class cls, String str) {
        this.a = ern.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(i5i... i5iVarArr) {
        for (i5i i5iVar : i5iVarArr) {
            Integer valueOf = Integer.valueOf(i5iVar.a);
            LinkedHashSet linkedHashSet = this.o;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(i5iVar.b));
        }
        i5i[] i5iVarArr2 = (i5i[]) Arrays.copyOf(i5iVarArr, i5iVarArr.length);
        p97 p97Var = this.m;
        p97Var.getClass();
        for (i5i i5iVar2 : i5iVarArr2) {
            p97Var.b(i5iVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x022e, code lost:
    
        defpackage.xq0.x("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ueo b() {
        String str;
        yeo yeoVar;
        vsr vsrVar;
        v97 v97Var;
        vsr vsrVar2;
        i42 i42Var;
        boolean z;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            gx0 gx0Var = hx0.c;
            this.g = gx0Var;
            this.f = gx0Var;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.o;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.n;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    xq0.o(k5r.i(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        usr usrVar = this.h;
        if (usrVar == null) {
            usrVar = new gwc(0);
        }
        long j = this.k;
        if (j > 0) {
            if (this.c == null) {
                xq0.x("Cannot create auto-closing database for an in-memory database.");
                return null;
            }
            TimeUnit timeUnit = this.l;
            if (timeUnit == null) {
                xq0.x("Required value was null.");
                return null;
            }
            usrVar = new j42(usrVar, new a42(j, timeUnit), 0);
        }
        boolean z2 = this.i;
        teo teoVar = this.j;
        teoVar.getClass();
        Context context = this.b;
        context.getClass();
        if (teoVar == teo.a) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            teoVar = (activityManager == null || activityManager.isLowRamDevice()) ? teo.b : teo.c;
        }
        Executor executor2 = this.f;
        if (executor2 == null) {
            xq0.x("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            xq0.x("Required value was null.");
            return null;
        }
        jc7 jc7Var = new jc7(context, this.c, usrVar, this.m, this.d, z2, teoVar, executor2, executor3, null, this.q, this.r, linkedHashSet2, null, null, null, this.e, this.p, this.s, null, null);
        jc7Var.v = this.t;
        Class P = leu.P(this.a);
        Package r4 = P.getPackage();
        if (r4 == null || (str = r4.getName()) == null) {
            str = "";
        }
        String canonicalName = P.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        String concat = replace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, P.getClassLoader());
            cls.getClass();
            ueo ueoVar = (ueo) cls.getDeclaredConstructor(null).newInstance(null);
            ueoVar.getClass();
            ueoVar.m = jc7Var.v;
            try {
                yeo e = ueoVar.e();
                e.getClass();
                yeoVar = e;
            } catch (uej unused) {
                yeoVar = null;
            }
            ueoVar.f = yeoVar == null ? new v97(jc7Var, new mjm(16, ueoVar), new w4i(2, ueoVar, weo.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 17)) : new v97(jc7Var, yeoVar, new w4i(2, ueoVar, weo.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 18));
            ueoVar.g = ueoVar.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set k = ueoVar.k();
            List list = jc7Var.r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = k.iterator();
            while (true) {
                int i = -1;
                if (it2.hasNext()) {
                    f9f f9fVar = (f9f) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (((lm4) f9fVar).i(list.get(size2))) {
                                zArr[size2] = true;
                                i = size2;
                                break;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    if (i < 0) {
                        tiu.g(((lm4) f9fVar).f(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(f9fVar, list.get(i));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i3 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size3 = i3;
                        }
                    }
                    for (i5i i5iVar : ueoVar.c(linkedHashMap)) {
                        int i4 = i5iVar.a;
                        int i5 = i5iVar.b;
                        p97 p97Var = jc7Var.d;
                        LinkedHashMap linkedHashMap2 = p97Var.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                            if (map == null) {
                                map = e5b.a;
                                map.getClass();
                            }
                            z = map.containsKey(Integer.valueOf(i5));
                        } else {
                            z = false;
                        }
                        if (!z) {
                            p97Var.b(i5iVar);
                        }
                    }
                    LinkedHashMap m = ueoVar.m();
                    List list2 = jc7Var.q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : m.entrySet()) {
                        f9f f9fVar2 = (f9f) entry.getKey();
                        for (f9f f9fVar3 : (List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i6 = size4 - 1;
                                    if (((lm4) f9fVar3).i(list2.get(size4))) {
                                        zArr2[size4] = true;
                                        break;
                                    }
                                    if (i6 < 0) {
                                        break;
                                    }
                                    size4 = i6;
                                }
                            }
                            size4 = -1;
                            if (size4 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((lm4) f9fVar3).f() + ") for " + ((lm4) f9fVar2).f() + " is missing in the database configuration.").toString());
                            }
                            Object obj = list2.get(size4);
                            f9fVar3.getClass();
                            obj.getClass();
                            ueoVar.l.put(f9fVar3, obj);
                        }
                    }
                    int size5 = list2.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i7 = size5 - 1;
                            if (!zArr2[size5]) {
                                xq0.x(dfi.g("Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", list2.get(size5)));
                                return null;
                            }
                            if (i7 < 0) {
                                break;
                            }
                            size5 = i7;
                        }
                    }
                    ueoVar.d = jc7Var.h;
                    ueoVar.e = new qhp(jc7Var.i, 1);
                    Executor executor4 = ueoVar.d;
                    if (executor4 == null) {
                        Intrinsics.j("internalQueryExecutor");
                        throw null;
                    }
                    tf6 e2 = gld.e(u2x.E(executor4).plus(a4g.n()));
                    ueoVar.b = e2;
                    CoroutineContext coroutineContext = e2.a;
                    qhp qhpVar = ueoVar.e;
                    if (qhpVar == null) {
                        Intrinsics.j("internalTransactionExecutor");
                        throw null;
                    }
                    ueoVar.c = coroutineContext.plus(u2x.E(qhpVar));
                    ueoVar.i = jc7Var.f;
                    v97 v97Var2 = ueoVar.f;
                    if (v97Var2 == null) {
                        Intrinsics.j("connectionManager");
                        throw null;
                    }
                    vsr vsrVar3 = (vsr) v97Var2.h;
                    if (vsrVar3 != null) {
                        vsrVar = vsrVar3;
                        while (!(vsrVar instanceof ijm)) {
                            if (vsrVar instanceof ew7) {
                                vsrVar = ((ew7) vsrVar).a();
                            }
                        }
                        v97Var = ueoVar.f;
                        if (v97Var != null) {
                            Intrinsics.j("connectionManager");
                            throw null;
                        }
                        vsr vsrVar4 = (vsr) v97Var.h;
                        if (vsrVar4 != null) {
                            vsrVar2 = vsrVar4;
                            while (!(vsrVar2 instanceof i42)) {
                                if (vsrVar2 instanceof ew7) {
                                    vsrVar2 = ((ew7) vsrVar2).a();
                                }
                            }
                            i42Var = (i42) vsrVar2;
                            if (i42Var != null) {
                                a42 a42Var = i42Var.b;
                                ueoVar.j = a42Var;
                                tf6 tf6Var = ueoVar.b;
                                if (tf6Var == null) {
                                    Intrinsics.j("coroutineScope");
                                    throw null;
                                }
                                a42Var.e = tf6Var;
                                iye i8 = ueoVar.i();
                                i8.e = a42Var;
                                a42Var.f = new v2d(0, i8, iye.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0, 13);
                            }
                            return ueoVar;
                        }
                        vsrVar2 = null;
                        i42Var = (i42) vsrVar2;
                        if (i42Var != null) {
                        }
                        return ueoVar;
                    }
                    vsrVar = null;
                    v97Var = ueoVar.f;
                    if (v97Var != null) {
                    }
                }
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Cannot find implementation for " + P.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e3);
        } catch (IllegalAccessException e4) {
            kac.k(tlm.i(P, new StringBuilder("Cannot access the constructor ")), e4);
            return null;
        } catch (InstantiationException e5) {
            kac.k(tlm.i(P, new StringBuilder("Failed to create an instance of ")), e5);
            return null;
        }
    }
}
