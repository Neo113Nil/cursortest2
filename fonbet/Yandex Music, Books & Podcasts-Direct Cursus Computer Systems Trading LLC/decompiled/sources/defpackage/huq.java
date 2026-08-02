package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class huq extends aur implements Function2 {
    public int j;
    public final /* synthetic */ stq k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ Function0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huq(stq stqVar, float f, float f2, float f3, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.k = stqVar;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = function0;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new huq(this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((huq) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            float f = kuq.a;
            guq guqVar = new guq(this.l, this.m, this.n, null);
            Object a = this.k.a(hqi.a, guqVar, this);
            if (a != nm6Var) {
                a = Unit.a;
            }
            if (a == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        Function0 function0 = this.o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.a;
    }
}
