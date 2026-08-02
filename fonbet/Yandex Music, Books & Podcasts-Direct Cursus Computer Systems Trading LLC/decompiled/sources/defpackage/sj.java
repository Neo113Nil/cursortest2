package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import android.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.UUID;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class sj {
    public int a;
    public Object b;
    public Object c;
    public final Object d;
    public Object e;
    public Object f;

    public sj(int i) {
        l18 l18Var = l18.b;
        switch (i) {
            case 3:
                this.b = gld.e(dm6.b().plus(a4g.n()).plus(new im6("DeviceInfoReporter")));
                this.d = l18Var.b(hag.I(frt.class), true);
                this.e = btf.b(new bv7(5));
                this.f = btf.b(new bv7(6));
                break;
            default:
                this.a = wct.t();
                this.b = l18Var.b(hag.I(i0j.class), true);
                this.c = l18Var.b(hag.I(o36.class), true);
                this.d = new vy5(R.string.concert_tab_buy_from_button, 10, null);
                this.e = l18Var.b(hag.I(rw5.class), true);
                this.f = l18Var.b(hag.I(nmj.class), true);
                break;
        }
    }

    public static boolean k() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((q36) ((byb) qdcVar.C(I)).b(q36.class)).h();
    }

    public static boolean l() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((s36) ((byb) qdcVar.C(I)).c(ern.a(s36.class))).h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r9 < r2.b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, d7k d7kVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        int i = this.a;
        if (i != 0) {
            if (i != -1 && priorityQueue.size() >= this.a) {
                cyn cynVar = (cyn) priorityQueue.peek();
                int i2 = dvt.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            d7k d7kVar2 = arrayDeque2.isEmpty() ? new d7k() : (d7k) arrayDeque2.pop();
            d7kVar2.E(d7kVar.a());
            System.arraycopy(d7kVar.a, d7kVar.b, d7kVar2.a, 0, d7kVar2.a());
            cyn cynVar2 = (cyn) this.f;
            if (cynVar2 != null && j == cynVar2.b) {
                cynVar2.a.add(d7kVar2);
                return;
            }
            cyn cynVar3 = arrayDeque.isEmpty() ? new cyn() : (cyn) arrayDeque.pop();
            ArrayList arrayList = cynVar3.a;
            vq1.v(j != -9223372036854775807L);
            vq1.A(arrayList.isEmpty());
            cynVar3.b = j;
            arrayList.add(d7kVar2);
            priorityQueue.add(cynVar3);
            this.f = cynVar3;
            int i3 = this.a;
            if (i3 != -1) {
                h(i3);
                return;
            }
            return;
        }
        ((dyn) this.b).a(j, d7kVar);
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rj rjVar = (rj) arrayList.get(i2);
            int i3 = rjVar.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = rjVar.b;
                    int i5 = rjVar.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(rjVar.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qzc) this.e).i((rj) arrayList.get(i));
        }
        p(arrayList);
        this.a = 0;
    }

    public void d() {
        qzc qzcVar = (qzc) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rj rjVar = (rj) arrayList.get(i);
            int i2 = rjVar.a;
            if (i2 == 1) {
                qzcVar.i(rjVar);
                qzcVar.z(rjVar.b, rjVar.d);
            } else if (i2 == 2) {
                qzcVar.i(rjVar);
                int i3 = rjVar.b;
                int i4 = rjVar.d;
                RecyclerView recyclerView = (RecyclerView) qzcVar.b;
                recyclerView.h0(i3, i4, true);
                recyclerView.Q0 = true;
                recyclerView.N0.c += i4;
            } else if (i2 == 4) {
                qzcVar.i(rjVar);
                qzcVar.v(rjVar.b, rjVar.d, rjVar.c);
            } else if (i2 == 8) {
                qzcVar.i(rjVar);
                qzcVar.A(rjVar.b, rjVar.d);
            }
        }
        p(arrayList);
        this.a = 0;
    }

    public void e(rj rjVar) {
        int i;
        dhm dhmVar = (dhm) this.b;
        int i2 = rjVar.a;
        if (i2 == 1 || i2 == 8) {
            xq0.x("should not dispatch add or move for pre layout");
            return;
        }
        int q = q(rjVar.b, i2);
        int i3 = rjVar.b;
        int i4 = rjVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                kac.j(rjVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < rjVar.d; i6++) {
            int q2 = q((i * i6) + rjVar.b, rjVar.a);
            int i7 = rjVar.a;
            if (i7 == 2 ? q2 != q : !(i7 == 4 && q2 == q + 1)) {
                rj m = m(i7, q, rjVar.c, i5);
                f(m, i3);
                m.c = null;
                dhmVar.c(m);
                if (rjVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                q = q2;
            } else {
                i5++;
            }
        }
        Object obj = rjVar.c;
        rjVar.c = null;
        dhmVar.c(rjVar);
        if (i5 > 0) {
            rj m2 = m(rjVar.a, q, obj, i5);
            f(m2, i3);
            m2.c = null;
            dhmVar.c(m2);
        }
    }

    public void f(rj rjVar, int i) {
        qzc qzcVar = (qzc) this.e;
        qzcVar.i(rjVar);
        int i2 = rjVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                qzcVar.v(i, rjVar.d, rjVar.c);
                return;
            } else {
                xq0.x("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = rjVar.d;
        RecyclerView recyclerView = (RecyclerView) qzcVar.b;
        recyclerView.h0(i, i3, true);
        recyclerView.Q0 = true;
        recyclerView.N0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            rj rjVar = (rj) arrayList.get(i2);
            int i3 = rjVar.a;
            int i4 = rjVar.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = rjVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (rjVar.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = rjVar.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += rjVar.d;
            }
            i2++;
        }
        return i;
    }

    public void h(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            cyn cynVar = (cyn) priorityQueue.poll();
            int i2 = dvt.a;
            int i3 = 0;
            while (true) {
                arrayList = cynVar.a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                ((dyn) this.b).a(cynVar.b, (d7k) arrayList.get(i3));
                ((ArrayDeque) this.c).push((d7k) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            cyn cynVar2 = (cyn) this.f;
            if (cynVar2 != null && cynVar2.b == cynVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(cynVar);
        }
    }

    public Object i() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == ((hzr) this.c).a.getLooper()) {
            return this.e;
        }
        vq1.A(myLooper == ((hzr) this.b).a.getLooper());
        return this.f;
    }

    public boolean j() {
        return ((ArrayList) this.c).size() > 0;
    }

    public rj m(int i, int i2, Object obj, int i3) {
        rj rjVar = (rj) ((dhm) this.b).f();
        if (rjVar != null) {
            rjVar.a = i;
            rjVar.b = i2;
            rjVar.d = i3;
            rjVar.c = obj;
            return rjVar;
        }
        rj rjVar2 = new rj();
        rjVar2.a = i;
        rjVar2.b = i2;
        rjVar2.d = i3;
        rjVar2.c = obj;
        return rjVar2;
    }

    public void n(rj rjVar) {
        qzc qzcVar = (qzc) this.e;
        ((ArrayList) this.d).add(rjVar);
        int i = rjVar.a;
        if (i == 1) {
            qzcVar.z(rjVar.b, rjVar.d);
            return;
        }
        if (i == 2) {
            int i2 = rjVar.b;
            int i3 = rjVar.d;
            RecyclerView recyclerView = (RecyclerView) qzcVar.b;
            recyclerView.h0(i2, i3, false);
            recyclerView.Q0 = true;
            return;
        }
        if (i == 4) {
            qzcVar.v(rjVar.b, rjVar.d, rjVar.c);
        } else if (i == 8) {
            qzcVar.A(rjVar.b, rjVar.d);
        } else {
            kac.j(rjVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o() {
        boolean z;
        char c;
        rj m;
        int i;
        int i2;
        rj m2;
        boolean z2;
        boolean z3;
        Object obj;
        rj rjVar;
        dhm dhmVar = (dhm) this.b;
        qzc qzcVar = (qzc) this.e;
        pv9 pv9Var = (pv9) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        pv9Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((rj) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            sj sjVar = (sj) pv9Var.b;
            dhm dhmVar2 = (dhm) sjVar.b;
            rj rjVar2 = (rj) arrayList.get(size);
            rj rjVar3 = (rj) arrayList.get(i3);
            int i4 = rjVar3.a;
            if (i4 == 1) {
                int i5 = rjVar2.d;
                int i6 = rjVar3.b;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = rjVar2.b;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    rjVar2.b = i8 + rjVar3.d;
                }
                int i9 = rjVar3.b;
                if (i9 <= i5) {
                    rjVar2.d = i5 + rjVar3.d;
                }
                rjVar3.b = i9 + i7;
                arrayList.set(size, rjVar3);
                arrayList.set(i3, rjVar2);
            } else if (i4 == 2) {
                int i10 = rjVar2.b;
                int i11 = rjVar2.d;
                int i12 = rjVar3.b;
                if (i10 < i11) {
                    if (i12 == i10 && rjVar3.d == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && rjVar3.d == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    rjVar3.b = i12 - 1;
                } else {
                    int i13 = rjVar3.d;
                    if (i11 < i12 + i13) {
                        rjVar3.d = i13 - 1;
                        rjVar2.a = 2;
                        rjVar2.d = 1;
                        if (rjVar3.d == 0) {
                            arrayList.remove(i3);
                            rjVar3.c = null;
                            dhmVar2.c(rjVar3);
                        }
                    }
                }
                int i14 = rjVar2.b;
                int i15 = rjVar3.b;
                if (i14 <= i15) {
                    rjVar3.b = i15 + 1;
                } else {
                    int i16 = i15 + rjVar3.d;
                    if (i14 < i16) {
                        obj = null;
                        rj m3 = sjVar.m(2, i14 + 1, null, i16 - i14);
                        rjVar3.d = rjVar2.b - rjVar3.b;
                        rjVar = m3;
                        if (z3) {
                            if (z2) {
                                if (rjVar != null) {
                                    int i17 = rjVar2.b;
                                    if (i17 > rjVar.b) {
                                        rjVar2.b = i17 - rjVar.d;
                                    }
                                    int i18 = rjVar2.d;
                                    if (i18 > rjVar.b) {
                                        rjVar2.d = i18 - rjVar.d;
                                    }
                                }
                                int i19 = rjVar2.b;
                                if (i19 > rjVar3.b) {
                                    rjVar2.b = i19 - rjVar3.d;
                                }
                                int i20 = rjVar2.d;
                                if (i20 > rjVar3.b) {
                                    rjVar2.d = i20 - rjVar3.d;
                                }
                            } else {
                                if (rjVar != null) {
                                    int i21 = rjVar2.b;
                                    if (i21 >= rjVar.b) {
                                        rjVar2.b = i21 - rjVar.d;
                                    }
                                    int i22 = rjVar2.d;
                                    if (i22 >= rjVar.b) {
                                        rjVar2.d = i22 - rjVar.d;
                                    }
                                }
                                int i23 = rjVar2.b;
                                if (i23 >= rjVar3.b) {
                                    rjVar2.b = i23 - rjVar3.d;
                                }
                                int i24 = rjVar2.d;
                                if (i24 >= rjVar3.b) {
                                    rjVar2.d = i24 - rjVar3.d;
                                }
                            }
                            arrayList.set(size, rjVar3);
                            if (rjVar2.b != rjVar2.d) {
                                arrayList.set(i3, rjVar2);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (rjVar != null) {
                                arrayList.add(size, rjVar);
                            }
                        } else {
                            arrayList.set(size, rjVar3);
                            arrayList.remove(i3);
                            rjVar2.c = obj;
                            dhmVar2.c(rjVar2);
                        }
                    }
                }
                obj = null;
                rjVar = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i25 = rjVar2.d;
                int i26 = rjVar3.b;
                if (i25 < i26) {
                    rjVar3.b = i26 - 1;
                } else {
                    int i27 = rjVar3.d;
                    if (i25 < i26 + i27) {
                        rjVar3.d = i27 - 1;
                        m = sjVar.m(4, rjVar2.b, rjVar3.c, 1);
                        i = rjVar2.b;
                        i2 = rjVar3.b;
                        if (i > i2) {
                            rjVar3.b = i2 + 1;
                        } else {
                            int i28 = i2 + rjVar3.d;
                            if (i < i28) {
                                int i29 = i28 - i;
                                m2 = sjVar.m(4, i + 1, rjVar3.c, i29);
                                rjVar3.d -= i29;
                                arrayList.set(i3, rjVar2);
                                if (rjVar3.d > 0) {
                                    arrayList.set(size, rjVar3);
                                } else {
                                    arrayList.remove(size);
                                    rjVar3.c = null;
                                    dhmVar2.c(rjVar3);
                                }
                                if (m != null) {
                                    arrayList.add(size, m);
                                }
                                if (m2 != null) {
                                    arrayList.add(size, m2);
                                }
                            }
                        }
                        m2 = null;
                        arrayList.set(i3, rjVar2);
                        if (rjVar3.d > 0) {
                        }
                        if (m != null) {
                        }
                        if (m2 != null) {
                        }
                    }
                }
                m = null;
                i = rjVar2.b;
                i2 = rjVar3.b;
                if (i > i2) {
                }
                m2 = null;
                arrayList.set(i3, rjVar2);
                if (rjVar3.d > 0) {
                }
                if (m != null) {
                }
                if (m2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            rj rjVar4 = (rj) arrayList.get(i30);
            int i31 = rjVar4.a;
            if (i31 == 1) {
                n(rjVar4);
            } else if (i31 == 2) {
                int i32 = rjVar4.b;
                int i33 = rjVar4.d + i32;
                int i34 = i32;
                int i35 = 0;
                char c2 = 65535;
                while (i34 < i33) {
                    if (qzcVar.k(i34) != null || b(i34)) {
                        if (c2 == 0) {
                            e(m(2, i32, null, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            n(m(2, i32, null, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    c2 = c;
                }
                if (i35 != rjVar4.d) {
                    rjVar4.c = null;
                    dhmVar.c(rjVar4);
                    rjVar4 = m(2, i32, null, i35);
                }
                if (c2 == 0) {
                    e(rjVar4);
                } else {
                    n(rjVar4);
                }
            } else if (i31 == 4) {
                int i36 = rjVar4.b;
                int i37 = rjVar4.d + i36;
                int i38 = i36;
                int i39 = 0;
                char c3 = 65535;
                while (i36 < i37) {
                    if (qzcVar.k(i36) != null || b(i36)) {
                        if (c3 == 0) {
                            e(m(4, i38, rjVar4.c, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            n(m(4, i38, rjVar4.c, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != rjVar4.d) {
                    Object obj2 = rjVar4.c;
                    rjVar4.c = null;
                    dhmVar.c(rjVar4);
                    rjVar4 = m(4, i38, obj2, i39);
                }
                if (c3 == 0) {
                    e(rjVar4);
                } else {
                    n(rjVar4);
                }
            } else if (i31 == 8) {
                n(rjVar4);
            }
        }
        arrayList.clear();
    }

    public void p(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rj rjVar = (rj) arrayList.get(i);
            rjVar.c = null;
            ((dhm) this.b).c(rjVar);
        }
        arrayList.clear();
    }

    public int q(int i, int i2) {
        int i3;
        int i4;
        dhm dhmVar = (dhm) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rj rjVar = (rj) arrayList.get(size);
            int i5 = rjVar.a;
            int i6 = rjVar.b;
            if (i5 == 8) {
                int i7 = rjVar.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            rjVar.b = i6 + 1;
                            rjVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            rjVar.b = i6 - 1;
                            rjVar.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        rjVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        rjVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        rjVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        rjVar.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= rjVar.d;
                } else if (i5 == 2) {
                    i += rjVar.d;
                }
            } else if (i2 == 1) {
                rjVar.b = i6 + 1;
            } else if (i2 == 2) {
                rjVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            rj rjVar2 = (rj) arrayList.get(size2);
            int i8 = rjVar2.a;
            int i9 = rjVar2.d;
            if (i8 == 8) {
                if (i9 == rjVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    rjVar2.c = null;
                    dhmVar.c(rjVar2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                rjVar2.c = null;
                dhmVar.c(rjVar2);
            }
        }
        return i;
    }

    public void r(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        xrb xrbVar = ((prb) this.d).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        xrbVar.N1();
        xrbVar.E1(1, 10, num);
        xrbVar.E1(2, 10, num);
        xrbVar.m.f(21, new irb(intValue, 0));
    }

    public void s() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(j3c.b()).edit();
        Long l = (Long) this.d;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = (Long) this.e;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.f).toString());
        edit.apply();
        c7f c7fVar = (c7f) this.c;
        if (c7fVar == null || c7fVar == null) {
            return;
        }
        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(j3c.b()).edit();
        edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", c7fVar.c);
        edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", c7fVar.b);
        edit2.apply();
    }

    public sj(i iVar, String str, String str2, String str3, String str4, int i) {
        eta.r(str, str2, str3, str4);
        this.b = iVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.a = i;
    }

    public sj(n7q n7qVar, cgh cghVar, rnh rnhVar, o8q o8qVar, g3i g3iVar) {
        n7qVar.getClass();
        cghVar.getClass();
        rnhVar.getClass();
        this.b = cghVar;
        this.c = rnhVar;
        this.d = y7g.B(n7qVar);
        this.a = f8g.F(n7qVar);
        n7qVar.getClass();
        jtc jtcVar = new jtc();
        jtcVar.a = n7qVar;
        jtcVar.b = o8qVar;
        this.e = jtcVar;
        cghVar.getClass();
        g8c g8cVar = new g8c();
        g8cVar.a = cghVar;
        this.f = g8cVar;
    }

    public sj(Long l, Long l2) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.d = l;
        this.e = l2;
        this.f = randomUUID;
    }

    public sj(dyn dynVar) {
        this.b = dynVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public sj(qzc qzcVar) {
        this.b = new dhm(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = qzcVar;
        this.f = new pv9(26, this);
    }

    public sj(Object obj, Looper looper, Looper looper2, dzr dzrVar, prb prbVar) {
        this.b = dzrVar.a(looper, null);
        this.c = dzrVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = prbVar;
    }
}
