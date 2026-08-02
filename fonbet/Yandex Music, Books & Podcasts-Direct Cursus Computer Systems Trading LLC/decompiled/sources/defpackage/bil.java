package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class bil extends aur implements ryc {
    public /* synthetic */ eml j;
    public /* synthetic */ eml k;
    public /* synthetic */ eml l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ eil n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ n7q q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bil(Object obj, eil eilVar, Object obj2, Object obj3, n7q n7qVar, Continuation continuation) {
        super(4, continuation);
        this.m = obj;
        this.n = eilVar;
        this.o = obj2;
        this.p = obj3;
        this.q = n7qVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = this.p;
        n7q n7qVar = this.q;
        bil bilVar = new bil(this.m, this.n, this.o, obj5, n7qVar, (Continuation) obj4);
        bilVar.j = (eml) obj;
        bilVar.k = (eml) obj2;
        bilVar.l = (eml) obj3;
        return bilVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        eml emlVar = this.j;
        eml emlVar2 = this.k;
        eml emlVar3 = this.l;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        Object obj2 = this.m;
        cml cmlVar = obj2 != null ? new cml(obj2, emlVar) : null;
        cml cmlVar2 = new cml(this.o, emlVar2);
        Object obj3 = this.p;
        return new wml(new kml(cmlVar, cmlVar2, obj3 != null ? new cml(obj3, emlVar3) : null), this.q);
    }
}
