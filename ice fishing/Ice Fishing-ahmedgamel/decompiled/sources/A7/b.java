package A7;

import B7.g;
import I7.p;
import S7.AbstractC0387a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: n, reason: collision with root package name */
    public int f219n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f220u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0387a f221v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, AbstractC0387a abstractC0387a, AbstractC0387a abstractC0387a2) {
        super(abstractC0387a);
        this.f220u = pVar;
        this.f221v = abstractC0387a2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f219n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f219n = 2;
            Q3.b.s(obj);
            return obj;
        }
        this.f219n = 1;
        Q3.b.s(obj);
        p pVar = this.f220u;
        h.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f221v, this);
    }
}
