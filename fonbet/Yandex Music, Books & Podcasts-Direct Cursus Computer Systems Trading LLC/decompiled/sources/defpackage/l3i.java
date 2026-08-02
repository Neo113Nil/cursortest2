package defpackage;

import com.yandex.music.shared.modernfit.MethodHandler;

/* loaded from: classes3.dex */
public final class l3i extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ MethodHandler l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3i(MethodHandler methodHandler, cg6 cg6Var) {
        super(cg6Var);
        this.l = methodHandler;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, null, this);
    }
}
