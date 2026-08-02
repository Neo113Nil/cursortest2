package defpackage;

import com.yandex.music.shared.modernfit.MethodHandler;

/* loaded from: classes3.dex */
public final class m3i extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ MethodHandler k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3i(MethodHandler methodHandler, cg6 cg6Var) {
        super(cg6Var);
        this.k = methodHandler;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, null, this);
    }
}
