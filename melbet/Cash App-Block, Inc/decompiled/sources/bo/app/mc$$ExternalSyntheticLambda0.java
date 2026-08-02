package bo.app;

import androidx.compose.ui.geometry.Offset;
import com.braze.Braze;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncEntityStore;
import com.squareup.cash.maps.views.MapMarkerProperties;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;
import okio.ByteString;

/* loaded from: classes3.dex */
public final /* synthetic */ class mc$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ mc$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit schedulePushDelivery$lambda$1;
        WebSocketWriter webSocketWriter;
        switch (this.$r8$classId) {
            case 0:
                return mc.a((Map.Entry) this.f$0, this.f$1);
            case 1:
                schedulePushDelivery$lambda$1 = Braze.schedulePushDelivery$lambda$1((Braze) this.f$0, this.f$1);
                return schedulePushDelivery$lambda$1;
            case 2:
                return ((BootstrappedSyncEntityStore) this.f$0).destinationStore.getAllEntities(this.f$1);
            case 3:
                MapMarkerProperties mapMarkerProperties = (MapMarkerProperties) this.f$0;
                long j = this.f$1;
                if (mapMarkerProperties != null) {
                    mapMarkerProperties.anchor$delegate.setValue(new Offset(j));
                }
                return Unit.INSTANCE;
            default:
                RealWebSocket realWebSocket = (RealWebSocket) this.f$0;
                long j2 = this.f$1;
                synchronized (realWebSocket) {
                    try {
                        if (!realWebSocket.failed && (webSocketWriter = realWebSocket.writer) != null) {
                            int i = realWebSocket.awaitingPong ? realWebSocket.sentPingCount : -1;
                            realWebSocket.sentPingCount++;
                            realWebSocket.awaitingPong = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(realWebSocket.pingIntervalMillis);
                                sb.append("ms (after ");
                                RealWebSocket.failWebSocket$default(realWebSocket, new SocketTimeoutException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i - 1, " successful ping/pongs)", sb)), null, 2);
                            } else {
                                try {
                                    ByteString byteString = ByteString.EMPTY;
                                    byteString.getClass();
                                    webSocketWriter.writeControlFrame(9, byteString);
                                } catch (IOException e) {
                                    RealWebSocket.failWebSocket$default(realWebSocket, e, null, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j2);
        }
    }
}
