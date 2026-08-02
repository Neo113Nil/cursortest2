package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

/* loaded from: classes6.dex */
public final class mjb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bjb l;
    public final /* synthetic */ a m;
    public final /* synthetic */ PlayerState n;
    public final /* synthetic */ nar o;
    public final /* synthetic */ cjb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjb(bjb bjbVar, Continuation continuation, a aVar, PlayerState playerState, nar narVar, cjb cjbVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.n = playerState;
        this.o = narVar;
        this.p = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                mjb mjbVar = new mjb(this.l, continuation, this.m, this.n, this.o, this.p, 0);
                mjbVar.k = obj;
                return mjbVar;
            default:
                mjb mjbVar2 = new mjb(this.l, continuation, this.m, this.n, this.o, this.p, 1);
                mjbVar2.k = obj;
                return mjbVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mjb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                a aVar = this.m;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar = z7o.b;
                    Event event = Event.STALLED;
                    EventType eventType = EventType.EVENT;
                    aVar.g.getClass();
                    eventType.getClass();
                    boolean z = aVar.l;
                    ylr ylrVar = aVar.a;
                    cjb cjbVar = this.p;
                    PlayerState playerState = this.n;
                    bjb bjbVar = this.l;
                    if (z) {
                        EventDefault c = a.c(aVar, bjbVar, event, playerState, this.o, cjbVar);
                        ylrVar.getClass();
                        ylrVar.c(c);
                    } else {
                        ylrVar.b(a.c(aVar, bjbVar, event, playerState, this.o, cjbVar));
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar3 = z7o.b;
                    a aVar2 = this.m;
                    Event event2 = Event.STALLED_END;
                    EventType eventType2 = EventType.EVENT;
                    aVar2.g.getClass();
                    eventType2.getClass();
                    boolean z2 = aVar2.l;
                    ylr ylrVar2 = aVar2.a;
                    cjb cjbVar2 = this.p;
                    nar narVar = this.o;
                    PlayerState playerState2 = this.n;
                    bjb bjbVar2 = this.l;
                    a aVar3 = this.m;
                    if (z2) {
                        EventDefault c2 = a.c(aVar3, bjbVar2, event2, playerState2, narVar, cjbVar2);
                        ylrVar2.getClass();
                        ylrVar2.c(c2);
                    } else {
                        ylrVar2.b(a.c(aVar3, bjbVar2, event2, playerState2, narVar, cjbVar2));
                    }
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                break;
        }
        return Unit.a;
    }
}
