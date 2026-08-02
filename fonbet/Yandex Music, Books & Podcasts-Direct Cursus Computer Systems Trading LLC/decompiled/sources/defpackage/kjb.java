package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;
import ru.yandex.video.m3.player.impl.tracking.event.VideoConfigData;

/* loaded from: classes6.dex */
public final class kjb extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bjb l;
    public final /* synthetic */ a m;
    public final /* synthetic */ cjb n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjb(bjb bjbVar, Continuation continuation, a aVar, cjb cjbVar, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bjbVar;
        this.m = aVar;
        this.n = cjbVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                kjb kjbVar = new kjb(this.l, continuation, this.m, this.n, 0);
                kjbVar.k = obj;
                return kjbVar;
            default:
                kjb kjbVar2 = new kjb(this.l, continuation, this.m, this.n, 1);
                kjbVar2.k = obj;
                return kjbVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((kjb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        a aVar = this.m;
        kfg kfgVar = null;
        VideoConfigData videoConfigData = null;
        VideoConfigData videoConfigData2 = null;
        kfg kfgVar2 = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                bjb bjbVar = this.l;
                n0l n0lVar = bjbVar.a;
                try {
                    r7o r7oVar = z7o.b;
                    Event event = Event.LOAD_SOURCE;
                    EventType eventType = EventType.EVENT;
                    bs4 bs4Var = aVar.g;
                    l4f l4fVar = aVar.h;
                    bs4Var.getClass();
                    eventType.getClass();
                    boolean z = aVar.l;
                    ylr ylrVar = aVar.a;
                    cjb cjbVar = this.n;
                    a aVar2 = this.m;
                    if (z) {
                        if (n0lVar != null) {
                            fs7 fs7Var = aVar2.i;
                            VideoData i2 = n0lVar.i();
                            fs7Var.getClass();
                            kfgVar2 = new kfg(n0lVar, new LinkedHashMap(fs7.B(i2)), l4fVar.to(new VideoConfigData(n0lVar).getConfig()));
                        }
                        EventDefault h = a.h(aVar2, bjbVar, event, null, null, null, men.E(kfgVar2), cjbVar, 14);
                        ylrVar.getClass();
                        ylrVar.c(h);
                    } else {
                        if (n0lVar != null) {
                            fs7 fs7Var2 = aVar2.i;
                            VideoData i3 = n0lVar.i();
                            fs7Var2.getClass();
                            kfgVar = new kfg(n0lVar, new LinkedHashMap(fs7.B(i3)), l4fVar.to(new VideoConfigData(n0lVar).getConfig()));
                        }
                        ylrVar.b(a.h(aVar2, bjbVar, event, null, null, null, men.E(kfgVar), cjbVar, 14));
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                bjb bjbVar2 = this.l;
                n0l n0lVar2 = bjbVar2.a;
                try {
                    r7o r7oVar3 = z7o.b;
                    Event event2 = Event.SET_SOURCE;
                    EventType eventType2 = EventType.EVENT;
                    bs4 bs4Var2 = aVar.g;
                    l4f l4fVar2 = aVar.h;
                    bs4Var2.getClass();
                    eventType2.getClass();
                    boolean z2 = aVar.l;
                    ylr ylrVar2 = aVar.a;
                    cjb cjbVar2 = this.n;
                    a aVar3 = this.m;
                    if (z2) {
                        if (n0lVar2 != null) {
                            videoConfigData = new VideoConfigData(n0lVar2);
                            videoConfigData.setDetails(l4fVar2.to(videoConfigData.getConfig()));
                        }
                        EventDefault h2 = a.h(aVar3, bjbVar2, event2, null, null, null, men.E(videoConfigData), cjbVar2, 14);
                        ylrVar2.getClass();
                        ylrVar2.c(h2);
                    } else {
                        if (n0lVar2 != null) {
                            videoConfigData2 = new VideoConfigData(n0lVar2);
                            videoConfigData2.setDetails(l4fVar2.to(videoConfigData2.getConfig()));
                        }
                        ylrVar2.b(a.h(aVar3, bjbVar2, event2, null, null, null, men.E(videoConfigData2), cjbVar2, 14));
                    }
                } catch (Throwable unused2) {
                    r7o r7oVar4 = z7o.b;
                }
                break;
        }
        return Unit.a;
    }
}
