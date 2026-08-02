package ru.yandex.taxi.map_common;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.jy60;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class a implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public pzt0 f;

    public a(tse tseVar, Lifecycle lifecycle, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = h3yVar;
        this.d = h3yVar2;
        this.e = h3yVar3;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LayersActivityLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        LayersActivityLifecycleListener$onFirstContentfulPaint$1 layersActivityLifecycleListener$onFirstContentfulPaint$1 = new LayersActivityLifecycleListener$onFirstContentfulPaint$1(this, null);
        tse tseVar = this.a;
        this.f = tje.N(tseVar, null, null, layersActivityLifecycleListener$onFirstContentfulPaint$1, 3);
        tje.N(tseVar, null, null, new LayersActivityLifecycleListener$onFirstContentfulPaint$2(this, null), 3);
        tje.N(tseVar, null, null, new LayersActivityLifecycleListener$onFirstContentfulPaint$3(this, null), 3);
    }
}
