package defpackage;

import com.yandex.mapkit.road_events.RoadEventsManager;

/* loaded from: classes15.dex */
public final /* synthetic */ class vov implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yov c;

    public /* synthetic */ vov(String str, yov yovVar, int i) {
        this.a = i;
        this.b = str;
        this.c = yovVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yov yovVar = this.c;
        String str = this.b;
        RoadEventsManager roadEventsManager = (RoadEventsManager) obj;
        switch (i) {
            case 0:
                roadEventsManager.voteUpEvent(str, yovVar.e);
                break;
            default:
                roadEventsManager.voteDownEvent(str, null, yovVar.e);
                break;
        }
        return zy11Var;
    }
}
