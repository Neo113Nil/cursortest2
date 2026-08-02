package r3;

import A1.AbstractC0269k;
import H3.e;
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
import com.bumptech.glide.d;
import com.google.android.gms.internal.ads.AbstractC2602Ha;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.InterfaceC2536Dc;
import com.google.android.gms.internal.ads.InterfaceC3813qf;
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
import o.C4790b;
import s2.InterfaceC4964x;
import s2.O0;
import s2.Q0;
import s2.R0;
import t0.AbstractC5000P;
import t0.AbstractC5030z;
import t0.C5007c;
import t0.C5010f;
import t0.C5011g;
import t0.C5012h;
import t0.C5015k;
import t0.RunnableC5006b;
import u0.AbstractC5056e;
import u0.C5057f;
import v2.BinderC5098b;
import v2.BinderC5100d;
import v7.r;
import w1.C5133a;
import w2.C5140B;
import w2.z;
import w7.C5161i;
import x2.i;
import z0.C5214c;
import z0.C5220i;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40219n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f40220u;

    public /* synthetic */ b(int i, Object obj) {
        this.f40219n = i;
        this.f40220u = obj;
    }

    public C5161i a() {
        C5057f c5057f = (C5057f) this.f40220u;
        C5161i c5161i = new C5161i();
        Cursor m9 = c5057f.f40964a.m(new F2.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 5));
        while (m9.moveToNext()) {
            try {
                c5161i.add(Integer.valueOf(m9.getInt(0)));
            } finally {
            }
        }
        m9.close();
        C5161i f2 = d.f(c5161i);
        if (f2.f41749n.isEmpty()) {
            return f2;
        }
        if (((C5057f) this.f40220u).f40970g == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C5220i c5220i = ((C5057f) this.f40220u).f40970g;
        if (c5220i == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c5220i.b();
        return f2;
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
        boolean z6 = false;
        switch (this.f40219n) {
            case 0:
                e eVar = (e) this.f40220u;
                eVar.f1245b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eVar.f1248e;
                W.e eVar2 = bottomSheetBehavior.f36609M;
                if (eVar2 != null && eVar2.g()) {
                    eVar.a(eVar.f1246c);
                    return;
                } else {
                    if (bottomSheetBehavior.f36608L == 2) {
                        bottomSheetBehavior.C(eVar.f1246c);
                        return;
                    }
                    return;
                }
            case 1:
                InterfaceC4964x interfaceC4964x = ((O0) this.f40220u).f40371n.f40372n;
                if (interfaceC4964x != null) {
                    try {
                        interfaceC4964x.x(1);
                        return;
                    } catch (RemoteException e9) {
                        i.g("Could not notify onAdFailedToLoad event.", e9);
                        return;
                    }
                }
                return;
            case 2:
                InterfaceC4964x interfaceC4964x2 = ((Q0) this.f40220u).f40373n;
                if (interfaceC4964x2 != null) {
                    try {
                        interfaceC4964x2.x(1);
                        return;
                    } catch (RemoteException e10) {
                        i.g("Could not notify onAdFailedToLoad event.", e10);
                        return;
                    }
                }
                return;
            case 3:
                InterfaceC2536Dc interfaceC2536Dc = ((R0) this.f40220u).f40374n;
                if (interfaceC2536Dc != null) {
                    try {
                        interfaceC2536Dc.C1(Collections.EMPTY_LIST);
                        return;
                    } catch (RemoteException e11) {
                        i.g("Could not notify onComplete event.", e11);
                        return;
                    }
                }
                return;
            case 4:
                InterfaceC3813qf interfaceC3813qf = (InterfaceC3813qf) this.f40220u;
                if (interfaceC3813qf != null) {
                    try {
                        interfaceC3813qf.v(1);
                        return;
                    } catch (RemoteException e12) {
                        i.i("#007 Could not call remote method.", e12);
                        return;
                    }
                }
                return;
            case 5:
                C5015k c5015k = (C5015k) this.f40220u;
                int i4 = c5015k.f40745A;
                ValueAnimator valueAnimator = c5015k.f40771z;
                if (i4 != 1) {
                    i = 2;
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c5015k.f40745A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 6:
                RecyclerView recyclerView2 = (RecyclerView) this.f40220u;
                AbstractC5030z abstractC5030z = recyclerView2.f5221l0;
                if (abstractC5030z != null) {
                    C5012h c5012h = (C5012h) abstractC5030z;
                    ArrayList arrayList = c5012h.f40730h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c5012h.f40731j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c5012h.f40732k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c5012h.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        recyclerView = recyclerView2;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView = recyclerView2;
                            long j6 = c5012h.f40834d;
                            if (hasNext) {
                                AbstractC5000P abstractC5000P = (AbstractC5000P) it.next();
                                View view = abstractC5000P.f40643a;
                                ViewPropertyAnimator animate = view.animate();
                                c5012h.f40738q.add(abstractC5000P);
                                animate.setDuration(j6).alpha(0.0f).setListener(new C5007c(c5012h, abstractC5000P, animate, view)).start();
                                recyclerView2 = recyclerView;
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c5012h.f40734m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC5006b runnableC5006b = new RunnableC5006b(c5012h, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC5006b.run();
                                    } else {
                                        View view2 = ((C5011g) arrayList5.get(0)).f40723a.f40643a;
                                        WeakHashMap weakHashMap = X.f2142a;
                                        view2.postOnAnimationDelayed(runnableC5006b, j6);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c5012h.f40735n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC5006b runnableC5006b2 = new RunnableC5006b(c5012h, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC5006b2.run();
                                    } else {
                                        View view3 = ((C5010f) arrayList6.get(0)).f40717a.f40643a;
                                        WeakHashMap weakHashMap2 = X.f2142a;
                                        view3.postOnAnimationDelayed(runnableC5006b2, j6);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c5012h.f40733l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC5006b runnableC5006b3 = new RunnableC5006b(c5012h, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC5006b3.run();
                                    } else {
                                        if (isEmpty) {
                                            j6 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c5012h.f40835e : 0L, isEmpty3 ? 0L : c5012h.f40836f) + j6;
                                        View view4 = ((AbstractC5000P) arrayList7.get(0)).f40643a;
                                        WeakHashMap weakHashMap3 = X.f2142a;
                                        view4.postOnAnimationDelayed(runnableC5006b3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView2 = recyclerView;
                    z6 = false;
                }
                recyclerView2.f5195J0 = z6;
                return;
            case 7:
                ((StaggeredGridLayoutManager) this.f40220u).A0();
                return;
            case 8:
                ReentrantReadWriteLock.ReadLock readLock = ((C5057f) this.f40220u).f40964a.f5338h.readLock();
                h.d(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                        try {
                        } finally {
                            readLock.unlock();
                            ((C5057f) this.f40220u).getClass();
                        }
                    } catch (IllegalStateException e13) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
                        set = r.f41223n;
                    }
                } catch (SQLiteException e14) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
                    set = r.f41223n;
                }
                if (((C5057f) this.f40220u).a() && ((C5057f) this.f40220u).f40968e.compareAndSet(true, false) && !((C5057f) this.f40220u).f40964a.h().R().C()) {
                    C5214c R8 = ((C5057f) this.f40220u).f40964a.h().R();
                    R8.j();
                    try {
                        set = a();
                        R8.G();
                        if (set.isEmpty()) {
                            return;
                        }
                        C5057f c5057f = (C5057f) this.f40220u;
                        synchronized (c5057f.i) {
                            Iterator it2 = c5057f.i.iterator();
                            while (true) {
                                C4790b c4790b = (C4790b) it2;
                                if (c4790b.hasNext()) {
                                    ((AbstractC5056e) ((Map.Entry) c4790b.next()).getValue()).a(set);
                                }
                            }
                        }
                        return;
                    } finally {
                        R8.z();
                    }
                }
                return;
            case 9:
                BinderC5098b binderC5098b = (BinderC5098b) this.f40220u;
                if (binderC5098b.f41088A) {
                    binderC5098b.f41091v.finish();
                    return;
                }
                return;
            case 10:
                ((BinderC5100d) this.f40220u).U3();
                return;
            case 11:
                n nVar = (n) this.f40220u;
                nVar.getClass();
                while (true) {
                    try {
                        nVar.j((C5133a) ((ReferenceQueue) nVar.f2933w).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 12:
                Thread.currentThread();
                AbstractC0269k abstractC0269k = (AbstractC0269k) this.f40220u;
                abstractC0269k.getClass();
                abstractC0269k.k();
                return;
            default:
                C5140B c5140b = (C5140B) this.f40220u;
                if (c5140b.f41600b) {
                    if (!(c5140b.l() && c5140b.m()) && ((Boolean) AbstractC2602Ha.f26081b.r()).booleanValue()) {
                        synchronized (c5140b.f41599a) {
                            try {
                                if (Looper.getMainLooper() == null) {
                                    return;
                                }
                                if (c5140b.f41603e == null) {
                                    c5140b.f41603e = new D8();
                                }
                                D8 d82 = c5140b.f41603e;
                                synchronized (d82.f25099v) {
                                    if (d82.f25097n) {
                                        int i6 = z.f41712b;
                                        i.a("Content hash thread already started, quitting...");
                                    } else {
                                        d82.f25097n = true;
                                        d82.start();
                                    }
                                }
                                int i9 = z.f41712b;
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

    public b(AbstractC0269k abstractC0269k) {
        this.f40219n = 12;
        Objects.requireNonNull(abstractC0269k);
        this.f40220u = abstractC0269k;
    }

    public b(O0 o02) {
        this.f40219n = 1;
        Objects.requireNonNull(o02);
        this.f40220u = o02;
    }

    public b(Q0 q02) {
        this.f40219n = 2;
        Objects.requireNonNull(q02);
        this.f40220u = q02;
    }
}
