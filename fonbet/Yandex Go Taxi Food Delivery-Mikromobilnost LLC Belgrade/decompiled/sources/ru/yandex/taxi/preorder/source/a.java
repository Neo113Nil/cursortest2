package ru.yandex.taxi.preorder.source;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.SizeChangedListener;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.ffx;
import defpackage.gh00;
import defpackage.s1r;
import defpackage.str;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ttr;
import defpackage.u65;
import defpackage.vez0;
import defpackage.wur;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.preorder.source.a;

/* loaded from: classes9.dex */
public final class a implements a3v {
    public final float B;
    public final float C;
    public boolean F;
    public final ttr H;
    public final ttr I;
    public final ttr J;
    public final ah00 a;
    public final u65 b;
    public final wur c = new wur();
    public final Handler w = new Handler(Looper.getMainLooper());
    public final Rect x = new Rect();
    public final PointF y = new PointF();
    public final n0 z = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final str A = new SizeChangedListener() { // from class: str
        @Override // com.yandex.mapkit.map.SizeChangedListener
        public final void onMapWindowSizeChanged(MapWindow mapWindow, int i, int i2) {
            a.this.h(i, i2);
        }
    };
    public final WeakHashMap D = new WeakHashMap();
    public final HashSet E = new HashSet();
    public Object G = zy11.a;

    /* JADX WARN: Type inference failed for: r2v15, types: [ttr] */
    /* JADX WARN: Type inference failed for: r2v16, types: [ttr] */
    /* JADX WARN: Type inference failed for: r2v17, types: [ttr] */
    /* JADX WARN: Type inference failed for: r2v7, types: [str] */
    public a(ah00 ah00Var, com.yandex.go.pin.api.a aVar, Context context) {
        this.a = ah00Var;
        this.b = aVar;
        final int i = 0;
        final int i2 = 1;
        this.B = tje.x(context, 12.0f);
        this.C = tje.x(context, 30.0f);
        this.H = new Runnable(this) { // from class: ttr
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaxiMapView h;
                int i3 = i;
                a aVar2 = this.b;
                switch (i3) {
                    case 0:
                        a aVar3 = this.b;
                        wur wurVar = aVar3.c;
                        PointF pointF = aVar3.y;
                        gh00 gh00Var = (gh00) aVar3.a;
                        if (gh00Var.a.e(aVar3) && (h = gh00Var.h()) != null) {
                            pointF.set(h.getWidth() / 2.0f, ((h.getHeight() / 2.0f) - (aVar3.x.height() / 2.0f)) + aVar3.B);
                            PointF pointF2 = wurVar.a;
                            if (!jl40.l(pointF2, pointF)) {
                                pointF2.set(pointF);
                                wurVar.h = null;
                            }
                            ScreenRect a = wurVar.a();
                            gh00Var.a.g(aVar3, a, !aVar3.F, 200L);
                            aVar3.b.d(pointF, !aVar3.F, new bdp(9, aVar3, a));
                            aVar3.F = false;
                            break;
                        }
                        break;
                    case 1:
                        HashSet hashSet = aVar2.E;
                        if (!hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                aVar2.D.remove(it.next());
                            }
                            aVar2.I();
                            break;
                        }
                        break;
                    default:
                        aVar2.I();
                        break;
                }
            }
        };
        this.I = new Runnable(this) { // from class: ttr
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaxiMapView h;
                int i3 = i2;
                a aVar2 = this.b;
                switch (i3) {
                    case 0:
                        a aVar3 = this.b;
                        wur wurVar = aVar3.c;
                        PointF pointF = aVar3.y;
                        gh00 gh00Var = (gh00) aVar3.a;
                        if (gh00Var.a.e(aVar3) && (h = gh00Var.h()) != null) {
                            pointF.set(h.getWidth() / 2.0f, ((h.getHeight() / 2.0f) - (aVar3.x.height() / 2.0f)) + aVar3.B);
                            PointF pointF2 = wurVar.a;
                            if (!jl40.l(pointF2, pointF)) {
                                pointF2.set(pointF);
                                wurVar.h = null;
                            }
                            ScreenRect a = wurVar.a();
                            gh00Var.a.g(aVar3, a, !aVar3.F, 200L);
                            aVar3.b.d(pointF, !aVar3.F, new bdp(9, aVar3, a));
                            aVar3.F = false;
                            break;
                        }
                        break;
                    case 1:
                        HashSet hashSet = aVar2.E;
                        if (!hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                aVar2.D.remove(it.next());
                            }
                            aVar2.I();
                            break;
                        }
                        break;
                    default:
                        aVar2.I();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.J = new Runnable(this) { // from class: ttr
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TaxiMapView h;
                int i32 = i3;
                a aVar2 = this.b;
                switch (i32) {
                    case 0:
                        a aVar3 = this.b;
                        wur wurVar = aVar3.c;
                        PointF pointF = aVar3.y;
                        gh00 gh00Var = (gh00) aVar3.a;
                        if (gh00Var.a.e(aVar3) && (h = gh00Var.h()) != null) {
                            pointF.set(h.getWidth() / 2.0f, ((h.getHeight() / 2.0f) - (aVar3.x.height() / 2.0f)) + aVar3.B);
                            PointF pointF2 = wurVar.a;
                            if (!jl40.l(pointF2, pointF)) {
                                pointF2.set(pointF);
                                wurVar.h = null;
                            }
                            ScreenRect a = wurVar.a();
                            gh00Var.a.g(aVar3, a, !aVar3.F, 200L);
                            aVar3.b.d(pointF, !aVar3.F, new bdp(9, aVar3, a));
                            aVar3.F = false;
                            break;
                        }
                        break;
                    case 1:
                        HashSet hashSet = aVar2.E;
                        if (!hashSet.isEmpty()) {
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                aVar2.D.remove(it.next());
                            }
                            aVar2.I();
                            break;
                        }
                        break;
                    default:
                        aVar2.I();
                        break;
                }
            }
        };
    }

    @Override // defpackage.a3v
    public final void F8(int i, int i2, Object obj) {
        q3(obj, 0, i, 0, i2);
    }

    @Override // defpackage.a3v
    public final Rect Gf() {
        return this.b.b();
    }

    public final void I() {
        Rect rect = this.x;
        rect.setEmpty();
        for (Rect rect2 : this.D.values()) {
            int i = rect.left;
            int i2 = rect2.left;
            if (i < i2) {
                i = i2;
            }
            rect.left = i;
            int i3 = rect.top;
            int i4 = rect2.top;
            if (i3 < i4) {
                i3 = i4;
            }
            rect.top = i3;
            int i5 = rect.right;
            int i6 = rect2.right;
            if (i5 < i6) {
                i5 = i6;
            }
            rect.right = i5;
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            if (i7 < i8) {
                i7 = i8;
            }
            rect.bottom = i7;
        }
        float f = rect.left;
        float f2 = this.C;
        float f3 = f + f2;
        wur wurVar = this.c;
        if (wurVar.d != f3) {
            wurVar.d = f3;
            wurVar.h = null;
        }
        float f4 = rect.top + f2;
        if (wurVar.b != f4) {
            wurVar.b = f4;
            wurVar.h = null;
        }
        float f5 = rect.right + f2;
        if (wurVar.e != f5) {
            wurVar.e = f5;
            wurVar.h = null;
        }
        float f6 = rect.bottom + f2;
        if (wurVar.c != f6) {
            wurVar.c = f6;
            wurVar.h = null;
        }
        requestFocusRect();
    }

    @Override // defpackage.a3v
    public final void Lc(Object obj, Rect rect) {
        vez0.i0("FocusCoordinator should be called from ui thread");
        HashSet hashSet = this.E;
        Handler handler = this.w;
        WeakHashMap weakHashMap = this.D;
        if (rect == null) {
            if (weakHashMap.containsKey(obj) && hashSet.add(obj)) {
                ttr ttrVar = this.I;
                handler.removeCallbacks(ttrVar);
                handler.postDelayed(ttrVar, 300L);
                return;
            }
            return;
        }
        hashSet.remove(obj);
        if (rect.equals((Rect) weakHashMap.get(obj))) {
            return;
        }
        weakHashMap.put(obj, rect);
        ttr ttrVar2 = this.J;
        handler.removeCallbacks(ttrVar2);
        handler.post(ttrVar2);
    }

    @Override // defpackage.a3v
    public final tpr M2() {
        return com.yandex.go.coroutines.b.d(this.z, new FocusCoordinator$focusRectFlow$1(this, null));
    }

    @Override // defpackage.a3v
    public final tpr Pd() {
        return this.b.c();
    }

    @Override // defpackage.a3v
    public final void Td(int i, Object obj) {
        q3(obj, 0, 0, 0, i);
    }

    @Override // defpackage.a3v
    public final void a0(Object obj) {
        if (obj != this.G) {
            return;
        }
        vez0.i0("FocusCoordinator should be called from ui thread");
        this.G = zy11.a;
        gh00 gh00Var = (gh00) this.a;
        TaxiMapView h = gh00Var.h();
        if (h != null) {
            h.removeSizeChangedListener(this.A);
        }
        gh00Var.r(this);
        ttr ttrVar = this.H;
        Handler handler = this.w;
        handler.removeCallbacks(ttrVar);
        handler.removeCallbacks(this.I);
        handler.removeCallbacks(this.J);
        this.E.clear();
        this.D.clear();
        this.b.a();
    }

    @Override // defpackage.a3v
    public final void b8(Object obj) {
        a0(this.G);
        this.G = obj;
        s1r s1rVar = new s1r(9, this);
        gh00 gh00Var = (gh00) this.a;
        gh00Var.q(s1rVar);
        gh00Var.p(this);
    }

    @Override // defpackage.a3v
    public final ScreenRect getFocusRect() {
        return this.c.a();
    }

    public final void h(int i, int i2) {
        float f = i;
        wur wurVar = this.c;
        if (wurVar.f != f) {
            wurVar.f = f;
            wurVar.h = null;
        }
        float f2 = i2;
        if (wurVar.g != f2) {
            wurVar.g = f2;
            wurVar.h = null;
        }
        this.F = true;
        requestFocusRect();
    }

    @Override // defpackage.a3v
    public final tpr m1() {
        return this.z;
    }

    @Override // defpackage.a3v
    public final void q3(Object obj, int i, int i2, int i3, int i4) {
        Lc(obj, new Rect(i, i2, i3, i4));
    }

    @Override // defpackage.a3v
    public final void requestFocusRect() {
        Handler handler = this.w;
        ttr ttrVar = this.H;
        handler.removeCallbacks(ttrVar);
        handler.post(ttrVar);
    }

    @Override // defpackage.a3v
    public final void t4(Object obj) {
        Lc(obj, null);
    }
}
