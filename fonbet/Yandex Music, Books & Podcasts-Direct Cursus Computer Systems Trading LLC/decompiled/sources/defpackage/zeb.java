package defpackage;

import io.appmetrica.analytics.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public final class zeb {
    public static final HashMap b = new HashMap();
    public final int a;

    public zeb(String str) {
        HashMap hashMap = b;
        hashMap.put(100, "ERROR_UNKNOWN");
        hashMap.put(101, "PLAYER_ERROR_GENEREIC");
        hashMap.put(102, "PLAYER_ERROR_CONNECTION_FAILED");
        hashMap.put(103, "PLAYER_ERROR_AUDIO_CODEC_NOT_SUPPORTED");
        hashMap.put(104, "PLAYER_ERROR_NOT_SUPPORTED_FILE");
        hashMap.put(105, "PLAYER_ERROR_VIDEO_CODEC_NOT_SUPPORTED");
        hashMap.put(106, "PLAYER_ERROR_PLAYER_NOT_LOADED");
        hashMap.put(107, "PLAYER_ERROR_INVALID_OPERATION");
        hashMap.put(108, "PLAYER_ERROR_INVALID_PARAMETER");
        hashMap.put(109, "PLAYER_ERROR_NO_SUCH_FILE");
        hashMap.put(110, "PLAYER_ERROR_SEEK_FAILED");
        hashMap.put(111, "PLAYER_ERROR_REWIND");
        hashMap.put(112, "PLAYER_ERROR_FORWARD");
        hashMap.put(113, "PLAYER_ERROR_RESTORE");
        hashMap.put(114, "PLAYER_ERROR_RESOURCE_LIMIT");
        hashMap.put(115, "PLAYER_ERROR_INVALID_STATE");
        hashMap.put(Integer.valueOf(BuildConfig.API_LEVEL), "PLAYER_ERROR_NO_AUTH");
        hashMap.put(117, "PLAYER_ERROR_LAST_CONTENT");
        hashMap.put(118, "PLAYER_ERROR_CURRENT_CONTENT");
        hashMap.put(Integer.valueOf(NetworkRequestException.EXPIRED_SIGNATURE), "PLAYER_ERROR_INVALID_URI");
        hashMap.put(500, "PLAYER_ERROR_INTERNAL_SERVER");
        hashMap.put(300, "PLAYER_ERROR_INVALID_TV_RESPONSE");
        hashMap.put(310, "ERROR_CONNECT_FAILED");
        hashMap.put(311, "ERROR_ALREADY_CONNECTED");
        hashMap.put(312, "ERROR_HOST_UNREACHABLE");
        hashMap.put(313, "ERROR_WEBSOCKET_DISCONNECTED");
        if (str.isEmpty()) {
            this.a = 100;
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (str.equals(entry.getValue())) {
                this.a = ((Integer) entry.getKey()).intValue();
            }
        }
    }

    public final String a() {
        return (String) b.get(Integer.valueOf(this.a));
    }
}
