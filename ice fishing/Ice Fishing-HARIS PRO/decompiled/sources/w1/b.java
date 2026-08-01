package w1;

import C1.p;
import D1.i;
import D1.q;
import h0.f;
import v1.d;
import x1.g;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public int f4664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f4666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, d dVar, d dVar2) {
        super(dVar);
        this.f4665c = pVar;
        this.f4666d = dVar2;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        int i = this.f4664b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4664b = 2;
            f.D(obj);
            return obj;
        }
        this.f4664b = 1;
        f.D(obj);
        p pVar = this.f4665c;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        q.a(2, pVar);
        return pVar.d(this.f4666d, this);
    }
}
