package defpackage;

import android.os.SystemClock;
import com.connectsdk.service.command.ServiceCommand;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.netperf.NetPerfEvent;
import ru.yandex.video.m3.netperf.PerfEventDto;

/* loaded from: classes6.dex */
public final class tyi implements f2j {
    public static final p7j j = new p7j(0);
    public long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public tyi(OkHttpClient okHttpClient, sld sldVar) {
        tjl tjlVar = new tjl();
        i5f r = quj.r(x3f.d, k9i.I);
        b43 b43Var = new b43(rre.f, 8);
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        mn7.d.getClass();
        tf6 e = gld.e(e.c(n, wkt.d.I0(1)).plus(b43Var));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        this.b = okHttpClient;
        this.c = tjlVar;
        this.d = r;
        this.e = sldVar;
        ypb ypbVar = new ypb(22, this);
        this.a = TimeUnit.MILLISECONDS.convert(35L, timeUnit);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.f = concurrentLinkedQueue;
        this.g = new syi(System.currentTimeMillis(), SystemClock.uptimeMillis());
        this.h = new pt0(new awc(concurrentLinkedQueue), ypbVar);
        xdr a = ydr.a(Boolean.FALSE);
        this.i = a;
        zsd.r0(e, zsd.M0(a, new cle((Continuation) null, this, 7)));
    }

    public static final void b(tyi tyiVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) tyiVar.f;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        List w0 = CollectionsKt.w0(concurrentLinkedQueue);
        concurrentLinkedQueue.clear();
        syi syiVar = (syi) tyiVar.g;
        long j2 = syiVar.a;
        List list = w0;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NetPerfEvent) it.next()).relativeToTimestamp(syiVar.b).toDto());
        }
        try {
            x3f x3fVar = (x3f) tyiVar.d;
            x3fVar.getClass();
            String c = x3fVar.c(new qy0(PerfEventDto.Companion.serializer(), 0), arrayList);
            OkHttpClient okHttpClient = (OkHttpClient) tyiVar.b;
            b0o b0oVar = new b0o();
            sld sldVar = (sld) tyiVar.e;
            tjl tjlVar = (tjl) tyiVar.c;
            sldVar.getClass();
            tjlVar.getClass();
            s7e f = ((u7e) sldVar.b).f();
            f.d("navstart", String.valueOf(j2));
            f.d("perfnow", String.valueOf(System.currentTimeMillis()));
            b0oVar.a = f.e();
            Pattern pattern = twh.e;
            b0oVar.e(ServiceCommand.TYPE_POST, ybl.b(c, q5g.C("application/json")));
            d0o b = b0oVar.b();
            okHttpClient.getClass();
            new mkn(okHttpClient, b, false).z(j);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:82|(1:83)|84|85|86|87|(1:103)|89|90|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:56|57|58|59|(8:121|122|(2:123|(3:125|126|(3:129|130|131)(1:128)))|69|70|71|72|(1:76)(2:74|75))|61|62|63|64|65|66|77|78|79|80|(1:115)(10:82|83|84|85|86|87|(1:103)|89|90|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0350, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0351, code lost:
    
        r10 = 1;
        r2 = r4;
        r4 = r6;
        r6 = r13;
        r13 = r14;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0382, code lost:
    
        r8 = r2;
        r2 = r7;
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03a8, code lost:
    
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0399, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0404  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0483 -> B:16:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x01e5 -> B:16:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0387 -> B:16:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x040a -> B:12:0x0434). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0431 -> B:12:0x0434). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(tyi tyiVar, mm6 mm6Var, cg6 cg6Var) {
        ucv ucvVar;
        tyi tyiVar2;
        Map linkedHashMap;
        long j2;
        xqn xqnVar;
        xqn xqnVar2;
        ucv ucvVar2;
        xqn xqnVar3;
        mm6 mm6Var2;
        mm6 mm6Var3;
        long j3;
        xqn xqnVar4;
        long j4;
        ucv ucvVar3;
        boolean z;
        ezh ezhVar;
        long j5;
        xzi xziVar;
        ezh ezhVar2;
        xqn xqnVar5;
        xqn xqnVar6;
        Map map;
        int i;
        xqn xqnVar7;
        xqn xqnVar8;
        xqn xqnVar9;
        mm6 mm6Var4;
        tyi tyiVar3;
        xqn xqnVar10;
        ezh ezhVar3;
        Map map2;
        mm6 mm6Var5;
        xqn xqnVar11;
        xqn xqnVar12;
        tyi tyiVar4;
        xqn xqnVar13;
        xqn xqnVar14;
        xqn xqnVar15;
        int i2;
        tyi tyiVar5;
        xqn xqnVar16;
        Map map3;
        ezh ezhVar4;
        qb5 qb5Var;
        fpr fprVar;
        Map map4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object l;
        ezh ezhVar5;
        if (cg6Var instanceof ucv) {
            ucvVar = (ucv) cg6Var;
            int i3 = ucvVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ucvVar.u = i3 - Integer.MIN_VALUE;
                tyiVar2 = tyiVar;
                Object obj = ucvVar.s;
                nm6 nm6Var = nm6.a;
                int i4 = 3;
                int i5 = 1;
                ezh ezhVar6 = null;
                switch (ucvVar.u) {
                    case 0:
                        xqn i6 = hrg.i(obj);
                        xqn xqnVar17 = new xqn();
                        xqn xqnVar18 = new xqn();
                        linkedHashMap = new LinkedHashMap();
                        j2 = 0;
                        xqnVar = xqnVar18;
                        xqnVar2 = xqnVar17;
                        ucvVar2 = ucvVar;
                        xqnVar3 = i6;
                        mm6Var2 = mm6Var;
                        zi3 zi3Var = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var.l(ucvVar2);
                        if (l == nm6Var) {
                            return nm6Var;
                        }
                        mm6Var3 = mm6Var2;
                        obj = l;
                        j3 = j2;
                        ezhVar4 = (ezh) obj;
                        if (ezhVar4 instanceof phb) {
                            if (ezhVar4 instanceof uzi) {
                                e(xqnVar, xqnVar2, xqnVar3);
                                tyiVar2.getClass();
                                xqnVar4 = xqnVar2;
                                ucvVar3 = ucvVar2;
                                ezhVar = ezhVar4;
                                mm6Var2 = mm6Var3;
                                z = false;
                                if (z) {
                                    ((x0q) tyiVar2.g).a(ezhVar);
                                    ucvVar2 = ucvVar3;
                                    xqnVar2 = xqnVar4;
                                    j2 = 0;
                                } else {
                                    long j6 = j3 + 1;
                                    zi3 zi3Var2 = (zi3) tyiVar2.f;
                                    ucvVar3.j = tyiVar2;
                                    ucvVar3.k = mm6Var2;
                                    ucvVar3.l = xqnVar3;
                                    ucvVar3.m = xqnVar4;
                                    ucvVar3.n = xqnVar;
                                    ucvVar3.o = linkedHashMap;
                                    ucvVar3.p = ezhVar6;
                                    ucvVar3.r = j6;
                                    ucvVar3.u = i4;
                                    if (zi3Var2.m(d6o.a, ucvVar3) == nm6Var) {
                                        return nm6Var;
                                    }
                                    ucvVar2 = ucvVar3;
                                    xqnVar2 = xqnVar4;
                                    j2 = j6;
                                }
                            } else {
                                if (ezhVar4 instanceof f66) {
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((zi3) tyiVar2.f).c((fcr) it.next());
                                    }
                                } else {
                                    ((x0q) tyiVar2.g).a(ezhVar4);
                                }
                                mm6Var2 = mm6Var3;
                                j2 = 0;
                            }
                        } else if (!(ezhVar4 instanceof qb5)) {
                            ezhVar6 = ezhVar6;
                            i5 = i5;
                            mm6Var2 = mm6Var3;
                            j2 = j3;
                        } else {
                            if (ezhVar4 instanceof wa8) {
                                e(xqnVar, xqnVar2, xqnVar3);
                                return Unit.a;
                            }
                            if (xqnVar.a != null) {
                                i2 = i5;
                                mm6Var5 = mm6Var3;
                                j2 = j3;
                                xqnVar13 = xqnVar3;
                                ucvVar = ucvVar2;
                                xqnVar11 = xqnVar2;
                                xqnVar16 = xqnVar;
                                tyiVar5 = tyiVar2;
                                map3 = linkedHashMap;
                                qb5Var = (qb5) ezhVar4;
                                if (qb5Var instanceof fcr) {
                                    ((fcr) ezhVar4).getClass();
                                    throw null;
                                }
                                if (qb5Var instanceof fhr) {
                                    ((fhr) ezhVar4).getClass();
                                    throw null;
                                }
                                if (qb5Var instanceof d6o) {
                                    zi3 zi3Var3 = (zi3) tyiVar5.f;
                                    f66 f66Var = new f66();
                                    ucvVar.j = tyiVar5;
                                    ucvVar.k = mm6Var5;
                                    ucvVar.l = xqnVar13;
                                    ucvVar.m = xqnVar11;
                                    ucvVar.n = xqnVar16;
                                    ucvVar.o = map3;
                                    ucvVar.p = null;
                                    ucvVar.r = j2;
                                    ucvVar.u = 9;
                                    if (zi3Var3.m(f66Var, ucvVar) == nm6Var) {
                                        return nm6Var;
                                    }
                                }
                                linkedHashMap = map3;
                                xqn xqnVar19 = xqnVar16;
                                tyi tyiVar6 = tyiVar5;
                                xqn xqnVar20 = xqnVar11;
                                xqn xqnVar21 = xqnVar13;
                                mm6Var2 = mm6Var5;
                                ucvVar2 = ucvVar;
                                if (linkedHashMap.isEmpty()) {
                                    xqnVar3 = xqnVar21;
                                    i4 = 3;
                                    ezhVar5 = null;
                                    r2f r2fVar = (r2f) xqnVar3.a;
                                    if (r2fVar != null) {
                                        r2fVar.g(null);
                                    }
                                    xqnVar3.a = null;
                                } else {
                                    xqnVar3 = xqnVar21;
                                    i4 = 3;
                                    ezhVar5 = null;
                                    xqnVar3.a = x97.y(mm6Var2, null, null, new ocu(tyiVar6, xqnVar19, xqnVar20, xqnVar21, (Continuation) null, 6), 3);
                                }
                                int i7 = i2;
                                ezhVar6 = ezhVar5;
                                i5 = i7;
                                tyiVar2 = tyiVar6;
                                xqnVar = xqnVar19;
                                xqnVar2 = xqnVar20;
                            } else {
                                if (ezhVar4 instanceof fhr) {
                                    throw null;
                                }
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    i = i5;
                                    xqnVar9 = xqnVar3;
                                    ucvVar = ucvVar2;
                                    xqnVar7 = xqnVar;
                                    long j7 = j3;
                                    tyiVar3 = tyiVar2;
                                    map = linkedHashMap;
                                    mm6Var4 = mm6Var3;
                                    xqnVar8 = xqnVar2;
                                    j5 = j7;
                                }
                                xzi xziVar2 = (xzi) tyiVar2.d;
                                qs qsVar = (qs) tyiVar2.b;
                                ucvVar2.j = tyiVar2;
                                ucvVar2.k = mm6Var3;
                                ucvVar2.l = xqnVar3;
                                ucvVar2.m = xqnVar2;
                                ucvVar2.n = xqnVar;
                                ucvVar2.o = linkedHashMap;
                                ucvVar2.p = ezhVar4;
                                ucvVar2.q = xziVar2;
                                ucvVar2.r = j3;
                                ucvVar2.u = 4;
                                Object invoke = qsVar.invoke(ucvVar2);
                                if (invoke == nm6Var) {
                                    return nm6Var;
                                }
                                ucv ucvVar4 = ucvVar2;
                                ezhVar2 = ezhVar4;
                                obj = invoke;
                                xqnVar10 = xqnVar3;
                                ucvVar = ucvVar4;
                                long j8 = j3;
                                tyiVar3 = tyiVar2;
                                xziVar = xziVar2;
                                mm6Var4 = mm6Var3;
                                xqnVar6 = xqnVar2;
                                xqnVar5 = xqnVar;
                                j5 = j8;
                                try {
                                } catch (Exception e2) {
                                    e = e2;
                                    map4 = linkedHashMap;
                                    i = i5;
                                }
                                String str = (String) obj;
                                arrayList = (ArrayList) tyiVar3.c;
                                if (!arrayList.isEmpty()) {
                                    try {
                                    } catch (Exception e3) {
                                        e = e3;
                                        map4 = linkedHashMap;
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            try {
                                            } catch (Exception e4) {
                                                e = e4;
                                                map = linkedHashMap;
                                                xqnVar7 = xqnVar5;
                                                xqnVar8 = xqnVar6;
                                                i = 1;
                                            }
                                            if (Intrinsics.d(((t6e) it2.next()).a, "Sec-WebSocket-Protocol")) {
                                                arrayList2 = (ArrayList) tyiVar3.c;
                                                map4 = linkedHashMap;
                                            }
                                        }
                                    }
                                    i = 1;
                                    map = map4;
                                    xqnVar7 = xqnVar5;
                                    xqnVar8 = xqnVar6;
                                    xqnVar9 = xqnVar10;
                                    zi3 zi3Var4 = (zi3) tyiVar3.f;
                                    uzi uziVar = new uzi(e);
                                    ucvVar.j = tyiVar3;
                                    ucvVar.k = mm6Var4;
                                    ucvVar.l = xqnVar9;
                                    ucvVar.m = xqnVar8;
                                    ucvVar.n = xqnVar7;
                                    ucvVar.o = map;
                                    ucvVar.p = null;
                                    ucvVar.q = null;
                                    ucvVar.r = j5;
                                    ucvVar.u = 6;
                                    if (zi3Var4.m(uziVar, ucvVar) == nm6Var) {
                                        return nm6Var;
                                    }
                                    xqn xqnVar22 = xqnVar7;
                                    ucvVar2 = ucvVar;
                                    xqnVar3 = xqnVar9;
                                    j2 = j5;
                                    xqnVar = xqnVar22;
                                    xqnVar2 = xqnVar8;
                                    mm6Var2 = mm6Var4;
                                    linkedHashMap = map;
                                    tyiVar2 = tyiVar3;
                                    i5 = i;
                                    i4 = 3;
                                    ezhVar6 = null;
                                }
                                map4 = linkedHashMap;
                                arrayList2 = CollectionsKt.h0((ArrayList) tyiVar3.c, new t6e("Sec-WebSocket-Protocol", "graphql-ws"));
                                ucvVar.j = tyiVar3;
                                ucvVar.k = mm6Var4;
                                ucvVar.l = xqnVar10;
                                ucvVar.m = xqnVar6;
                                ucvVar.n = xqnVar5;
                                ucvVar.o = map4;
                                ucvVar.p = ezhVar2;
                                ucvVar.q = null;
                                ucvVar.r = j5;
                                ucvVar.u = 5;
                                obj = xziVar.b0(ucvVar, str, arrayList2);
                                if (obj != nm6Var) {
                                    return nm6Var;
                                }
                                ezhVar3 = ezhVar2;
                                mm6Var5 = mm6Var4;
                                map2 = map4;
                                xqnVar11 = xqnVar6;
                                tyi tyiVar7 = tyiVar3;
                                xqnVar13 = xqnVar10;
                                long j9 = j5;
                                xqnVar12 = xqnVar5;
                                j2 = j9;
                                tyiVar4 = tyiVar7;
                                try {
                                } catch (Exception e5) {
                                    e = e5;
                                    i = 1;
                                    map = map2;
                                    xqnVar7 = xqnVar12;
                                    xqnVar8 = xqnVar11;
                                    mm6Var4 = mm6Var5;
                                    xqn xqnVar23 = xqnVar13;
                                    tyiVar3 = tyiVar4;
                                    j5 = j2;
                                    xqnVar9 = xqnVar23;
                                }
                                gu7 gu7Var = (gu7) obj;
                                wx0 wx0Var = (wx0) tyiVar4.e;
                                hjp hjpVar = (hjp) tyiVar4.i;
                                gu7Var.getClass();
                                hjpVar.getClass();
                                mm6Var5.getClass();
                                fprVar = new fpr(gu7Var, hjpVar, wx0Var.b, (Function1) wx0Var.c, wx0Var.a);
                                xqnVar12.a = fprVar;
                                ucvVar.j = tyiVar4;
                                ucvVar.k = mm6Var5;
                                ucvVar.l = xqnVar13;
                                ucvVar.m = xqnVar11;
                                ucvVar.n = xqnVar12;
                                ucvVar.o = map2;
                                ucvVar.p = ezhVar3;
                                ucvVar.r = j2;
                                ucvVar.u = 7;
                                if (fprVar.a(ucvVar) == nm6Var) {
                                    return nm6Var;
                                }
                                i2 = 1;
                                xqnVar11.a = x97.y(mm6Var5, null, pm6.d, new zts(xqnVar12, null, 25), 1);
                                ezhVar4 = ezhVar3;
                                map3 = map2;
                                xqnVar16 = xqnVar12;
                                tyiVar5 = tyiVar4;
                                qb5Var = (qb5) ezhVar4;
                                if (qb5Var instanceof fcr) {
                                }
                            }
                        }
                        zi3 zi3Var5 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var5.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                    case 1:
                        long j10 = ucvVar.r;
                        Map map5 = ucvVar.o;
                        xqn xqnVar24 = ucvVar.n;
                        xqn xqnVar25 = ucvVar.m;
                        xqn xqnVar26 = ucvVar.l;
                        mm6Var3 = ucvVar.k;
                        tyi tyiVar8 = ucvVar.j;
                        qgg.h0(obj);
                        linkedHashMap = map5;
                        tyiVar2 = tyiVar8;
                        j3 = j10;
                        xqnVar2 = xqnVar25;
                        xqnVar = xqnVar24;
                        ucvVar2 = ucvVar;
                        xqnVar3 = xqnVar26;
                        ezhVar4 = (ezh) obj;
                        if (ezhVar4 instanceof phb) {
                        }
                        zi3 zi3Var52 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var52.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                        break;
                    case 2:
                        long j11 = ucvVar.r;
                        ezh ezhVar7 = ucvVar.p;
                        Map map6 = ucvVar.o;
                        xqn xqnVar27 = ucvVar.n;
                        xqnVar4 = ucvVar.m;
                        xqn xqnVar28 = ucvVar.l;
                        mm6 mm6Var6 = ucvVar.k;
                        tyi tyiVar9 = ucvVar.j;
                        qgg.h0(obj);
                        if (((Boolean) obj).booleanValue()) {
                            mm6Var2 = mm6Var6;
                            j4 = j11;
                            ucvVar3 = ucvVar;
                            xqnVar = xqnVar27;
                            xqnVar3 = xqnVar28;
                            linkedHashMap = map6;
                            z = true;
                        } else {
                            mm6Var2 = mm6Var6;
                            j4 = j11;
                            ucvVar3 = ucvVar;
                            xqnVar = xqnVar27;
                            xqnVar3 = xqnVar28;
                            z = false;
                            linkedHashMap = map6;
                        }
                        ezhVar = ezhVar7;
                        tyiVar2 = tyiVar9;
                        j3 = j4;
                        if (z) {
                        }
                        zi3 zi3Var522 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var522.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                        break;
                    case 3:
                        long j12 = ucvVar.r;
                        Map map7 = ucvVar.o;
                        xqn xqnVar29 = ucvVar.n;
                        xqn xqnVar30 = ucvVar.m;
                        xqn xqnVar31 = ucvVar.l;
                        mm6 mm6Var7 = ucvVar.k;
                        tyi tyiVar10 = ucvVar.j;
                        qgg.h0(obj);
                        mm6Var2 = mm6Var7;
                        ucvVar2 = ucvVar;
                        xqnVar3 = xqnVar31;
                        j2 = j12;
                        xqnVar2 = xqnVar30;
                        linkedHashMap = map7;
                        xqnVar = xqnVar29;
                        tyiVar2 = tyiVar10;
                        zi3 zi3Var5222 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var5222.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                        break;
                    case 4:
                        j5 = ucvVar.r;
                        xziVar = ucvVar.q;
                        ezhVar2 = ucvVar.p;
                        linkedHashMap = ucvVar.o;
                        xqnVar5 = ucvVar.n;
                        xqnVar6 = ucvVar.m;
                        xqn xqnVar32 = ucvVar.l;
                        mm6 mm6Var8 = ucvVar.k;
                        tyi tyiVar11 = ucvVar.j;
                        try {
                            qgg.h0(obj);
                            xqnVar10 = xqnVar32;
                            mm6Var4 = mm6Var8;
                            tyiVar3 = tyiVar11;
                        } catch (Exception e6) {
                            e = e6;
                            map = linkedHashMap;
                            i = 1;
                            xqnVar7 = xqnVar5;
                            xqnVar8 = xqnVar6;
                            xqnVar9 = xqnVar32;
                            mm6Var4 = mm6Var8;
                            tyiVar3 = tyiVar11;
                            break;
                        }
                        String str2 = (String) obj;
                        arrayList = (ArrayList) tyiVar3.c;
                        if (!arrayList.isEmpty()) {
                        }
                        map4 = linkedHashMap;
                        arrayList2 = CollectionsKt.h0((ArrayList) tyiVar3.c, new t6e("Sec-WebSocket-Protocol", "graphql-ws"));
                        ucvVar.j = tyiVar3;
                        ucvVar.k = mm6Var4;
                        ucvVar.l = xqnVar10;
                        ucvVar.m = xqnVar6;
                        ucvVar.n = xqnVar5;
                        ucvVar.o = map4;
                        ucvVar.p = ezhVar2;
                        ucvVar.q = null;
                        ucvVar.r = j5;
                        ucvVar.u = 5;
                        obj = xziVar.b0(ucvVar, str2, arrayList2);
                        if (obj != nm6Var) {
                        }
                        break;
                    case 5:
                        j5 = ucvVar.r;
                        ezhVar3 = ucvVar.p;
                        map2 = ucvVar.o;
                        xqn xqnVar33 = ucvVar.n;
                        xqn xqnVar34 = ucvVar.m;
                        xqn xqnVar35 = ucvVar.l;
                        mm6Var4 = ucvVar.k;
                        tyiVar3 = ucvVar.j;
                        try {
                            qgg.h0(obj);
                            mm6Var5 = mm6Var4;
                            xqnVar11 = xqnVar34;
                            xqnVar12 = xqnVar33;
                            tyiVar4 = tyiVar3;
                            xqnVar13 = xqnVar35;
                            j2 = j5;
                        } catch (Exception e7) {
                            e = e7;
                            map = map2;
                            xqnVar7 = xqnVar33;
                            i = 1;
                            xqnVar8 = xqnVar34;
                            xqnVar9 = xqnVar35;
                            break;
                        }
                        gu7 gu7Var2 = (gu7) obj;
                        wx0 wx0Var2 = (wx0) tyiVar4.e;
                        hjp hjpVar2 = (hjp) tyiVar4.i;
                        gu7Var2.getClass();
                        hjpVar2.getClass();
                        mm6Var5.getClass();
                        fprVar = new fpr(gu7Var2, hjpVar2, wx0Var2.b, (Function1) wx0Var2.c, wx0Var2.a);
                        xqnVar12.a = fprVar;
                        ucvVar.j = tyiVar4;
                        ucvVar.k = mm6Var5;
                        ucvVar.l = xqnVar13;
                        ucvVar.m = xqnVar11;
                        ucvVar.n = xqnVar12;
                        ucvVar.o = map2;
                        ucvVar.p = ezhVar3;
                        ucvVar.r = j2;
                        ucvVar.u = 7;
                        if (fprVar.a(ucvVar) == nm6Var) {
                        }
                        i2 = 1;
                        xqnVar11.a = x97.y(mm6Var5, null, pm6.d, new zts(xqnVar12, null, 25), 1);
                        ezhVar4 = ezhVar3;
                        map3 = map2;
                        xqnVar16 = xqnVar12;
                        tyiVar5 = tyiVar4;
                        qb5Var = (qb5) ezhVar4;
                        if (qb5Var instanceof fcr) {
                        }
                        break;
                    case 6:
                        long j13 = ucvVar.r;
                        Map map8 = ucvVar.o;
                        xqn xqnVar36 = ucvVar.n;
                        xqn xqnVar37 = ucvVar.m;
                        xqn xqnVar38 = ucvVar.l;
                        mm6 mm6Var9 = ucvVar.k;
                        tyi tyiVar12 = ucvVar.j;
                        qgg.h0(obj);
                        i = 1;
                        mm6Var2 = mm6Var9;
                        ucvVar2 = ucvVar;
                        xqnVar3 = xqnVar38;
                        j2 = j13;
                        xqnVar2 = xqnVar37;
                        linkedHashMap = map8;
                        xqnVar = xqnVar36;
                        tyiVar2 = tyiVar12;
                        i5 = i;
                        i4 = 3;
                        ezhVar6 = null;
                        zi3 zi3Var52222 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var52222.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                        break;
                    case 7:
                        j2 = ucvVar.r;
                        ezhVar3 = ucvVar.p;
                        map2 = ucvVar.o;
                        xqnVar12 = ucvVar.n;
                        xqnVar11 = ucvVar.m;
                        xqnVar13 = ucvVar.l;
                        mm6Var5 = ucvVar.k;
                        tyiVar4 = ucvVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (Exception e8) {
                            e = e8;
                            Map map9 = map2;
                            xqnVar14 = xqnVar12;
                            Object obj2 = null;
                            xqnVar2 = xqnVar11;
                            xqnVar15 = xqnVar13;
                            i = 1;
                            xqnVar14.a = obj2;
                            zi3 zi3Var6 = (zi3) tyiVar4.f;
                            uzi uziVar2 = new uzi(e);
                            ucvVar.j = tyiVar4;
                            ucvVar.k = mm6Var5;
                            ucvVar.l = xqnVar15;
                            ucvVar.m = xqnVar2;
                            ucvVar.n = xqnVar14;
                            ucvVar.o = map9;
                            ucvVar.p = null;
                            ucvVar.r = j2;
                            ucvVar.u = 8;
                            if (zi3Var6.m(uziVar2, ucvVar) != nm6Var) {
                            }
                        }
                        i2 = 1;
                        xqnVar11.a = x97.y(mm6Var5, null, pm6.d, new zts(xqnVar12, null, 25), 1);
                        ezhVar4 = ezhVar3;
                        map3 = map2;
                        xqnVar16 = xqnVar12;
                        tyiVar5 = tyiVar4;
                        qb5Var = (qb5) ezhVar4;
                        if (qb5Var instanceof fcr) {
                        }
                        break;
                    case 8:
                        j2 = ucvVar.r;
                        Map map10 = ucvVar.o;
                        xqnVar14 = ucvVar.n;
                        xqnVar2 = ucvVar.m;
                        xqnVar15 = ucvVar.l;
                        mm6 mm6Var10 = ucvVar.k;
                        tyi tyiVar13 = ucvVar.j;
                        qgg.h0(obj);
                        linkedHashMap = map10;
                        i = 1;
                        mm6Var2 = mm6Var10;
                        tyiVar2 = tyiVar13;
                        xqnVar = xqnVar14;
                        ucvVar2 = ucvVar;
                        xqnVar3 = xqnVar15;
                        i5 = i;
                        i4 = 3;
                        ezhVar6 = null;
                        zi3 zi3Var522222 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var522222.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                        break;
                    case 9:
                        j2 = ucvVar.r;
                        map3 = ucvVar.o;
                        xqnVar16 = ucvVar.n;
                        xqnVar11 = ucvVar.m;
                        xqnVar13 = ucvVar.l;
                        mm6Var5 = ucvVar.k;
                        tyiVar5 = ucvVar.j;
                        qgg.h0(obj);
                        i2 = 1;
                        linkedHashMap = map3;
                        xqn xqnVar192 = xqnVar16;
                        tyi tyiVar62 = tyiVar5;
                        xqn xqnVar202 = xqnVar11;
                        xqn xqnVar212 = xqnVar13;
                        mm6Var2 = mm6Var5;
                        ucvVar2 = ucvVar;
                        if (linkedHashMap.isEmpty()) {
                        }
                        int i72 = i2;
                        ezhVar6 = ezhVar5;
                        i5 = i72;
                        tyiVar2 = tyiVar62;
                        xqnVar = xqnVar192;
                        xqnVar2 = xqnVar202;
                        zi3 zi3Var5222222 = (zi3) tyiVar2.f;
                        ucvVar2.j = tyiVar2;
                        ucvVar2.k = mm6Var2;
                        ucvVar2.l = xqnVar3;
                        ucvVar2.m = xqnVar2;
                        ucvVar2.n = xqnVar;
                        ucvVar2.o = linkedHashMap;
                        ucvVar2.p = ezhVar6;
                        ucvVar2.r = j2;
                        ucvVar2.u = i5;
                        l = zi3Var5222222.l(ucvVar2);
                        if (l == nm6Var) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tyiVar2 = tyiVar;
        ucvVar = new ucv(tyiVar2, cg6Var);
        Object obj3 = ucvVar.s;
        nm6 nm6Var2 = nm6.a;
        int i42 = 3;
        int i52 = 1;
        ezh ezhVar62 = null;
        switch (ucvVar.u) {
        }
    }

    public static final void e(xqn xqnVar, xqn xqnVar2, xqn xqnVar3) {
        fpr fprVar = (fpr) xqnVar.a;
        if (fprVar != null) {
            fprVar.a.b.b(1000, null);
        }
        xqnVar.a = null;
        r2f r2fVar = (r2f) xqnVar2.a;
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        xqnVar2.a = null;
        r2f r2fVar2 = (r2f) xqnVar3.a;
        if (r2fVar2 != null) {
            r2fVar2.g(null);
        }
        xqnVar3.a = null;
    }

    @Override // defpackage.f2j
    public void a() {
        ((zi3) this.f).c(wa8.a);
    }

    public void d(long j2, long j3) {
        if (j2 != this.a) {
            hbu hbuVar = (hbu) this.d;
            lis lisVar = hbuVar.e;
            long j4 = hbuVar.g;
            lisVar.a(j4 == -9223372036854775807L ? 0L : j4 + 1, Long.valueOf(j2));
            this.a = j2;
        }
    }

    public tyi(qs qsVar, ArrayList arrayList, xzi xziVar, long j2, wx0 wx0Var) {
        this.b = qsVar;
        this.c = arrayList;
        this.d = xziVar;
        this.a = j2;
        this.e = wx0Var;
        this.f = men.g(Integer.MAX_VALUE, 6, null);
        x0q a = y0q.a(0, Integer.MAX_VALUE, oi3.a);
        this.g = a;
        new dkn(a);
        a.i();
        dq4 dq4Var = new dq4();
        this.h = dq4Var;
        x97.y(gld.e(dq4Var.b), null, null, new y6v(this, (Continuation) null, 1), 3);
        this.i = new hjp(14, this);
    }

    public tyi(dbu dbuVar, dzr dzrVar) {
        this.b = dbuVar;
        dbuVar.l = dzrVar;
        this.c = dzrVar;
        this.d = new hbu(new nnk(this), dbuVar);
        this.e = new ArrayDeque();
        this.f = new dsc(new bsc());
        this.a = -9223372036854775807L;
        this.g = e3s.j;
        this.h = new gx0(2);
        this.i = new kt7();
    }
}
