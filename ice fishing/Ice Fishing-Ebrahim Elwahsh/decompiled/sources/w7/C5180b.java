package w7;

import E7.p;
import O7.AbstractC0376a;
import com.bumptech.glide.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import x7.g;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5180b extends g {

    /* renamed from: n, reason: collision with root package name */
    public int f41708n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f41709u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0376a f41710v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5180b(p pVar, AbstractC0376a abstractC0376a, AbstractC0376a abstractC0376a2) {
        super(abstractC0376a);
        this.f41709u = pVar;
        this.f41710v = abstractC0376a2;
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        int i = this.f41708n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f41708n = 2;
            f.r(obj);
            return obj;
        }
        this.f41708n = 1;
        f.r(obj);
        p pVar = this.f41709u;
        h.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u.b(2, pVar);
        return pVar.invoke(this.f41710v, this);
    }
}
