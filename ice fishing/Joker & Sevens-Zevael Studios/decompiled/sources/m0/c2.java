package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c2 extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public List f4533g;

    /* renamed from: h, reason: collision with root package name */
    public List f4534h;

    /* renamed from: i, reason: collision with root package name */
    public List f4535i;

    /* renamed from: j, reason: collision with root package name */
    public s.h0 f4536j;

    /* renamed from: k, reason: collision with root package name */
    public s.h0 f4537k;

    /* renamed from: l, reason: collision with root package name */
    public s.h0 f4538l;

    /* renamed from: m, reason: collision with root package name */
    public Set f4539m;

    /* renamed from: n, reason: collision with root package name */
    public s.h0 f4540n;

    /* renamed from: o, reason: collision with root package name */
    public int f4541o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ a1 f4542p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d2 f4543q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, fc.d dVar) {
        super(3, dVar);
        this.f4543q = d2Var;
    }

    public static final void f(d2 d2Var, List list, List list2, List list3, s.h0 h0Var, s.h0 h0Var2, s.h0 h0Var3, s.h0 h0Var4) {
        char c3;
        long j3;
        long j6;
        synchronized (d2Var.f4550b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y yVar = (y) list3.get(i10);
                    yVar.a();
                    d2Var.C(yVar);
                }
                list3.clear();
                Object[] objArr = h0Var.f6275b;
                long[] jArr = h0Var.f6274a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    j3 = 255;
                    while (true) {
                        long j10 = jArr[i11];
                        c3 = 7;
                        j6 = -9187201950435737472L;
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j10 & 255) < 128) {
                                    y yVar2 = (y) objArr[(i11 << 3) + i13];
                                    yVar2.a();
                                    d2Var.C(yVar2);
                                }
                                j10 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                } else {
                    c3 = 7;
                    j3 = 255;
                    j6 = -9187201950435737472L;
                }
                h0Var.b();
                Object[] objArr2 = h0Var2.f6275b;
                long[] jArr2 = h0Var2.f6274a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j11 = jArr2[i14];
                        if ((((~j11) << c3) & j11 & j6) != j6) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j11 & j3) < 128) {
                                    ((y) objArr2[(i14 << 3) + i16]).g();
                                }
                                j11 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                h0Var2.b();
                h0Var3.b();
                Object[] objArr3 = h0Var4.f6275b;
                long[] jArr3 = h0Var4.f6274a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr3[i17];
                        if ((((~j12) << c3) & j12 & j6) != j6) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j12 & j3) < 128) {
                                    y yVar3 = (y) objArr3[(i17 << 3) + i19];
                                    yVar3.a();
                                    d2Var.C(yVar3);
                                }
                                j12 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length3) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                h0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void g(List list, d2 d2Var) {
        list.clear();
        synchronized (d2Var.f4550b) {
            try {
                ArrayList arrayList = d2Var.f4558j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((c1) arrayList.get(i10));
                }
                d2Var.f4558j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        c2 c2Var = new c2(this.f4543q, (fc.d) obj3);
        c2Var.f4542p = (a1) obj2;
        c2Var.invokeSuspend(ac.o.f277a);
        return gc.a.f2559g;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0125 -> B:6:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c5 -> B:20:0x0094). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a1 a1Var;
        s.h0 h0Var;
        s.h0 h0Var2;
        List list;
        Set set;
        final List list2;
        s.h0 h0Var3;
        List list3;
        s.h0 h0Var4;
        final List list4;
        final s.h0 h0Var5;
        final List list5;
        final s.h0 h0Var6;
        d2 d2Var;
        Object obj2;
        yc.g gVar;
        gc.a aVar;
        a1 a1Var2;
        s.a0 a0Var;
        c2 c2Var = this;
        gc.a aVar2 = gc.a.f2559g;
        int i10 = c2Var.f4541o;
        int i11 = 2;
        int i12 = 1;
        if (i10 == 0) {
            v6.a.W(obj);
            a1Var = c2Var.f4542p;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i13 = s.p0.f6316a;
            h0Var = new s.h0();
            s.h0 h0Var7 = new s.h0();
            s.h0 h0Var8 = new s.h0();
            o0.h hVar = new o0.h(h0Var8);
            h0Var2 = new s.h0();
            list = arrayList;
            set = hVar;
            list2 = arrayList2;
            h0Var3 = h0Var8;
            list3 = arrayList3;
            h0Var4 = h0Var7;
            synchronized (c2Var.f4543q.f4550b) {
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.h0 h0Var9 = c2Var.f4540n;
                set = c2Var.f4539m;
                h0Var3 = c2Var.f4538l;
                h0Var4 = c2Var.f4537k;
                h0Var = c2Var.f4536j;
                list3 = c2Var.f4535i;
                list2 = c2Var.f4534h;
                list = c2Var.f4533g;
                a1 a1Var3 = c2Var.f4542p;
                v6.a.W(obj);
                h0Var2 = h0Var9;
                a1Var = a1Var3;
                d2 d2Var2 = c2Var.f4543q;
                synchronized (d2Var2.f4550b) {
                    try {
                        if (d2Var2.f4559k.j()) {
                            s.a0 b2 = o0.a.b(d2Var2.f4559k);
                            d2Var2.f4559k.a();
                            x4.e eVar = d2Var2.f4560l;
                            ((s.g0) eVar.f8294g).a();
                            ((s.g0) eVar.f8295h).a();
                            d2Var2.f4562n.a();
                            a0Var = new s.a0(b2.f6220b);
                            Object[] objArr = b2.f6219a;
                            int i14 = b2.f6220b;
                            aVar = aVar2;
                            int i15 = 0;
                            while (i15 < i14) {
                                int i16 = i15;
                                c1 c1Var = (c1) objArr[i15];
                                a0Var.a(new ac.i(c1Var, d2Var2.f4561m.g(c1Var)));
                                i15 = i16 + 1;
                                a1Var = a1Var;
                            }
                            a1Var2 = a1Var;
                            d2Var2.f4561m.a();
                        } else {
                            aVar = aVar2;
                            a1Var2 = a1Var;
                            a0Var = s.l0.f6303b;
                            pc.j.c(a0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = a0Var.f6219a;
                int i17 = a0Var.f6220b;
                for (int i18 = 0; i18 < i17; i18++) {
                    ac.i iVar = (ac.i) objArr2[i18];
                }
                i11 = 2;
                i12 = 1;
                c2Var = this;
                aVar2 = aVar;
                a1Var = a1Var2;
                synchronized (c2Var.f4543q.f4550b) {
                }
                d2 d2Var3 = c2Var.f4543q;
                c2Var.f4542p = a1Var;
                c2Var.f4533g = list;
                c2Var.f4534h = list2;
                c2Var.f4535i = list3;
                c2Var.f4536j = h0Var;
                c2Var.f4537k = h0Var4;
                c2Var.f4538l = h0Var3;
                c2Var.f4539m = set;
                c2Var.f4540n = h0Var2;
                c2Var.f4541o = i12;
                if (d2Var3.v()) {
                    obj2 = ac.o.f277a;
                } else {
                    yc.g gVar2 = new yc.g(i12, bc.a0.w(c2Var));
                    gVar2.q();
                    synchronized (d2Var3.f4550b) {
                        if (d2Var3.v()) {
                            gVar = gVar2;
                        } else {
                            d2Var3.f4565q = gVar2;
                            gVar = null;
                        }
                    }
                    if (gVar != null) {
                        gVar.resumeWith(ac.o.f277a);
                    }
                    obj2 = gVar2.p();
                    if (obj2 != gc.a.f2559g) {
                        obj2 = ac.o.f277a;
                    }
                }
                if (obj2 != aVar2) {
                    List list6 = list;
                    h0Var5 = h0Var;
                    h0Var6 = h0Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final s.h0 h0Var10 = h0Var4;
                    final s.h0 h0Var11 = h0Var3;
                    d2Var = c2Var.f4543q;
                    bd.e0 e0Var = d2.f4547x;
                    if (d2Var.B()) {
                        List list7 = list4;
                        h0Var2 = h0Var6;
                        h0Var = h0Var5;
                        list = list5;
                        list3 = list7;
                        c2Var = this;
                        h0Var3 = h0Var11;
                        h0Var4 = h0Var10;
                        set = set2;
                        synchronized (c2Var.f4543q.f4550b) {
                        }
                    } else {
                        final d2 d2Var4 = c2Var.f4543q;
                        oc.c cVar = new oc.c() { // from class: m0.b2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // oc.c
                            public final Object invoke(Object obj3) {
                                boolean u10;
                                boolean z10;
                                d2 d2Var5 = d2.this;
                                s.h0 h0Var12 = h0Var11;
                                s.h0 h0Var13 = h0Var6;
                                List list8 = list5;
                                List list9 = list2;
                                s.h0 h0Var14 = h0Var5;
                                List list10 = list4;
                                s.h0 h0Var15 = h0Var10;
                                Set set3 = set2;
                                long longValue = ((Long) obj3).longValue();
                                synchronized (d2Var5.f4550b) {
                                    u10 = d2Var5.u();
                                }
                                boolean z11 = 0;
                                if (u10) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        d2Var5.f4549a.c(longValue);
                                        synchronized (w0.m.f7580c) {
                                            s.h0 h0Var16 = w0.m.f7587j.f7547h;
                                            if (h0Var16 != null) {
                                                z10 = h0Var16.h();
                                            }
                                        }
                                        if (z10) {
                                            w0.m.a();
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    d2Var5.B();
                                    synchronized (d2Var5.f4550b) {
                                        try {
                                            o0.e eVar2 = d2Var5.f4556h;
                                            Object[] objArr3 = eVar2.f5134g;
                                            int i19 = eVar2.f5136i;
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                list8.add((y) objArr3[i20]);
                                            }
                                            d2Var5.f4556h.g();
                                        } finally {
                                        }
                                    }
                                    h0Var12.b();
                                    h0Var13.b();
                                    while (true) {
                                        if (list8.isEmpty() && list9.isEmpty()) {
                                            break;
                                        }
                                        try {
                                            int size = list8.size();
                                            for (int i21 = 0; i21 < size; i21++) {
                                                y yVar = (y) list8.get(i21);
                                                y z12 = d2Var5.z(yVar, h0Var12);
                                                if (z12 != null) {
                                                    list10.add(z12);
                                                }
                                                h0Var13.a(yVar);
                                            }
                                            list8.clear();
                                            if (h0Var12.h() || d2Var5.f4556h.f5136i != 0) {
                                                synchronized (d2Var5.f4550b) {
                                                    try {
                                                        List w3 = d2Var5.w();
                                                        int size2 = w3.size();
                                                        for (int i22 = 0; i22 < size2; i22++) {
                                                            y yVar2 = (y) w3.get(i22);
                                                            if (!h0Var13.c(yVar2) && yVar2.v(set3)) {
                                                                list8.add(yVar2);
                                                            }
                                                        }
                                                        o0.e eVar3 = d2Var5.f4556h;
                                                        int i23 = eVar3.f5136i;
                                                        int i24 = 0;
                                                        for (int i25 = 0; i25 < i23; i25++) {
                                                            y yVar3 = (y) eVar3.f5134g[i25];
                                                            if (!h0Var13.c(yVar3) && !list8.contains(yVar3)) {
                                                                list8.add(yVar3);
                                                                i24++;
                                                            } else if (i24 > 0) {
                                                                Object[] objArr4 = eVar3.f5134g;
                                                                objArr4[i25 - i24] = objArr4[i25];
                                                            }
                                                        }
                                                        int i26 = i23 - i24;
                                                        Arrays.fill(eVar3.f5134g, i26, i23, (Object) null);
                                                        eVar3.f5136i = i26;
                                                    } finally {
                                                    }
                                                }
                                            }
                                            if (list8.isEmpty()) {
                                                try {
                                                    c2.g(list9, d2Var5);
                                                    while (!list9.isEmpty()) {
                                                        List y10 = d2Var5.y(list9, h0Var12);
                                                        h0Var14.getClass();
                                                        Iterator it = y10.iterator();
                                                        while (it.hasNext()) {
                                                            h0Var14.i(it.next());
                                                        }
                                                        c2.g(list9, d2Var5);
                                                    }
                                                } catch (Throwable th2) {
                                                    d2Var5.A(th2, null);
                                                    c2.f(d2Var5, list8, list9, list10, h0Var14, h0Var15, h0Var12, h0Var13);
                                                }
                                            }
                                            z11 = 0;
                                        } catch (Throwable th3) {
                                            try {
                                                d2Var5.A(th3, null);
                                                c2.f(d2Var5, list8, list9, list10, h0Var14, h0Var15, h0Var12, h0Var13);
                                            } finally {
                                                list8.clear();
                                            }
                                        }
                                    }
                                    w0.g k3 = w0.m.k();
                                    w0.g zVar = k3 instanceof w0.c ? new w0.z((w0.c) k3, null, null, true, false) : new w0.a0(k3, null, true, z11);
                                    try {
                                        w0.g j3 = zVar.j();
                                        try {
                                            if (!list10.isEmpty()) {
                                                try {
                                                    int size3 = list10.size();
                                                    for (int i27 = z11; i27 < size3; i27++) {
                                                        h0Var15.a((y) list10.get(i27));
                                                    }
                                                    int size4 = list10.size();
                                                    for (int i28 = z11; i28 < size4; i28++) {
                                                        ((y) list10.get(i28)).d();
                                                    }
                                                } catch (Throwable th4) {
                                                    try {
                                                        d2Var5.A(th4, null);
                                                        c2.f(d2Var5, list8, list9, list10, h0Var14, h0Var15, h0Var12, h0Var13);
                                                        return ac.o.f277a;
                                                    } finally {
                                                        list10.clear();
                                                    }
                                                }
                                            }
                                            if (h0Var14.h()) {
                                                try {
                                                    h0Var15.j(h0Var14);
                                                    Object[] objArr5 = h0Var14.f6275b;
                                                    long[] jArr = h0Var14.f6274a;
                                                    int length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        int i29 = 0;
                                                        while (true) {
                                                            long j6 = jArr[i29];
                                                            Object[] objArr6 = objArr5;
                                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i30 = 8 - ((~(i29 - length)) >>> 31);
                                                                for (int i31 = 0; i31 < i30; i31++) {
                                                                    if ((j6 & 255) < 128) {
                                                                        ((y) objArr6[(i29 << 3) + i31]).f();
                                                                    }
                                                                    j6 >>= 8;
                                                                }
                                                                if (i30 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i29 == length) {
                                                                break;
                                                            }
                                                            i29++;
                                                            objArr5 = objArr6;
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    try {
                                                        d2Var5.A(th5, null);
                                                        c2.f(d2Var5, list8, list9, list10, h0Var14, h0Var15, h0Var12, h0Var13);
                                                        w0.g.q(j3);
                                                        return ac.o.f277a;
                                                    } finally {
                                                        h0Var14.b();
                                                    }
                                                }
                                            }
                                            if (h0Var15.h()) {
                                                try {
                                                    Object[] objArr7 = h0Var15.f6275b;
                                                    long[] jArr2 = h0Var15.f6274a;
                                                    int length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        int i32 = 0;
                                                        while (true) {
                                                            long j10 = jArr2[i32];
                                                            Object[] objArr8 = objArr7;
                                                            long[] jArr3 = jArr2;
                                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i33 = 8 - ((~(i32 - length2)) >>> 31);
                                                                for (int i34 = 0; i34 < i33; i34++) {
                                                                    if ((j10 & 255) < 128) {
                                                                        ((y) objArr8[(i32 << 3) + i34]).g();
                                                                    }
                                                                    j10 >>= 8;
                                                                }
                                                                if (i33 != 8) {
                                                                    break;
                                                                }
                                                            }
                                                            if (i32 == length2) {
                                                                break;
                                                            }
                                                            i32++;
                                                            objArr7 = objArr8;
                                                            jArr2 = jArr3;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        d2Var5.A(th6, null);
                                                        c2.f(d2Var5, list8, list9, list10, h0Var14, h0Var15, h0Var12, h0Var13);
                                                        w0.g.q(j3);
                                                        return ac.o.f277a;
                                                    } finally {
                                                        h0Var15.b();
                                                    }
                                                }
                                            }
                                            zVar.c();
                                            synchronized (d2Var5.f4550b) {
                                                d2Var5.t();
                                            }
                                            w0.m.k().m();
                                            h0Var13.b();
                                            h0Var12.b();
                                            d2Var5.f4564p = null;
                                            return ac.o.f277a;
                                        } finally {
                                            w0.g.q(j3);
                                        }
                                    } finally {
                                        zVar.c();
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        };
                        c2Var.f4542p = a1Var;
                        c2Var.f4533g = list5;
                        c2Var.f4534h = list2;
                        c2Var.f4535i = list4;
                        c2Var.f4536j = h0Var5;
                        c2Var.f4537k = h0Var10;
                        c2Var.f4538l = h0Var11;
                        c2Var.f4539m = set2;
                        c2Var.f4540n = h0Var6;
                        c2Var.f4541o = i11;
                        if (a1Var.l(cVar, c2Var) != aVar2) {
                            List list8 = list4;
                            h0Var2 = h0Var6;
                            h0Var = h0Var5;
                            list = list5;
                            list3 = list8;
                            h0Var3 = h0Var11;
                            h0Var4 = h0Var10;
                            set = set2;
                            d2 d2Var22 = c2Var.f4543q;
                            synchronized (d2Var22.f4550b) {
                            }
                        }
                    }
                }
                return aVar2;
            }
            s.h0 h0Var12 = c2Var.f4540n;
            set = c2Var.f4539m;
            h0Var3 = c2Var.f4538l;
            h0Var4 = c2Var.f4537k;
            s.h0 h0Var13 = c2Var.f4536j;
            List list9 = c2Var.f4535i;
            list2 = c2Var.f4534h;
            List list10 = c2Var.f4533g;
            a1 a1Var4 = c2Var.f4542p;
            v6.a.W(obj);
            h0Var6 = h0Var12;
            a1Var = a1Var4;
            list4 = list9;
            list5 = list10;
            h0Var5 = h0Var13;
            final Set set22 = set;
            final s.h0 h0Var102 = h0Var4;
            final s.h0 h0Var112 = h0Var3;
            d2Var = c2Var.f4543q;
            bd.e0 e0Var2 = d2.f4547x;
            if (d2Var.B()) {
            }
        }
    }
}
