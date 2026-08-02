package ru.yandex.taxi.address.clarification.impl.ui;

import android.content.Context;
import com.yandex.go.zone.repository.o;
import defpackage.ah00;
import defpackage.bq0;
import defpackage.exu0;
import defpackage.h55;
import defpackage.i130;
import defpackage.kr0;
import defpackage.pwy0;
import defpackage.qx60;
import defpackage.rp0;
import defpackage.sy0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ty0;
import defpackage.up0;
import defpackage.wb1;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final class d extends h55 implements ty0 {
    public final Context D;
    public final ah00 E;
    public final o F;
    public final qx60 G;
    public final com.yandex.go.route.interactor.b H;
    public final wb1 I;
    public final ru.yandex.taxi.address.clarification.impl.repo.a J;
    public final i130 K;
    public final kr0 L;
    public final bq0 M;
    public final rp0 N;
    public final exu0 O;
    public final pwy0 P;

    public d(Context context, ah00 ah00Var, o oVar, qx60 qx60Var, com.yandex.go.route.interactor.b bVar, wb1 wb1Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar, i130 i130Var, kr0 kr0Var, bq0 bq0Var, rp0 rp0Var, exu0 exu0Var, pwy0 pwy0Var) {
        super(null);
        this.D = context;
        this.E = ah00Var;
        this.F = oVar;
        this.G = qx60Var;
        this.H = bVar;
        this.I = wb1Var;
        this.J = aVar;
        this.K = i130Var;
        this.L = kr0Var;
        this.M = bq0Var;
        this.N = rp0Var;
        this.O = exu0Var;
        this.P = pwy0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        sy0 sy0Var = (sy0) obj;
        this.J.d = up0.b;
        tse o = o();
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        tje.N(o, null, coroutineStart, new AddressMapPickerAdjustmentRouterImpl$onLaunch$1(sy0Var, null, this), 1);
        tje.N(o(), null, coroutineStart, new AddressMapPickerAdjustmentRouterImpl$onLaunch$2(sy0Var, null, this), 1);
    }
}
