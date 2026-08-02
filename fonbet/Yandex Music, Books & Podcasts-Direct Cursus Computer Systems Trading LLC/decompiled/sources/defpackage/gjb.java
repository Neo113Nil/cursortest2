package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

/* loaded from: classes6.dex */
public final class gjb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bjb l;
    public final /* synthetic */ a m;
    public final /* synthetic */ d1 n;
    public final /* synthetic */ u1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gjb(bjb bjbVar, Continuation continuation, a aVar, d1 d1Var, u1 u1Var, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.n = d1Var;
        this.o = u1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                gjb gjbVar = new gjb(this.l, continuation, this.m, this.n, this.o, 0);
                gjbVar.k = obj;
                return gjbVar;
            default:
                gjb gjbVar2 = new gjb(this.l, continuation, this.m, this.n, this.o, 1);
                gjbVar2.k = obj;
                return gjbVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((gjb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        d1 d1Var = this.n;
        switch (i) {
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
                    u1 u1Var = this.o;
                    bjb bjbVar = this.l;
                    if (z) {
                        EventDefault g = a.g(aVar, bjbVar, quj.P(d1Var.d), null, null, u1Var, aVar.i(), 10);
                        ylrVar.getClass();
                        ylrVar.c(g);
                    } else {
                        ylrVar.b(a.g(aVar, bjbVar, quj.P(d1Var.d), null, null, u1Var, aVar.i(), 10));
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            default:
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
                    u1 u1Var2 = this.o;
                    bjb bjbVar2 = this.l;
                    if (z2) {
                        EventDefault g2 = a.g(aVar2, bjbVar2, quj.P(d1Var.e), null, null, u1Var2, aVar2.i(), 10);
                        ylrVar2.getClass();
                        ylrVar2.c(g2);
                    } else {
                        ylrVar2.b(a.g(aVar2, bjbVar2, quj.P(d1Var.e), null, null, u1Var2, aVar2.i(), 10));
                    }
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                break;
        }
        return Unit.a;
    }
}
