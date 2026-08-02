package ru.yandex.video.m3.telemetry;

import android.content.Context;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "mediaOkHttpClient", "Lkotlin/Function1;", "Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "StandaloneStrmTelemetry", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ltls;)Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandaloneStrmTelemetryKt {
    public static final /* synthetic */ StandaloneStrmTelemetry StandaloneStrmTelemetry(Context context, OkHttpClient okHttpClient, tls tlsVar) {
        StandaloneStrmTelemetry.Builder builder = new StandaloneStrmTelemetry.Builder(context.getApplicationContext(), okHttpClient);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ StandaloneStrmTelemetry StandaloneStrmTelemetry$default(Context context, OkHttpClient okHttpClient, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.telemetry.StandaloneStrmTelemetryKt$StandaloneStrmTelemetry$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((StandaloneStrmTelemetry.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(StandaloneStrmTelemetry.Builder builder) {
                }
            };
        }
        return StandaloneStrmTelemetry(context, okHttpClient, tlsVar);
    }
}
