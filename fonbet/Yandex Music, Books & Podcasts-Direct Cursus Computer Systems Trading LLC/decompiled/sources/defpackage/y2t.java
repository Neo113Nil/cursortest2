package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.player.impl.tracking.a;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.Event;

/* loaded from: classes6.dex */
public final class y2t extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ z2t s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2t(z2t z2tVar, int i) {
        super(0);
        this.r = i;
        this.s = z2tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                break;
            case 1:
                z2t z2tVar = this.s;
                PlayerState a = z2tVar.b.a();
                chs chsVar = z2tVar.x;
                chsVar.getClass();
                chsVar.a("TrackingObserver", "scheduleWatchEvents", "on4secWatched watched=" + a.getWatchedTime(), new Object[0]);
                a aVar = z2tVar.a;
                aVar.getClass();
                chs chsVar2 = aVar.p;
                chsVar2.getClass();
                chsVar2.a("[EventTrackerImpl]", "on4SecWatched", null, new Object[0]);
                cjb i = aVar.i();
                bjb j = aVar.j();
                if (aVar.l) {
                    x97.y(aVar.k, null, null, new ejb(j, null, aVar, a, i, 3), 3);
                } else {
                    a.d(aVar, j, Event.f34_SEC_WATCHED, a, i);
                }
                break;
            case 2:
                z2t z2tVar2 = this.s;
                PlayerState a2 = z2tVar2.b.a();
                chs chsVar3 = z2tVar2.x;
                chsVar3.getClass();
                chsVar3.a("TrackingObserver", "scheduleWatchEvents", "on10SecWatched watched=" + a2.getWatchedTime(), new Object[0]);
                a aVar2 = z2tVar2.a;
                aVar2.getClass();
                chs chsVar4 = aVar2.p;
                chsVar4.getClass();
                chsVar4.a("[EventTrackerImpl]", "on10SecWatched", null, new Object[0]);
                cjb i2 = aVar2.i();
                bjb j2 = aVar2.j();
                if (aVar2.l) {
                    x97.y(aVar2.k, null, null, new ejb(j2, null, aVar2, a2, i2, 0), 3);
                } else {
                    a.d(aVar2, j2, Event.f010_SEC_WATCHED, a2, i2);
                }
                break;
            default:
                z2t z2tVar3 = this.s;
                PlayerState a3 = z2tVar3.b.a();
                chs chsVar5 = z2tVar3.x;
                chsVar5.getClass();
                chsVar5.a("TrackingObserver", "scheduleWatchEvents", "on20SecWatched watched=" + a3.getWatchedTime(), new Object[0]);
                a aVar3 = z2tVar3.a;
                aVar3.getClass();
                chs chsVar6 = aVar3.p;
                chsVar6.getClass();
                chsVar6.a("[EventTrackerImpl]", "on20SecWatched", null, new Object[0]);
                cjb i3 = aVar3.i();
                bjb j3 = aVar3.j();
                if (aVar3.l) {
                    x97.y(aVar3.k, null, null, new ejb(j3, null, aVar3, a3, i3, 1), 3);
                } else {
                    a.d(aVar3, j3, Event.f120_SEC_WATCHED, a3, i3);
                }
                break;
        }
        return Unit.a;
    }
}
