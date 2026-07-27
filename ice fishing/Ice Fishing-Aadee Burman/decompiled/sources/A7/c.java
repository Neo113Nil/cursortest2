package A7;

import I7.p;
import S7.AbstractC0383a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class c extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public int f65n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f66u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0383a f67v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AbstractC0383a abstractC0383a, InterfaceC5272i interfaceC5272i, p pVar, AbstractC0383a abstractC0383a2) {
        super(abstractC0383a, interfaceC5272i);
        this.f66u = pVar;
        this.f67v = abstractC0383a2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f65n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f65n = 2;
            com.bumptech.glide.d.k(obj);
            return obj;
        }
        this.f65n = 1;
        com.bumptech.glide.d.k(obj);
        p pVar = this.f66u;
        h.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f67v, this);
    }
}
