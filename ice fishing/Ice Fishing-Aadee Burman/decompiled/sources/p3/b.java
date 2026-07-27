package p3;

import F3.e;
import L3.o;
import O.X;
import S0.n;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.internal.ads.AbstractC2582Ha;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.InterfaceC2516Dc;
import com.google.android.gms.internal.ads.InterfaceC3790qf;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.h;
import o.C4774b;
import q2.InterfaceC4915x;
import q2.O0;
import q2.Q0;
import q2.R0;
import t0.AbstractC5003S;
import t0.AbstractC5031z;
import t0.C5008c;
import t0.C5011f;
import t0.C5012g;
import t0.C5013h;
import t0.C5016k;
import t0.RunnableC5007b;
import t2.BinderC5034b;
import t2.BinderC5036d;
import u0.AbstractC5055e;
import u0.C5056f;
import u1.C5062a;
import u2.C5069B;
import u2.z;
import v2.i;
import v7.r;
import w7.C5162i;
import z0.C5247c;
import z0.C5253i;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39763n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f39764u;

    public /* synthetic */ b(int i, Object obj) {
        this.f39763n = i;
        this.f39764u = obj;
    }

    public C5162i a() {
        C5056f c5056f = (C5056f) this.f39764u;
        C5162i c5162i = new C5162i();
        Cursor m4 = c5056f.f40999a.m(new D2.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (m4.moveToNext()) {
            try {
                c5162i.add(Integer.valueOf(m4.getInt(0)));
            } finally {
            }
        }
        m4.close();
        C5162i c9 = A8.b.c(c5162i);
        if (c9.f41692n.isEmpty()) {
            return c9;
        }
        if (((C5056f) this.f39764u).f41005g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C5253i c5253i = ((C5056f) this.f39764u).f41005g;
        if (c5253i == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c5253i.b();
        return c9;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        RecyclerView recyclerView;
        Set set;
        boolean z3 = false;
        switch (this.f39763n) {
            case 0:
                e eVar = (e) this.f39764u;
                eVar.f960b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f963e;
                W.e eVar2 = bottomSheetBehavior.f35841M;
                if (eVar2 != null && eVar2.g()) {
                    eVar.a(eVar.f961c);
                    return;
                } else {
                    if (bottomSheetBehavior.f35840L == 2) {
                        bottomSheetBehavior.C(eVar.f961c);
                        return;
                    }
                    return;
                }
            case 1:
                InterfaceC4915x interfaceC4915x = ((O0) this.f39764u).f40069n.f40070n;
                if (interfaceC4915x != null) {
                    try {
                        interfaceC4915x.x(1);
                        return;
                    } catch (RemoteException e9) {
                        i.g("Could not notify onAdFailedToLoad event.", e9);
                        return;
                    }
                }
                return;
            case 2:
                InterfaceC4915x interfaceC4915x2 = ((Q0) this.f39764u).f40071n;
                if (interfaceC4915x2 != null) {
                    try {
                        interfaceC4915x2.x(1);
                        return;
                    } catch (RemoteException e10) {
                        i.g("Could not notify onAdFailedToLoad event.", e10);
                        return;
                    }
                }
                return;
            case 3:
                InterfaceC2516Dc interfaceC2516Dc = ((R0) this.f39764u).f40072n;
                if (interfaceC2516Dc != null) {
                    try {
                        interfaceC2516Dc.H1(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e11) {
                        i.g("Could not notify onComplete event.", e11);
                        return;
                    }
                }
                return;
            case 4:
                InterfaceC3790qf interfaceC3790qf = (InterfaceC3790qf) this.f39764u;
                if (interfaceC3790qf != null) {
                    try {
                        interfaceC3790qf.v(1);
                        return;
                    } catch (RemoteException e12) {
                        i.i("#007 Could not call remote method.", e12);
                        return;
                    }
                }
                return;
            case 5:
                C5016k c5016k = (C5016k) this.f39764u;
                int i6 = c5016k.f40692A;
                ValueAnimator valueAnimator = c5016k.f40718z;
                if (i6 != 1) {
                    i = 2;
                    if (i6 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c5016k.f40692A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 6:
                RecyclerView recyclerView2 = (RecyclerView) this.f39764u;
                AbstractC5031z abstractC5031z = recyclerView2.f5260q0;
                if (abstractC5031z != null) {
                    C5013h c5013h = (C5013h) abstractC5031z;
                    ArrayList arrayList = c5013h.f40677h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c5013h.f40678j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c5013h.f40679k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c5013h.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        recyclerView = recyclerView2;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView = recyclerView2;
                            long j6 = c5013h.f40782d;
                            if (hasNext) {
                                AbstractC5003S abstractC5003S = (AbstractC5003S) it.next();
                                View view = abstractC5003S.f40590a;
                                ViewPropertyAnimator animate = view.animate();
                                c5013h.f40685q.add(abstractC5003S);
                                animate.setDuration(j6).alpha(0.0f).setListener(new C5008c(c5013h, abstractC5003S, animate, view)).start();
                                recyclerView2 = recyclerView;
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c5013h.f40681m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC5007b runnableC5007b = new RunnableC5007b(c5013h, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC5007b.run();
                                    } else {
                                        View view2 = ((C5012g) arrayList5.get(0)).f40670a.f40590a;
                                        WeakHashMap weakHashMap = X.f2054a;
                                        view2.postOnAnimationDelayed(runnableC5007b, j6);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c5013h.f40682n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC5007b runnableC5007b2 = new RunnableC5007b(c5013h, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC5007b2.run();
                                    } else {
                                        View view3 = ((C5011f) arrayList6.get(0)).f40664a.f40590a;
                                        WeakHashMap weakHashMap2 = X.f2054a;
                                        view3.postOnAnimationDelayed(runnableC5007b2, j6);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c5013h.f40680l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC5007b runnableC5007b3 = new RunnableC5007b(c5013h, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC5007b3.run();
                                    } else {
                                        if (isEmpty) {
                                            j6 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c5013h.f40783e : 0L, isEmpty3 ? 0L : c5013h.f40784f) + j6;
                                        View view4 = ((AbstractC5003S) arrayList7.get(0)).f40590a;
                                        WeakHashMap weakHashMap3 = X.f2054a;
                                        view4.postOnAnimationDelayed(runnableC5007b3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView2 = recyclerView;
                    z3 = false;
                }
                recyclerView2.f5238O0 = z3;
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.f39764u).A0();
                return;
            case 8:
                BinderC5034b binderC5034b = (BinderC5034b) this.f39764u;
                if (binderC5034b.f40797A) {
                    binderC5034b.f40800v.finish();
                    return;
                }
                return;
            case 9:
                ((BinderC5036d) this.f39764u).U3();
                return;
            case 10:
                ReentrantReadWriteLock.ReadLock readLock = ((C5056f) this.f39764u).f40999a.f5373h.readLock();
                h.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                    } finally {
                        readLock.unlock();
                        ((C5056f) this.f39764u).getClass();
                    }
                } catch (SQLiteException e13) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
                    set = r.f41441n;
                } catch (IllegalStateException e14) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
                    set = r.f41441n;
                }
                if (((C5056f) this.f39764u).a() && ((C5056f) this.f39764u).f41003e.compareAndSet(true, false) && !((C5056f) this.f39764u).f40999a.h().R().C()) {
                    C5247c R8 = ((C5056f) this.f39764u).f40999a.h().R();
                    R8.j();
                    try {
                        set = a();
                        R8.G();
                        if (set.isEmpty()) {
                            return;
                        }
                        C5056f c5056f = (C5056f) this.f39764u;
                        synchronized (c5056f.i) {
                            Iterator it2 = c5056f.i.iterator();
                            while (true) {
                                C4774b c4774b = (C4774b) it2;
                                if (c4774b.hasNext()) {
                                    ((AbstractC5055e) ((Map.Entry) c4774b.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        R8.z();
                    }
                }
                return;
            case 11:
                n nVar = (n) this.f39764u;
                nVar.getClass();
                while (true) {
                    try {
                        nVar.g((C5062a) ((ReferenceQueue) nVar.f2804w).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 12:
                Thread.currentThread();
                o oVar = (o) this.f39764u;
                oVar.getClass();
                oVar.k();
                return;
            default:
                C5069B c5069b = (C5069B) this.f39764u;
                if (c5069b.f41207b) {
                    if (!(c5069b.l() && c5069b.m()) && ((Boolean) AbstractC2582Ha.f25328b.r()).booleanValue()) {
                        synchronized (c5069b.f41206a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (c5069b.f41210e == null) {
                                    c5069b.f41210e = new D8();
                                }
                                D8 d82 = c5069b.f41210e;
                                synchronized (d82.f24354v) {
                                    if (d82.f24352n) {
                                        int i9 = z.f41319b;
                                        i.a("Content hash thread already started, quitting...");
                                    } else {
                                        d82.f24352n = true;
                                        d82.start();
                                    }
                                }
                                int i10 = z.f41319b;
                                i.e("start fetching content...");
                                return;
                            } finally {
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    public b(o oVar) {
        this.f39763n = 12;
        Objects.requireNonNull(oVar);
        this.f39764u = oVar;
    }

    public b(O0 o02) {
        this.f39763n = 1;
        Objects.requireNonNull(o02);
        this.f39764u = o02;
    }

    public b(Q0 q02) {
        this.f39763n = 2;
        Objects.requireNonNull(q02);
        this.f39764u = q02;
    }
}
