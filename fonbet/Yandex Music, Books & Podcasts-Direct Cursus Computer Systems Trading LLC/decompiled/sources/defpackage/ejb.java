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
public final class ejb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bjb l;
    public final /* synthetic */ a m;
    public final /* synthetic */ PlayerState n;
    public final /* synthetic */ cjb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejb(bjb bjbVar, Continuation continuation, a aVar, PlayerState playerState, cjb cjbVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.n = playerState;
        this.o = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                ejb ejbVar = new ejb(this.l, continuation, this.m, this.n, this.o, 0);
                ejbVar.k = obj;
                return ejbVar;
            case 1:
                ejb ejbVar2 = new ejb(this.l, continuation, this.m, this.n, this.o, 1);
                ejbVar2.k = obj;
                return ejbVar2;
            case 2:
                ejb ejbVar3 = new ejb(this.l, continuation, this.m, this.n, this.o, 2);
                ejbVar3.k = obj;
                return ejbVar3;
            case 3:
                ejb ejbVar4 = new ejb(this.l, continuation, this.m, this.n, this.o, 3);
                ejbVar4.k = obj;
                return ejbVar4;
            case 4:
                ejb ejbVar5 = new ejb(this.l, continuation, this.m, this.n, this.o, 4);
                ejbVar5.k = obj;
                return ejbVar5;
            case 5:
                ejb ejbVar6 = new ejb(this.l, continuation, this.m, this.n, this.o, 5);
                ejbVar6.k = obj;
                return ejbVar6;
            default:
                ejb ejbVar7 = new ejb(this.l, continuation, this.m, this.n, this.o, 6);
                ejbVar7.k = obj;
                return ejbVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ejb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        cjb cjbVar = this.o;
        bjb bjbVar = this.l;
        PlayerState playerState = this.n;
        a aVar = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar = z7o.b;
                    a.d(aVar, bjbVar, Event.f010_SEC_WATCHED, playerState, cjbVar);
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar3 = z7o.b;
                    a.d(aVar, bjbVar, Event.f120_SEC_WATCHED, playerState, cjbVar);
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar5 = z7o.b;
                    a.d(aVar, bjbVar, Event.f230_SEC_HEARTBEAT, playerState, cjbVar);
                } catch (Throwable unused3) {
                    r7o r7oVar6 = z7o.b;
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar7 = z7o.b;
                    a.d(aVar, bjbVar, Event.f34_SEC_WATCHED, playerState, cjbVar);
                } catch (Throwable unused4) {
                    r7o r7oVar8 = z7o.b;
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar9 = z7o.b;
                    Event event = Event.DESTROY_PLAYER;
                    EventType eventType = EventType.EVENT;
                    aVar.g.getClass();
                    eventType.getClass();
                    boolean z = aVar.l;
                    ylr ylrVar = aVar.a;
                    cjb cjbVar2 = this.o;
                    bjb bjbVar2 = this.l;
                    a aVar2 = this.m;
                    if (z) {
                        EventDefault h = a.h(aVar2, bjbVar2, event, null, playerState.getVideoType(), null, a.e(playerState), cjbVar2, 10);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        ylrVar.b(a.h(aVar2, bjbVar2, event, null, playerState.getVideoType(), null, a.e(playerState), cjbVar2, 10));
                    }
                } catch (Throwable unused5) {
                    r7o r7oVar10 = z7o.b;
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar11 = z7o.b;
                    EventType eventType2 = EventType.EVENT;
                    aVar.g.getClass();
                    eventType2.getClass();
                    boolean z2 = aVar.l;
                    ylr ylrVar2 = aVar.a;
                    cjb cjbVar3 = this.o;
                    bjb bjbVar3 = this.l;
                    a aVar3 = this.m;
                    if (z2) {
                        EventDefault g = a.g(aVar3, bjbVar3, "End", playerState.getVideoType(), null, a.e(playerState), cjbVar3, 10);
                        ylrVar2.getClass();
                        ylrVar2.c(g);
                    } else {
                        ylrVar2.b(a.g(aVar3, bjbVar3, "End", playerState.getVideoType(), null, a.e(playerState), cjbVar3, 10));
                    }
                } catch (Throwable unused6) {
                    r7o r7oVar12 = z7o.b;
                }
                break;
            default:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar13 = z7o.b;
                    EventType eventType3 = EventType.EVENT;
                    aVar.g.getClass();
                    eventType3.getClass();
                    boolean z3 = aVar.l;
                    ylr ylrVar3 = aVar.a;
                    cjb cjbVar4 = this.o;
                    bjb bjbVar4 = this.l;
                    a aVar4 = this.m;
                    if (z3) {
                        EventDefault g2 = a.g(aVar4, bjbVar4, "Loop", playerState.getVideoType(), null, a.e(playerState), cjbVar4, 10);
                        ylrVar3.getClass();
                        ylrVar3.c(g2);
                    } else {
                        ylrVar3.b(a.g(aVar4, bjbVar4, "Loop", playerState.getVideoType(), null, a.e(playerState), cjbVar4, 10));
                    }
                } catch (Throwable unused7) {
                    r7o r7oVar14 = z7o.b;
                }
                break;
        }
        return Unit.a;
    }
}
