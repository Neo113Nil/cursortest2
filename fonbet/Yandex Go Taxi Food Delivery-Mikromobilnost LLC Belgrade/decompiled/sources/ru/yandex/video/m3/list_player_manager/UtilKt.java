package ru.yandex.video.m3.list_player_manager;

import android.os.Looper;
import android.view.View;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.tls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.Stream;
import ru.yandex.video.m3.list_player_manager.model.StreamType;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u001a\u001a\u00020\n*\u00020\u00172\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u0018H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"", "failFast", "", "throwable", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "tag", "method", Constants.KEY_MESSAGE, "Lzy11;", "throwError", "(ZLjava/lang/Throwable;Lru/yandex/video/m3/player/utils/PlayerLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/yandex/video/m3/list_player_manager/model/MediaData;", "mediaData", "streamFromMediaData", "(Lru/yandex/video/m3/list_player_manager/model/MediaData;)Ljava/lang/String;", "verifyMainThread", "(ZLru/yandex/video/m3/player/utils/PlayerLogger;)V", "Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;", "player", "debugStringIdentificator", "(Lru/yandex/video/m3/list_player_manager/InternalListYandexPlayer;)Ljava/lang/String;", "Landroid/view/View;", "Lkotlin/Function1;", "action", "doOnEveryLayout", "(Landroid/view/View;Ltls;)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UtilKt {
    public static final String debugStringIdentificator(InternalListYandexPlayer internalListYandexPlayer) {
        if (internalListYandexPlayer == null) {
            return "unknownLP";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) internalListYandexPlayer.getListSdkVsid().subSequence(0, 3));
        sb.append('[');
        sb.append(internalListYandexPlayer.getListPlayerIndex());
        sb.append(']');
        return sb.toString();
    }

    public static final void doOnEveryLayout(View view, final tls tlsVar) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.video.m3.list_player_manager.UtilKt$doOnEveryLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                tls.this.invoke(view2);
            }
        });
    }

    public static final String streamFromMediaData(MediaData mediaData) {
        Object obj;
        Object obj2;
        Iterator<T> it = mediaData.getStreams().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Stream) obj).getStreamType() == StreamType.DASH) {
                break;
            }
        }
        Stream stream = (Stream) obj;
        if (stream == null) {
            Iterator<T> it2 = mediaData.getStreams().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (evu0.y(((Stream) obj2).getStream(), ".mpd", false)) {
                    break;
                }
            }
            stream = (Stream) obj2;
            if (stream == null) {
                stream = (Stream) a.R(mediaData.getStreams());
            }
        }
        if (stream != null) {
            return stream.getStream();
        }
        return null;
    }

    public static final void throwError(boolean z, Throwable th, PlayerLogger playerLogger, String str, String str2, String str3) {
        if (z) {
            throw th;
        }
        PlayerLogger.error$default(playerLogger, str, str2, str3, null, new Object[0], 8, null);
    }

    public static /* synthetic */ void throwError$default(boolean z, Throwable th, PlayerLogger playerLogger, String str, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        throwError(z, th, playerLogger, str, str2, str3);
    }

    public static final void verifyMainThread(boolean z, PlayerLogger playerLogger) {
        if (jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("You have to call ListPlayerManager api from main thread. But it is " + Thread.currentThread().getName());
        PlayerLogger.error$default(playerLogger, "THREAD_PROBLEMS", null, null, runtimeException, new Object[0], 6, null);
        if (z) {
            throw runtimeException;
        }
    }
}
