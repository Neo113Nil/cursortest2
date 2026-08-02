package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes6.dex */
public final class pbb extends aur implements Function1 {
    public final /* synthetic */ u1q j;
    public final /* synthetic */ e k;
    public final /* synthetic */ xsu l;
    public final /* synthetic */ a6l m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbb(u1q u1qVar, e eVar, xsu xsuVar, a6l a6lVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.j = u1qVar;
        this.k = eVar;
        this.l = xsuVar;
        this.m = a6lVar;
        this.n = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new pbb(this.j, this.k, this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((pbb) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List list = this.j.a.b;
        list.getClass();
        return y5g.Y(list, new qdc(this.k, (h) null, 2), this.l, null, this.m, null, null, q0q.a, this.n, 472);
    }
}
