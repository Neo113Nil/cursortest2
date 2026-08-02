package ru.yandex.video.m3.player.ui.debug.util;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.ContentData;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/util/PlayerDebugDataToStringConverter;", "", "()V", "placeholderNumeric", "", "getAudioDecoderString", "", "context", "Landroid/content/Context;", "debugData", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "getAudioTrackString", "getBandwidthString", "getBufferSizeString", "getContentString", "getDataLoadedString", "getDebugDataString", "getExtraInfoString", "getLastErrorString", "getLatencyString", "getSubtitleTrackString", "getVideoDecoderString", "getVideoTrackString", "getViewPortString", "getVsidString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerDebugDataToStringConverter {
    public static final int $stable = 8;
    private final Number placeholderNumeric = -1;

    private final String getAudioDecoderString(Context context, DebugData debugData) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Boolean hardwareAccelerated;
        String bool;
        Integer releases;
        Integer reuses;
        Integer inits;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.audio_decoder_label);
        DecoderData audioDecoderData = debugData.getAudioDecoderData();
        if (audioDecoderData == null || (str = audioDecoderData.getName()) == null) {
            str = string;
        }
        DecoderData audioDecoderData2 = debugData.getAudioDecoderData();
        if (audioDecoderData2 == null || (inits = audioDecoderData2.getInits()) == null || (obj = inits.toString()) == null) {
            obj = this.placeholderNumeric;
        }
        DecoderData audioDecoderData3 = debugData.getAudioDecoderData();
        if (audioDecoderData3 == null || (reuses = audioDecoderData3.getReuses()) == null || (obj2 = reuses.toString()) == null) {
            obj2 = this.placeholderNumeric;
        }
        DecoderData audioDecoderData4 = debugData.getAudioDecoderData();
        if (audioDecoderData4 == null || (releases = audioDecoderData4.getReleases()) == null || (obj3 = releases.toString()) == null) {
            obj3 = this.placeholderNumeric;
        }
        DecoderData audioDecoderData5 = debugData.getAudioDecoderData();
        if (audioDecoderData5 != null && (hardwareAccelerated = audioDecoderData5.getHardwareAccelerated()) != null && (bool = hardwareAccelerated.toString()) != null) {
            string = bool;
        }
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.audio_decoder_template, str, obj, obj2, obj3, string) + '\n';
    }

    private final String getAudioTrackString(Context context, DebugData debugData) {
        String str;
        String str2;
        String language;
        Integer bitrate;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.audio_track_label);
        AudioTrackData audioTrackData = debugData.getAudioTrackData();
        if (audioTrackData == null || (str = audioTrackData.getTitle()) == null) {
            str = string;
        }
        AudioTrackData audioTrackData2 = debugData.getAudioTrackData();
        if (audioTrackData2 == null || (bitrate = audioTrackData2.getBitrate()) == null || (str2 = bitrate.toString()) == null) {
            str2 = string;
        }
        AudioTrackData audioTrackData3 = debugData.getAudioTrackData();
        if (audioTrackData3 != null && (language = audioTrackData3.getLanguage()) != null) {
            string = language;
        }
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.audio_track_template, str, str2, string) + '\n';
    }

    private final String getBandwidthString(Context context, DebugData debugData) {
        String string = context.getString(R.string.bandwidth_estimation_label);
        BandwidthEstimation lastBandwidthEstimation = debugData.getLastBandwidthEstimation();
        return string + HexString.CHAR_SPACE + (lastBandwidthEstimation != null ? Long.valueOf(lastBandwidthEstimation.getValue()) : this.placeholderNumeric) + '\n';
    }

    private final String getBufferSizeString(Context context, DebugData debugData) {
        String string = context.getString(R.string.buffer_size_label);
        BufferSize currentBufferSize = debugData.getCurrentBufferSize();
        float floatValue = (currentBufferSize != null ? Long.valueOf(currentBufferSize.getValue()) : this.placeholderNumeric).floatValue();
        Number targetBufferSize = debugData.getTargetBufferSize();
        if (targetBufferSize == null) {
            targetBufferSize = this.placeholderNumeric;
        }
        return string + HexString.CHAR_SPACE + context.getString(R.string.buffer_size_template, Float.valueOf(floatValue), Float.valueOf(targetBufferSize.floatValue())) + '\n';
    }

    private final String getContentString(Context context, DebugData debugData) {
        String str;
        String str2;
        String str3;
        CurrentStreamType streamType;
        String name;
        CurrentVideoType videoType;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.content_label);
        ContentData contentData = debugData.getContentData();
        if (contentData == null || (str = contentData.getContentId()) == null) {
            str = string;
        }
        DrmMode drmMode = debugData.getDrmMode();
        if (drmMode == null || (str2 = drmMode.name()) == null) {
            str2 = string;
        }
        ContentData contentData2 = debugData.getContentData();
        if (contentData2 == null || (videoType = contentData2.getVideoType()) == null || (str3 = videoType.name()) == null) {
            str3 = string;
        }
        ContentData contentData3 = debugData.getContentData();
        if (contentData3 != null && (streamType = contentData3.getStreamType()) != null && (name = streamType.name()) != null) {
            string = name;
        }
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.content_template, str, str2, str3, string) + '\n';
    }

    private final String getDataLoadedString(Context context, DebugData debugData) {
        String l;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.bytes_loaded_label);
        BytesLoaded bytesLoaded = debugData.getBytesLoaded();
        if (bytesLoaded != null && (l = Long.valueOf(bytesLoaded.getTotal() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID).toString()) != null) {
            string = l;
        }
        return string2 + HexString.CHAR_SPACE + string + '\n';
    }

    private final String getExtraInfoString(Context context, DebugData debugData) {
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.extra_info_label);
        String networkTypeName = debugData.getNetworkTypeName();
        if (networkTypeName == null) {
            networkTypeName = string;
        }
        String dateTime = debugData.getDateTime();
        if (dateTime != null) {
            string = dateTime;
        }
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.extra_info_template, networkTypeName, string) + '\n';
    }

    private final String getLastErrorString(Context context, DebugData debugData) {
        return context.getString(R.string.last_error_label) + HexString.CHAR_SPACE + debugData.getLastError() + '\n';
    }

    private final String getLatencyString(Context context, DebugData debugData) {
        Long targetLatency;
        Long currentLatency;
        String string = context.getString(R.string.latency_label);
        LatencyData latencyData = debugData.getLatencyData();
        long longValue = (latencyData == null || (currentLatency = latencyData.getCurrentLatency()) == null) ? this.placeholderNumeric.longValue() : currentLatency.longValue();
        LatencyData latencyData2 = debugData.getLatencyData();
        long longValue2 = (latencyData2 == null || (targetLatency = latencyData2.getTargetLatency()) == null) ? this.placeholderNumeric.longValue() : targetLatency.longValue();
        return string + HexString.CHAR_SPACE + ((longValue < 0 || longValue2 < 0) ? context.getString(R.string.latency_not_in_live_text) : context.getString(R.string.latency_in_live_template, Long.valueOf(longValue), Long.valueOf(longValue2))) + '\n';
    }

    private final String getSubtitleTrackString(Context context, DebugData debugData) {
        String str;
        String str2;
        String language;
        Integer bitrate;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.subtitles_track_label);
        SubtitlesTrackData subtitlesTrackData = debugData.getSubtitlesTrackData();
        if (subtitlesTrackData == null || (str = subtitlesTrackData.getTitle()) == null) {
            str = string;
        }
        SubtitlesTrackData subtitlesTrackData2 = debugData.getSubtitlesTrackData();
        if (subtitlesTrackData2 == null || (bitrate = subtitlesTrackData2.getBitrate()) == null || (str2 = bitrate.toString()) == null) {
            str2 = string;
        }
        SubtitlesTrackData subtitlesTrackData3 = debugData.getSubtitlesTrackData();
        if (subtitlesTrackData3 != null && (language = subtitlesTrackData3.getLanguage()) != null) {
            string = language;
        }
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.audio_track_template, str, str2, string) + '\n';
    }

    private final String getVideoDecoderString(Context context, DebugData debugData) {
        Object obj;
        Object obj2;
        Object obj3;
        Boolean hardwareAccelerated;
        String bool;
        Integer releases;
        Integer reuses;
        Integer inits;
        String name;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.video_decoder_label);
        DecoderData videoDecoderData = debugData.getVideoDecoderData();
        String str = (videoDecoderData == null || (name = videoDecoderData.getName()) == null) ? string : name;
        DecoderData videoDecoderData2 = debugData.getVideoDecoderData();
        if (videoDecoderData2 == null || (inits = videoDecoderData2.getInits()) == null || (obj = inits.toString()) == null) {
            obj = this.placeholderNumeric;
        }
        Object obj4 = obj;
        DecoderData videoDecoderData3 = debugData.getVideoDecoderData();
        if (videoDecoderData3 == null || (reuses = videoDecoderData3.getReuses()) == null || (obj2 = reuses.toString()) == null) {
            obj2 = this.placeholderNumeric;
        }
        Object obj5 = obj2;
        DecoderData videoDecoderData4 = debugData.getVideoDecoderData();
        if (videoDecoderData4 == null || (releases = videoDecoderData4.getReleases()) == null || (obj3 = releases.toString()) == null) {
            obj3 = this.placeholderNumeric;
        }
        Object obj6 = obj3;
        DecoderData videoDecoderData5 = debugData.getVideoDecoderData();
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.video_decoder_template, str, obj4, obj5, obj6, (videoDecoderData5 == null || (hardwareAccelerated = videoDecoderData5.getHardwareAccelerated()) == null || (bool = hardwareAccelerated.toString()) == null) ? string : bool, Integer.valueOf(debugData.getDroppedFrames())) + '\n';
    }

    private final String getVideoTrackString(Context context, DebugData debugData) {
        String str;
        String str2;
        Size resolution;
        String size;
        Integer bitrate;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.video_track_label);
        VideoTrackData videoTrackData = debugData.getVideoTrackData();
        if (videoTrackData == null || (str = videoTrackData.getTitle()) == null) {
            str = string;
        }
        VideoTrackData videoTrackData2 = debugData.getVideoTrackData();
        if (videoTrackData2 == null || (bitrate = videoTrackData2.getBitrate()) == null || (str2 = bitrate.toString()) == null) {
            str2 = string;
        }
        VideoTrackData videoTrackData3 = debugData.getVideoTrackData();
        if (videoTrackData3 != null && (resolution = videoTrackData3.getResolution()) != null && (size = resolution.toString()) != null) {
            string = size;
        }
        return string2 + HexString.CHAR_SPACE + context.getString(R.string.video_track_template, str, str2, string) + '\n';
    }

    private final String getViewPortString(Context context, DebugData debugData) {
        String size;
        String string = context.getString(R.string.unknown_text);
        String string2 = context.getString(R.string.viewport_size_label);
        Size viewPortSize = debugData.getViewPortSize();
        if (viewPortSize != null && (size = viewPortSize.toString()) != null) {
            string = size;
        }
        return string2 + HexString.CHAR_SPACE + string + '\n';
    }

    private final String getVsidString(Context context, DebugData debugData) {
        return context.getString(R.string.vsid_label) + HexString.CHAR_SPACE + debugData.getVsid() + '\n';
    }

    public final String getDebugDataString(Context context, DebugData debugData) {
        CurrentVideoType videoType;
        StringBuilder sb = new StringBuilder();
        sb.append(getVsidString(context, debugData));
        sb.append(getContentString(context, debugData));
        sb.append(getVideoTrackString(context, debugData));
        sb.append(getAudioTrackString(context, debugData));
        sb.append(getSubtitleTrackString(context, debugData));
        sb.append(getViewPortString(context, debugData));
        sb.append(getVideoDecoderString(context, debugData));
        sb.append(getAudioDecoderString(context, debugData));
        sb.append(getBandwidthString(context, debugData));
        sb.append(getBufferSizeString(context, debugData));
        sb.append(getDataLoadedString(context, debugData));
        ContentData contentData = debugData.getContentData();
        boolean z = false;
        if (contentData != null && (videoType = contentData.getVideoType()) != null && (videoType == CurrentVideoType.LIVE || videoType == CurrentVideoType.EVENT)) {
            z = true;
        }
        if (debugData.getLatencyData() != null && z) {
            sb.append(getLatencyString(context, debugData));
        }
        sb.append(getExtraInfoString(context, debugData));
        if (debugData.getLastError() != null) {
            sb.append(getLastErrorString(context, debugData));
        }
        return sb.toString();
    }
}
