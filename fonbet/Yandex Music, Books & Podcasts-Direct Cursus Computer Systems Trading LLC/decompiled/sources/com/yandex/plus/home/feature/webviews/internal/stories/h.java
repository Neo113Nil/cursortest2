package com.yandex.plus.home.feature.webviews.internal.stories;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.ryc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class h extends aur implements ryc {
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        h hVar = new h(4, (Continuation) obj4);
        hVar.j = booleanValue;
        hVar.k = booleanValue2;
        hVar.l = booleanValue3;
        return hVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean z = this.j;
        boolean z2 = this.k;
        boolean z3 = this.l;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return Boolean.valueOf(z && z2 && z3);
    }
}
