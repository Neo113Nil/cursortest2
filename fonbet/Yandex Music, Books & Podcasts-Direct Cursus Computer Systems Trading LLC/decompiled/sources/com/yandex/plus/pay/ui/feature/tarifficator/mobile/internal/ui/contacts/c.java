package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class c extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ com.yandex.plus.pay.ui.core.mobile.view.toolbar.h k;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.mobile.view.toolbar.i l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.yandex.plus.pay.ui.core.mobile.view.toolbar.i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.l = iVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar = (com.yandex.plus.pay.ui.core.mobile.view.toolbar.h) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                c cVar = new c(this.l, continuation, 0);
                cVar.k = hVar;
                return cVar.invokeSuspend(Unit.a);
            default:
                c cVar2 = new c(this.l, continuation, 1);
                cVar2.k = hVar;
                return cVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.i iVar = this.l;
        switch (i) {
            case 0:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                iVar.a(hVar);
                break;
            default:
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h hVar2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                iVar.a(hVar2);
                break;
        }
        return Unit.a;
    }
}
