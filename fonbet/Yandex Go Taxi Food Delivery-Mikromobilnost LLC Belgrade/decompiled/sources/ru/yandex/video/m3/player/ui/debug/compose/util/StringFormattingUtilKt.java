package ru.yandex.video.m3.player.ui.debug.compose.util;

import defpackage.bts;
import defpackage.fid;
import defpackage.ohb1;
import kotlin.Metadata;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.compose.Flags;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.ContentData;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.player.ui.debug.util.ExtensionsUtilsKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\n\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010 \u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(H\u0001¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/\u001a#\u00102\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u00002\b\u00101\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b2\u00103\u001a\u0019\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b5\u0010\u0003\u001a#\u0010:\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0001¢\u0006\u0004\b:\u0010;\u001a\u000f\u0010<\u001a\u00020\u0000H\u0003¢\u0006\u0004\b<\u0010=\u001a\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010B\u001a\u0004\u0018\u00010A*\u0004\u0018\u000108H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0015\u0010D\u001a\u00020\u0000*\u0004\u0018\u00010>H\u0003¢\u0006\u0004\bD\u0010E¨\u0006F"}, d2 = {"", "vsid", "getTextForVsid", "(Ljava/lang/String;Lfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "contentData", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "drmMode", "", "isCompact", "getTextForContent", "(Lru/yandex/video/m3/player/ui/debug/model/ContentData;Lru/yandex/video/m3/player/ui/debug/model/DrmMode;ZLfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "videoTrackData", "getTextForVideoTrack", "(Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;ZLfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "audioTrackData", "getTextForAudioTrack", "(Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;ZLfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "subtitleTrackData", "getTextForSubtitlesTrack", "(Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;ZLfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "viewPortSize", "getTextForViewportSize", "(Lru/yandex/video/m3/player/ui/debug/model/Size;Lfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "decoderData", "", "droppedFrames", "getTextForVideoCodec", "(Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Ljava/lang/Integer;ZLfid;I)Ljava/lang/String;", "getTextForAudioCodec", "(Lru/yandex/video/m3/player/ui/debug/model/DecoderData;ZLfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "bandwidthEstimation", "getTextForBandwidthEstimation", "(Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;Lfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bytesLoaded", "getTextForBytesLoaded", "(Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;Lfid;I)Ljava/lang/String;", "Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "latencyData", "getTextForLatency", "(Lru/yandex/video/m3/player/ui/debug/model/LatencyData;Lfid;I)Ljava/lang/String;", "networkTypeName", "dateTime", "getTextForExtraInfo", "(Ljava/lang/String;Ljava/lang/String;Lfid;I)Ljava/lang/String;", "lastError", "getTextForLastError", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "currentBufferSize", "", "targetBufferSize", "getTextForBuffersSize", "(Lru/yandex/video/m3/player/ui/debug/model/BufferSize;Ljava/lang/Long;Lfid;I)Ljava/lang/String;", "placeholder", "(Lfid;I)Ljava/lang/String;", "", "placeholderNumeric", "()Ljava/lang/Number;", "", "millisecondsToSeconds", "(Ljava/lang/Long;)Ljava/lang/Float;", "bitsToString", "(Ljava/lang/Number;Lfid;I)Ljava/lang/String;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringFormattingUtilKt {
    private static final String bitsToString(Number number, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(11454921);
        String perSeconds = number != null ? ExtensionsUtilsKt.perSeconds(ExtensionsUtilsKt.bitsToHumanReadable(number.longValue())) : null;
        if (perSeconds == null) {
            perSeconds = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return perSeconds;
    }

    public static final String getTextForAudioCodec(DecoderData decoderData, boolean z, fid fidVar, int i) {
        String d;
        bts btsVar = (bts) fidVar;
        btsVar.f0(1613072256);
        btsVar.f0(-155948684);
        if (decoderData == null) {
            d = null;
        } else {
            String name = decoderData.getName();
            btsVar.f0(-155948372);
            if (name == null) {
                name = placeholder(btsVar, 0);
            }
            btsVar.t(false);
            btsVar.f0(-155946613);
            if (z) {
                d = name;
            } else {
                Object inits = decoderData.getInits();
                if (inits == null) {
                    inits = placeholderNumeric();
                }
                Object reuses = decoderData.getReuses();
                if (reuses == null) {
                    reuses = placeholderNumeric();
                }
                Object releases = decoderData.getReleases();
                if (releases == null) {
                    releases = placeholderNumeric();
                }
                Object hardwareAccelerated = decoderData.getHardwareAccelerated();
                btsVar.f0(-444207878);
                if (hardwareAccelerated == null) {
                    hardwareAccelerated = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                d = ohb1.d(R.string.audio_decoder_template, new Object[]{name, inits, reuses, releases, hardwareAccelerated}, btsVar);
            }
            btsVar.t(false);
        }
        btsVar.t(false);
        if (d == null) {
            d = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return d;
    }

    public static final String getTextForAudioTrack(AudioTrackData audioTrackData, boolean z, fid fidVar, int i) {
        String d;
        bts btsVar = (bts) fidVar;
        btsVar.f0(1857187492);
        btsVar.f0(2129696936);
        if (audioTrackData == null) {
            d = null;
        } else {
            String title = audioTrackData.getTitle();
            btsVar.f0(2129697445);
            if (title == null) {
                title = placeholder(btsVar, 0);
            }
            btsVar.t(false);
            btsVar.f0(2129699162);
            if (z) {
                d = title;
            } else {
                String bitsToString = bitsToString(audioTrackData.getBitrate(), btsVar, 0);
                String language = audioTrackData.getLanguage();
                btsVar.f0(-180042681);
                if (language == null) {
                    language = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                d = ohb1.d(R.string.audio_track_template, new Object[]{title, bitsToString, language}, btsVar);
            }
            btsVar.t(false);
        }
        btsVar.t(false);
        if (d == null) {
            d = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return d;
    }

    public static final String getTextForBandwidthEstimation(BandwidthEstimation bandwidthEstimation, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(218942534);
        String bitsToString = bitsToString(bandwidthEstimation != null ? Long.valueOf(bandwidthEstimation.getValue()) : null, btsVar, 0);
        btsVar.t(false);
        return bitsToString;
    }

    public static final String getTextForBuffersSize(BufferSize bufferSize, Long l, fid fidVar, int i) {
        Number placeholderNumeric;
        Number placeholderNumeric2;
        bts btsVar = (bts) fidVar;
        btsVar.f0(-2045450263);
        if (bufferSize == null || (placeholderNumeric = millisecondsToSeconds(Long.valueOf(bufferSize.getValue()))) == null) {
            placeholderNumeric = placeholderNumeric();
        }
        if (l == null || (placeholderNumeric2 = millisecondsToSeconds(l)) == null) {
            placeholderNumeric2 = placeholderNumeric();
        }
        String d = ohb1.d(R.string.buffer_size_template, new Object[]{Float.valueOf(placeholderNumeric.floatValue()), Float.valueOf(placeholderNumeric2.floatValue())}, btsVar);
        btsVar.t(false);
        return d;
    }

    public static final String getTextForBytesLoaded(BytesLoaded bytesLoaded, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1893563310);
        String bitsToString = bitsToString(bytesLoaded != null ? Long.valueOf(bytesLoaded.getTotal()) : null, btsVar, 0);
        btsVar.t(false);
        return bitsToString;
    }

    public static final String getTextForContent(ContentData contentData, DrmMode drmMode, boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(812058684);
        btsVar.f0(-592165939);
        if (contentData != null) {
            String contentId = contentData.getContentId();
            btsVar.f0(-592165388);
            if (contentId == null) {
                contentId = placeholder(btsVar, 0);
            }
            btsVar.t(false);
            btsVar.f0(-592163558);
            if (z) {
                r7 = contentId;
            } else {
                String name = drmMode != null ? drmMode.name() : null;
                btsVar.f0(276583051);
                if (name == null) {
                    name = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                CurrentVideoType videoType = contentData.getVideoType();
                String name2 = videoType != null ? videoType.name() : null;
                btsVar.f0(276584953);
                if (name2 == null) {
                    name2 = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                CurrentStreamType streamType = contentData.getStreamType();
                r7 = streamType != null ? streamType.name() : null;
                btsVar.f0(276587322);
                if (r7 == null) {
                    r7 = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                r7 = ohb1.d(R.string.content_template, new Object[]{contentId, name, name2, r7}, btsVar);
            }
            btsVar.t(false);
        }
        btsVar.t(false);
        if (r7 == null) {
            r7 = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return r7;
    }

    public static final String getTextForExtraInfo(String str, String str2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(479630744);
        btsVar.f0(-711665997);
        if (str == null) {
            str = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        btsVar.f0(-711664468);
        if (str2 == null) {
            str2 = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        String d = ohb1.d(R.string.extra_info_template, new Object[]{str, str2}, btsVar);
        btsVar.t(false);
        return d;
    }

    public static final String getTextForLastError(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-770330235);
        if (str == null) {
            str = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return str;
    }

    public static final String getTextForLatency(LatencyData latencyData, fid fidVar, int i) {
        String e;
        bts btsVar = (bts) fidVar;
        btsVar.f0(-465033004);
        Number currentLatency = latencyData.getCurrentLatency();
        if (currentLatency == null) {
            currentLatency = placeholderNumeric();
        }
        Number targetLatency = latencyData.getTargetLatency();
        if (targetLatency == null) {
            targetLatency = placeholderNumeric();
        }
        if (currentLatency.longValue() < 0 || targetLatency.longValue() < 0) {
            btsVar.f0(-1719580823);
            e = ohb1.e(btsVar, R.string.latency_not_in_live_text);
            btsVar.t(false);
        } else {
            btsVar.f0(-1719686006);
            e = ohb1.d(R.string.latency_in_live_template, new Object[]{currentLatency, targetLatency}, btsVar);
            btsVar.t(false);
        }
        btsVar.t(false);
        return e;
    }

    public static final String getTextForSubtitlesTrack(SubtitlesTrackData subtitlesTrackData, boolean z, fid fidVar, int i) {
        String d;
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1770215484);
        btsVar.f0(-708832655);
        if (subtitlesTrackData == null) {
            d = null;
        } else {
            String title = subtitlesTrackData.getTitle();
            btsVar.f0(-708832157);
            if (title == null) {
                title = placeholder(btsVar, 0);
            }
            btsVar.t(false);
            btsVar.f0(-708830336);
            if (z) {
                d = title;
            } else {
                Object bitrate = subtitlesTrackData.getBitrate();
                btsVar.f0(2089616836);
                if (bitrate == null) {
                    bitrate = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                String language = subtitlesTrackData.getLanguage();
                btsVar.f0(2089619077);
                if (language == null) {
                    language = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                d = ohb1.d(R.string.subtitle_track_template, new Object[]{title, bitrate, language}, btsVar);
            }
            btsVar.t(false);
        }
        btsVar.t(false);
        if (d == null) {
            d = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return d;
    }

    public static final String getTextForVideoCodec(DecoderData decoderData, Integer num, boolean z, fid fidVar, int i) {
        String d;
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1027636450);
        btsVar.f0(1283211371);
        if (decoderData == null) {
            d = null;
        } else {
            String name = decoderData.getName();
            btsVar.f0(1283211079);
            if (name == null) {
                name = placeholder(btsVar, 0);
            }
            String str = name;
            btsVar.t(false);
            btsVar.f0(1283213442);
            if (z) {
                d = str;
            } else {
                Object inits = decoderData.getInits();
                if (inits == null) {
                    inits = placeholderNumeric();
                }
                Object obj = inits;
                Object reuses = decoderData.getReuses();
                if (reuses == null) {
                    reuses = placeholderNumeric();
                }
                Object obj2 = reuses;
                Object releases = decoderData.getReleases();
                if (releases == null) {
                    releases = placeholderNumeric();
                }
                Object obj3 = releases;
                Object hardwareAccelerated = decoderData.getHardwareAccelerated();
                btsVar.f0(-454098667);
                if (hardwareAccelerated == null) {
                    hardwareAccelerated = placeholder(btsVar, 0);
                }
                Object obj4 = hardwareAccelerated;
                btsVar.t(false);
                Object obj5 = num;
                if (num == null) {
                    obj5 = placeholderNumeric();
                }
                Object obj6 = obj5;
                if (Flags.INSTANCE.getPlayerDebugViewFlags(btsVar, 6).getShowVideoDecoderInitsReusesReleases()) {
                    btsVar.f0(-1191946483);
                    d = ohb1.d(R.string.video_decoder_template, new Object[]{str, obj, obj2, obj3, obj4, obj6}, btsVar);
                    btsVar.t(false);
                } else {
                    btsVar.f0(-1191640823);
                    d = ohb1.d(R.string.video_decoder_template_no_inits_reuses_releases, new Object[]{str, obj4, obj6}, btsVar);
                    btsVar.t(false);
                }
            }
            btsVar.t(false);
        }
        btsVar.t(false);
        if (d == null) {
            d = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return d;
    }

    public static final String getTextForVideoTrack(VideoTrackData videoTrackData, boolean z, fid fidVar, int i) {
        String d;
        bts btsVar = (bts) fidVar;
        btsVar.f0(1063523268);
        btsVar.f0(-726086903);
        if (videoTrackData == null) {
            d = null;
        } else {
            String title = videoTrackData.getTitle();
            btsVar.f0(-726086400);
            if (title == null) {
                title = placeholder(btsVar, 0);
            }
            btsVar.t(false);
            btsVar.f0(-726084677);
            if (z) {
                d = title;
            } else {
                String bitsToString = bitsToString(videoTrackData.getBitrate(), btsVar, 0);
                Object resolution = videoTrackData.getResolution();
                btsVar.f0(-189909404);
                if (resolution == null) {
                    resolution = placeholder(btsVar, 0);
                }
                btsVar.t(false);
                d = ohb1.d(R.string.video_track_template, new Object[]{title, bitsToString, resolution}, btsVar);
            }
            btsVar.t(false);
        }
        btsVar.t(false);
        if (d == null) {
            d = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return d;
    }

    public static final String getTextForViewportSize(Size size, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1288106552);
        String size2 = size != null ? size.toString() : null;
        if (size2 == null) {
            size2 = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return size2;
    }

    public static final String getTextForVsid(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1717188119);
        if (str == null) {
            str = placeholder(btsVar, 0);
        }
        btsVar.t(false);
        return str;
    }

    private static final Float millisecondsToSeconds(Long l) {
        if (l != null) {
            return Float.valueOf(l.longValue() / 1000.0f);
        }
        return null;
    }

    private static final String placeholder(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1109975501);
        String e = ohb1.e(btsVar, R.string.unknown_text);
        btsVar.t(false);
        return e;
    }

    private static final Number placeholderNumeric() {
        return -1;
    }
}
