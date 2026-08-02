package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover;

import defpackage.acu;
import defpackage.b801;
import defpackage.fzw;
import defpackage.hjh;
import defpackage.j00;
import defpackage.kcz0;
import defpackage.p1b;
import defpackage.qgl0;
import defpackage.st2;
import defpackage.tpr;
import defpackage.ugl0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class d implements b801 {
    public final String a;
    public final qgl0 b;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.rover.a c;
    public final hjh d;
    public final st2 e;
    public final j00 f;
    public final p1b g;
    public final kcz0 h;
    public final m0 i;
    public final String j = "rover-key";

    public d(String str, ugl0 ugl0Var, qgl0 qgl0Var, ru.yandex.taxi.logistics.sdk.tracking.impl.rover.a aVar, hjh hjhVar, st2 st2Var, ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, j00 j00Var, p1b p1bVar, kcz0 kcz0Var) {
        this.a = str;
        this.b = qgl0Var;
        this.c = aVar;
        this.d = hjhVar;
        this.e = st2Var;
        this.f = j00Var;
        this.g = p1bVar;
        this.h = kcz0Var;
        this.i = new m0(new fzw(23, new acu(eVar.e, 19), this), ugl0Var.b, new RoverStateHolder$widgetModelFlow$2(this, null));
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.i;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.j;
    }
}
