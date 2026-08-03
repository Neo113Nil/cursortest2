package gc;

import fc.i;
import pc.j;
import pc.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public int f2566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.e f2567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fc.d f2568i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fc.d dVar, i iVar, oc.e eVar, fc.d dVar2) {
        super(dVar, iVar);
        this.f2567h = eVar;
        this.f2568i = dVar2;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f2566g;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f2566g = 2;
            v6.a.W(obj);
            return obj;
        }
        this.f2566g = 1;
        v6.a.W(obj);
        oc.e eVar = this.f2567h;
        j.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        v.c(2, eVar);
        return eVar.invoke(this.f2568i, this);
    }
}
