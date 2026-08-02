package defpackage;

import android.content.Context;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dtt {
    public final Context a;
    public final wst b;
    public final xxq c;
    public final boolean d;
    public final n3m e;
    public final mmo f;
    public final x0q g;

    public dtt(Context context, wst wstVar, xxq xxqVar) {
        xxqVar.getClass();
        this.a = context;
        this.b = wstVar;
        this.c = xxqVar;
        this.d = !xxqVar.a();
        yiq yiqVar = new yiq();
        this.e = new n3m(15);
        mmo mmoVar = new mmo(yiqVar.z(), new hjp(10, this));
        this.f = mmoVar;
        this.g = y0q.b(0, 0, null, 7);
        pjc X = zsd.X((x0q) mmoVar.d, 5000L);
        mm6 mm6Var = (mm6) mmoVar.c;
        ox6.B(X, mm6Var, new ust(mmoVar, 0));
        ox6.B(zsd.X((x0q) mmoVar.e, 1000L), mm6Var, new ust(mmoVar, 1));
        x97.y(mm6Var, null, null, new zts(mmoVar, null, 11), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004f, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(dtt dttVar, cg6 cg6Var) {
        xst xstVar;
        int i;
        Map map;
        Map map2;
        int i2;
        Iterator it;
        if (cg6Var instanceof xst) {
            xstVar = (xst) cg6Var;
            int i3 = xstVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xstVar.n = i3 - Integer.MIN_VALUE;
                Object obj = xstVar.l;
                nm6 nm6Var = nm6.a;
                i = xstVar.n;
                map = null;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    wst wstVar = dttVar.b;
                    xxq xxqVar = dttVar.c;
                    xstVar.n = 1;
                    obj = x97.V(dm6.b, new npt((Object) wstVar, (Object) xxqVar, (Continuation) (objArr == true ? 1 : 0), 2), xstVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = xstVar.k;
                        it = xstVar.j;
                        qgg.h0(obj);
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            x0q x0qVar = dttVar.g;
                            Pair pair = new Pair(str, str2);
                            xstVar.j = it;
                            xstVar.k = i2;
                            xstVar.n = 2;
                            if (x0qVar.emit(pair, xstVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                map2 = (Map) obj;
                if (map2 != null) {
                    n3m n3mVar = dttVar.e;
                    HashMap hashMap = (HashMap) n3mVar.e;
                    ((pv9) n3mVar.c).q();
                    ReentrantLock reentrantLock = (ReentrantLock) n3mVar.b;
                    reentrantLock.lock();
                    try {
                        hashMap.clear();
                        hashMap.putAll(map2);
                        reentrantLock.unlock();
                        map = map2;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                ((x0q) dttVar.f.e).a(Unit.a);
                if (map != null) {
                    i2 = 0;
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        xstVar = new xst(dttVar, cg6Var);
        Object obj2 = xstVar.l;
        nm6 nm6Var2 = nm6.a;
        i = xstVar.n;
        map = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        map2 = (Map) obj2;
        if (map2 != null) {
        }
        ((x0q) dttVar.f.e).a(Unit.a);
        if (map != null) {
        }
        return Unit.a;
    }

    public static final qr3 b(dtt dttVar) {
        File filesDir = dttVar.a.getFilesDir();
        filesDir.getClass();
        return new qr3(new File(new File(new File(filesDir, "accountSettings"), dttVar.c.a), "local.txt"));
    }

    public static final qr3 c(dtt dttVar) {
        File filesDir = dttVar.a.getFilesDir();
        filesDir.getClass();
        return new qr3(new File(new File(new File(filesDir, "accountSettings"), dttVar.c.a), "pending.txt"));
    }

    public static final qr3 d(dtt dttVar) {
        File filesDir = dttVar.a.getFilesDir();
        filesDir.getClass();
        return new qr3(new File(new File(new File(filesDir, "accountSettings"), dttVar.c.a), "remote.txt"));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(dtt dttVar, cg6 cg6Var) {
        ctt cttVar;
        Object obj;
        int i;
        final n3m n3mVar = dttVar.e;
        if (cg6Var instanceof ctt) {
            cttVar = (ctt) cg6Var;
            int i2 = cttVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cttVar.l = i2 - Integer.MIN_VALUE;
                obj = cttVar.j;
                nm6 nm6Var = nm6.a;
                i = cttVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    ((pv9) n3mVar.c).q();
                    ReentrantLock reentrantLock = (ReentrantLock) n3mVar.b;
                    reentrantLock.lock();
                    try {
                        Set entrySet = ((HashMap) n3mVar.d).entrySet();
                        entrySet.getClass();
                        final int i3 = 0;
                        final int i4 = 1;
                        lcc lccVar = new lcc(new lcc(new wz0(1, entrySet), true, new Function1() { // from class: htt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Map.Entry entry = (Map.Entry) obj2;
                                switch (i3) {
                                    case 0:
                                        entry.getClass();
                                        return Boolean.valueOf(((HashMap) n3mVar.f).containsKey(entry.getKey()));
                                    default:
                                        entry.getClass();
                                        Object value = entry.getValue();
                                        n3m n3mVar2 = n3mVar;
                                        return Boolean.valueOf(!Intrinsics.d(value, ((HashMap) n3mVar2.e).get(entry.getKey())) || Intrinsics.d(((HashMap) n3mVar2.f).get(entry.getKey()), "force_pending"));
                                }
                            }
                        }), true, new Function1() { // from class: htt
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Map.Entry entry = (Map.Entry) obj2;
                                switch (i4) {
                                    case 0:
                                        entry.getClass();
                                        return Boolean.valueOf(((HashMap) n3mVar.f).containsKey(entry.getKey()));
                                    default:
                                        entry.getClass();
                                        Object value = entry.getValue();
                                        n3m n3mVar2 = n3mVar;
                                        return Boolean.valueOf(!Intrinsics.d(value, ((HashMap) n3mVar2.e).get(entry.getKey())) || Intrinsics.d(((HashMap) n3mVar2.f).get(entry.getKey()), "force_pending"));
                                }
                            }
                        });
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : lccVar) {
                            Map.Entry entry = (Map.Entry) obj2;
                            entry.getClass();
                            ((HashMap) n3mVar.f).put(entry.getKey(), "syncing");
                            Map.Entry entry2 = (Map.Entry) obj2;
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                        reentrantLock.unlock();
                        if (!linkedHashMap.isEmpty()) {
                            wst wstVar = dttVar.b;
                            xxq xxqVar = dttVar.c;
                            cttVar.l = 1;
                            obj = x97.V(dm6.b, new h0t(wstVar, xxqVar, linkedHashMap, continuation, 7), cttVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        }
                        return Boolean.TRUE;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                ((pv9) n3mVar.c).q();
                ReentrantLock reentrantLock2 = (ReentrantLock) n3mVar.b;
                reentrantLock2.lock();
                try {
                    Set entrySet2 = ((HashMap) n3mVar.f).entrySet();
                    entrySet2.getClass();
                    Iterator it = entrySet2.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it.next();
                        entry3.getClass();
                        Object key = entry3.getKey();
                        key.getClass();
                        String str = (String) key;
                        Object value = entry3.getValue();
                        value.getClass();
                        String str2 = (String) value;
                        if (str2.hashCode() == -1742490777 && str2.equals("syncing")) {
                            it.remove();
                            String str3 = (String) ((HashMap) n3mVar.d).get(str);
                            if (str3 != null) {
                                ((HashMap) n3mVar.e).put(str, str3);
                            } else {
                                Assertions.throwOrSkip$default(new FailedAssertionException("Local value must exist at this point"), null, 2, null);
                            }
                        }
                    }
                    reentrantLock2.unlock();
                    return Boolean.TRUE;
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            }
        }
        cttVar = new ctt(dttVar, cg6Var);
        obj = cttVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cttVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final Object f(tst tstVar) {
        tstVar.getClass();
        String str = tstVar.a;
        boolean z = tstVar.d;
        n3m n3mVar = this.e;
        n3mVar.getClass();
        ((pv9) n3mVar.c).q();
        ReentrantLock reentrantLock = (ReentrantLock) n3mVar.b;
        reentrantLock.lock();
        try {
            String str2 = (String) ((HashMap) n3mVar.d).get(str);
            String str3 = (String) ((HashMap) n3mVar.e).get(str);
            if (!z || str2 == null) {
                if (!((HashMap) n3mVar.f).containsKey(str) && str3 != null) {
                    str2 = str3;
                }
            }
            reentrantLock.unlock();
            Object b = tstVar.b(str2);
            if (b == null) {
                b = tstVar.b;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            return b;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final mpq g(tst tstVar) {
        tstVar.getClass();
        return new mpq(16, new mpq(15, this.g, tstVar), tstVar);
    }

    public final void h(tst tstVar, boolean z, Boolean bool) {
        tstVar.getClass();
        String a = tstVar.a(bool);
        String str = tstVar.a;
        boolean z2 = tstVar.c;
        n3m n3mVar = this.e;
        HashMap hashMap = (HashMap) n3mVar.d;
        HashMap hashMap2 = (HashMap) n3mVar.f;
        a.getClass();
        ((pv9) n3mVar.c).q();
        ReentrantLock reentrantLock = (ReentrantLock) n3mVar.b;
        reentrantLock.lock();
        try {
            if (!Intrinsics.d(hashMap.get(str), a) || z) {
                hashMap.put(str, a);
                if (!z2) {
                    hashMap2.remove(str);
                } else if (z) {
                    hashMap2.put(str, "force_pending");
                } else if (Intrinsics.d(((HashMap) n3mVar.e).get(str), a)) {
                    hashMap2.remove(str);
                } else {
                    hashMap2.put(str, "pending");
                }
            }
            reentrantLock.unlock();
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
            mmo mmoVar = this.f;
            mmoVar.getClass();
            x97.y((mm6) mmoVar.c, null, null, new h0t(mmoVar, str, a, null, 6), 3);
            x0q x0qVar = (x0q) mmoVar.e;
            Unit unit = Unit.a;
            x0qVar.a(unit);
            ((x0q) mmoVar.d).a(unit);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
