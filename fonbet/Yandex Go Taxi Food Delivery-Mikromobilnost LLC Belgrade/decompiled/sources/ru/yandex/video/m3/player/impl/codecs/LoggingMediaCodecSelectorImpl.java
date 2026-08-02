package ru.yandex.video.m3.player.impl.codecs;

import defpackage.eh20;
import defpackage.fd10;
import defpackage.sb10;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.CodecInfo;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.data.MediaCodecSelectorLogKt;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelectorImpl;", "Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "<init>", "()V", "", "mimeType", "Lru/yandex/video/m3/player/tracks/TrackType;", "mimeTypeToTrackType", "(Ljava/lang/String;)Lru/yandex/video/m3/player/tracks/TrackType;", "", "requiresSecureDecoder", "requiresTunnelingDecoder", "", "Lsb10;", "getDecoderInfos", "(Ljava/lang/String;ZZ)Ljava/util/List;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "getLastSelectorLog", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "", "info", "Lzy11;", "saveCodecSelectorLog", "(Ljava/lang/String;ZZLjava/util/List;)V", "", "lastLogByTrackType", "Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class LoggingMediaCodecSelectorImpl implements LoggingMediaCodecSelector {
    public static final int $stable = 8;
    private final Map<TrackType, MediaCodecSelectorLog> lastLogByTrackType = new LinkedHashMap();

    private final TrackType mimeTypeToTrackType(String mimeType) {
        if (eh20.p(mimeType)) {
            return TrackType.Video;
        }
        if (eh20.l(mimeType)) {
            return TrackType.Audio;
        }
        if (eh20.o(mimeType)) {
            return TrackType.Subtitles;
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector, defpackage.xb10
    public List<sb10> getDecoderInfos(String mimeType, boolean requiresSecureDecoder, boolean requiresTunnelingDecoder) {
        List<sb10> e = fd10.e(mimeType, requiresSecureDecoder, requiresTunnelingDecoder);
        saveCodecSelectorLog(mimeType, requiresSecureDecoder, requiresTunnelingDecoder, e);
        return e;
    }

    @Override // ru.yandex.video.m3.player.impl.codecs.LoggingMediaCodecSelector
    public MediaCodecSelectorLog getLastSelectorLog(TrackType trackType) {
        return this.lastLogByTrackType.get(trackType);
    }

    public final void saveCodecSelectorLog(String mimeType, boolean requiresSecureDecoder, boolean requiresTunnelingDecoder, List<sb10> info) {
        Map<TrackType, MediaCodecSelectorLog> map = this.lastLogByTrackType;
        TrackType mimeTypeToTrackType = mimeTypeToTrackType(mimeType);
        List<sb10> list = info;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecInfo.INSTANCE.toCodecInfoDto((sb10) it.next()));
        }
        map.put(mimeTypeToTrackType, MediaCodecSelectorLogKt.MediaCodecSelectorLog$default(mimeType, requiresSecureDecoder, requiresTunnelingDecoder, arrayList, null, 16, null));
    }
}
