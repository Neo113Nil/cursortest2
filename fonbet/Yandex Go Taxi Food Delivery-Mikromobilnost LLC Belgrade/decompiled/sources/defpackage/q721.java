package defpackage;

import com.yandex.go.taxi.order.net.xiva.UpdatePositionWebSocketMessageMapper$UpdatePositionPayload;
import com.yandex.go.taxi.order.net.xiva.UpdatePositionWebSocketMessageMapper$UpdatePositionRoute;
import com.yandex.go.taxi_order.ws.WebSocketMessageDto;
import kotlin.Result;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes14.dex */
public final class q721 implements gk41 {
    public final wnt a;

    public q721(wnt wntVar) {
        this.a = wntVar;
    }

    public final Object a(WebSocketMessageDto webSocketMessageDto) {
        b bVar;
        Object failure;
        UpdatePositionWebSocketMessageMapper$UpdatePositionPayload updatePositionWebSocketMessageMapper$UpdatePositionPayload;
        String str;
        UpdatePositionWebSocketMessageMapper$UpdatePositionRoute updatePositionWebSocketMessageMapper$UpdatePositionRoute;
        c cVar = webSocketMessageDto.i;
        if (cVar != null) {
            b bVar2 = (b) cVar.get(DatabaseHelper.OttTrackingTable.COLUMN_EVENT);
            if (jl40.l(bVar2 != null ? qcx.n(bVar2).a() : null, "update_position") && (bVar = (b) cVar.get("payload")) != null) {
                try {
                    updatePositionWebSocketMessageMapper$UpdatePositionPayload = (UpdatePositionWebSocketMessageMapper$UpdatePositionPayload) ((xnt) this.a).d(bVar, UpdatePositionWebSocketMessageMapper$UpdatePositionPayload.Companion.serializer());
                    str = updatePositionWebSocketMessageMapper$UpdatePositionPayload.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (str != null && (updatePositionWebSocketMessageMapper$UpdatePositionRoute = updatePositionWebSocketMessageMapper$UpdatePositionPayload.b) != null) {
                    failure = new p721(str, updatePositionWebSocketMessageMapper$UpdatePositionRoute.a, updatePositionWebSocketMessageMapper$UpdatePositionRoute.b);
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        hst hstVar = jst.e;
                        ke00 a2 = hstVar.b.a();
                        if (a2 != null && a2.b(15)) {
                            a2.a(15, "UpdatePositionMapper", a, "handleFrameMessage failed", hstVar.a);
                        }
                    }
                    if (failure instanceof Result.Failure) {
                        return null;
                    }
                    return failure;
                }
            }
        }
        return null;
    }
}
