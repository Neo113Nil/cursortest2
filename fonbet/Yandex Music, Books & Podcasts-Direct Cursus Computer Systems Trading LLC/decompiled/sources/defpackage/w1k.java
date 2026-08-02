package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w1k {
    public final Object a;
    public final s4k b;
    public final hyd c;
    public final pjc d;
    public final msj e;
    public final awc f;
    public final AtomicBoolean g;
    public final zi3 h;
    public final x1k i;
    public final w2f j;
    public final clc k;

    public w1k(Object obj, s4k s4kVar, hyd hydVar, b56 b56Var, t4k t4kVar, msj msjVar) {
        s4kVar.getClass();
        b56Var.getClass();
        this.a = obj;
        this.b = s4kVar;
        this.c = hydVar;
        this.d = b56Var;
        this.e = msjVar;
        if (hydVar.d != Integer.MIN_VALUE && !s4kVar.a()) {
            xq0.x("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
            throw null;
        }
        this.f = new awc(3);
        this.g = new AtomicBoolean(false);
        Continuation continuation = null;
        this.h = men.g(-2, 6, null);
        this.i = new x1k(hydVar);
        w2f p = saf.p();
        this.j = p;
        this.k = new clc(hyf.M(new k3(p, new rfg(this, continuation, 16), continuation, 25)), new rfg(this, continuation, 17));
    }

    public static final Object a(w1k w1kVar, clc clcVar, pfg pfgVar, aur aurVar) {
        w1kVar.getClass();
        pjc M = hyf.M(new yjc(clcVar, new l1k(null, w1kVar, pfgVar), null, 1));
        v42 v42Var = new v42(pfgVar, null, 8);
        M.getClass();
        Object collect = zsd.C(new eno(new yjc(M, v42Var, null, 0)), -1).collect(new lrf(26, w1kVar, pfgVar), aurVar);
        return collect == nm6.a ? collect : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x036a, code lost:
    
        r12.getClass();
        r5 = r8;
        r8 = r14;
        r6 = r17;
        r7 = r18;
        r14 = r2;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032c A[Catch: all -> 0x0355, TRY_LEAVE, TryCatch #4 {all -> 0x0355, blocks: (B:173:0x0316, B:175:0x032c), top: B:172:0x0316 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x062a A[Catch: all -> 0x0284, TRY_ENTER, TryCatch #3 {all -> 0x0284, blocks: (B:184:0x0258, B:194:0x0269, B:196:0x0278, B:197:0x0289, B:199:0x028f, B:201:0x02a2, B:204:0x02a5, B:206:0x02b8, B:208:0x02d4, B:212:0x062a, B:213:0x062f), top: B:183:0x0258 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05b1 A[Catch: all -> 0x05c0, TryCatch #0 {all -> 0x05c0, blocks: (B:74:0x0585, B:75:0x0597, B:77:0x05b1, B:79:0x05b9, B:81:0x05bd, B:82:0x05c6, B:83:0x05c4, B:84:0x05c9), top: B:73:0x0585 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05bd A[Catch: all -> 0x05c0, TryCatch #0 {all -> 0x05c0, blocks: (B:74:0x0585, B:75:0x0597, B:77:0x05b1, B:79:0x05b9, B:81:0x05bd, B:82:0x05c6, B:83:0x05c4, B:84:0x05c9), top: B:73:0x0585 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05c4 A[Catch: all -> 0x05c0, TryCatch #0 {all -> 0x05c0, blocks: (B:74:0x0585, B:75:0x0597, B:77:0x05b1, B:79:0x05b9, B:81:0x05bd, B:82:0x05c6, B:83:0x05c4, B:84:0x05c9), top: B:73:0x0585 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r0v9, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v11, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v28, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v21, types: [oqi] */
    /* JADX WARN: Type inference failed for: r5v26, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(w1k w1kVar, pfg pfgVar, q3d q3dVar, Continuation continuation) {
        q1k q1kVar;
        int i;
        int i2;
        x1k x1kVar;
        qqi qqiVar;
        q3d q3dVar2;
        vqn vqnVar;
        pfg pfgVar2;
        int ordinal;
        x1k x1kVar2;
        qqi qqiVar2;
        w1k w1kVar2;
        pfg pfgVar3;
        xqn xqnVar;
        q3d q3dVar3;
        xqn xqnVar2;
        ?? r5;
        Object i3;
        q3d q3dVar4;
        xqn xqnVar3;
        Object obj;
        q3d q3dVar5;
        Object obj2;
        qqi qqiVar3;
        vqn vqnVar2;
        pfg pfgVar4;
        tqn tqnVar;
        w1k w1kVar3;
        xqn xqnVar4;
        o4k o4kVar;
        vqn vqnVar3;
        w1k w1kVar4;
        q3d q3dVar6;
        pfg pfgVar5;
        tqn tqnVar2;
        xqn xqnVar5;
        x1k x1kVar3;
        r4k r4kVar;
        o4k o4kVar2;
        w1k w1kVar5;
        oqi oqiVar;
        x1k x1kVar4;
        oqi oqiVar2;
        q1k q1kVar2;
        pfg pfgVar6;
        z1k z1kVar;
        oqi oqiVar3;
        q3d q3dVar7;
        x1k x1kVar5;
        pfg pfgVar7;
        Object obj3;
        w1k w1kVar6;
        pfg pfgVar8;
        o4k o4kVar3;
        qqi qqiVar4;
        Object obj4;
        w1k w1kVar7;
        z1k z1kVar2;
        oqi oqiVar4;
        Object obj5;
        o4k o4kVar4;
        tqn tqnVar3;
        pfg pfgVar9;
        xqn xqnVar6;
        Throwable th;
        z1k z1kVar3;
        lfg lfgVar;
        Object i4;
        ime imeVar;
        a1k d;
        zi3 zi3Var;
        o4k o4kVar5;
        r4k r4kVar2;
        Object obj6;
        Object obj7;
        w1k w1kVar8 = w1kVar;
        ?? r1 = pfgVar;
        w1kVar8.getClass();
        try {
            if (continuation instanceof q1k) {
                q1kVar = (q1k) continuation;
                int i5 = q1kVar.w;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    q1kVar.w = i5 - Integer.MIN_VALUE;
                    Object obj8 = q1kVar.u;
                    nm6 nm6Var = nm6.a;
                    i = q1kVar.w;
                    pfg pfgVar10 = pfg.c;
                    pfg pfgVar11 = pfg.b;
                    switch (i) {
                        case 0:
                            qgg.h0(obj8);
                            if (r1 == pfg.a) {
                                xq0.x("Use doInitialLoad for LoadType == REFRESH");
                                return null;
                            }
                            vqn vqnVar4 = new vqn();
                            x1k x1kVar6 = w1kVar8.i;
                            qqi qqiVar5 = x1kVar6.a;
                            q1kVar.j = w1kVar8;
                            q1kVar.k = r1;
                            q1kVar.l = q3dVar;
                            q1kVar.m = vqnVar4;
                            q1kVar.n = x1kVar6;
                            q1kVar.o = qqiVar5;
                            i2 = 1;
                            q1kVar.w = 1;
                            if (qqiVar5.a(q1kVar) != nm6Var) {
                                x1kVar = x1kVar6;
                                qqiVar = qqiVar5;
                                q3dVar2 = q3dVar;
                                vqnVar = vqnVar4;
                                pfgVar2 = r1;
                                try {
                                    z1k z1kVar4 = x1kVar.b;
                                    ordinal = pfgVar2.ordinal();
                                    if (ordinal != 0) {
                                        throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                                    }
                                    int i6 = 0;
                                    if (ordinal == i2) {
                                        int i7 = z1kVar4.d;
                                        ArrayList arrayList = z1kVar4.c;
                                        int i8 = (i7 + q3dVar2.b.c) - 1;
                                        if (i8 > u75.g(arrayList)) {
                                            vqnVar.a = ((i8 - (arrayList.size() - 1)) * w1kVar8.c.a) + vqnVar.a;
                                            i8 = arrayList.size() - 1;
                                        }
                                        if (i8 >= 0) {
                                            while (true) {
                                                vqnVar.a += ((q4k) arrayList.get(i6)).a.size();
                                                if (i6 != i8) {
                                                    i6++;
                                                }
                                            }
                                        }
                                    } else if (ordinal == 2) {
                                        int i9 = z1kVar4.d;
                                        ArrayList arrayList2 = z1kVar4.c;
                                        int i10 = i9 + q3dVar2.b.d + 1;
                                        if (i10 < 0) {
                                            vqnVar.a = (w1kVar8.c.a * (-i10)) + vqnVar.a;
                                        } else {
                                            i6 = i10;
                                        }
                                        int g = u75.g(arrayList2);
                                        if (i6 <= g) {
                                            while (true) {
                                                vqnVar.a += ((q4k) arrayList2.get(i6)).a.size();
                                                if (i6 != g) {
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                    qqiVar.b(null);
                                    xqn xqnVar7 = new xqn();
                                    x1kVar2 = w1kVar8.i;
                                    qqiVar2 = x1kVar2.a;
                                    q1kVar.j = w1kVar8;
                                    q1kVar.k = pfgVar2;
                                    q1kVar.l = q3dVar2;
                                    q1kVar.m = vqnVar;
                                    q1kVar.n = xqnVar7;
                                    q1kVar.o = x1kVar2;
                                    q1kVar.p = qqiVar2;
                                    q1kVar.q = xqnVar7;
                                    q1kVar.w = 2;
                                    if (qqiVar2.a(q1kVar) != nm6Var) {
                                        w1kVar2 = w1kVar8;
                                        pfgVar3 = pfgVar2;
                                        xqnVar = xqnVar7;
                                        q3dVar3 = q3dVar2;
                                        xqnVar2 = xqnVar;
                                        try {
                                            z1k z1kVar5 = x1kVar2.b;
                                            i3 = w1kVar2.i(z1kVar5, pfgVar3, q3dVar3.a, q3dVar3.b.a(pfgVar3) + vqnVar.a);
                                            if (i3 != null) {
                                                xqn xqnVar8 = xqnVar2;
                                                q3dVar4 = q3dVar3;
                                                xqnVar3 = xqnVar8;
                                                obj = null;
                                                vqnVar2 = vqnVar;
                                                pfgVar4 = pfgVar3;
                                                qqiVar2.b(null);
                                                xqnVar.a = obj;
                                                tqnVar = new tqn();
                                                w1kVar3 = w1kVar2;
                                                xqnVar4 = xqnVar3;
                                                obj7 = xqnVar4.a;
                                                if (obj7 != null) {
                                                }
                                                return Unit.a;
                                            }
                                            q1kVar.j = w1kVar2;
                                            q1kVar.k = pfgVar3;
                                            q1kVar.l = q3dVar3;
                                            q1kVar.m = vqnVar;
                                            q1kVar.n = xqnVar2;
                                            q1kVar.o = qqiVar2;
                                            q1kVar.p = i3;
                                            q1kVar.q = xqnVar;
                                            q1kVar.w = 3;
                                            if (w1kVar2.k(z1kVar5, pfgVar3, q1kVar) != nm6Var) {
                                                qqi qqiVar6 = qqiVar2;
                                                q3dVar5 = q3dVar3;
                                                obj2 = i3;
                                                qqiVar3 = qqiVar6;
                                                obj = obj2;
                                                xqnVar3 = xqnVar2;
                                                q3dVar4 = q3dVar5;
                                                qqiVar2 = qqiVar3;
                                                vqnVar2 = vqnVar;
                                                pfgVar4 = pfgVar3;
                                                qqiVar2.b(null);
                                                xqnVar.a = obj;
                                                tqnVar = new tqn();
                                                w1kVar3 = w1kVar2;
                                                xqnVar4 = xqnVar3;
                                                obj7 = xqnVar4.a;
                                                if (obj7 != null) {
                                                    o4kVar = w1kVar3.g(pfgVar4, obj7);
                                                    s4k s4kVar = w1kVar3.b;
                                                    if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                                                        Log.d("Paging", "Start " + pfgVar4 + " with loadKey " + xqnVar4.a + " on " + s4kVar);
                                                    }
                                                    q1kVar.j = w1kVar3;
                                                    q1kVar.k = pfgVar4;
                                                    q1kVar.l = q3dVar4;
                                                    q1kVar.m = vqnVar2;
                                                    q1kVar.n = xqnVar4;
                                                    q1kVar.o = tqnVar;
                                                    q1kVar.p = o4kVar;
                                                    q1kVar.q = null;
                                                    q1kVar.r = null;
                                                    q1kVar.w = 4;
                                                    obj8 = s4kVar.e(o4kVar, q1kVar);
                                                    if (obj8 != nm6Var) {
                                                        xqn xqnVar9 = xqnVar4;
                                                        q3dVar6 = q3dVar4;
                                                        w1kVar4 = w1kVar3;
                                                        xqnVar5 = xqnVar9;
                                                        vqnVar3 = vqnVar2;
                                                        pfgVar5 = pfgVar4;
                                                        tqnVar2 = tqnVar;
                                                        r4kVar = (r4k) obj8;
                                                        if (r4kVar instanceof q4k) {
                                                            int ordinal2 = pfgVar5.ordinal();
                                                            if (ordinal2 == 1) {
                                                                obj6 = ((q4k) r4kVar).b;
                                                            } else {
                                                                if (ordinal2 != 2) {
                                                                    xq0.x("Use doInitialLoad for LoadType == REFRESH");
                                                                    return null;
                                                                }
                                                                obj6 = ((q4k) r4kVar).c;
                                                            }
                                                            if (!w1kVar4.b.b() && Intrinsics.d(obj6, xqnVar5.a)) {
                                                                wb8.h(hlr.e("The same value, " + xqnVar5.a + ", was passed as the " + (pfgVar5 == pfgVar11 ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "));
                                                                return null;
                                                            }
                                                            x1kVar3 = w1kVar4.i;
                                                            oqiVar = x1kVar3.a;
                                                            q1kVar.j = w1kVar4;
                                                            q1kVar.k = pfgVar5;
                                                            q1kVar.l = q3dVar6;
                                                            q1kVar.m = vqnVar3;
                                                            q1kVar.n = xqnVar5;
                                                            q1kVar.o = tqnVar2;
                                                            q1kVar.p = o4kVar;
                                                            q1kVar.q = r4kVar;
                                                            q1kVar.r = x1kVar3;
                                                            q1kVar.s = oqiVar;
                                                            o4k o4kVar6 = o4kVar;
                                                            q1kVar.w = 5;
                                                            if (oqiVar.a(q1kVar) != nm6Var) {
                                                                w1kVar5 = w1kVar4;
                                                                o4kVar2 = o4kVar6;
                                                                try {
                                                                    w1k w1kVar9 = w1kVar5;
                                                                    q1k q1kVar3 = q1kVar;
                                                                    if (x1kVar3.b.c(q3dVar6.a, pfgVar5, (q4k) r4kVar)) {
                                                                        if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                                                                            Object obj9 = xqnVar5.a;
                                                                            w1kVar9.getClass();
                                                                            Log.d("Paging", h(pfgVar5, obj9, r4kVar));
                                                                        }
                                                                        q4k q4kVar = (q4k) r4kVar;
                                                                        vqnVar3.a = q4kVar.a.size() + vqnVar3.a;
                                                                        if ((pfgVar5 == pfgVar11 && q4kVar.b == null) || (pfgVar5 == pfgVar10 && q4kVar.c == null)) {
                                                                            tqnVar2.a = true;
                                                                        }
                                                                        q1kVar = q1kVar3;
                                                                        o4kVar5 = o4kVar2;
                                                                        w1kVar4 = w1kVar9;
                                                                        if (k1k.a[pfgVar5.ordinal()] != 2) {
                                                                        }
                                                                        x1k x1kVar7 = w1kVar4.i;
                                                                        pfgVar8 = pfgVar10;
                                                                        qqiVar4 = x1kVar7.a;
                                                                        q1kVar.j = w1kVar4;
                                                                        q1kVar.k = pfgVar5;
                                                                        q1kVar.l = q3dVar6;
                                                                        q1kVar.m = vqnVar3;
                                                                        q1kVar.n = xqnVar5;
                                                                        q1kVar.o = tqnVar2;
                                                                        q1kVar.p = o4kVar5;
                                                                        q1kVar.q = r4kVar;
                                                                        q1kVar.r = r0;
                                                                        q1kVar.s = x1kVar7;
                                                                        q1kVar.t = qqiVar4;
                                                                        pfg pfgVar12 = r0;
                                                                        q1kVar.w = 8;
                                                                        if (qqiVar4.a(q1kVar) != nm6Var) {
                                                                        }
                                                                    } else if (hyf.a != null && Log.isLoggable("Paging", 2)) {
                                                                        Object obj10 = xqnVar5.a;
                                                                        w1kVar9.getClass();
                                                                        Log.v("Paging", h(pfgVar5, obj10, r4kVar2));
                                                                    }
                                                                } finally {
                                                                    oqiVar.b(null);
                                                                }
                                                            }
                                                        } else {
                                                            o4k o4kVar7 = o4kVar;
                                                            if (r4kVar instanceof p4k) {
                                                                if (hyf.a != null && Log.isLoggable("Paging", 2)) {
                                                                    Object obj11 = xqnVar5.a;
                                                                    w1kVar4.getClass();
                                                                    Log.v("Paging", h(pfgVar5, obj11, r4kVar));
                                                                }
                                                                x1kVar4 = w1kVar4.i;
                                                                qqi qqiVar7 = x1kVar4.a;
                                                                q1kVar.j = w1kVar4;
                                                                q1kVar.k = pfgVar5;
                                                                q1kVar.l = q3dVar6;
                                                                q1kVar.m = r4kVar;
                                                                q1kVar.n = x1kVar4;
                                                                q1kVar.o = qqiVar7;
                                                                q1kVar.p = null;
                                                                q1kVar.w = 6;
                                                                if (qqiVar7.a(q1kVar) != nm6Var) {
                                                                    oqiVar2 = qqiVar7;
                                                                    q1kVar2 = q1kVar;
                                                                    pfgVar6 = pfgVar5;
                                                                    try {
                                                                        z1kVar3 = x1kVar4.b;
                                                                        lfgVar = new lfg(((p4k) r4kVar).a);
                                                                        q1kVar2.j = pfgVar6;
                                                                        q1kVar2.k = q3dVar6;
                                                                        q1kVar2.l = oqiVar2;
                                                                        q1kVar2.m = z1kVar3;
                                                                        q1kVar2.n = null;
                                                                        q1kVar2.o = null;
                                                                        q1kVar2.w = 7;
                                                                        if (w1kVar4.j(z1kVar3, pfgVar6, lfgVar, q1kVar2) != nm6Var) {
                                                                            z1kVar = z1kVar3;
                                                                            oqiVar3 = oqiVar2;
                                                                            q3dVar7 = q3dVar6;
                                                                            z1kVar.i.put(pfgVar6, q3dVar7.b);
                                                                            oqiVar3.b(null);
                                                                            return Unit.a;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        oqiVar3 = oqiVar2;
                                                                        oqiVar3.b(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                o4kVar5 = o4kVar7;
                                                                pfg pfgVar13 = k1k.a[pfgVar5.ordinal()] != 2 ? pfgVar10 : pfgVar11;
                                                                x1k x1kVar72 = w1kVar4.i;
                                                                pfgVar8 = pfgVar10;
                                                                qqiVar4 = x1kVar72.a;
                                                                q1kVar.j = w1kVar4;
                                                                q1kVar.k = pfgVar5;
                                                                q1kVar.l = q3dVar6;
                                                                q1kVar.m = vqnVar3;
                                                                q1kVar.n = xqnVar5;
                                                                q1kVar.o = tqnVar2;
                                                                q1kVar.p = o4kVar5;
                                                                q1kVar.q = r4kVar;
                                                                q1kVar.r = pfgVar13;
                                                                q1kVar.s = x1kVar72;
                                                                q1kVar.t = qqiVar4;
                                                                pfg pfgVar122 = pfgVar13;
                                                                q1kVar.w = 8;
                                                                if (qqiVar4.a(q1kVar) != nm6Var) {
                                                                    o4kVar3 = o4kVar5;
                                                                    x1kVar5 = x1kVar72;
                                                                    w1kVar6 = w1kVar4;
                                                                    obj3 = r4kVar;
                                                                    pfgVar7 = pfgVar122;
                                                                    try {
                                                                        z1kVar2 = x1kVar5.b;
                                                                        w1k w1kVar10 = w1kVar6;
                                                                        hiu hiuVar = q3dVar6.b;
                                                                        z1kVar2.getClass();
                                                                        pfgVar7.getClass();
                                                                        hiuVar.getClass();
                                                                        w1kVar7 = w1kVar10;
                                                                        obj4 = obj3;
                                                                        pfgVar9 = pfgVar11;
                                                                        i4 = w1kVar7.i(z1kVar2, pfgVar5, q3dVar6.a, q3dVar6.b.a(pfgVar5) + vqnVar3.a);
                                                                        imeVar = z1kVar2.j;
                                                                        xqnVar5.a = i4;
                                                                        if (i4 == null && !(imeVar.s(pfgVar5) instanceof lfg)) {
                                                                            imeVar.W(pfgVar5, !tqnVar2.a ? nfg.b : nfg.c);
                                                                        }
                                                                        d = z1kVar2.d((q4k) obj4, pfgVar5);
                                                                        zi3Var = w1kVar7.h;
                                                                        q1kVar.j = w1kVar7;
                                                                        q1kVar.k = pfgVar5;
                                                                        q1kVar.l = q3dVar6;
                                                                        q1kVar.m = vqnVar3;
                                                                        q1kVar.n = xqnVar5;
                                                                        q1kVar.o = tqnVar2;
                                                                        q1kVar.p = o4kVar3;
                                                                        q1kVar.q = obj4;
                                                                        q1kVar.r = qqiVar4;
                                                                        q1kVar.s = null;
                                                                        q1kVar.t = null;
                                                                        q1kVar.w = 10;
                                                                        if (zi3Var.m(d, q1kVar) != nm6Var) {
                                                                            xqn xqnVar10 = xqnVar5;
                                                                            w1kVar3 = w1kVar7;
                                                                            obj5 = obj4;
                                                                            o4kVar4 = o4kVar3;
                                                                            xqnVar6 = xqnVar10;
                                                                            oqiVar4 = qqiVar4;
                                                                            tqnVar3 = tqnVar2;
                                                                            pfgVar4 = pfgVar5;
                                                                            vqnVar2 = vqnVar3;
                                                                            oqiVar4.b(null);
                                                                            if (o4kVar4 instanceof m4k) {
                                                                                Object obj12 = ((q4k) obj5).b;
                                                                            }
                                                                            if (o4kVar4 instanceof l4k) {
                                                                                Object obj13 = ((q4k) obj5).c;
                                                                            }
                                                                            w1kVar3.getClass();
                                                                            tqnVar = tqnVar3;
                                                                            q3dVar4 = q3dVar6;
                                                                            pfgVar10 = pfgVar8;
                                                                            pfgVar11 = pfgVar9;
                                                                            xqnVar4 = xqnVar6;
                                                                            obj7 = xqnVar4.a;
                                                                            if (obj7 != null) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        r1 = qqiVar4;
                                                                        r1.b(null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r5 = qqiVar2;
                                            r5.b(null);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    qqiVar.b(null);
                                    throw th5;
                                }
                            }
                            return nm6Var;
                        case 1:
                            ?? r0 = (oqi) q1kVar.o;
                            x1k x1kVar8 = (x1k) q1kVar.n;
                            vqn vqnVar5 = (vqn) q1kVar.m;
                            q3dVar2 = (q3d) q1kVar.l;
                            pfg pfgVar14 = (pfg) q1kVar.k;
                            w1k w1kVar11 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            x1kVar = x1kVar8;
                            pfgVar2 = pfgVar14;
                            vqnVar = vqnVar5;
                            qqiVar = r0;
                            w1kVar8 = w1kVar11;
                            i2 = 1;
                            z1k z1kVar42 = x1kVar.b;
                            ordinal = pfgVar2.ordinal();
                            if (ordinal != 0) {
                            }
                            break;
                        case 2:
                            xqnVar = (xqn) q1kVar.q;
                            ?? r12 = (oqi) q1kVar.p;
                            x1kVar2 = (x1k) q1kVar.o;
                            xqnVar2 = (xqn) q1kVar.n;
                            vqnVar = (vqn) q1kVar.m;
                            q3d q3dVar8 = (q3d) q1kVar.l;
                            pfgVar3 = (pfg) q1kVar.k;
                            w1kVar2 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            qqiVar2 = r12;
                            q3dVar3 = q3dVar8;
                            z1k z1kVar52 = x1kVar2.b;
                            i3 = w1kVar2.i(z1kVar52, pfgVar3, q3dVar3.a, q3dVar3.b.a(pfgVar3) + vqnVar.a);
                            if (i3 != null) {
                            }
                            break;
                        case 3:
                            xqnVar = (xqn) q1kVar.q;
                            obj2 = q1kVar.p;
                            r5 = (oqi) q1kVar.o;
                            xqnVar2 = (xqn) q1kVar.n;
                            vqnVar = (vqn) q1kVar.m;
                            q3dVar5 = (q3d) q1kVar.l;
                            pfgVar3 = (pfg) q1kVar.k;
                            w1kVar2 = (w1k) q1kVar.j;
                            try {
                                qgg.h0(obj8);
                                qqiVar3 = r5;
                                obj = obj2;
                                xqnVar3 = xqnVar2;
                                q3dVar4 = q3dVar5;
                                qqiVar2 = qqiVar3;
                                vqnVar2 = vqnVar;
                                pfgVar4 = pfgVar3;
                                qqiVar2.b(null);
                                xqnVar.a = obj;
                                tqnVar = new tqn();
                                w1kVar3 = w1kVar2;
                                xqnVar4 = xqnVar3;
                                obj7 = xqnVar4.a;
                                if (obj7 != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th6) {
                                th = th6;
                                r5.b(null);
                                throw th;
                            }
                        case 4:
                            o4kVar = (o4k) q1kVar.p;
                            tqn tqnVar4 = (tqn) q1kVar.o;
                            xqn xqnVar11 = (xqn) q1kVar.n;
                            vqn vqnVar6 = (vqn) q1kVar.m;
                            q3d q3dVar9 = (q3d) q1kVar.l;
                            pfg pfgVar15 = (pfg) q1kVar.k;
                            w1k w1kVar12 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            vqnVar3 = vqnVar6;
                            w1kVar4 = w1kVar12;
                            q3dVar6 = q3dVar9;
                            pfgVar5 = pfgVar15;
                            tqnVar2 = tqnVar4;
                            xqnVar5 = xqnVar11;
                            r4kVar = (r4k) obj8;
                            if (r4kVar instanceof q4k) {
                            }
                            return nm6Var;
                        case 5:
                            oqi oqiVar5 = (oqi) q1kVar.s;
                            x1kVar3 = (x1k) q1kVar.r;
                            r4kVar = (r4k) q1kVar.q;
                            o4kVar2 = (o4k) q1kVar.p;
                            tqnVar2 = (tqn) q1kVar.o;
                            xqnVar5 = (xqn) q1kVar.n;
                            vqnVar3 = (vqn) q1kVar.m;
                            q3dVar6 = (q3d) q1kVar.l;
                            pfgVar5 = (pfg) q1kVar.k;
                            w1kVar5 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            oqiVar = oqiVar5;
                            w1k w1kVar92 = w1kVar5;
                            q1k q1kVar32 = q1kVar;
                            if (x1kVar3.b.c(q3dVar6.a, pfgVar5, (q4k) r4kVar)) {
                            }
                            break;
                        case 6:
                            oqi oqiVar6 = (oqi) q1kVar.o;
                            x1kVar4 = (x1k) q1kVar.n;
                            r4kVar = (r4k) q1kVar.m;
                            q3d q3dVar10 = (q3d) q1kVar.l;
                            pfg pfgVar16 = (pfg) q1kVar.k;
                            w1kVar4 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            oqiVar2 = oqiVar6;
                            q1kVar2 = q1kVar;
                            q3dVar6 = q3dVar10;
                            pfgVar6 = pfgVar16;
                            z1kVar3 = x1kVar4.b;
                            lfgVar = new lfg(((p4k) r4kVar).a);
                            q1kVar2.j = pfgVar6;
                            q1kVar2.k = q3dVar6;
                            q1kVar2.l = oqiVar2;
                            q1kVar2.m = z1kVar3;
                            q1kVar2.n = null;
                            q1kVar2.o = null;
                            q1kVar2.w = 7;
                            if (w1kVar4.j(z1kVar3, pfgVar6, lfgVar, q1kVar2) != nm6Var) {
                            }
                            return nm6Var;
                        case 7:
                            z1kVar = (z1k) q1kVar.m;
                            oqiVar3 = (oqi) q1kVar.l;
                            q3dVar7 = (q3d) q1kVar.k;
                            pfgVar6 = (pfg) q1kVar.j;
                            try {
                                qgg.h0(obj8);
                                z1kVar.i.put(pfgVar6, q3dVar7.b);
                                oqiVar3.b(null);
                                return Unit.a;
                            } catch (Throwable th7) {
                                th = th7;
                                oqiVar3.b(null);
                                throw th;
                            }
                        case 8:
                            qqi qqiVar8 = q1kVar.t;
                            x1kVar5 = (x1k) q1kVar.s;
                            pfgVar7 = (pfg) q1kVar.r;
                            obj3 = (r4k) q1kVar.q;
                            o4k o4kVar8 = (o4k) q1kVar.p;
                            tqn tqnVar5 = (tqn) q1kVar.o;
                            xqn xqnVar12 = (xqn) q1kVar.n;
                            vqn vqnVar7 = (vqn) q1kVar.m;
                            q3d q3dVar11 = (q3d) q1kVar.l;
                            pfg pfgVar17 = (pfg) q1kVar.k;
                            w1kVar6 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            pfgVar8 = pfgVar10;
                            o4kVar3 = o4kVar8;
                            tqnVar2 = tqnVar5;
                            xqnVar5 = xqnVar12;
                            vqnVar3 = vqnVar7;
                            q3dVar6 = q3dVar11;
                            qqiVar4 = qqiVar8;
                            pfgVar5 = pfgVar17;
                            z1kVar2 = x1kVar5.b;
                            w1k w1kVar102 = w1kVar6;
                            hiu hiuVar2 = q3dVar6.b;
                            z1kVar2.getClass();
                            pfgVar7.getClass();
                            hiuVar2.getClass();
                            w1kVar7 = w1kVar102;
                            obj4 = obj3;
                            pfgVar9 = pfgVar11;
                            i4 = w1kVar7.i(z1kVar2, pfgVar5, q3dVar6.a, q3dVar6.b.a(pfgVar5) + vqnVar3.a);
                            imeVar = z1kVar2.j;
                            xqnVar5.a = i4;
                            if (i4 == null) {
                                imeVar.W(pfgVar5, !tqnVar2.a ? nfg.b : nfg.c);
                                break;
                            }
                            d = z1kVar2.d((q4k) obj4, pfgVar5);
                            zi3Var = w1kVar7.h;
                            q1kVar.j = w1kVar7;
                            q1kVar.k = pfgVar5;
                            q1kVar.l = q3dVar6;
                            q1kVar.m = vqnVar3;
                            q1kVar.n = xqnVar5;
                            q1kVar.o = tqnVar2;
                            q1kVar.p = o4kVar3;
                            q1kVar.q = obj4;
                            q1kVar.r = qqiVar4;
                            q1kVar.s = null;
                            q1kVar.t = null;
                            q1kVar.w = 10;
                            if (zi3Var.m(d, q1kVar) != nm6Var) {
                            }
                            return nm6Var;
                        case 9:
                            z1k z1kVar6 = (z1k) q1kVar.s;
                            ?? r13 = (oqi) q1kVar.r;
                            obj4 = (r4k) q1kVar.q;
                            o4k o4kVar9 = (o4k) q1kVar.p;
                            tqnVar2 = (tqn) q1kVar.o;
                            xqnVar5 = (xqn) q1kVar.n;
                            vqnVar3 = (vqn) q1kVar.m;
                            q3dVar6 = (q3d) q1kVar.l;
                            pfgVar5 = (pfg) q1kVar.k;
                            w1kVar7 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            pfgVar8 = pfgVar10;
                            o4kVar3 = o4kVar9;
                            qqiVar4 = r13;
                            z1kVar2 = z1kVar6;
                            pfgVar9 = pfgVar11;
                            i4 = w1kVar7.i(z1kVar2, pfgVar5, q3dVar6.a, q3dVar6.b.a(pfgVar5) + vqnVar3.a);
                            imeVar = z1kVar2.j;
                            xqnVar5.a = i4;
                            if (i4 == null) {
                            }
                            d = z1kVar2.d((q4k) obj4, pfgVar5);
                            zi3Var = w1kVar7.h;
                            q1kVar.j = w1kVar7;
                            q1kVar.k = pfgVar5;
                            q1kVar.l = q3dVar6;
                            q1kVar.m = vqnVar3;
                            q1kVar.n = xqnVar5;
                            q1kVar.o = tqnVar2;
                            q1kVar.p = o4kVar3;
                            q1kVar.q = obj4;
                            q1kVar.r = qqiVar4;
                            q1kVar.s = null;
                            q1kVar.t = null;
                            q1kVar.w = 10;
                            if (zi3Var.m(d, q1kVar) != nm6Var) {
                            }
                            return nm6Var;
                        case 10:
                            oqiVar4 = (oqi) q1kVar.r;
                            obj5 = (r4k) q1kVar.q;
                            o4kVar4 = (o4k) q1kVar.p;
                            tqnVar3 = (tqn) q1kVar.o;
                            xqn xqnVar13 = (xqn) q1kVar.n;
                            vqn vqnVar8 = (vqn) q1kVar.m;
                            q3dVar6 = (q3d) q1kVar.l;
                            pfg pfgVar18 = (pfg) q1kVar.k;
                            w1k w1kVar13 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            pfgVar8 = pfgVar10;
                            pfgVar9 = pfgVar11;
                            xqnVar6 = xqnVar13;
                            pfgVar4 = pfgVar18;
                            vqnVar2 = vqnVar8;
                            w1kVar3 = w1kVar13;
                            oqiVar4.b(null);
                            if (o4kVar4 instanceof m4k) {
                            }
                            if (o4kVar4 instanceof l4k) {
                            }
                            w1kVar3.getClass();
                            tqnVar = tqnVar3;
                            q3dVar4 = q3dVar6;
                            pfgVar10 = pfgVar8;
                            pfgVar11 = pfgVar9;
                            xqnVar4 = xqnVar6;
                            obj7 = xqnVar4.a;
                            if (obj7 != null) {
                            }
                            return Unit.a;
                        case 11:
                            oqi oqiVar7 = (oqi) q1kVar.q;
                            x1k x1kVar9 = (x1k) q1kVar.p;
                            tqnVar = (tqn) q1kVar.o;
                            xqnVar4 = (xqn) q1kVar.n;
                            vqnVar2 = (vqn) q1kVar.m;
                            q3dVar4 = (q3d) q1kVar.l;
                            pfgVar4 = (pfg) q1kVar.k;
                            w1kVar3 = (w1k) q1kVar.j;
                            qgg.h0(obj8);
                            try {
                                x1kVar9.b.a((fiu) ((g06) w1kVar3.f.a).c);
                                obj7 = xqnVar4.a;
                                if (obj7 != null) {
                                }
                                return Unit.a;
                            } finally {
                                oqiVar7.b(null);
                            }
                        default:
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (Throwable th8) {
            th = th8;
        }
        q1kVar = new q1k(w1kVar8, continuation);
        Object obj82 = q1kVar.u;
        nm6 nm6Var2 = nm6.a;
        i = q1kVar.w;
        pfg pfgVar102 = pfg.c;
        pfg pfgVar112 = pfg.b;
    }

    public static final Object c(w1k w1kVar, pfg pfgVar, hiu hiuVar, t1k t1kVar) {
        w1kVar.getClass();
        if (k1k.a[pfgVar.ordinal()] == 1) {
            Object f = w1kVar.f(t1kVar);
            return f == nm6.a ? f : Unit.a;
        }
        if (hiuVar == null) {
            xq0.q("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
            return null;
        }
        awc awcVar = w1kVar.f;
        awcVar.getClass();
        if (pfgVar == pfg.b || pfgVar == pfg.c) {
            ((g06) awcVar.a).R(null, new s30(27, pfgVar, hiuVar));
            return Unit.a;
        }
        l1j.p(pfgVar, "invalid load type for reset: ");
        return null;
    }

    public static final void d(w1k w1kVar, mm6 mm6Var) {
        Continuation continuation = null;
        if (w1kVar.c.d != Integer.MIN_VALUE) {
            x97.y(mm6Var, null, null, new m1i(w1kVar, continuation, 21), 3);
        }
        x97.y(mm6Var, null, null, new v1k(w1kVar, continuation, 0), 3);
        x97.y(mm6Var, null, null, new v1k(w1kVar, continuation, 1), 3);
    }

    public static String h(pfg pfgVar, Object obj, r4k r4kVar) {
        if (r4kVar == null) {
            return "End " + pfgVar + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + pfgVar + " with loadKey " + obj + ". Returned " + r4kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        o1k o1kVar;
        int i;
        x1k x1kVar;
        w1k w1kVar;
        qqi qqiVar;
        try {
            if (cg6Var instanceof o1k) {
                o1kVar = (o1k) cg6Var;
                int i2 = o1kVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o1kVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = o1kVar.m;
                    nm6 nm6Var = nm6.a;
                    i = o1kVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        x1kVar = this.i;
                        qqi qqiVar2 = x1kVar.a;
                        o1kVar.j = this;
                        o1kVar.k = x1kVar;
                        o1kVar.l = qqiVar2;
                        o1kVar.o = 1;
                        if (qqiVar2.a(o1kVar) == nm6Var) {
                            return nm6Var;
                        }
                        w1kVar = this;
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = o1kVar.l;
                        x1kVar = o1kVar.k;
                        w1kVar = o1kVar.j;
                        qgg.h0(obj);
                    }
                    return x1kVar.b.a((fiu) ((g06) w1kVar.f.a).c);
                }
            }
            return x1kVar.b.a((fiu) ((g06) w1kVar.f.a).c);
        } finally {
            qqiVar.b(null);
        }
        o1kVar = new o1k(this, cg6Var);
        Object obj2 = o1kVar.m;
        nm6 nm6Var2 = nm6.a;
        i = o1kVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018c A[Catch: all -> 0x0192, TRY_ENTER, TryCatch #1 {all -> 0x0192, blocks: (B:59:0x0172, B:62:0x018c, B:63:0x0195, B:65:0x019c), top: B:58:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c A[Catch: all -> 0x0192, TRY_LEAVE, TryCatch #1 {all -> 0x0192, blocks: (B:59:0x0172, B:62:0x018c, B:63:0x0195, B:65:0x019c), top: B:58:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, s4k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        p1k p1kVar;
        oqi oqiVar;
        x1k x1kVar;
        w1k w1kVar;
        oqi oqiVar2;
        z1k z1kVar;
        w1k w1kVar2;
        w1k w1kVar3;
        r4k r4kVar;
        x1k x1kVar2;
        w1k w1kVar4;
        qqi qqiVar;
        r4k r4kVar2;
        x1k x1kVar3;
        w1k w1kVar5;
        qqi qqiVar2;
        boolean c;
        Object obj;
        x1k x1kVar4;
        qqi qqiVar3;
        r4k r4kVar3;
        w1k w1kVar6;
        oqi oqiVar3;
        zi3 zi3Var;
        a1k d;
        w1k w1kVar7;
        oqi oqiVar4;
        z1k z1kVar2;
        lfg lfgVar;
        try {
            if (cg6Var instanceof p1k) {
                p1kVar = (p1k) cg6Var;
                int i = p1kVar.p;
                if ((i & Integer.MIN_VALUE) != 0) {
                    p1kVar.p = i - Integer.MIN_VALUE;
                    Object obj2 = p1kVar.n;
                    nm6 nm6Var = nm6.a;
                    oqiVar = p1kVar.p;
                    pfg pfgVar = pfg.a;
                    switch (oqiVar) {
                        case 0:
                            qgg.h0(obj2);
                            x1kVar = this.i;
                            qqi qqiVar4 = x1kVar.a;
                            p1kVar.j = this;
                            p1kVar.k = x1kVar;
                            p1kVar.l = qqiVar4;
                            p1kVar.p = 1;
                            if (qqiVar4.a(p1kVar) != nm6Var) {
                                w1kVar = this;
                                oqiVar2 = qqiVar4;
                                z1kVar = x1kVar.b;
                                p1kVar.j = w1kVar;
                                p1kVar.k = oqiVar2;
                                p1kVar.l = null;
                                p1kVar.p = 2;
                                if (w1kVar.k(z1kVar, pfgVar, p1kVar) != nm6Var) {
                                    w1kVar2 = w1kVar;
                                    oqiVar2.b(null);
                                    Object obj3 = w1kVar2.a;
                                    oqiVar = w1kVar2.b;
                                    o4k g = w1kVar2.g(pfgVar, obj3);
                                    if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                                        Log.d("Paging", "Start REFRESH with loadKey " + w1kVar2.a + " on " + oqiVar);
                                    }
                                    p1kVar.j = w1kVar2;
                                    p1kVar.k = null;
                                    p1kVar.p = 3;
                                    obj2 = oqiVar.e(g, p1kVar);
                                    if (obj2 != nm6Var) {
                                        w1kVar3 = w1kVar2;
                                        r4kVar = (r4k) obj2;
                                        if (r4kVar instanceof q4k) {
                                            if (r4kVar instanceof p4k) {
                                                if (hyf.a != null && Log.isLoggable("Paging", 2)) {
                                                    Log.v("Paging", h(pfgVar, w1kVar3.a, r4kVar));
                                                }
                                                x1kVar2 = w1kVar3.i;
                                                qqi qqiVar5 = x1kVar2.a;
                                                p1kVar.j = w1kVar3;
                                                p1kVar.k = r4kVar;
                                                p1kVar.l = x1kVar2;
                                                p1kVar.m = qqiVar5;
                                                p1kVar.p = 8;
                                                if (qqiVar5.a(p1kVar) != nm6Var) {
                                                    w1kVar4 = w1kVar3;
                                                    qqiVar = qqiVar5;
                                                    r4kVar2 = r4kVar;
                                                    try {
                                                        z1kVar2 = x1kVar2.b;
                                                        lfgVar = new lfg(((p4k) r4kVar2).a);
                                                        p1kVar.j = qqiVar;
                                                        p1kVar.k = null;
                                                        p1kVar.l = null;
                                                        p1kVar.m = null;
                                                        p1kVar.p = 9;
                                                        if (w1kVar4.j(z1kVar2, pfgVar, lfgVar, p1kVar) != nm6Var) {
                                                            oqiVar4 = qqiVar;
                                                            oqiVar4.b(null);
                                                            return Unit.a;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        oqiVar4 = qqiVar;
                                                        throw th;
                                                    }
                                                }
                                            }
                                            return Unit.a;
                                        }
                                        x1kVar3 = w1kVar3.i;
                                        qqi qqiVar6 = x1kVar3.a;
                                        p1kVar.j = w1kVar3;
                                        p1kVar.k = r4kVar;
                                        p1kVar.l = x1kVar3;
                                        p1kVar.m = qqiVar6;
                                        p1kVar.p = 4;
                                        if (qqiVar6.a(p1kVar) != nm6Var) {
                                            w1kVar5 = w1kVar3;
                                            qqiVar2 = qqiVar6;
                                            try {
                                                z1k z1kVar3 = x1kVar3.b;
                                                c = z1kVar3.c(0, pfgVar, (q4k) r4kVar);
                                                ime imeVar = z1kVar3.j;
                                                imeVar.W(pfgVar, nfg.c);
                                                obj = ((q4k) r4kVar).b;
                                                nfg nfgVar = nfg.b;
                                                if (obj == null) {
                                                    imeVar.W(pfg.b, nfgVar);
                                                }
                                                if (((q4k) r4kVar).c == null) {
                                                    imeVar.W(pfg.c, nfgVar);
                                                }
                                                if (c) {
                                                    if (hyf.a != null && Log.isLoggable("Paging", 2)) {
                                                        Log.v("Paging", h(pfgVar, w1kVar5.a, null));
                                                    }
                                                    w1kVar5.getClass();
                                                    return Unit.a;
                                                }
                                                if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                                                    Log.d("Paging", h(pfgVar, w1kVar5.a, r4kVar));
                                                }
                                                x1kVar4 = w1kVar5.i;
                                                qqiVar3 = x1kVar4.a;
                                                p1kVar.j = w1kVar5;
                                                p1kVar.k = r4kVar;
                                                p1kVar.l = x1kVar4;
                                                p1kVar.m = qqiVar3;
                                                p1kVar.p = 5;
                                                if (qqiVar3.a(p1kVar) != nm6Var) {
                                                    r4kVar3 = r4kVar;
                                                    w1kVar6 = w1kVar5;
                                                    try {
                                                        z1k z1kVar4 = x1kVar4.b;
                                                        zi3Var = w1kVar6.h;
                                                        d = z1kVar4.d((q4k) r4kVar3, pfgVar);
                                                        p1kVar.j = w1kVar6;
                                                        p1kVar.k = r4kVar3;
                                                        p1kVar.l = qqiVar3;
                                                        p1kVar.m = null;
                                                        p1kVar.p = 6;
                                                        if (zi3Var.m(d, p1kVar) != nm6Var) {
                                                            oqiVar3 = qqiVar3;
                                                            w1kVar7 = w1kVar6;
                                                            oqiVar3.b(null);
                                                            w1kVar5 = w1kVar7;
                                                            w1kVar5.getClass();
                                                            return Unit.a;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        oqiVar3 = qqiVar3;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                            return nm6Var;
                        case 1:
                            oqiVar2 = (oqi) p1kVar.l;
                            x1kVar = (x1k) p1kVar.k;
                            w1kVar = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            z1kVar = x1kVar.b;
                            p1kVar.j = w1kVar;
                            p1kVar.k = oqiVar2;
                            p1kVar.l = null;
                            p1kVar.p = 2;
                            if (w1kVar.k(z1kVar, pfgVar, p1kVar) != nm6Var) {
                            }
                            return nm6Var;
                        case 2:
                            oqiVar2 = (oqi) p1kVar.k;
                            w1kVar2 = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            oqiVar2.b(null);
                            Object obj32 = w1kVar2.a;
                            oqiVar = w1kVar2.b;
                            o4k g2 = w1kVar2.g(pfgVar, obj32);
                            if (hyf.a != null) {
                                Log.d("Paging", "Start REFRESH with loadKey " + w1kVar2.a + " on " + oqiVar);
                                break;
                            }
                            p1kVar.j = w1kVar2;
                            p1kVar.k = null;
                            p1kVar.p = 3;
                            obj2 = oqiVar.e(g2, p1kVar);
                            if (obj2 != nm6Var) {
                            }
                            return nm6Var;
                        case 3:
                            w1kVar3 = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            r4kVar = (r4k) obj2;
                            if (r4kVar instanceof q4k) {
                            }
                            return nm6Var;
                        case 4:
                            qqiVar2 = p1kVar.m;
                            x1kVar3 = (x1k) p1kVar.l;
                            r4k r4kVar4 = (r4k) p1kVar.k;
                            w1kVar5 = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            r4kVar = r4kVar4;
                            z1k z1kVar32 = x1kVar3.b;
                            c = z1kVar32.c(0, pfgVar, (q4k) r4kVar);
                            ime imeVar2 = z1kVar32.j;
                            imeVar2.W(pfgVar, nfg.c);
                            obj = ((q4k) r4kVar).b;
                            nfg nfgVar2 = nfg.b;
                            if (obj == null) {
                            }
                            if (((q4k) r4kVar).c == null) {
                            }
                            if (c) {
                            }
                            break;
                        case 5:
                            qqiVar3 = p1kVar.m;
                            x1kVar4 = (x1k) p1kVar.l;
                            r4kVar3 = (r4k) p1kVar.k;
                            w1kVar6 = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            z1k z1kVar42 = x1kVar4.b;
                            zi3Var = w1kVar6.h;
                            d = z1kVar42.d((q4k) r4kVar3, pfgVar);
                            p1kVar.j = w1kVar6;
                            p1kVar.k = r4kVar3;
                            p1kVar.l = qqiVar3;
                            p1kVar.m = null;
                            p1kVar.p = 6;
                            if (zi3Var.m(d, p1kVar) != nm6Var) {
                            }
                            return nm6Var;
                        case 6:
                            oqiVar3 = (oqi) p1kVar.l;
                            w1kVar7 = (w1k) p1kVar.j;
                            try {
                                qgg.h0(obj2);
                                oqiVar3.b(null);
                                w1kVar5 = w1kVar7;
                                w1kVar5.getClass();
                                return Unit.a;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        case 7:
                            qqi qqiVar7 = p1kVar.m;
                            x1k x1kVar5 = (x1k) p1kVar.l;
                            r4k r4kVar5 = (r4k) p1kVar.k;
                            w1k w1kVar8 = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            try {
                                x1kVar5.b.a((fiu) ((g06) w1kVar8.f.a).c);
                                qqiVar7.b(null);
                                q4k q4kVar = (q4k) r4kVar5;
                                q4kVar.b.getClass();
                                q4kVar.c.getClass();
                                return Unit.a;
                            } catch (Throwable th5) {
                                qqiVar7.b(null);
                                throw th5;
                            }
                        case 8:
                            qqiVar = p1kVar.m;
                            x1kVar2 = (x1k) p1kVar.l;
                            r4kVar2 = (r4k) p1kVar.k;
                            w1kVar4 = (w1k) p1kVar.j;
                            qgg.h0(obj2);
                            z1kVar2 = x1kVar2.b;
                            lfgVar = new lfg(((p4k) r4kVar2).a);
                            p1kVar.j = qqiVar;
                            p1kVar.k = null;
                            p1kVar.l = null;
                            p1kVar.m = null;
                            p1kVar.p = 9;
                            if (w1kVar4.j(z1kVar2, pfgVar, lfgVar, p1kVar) != nm6Var) {
                            }
                            return nm6Var;
                        case 9:
                            oqiVar4 = (oqi) p1kVar.j;
                            try {
                                qgg.h0(obj2);
                                oqiVar4.b(null);
                                return Unit.a;
                            } catch (Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        default:
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (oqiVar) {
            }
        } finally {
            oqiVar.b(null);
        }
        p1kVar = new p1k(this, cg6Var);
        Object obj22 = p1kVar.n;
        nm6 nm6Var2 = nm6.a;
        oqiVar = p1kVar.p;
        pfg pfgVar2 = pfg.a;
    }

    public final o4k g(pfg pfgVar, Object obj) {
        pfgVar.getClass();
        int ordinal = pfgVar.ordinal();
        if (ordinal == 0) {
            return new n4k(obj);
        }
        if (ordinal == 1) {
            if (obj != null) {
                return new m4k(obj);
            }
            xq0.x("key cannot be null for prepend");
            return null;
        }
        if (ordinal != 2) {
            b6e.s();
            return null;
        }
        if (obj != null) {
            return new l4k(obj);
        }
        xq0.x("key cannot be null for append");
        return null;
    }

    public final Object i(z1k z1kVar, pfg pfgVar, int i, int i2) {
        z1kVar.getClass();
        int ordinal = pfgVar.ordinal();
        if (ordinal == 0) {
            xq0.x("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (ordinal != 1 && ordinal != 2) {
            b6e.s();
            return null;
        }
        if (i != 0 || (z1kVar.j.s(pfgVar) instanceof lfg) || i2 >= this.c.b) {
            return null;
        }
        ArrayList arrayList = z1kVar.c;
        return pfgVar == pfg.b ? ((q4k) CollectionsKt.Q(arrayList)).b : ((q4k) CollectionsKt.Y(arrayList)).c;
    }

    public final Object j(z1k z1kVar, pfg pfgVar, lfg lfgVar, cg6 cg6Var) {
        ime imeVar = z1kVar.j;
        if (imeVar.s(pfgVar).equals(lfgVar)) {
            return Unit.a;
        }
        imeVar.W(pfgVar, lfgVar);
        Object m = this.h.m(new b1k(imeVar.Z(), null), cg6Var);
        return m == nm6.a ? m : Unit.a;
    }

    public final Object k(z1k z1kVar, pfg pfgVar, cg6 cg6Var) {
        ime imeVar = z1kVar.j;
        qu2 s = imeVar.s(pfgVar);
        mfg mfgVar = mfg.b;
        if (s.equals(mfgVar)) {
            return Unit.a;
        }
        imeVar.W(pfgVar, mfgVar);
        Object m = this.h.m(new b1k(imeVar.Z(), null), cg6Var);
        return m == nm6.a ? m : Unit.a;
    }
}
