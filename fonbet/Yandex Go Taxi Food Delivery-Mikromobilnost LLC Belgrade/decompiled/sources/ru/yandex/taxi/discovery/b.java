package ru.yandex.taxi.discovery;

import defpackage.a3v;
import defpackage.e90;
import defpackage.h3y;
import defpackage.kf00;
import defpackage.lcw;
import defpackage.mwj;
import defpackage.pq00;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tse;
import defpackage.w030;
import defpackage.zuj0;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes9.dex */
public final class b implements pq00 {
    public final tse A;
    public final ru.yandex.taxi.layers.b B;
    public lcw C;
    public ModalView D;
    public final h3y a;
    public final zuj0 b;
    public final a3v c;
    public final kf00 w;
    public final h3y x;
    public final h3y y;
    public final w030 z;

    public b(h3y h3yVar, zuj0 zuj0Var, a3v a3vVar, kf00 kf00Var, h3y h3yVar2, h3y h3yVar3, w030 w030Var, tse tseVar, ru.yandex.taxi.layers.b bVar) {
        this.a = h3yVar;
        this.b = zuj0Var;
        this.c = a3vVar;
        this.w = kf00Var;
        this.x = h3yVar2;
        this.y = h3yVar3;
        this.z = w030Var;
        this.A = tseVar;
        this.B = bVar;
    }

    @Override // defpackage.pq00
    public final void a() {
        this.C = null;
    }

    public final e90 b(mwj mwjVar, sy60 sy60Var) {
        return new e90(25, tje.N(this.A, null, CoroutineStart.UNDISPATCHED, new DiscoveryRouterImpl$launch$launchJob$1(this, mwjVar, sy60Var, null), 1), this);
    }

    @Override // defpackage.pq00
    public final void d(lcw lcwVar) {
        this.C = lcwVar;
    }
}
