package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

/* loaded from: classes6.dex */
public final class hjb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bjb l;
    public final /* synthetic */ a m;
    public final /* synthetic */ Event n;
    public final /* synthetic */ DecoderEventData o;
    public final /* synthetic */ cjb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hjb(bjb bjbVar, Continuation continuation, a aVar, Event event, DecoderEventData decoderEventData, cjb cjbVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.n = event;
        this.o = decoderEventData;
        this.p = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                hjb hjbVar = new hjb(this.l, continuation, this.m, this.n, this.o, this.p, 0);
                hjbVar.k = obj;
                return hjbVar;
            case 1:
                hjb hjbVar2 = new hjb(this.l, continuation, this.m, this.n, this.o, this.p, 1);
                hjbVar2.k = obj;
                return hjbVar2;
            default:
                hjb hjbVar3 = new hjb(this.l, continuation, this.m, this.n, this.o, this.p, 2);
                hjbVar3.k = obj;
                return hjbVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((hjb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                    EventType eventType = EventType.EVENT;
                    aVar.g.getClass();
                    eventType.getClass();
                    boolean z = aVar.l;
                    ylr ylrVar = aVar.a;
                    cjb cjbVar = this.p;
                    DecoderEventData decoderEventData = this.o;
                    bjb bjbVar = this.l;
                    if (z) {
                        EventDefault h = a.h(aVar, bjbVar, this.n, null, null, eventType, decoderEventData, cjbVar, 6);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        ylrVar.b(a.h(aVar, bjbVar, this.n, null, null, eventType, decoderEventData, cjbVar, 6));
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            case 1:
                a aVar2 = this.m;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar3 = z7o.b;
                    EventType eventType2 = EventType.EVENT;
                    aVar2.g.getClass();
                    eventType2.getClass();
                    boolean z2 = aVar2.l;
                    ylr ylrVar2 = aVar2.a;
                    cjb cjbVar2 = this.p;
                    DecoderEventData decoderEventData2 = this.o;
                    bjb bjbVar2 = this.l;
                    if (z2) {
                        EventDefault h2 = a.h(aVar2, bjbVar2, this.n, null, null, eventType2, decoderEventData2, cjbVar2, 6);
                        ylrVar2.getClass();
                        ylrVar2.c(h2);
                    } else {
                        ylrVar2.b(a.h(aVar2, bjbVar2, this.n, null, null, eventType2, decoderEventData2, cjbVar2, 6));
                    }
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                break;
            default:
                a aVar3 = this.m;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar5 = z7o.b;
                    EventType eventType3 = EventType.EVENT;
                    aVar3.g.getClass();
                    eventType3.getClass();
                    boolean z3 = aVar3.l;
                    ylr ylrVar3 = aVar3.a;
                    cjb cjbVar3 = this.p;
                    DecoderEventData decoderEventData3 = this.o;
                    bjb bjbVar3 = this.l;
                    if (z3) {
                        EventDefault h3 = a.h(aVar3, bjbVar3, this.n, null, null, eventType3, decoderEventData3, cjbVar3, 6);
                        ylrVar3.getClass();
                        ylrVar3.c(h3);
                    } else {
                        ylrVar3.b(a.h(aVar3, bjbVar3, this.n, null, null, eventType3, decoderEventData3, cjbVar3, 6));
                    }
                } catch (Throwable unused3) {
                    r7o r7oVar6 = z7o.b;
                }
                break;
        }
        return Unit.a;
    }
}
