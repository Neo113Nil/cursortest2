package C;

import P.C0054c;
import P.C0058g;
import P.u;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import h.AbstractC0229z;
import h.C0213i;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import n0.InterfaceC0989c;
import y.x;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f103b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f102a = i2;
        this.f103b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M1.a c2;
        long j2;
        C0213i c0213i;
        switch (this.f102a) {
            case 0:
                g gVar = (g) this.f103b;
                if (gVar.f120o) {
                    boolean z2 = gVar.f118m;
                    a aVar = gVar.f106a;
                    if (z2) {
                        gVar.f118m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f97e = currentAnimationTimeMillis;
                        aVar.f99g = -1L;
                        aVar.f98f = currentAnimationTimeMillis;
                        aVar.f100h = 0.5f;
                    }
                    if ((aVar.f99g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f99g + aVar.f101i) || !gVar.e()) {
                        gVar.f120o = false;
                        return;
                    }
                    boolean z3 = gVar.f119n;
                    ListView listView = gVar.f108c;
                    if (z3) {
                        gVar.f119n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f98f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f98f;
                    aVar.f98f = currentAnimationTimeMillis2;
                    gVar.f122q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f96d));
                    Field field = x.f8596a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                synchronized (((D0.h) this.f103b).f222c) {
                    D0.g gVar2 = ((D0.h) this.f103b).f223d;
                    if (gVar2 != null) {
                        D0.m mVar = (D0.m) gVar2.f219d;
                        synchronized (mVar.f229a) {
                            try {
                                if (!mVar.f231c) {
                                    mVar.f231c = true;
                                    mVar.f232d = true;
                                    mVar.f230b.d(mVar);
                                }
                            } finally {
                            }
                        }
                    }
                }
                return;
            case 2:
                ((I0.b) this.f103b).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            case 3:
                break;
            case 4:
                C0058g c0058g = (C0058g) this.f103b;
                int i2 = c0058g.f1338v;
                ValueAnimator valueAnimator = c0058g.f1337u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0058g.f1338v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 5:
                u uVar = ((RecyclerView) this.f103b).f2535D;
                if (uVar != null) {
                    C0054c c0054c = (C0054c) uVar;
                    ArrayList arrayList = c0054c.f1302e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0054c.f1304g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0054c.f1305h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0054c.f1303f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0054c.f1307j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            C1.a.n(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            C1.a.n(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0054c.f1308k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            C1.a.n(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            C1.a.n(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0054c.f1306i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0054c.f1368c : 0L, isEmpty3 ? 0L : c0054c.f1369d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 6:
                ((StaggeredGridLayoutManager) this.f103b).J();
                return;
            case 7:
                AbstractC0229z abstractC0229z = (AbstractC0229z) this.f103b;
                abstractC0229z.f3384m = null;
                abstractC0229z.drawableStateChanged();
                return;
            case 8:
                ActionMenuView actionMenuView = ((Toolbar) this.f103b).f2219a;
                if (actionMenuView == null || (c0213i = actionMenuView.f2116s) == null) {
                    return;
                }
                c0213i.j();
                return;
            case 9:
                ((o0.l) this.f103b).h();
                return;
            case 10:
                InterfaceC0989c interfaceC0989c = ((o0.l) ((Z0.i) this.f103b).f1992b).f8275b;
                interfaceC0989c.i(interfaceC0989c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 11:
                ((o0.u) this.f103b).f8317h.b(new m0.b(4));
                return;
            case 12:
                throw null;
            case 13:
                Object obj = ((Z0.i) this.f103b).f1992b;
                return;
            default:
                x0.e eVar = (x0.e) this.f103b;
                long j4 = x0.e.t((Context) eVar.f8530b).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (j5 == -1 || System.currentTimeMillis() <= j5) {
                    return;
                }
                Context context = (Context) eVar.f8530b;
                if (!x0.e.t(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
        }
        while (true) {
            M1.d dVar = (M1.d) this.f103b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            M1.c cVar = c2.f1086c;
            kotlin.jvm.internal.i.b(cVar);
            M1.d dVar2 = (M1.d) this.f103b;
            boolean isLoggable = M1.d.f1097i.isLoggable(Level.FINE);
            if (isLoggable) {
                j jVar = cVar.f1090a.f1098a;
                j2 = System.nanoTime();
                R1.d.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                M1.d.a(dVar2, c2);
                if (isLoggable) {
                    j jVar2 = cVar.f1090a.f1098a;
                    R1.d.a(c2, cVar, kotlin.jvm.internal.i.h(R1.d.m(System.nanoTime() - j2), "finished run in "));
                }
            } catch (Throwable th) {
                try {
                    ((ThreadPoolExecutor) dVar2.f1098a.f124b).execute(this);
                    throw th;
                } catch (Throwable th2) {
                    if (isLoggable) {
                        j jVar3 = cVar.f1090a.f1098a;
                        R1.d.a(c2, cVar, kotlin.jvm.internal.i.h(R1.d.m(System.nanoTime() - j2), "failed a run in "));
                    }
                    throw th2;
                }
            }
        }
    }

    public b(o0.i iVar, N1.n nVar) {
        this.f102a = 12;
        this.f103b = nVar;
    }

    public b(Z0.i iVar, int i2) {
        this.f102a = 13;
        this.f103b = iVar;
    }
}
