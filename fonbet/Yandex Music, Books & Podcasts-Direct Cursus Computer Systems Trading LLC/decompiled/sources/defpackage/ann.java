package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ann extends uif implements Function1 {
    public final /* synthetic */ cnn r;
    public final /* synthetic */ upi s;
    public final /* synthetic */ upi t;
    public final /* synthetic */ List u;
    public final /* synthetic */ List v;
    public final /* synthetic */ upi w;
    public final /* synthetic */ List x;
    public final /* synthetic */ upi y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ann(cnn cnnVar, upi upiVar, upi upiVar2, List list, List list2, upi upiVar3, List list3, upi upiVar4, Set set) {
        super(1);
        this.r = cnnVar;
        this.s = upiVar;
        this.t = upiVar2;
        this.u = list;
        this.v = list2;
        this.w = upiVar3;
        this.x = list3;
        this.y = upiVar4;
        this.z = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r0.i() == true) goto L17;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        Object[] objArr;
        char c;
        long j;
        boolean z2;
        long longValue = ((Number) obj).longValue();
        cnn cnnVar = this.r;
        synchronized (cnnVar.c) {
            z = cnnVar.z();
        }
        if (z) {
            cnn cnnVar2 = this.r;
            Trace.beginSection("Recomposer:animation");
            try {
                cnnVar2.b.c(longValue);
                synchronized (g2r.b) {
                    upi upiVar = g2r.i.h;
                    z2 = upiVar != null;
                }
                if (z2) {
                    g2r.a();
                }
            } finally {
            }
        }
        cnn cnnVar3 = this.r;
        upi upiVar2 = this.s;
        upi upiVar3 = this.t;
        List list = this.u;
        List list2 = this.v;
        upi upiVar4 = this.w;
        List list3 = this.x;
        upi upiVar5 = this.y;
        Set set = this.z;
        Trace.beginSection("Recomposer:recompose");
        try {
            cnn.u(cnnVar3);
            synchronized (cnnVar3.c) {
                try {
                    eqi eqiVar = cnnVar3.i;
                    Object[] objArr2 = eqiVar.a;
                    int i = eqiVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        list.add((wr5) objArr2[i2]);
                    }
                    cnnVar3.i.i();
                } finally {
                }
            }
            upiVar2.c();
            upiVar3.c();
            while (true) {
                if (list.isEmpty() && list2.isEmpty()) {
                    break;
                }
                try {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        wr5 wr5Var = (wr5) list.get(i3);
                        wr5 t = cnn.t(cnnVar3, wr5Var, upiVar2);
                        if (t != null) {
                            list3.add(t);
                        }
                        upiVar3.a(wr5Var);
                    }
                    list.clear();
                    if (upiVar2.i() || cnnVar3.i.c != 0) {
                        synchronized (cnnVar3.c) {
                            try {
                                List B = cnnVar3.B();
                                int size2 = B.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    wr5 wr5Var2 = (wr5) B.get(i4);
                                    if (!upiVar3.d(wr5Var2) && wr5Var2.w(set)) {
                                        list.add(wr5Var2);
                                    }
                                }
                                eqi eqiVar2 = cnnVar3.i;
                                int i5 = eqiVar2.c;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    objArr = eqiVar2.a;
                                    if (i6 >= i5) {
                                        break;
                                    }
                                    wr5 wr5Var3 = (wr5) objArr[i6];
                                    if (!upiVar3.d(wr5Var3) && !list.contains(wr5Var3)) {
                                        list.add(wr5Var3);
                                        i7++;
                                    } else if (i7 > 0) {
                                        Object[] objArr3 = eqiVar2.a;
                                        objArr3[i6 - i7] = objArr3[i6];
                                    }
                                    i6++;
                                }
                                int i8 = i5 - i7;
                                Arrays.fill(objArr, i8, i5, (Object) null);
                                eqiVar2.c = i8;
                            } finally {
                            }
                        }
                    }
                    if (list.isEmpty()) {
                        try {
                            bnn.l(list2, cnnVar3);
                            while (!list2.isEmpty()) {
                                List E = cnnVar3.E(list2, upiVar2);
                                upiVar4.getClass();
                                E.getClass();
                                Iterator it = E.iterator();
                                while (it.hasNext()) {
                                    upiVar4.l(it.next());
                                }
                                bnn.l(list2, cnnVar3);
                            }
                        } catch (Throwable th) {
                            cnnVar3.F(th, null);
                            bnn.k(cnnVar3, list, list2, list3, upiVar4, upiVar5, upiVar2, upiVar3);
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        cnnVar3.F(th2, null);
                        bnn.k(cnnVar3, list, list2, list3, upiVar4, upiVar5, upiVar2, upiVar3);
                    } finally {
                        list.clear();
                    }
                }
            }
            if (!list3.isEmpty()) {
                cnnVar3.a++;
                try {
                    int size3 = list3.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        upiVar5.a((wr5) list3.get(i9));
                    }
                    int size4 = list3.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        ((wr5) list3.get(i10)).h();
                    }
                } catch (Throwable th3) {
                    try {
                        cnnVar3.F(th3, null);
                        bnn.k(cnnVar3, list, list2, list3, upiVar4, upiVar5, upiVar2, upiVar3);
                    } finally {
                        list3.clear();
                    }
                }
            }
            long j2 = 255;
            if (upiVar4.i()) {
                try {
                    upiVar5.k(upiVar4);
                    Object[] objArr4 = upiVar4.b;
                    c = 7;
                    long[] jArr = upiVar4.a;
                    j = 128;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j3 = jArr[i11];
                            Object[] objArr5 = objArr4;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j3 & 255) < 128) {
                                        ((wr5) objArr5[(i11 << 3) + i13]).j();
                                    }
                                    j3 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                            objArr4 = objArr5;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        cnnVar3.F(th4, null);
                        bnn.k(cnnVar3, list, list2, list3, upiVar4, upiVar5, upiVar2, upiVar3);
                        upiVar4.c();
                    } finally {
                        upiVar4.c();
                    }
                }
            } else {
                c = 7;
                j = 128;
            }
            if (upiVar5.i()) {
                try {
                    Object[] objArr6 = upiVar5.b;
                    long[] jArr2 = upiVar5.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j4 = jArr2[i14];
                            Object[] objArr7 = objArr6;
                            long[] jArr3 = jArr2;
                            if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j4 & j2) < j) {
                                        ((wr5) objArr7[(i14 << 3) + i16]).k();
                                    }
                                    j4 >>= 8;
                                    i16++;
                                    j2 = 255;
                                }
                                if (i15 != 8) {
                                    break;
                                }
                            }
                            if (i14 == length2) {
                                break;
                            }
                            i14++;
                            objArr6 = objArr7;
                            jArr2 = jArr3;
                            j2 = 255;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        cnnVar3.F(th5, null);
                        bnn.k(cnnVar3, list, list2, list3, upiVar4, upiVar5, upiVar2, upiVar3);
                        upiVar5.c();
                    } finally {
                        upiVar5.c();
                    }
                }
            }
            synchronized (cnnVar3.c) {
                cnnVar3.y();
            }
            g2r.k().m();
            upiVar3.c();
            upiVar2.c();
            cnnVar3.q = null;
            return Unit.a;
        } finally {
        }
    }
}
