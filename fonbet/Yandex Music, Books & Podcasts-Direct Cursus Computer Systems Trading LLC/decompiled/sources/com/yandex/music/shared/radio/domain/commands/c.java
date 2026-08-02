package com.yandex.music.shared.radio.domain.commands;

import defpackage.aur;
import defpackage.lhn;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.s8q;
import defpackage.x0q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c extends aur implements pyc {
    public /* synthetic */ s8q j;

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = new c(3, (Continuation) obj3);
        cVar.j = (s8q) obj;
        return cVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        s8q s8qVar = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ((x0q) s8qVar.m.c).a(lhn.a);
        return Unit.a;
    }
}
