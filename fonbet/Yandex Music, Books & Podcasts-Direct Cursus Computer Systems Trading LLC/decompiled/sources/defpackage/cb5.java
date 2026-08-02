package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class cb5 extends aur implements vyc {
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vxv p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb5(vxv vxvVar, Continuation continuation) {
        super(7, continuation);
        this.p = vxvVar;
    }

    @Override // defpackage.vyc
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        cb5 cb5Var = new cb5(this.p, (Continuation) serializable);
        cb5Var.j = obj;
        cb5Var.k = obj2;
        cb5Var.l = obj3;
        cb5Var.m = obj4;
        cb5Var.n = obj5;
        cb5Var.o = obj6;
        return cb5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.j;
        Object obj3 = this.k;
        Object obj4 = this.l;
        Object obj5 = this.m;
        Object obj6 = this.n;
        Object obj7 = this.o;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return this.p.b(obj2, obj3, obj4, obj5, obj6, obj7);
    }
}
