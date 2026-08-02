package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.SeekEventData;

/* loaded from: classes6.dex */
public final class ljb extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bjb k;
    public final /* synthetic */ a l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ cjb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljb(bjb bjbVar, Continuation continuation, a aVar, long j, long j2, cjb cjbVar) {
        super(2, continuation);
        this.k = bjbVar;
        this.l = aVar;
        this.m = j;
        this.n = j2;
        this.o = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ljb ljbVar = new ljb(this.k, continuation, this.l, this.m, this.n, this.o);
        ljbVar.j = obj;
        return ljbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ljb) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        try {
            r7o r7oVar = z7o.b;
            a aVar = this.l;
            Event event = Event.SEEK;
            EventType eventType = EventType.EVENT;
            aVar.g.getClass();
            eventType.getClass();
            boolean z = aVar.l;
            ylr ylrVar = aVar.a;
            cjb cjbVar = this.o;
            long j = this.n;
            long j2 = this.m;
            bjb bjbVar = this.k;
            a aVar2 = this.l;
            if (z) {
                EventDefault g = a.g(aVar2, bjbVar, event.getEventName(), null, null, new SeekEventData(j2, j), cjbVar, 10);
                ylrVar.getClass();
                ylrVar.c(g);
            } else {
                ylrVar.b(a.g(aVar2, bjbVar, event.getEventName(), null, null, new SeekEventData(j2, j), cjbVar, 10));
            }
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
        return Unit.a;
    }
}
