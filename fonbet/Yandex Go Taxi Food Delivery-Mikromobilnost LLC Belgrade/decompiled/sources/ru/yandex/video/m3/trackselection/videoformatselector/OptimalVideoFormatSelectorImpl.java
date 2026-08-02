package ru.yandex.video.m3.trackselection.videoformatselector;

import android.content.Context;
import android.content.SharedPreferences;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cvu0;
import defpackage.h5z0;
import defpackage.ip4;
import defpackage.jwu;
import defpackage.jxi;
import defpackage.kwu;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uvc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.data.Format;
import ru.yandex.video.m3.player.InternalDiUtil;
import ru.yandex.video.m3.player.abr.AesthetePreferenceProvider;
import ru.yandex.video.m3.player.abr.UserQualityRepository;
import ru.yandex.video.m3.player.abr.impl.AesthetePreferenceProviderImpl;
import ru.yandex.video.m3.player.abr.impl.UserQualityRepositoryImpl;
import ru.yandex.video.m3.player.impl.SurfaceSizeHolderInternal;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorException;
import ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorImpl;
import ru.yandex.video.m3.trackselection.videoformatselector.tracking.OptimalVideoFormatSelectorEventTracker;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 N2\u00020\u0001:\u0002NOB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0017\u001a\u00060\u0016R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\n\u0010\u0017\u001a\u00060\u0016R\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\b\u0018\u00010\u0016R\u00020\u00002\u0010\u0010\"\u001a\f\u0012\b\u0012\u00060\u0016R\u00020\u00000!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00060\u0016R\u00020\u0000*\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001a*\u00060\u0016R\u00020\u0000H\u0002¢\u0006\u0004\b(\u0010\u001eJ-\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u00182\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0!2\u0006\u0010+\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010\u0015J\u001d\u00100\u001a\u00020%2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020%0!H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\u00132\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u001aH\u0016¢\u0006\u0004\b@\u0010AR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010ER\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010CR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010FR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010LR\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010M¨\u0006P"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "Lip4;", "bandwidthMeter", "", "vsid", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "Landroid/content/Context;", "context", "from", "Lru/yandex/video/m3/player/abr/UserQualityRepository;", "userQualityRepository", "Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "aesthetePreferenceProvider", "Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker;", "eventTracker", "<init>", "(Lip4;Ljava/lang/String;Lru/yandex/video/m3/ab/config/AbConfig;Landroid/content/Context;Ljava/lang/String;Lru/yandex/video/m3/player/abr/UserQualityRepository;Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker;)V", "Lzy11;", "updateSurfaceSizeHolder", "()V", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl$VideoMetadataInternal;", "videoMetadata", "", "effectiveBitrate", "", "canSelectFormat", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl$VideoMetadataInternal;J)Z", "canSelectFormatBySurfaceSizeRestriction", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl$VideoMetadataInternal;)Z", "getAllocatedBandwidth", "()J", "", "videosMetadata", "findStreamingFormatVideo", "(Ljava/util/List;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl$VideoMetadataInternal;", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "toVideoMetadataInternal", "(Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl$VideoMetadataInternal;", "isInWhiteList", "bandwidth", "input", "output", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", "createAnalyticsData", "(JLjava/util/List;Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorAnalyticsData;", "initEventTracker", "getOptimalVideoFormat", "(Ljava/util/List;)Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "Lru/yandex/video/m3/player/provider/model/SurfaceSize;", "surfaceSize", "setSurfaceSize", "(Lru/yandex/video/m3/player/provider/model/SurfaceSize;)V", "whiteListFormatExtensions", "setWhiteListFormatExtensions", "(Ljava/util/List;)V", "", "serviceQuality", "setServiceQuality", "(I)V", "setContext", "(Landroid/content/Context;)V", "value", "experimentalShouldConsiderSelectedUserQuality", "(Z)V", "Lip4;", "Ljava/lang/String;", "Lru/yandex/video/m3/ab/config/AbConfig;", "Landroid/content/Context;", "Lru/yandex/video/m3/player/abr/UserQualityRepository;", "Lru/yandex/video/m3/player/abr/AesthetePreferenceProvider;", "Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker;", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "surfaceSizeHolder", "Lru/yandex/video/m3/player/impl/SurfaceSizeHolderInternal;", "Ljava/lang/Integer;", "Ljava/util/List;", "Companion", "VideoMetadataInternal", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OptimalVideoFormatSelectorImpl implements OptimalVideoFormatSelector {
    private static final long BANDWIDTH_UNKNOWN = -1;
    private static final String OPTIMAL_FORMAT_WAS_NOT_FOUND_EXCEPTION_TEXT = "\n           Optimal format was not found, please check that:\n                1. Input list of videos metadata is not empty. \n                2. Video format extension of input list of videos metadata intersect at least with one video format extension at white list. Check [setWhiteListFormatExtensions].   \n        ";
    private static final int SERVICE_QUALITY_UNSET = -1;
    private static final int USER_QUALITY_UNSET = -1;
    private final AbConfig abConfig;
    private AesthetePreferenceProvider aesthetePreferenceProvider;
    private ip4 bandwidthMeter;
    private Context context;
    private OptimalVideoFormatSelectorEventTracker eventTracker;
    private String from;
    private Integer serviceQuality;
    private SurfaceSizeHolderInternal surfaceSizeHolder;
    private UserQualityRepository userQualityRepository;
    private final String vsid;
    private List<String> whiteListFormatExtensions;
    public static final int $stable = 8;
    private static final Comparator<VideoMetadataInternal> optimalVideoFormatComparator = uvc.a(new tls() { // from class: ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorImpl$Companion$optimalVideoFormatComparator$1
        @Override // defpackage.tls
        public final Comparable<?> invoke(OptimalVideoFormatSelectorImpl.VideoMetadataInternal videoMetadataInternal) {
            return Integer.valueOf(-videoMetadataInternal.getFormat().getBitrate());
        }
    }, new tls() { // from class: ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorImpl$Companion$optimalVideoFormatComparator$2
        @Override // defpackage.tls
        public final Comparable<?> invoke(OptimalVideoFormatSelectorImpl.VideoMetadataInternal videoMetadataInternal) {
            String str;
            kwu uri = videoMetadataInternal.getUri();
            boolean z = false;
            if (uri != null && (str = (String) a.Z(uri.f)) != null && !cvu0.s(str, "mp4", false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl$VideoMetadataInternal;", "", "Lkwu;", LaunchBrowserActivity.KEY_URI, "Lru/yandex/video/m3/data/Format;", "format", "<init>", "(Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorImpl;Lkwu;Lru/yandex/video/m3/data/Format;)V", "Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "toVideoMetadata", "()Lru/yandex/video/m3/trackselection/videoformatselector/VideoMetadata;", "Lkwu;", "getUri", "()Lkwu;", "Lru/yandex/video/m3/data/Format;", "getFormat", "()Lru/yandex/video/m3/data/Format;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class VideoMetadataInternal {
        private final Format format;
        private final kwu uri;

        public VideoMetadataInternal(kwu kwuVar, Format format) {
            this.uri = kwuVar;
            this.format = format;
        }

        public final Format getFormat() {
            return this.format;
        }

        public final kwu getUri() {
            return this.uri;
        }

        public final VideoMetadata toVideoMetadata() {
            return VideoMetadataKt.VideoMetadata$default(String.valueOf(this.uri), this.format, null, 4, null);
        }
    }

    public OptimalVideoFormatSelectorImpl(ip4 ip4Var, String str, AbConfig abConfig, Context context, String str2, UserQualityRepository userQualityRepository, AesthetePreferenceProvider aesthetePreferenceProvider, OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker) {
        this.bandwidthMeter = ip4Var;
        this.vsid = str;
        this.abConfig = abConfig;
        this.context = context;
        this.from = str2;
        this.userQualityRepository = userQualityRepository;
        this.aesthetePreferenceProvider = aesthetePreferenceProvider;
        this.eventTracker = optimalVideoFormatSelectorEventTracker;
        this.surfaceSizeHolder = new SurfaceSizeHolderInternal(Integer.MAX_VALUE, Integer.MAX_VALUE, false);
        this.whiteListFormatExtensions = scc.g("mpd", "m3u8", "mp4", "webm");
    }

    private final boolean canSelectFormat(VideoMetadataInternal videoMetadata, long effectiveBitrate) {
        return ((((long) videoMetadata.getFormat().getBitrate()) > effectiveBitrate ? 1 : (((long) videoMetadata.getFormat().getBitrate()) == effectiveBitrate ? 0 : -1)) <= 0) && canSelectFormatBySurfaceSizeRestriction(videoMetadata);
    }

    private final boolean canSelectFormatBySurfaceSizeRestriction(VideoMetadataInternal videoMetadata) {
        Format format = videoMetadata.getFormat();
        if (format.getHeight() <= this.surfaceSizeHolder.getCappingHeight() && format.getWidth() <= this.surfaceSizeHolder.getCappingWidth()) {
            return true;
        }
        h5z0.a.a("Can not select format " + format.getWidth() + 'x' + format.getHeight() + " for surface " + this.surfaceSizeHolder.getCappingWidth() + 'x' + this.surfaceSizeHolder.getCappingHeight(), new Object[0]);
        return false;
    }

    private final OptimalVideoFormatSelectorAnalyticsData createAnalyticsData(long bandwidth, List<VideoMetadata> input, VideoMetadata output) {
        Integer lastUserSelectedVideoHeightPx;
        int cappingWidth = this.surfaceSizeHolder.getCappingWidth();
        int cappingHeight = this.surfaceSizeHolder.getCappingHeight();
        int surfaceWidth$video_player_internalRelease = this.surfaceSizeHolder.getSurfaceWidth$video_player_internalRelease();
        int surfaceHeight$video_player_internalRelease = this.surfaceSizeHolder.getSurfaceHeight$video_player_internalRelease();
        Integer num = this.serviceQuality;
        int i = -1;
        int intValue = num != null ? num.intValue() : -1;
        UserQualityRepository userQualityRepository = this.userQualityRepository;
        if (userQualityRepository != null && (lastUserSelectedVideoHeightPx = userQualityRepository.getLastUserSelectedVideoHeightPx()) != null) {
            i = lastUserSelectedVideoHeightPx.intValue();
        }
        int i2 = i;
        AesthetePreferenceProvider aesthetePreferenceProvider = this.aesthetePreferenceProvider;
        boolean preferHD = aesthetePreferenceProvider != null ? aesthetePreferenceProvider.getPreferHD() : false;
        List<String> list = this.whiteListFormatExtensions;
        List<VideoMetadata> list2 = input;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(OptimalVideoFormatSelectorAnalyticsDataKt.toVideoMetadataAnalytics((VideoMetadata) it.next()));
        }
        return new OptimalVideoFormatSelectorAnalyticsData(bandwidth, cappingWidth, cappingHeight, surfaceWidth$video_player_internalRelease, surfaceHeight$video_player_internalRelease, intValue, i2, preferHD, list, arrayList, OptimalVideoFormatSelectorAnalyticsDataKt.toVideoMetadataAnalytics(output));
    }

    private final VideoMetadataInternal findStreamingFormatVideo(List<VideoMetadataInternal> videosMetadata) {
        VideoMetadataInternal videoMetadataInternal = null;
        for (VideoMetadataInternal videoMetadataInternal2 : videosMetadata) {
            kwu uri = videoMetadataInternal2.getUri();
            String str = uri != null ? (String) a.Z(uri.f) : null;
            if (str != null && cvu0.s(str, "mpd", false)) {
                return videoMetadataInternal2;
            }
            if (str != null && cvu0.s(str, "m3u8", false)) {
                videoMetadataInternal = videoMetadataInternal2;
            }
        }
        return videoMetadataInternal;
    }

    private final long getAllocatedBandwidth() {
        return (long) (this.bandwidthMeter.getBitrateEstimate() * 0.7f);
    }

    private final void initEventTracker() {
        Context context = this.context;
        if (this.eventTracker != null || context == null) {
            return;
        }
        this.eventTracker = DefaultOptimalVideoFormatSelectorFactory.INSTANCE.createEventTracker$video_player_internalRelease(new InfoProviderImpl(context), this.abConfig.getTestIds(), this.from);
    }

    private final boolean isInWhiteList(VideoMetadataInternal videoMetadataInternal) {
        boolean z;
        String str;
        Iterator<T> it = this.whiteListFormatExtensions.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            kwu uri = videoMetadataInternal.getUri();
            if (uri != null && (str = (String) a.Z(uri.f)) != null) {
                z = true;
                if (cvu0.s(str, str2, false)) {
                    break;
                }
            }
        }
        return z;
    }

    private final VideoMetadataInternal toVideoMetadataInternal(VideoMetadata videoMetadata) {
        String uri = videoMetadata.getUri();
        kwu kwuVar = null;
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, uri);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
        }
        return new VideoMetadataInternal(kwuVar, videoMetadata.getFormat());
    }

    private final void updateSurfaceSizeHolder() {
        Integer lastUserSelectedVideoHeightPx;
        Integer num = this.serviceQuality;
        if (num != null) {
            this.surfaceSizeHolder.setServiceQuality(num.intValue());
        }
        UserQualityRepository userQualityRepository = this.userQualityRepository;
        if (userQualityRepository != null && (lastUserSelectedVideoHeightPx = userQualityRepository.getLastUserSelectedVideoHeightPx()) != null) {
            this.surfaceSizeHolder.setUserQuality(Integer.valueOf(lastUserSelectedVideoHeightPx.intValue()));
        }
        AesthetePreferenceProvider aesthetePreferenceProvider = this.aesthetePreferenceProvider;
        if (aesthetePreferenceProvider != null) {
            this.surfaceSizeHolder.setPreferHD(aesthetePreferenceProvider.getPreferHD());
        }
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelector
    public void experimentalShouldConsiderSelectedUserQuality(boolean value) {
        this.surfaceSizeHolder = SurfaceSizeHolderInternal.copy$default(this.surfaceSizeHolder, 0, 0, value, 3, null);
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelector
    public VideoMetadata getOptimalVideoFormat(List<VideoMetadata> videosMetadata) throws OptimalVideoFormatSelectorException {
        updateSurfaceSizeHolder();
        List<VideoMetadata> list = videosMetadata;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toVideoMetadataInternal((VideoMetadata) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (isInWhiteList((VideoMetadataInternal) next)) {
                arrayList2.add(next);
            }
        }
        VideoMetadataInternal findStreamingFormatVideo = findStreamingFormatVideo(arrayList2);
        if (findStreamingFormatVideo != null) {
            h5z0.a.a("Streaming type video selected: " + findStreamingFormatVideo, new Object[0]);
            VideoMetadata videoMetadata = findStreamingFormatVideo.toVideoMetadata();
            OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker = this.eventTracker;
            if (optimalVideoFormatSelectorEventTracker != null) {
                optimalVideoFormatSelectorEventTracker.onSelectionFinished(createAnalyticsData(-1L, videosMetadata, videoMetadata), this.vsid);
            }
            return videoMetadata;
        }
        long allocatedBandwidth = getAllocatedBandwidth();
        List x0 = a.x0(arrayList2, optimalVideoFormatComparator);
        VideoMetadataInternal videoMetadataInternal = (VideoMetadataInternal) a.R(x0);
        if (videoMetadataInternal == null) {
            OptimalVideoFormatSelectorException.FormatWasNotFound formatWasNotFound = new OptimalVideoFormatSelectorException.FormatWasNotFound(new IllegalArgumentException(), OPTIMAL_FORMAT_WAS_NOT_FOUND_EXCEPTION_TEXT);
            OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker2 = this.eventTracker;
            if (optimalVideoFormatSelectorEventTracker2 == null) {
                throw formatWasNotFound;
            }
            optimalVideoFormatSelectorEventTracker2.onSelectionError(formatWasNotFound, this.vsid);
            throw formatWasNotFound;
        }
        int size = x0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (canSelectFormat((VideoMetadataInternal) x0.get(i), allocatedBandwidth)) {
                videoMetadataInternal = (VideoMetadataInternal) x0.get(i);
                break;
            }
            videoMetadataInternal = (VideoMetadataInternal) x0.get(i);
            if (i == scc.f(x0)) {
                h5z0.a.a("The optimal video format was not found", new Object[0]);
            }
            i++;
        }
        h5z0.a.a("Not streaming type video selected: " + videoMetadataInternal + ", effective user bitrate: " + allocatedBandwidth + ", SurfaceSize(width=" + this.surfaceSizeHolder.getCappingWidth() + ", height=" + this.surfaceSizeHolder.getCappingHeight() + ')', new Object[0]);
        VideoMetadata videoMetadata2 = videoMetadataInternal.toVideoMetadata();
        OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker3 = this.eventTracker;
        if (optimalVideoFormatSelectorEventTracker3 != null) {
            optimalVideoFormatSelectorEventTracker3.onSelectionFinished(createAnalyticsData(allocatedBandwidth, videosMetadata, videoMetadata2), this.vsid);
        }
        return videoMetadata2;
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelector
    @jxi
    public void setContext(Context context) {
        this.context = context;
        SharedPreferences provideYandexPlayerSharedPreferences$video_player_internalRelease = InternalDiUtil.INSTANCE.provideYandexPlayerSharedPreferences$video_player_internalRelease(context);
        this.userQualityRepository = new UserQualityRepositoryImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease);
        this.aesthetePreferenceProvider = new AesthetePreferenceProviderImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease);
        AbFlags flags = this.abConfig.getFlags();
        if (flags.getUseMultiplatformBandwidthEstimator()) {
            this.bandwidthMeter = DefaultOptimalVideoFormatSelectorFactory.INSTANCE.createMultiplatformBandwidthMeter$video_player_internalRelease(context, flags.getUseMultiplatformBandwidthEstimatorWithPlatformSync());
        }
        if (this.from != null) {
            initEventTracker();
        }
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelector
    public void setServiceQuality(int serviceQuality) {
        this.serviceQuality = Integer.valueOf(serviceQuality);
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelector
    public void setSurfaceSize(SurfaceSize surfaceSize) {
        this.surfaceSizeHolder.setSize(surfaceSize.getWidth(), surfaceSize.getHeight());
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelector
    public void setWhiteListFormatExtensions(List<String> whiteListFormatExtensions) {
        this.whiteListFormatExtensions = whiteListFormatExtensions;
    }

    public /* synthetic */ OptimalVideoFormatSelectorImpl(ip4 ip4Var, String str, AbConfig abConfig, Context context, String str2, UserQualityRepository userQualityRepository, AesthetePreferenceProvider aesthetePreferenceProvider, OptimalVideoFormatSelectorEventTracker optimalVideoFormatSelectorEventTracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ip4Var, str, abConfig, (i & 8) != 0 ? null : context, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : userQualityRepository, (i & 64) != 0 ? null : aesthetePreferenceProvider, (i & 128) != 0 ? null : optimalVideoFormatSelectorEventTracker);
    }
}
