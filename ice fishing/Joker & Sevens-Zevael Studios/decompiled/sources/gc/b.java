package gc;

import hc.h;
import pc.j;
import pc.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: g, reason: collision with root package name */
    public int f2563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.e f2564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fc.d f2565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fc.d dVar, fc.d dVar2, oc.e eVar) {
        super(dVar);
        this.f2564h = eVar;
        this.f2565i = dVar2;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f2563g;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2563g = 2;
            v6.a.W(obj);
            return obj;
        }
        this.f2563g = 1;
        v6.a.W(obj);
        oc.e eVar = this.f2564h;
        j.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        v.c(2, eVar);
        return eVar.invoke(this.f2565i, this);
    }
}
