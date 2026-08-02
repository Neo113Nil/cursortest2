package ru.yandex.video.m3.player.ui.debug.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.s5g0;
import defpackage.sls;
import defpackage.vz5;
import defpackage.w511;
import defpackage.y6i0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.databinding.DebugViewBinding;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.ContentData;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.TrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;
import ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView;
import ru.yandex.video.m3.player.ui.debug.view.graph.LoadedChunkGraphView;

@jxi
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u0019\u0010 \u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010)J#\u0010.\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J-\u00105\u001a\u00020\r2\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b5\u00106J!\u00109\u001a\u00020\r2\u0006\u00101\u001a\u0002002\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010\u000fJ\u0017\u0010@\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010\u000fJ\u0017\u0010A\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bA\u0010\u000fJ\u0017\u0010B\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bB\u0010\u000fJ\u0019\u0010D\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\bD\u0010\u001eJ\u000f\u0010E\u001a\u00020\rH\u0002¢\u0006\u0004\bE\u0010\u001aJ\u0017\u0010F\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\bF\u0010$J)\u0010H\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010K\u001a\u00020\r*\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001a\u00020\r*\u00020JH\u0002¢\u0006\u0004\bM\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010Y\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\bY\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010Z\"\u0004\b_\u0010]R\u0014\u0010a\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010[¨\u0006b"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/view/YandexPlayerDebugView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "debugData", "Lzy11;", "setData", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "updateCommon", "updatePortrait", "()V", "", "vsid", "updateLandscape", "(Ljava/lang/String;)V", "updateSessionColor", "updateQrCode", "hideQrCode", "visibility", "changeLatencyVisibility", "(I)V", "Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "latencyData", "isLive", "displayLatency", "(Lru/yandex/video/m3/player/ui/debug/model/LatencyData;Z)V", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "contentData", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "drmMode", "displayContent", "(Lru/yandex/video/m3/player/ui/debug/model/ContentData;Lru/yandex/video/m3/player/ui/debug/model/DrmMode;)V", "Landroid/widget/TextView;", "textView", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "decoderData", "droppedFrames", "displayDecoder", "(Landroid/widget/TextView;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Ljava/lang/Integer;)V", "Lru/yandex/video/m3/player/ui/debug/model/TrackData;", "trackData", "displayTrack", "(Landroid/widget/TextView;Lru/yandex/video/m3/player/ui/debug/model/TrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bytesLoaded", "displayBytes", "(Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;)V", "updateBandwidth", "updateLoadData", "updateBufferData", "updateAdditionalData", "lastError", "displayLastError", "tryChangeCompactVisibility", "changeCompactVisibility", "attrs", "initAttributes", "(Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "visible", "(Landroid/view/View;)V", "gone", "Lru/yandex/video/m3/databinding/DebugViewBinding;", "binding$delegate", "Li3y;", "getBinding", "()Lru/yandex/video/m3/databinding/DebugViewBinding;", "binding", "lastVsid", "Ljava/lang/String;", "lastDebugData", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "value", "isCompact", "Z", "()Z", "setCompact", "(Z)V", "isCompactInternal", "setCompactInternal", "getShouldBeCompact", "shouldBeCompact", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerDebugView extends FrameLayout {
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final i3y binding;
    private boolean isCompact;
    private boolean isCompactInternal;
    private DebugData lastDebugData;
    private String lastVsid;

    public /* synthetic */ YandexPlayerDebugView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final void changeCompactVisibility(int visibility) {
        DebugViewBinding binding = getBinding();
        binding.graphsBlock.setVisibility(visibility);
        binding.errorBlock.setVisibility(visibility);
        binding.latencyAndAdditionalBlock.setVisibility(visibility);
        binding.qrCode.setVisibility(visibility);
        setData(this.lastDebugData);
    }

    private final void changeLatencyVisibility(int visibility) {
        getBinding().latencyAndAdditionalBlock.setVisibility(visibility);
    }

    private final void displayBytes(BytesLoaded bytesLoaded) {
        String string;
        TextView textView = getBinding().totalBytesLoaded;
        if (bytesLoaded == null || (string = Long.valueOf(bytesLoaded.getTotal() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID).toString()) == null) {
            string = getContext().getString(R.string.none_text);
        }
        textView.setText(string);
    }

    private final void displayContent(ContentData contentData, DrmMode drmMode) {
        String string;
        String string2;
        TextView textView = getBinding().content;
        if (contentData == null) {
            string2 = getContext().getString(R.string.none_text);
        } else if (getShouldBeCompact()) {
            String contentId = contentData.getContentId();
            string2 = contentId == null ? getContext().getString(R.string.none_text) : contentId;
        } else {
            String contentId2 = contentData.getContentId();
            if (contentId2 == null) {
                contentId2 = getContext().getString(R.string.none_text);
            }
            Object videoType = contentData.getVideoType();
            if (videoType == null) {
                videoType = getContext().getString(R.string.none_text);
            }
            Object streamType = contentData.getStreamType();
            if (streamType == null) {
                streamType = getContext().getString(R.string.none_text);
            }
            if (drmMode == null || (string = drmMode.toString()) == null) {
                string = getContext().getString(R.string.none_text);
            }
            string2 = getContext().getString(R.string.content_template, contentId2, string, videoType, streamType);
        }
        textView.setText(string2);
    }

    private final void displayDecoder(TextView textView, DecoderData decoderData, Integer droppedFrames) {
        String string;
        if (decoderData == null) {
            string = getContext().getString(R.string.none_text);
        } else if (getShouldBeCompact()) {
            String name = decoderData.getName();
            string = name == null ? getContext().getString(R.string.none_text) : name;
        } else {
            String name2 = decoderData.getName();
            if (name2 == null) {
                name2 = getContext().getString(R.string.none_text);
            }
            String str = name2;
            Object inits = decoderData.getInits();
            if (inits == null) {
                inits = getContext().getString(R.string.none_text);
            }
            Object obj = inits;
            Object reuses = decoderData.getReuses();
            if (reuses == null) {
                reuses = getContext().getString(R.string.none_text);
            }
            Object obj2 = reuses;
            Object releases = decoderData.getReleases();
            if (releases == null) {
                releases = getContext().getString(R.string.none_text);
            }
            Object obj3 = releases;
            Object hardwareAccelerated = decoderData.getHardwareAccelerated();
            if (hardwareAccelerated == null) {
                hardwareAccelerated = getContext().getString(R.string.none_text);
            }
            Object obj4 = hardwareAccelerated;
            string = droppedFrames != null ? getContext().getString(R.string.video_decoder_template, str, obj, obj2, obj3, obj4, droppedFrames) : getContext().getString(R.string.audio_decoder_template, str, obj, obj2, obj3, obj4);
        }
        textView.setText(string);
    }

    public static /* synthetic */ void displayDecoder$default(YandexPlayerDebugView yandexPlayerDebugView, TextView textView, DecoderData decoderData, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        yandexPlayerDebugView.displayDecoder(textView, decoderData, num);
    }

    private final void displayLastError(String lastError) {
        DebugViewBinding binding = getBinding();
        if (lastError == null || evu0.J(lastError)) {
            gone(binding.errorBlock);
        } else {
            binding.lastError.setText(lastError);
            visible(binding.errorBlock);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r9 != null ? r9.longValue() : -1) >= 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void displayLatency(LatencyData latencyData, boolean isLive) {
        String string;
        if (getShouldBeCompact()) {
            changeLatencyVisibility(8);
            return;
        }
        if (latencyData == null) {
            changeLatencyVisibility(8);
            return;
        }
        Long currentLatency = latencyData.getCurrentLatency();
        Long targetLatency = latencyData.getTargetLatency();
        TextView textView = getBinding().latency;
        if (isLive) {
            if ((currentLatency != null ? currentLatency.longValue() : -1L) < 0) {
            }
            string = getContext().getString(R.string.latency_in_live_template, currentLatency, targetLatency);
            textView.setText(string);
            changeLatencyVisibility(0);
        }
        string = getContext().getString(R.string.latency_not_in_live_text);
        textView.setText(string);
        changeLatencyVisibility(0);
    }

    private final void displayTrack(TextView textView, TrackData trackData) {
        String string;
        String string2;
        String string3;
        String string4;
        if (trackData == null) {
            string2 = getContext().getString(R.string.none_text);
        } else if (getShouldBeCompact()) {
            String title = trackData.getTitle();
            string2 = title == null ? getContext().getString(R.string.none_text) : title;
        } else if (trackData instanceof VideoTrackData) {
            String title2 = trackData.getTitle();
            if (title2 == null) {
                title2 = getContext().getString(R.string.none_text);
            }
            Integer bitrate = trackData.getBitrate();
            if (bitrate == null || (string4 = bitrate.toString()) == null) {
                string4 = getContext().getString(R.string.none_text);
            }
            Object resolution = ((VideoTrackData) trackData).getResolution();
            if (resolution == null) {
                resolution = getContext().getString(R.string.none_text);
            }
            string2 = getContext().getString(R.string.video_track_template, title2, string4, resolution);
        } else if (trackData instanceof AudioTrackData) {
            String title3 = trackData.getTitle();
            if (title3 == null) {
                title3 = getContext().getString(R.string.none_text);
            }
            Integer bitrate2 = trackData.getBitrate();
            if (bitrate2 == null || (string3 = bitrate2.toString()) == null) {
                string3 = getContext().getString(R.string.none_text);
            }
            String language = ((AudioTrackData) trackData).getLanguage();
            if (language == null) {
                language = getContext().getString(R.string.none_text);
            }
            string2 = getContext().getString(R.string.audio_track_template, title3, string3, language);
        } else {
            if (!(trackData instanceof SubtitlesTrackData)) {
                w511.b();
                return;
            }
            String title4 = trackData.getTitle();
            if (title4 == null) {
                title4 = getContext().getString(R.string.none_text);
            }
            Integer bitrate3 = trackData.getBitrate();
            if (bitrate3 == null || (string = bitrate3.toString()) == null) {
                string = getContext().getString(R.string.none_text);
            }
            String language2 = ((SubtitlesTrackData) trackData).getLanguage();
            if (language2 == null) {
                language2 = getContext().getString(R.string.none_text);
            }
            string2 = getContext().getString(R.string.subtitle_track_template, title4, string, language2);
        }
        textView.setText(string2);
    }

    private final DebugViewBinding getBinding() {
        return (DebugViewBinding) this.binding.getValue();
    }

    private final boolean getShouldBeCompact() {
        return this.isCompact || this.isCompactInternal;
    }

    private final void gone(View view) {
        view.setVisibility(8);
    }

    private final void hideQrCode() {
        gone(getBinding().qrCode);
    }

    private final void initAttributes(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (attrs == null) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.YandexPlayerDebugView, defStyleAttr, defStyleRes);
        int color = obtainStyledAttributes.getColor(R.styleable.YandexPlayerDebugView_bandwidthColor, DebugGraphView.DEFAULT_GRAPH_COLOR);
        int color2 = obtainStyledAttributes.getColor(R.styleable.YandexPlayerDebugView_bufferColor, DebugGraphView.DEFAULT_GRAPH_COLOR);
        int color3 = obtainStyledAttributes.getColor(R.styleable.YandexPlayerDebugView_chunkColor, DebugGraphView.DEFAULT_GRAPH_COLOR);
        int color4 = obtainStyledAttributes.getColor(R.styleable.YandexPlayerDebugView_errorColor, -65536);
        int d = y6i0.d(obtainStyledAttributes.getInt(R.styleable.YandexPlayerDebugView_historyLength, 30), 10, 120);
        float c = y6i0.c(obtainStyledAttributes.getFloat(R.styleable.YandexPlayerDebugView_stepLength, 0.5f), 0.1f, 10.0f);
        LoadedChunkGraphView loadedChunkGraphView = getBinding().chunksGraph;
        loadedChunkGraphView.setTimeConfiguration(d, c);
        loadedChunkGraphView.setGraphColor(color3);
        loadedChunkGraphView.setErrorColor(color4);
        LineGraphView lineGraphView = getBinding().bufferSizeGraph;
        lineGraphView.setTimeConfiguration(d, c);
        lineGraphView.setGraphColor(color2);
        LineGraphView lineGraphView2 = getBinding().bandwidthEstimationGraph;
        lineGraphView2.setTimeConfiguration(d, c);
        lineGraphView2.setGraphColor(color);
        setCompact(obtainStyledAttributes.getBoolean(R.styleable.YandexPlayerDebugView_compactMode, false));
        if (this.isCompact) {
            changeCompactVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }

    private final void setCompactInternal(boolean z) {
        boolean z2 = this.isCompactInternal;
        this.isCompactInternal = z;
        if (z2 != z) {
            tryChangeCompactVisibility();
        }
    }

    private final void tryChangeCompactVisibility() {
        if (getShouldBeCompact()) {
            changeCompactVisibility(8);
        } else {
            changeCompactVisibility(0);
        }
    }

    private final void updateAdditionalData(DebugData debugData) {
        DebugViewBinding binding = getBinding();
        if (debugData.getNetworkTypeName() != null) {
            binding.additional.setText(getContext().getString(R.string.extra_info_template, debugData.getNetworkTypeName(), debugData.getDateTime()));
        } else {
            binding.additional.setText(debugData.getDateTime());
        }
    }

    private final void updateBandwidth(DebugData debugData) {
        List<BandwidthEstimation> bandwidthEstimationsHistory;
        DebugViewBinding binding = getBinding();
        TextView textView = binding.bandwidthEstimation;
        BandwidthEstimation lastBandwidthEstimation = debugData.getLastBandwidthEstimation();
        textView.setText(String.valueOf(lastBandwidthEstimation != null ? lastBandwidthEstimation.getValue() : 0L));
        binding.bufferSize.setText(getContext().getString(R.string.buffer_size_template, Float.valueOf(debugData.getCurrentBufferSize() != null ? r3.getValue() : 0.0f), Float.valueOf(debugData.getTargetBufferSize() != null ? r5.longValue() : 0.0f)));
        binding.bandwidthEstimationGraph.move(null);
        if (debugData.getLastBandwidthEstimation() == null || (bandwidthEstimationsHistory = debugData.getBandwidthEstimationsHistory()) == null) {
            return;
        }
        binding.bandwidthEstimationGraph.setEvents(bandwidthEstimationsHistory);
    }

    private final void updateBufferData(DebugData debugData) {
        DebugViewBinding binding = getBinding();
        binding.bufferSizeGraph.move(null);
        if (debugData.getCurrentBufferSize() != null) {
            List<BandwidthEstimation> bandwidthEstimationsHistory = debugData.getBandwidthEstimationsHistory();
            if (bandwidthEstimationsHistory != null) {
                binding.bandwidthEstimationGraph.setEvents(bandwidthEstimationsHistory);
            }
            List<BufferSize> bufferSizeHistory = debugData.getBufferSizeHistory();
            if (bufferSizeHistory != null) {
                binding.bufferSizeGraph.setEvents(bufferSizeHistory);
            }
        }
    }

    private final void updateCommon(DebugData debugData) {
        updateSessionColor(debugData);
        DebugViewBinding binding = getBinding();
        binding.vsid.setText(debugData.getVsid());
        displayContent(debugData.getContentData(), debugData.getDrmMode());
        displayTrack(binding.videoTrack, debugData.getVideoTrackData());
        displayTrack(binding.audioTrack, debugData.getAudioTrackData());
        displayTrack(binding.subtitlesTrack, debugData.getSubtitlesTrackData());
        binding.viewportSize.setText(String.valueOf(debugData.getViewPortSize()));
        displayDecoder(binding.videoDecoder, debugData.getVideoDecoderData(), Integer.valueOf(debugData.getDroppedFrames()));
        displayDecoder$default(this, binding.audioDecoder, debugData.getAudioDecoderData(), null, 4, null);
        updateBandwidth(debugData);
        displayBytes(debugData.getBytesLoaded());
        updateLoadData(debugData);
        updateBufferData(debugData);
        LatencyData latencyData = debugData.getLatencyData();
        ContentData contentData = debugData.getContentData();
        displayLatency(latencyData, (contentData != null ? contentData.getVideoType() : null) == CurrentVideoType.LIVE);
        updateAdditionalData(debugData);
        displayLastError(debugData.getLastError());
        if (debugData.getVsid() == null) {
            hideQrCode();
        } else {
            if (jl40.l(debugData.getVsid(), this.lastVsid)) {
                return;
            }
            this.lastVsid = debugData.getVsid();
            updateQrCode(debugData.getVsid());
        }
    }

    private final void updateLandscape(String vsid) {
        List W;
        List W2;
        Paint paint = new Paint();
        paint.setTextSize(getBinding().vsid.getTextSize());
        int measureText = (int) paint.measureText(vsid);
        Paint paint2 = new Paint();
        paint2.setTextSize(getBinding().videoDecoder.getTextSize());
        W = evu0.W(getBinding().videoDecoder.getText(), new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
        Iterator it = W.iterator();
        int i = 0;
        while (it.hasNext()) {
            int measureText2 = (int) paint2.measureText((String) it.next());
            if (measureText2 > i) {
                i = measureText2;
            }
        }
        Paint paint3 = new Paint();
        paint3.setTextSize(getBinding().audioDecoder.getTextSize());
        W2 = evu0.W(getBinding().audioDecoder.getText(), new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
        Iterator it2 = W2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int measureText3 = (int) paint3.measureText((String) it2.next());
            if (measureText3 > i2) {
                i2 = measureText3;
            }
        }
        if (getBinding().vsidLabel.getWidth() + measureText > getBinding().audioDecoderLabel.getWidth() + getBinding().videoDecoderLabel.getWidth() + i + i2) {
            TextView textView = getBinding().audioDecoder;
            ViewGroup.LayoutParams layoutParams = getBinding().audioDecoder.getLayoutParams();
            layoutParams.width = 0;
            textView.setLayoutParams(layoutParams);
            TextView textView2 = getBinding().videoDecoder;
            ViewGroup.LayoutParams layoutParams2 = getBinding().videoDecoder.getLayoutParams();
            layoutParams2.width = 0;
            textView2.setLayoutParams(layoutParams2);
            TextView textView3 = getBinding().vsid;
            ViewGroup.LayoutParams layoutParams3 = getBinding().vsid.getLayoutParams();
            layoutParams3.width = measureText;
            textView3.setLayoutParams(layoutParams3);
            return;
        }
        int max = Math.max(i2, i);
        TextView textView4 = getBinding().audioDecoder;
        ViewGroup.LayoutParams layoutParams4 = getBinding().audioDecoder.getLayoutParams();
        layoutParams4.width = max;
        textView4.setLayoutParams(layoutParams4);
        TextView textView5 = getBinding().videoDecoder;
        ViewGroup.LayoutParams layoutParams5 = getBinding().videoDecoder.getLayoutParams();
        layoutParams5.width = max;
        textView5.setLayoutParams(layoutParams5);
        TextView textView6 = getBinding().vsid;
        ViewGroup.LayoutParams layoutParams6 = getBinding().vsid.getLayoutParams();
        layoutParams6.width = 0;
        textView6.setLayoutParams(layoutParams6);
    }

    private final void updateLoadData(DebugData debugData) {
        List<LoadedChunk> loadedChunksHistory;
        DebugViewBinding binding = getBinding();
        binding.chunksGraph.move(null);
        if (debugData.getLastLoadedChunk() == null || (loadedChunksHistory = debugData.getLoadedChunksHistory()) == null) {
            return;
        }
        binding.chunksGraph.setEvents(loadedChunksHistory);
    }

    private final void updatePortrait() {
        if (getLayoutParams().width == -2) {
            if (getShouldBeCompact()) {
                Paint paint = new Paint();
                paint.setTextSize(getBinding().vsid.getTextSize());
                float measureText = paint.measureText(getBinding().vsid.getText().subSequence(0, evu0.G(getBinding().vsid.getText(), 'x', 0, 6)).toString());
                TextView textView = getBinding().vsid;
                ViewGroup.LayoutParams layoutParams = getBinding().vsid.getLayoutParams();
                layoutParams.width = (int) measureText;
                textView.setLayoutParams(layoutParams);
                TextView textView2 = getBinding().videoTrack;
                ViewGroup.LayoutParams layoutParams2 = getBinding().videoTrack.getLayoutParams();
                layoutParams2.width = 0;
                textView2.setLayoutParams(layoutParams2);
                return;
            }
            Paint paint2 = new Paint();
            paint2.setTextSize(getBinding().videoTrack.getTextSize());
            float measureText2 = paint2.measureText(getBinding().videoTrack.getText().toString());
            TextView textView3 = getBinding().vsid;
            ViewGroup.LayoutParams layoutParams3 = getBinding().vsid.getLayoutParams();
            layoutParams3.width = 0;
            textView3.setLayoutParams(layoutParams3);
            TextView textView4 = getBinding().videoTrack;
            ViewGroup.LayoutParams layoutParams4 = getBinding().videoTrack.getLayoutParams();
            layoutParams4.width = (int) measureText2;
            textView4.setLayoutParams(layoutParams4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ru.yandex.video.m3.player.ui.debug.view.YandexPlayerDebugView] */
    private final void updateQrCode(String vsid) {
        ?? failure;
        if (vsid == null) {
            getBinding().qrCode.setImageBitmap(null);
            return;
        }
        try {
            vz5 a = new s5g0().a(vsid, BarcodeFormat.QR_CODE, 256, 256, null);
            failure = Bitmap.createBitmap(256, 256, Bitmap.Config.RGB_565);
            for (int i = 0; i < 256; i++) {
                for (int i2 = 0; i2 < 256; i2++) {
                    if (a.b(i, i2)) {
                        failure.setPixel(i, i2, ModalContentViewContainer.BASE_SHADOW_COLOR);
                    } else {
                        failure.setPixel(i, i2, -1);
                    }
                }
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            return;
        }
        ImageView imageView = getBinding().qrCode;
        imageView.setImageBitmap((Bitmap) failure);
        if (getShouldBeCompact()) {
            gone(imageView);
        } else {
            visible(imageView);
        }
    }

    private final void updateSessionColor(DebugData debugData) {
        getBinding().qrCode.setBackgroundColor(debugData.getSessionColor().getColor());
    }

    private final void visible(View view) {
        view.setVisibility(0);
    }

    /* renamed from: isCompact, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        setCompactInternal(getHeight() < getBinding().getRoot().getHeight());
    }

    public final void setCompact(boolean z) {
        boolean z2 = this.isCompact;
        this.isCompact = z;
        if (z2 != z) {
            tryChangeCompactVisibility();
        }
    }

    public final void setData(DebugData debugData) {
        if (debugData == null) {
            return;
        }
        this.lastDebugData = debugData;
        updateCommon(debugData);
        int i = getContext().getResources().getConfiguration().orientation;
        if (i == 1) {
            updatePortrait();
        } else {
            if (i != 2) {
                return;
            }
            updateLandscape(debugData.getVsid());
        }
    }

    public YandexPlayerDebugView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public YandexPlayerDebugView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public YandexPlayerDebugView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public YandexPlayerDebugView(final Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.binding = a.a(new sls() { // from class: ru.yandex.video.m3.player.ui.debug.view.YandexPlayerDebugView$binding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final DebugViewBinding invoke() {
                return DebugViewBinding.inflate(LayoutInflater.from(context), this, true);
            }
        });
        initAttributes(attributeSet, i, i2);
    }
}
