package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;

/* loaded from: classes6.dex */
public final class ijb extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bjb k;
    public final /* synthetic */ a l;
    public final /* synthetic */ PlayerState m;
    public final /* synthetic */ Throwable n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ DefaultEventData p;
    public final /* synthetic */ cjb q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijb(bjb bjbVar, Continuation continuation, a aVar, PlayerState playerState, Throwable th, boolean z, DefaultEventData defaultEventData, cjb cjbVar) {
        super(2, continuation);
        this.k = bjbVar;
        this.l = aVar;
        this.m = playerState;
        this.n = th;
        this.o = z;
        this.p = defaultEventData;
        this.q = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ijb ijbVar = new ijb(this.k, continuation, this.l, this.m, this.n, this.o, this.p, this.q);
        ijbVar.j = obj;
        return ijbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ijb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        bjb bjbVar = this.k;
        try {
            r7o r7oVar = z7o.b;
            a aVar = this.l;
            PlayerState playerState = this.m;
            Throwable th = this.n;
            boolean z = this.o;
            DefaultEventData defaultEventData = this.p;
            cjb cjbVar = this.q;
            List list = a.q;
            aVar.q(bjbVar, playerState, th, false, z, defaultEventData, cjbVar);
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
        return Unit.a;
    }
}
