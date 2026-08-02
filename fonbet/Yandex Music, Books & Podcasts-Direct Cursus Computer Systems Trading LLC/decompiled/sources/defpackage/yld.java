package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yld {
    public static final /* synthetic */ int F = 0;
    public fqh A;
    public int B;
    public vx6 C;
    public osh D;
    public final oxa E;
    public final d18 c;
    public irh d;
    public zqh e;
    public h3x f;
    public grh g;
    public final Context h;
    public final bh3 n;
    public final n7b o;
    public final boolean p;
    public final boolean q;
    public kph r;
    public final xtk s;
    public final lrh t;
    public mrh u;
    public irh v;
    public irh w;
    public irh x;
    public yqh y;
    public fqh z;
    public final vld a = new vld(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yld(Context context) {
        boolean z;
        arh arhVar;
        d18 d18Var;
        bh3 bh3Var = new bh3();
        bh3Var.d = 0;
        bh3Var.e = 3;
        this.n = bh3Var;
        this.o = new n7b(this);
        this.E = new oxa(6, this);
        this.h = context;
        this.p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = swh.c;
            Intent intent = new Intent(context, (Class<?>) swh.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
                this.q = z;
                int i3 = g0s.b;
                Intent intent2 = new Intent(context, (Class<?>) g0s.class);
                intent2.setPackage(context.getPackageName());
                context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
                this.r = (i >= 30 || !z) ? null : new kph(context, new awc(this));
                xtk xtkVar = new xtk(context, this);
                this.s = xtkVar;
                this.t = new lrh(new sr7(19, this));
                a(xtkVar, true);
                arhVar = this.r;
                if (arhVar != null) {
                    a(arhVar, true);
                }
                d18Var = new d18(context, this);
                this.c = d18Var;
                Handler handler = (Handler) d18Var.d;
                if (d18Var.a) {
                    d18Var.a = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    ((Context) d18Var.b).registerReceiver((l83) d18Var.g, intentFilter, null, handler);
                    handler.post((dsd) d18Var.h);
                    return;
                }
                return;
            }
        }
        z = false;
        this.q = z;
        int i32 = g0s.b;
        Intent intent22 = new Intent(context, (Class<?>) g0s.class);
        intent22.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent22, 0).size();
        this.r = (i >= 30 || !z) ? null : new kph(context, new awc(this));
        xtk xtkVar2 = new xtk(context, this);
        this.s = xtkVar2;
        this.t = new lrh(new sr7(19, this));
        a(xtkVar2, true);
        arhVar = this.r;
        if (arhVar != null) {
        }
        d18Var = new d18(context, this);
        this.c = d18Var;
        Handler handler2 = (Handler) d18Var.d;
        if (d18Var.a) {
        }
    }

    public final void a(arh arhVar, boolean z) {
        if (d(arhVar) == null) {
            hrh hrhVar = new hrh(arhVar, z);
            this.l.add(hrhVar);
            this.a.b(513, hrhVar);
            m(hrhVar, arhVar.g);
            krh.b();
            arhVar.d = this.o;
            arhVar.h(this.z);
        }
    }

    public final String b(hrh hrhVar, String str) {
        String flattenToShortString = ((ComponentName) hrhVar.d.b).flattenToShortString();
        boolean z = hrhVar.c;
        String o = z ? str : ouj.o(flattenToShortString, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((irh) arrayList.get(i)).c.equals(o)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", hrg.s("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = o + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((irh) arrayList.get(i3)).c.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        hashMap.put(new z4k(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new z4k(flattenToShortString, str), o);
        return o;
    }

    public final irh c() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            irh irhVar = (irh) it.next();
            if (irhVar != this.v && irhVar.c() == this.s && irhVar.m("android.media.intent.category.LIVE_AUDIO") && !irhVar.m("android.media.intent.category.LIVE_VIDEO") && irhVar.f()) {
                return irhVar;
            }
        }
        return this.v;
    }

    public final hrh d(arh arhVar) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            hrh hrhVar = (hrh) it.next();
            if (hrhVar.a == arhVar) {
                return hrhVar;
            }
        }
        return null;
    }

    public final irh e() {
        irh irhVar = this.d;
        if (irhVar != null) {
            return irhVar;
        }
        xq0.q("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (!this.q) {
            return false;
        }
        mrh mrhVar = this.u;
        return mrhVar == null || mrhVar.a;
    }

    public final void g() {
        if (this.d.e()) {
            List<irh> unmodifiableList = Collections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((irh) it.next()).c);
            }
            HashMap hashMap = this.b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    zqh zqhVar = (zqh) entry.getValue();
                    zqhVar.h(0);
                    zqhVar.d();
                    it2.remove();
                }
            }
            for (irh irhVar : unmodifiableList) {
                if (!hashMap.containsKey(irhVar.c)) {
                    zqh e = irhVar.c().e(irhVar.b, this.d.b);
                    e.e();
                    hashMap.put(irhVar.c, e);
                }
            }
        }
    }

    public final void h(yld yldVar, irh irhVar, zqh zqhVar, int i, irh irhVar2, Collection collection) {
        h3x h3xVar;
        grh grhVar = this.g;
        if (grhVar != null) {
            grhVar.a();
            this.g = null;
        }
        grh grhVar2 = new grh(yldVar, irhVar, zqhVar, i, irhVar2, collection);
        this.g = grhVar2;
        if (grhVar2.c != 3 || (h3xVar = this.f) == null) {
            grhVar2.d();
            return;
        }
        irh irhVar3 = this.d;
        irh irhVar4 = (irh) grhVar2.f;
        h3x.c.b("Prepare transfer from Route(%s) to Route(%s)", irhVar3, irhVar4);
        vs3 vs3Var = new vs3();
        vs3Var.c = new h2o();
        ys3 ys3Var = new ys3(vs3Var);
        xs3 xs3Var = ys3Var.b;
        vs3Var.b = ys3Var;
        vs3Var.a = u2x.class;
        try {
            vs3Var.a = Boolean.valueOf(h3xVar.b.post(new t5(13, h3xVar, irhVar3, irhVar4, vs3Var, false)));
        } catch (Exception e) {
            xs3Var.m(e);
        }
        grh grhVar3 = this.g;
        yld yldVar2 = (yld) ((WeakReference) grhVar3.i).get();
        if (yldVar2 == null || yldVar2.g != grhVar3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            grhVar3.a();
        } else {
            if (((ys3) grhVar3.j) != null) {
                xq0.q("future is already set");
                return;
            }
            grhVar3.j = ys3Var;
            dyg dygVar = new dyg(8, grhVar3);
            vld vldVar = yldVar2.a;
            Objects.requireNonNull(vldVar);
            xs3Var.a(dygVar, new xkh(1, vldVar));
        }
    }

    public final void i(irh irhVar, int i) {
        if (!this.j.contains(irhVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + irhVar);
        } else {
            if (!irhVar.g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + irhVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                arh c = irhVar.c();
                kph kphVar = this.r;
                if (c == kphVar && this.d != irhVar) {
                    kphVar.n(irhVar.b);
                    return;
                }
            }
            j(irhVar, i);
        }
    }

    public final void j(irh irhVar, int i) {
        bz2 bz2Var;
        if (this.d == irhVar) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            yqh yqhVar = this.y;
            if (yqhVar != null) {
                yqhVar.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (bz2Var = irhVar.a.e) != null && bz2Var.b) {
            yqh c = irhVar.c().c(irhVar.b);
            if (c != null) {
                Context context = this.h;
                Executor m = Build.VERSION.SDK_INT >= 28 ? jo0.m(context) : new ks1(new Handler(context.getMainLooper()), 1);
                oxa oxaVar = this.E;
                synchronized (c.a) {
                    try {
                        if (m == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (oxaVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        c.b = m;
                        c.c = oxaVar;
                        ArrayList arrayList = c.e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            dqh dqhVar = c.d;
                            ArrayList arrayList2 = c.e;
                            c.d = null;
                            c.e = null;
                            c.b.execute(new t5(c, oxaVar, dqhVar, arrayList2, 7));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.x = irhVar;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + irhVar);
        }
        zqh d = irhVar.c().d(irhVar.b);
        if (d != null) {
            d.e();
        }
        if (this.d != null) {
            h(this, irhVar, d, i, null, null);
            return;
        }
        this.d = irhVar;
        this.e = d;
        Message obtainMessage = this.a.obtainMessage(262, new z4k(null, irhVar));
        obtainMessage.arg1 = i;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0149, code lost:
    
        if (r24.A.b() == r1) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        long j;
        brh brhVar;
        ArrayList arrayList;
        brh brhVar2 = new brh();
        lrh lrhVar = this.t;
        long j2 = 0;
        lrhVar.b = 0L;
        int i = 0;
        lrhVar.a = false;
        lrhVar.c = SystemClock.elapsedRealtime();
        ((Handler) lrhVar.d).removeCallbacks((sr7) lrhVar.e);
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            size--;
            boolean z2 = this.p;
            if (size < 0) {
                brh brhVar3 = brhVar2;
                long j3 = j2;
                lrh lrhVar2 = this.t;
                if (lrhVar2.a) {
                    long j4 = lrhVar2.b;
                    if (j4 > j3) {
                        ((Handler) lrhVar2.d).postDelayed((sr7) lrhVar2.e, j4);
                    }
                }
                boolean z3 = lrhVar2.a;
                this.B = i2;
                crh a = z ? brhVar3.a() : crh.c;
                crh a2 = brhVar3.a();
                if (f()) {
                    fqh fqhVar = this.A;
                    if (fqhVar != null) {
                        fqhVar.a();
                        if (fqhVar.b.equals(a2)) {
                        }
                    }
                    if (!a2.d() || z3) {
                        this.A = new fqh(a2, z3);
                    } else if (this.A != null) {
                        this.A = null;
                    }
                    this.r.h(this.A);
                }
                fqh fqhVar2 = this.z;
                if (fqhVar2 != null) {
                    fqhVar2.a();
                    if (fqhVar2.b.equals(a) && this.z.b() == z3) {
                        return;
                    }
                }
                if (!a.d() || z3) {
                    this.z = new fqh(a, z3);
                } else if (this.z == null) {
                    return;
                } else {
                    this.z = null;
                }
                if (z && !z3 && z2) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    arh arhVar = ((hrh) it.next()).a;
                    if (arhVar != this.r) {
                        arhVar.h(this.z);
                    }
                }
                return;
            }
            krh krhVar = (krh) ((WeakReference) arrayList2.get(size)).get();
            if (krhVar == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList3 = krhVar.b;
                int size2 = arrayList3.size();
                i2 += size2;
                int i3 = i;
                while (i3 < size2) {
                    frh frhVar = (frh) arrayList3.get(i3);
                    crh crhVar = frhVar.c;
                    if (crhVar == null) {
                        xq0.x("selector must not be null");
                        return;
                    }
                    ArrayList c = crhVar.c();
                    if (!c.isEmpty()) {
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (str == null) {
                                j = j2;
                                xq0.x("category must not be null");
                                break;
                            }
                            long j5 = j2;
                            if (brhVar2.a == null) {
                                brhVar2.a = new ArrayList();
                            }
                            if (!brhVar2.a.contains(str)) {
                                brhVar2.a.add(str);
                            }
                            j2 = j5;
                        }
                    }
                    j = j2;
                    int i4 = (frhVar.d & 1) != 0 ? 1 : i;
                    long j6 = frhVar.e;
                    lrh lrhVar3 = this.t;
                    if (i4 == 0) {
                        lrhVar3.getClass();
                        brhVar = brhVar2;
                        arrayList = arrayList2;
                    } else {
                        brhVar = brhVar2;
                        arrayList = arrayList2;
                        long j7 = lrhVar3.c;
                        if (j7 - j6 < 30000) {
                            lrhVar3.b = Math.max(lrhVar3.b, (j6 + 30000) - j7);
                            lrhVar3.a = true;
                        }
                    }
                    if (i4 != 0) {
                        z = true;
                    }
                    int i5 = frhVar.d;
                    if ((i5 & 4) != 0 && !z2) {
                        z = true;
                    }
                    if ((i5 & 8) != 0) {
                        z = true;
                    }
                    i3++;
                    j2 = j;
                    brhVar2 = brhVar;
                    arrayList2 = arrayList;
                    i = 0;
                }
            }
            j2 = j2;
            brhVar2 = brhVar2;
            arrayList2 = arrayList2;
            i = 0;
        }
    }

    public final void l() {
        irh irhVar = this.d;
        if (irhVar == null) {
            vx6 vx6Var = this.C;
            if (vx6Var != null) {
                vx6Var.s();
                return;
            }
            return;
        }
        int i = irhVar.p;
        bh3 bh3Var = this.n;
        bh3Var.b = i;
        bh3Var.c = irhVar.q;
        bh3Var.d = (!irhVar.e() || krh.h()) ? irhVar.o : 0;
        bh3Var.e = this.d.m;
        if (f() && this.d.c() == this.r) {
            bh3Var.f = kph.k(this.e);
        } else {
            bh3Var.f = null;
        }
        Iterator it = this.m.iterator();
        if (it.hasNext()) {
            ((xld) it.next()).getClass();
            throw null;
        }
        vx6 vx6Var2 = this.C;
        if (vx6Var2 != null) {
            irh irhVar2 = this.d;
            irh irhVar3 = this.v;
            if (irhVar3 == null) {
                xq0.q("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (irhVar2 == irhVar3 || irhVar2 == this.w) {
                vx6Var2.s();
                return;
            }
            int i2 = bh3Var.d == 1 ? 2 : 0;
            int i3 = bh3Var.c;
            int i4 = bh3Var.b;
            String str = (String) bh3Var.f;
            osh oshVar = (osh) vx6Var2.b;
            if (oshVar != null) {
                bhd bhdVar = (bhd) vx6Var2.c;
                if (bhdVar != null && i2 == 0 && i3 == 0) {
                    bhdVar.e(i4);
                    return;
                }
                bhd bhdVar2 = new bhd(vx6Var2, i2, i3, i4, str);
                vx6Var2.c = bhdVar2;
                ((esh) oshVar.a).a.setPlaybackToRemote(bhdVar2.a());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r21 == r19.s.g) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192 A[LOOP:5: B:79:0x0190->B:80:0x0192, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad A[LOOP:6: B:83:0x01ab->B:84:0x01ad, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(hrh hrhVar, bz2 bz2Var) {
        boolean z;
        int i;
        int size;
        int size2;
        Iterator it;
        boolean z2;
        bz2 bz2Var2 = hrhVar.e;
        ArrayList arrayList = hrhVar.b;
        if (bz2Var2 != bz2Var) {
            hrhVar.e = bz2Var;
            ArrayList arrayList2 = this.j;
            vld vldVar = this.a;
            if (bz2Var != null) {
                List list = (List) bz2Var.c;
                int size3 = list.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    dqh dqhVar = (dqh) list.get(i2);
                    if (dqhVar != null && dqhVar.e()) {
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = list.iterator();
                int i3 = 0;
                boolean z3 = false;
                while (it2.hasNext()) {
                    dqh dqhVar2 = (dqh) it2.next();
                    if (dqhVar2 == null || !dqhVar2.e()) {
                        it = it2;
                        z2 = z3;
                        Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + dqhVar2);
                    } else {
                        String d = dqhVar2.d();
                        int size4 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size4) {
                                i4 = -1;
                                break;
                            } else if (((irh) arrayList.get(i4)).b.equals(d)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i4 < 0) {
                            it = it2;
                            z2 = z3;
                            irh irhVar = new irh(hrhVar, d, b(hrhVar, d), dqhVar2.a.getBoolean("isSystemRoute", false));
                            int i5 = i3 + 1;
                            arrayList.add(i3, irhVar);
                            arrayList2.add(irhVar);
                            if (dqhVar2.c().isEmpty()) {
                                irhVar.i(dqhVar2);
                                vldVar.b(257, irhVar);
                            } else {
                                arrayList3.add(new z4k(irhVar, dqhVar2));
                            }
                            i3 = i5;
                        } else {
                            it = it2;
                            z2 = z3;
                            if (i4 < i3) {
                                Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + dqhVar2);
                            } else {
                                irh irhVar2 = (irh) arrayList.get(i4);
                                int i6 = i3 + 1;
                                Collections.swap(arrayList, i4, i3);
                                if (!dqhVar2.c().isEmpty()) {
                                    arrayList4.add(new z4k(irhVar2, dqhVar2));
                                } else if (n(irhVar2, dqhVar2) != 0 && irhVar2 == this.d) {
                                    i3 = i6;
                                    z2 = true;
                                }
                                i3 = i6;
                            }
                        }
                    }
                    it2 = it;
                    z3 = z2;
                }
                boolean z4 = z3;
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    z4k z4kVar = (z4k) it3.next();
                    irh irhVar3 = (irh) z4kVar.a;
                    irhVar3.i((dqh) z4kVar.b);
                    vldVar.b(257, irhVar3);
                }
                Iterator it4 = arrayList4.iterator();
                boolean z5 = z4;
                while (it4.hasNext()) {
                    z4k z4kVar2 = (z4k) it4.next();
                    irh irhVar4 = (irh) z4kVar2.a;
                    if (n(irhVar4, (dqh) z4kVar2.b) != 0 && irhVar4 == this.d) {
                        z5 = true;
                    }
                }
                z = z5;
                i = i3;
                for (size = arrayList.size() - 1; size >= i; size--) {
                    irh irhVar5 = (irh) arrayList.get(size);
                    irhVar5.i(null);
                    arrayList2.remove(irhVar5);
                }
                o(z);
                for (size2 = arrayList.size() - 1; size2 >= i; size2--) {
                    vldVar.b(258, (irh) arrayList.remove(size2));
                }
                vldVar.b(515, hrhVar);
            }
            z = false;
            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + bz2Var);
            i = 0;
            while (size >= i) {
            }
            o(z);
            while (size2 >= i) {
            }
            vldVar.b(515, hrhVar);
        }
    }

    public final int n(irh irhVar, dqh dqhVar) {
        int i = irhVar.i(dqhVar);
        if (i != 0) {
            int i2 = i & 1;
            vld vldVar = this.a;
            if (i2 != 0) {
                vldVar.b(259, irhVar);
            }
            if ((i & 2) != 0) {
                vldVar.b(260, irhVar);
            }
            if ((i & 4) != 0) {
                vldVar.b(261, irhVar);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        irh irhVar = this.v;
        if (irhVar != null && !irhVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        irh irhVar2 = this.v;
        xtk xtkVar = this.s;
        ArrayList arrayList = this.j;
        if (irhVar2 == null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                irh irhVar3 = (irh) it.next();
                if (irhVar3.c() == xtkVar && irhVar3.b.equals("DEFAULT_ROUTE") && irhVar3.f()) {
                    this.v = irhVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        irh irhVar4 = this.w;
        if (irhVar4 != null && !irhVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                irh irhVar5 = (irh) it2.next();
                if (irhVar5.c() == xtkVar && irhVar5.m("android.media.intent.category.LIVE_AUDIO") && !irhVar5.m("android.media.intent.category.LIVE_VIDEO") && irhVar5.f()) {
                    this.w = irhVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        irh irhVar6 = this.d;
        if (irhVar6 == null || !irhVar6.g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
            j(c(), 0);
            return;
        }
        if (z) {
            g();
            l();
        }
    }
}
