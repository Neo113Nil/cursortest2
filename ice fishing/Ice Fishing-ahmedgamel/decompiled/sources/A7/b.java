package A7;

import B7.g;
import I7.p;
import S7.AbstractC0383a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: n, reason: collision with root package name */
    public int f62n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f63u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0383a f64v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, AbstractC0383a abstractC0383a, AbstractC0383a abstractC0383a2) {
        super(abstractC0383a);
        this.f63u = pVar;
        this.f64v = abstractC0383a2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f62n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f62n = 2;
            com.bumptech.glide.d.k(obj);
            return obj;
        }
        this.f62n = 1;
        com.bumptech.glide.d.k(obj);
        p pVar = this.f63u;
        h.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f64v, this);
    }
}
