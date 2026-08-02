package defpackage;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.FeedbackSession;
import com.yandex.mapkit.road_events.RoadEventSession;
import com.yandex.mapkit.road_events.RoadEventsManager;
import java.util.Locale;
import java.util.Map;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class vsk0 extends k45 {
    public final qsk0 b;
    public RoadEventSession c;
    public EventInfoSession w;
    public FeedbackSession x;

    public vsk0(ssr ssrVar, qsk0 qsk0Var) {
        super(ssrVar, "road_events_manager");
        this.b = qsk0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            qsk0 qsk0Var = this.b;
            switch (hashCode) {
                case -1656723796:
                    if (str.equals("voteDown")) {
                        Map map = (Map) obj;
                        String str2 = (String) map.get("eventId");
                        String str3 = (String) map.get(CRLReasonCodeExtension.REASON);
                        RoadEventsManager roadEventsManager = (RoadEventsManager) qsk0Var.a;
                        FeedbackSession feedbackSession = this.x;
                        if (feedbackSession != null) {
                            feedbackSession.cancel();
                        }
                        this.x = roadEventsManager.voteDownEvent(str2, str3, new tsk0((ba20) da20Var));
                        return;
                    }
                    break;
                case -1313600359:
                    if (str.equals("requestEventInfo")) {
                        String str4 = (String) obj;
                        RoadEventsManager roadEventsManager2 = (RoadEventsManager) qsk0Var.a;
                        EventInfoSession eventInfoSession = this.w;
                        if (eventInfoSession != null) {
                            eventInfoSession.cancel();
                        }
                        this.w = roadEventsManager2.requestEventInfo(str4, new ssk0((ba20) da20Var));
                        return;
                    }
                    break;
                case -1259780487:
                    if (str.equals("addEvent")) {
                        Map map2 = (Map) obj;
                        EventTag valueOf = EventTag.valueOf(((String) map2.get("eventTag")).toUpperCase(Locale.ROOT));
                        String str5 = (String) map2.get("descriptionText");
                        Map map3 = (Map) map2.get("eventLocation");
                        Object obj2 = map3.get("lat");
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        Object obj3 = map3.get("lon");
                        Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
                        if (d == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        if (d2 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Point point = new Point(d.doubleValue(), d2.doubleValue());
                        RoadEventsManager roadEventsManager3 = (RoadEventsManager) qsk0Var.a;
                        RoadEventSession roadEventSession = this.c;
                        if (roadEventSession != null) {
                            roadEventSession.cancel();
                        }
                        this.c = roadEventsManager3.addEvent(valueOf, str5, point, null, new rsk0((ba20) da20Var));
                        return;
                    }
                    break;
                case -810661083:
                    if (str.equals("voteUp")) {
                        String str6 = (String) obj;
                        RoadEventsManager roadEventsManager4 = (RoadEventsManager) qsk0Var.a;
                        FeedbackSession feedbackSession2 = this.x;
                        if (feedbackSession2 != null) {
                            feedbackSession2.cancel();
                        }
                        this.x = roadEventsManager4.voteUpEvent(str6, new usk0((ba20) da20Var));
                        return;
                    }
                    break;
                case -255177933:
                    if (str.equals("cancelRequestEventInfo")) {
                        EventInfoSession eventInfoSession2 = this.w;
                        if (eventInfoSession2 != null) {
                            eventInfoSession2.cancel();
                        }
                        this.w = null;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
                        qsk0Var.a = MapKitFactory.getInstance().createRoadEventsManager();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1103937299:
                    if (str.equals("cancelAddEvent")) {
                        RoadEventSession roadEventSession2 = this.c;
                        if (roadEventSession2 != null) {
                            roadEventSession2.cancel();
                        }
                        this.c = null;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1888692356:
                    if (str.equals("cancelVote")) {
                        FeedbackSession feedbackSession3 = this.x;
                        if (feedbackSession3 != null) {
                            feedbackSession3.cancel();
                        }
                        this.x = null;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
