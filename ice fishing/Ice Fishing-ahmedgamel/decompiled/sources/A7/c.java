package A7;

import I7.p;
import S7.AbstractC0387a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class c extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public int f222n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f223u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0387a f224v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC0387a abstractC0387a, InterfaceC5245i interfaceC5245i, p pVar, AbstractC0387a abstractC0387a2) {
        super(abstractC0387a, interfaceC5245i);
        this.f223u = pVar;
        this.f224v = abstractC0387a2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f222n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f222n = 2;
            Q3.b.s(obj);
            return obj;
        }
        this.f222n = 1;
        Q3.b.s(obj);
        p pVar = this.f223u;
        h.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f224v, this);
    }
}
