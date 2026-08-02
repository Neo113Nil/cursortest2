package com.yandex.passport.internal.ui.sloth.screen;

import defpackage.aur;
import defpackage.lz6;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.ub7;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = iVar;
        this.m = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                g gVar = new g(this.l, this.m, continuation, 0);
                gVar.k = obj;
                return gVar;
            default:
                g gVar2 = new g(this.l, this.m, continuation, 1);
                gVar2.k = obj;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function1 function1 = this.m;
        i iVar = this.l;
        switch (i) {
            case 0:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                zsd.r0(mm6Var, new ub7(12, iVar.m, new lz6(function1, (Continuation) null, 4)));
                break;
            default:
                mm6 mm6Var2 = (mm6) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                zsd.r0(mm6Var2, new ub7(12, iVar.l, new lz6(function1, (Continuation) null, 5)));
                break;
        }
        return Unit.a;
    }
}
