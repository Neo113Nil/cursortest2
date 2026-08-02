package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class kgd extends aur implements Function2 {
    public final /* synthetic */ ygd j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ double l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgd(ygd ygdVar, boolean z, double d, Continuation continuation) {
        super(2, continuation);
        this.j = ygdVar;
        this.k = z;
        this.l = d;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new kgd(this.j, this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kgd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new Double(rre.U(this.j, this.k, this.l));
    }
}
