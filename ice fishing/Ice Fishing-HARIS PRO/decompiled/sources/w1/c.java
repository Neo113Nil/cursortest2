package w1;

import C1.p;
import D1.q;
import h0.f;
import v1.d;
import v1.i;

/* loaded from: classes.dex */
public final class c extends x1.c {

    /* renamed from: d, reason: collision with root package name */
    public int f4667d;
    public final /* synthetic */ p e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f4668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, p pVar, d dVar2) {
        super(dVar, iVar);
        this.e = pVar;
        this.f4668f = dVar2;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        int i = this.f4667d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4667d = 2;
            f.D(obj);
            return obj;
        }
        this.f4667d = 1;
        f.D(obj);
        p pVar = this.e;
        D1.i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        q.a(2, pVar);
        return pVar.d(this.f4668f, this);
    }
}
