package com.yandex.music.shared.generative.domain.commands;

import defpackage.aur;
import defpackage.bv6;
import defpackage.nm6;
import defpackage.nq7;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.u2l;
import defpackage.x97;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class b extends aur implements pyc {
    public /* synthetic */ nq7 j;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = new b(3, (Continuation) obj3);
        bVar.j = (nq7) obj;
        return bVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nq7 nq7Var = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        x97.y(nq7Var.p, null, null, new bv6(nq7Var, u2l.a, null, 23), 3);
        return Unit.a;
    }
}
