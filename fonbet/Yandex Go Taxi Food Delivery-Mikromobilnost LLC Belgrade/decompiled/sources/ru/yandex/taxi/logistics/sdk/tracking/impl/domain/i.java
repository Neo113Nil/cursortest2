package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import com.yandex.messenger.websdk.api.Cancelable;
import defpackage.acu;
import defpackage.bvf0;
import defpackage.ey4;
import defpackage.fzw;
import defpackage.gci0;
import defpackage.ike;
import defpackage.j00;
import defpackage.jse;
import defpackage.st2;
import defpackage.wsr0;
import defpackage.x501;
import defpackage.xsr0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes5.dex */
public final class i {
    public final x501 a;
    public final j00 b;
    public final com.yandex.delivery.utils.auth.impl.a c;
    public Cancelable d;
    public final ike e;
    public final gci0 f;

    public i(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, st2 st2Var, x501 x501Var, j00 j00Var, com.yandex.delivery.utils.auth.impl.a aVar) {
        this.a = x501Var;
        this.b = j00Var;
        this.c = aVar;
        jse jseVar = st2Var.b;
        ike a = bvf0.a(jseVar);
        this.e = a;
        this.f = kotlinx.coroutines.flow.e.R(new o(new kotlinx.coroutines.flow.k(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(new fzw(9, new fzw(8, new ey4(new acu(eVar.e, 5), 14), this), this)), jseVar), new MessengerInteractor$special$$inlined$flatMapLatest$1(null, this)), st2Var.a), new MessengerInteractor$unreadCountFlow$5(null, this)), new MessengerInteractor$unreadCountFlow$6(3, null)), a, wsr0.a(xsr0.a, 3), 0);
    }
}
