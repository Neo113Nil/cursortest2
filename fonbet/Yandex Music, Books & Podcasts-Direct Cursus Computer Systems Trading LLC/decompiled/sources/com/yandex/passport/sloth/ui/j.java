package com.yandex.passport.sloth.ui;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pjc pjcVar, Continuation continuation, com.yandex.passport.sloth.t tVar) {
        super(2, continuation);
        this.j = 2;
        this.l = pjcVar;
        this.m = tVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j((String) this.l, (SlothJsApi$WebAmJsInterface) this.m, continuation, 0);
            case 1:
                return new j((b0) this.l, (a1) this.m, continuation, 1);
            default:
                return new j((pjc) this.l, continuation, (com.yandex.passport.sloth.t) this.m);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object processRequest;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    String str = (String) this.l;
                    if (str != null) {
                        SlothJsApi$WebAmJsInterface slothJsApi$WebAmJsInterface = (SlothJsApi$WebAmJsInterface) this.m;
                        this.k = 1;
                        processRequest = slothJsApi$WebAmJsInterface.processRequest(str, this);
                        if (processRequest == nm6Var) {
                        }
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.network.token.i iVar = ((b0) this.l).s;
                    a1 a1Var = (a1) this.m;
                    this.k = 1;
                    iVar.getClass();
                    Object f = ((com.yandex.passport.sloth.c1) a1Var).f(u0.a, this);
                    if (f != nm6Var2) {
                        f = Unit.a;
                    }
                    if (f == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(15, (com.yandex.passport.sloth.t) this.m);
                    this.k = 1;
                    if (pjcVar.collect(aVar, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }
}
