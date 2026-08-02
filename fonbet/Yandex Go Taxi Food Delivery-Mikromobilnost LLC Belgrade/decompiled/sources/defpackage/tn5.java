package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.ScreenPerformanceState;

/* loaded from: classes6.dex */
public final class tn5 {
    public final cwa0 a;
    public final boolean b;
    public final String c;
    public final long d;
    public final long e;
    public final dwa0 f;
    public final String g;
    public volatile ScreenPerformanceState h;
    public final ConcurrentHashMap i;
    public final AtomicInteger j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tn5(cwa0 cwa0Var, boolean z, int i) {
        this(Collections.singleton(new sn5(0)), cwa0Var, z);
        this.k = i;
        switch (i) {
            case 1:
                this(Collections.singleton(new r7v0(ElementPerformanceState.INITIAL)), cwa0Var, z);
                break;
            case 2:
                this(j73.f0(new yjv0[]{new xjv0(0), new wjv0(0)}), cwa0Var, z);
                break;
            case 3:
                this(Collections.singleton(new gwx0(0)), cwa0Var, z);
                break;
            case 4:
                this(Collections.singleton(new e211(0)), cwa0Var, z);
                break;
            default:
                break;
        }
    }

    public static List e(tn5 tn5Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        EmptyList emptyList = EmptyList.a;
        if (tn5Var.h.compareTo(ScreenPerformanceState.LARGEST_CONTENTFUL_PAINT) >= 0) {
            return emptyList;
        }
        tn5Var.h = ScreenPerformanceState.INTERRUPTED;
        PerformanceScreenName c = tn5Var.c();
        String str = tn5Var.c;
        dwa0 dwa0Var = tn5Var.f;
        String str2 = tn5Var.g;
        ScreenPerformanceState screenPerformanceState = tn5Var.h;
        long j2 = elapsedRealtime - tn5Var.d;
        long j3 = elapsedRealtime - tn5Var.e;
        boolean z = tn5Var.b;
        return Collections.singletonList(new yua0(c, str, dwa0Var, str2, j2, Long.valueOf(j3), elapsedRealtime - j, screenPerformanceState, emptyList, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (r2.ordinal() > ru.yandex.taxi.perf.screen.ElementPerformanceState.LARGEST_CONTENTFUL_PAINT.ordinal()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
    
        r2 = defpackage.bwa0.a[r29.c.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
    
        if (r2 == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012c, code lost:
    
        if (r2 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        if (r2 != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0136, code lost:
    
        if (r28.j.decrementAndGet() != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0138, code lost:
    
        r28.h = ru.yandex.taxi.perf.screen.ScreenPerformanceState.LARGEST_CONTENTFUL_PAINT;
        r13.add(new defpackage.yua0(r28.c(), r28.c, r28.f, r28.g, r11 - r28.d, java.lang.Long.valueOf(r11 - r28.e), r23, r28.h, r32, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0167, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0168, code lost:
    
        defpackage.w511.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
    
        r28.h = ru.yandex.taxi.perf.screen.ScreenPerformanceState.FIRST_CONTENTFUL_PAINT;
        r13.add(new defpackage.yua0(r28.c(), r28.c, r28.f, r28.g, r11 - r28.d, java.lang.Long.valueOf(r11 - r28.e), r23, r28.h, r32, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0111, code lost:
    
        if (r2.ordinal() > ru.yandex.taxi.perf.screen.ElementPerformanceState.FIRST_CONTENTFUL_PAINT.ordinal()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (r2.ordinal() > ru.yandex.taxi.perf.screen.ElementPerformanceState.INITIAL.ordinal()) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List f(tn5 tn5Var, dua0 dua0Var, long j, List list) {
        ava0 uua0Var;
        EmptyList emptyList = EmptyList.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (tn5Var.h == ScreenPerformanceState.INTERRUPTED) {
            return emptyList;
        }
        dua0 dua0Var2 = (dua0) tn5Var.i.get(dua0Var.b);
        if (dua0Var2 == null) {
            return Collections.singletonList(new sua0(tn5Var.c(), dua0Var.b));
        }
        ArrayList arrayList = new ArrayList();
        ElementPerformanceState elementPerformanceState = dua0Var2.c;
        String str = dua0Var2.b;
        PerformanceScreenName performanceScreenName = dua0Var2.a;
        PerformanceScreenName performanceScreenName2 = dua0Var.a;
        ElementPerformanceState elementPerformanceState2 = dua0Var.c;
        String str2 = dua0Var.b;
        Object fua0Var = performanceScreenName != performanceScreenName2 ? new fua0(performanceScreenName, performanceScreenName2) : !str.equals(str2) ? new eua0(str, str2) : elementPerformanceState2.compareTo(elementPerformanceState) > 0 ? new iua0() : new gua0(elementPerformanceState, elementPerformanceState2);
        if (fua0Var instanceof hua0) {
            hua0 hua0Var = (hua0) fua0Var;
            String str3 = dua0Var.b;
            if (hua0Var instanceof eua0) {
                eua0 eua0Var = (eua0) hua0Var;
                uua0Var = new tua0(tn5Var.c(), eua0Var.a, eua0Var.b);
            } else if (hua0Var instanceof fua0) {
                fua0 fua0Var2 = (fua0) hua0Var;
                uua0Var = new vua0(fua0Var2.a, str3, fua0Var2.b);
            } else {
                if (!(hua0Var instanceof gua0)) {
                    w511.b();
                    return null;
                }
                gua0 gua0Var = (gua0) hua0Var;
                uua0Var = new uua0(tn5Var.c(), str3, gua0Var.a, gua0Var.b);
            }
            arrayList.add(uua0Var);
            return arrayList;
        }
        if (!(fua0Var instanceof iua0)) {
            w511.b();
            return null;
        }
        tn5Var.i.put(dua0Var.b, dua0Var);
        long j2 = elapsedRealtime - j;
        arrayList.add(new xua0(tn5Var.c, tn5Var.f, tn5Var.g, elapsedRealtime - tn5Var.d, Long.valueOf(elapsedRealtime - tn5Var.e), j2, dua0Var));
        boolean z = tn5Var.b;
        ElementPerformanceState elementPerformanceState3 = dua0Var.c;
        ScreenPerformanceState screenPerformanceState = tn5Var.h;
        elementPerformanceState3.getClass();
        int i = rqn.a[screenPerformanceState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        w511.b();
                        return null;
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean a(dua0 dua0Var) {
        dua0 dua0Var2;
        return this.h.compareTo(ScreenPerformanceState.LARGEST_CONTENTFUL_PAINT) < 0 && (dua0Var2 = (dua0) this.i.get(dua0Var.b)) != null && dua0Var.c.compareTo(dua0Var2.c) > 0;
    }

    public final cwa0 b() {
        return this.a;
    }

    public final PerformanceScreenName c() {
        switch (this.k) {
            case 0:
                return PerformanceScreenName.BenefitsCenter;
            case 1:
                return PerformanceScreenName.Suggest;
            case 2:
                return PerformanceScreenName.Summary;
            case 3:
                return PerformanceScreenName.TaxiMain;
            default:
                return PerformanceScreenName.TransportDiscovery;
        }
    }

    public final ScreenPerformanceState d() {
        return this.h;
    }

    public tn5(Set set, cwa0 cwa0Var, boolean z) {
        String str = cwa0Var.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = cwa0Var;
        this.b = z;
        this.c = str;
        this.d = elapsedRealtime;
        this.e = cwa0Var.e;
        this.f = cwa0Var.c;
        this.g = cwa0Var.b;
        this.h = ScreenPerformanceState.INITIAL;
        this.i = new ConcurrentHashMap();
        this.j = new AtomicInteger();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dua0 dua0Var = (dua0) it.next();
            this.i.put(dua0Var.b, dua0Var);
            this.j.incrementAndGet();
        }
    }
}
