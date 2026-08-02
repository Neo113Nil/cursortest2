package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.layer.styling.NavigationStyleProvider;
import com.yandex.mapkit.road_events_layer.StyleProvider;
import defpackage.el00;
import defpackage.ga50;
import defpackage.j24;
import defpackage.t35;

/* loaded from: classes6.dex */
public final class b extends t35 {
    public final el00 d;
    public final MapWindow e;
    public final StyleProvider f;
    public final NavigationStyleProvider g;
    public final Navigation h;

    public b(el00 el00Var, MapWindow mapWindow, StyleProvider styleProvider, ga50 ga50Var, Navigation navigation) {
        this.d = el00Var;
        this.e = mapWindow;
        this.f = styleProvider;
        this.g = ga50Var;
        this.h = navigation;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new AutomotiveNavigationLayerHolder$requestCreation$1(j24Var, this, null));
    }
}
