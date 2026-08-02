package defpackage;

import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class amh {
    public final List a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public amh(amh amhVar) {
        this.d = (rkh) amhVar.d;
        this.e = (i6l) amhVar.e;
        this.f = (ioh) amhVar.f;
        this.a = amhVar.a;
        this.g = (CharSequence) amhVar.g;
        this.b = amhVar.b;
        this.c = amhVar.c;
        this.h = (Bundle) amhVar.h;
    }

    public void a(opn opnVar, boolean z) {
        RecyclerView.v(opnVar);
        View view = opnVar.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        qpn qpnVar = recyclerView.U0;
        if (qpnVar != null) {
            a j = qpnVar.j();
            wdu.q(view, j instanceof ppn ? (a) ((ppn) j).e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                l1j.f();
                return;
            }
            qon qonVar = recyclerView.m;
            if (qonVar != null) {
                qonVar.q(opnVar);
            }
            if (recyclerView.N0 != null) {
                recyclerView.g.s(opnVar);
            }
            if (RecyclerView.k1) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + opnVar);
            }
        }
        opnVar.s = null;
        opnVar.r = null;
        c().d(opnVar);
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        kpn kpnVar = recyclerView.N0;
        if (i >= 0 && i < kpnVar.b()) {
            return !kpnVar.g ? i : recyclerView.e.g(i, 0);
        }
        StringBuilder q = k5r.q(i, "invalid position ", ". State item count is ");
        q.append(kpnVar.b());
        q.append(recyclerView.M());
        throw new IndexOutOfBoundsException(q.toString());
    }

    public fpn c() {
        if (((fpn) this.g) == null) {
            this.g = new fpn();
            e();
        }
        return (fpn) this.g;
    }

    public View d(int i) {
        return l(i, Long.MAX_VALUE).a;
    }

    public void e() {
        RecyclerView recyclerView;
        qon qonVar;
        fpn fpnVar = (fpn) this.g;
        if (fpnVar == null || (qonVar = (recyclerView = (RecyclerView) this.h).m) == null || !recyclerView.s) {
            return;
        }
        fpnVar.c.add(qonVar);
    }

    public void f(qon qonVar, boolean z) {
        fpn fpnVar = (fpn) this.g;
        if (fpnVar != null) {
            SparseArray sparseArray = fpnVar.a;
            Set set = fpnVar.c;
            set.remove(qonVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((epn) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    tyf.l(((opn) arrayList.get(i2)).a);
                }
            }
        }
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.o1) {
            ll4 ll4Var = ((RecyclerView) this.h).M0;
            int[] iArr = ll4Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            ll4Var.d = 0;
        }
    }

    public void h(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        if (RecyclerView.k1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        opn opnVar = (opn) arrayList.get(i);
        if (RecyclerView.k1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + opnVar);
        }
        a(opnVar, true);
        arrayList.remove(i);
    }

    public void i(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        opn b0 = RecyclerView.b0(view);
        if (b0.m()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (b0.l()) {
            b0.n.m(b0);
        } else if (b0.s()) {
            b0.j &= -33;
        }
        j(b0);
        if (recyclerView.v0 == null || b0.j()) {
            return;
        }
        recyclerView.v0.d(b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        r7 = r7 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(opn opnVar) {
        boolean z;
        qon qonVar;
        boolean z2;
        ArrayList arrayList = (ArrayList) this.f;
        RecyclerView recyclerView = (RecyclerView) this.h;
        ll4 ll4Var = recyclerView.M0;
        boolean l = opnVar.l();
        View view = opnVar.a;
        boolean z3 = true;
        if (l || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(opnVar.l());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.M());
            throw new IllegalArgumentException(sb.toString());
        }
        if (opnVar.m()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(opnVar);
            xq0.s(sb2, recyclerView.M());
            return;
        }
        if (opnVar.r()) {
            xq0.x("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.M()));
            return;
        }
        if ((opnVar.j & 16) == 0) {
            WeakHashMap weakHashMap = wdu.a;
            if (view.hasTransientState()) {
                z = true;
                qonVar = recyclerView.m;
                if (qonVar != null && z) {
                    qonVar.getClass();
                }
                if (!RecyclerView.j1 && arrayList.contains(opnVar)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(opnVar);
                    xq0.s(sb3, recyclerView.M());
                    return;
                }
                if (opnVar.j()) {
                    if (RecyclerView.k1) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.M()));
                    }
                    z3 = false;
                } else {
                    if (this.c <= 0 || (opnVar.j & 526) != 0) {
                        z2 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.c && size > 0) {
                            h(0);
                            size--;
                        }
                        if (RecyclerView.o1 && size > 0) {
                            int i = opnVar.c;
                            if (ll4Var.c != null) {
                                int i2 = ll4Var.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (ll4Var.c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((opn) arrayList.get(i4)).c;
                                if (ll4Var.c == null) {
                                    break;
                                }
                                int i6 = ll4Var.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (ll4Var.c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, opnVar);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(opnVar, true);
                    }
                    r5 = z2;
                }
                recyclerView.g.s(opnVar);
                if (r5 && !z3 && z) {
                    tyf.l(view);
                    opnVar.s = null;
                    opnVar.r = null;
                    return;
                }
                return;
            }
        }
        z = false;
        qonVar = recyclerView.m;
        if (qonVar != null) {
            qonVar.getClass();
        }
        if (!RecyclerView.j1) {
        }
        if (opnVar.j()) {
        }
        recyclerView.g.s(opnVar);
        if (r5) {
        }
    }

    public void k(View view) {
        von vonVar;
        RecyclerView recyclerView = (RecyclerView) this.h;
        opn b0 = RecyclerView.b0(view);
        if ((b0.j & 12) == 0 && b0.n() && (vonVar = recyclerView.v0) != null) {
            tn7 tn7Var = (tn7) vonVar;
            if (b0.f().isEmpty() && tn7Var.g && !b0.i()) {
                if (((ArrayList) this.e) == null) {
                    this.e = new ArrayList();
                }
                b0.n = this;
                b0.o = true;
                ((ArrayList) this.e).add(b0);
                return;
            }
        }
        if (b0.i() && !b0.k() && !recyclerView.m.b) {
            xq0.x("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.M()));
            return;
        }
        b0.n = this;
        b0.o = false;
        ((ArrayList) this.d).add(b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x046e, code lost:
    
        if (r12.i() == false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x060c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public opn l(int i, long j) {
        boolean z;
        boolean z2;
        opn opnVar;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ViewGroup.LayoutParams layoutParams;
        zon zonVar;
        String str;
        String str2;
        RecyclerView R;
        opn opnVar2;
        View view;
        opn opnVar3;
        boolean z8;
        int size;
        int g;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f;
        RecyclerView recyclerView = (RecyclerView) this.h;
        kpn kpnVar = recyclerView.N0;
        if (i < 0 || i >= kpnVar.b()) {
            StringBuilder l = dfi.l("Invalid item position ", i, i, "(", "). Item count:");
            l.append(kpnVar.b());
            l.append(recyclerView.M());
            throw new IndexOutOfBoundsException(l.toString());
        }
        if (kpnVar.g) {
            ArrayList arrayList3 = (ArrayList) this.e;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        opnVar = (opn) ((ArrayList) this.e).get(i2);
                        if (!opnVar.s() && opnVar.d() == i) {
                            opnVar.a(32);
                            z = true;
                            break;
                        }
                        i2++;
                    } else if (recyclerView.m.b && (g = recyclerView.e.g(i, 0)) > 0 && g < recyclerView.m.c()) {
                        long d = recyclerView.m.d(g);
                        for (int i3 = 0; i3 < size; i3++) {
                            opn opnVar4 = (opn) ((ArrayList) this.e).get(i3);
                            z = true;
                            if (!opnVar4.s() && opnVar4.e == d) {
                                opnVar4.a(32);
                                opnVar = opnVar4;
                                break;
                            }
                        }
                    }
                }
            }
            z = true;
            opnVar = null;
            z2 = opnVar != null ? z : false;
        } else {
            z = true;
            z2 = false;
            opnVar = null;
        }
        String str3 = "RecyclerView";
        if (opnVar == null) {
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                opn opnVar5 = (opn) arrayList.get(i4);
                if (!opnVar5.s() && opnVar5.d() == i && !opnVar5.i() && (kpnVar.g || !opnVar5.k())) {
                    opnVar5.a(32);
                    opnVar3 = opnVar5;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.f.e;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view = null;
                    break;
                }
                View view2 = (View) arrayList4.get(i5);
                opn b0 = RecyclerView.b0(view2);
                if (b0.d() == i && !b0.i() && !b0.k()) {
                    view = view2;
                    break;
                }
                i5++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        opnVar3 = null;
                        break;
                    }
                    opnVar3 = (opn) arrayList2.get(i6);
                    if (opnVar3.i() || opnVar3.d() != i || opnVar3.g()) {
                        i6++;
                    } else {
                        arrayList2.remove(i6);
                        if (RecyclerView.k1) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + opnVar3);
                        }
                    }
                }
            } else {
                opn b02 = RecyclerView.b0(view);
                c1t c1tVar = recyclerView.f;
                au1 au1Var = (au1) c1tVar.d;
                int indexOfChild = ((RecyclerView) ((g8c) c1tVar.c).a).indexOfChild(view);
                if (indexOfChild < 0) {
                    kac.j(view, "view is not a child, cannot hide ");
                    return null;
                }
                if (!au1Var.L(indexOfChild)) {
                    qq6.b(view, "trying to unhide a view that was not hidden");
                    return null;
                }
                au1Var.B(indexOfChild);
                c1tVar.t(view);
                c1t c1tVar2 = recyclerView.f;
                au1 au1Var2 = (au1) c1tVar2.d;
                int indexOfChild2 = ((RecyclerView) ((g8c) c1tVar2.c).a).indexOfChild(view);
                int C = (indexOfChild2 == -1 || au1Var2.L(indexOfChild2)) ? -1 : indexOfChild2 - au1Var2.C(indexOfChild2);
                if (C == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(b02);
                    wvs.k(sb, recyclerView.M());
                    return null;
                }
                recyclerView.f.h(C);
                k(view);
                b02.a(8224);
                opnVar3 = b02;
            }
            if (opnVar3 != null) {
                if (!opnVar3.k()) {
                    int i7 = opnVar3.c;
                    if (i7 < 0 || i7 >= recyclerView.m.c()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + opnVar3 + recyclerView.M());
                    }
                    if (kpnVar.g || recyclerView.m.f(opnVar3.c) == opnVar3.f) {
                        qon qonVar = recyclerView.m;
                        if (!qonVar.b || opnVar3.e == qonVar.d(opnVar3.c)) {
                            z8 = z;
                        }
                    }
                    z8 = false;
                } else {
                    if (RecyclerView.j1 && !kpnVar.g) {
                        xq0.q("should not receive a removed view unless it is pre layout".concat(recyclerView.M()));
                        return null;
                    }
                    z8 = kpnVar.g;
                }
                if (z8) {
                    opnVar = opnVar3;
                    z2 = z;
                } else {
                    opnVar3.a(4);
                    if (opnVar3.l()) {
                        recyclerView.removeDetachedView(opnVar3.a, false);
                        opnVar3.n.m(opnVar3);
                    } else if (opnVar3.s()) {
                        opnVar3.j &= -33;
                    }
                    j(opnVar3);
                    opnVar = null;
                }
            } else {
                opnVar = opnVar3;
            }
        }
        if (opnVar == null) {
            int g2 = recyclerView.e.g(i, 0);
            if (g2 < 0 || g2 >= recyclerView.m.c()) {
                StringBuilder l2 = dfi.l("Inconsistency detected. Invalid item position ", i, g2, "(offset:", ").state:");
                l2.append(kpnVar.b());
                l2.append(recyclerView.M());
                throw new IndexOutOfBoundsException(l2.toString());
            }
            int f = recyclerView.m.f(g2);
            qon qonVar2 = recyclerView.m;
            j2 = 3;
            if (qonVar2.b) {
                long d2 = qonVar2.d(g2);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        opn opnVar6 = (opn) arrayList.get(size5);
                        str = str3;
                        long j3 = opnVar6.e;
                        View view3 = opnVar6.a;
                        if (j3 == d2 && !opnVar6.s()) {
                            if (f == opnVar6.f) {
                                opnVar6.a(32);
                                if (opnVar6.k() && !kpnVar.g) {
                                    opnVar6.j = (opnVar6.j & (-15)) | 2;
                                }
                                opnVar2 = opnVar6;
                            } else {
                                arrayList.remove(size5);
                                recyclerView.removeDetachedView(view3, false);
                                opn b03 = RecyclerView.b0(view3);
                                b03.n = null;
                                b03.o = false;
                                b03.j &= -33;
                                j(b03);
                            }
                        }
                        size5--;
                        str3 = str;
                    } else {
                        str = str3;
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            opnVar2 = (opn) arrayList2.get(size6);
                            long j4 = d2;
                            if (opnVar2.e != j4 || opnVar2.g()) {
                                size6--;
                                d2 = j4;
                            } else if (f == opnVar2.f) {
                                arrayList2.remove(size6);
                            } else {
                                h(size6);
                            }
                        }
                        opnVar2 = null;
                    }
                }
                if (opnVar2 != null) {
                    opnVar2.c = g2;
                    opnVar = opnVar2;
                    z2 = z;
                } else {
                    opnVar = opnVar2;
                }
            } else {
                str = "RecyclerView";
            }
            if (opnVar == null) {
                if (RecyclerView.k1) {
                    str2 = str;
                    Log.d(str2, "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                } else {
                    str2 = str;
                }
                opn b = c().b(f);
                if (b != null) {
                    b.p();
                }
                opnVar = b;
            } else {
                str2 = str;
            }
            if (opnVar == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j5 = ((fpn) this.g).c(f).c;
                    if (!((j5 == 0 || j5 + nanoTime < j) ? z : false)) {
                        return null;
                    }
                }
                qon qonVar3 = recyclerView.m;
                qonVar3.getClass();
                try {
                    if (bqs.a()) {
                        Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(f)));
                    }
                    opnVar = qonVar3.m(recyclerView, f);
                    if (opnVar.a.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    opnVar.f = f;
                    Trace.endSection();
                    if (RecyclerView.o1 && (R = RecyclerView.R(opnVar.a)) != null) {
                        opnVar.b = new WeakReference(R);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    epn c = ((fpn) this.g).c(f);
                    long j6 = c.c;
                    if (j6 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * 3);
                    }
                    c.c = nanoTime2;
                    if (RecyclerView.k1) {
                        Log.d(str2, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j2 = 3;
        }
        View view4 = opnVar.a;
        if (z2 && !kpnVar.g) {
            int i8 = opnVar.j;
            if ((i8 & RemoteCameraConfig.Notification.ID) != 0 ? z : false) {
                opnVar.j = i8 & (-8193);
                if (kpnVar.j) {
                    von.b(opnVar);
                    von vonVar = recyclerView.v0;
                    opnVar.f();
                    vonVar.getClass();
                    c9n c9nVar = new c9n(11, (byte) 0);
                    c9nVar.g(opnVar);
                    recyclerView.q0(opnVar, c9nVar);
                }
            }
        }
        if (!kpnVar.g || !opnVar.h()) {
            if (opnVar.h()) {
                if (!((opnVar.j & 2) != 0 ? z : false)) {
                }
            }
            if (RecyclerView.j1 && opnVar.k()) {
                StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb2.append(opnVar);
                wvs.k(sb2, recyclerView.M());
                return null;
            }
            z3 = false;
            int g3 = recyclerView.e.g(i, 0);
            opnVar.s = null;
            opnVar.r = recyclerView;
            int i9 = opnVar.f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j7 = ((fpn) this.g).c(i9).d;
                if (j7 != 0 && j7 + nanoTime3 >= j) {
                    z6 = false;
                    z5 = z;
                    z7 = z6;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                        zonVar = (zon) recyclerView.generateDefaultLayoutParams();
                        view4.setLayoutParams(zonVar);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        zonVar = (zon) layoutParams;
                    } else {
                        zonVar = (zon) recyclerView.generateLayoutParams(layoutParams);
                        view4.setLayoutParams(zonVar);
                    }
                    zonVar.a = opnVar;
                    zonVar.d = (z2 || !z7) ? z3 : z5;
                    return opnVar;
                }
            }
            if (opnVar.m()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z4 = z;
            } else {
                z4 = false;
            }
            qon qonVar4 = recyclerView.m;
            qonVar4.getClass();
            boolean z9 = opnVar.s == null ? z : false;
            if (z9) {
                opnVar.c = g3;
                if (qonVar4.b) {
                    opnVar.e = qonVar4.d(g3);
                }
                opnVar.j = (opnVar.j & (-520)) | 1;
                if (bqs.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(opnVar.f)));
                }
            }
            opnVar.s = qonVar4;
            if (RecyclerView.j1) {
                if (view4.getParent() == null && view4.isAttachedToWindow() != opnVar.m()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + opnVar.m() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + opnVar);
                }
                if (view4.getParent() == null && view4.isAttachedToWindow()) {
                    b6e.u(opnVar, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return null;
                }
            }
            qonVar4.k(opnVar, g3, opnVar.f());
            if (z9) {
                ArrayList arrayList5 = opnVar.k;
                if (arrayList5 != null) {
                    arrayList5.clear();
                }
                opnVar.j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof zon) {
                    ((zon) layoutParams2).c = z;
                }
                Trace.endSection();
            }
            if (z4) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            epn c2 = ((fpn) this.g).c(opnVar.f);
            long j8 = c2.d;
            if (j8 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j8 / 4) * j2);
            }
            c2.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.B;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z5 = true;
                if (view4.getImportantForAccessibility() == 0) {
                    view4.setImportantForAccessibility(1);
                }
                qpn qpnVar = recyclerView.U0;
                if (qpnVar != null) {
                    a j9 = qpnVar.j();
                    if (j9 instanceof ppn) {
                        ppn ppnVar = (ppn) j9;
                        a e = wdu.e(view4);
                        if (e != null && e != ppnVar) {
                            ppnVar.e.put(view4, e);
                        }
                    }
                    wdu.q(view4, j9);
                }
            } else {
                z5 = true;
            }
            if (kpnVar.g) {
                opnVar.g = i;
            }
            z6 = z5;
            z7 = z6;
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
            }
            zonVar.a = opnVar;
            zonVar.d = (z2 || !z7) ? z3 : z5;
            return opnVar;
        }
        opnVar.g = i;
        z5 = z;
        z3 = false;
        z7 = false;
        layoutParams = view4.getLayoutParams();
        if (layoutParams == null) {
        }
        zonVar.a = opnVar;
        zonVar.d = (z2 || !z7) ? z3 : z5;
        return opnVar;
    }

    public void m(opn opnVar) {
        if (opnVar.o) {
            ((ArrayList) this.e).remove(opnVar);
        } else {
            ((ArrayList) this.d).remove(opnVar);
        }
        opnVar.n = null;
        opnVar.o = false;
        opnVar.j &= -33;
    }

    public void n() {
        ArrayList arrayList = (ArrayList) this.f;
        yon yonVar = ((RecyclerView) this.h).n;
        this.c = this.b + (yonVar != null ? yonVar.j : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.c; size--) {
            h(size);
        }
    }

    public amh(rkh rkhVar, i6l i6lVar, ioh iohVar, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.d = rkhVar;
        this.e = i6lVar;
        this.f = iohVar;
        list.getClass();
        this.a = list;
        this.g = charSequence;
        this.b = i;
        this.c = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public amh() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = Collections.EMPTY_LIST;
        this.g = null;
        this.b = 0;
        this.c = 0;
        this.h = Bundle.EMPTY;
    }

    public amh(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.a = Collections.unmodifiableList(arrayList);
        this.b = 2;
        this.c = 2;
    }
}
