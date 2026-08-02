package ru.yandex.taxi.viewholder;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.mapkit.map.Map;
import defpackage.ah00;
import defpackage.el00;
import defpackage.fc5;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hcs;
import defpackage.i3y;
import defpackage.pzt0;
import defpackage.qt00;
import defpackage.rt00;
import defpackage.sls;
import defpackage.ssu;
import defpackage.te61;
import defpackage.tje;
import defpackage.tse;
import defpackage.v65;
import defpackage.w511;
import defpackage.wi00;
import defpackage.xi00;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.ui.FragmentBackground;
import ru.yandex.taxi.viewholder.b;

/* loaded from: classes10.dex */
public final class b implements xi00 {
    public final h3y a;
    public final p b;
    public final ah00 c;
    public final te61 d;
    public final tse e;
    public final hcs f;
    public final fc5 g;
    public final h3y h;
    public final el00 i;
    public final i3y j;
    public final i3y k;
    public MapViewHolder$MapState o;
    public boolean q;
    public boolean r;
    public boolean s;
    public pzt0 t;
    public final v65 u;
    public final Handler l = new Handler(Looper.getMainLooper());
    public final HashSet m = new HashSet();
    public final ssu n = new ssu(8, this);
    public final CopyOnWriteArraySet p = new CopyOnWriteArraySet();

    public b(h3y h3yVar, p pVar, ah00 ah00Var, te61 te61Var, Lifecycle lifecycle, tse tseVar, hcs hcsVar, fc5 fc5Var, h3y h3yVar2, el00 el00Var) {
        this.a = h3yVar;
        this.b = pVar;
        this.c = ah00Var;
        this.d = te61Var;
        this.e = tseVar;
        this.f = hcsVar;
        this.g = fc5Var;
        this.h = h3yVar2;
        this.i = el00Var;
        final int i = 0;
        this.j = kotlin.a.a(new sls(this) { // from class: pt00
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        ViewGroup viewGroup = ((a400) bVar.a.get()).a;
                        int i3 = ahh0.background;
                        WeakHashMap weakHashMap = androidx.core.view.b.a;
                        return (ImageView) ((View) rp31.d(viewGroup, i3));
                    default:
                        View view = ((a400) bVar.a.get()).f;
                        int i4 = g6h0.map_cover;
                        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                        return (View) rp31.d(view, i4);
                }
            }
        });
        final int i2 = 1;
        this.k = kotlin.a.a(new sls(this) { // from class: pt00
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        ViewGroup viewGroup = ((a400) bVar.a.get()).a;
                        int i3 = ahh0.background;
                        WeakHashMap weakHashMap = androidx.core.view.b.a;
                        return (ImageView) ((View) rp31.d(viewGroup, i3));
                    default:
                        View view = ((a400) bVar.a.get()).f;
                        int i4 = g6h0.map_cover;
                        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                        return (View) rp31.d(view, i4);
                }
            }
        });
        tje.N(tseVar, null, null, new MapViewHolder$special$$inlined$safeCollectIn$1(r.b(lifecycle), null, this), 3);
        this.u = new v65(2, this);
    }

    public final void a(wi00 wi00Var) {
        TaxiMapView d;
        HashSet hashSet = this.m;
        boolean isEmpty = hashSet.isEmpty();
        if (hashSet.add(wi00Var)) {
            if (isEmpty || ((d = d()) != null && d.isEnabled())) {
                g(false);
            }
        }
    }

    public final ImageView b() {
        return (ImageView) this.j.getValue();
    }

    public final View c() {
        return (View) this.k.getValue();
    }

    public final TaxiMapView d() {
        p pVar = this.b;
        if (pVar.isInitialized()) {
            return pVar.getValue();
        }
        return null;
    }

    public final void e() {
        MapViewHolder$MapState mapViewHolder$MapState = this.o;
        MapViewHolder$MapState mapViewHolder$MapState2 = MapViewHolder$MapState.EXPANDED;
        CopyOnWriteArraySet copyOnWriteArraySet = this.p;
        if (mapViewHolder$MapState != mapViewHolder$MapState2) {
            this.o = mapViewHolder$MapState2;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((qt00) it.next()).onMapExpanded();
            }
        }
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((qt00) it2.next()).onMapDragged();
        }
    }

    public final void f(wi00 wi00Var) {
        TaxiMapView d;
        HashSet hashSet = this.m;
        if (hashSet.remove(wi00Var)) {
            if (hashSet.isEmpty() || !((d = d()) == null || d.isEnabled())) {
                g(true);
            }
        }
    }

    public final void g(boolean z) {
        c().setEnabled(z);
        c().getParent().requestDisallowInterceptTouchEvent(true);
        TaxiMapView d = d();
        if (d != null) {
            d.setEnabled(z);
        }
        gh00 gh00Var = (gh00) this.c;
        Map map = gh00Var.b;
        if (map != null) {
            map.setScrollGesturesEnabled(z);
        }
        Map map2 = gh00Var.b;
        if (map2 != null) {
            map2.setZoomGesturesEnabled(z);
        }
    }

    public final void h() {
        MapViewHolder$MapState mapViewHolder$MapState = this.o;
        MapViewHolder$MapState mapViewHolder$MapState2 = MapViewHolder$MapState.COLLAPSED;
        if (mapViewHolder$MapState != mapViewHolder$MapState2) {
            this.o = mapViewHolder$MapState2;
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((qt00) it.next()).onMapCollapsed();
            }
        }
    }

    public final void i(TaxiMapView taxiMapView, FragmentBackground fragmentBackground) {
        b().animate().cancel();
        int i = rt00.b[fragmentBackground.ordinal()];
        if (i == 1) {
            taxiMapView.setVisibility(8);
            b().setVisibility(8);
        } else if (i == 2) {
            taxiMapView.setVisibility(0);
            b().setVisibility(8);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            taxiMapView.setVisibility(8);
            b().setVisibility(0);
            b().setAlpha(1.0f);
        }
    }
}
