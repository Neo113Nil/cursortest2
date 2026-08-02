package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.scc;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.player.DecoderCounter;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData;
import ru.yandex.video.m3.player.tracks.TrackFormat;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e\u001aM\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "name", "", "inits", "releases", "Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "formatData", "lastFormatData", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "DecoderEventData", "(Ljava/lang/String;IILru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;Ltls;)Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/DecoderCounter;", "decoderCounter", "Lru/yandex/video/m3/player/tracks/TrackFormat;", "trackFormat", "lastTrackFormat", "(Ljava/lang/String;Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/DecoderCounter;Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackFormat;Ltls;)Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "toTrackFormatData", "(Lru/yandex/video/m3/player/tracks/TrackFormat;Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/player/impl/tracking/data/TrackFormatData;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderEventDataKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrackType.values().length];
            try {
                iArr[TrackType.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ DecoderEventData DecoderEventData(String str, int i, int i2, TrackFormatData trackFormatData, TrackFormatData trackFormatData2, tls tlsVar) {
        DecoderEventData.Builder builder = new DecoderEventData.Builder(str, i, i2, trackFormatData, trackFormatData2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DecoderEventData DecoderEventData$default(String str, int i, int i2, TrackFormatData trackFormatData, TrackFormatData trackFormatData2, tls tlsVar, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt$DecoderEventData$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DecoderEventData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DecoderEventData.Builder builder) {
                }
            };
        }
        return DecoderEventData(str, i, i2, trackFormatData, trackFormatData2, tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackFormatData toTrackFormatData(final TrackFormat trackFormat, final TrackType trackType) {
        String str;
        if (WhenMappings.$EnumSwitchMapping$0[trackType.ordinal()] == 1) {
            str = trackFormat.getCodecs() + HexString.CHAR_SPACE + trackFormat.getWidth() + 'x' + trackFormat.getHeight() + HexString.CHAR_SPACE + trackFormat.getId();
        } else {
            str = trackFormat.getCodecs() + " lang=" + trackFormat.getLanguage() + HexString.CHAR_SPACE + trackFormat.getId();
        }
        return TrackFormatDataKt.TrackFormatData(str, new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt$toTrackFormatData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(TrackFormatData.Builder builder) {
                List<Integer> g = scc.g(Integer.valueOf(TrackFormat.this.getWidth()), Integer.valueOf(TrackFormat.this.getHeight()));
                TrackType trackType2 = trackType;
                TrackType trackType3 = TrackType.Video;
                String str2 = null;
                if (trackType2 != trackType3) {
                    g = null;
                }
                builder.setResolution(g);
                Boolean valueOf = Boolean.valueOf(TrackFormat.this.getHeight() > TrackFormat.this.getWidth());
                if (trackType != trackType3) {
                    valueOf = null;
                }
                builder.setVertical(valueOf);
                String language = TrackFormat.this.getLanguage();
                if (language != null && trackType == TrackType.Audio) {
                    str2 = language;
                }
                builder.setLanguage(str2);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TrackFormatData.Builder) obj);
                return zy11.a;
            }
        });
    }

    public static /* synthetic */ DecoderEventData DecoderEventData$default(String str, TrackType trackType, DecoderCounter decoderCounter, TrackFormat trackFormat, TrackFormat trackFormat2, tls tlsVar, int i, Object obj) {
        if ((i & 32) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt$DecoderEventData$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DecoderEventData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DecoderEventData.Builder builder) {
                }
            };
        }
        return DecoderEventData(str, trackType, decoderCounter, trackFormat, trackFormat2, tlsVar);
    }

    public static final /* synthetic */ DecoderEventData DecoderEventData(String str, TrackType trackType, DecoderCounter decoderCounter, TrackFormat trackFormat, TrackFormat trackFormat2, tls tlsVar) {
        DecoderEventData.Builder builder = new DecoderEventData.Builder(str, trackType, decoderCounter, trackFormat, trackFormat2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
