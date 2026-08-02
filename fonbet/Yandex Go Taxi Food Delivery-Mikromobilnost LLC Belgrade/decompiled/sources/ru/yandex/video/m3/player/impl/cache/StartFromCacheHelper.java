package ru.yandex.video.m3.player.impl.cache;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import defpackage.ah3;
import defpackage.b1u0;
import defpackage.b64;
import defpackage.cj01;
import defpackage.do31;
import defpackage.fe10;
import defpackage.gvu0;
import defpackage.h42;
import defpackage.h5z0;
import defpackage.he10;
import defpackage.i42;
import defpackage.jl40;
import defpackage.kpg;
import defpackage.kyg;
import defpackage.lxc0;
import defpackage.npg;
import defpackage.qyg;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ue3;
import defpackage.uwy;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.YandexCacheKeyFactory;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.StartFromCacheInfoKt;
import ru.yandex.video.m3.player.MediaSourceListener;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.AnalyticsListenerProxy;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002bcB\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001fJ!\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020!*\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020!*\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010%J%\u0010)\u001a\u0004\u0018\u00010\u00192\b\u0010'\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020!*\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000f¢\u0006\u0004\b.\u0010\u0014J\r\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020!H\u0016¢\u0006\u0004\b4\u00105J'\u0010;\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020+H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010BJ'\u0010C\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bC\u0010BJ'\u0010D\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020?2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010BJ/\u0010F\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020+0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020Y0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020Y0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010XR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006d"}, d2 = {"Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper;", "Lru/yandex/video/m3/player/impl/AnalyticsListenerProxy;", "Lcj01;", "Lru/yandex/video/m3/player/MediaSourceListener;", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observerDispatcher", "Landroid/os/Looper;", "exoThreadLooper", "<init>", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Landroid/os/Looper;)V", "Lnpg;", "dataSpec", "", "isNetwork", "Lzy11;", StartFromCacheHelper.PROCESS_TRANSFER_END, "(Lnpg;Z)V", StartFromCacheHelper.PROCESS_TRANSFER_INITIALIZING, "clearMaps", "()V", "shouldStopWatching", "()Z", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "", "getMinMediaFromNetworkStartPositionMs", "(I)J", "getMaxMediaFromCachePositionMs", "newValue", "updateMinMediaFromNetworkStartPositionMs", "(IJ)V", "updateMaxMediaFromCachePositionMs", "", "getPathFromDataSpec", "(Lnpg;Z)Ljava/lang/String;", "toDataType", "(I)Ljava/lang/String;", "toTrackType", "a", "b", "nullableMin", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "Lhe10;", "print", "(Lhe10;)Ljava/lang/String;", "reset", "Lru/yandex/video/m3/data/StartFromCacheInfo;", StartFromCacheHelper.GET_START_FROM_CACHE_INFO, "()Lru/yandex/video/m3/data/StartFromCacheInfo;", "oldVsid", "newVsid", "onVsidChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "Lh42;", "eventTime", "Luwy;", "loadEventInfo", "mediaLoadData", StartFromCacheHelper.ON_LOAD_STARTED, "(Lh42;Luwy;Lhe10;)V", "onPlayerReleased", "(Lh42;)V", "Lkpg;", "source", "onTransferInitializing", "(Lkpg;Lnpg;Z)V", "onTransferStart", "onTransferEnd", "bytesTransferred", "onBytesTransferred", "(Lkpg;Lnpg;ZI)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Landroid/os/Looper;", "isManifestFromCache", "Ljava/lang/Boolean;", "Lru/yandex/video/m3/YandexCacheKeyFactory;", "defaultCacheKeyFactory", "Lru/yandex/video/m3/YandexCacheKeyFactory;", "minVideoFromNetworkPositionMs", "Ljava/lang/Long;", "minAudioFromNetworkPositionMs", "maxVideoFromCachePositionMs", "maxAudioFromCachePositionMs", "preloaderVsid", "Ljava/lang/String;", "", "startLoadInfoMap", "Ljava/util/Map;", "Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper$PendingTransfer;", "pendingTransferInitializingMap", "pendingTransferEndMap", "Landroid/os/Handler;", "currentExoThreadHandler", "Landroid/os/Handler;", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "logger", "Lru/yandex/video/m3/player/utils/TimberPlayerLogger;", "Companion", "PendingTransfer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartFromCacheHelper extends AnalyticsListenerProxy implements cj01, MediaSourceListener {
    private static final String GET_START_FROM_CACHE_INFO = "getStartFromCacheInfo";
    private static final String ON_LOAD_STARTED = "onLoadStarted";
    private static final String PROCESS_TRANSFER_END = "processTransferEnd";
    private static final String PROCESS_TRANSFER_INITIALIZING = "processTransferInitializing";
    private static final String TAG = "StartFromCacheHelper";
    private final Handler currentExoThreadHandler;
    private final Looper exoThreadLooper;
    private Boolean isManifestFromCache;
    private Long maxAudioFromCachePositionMs;
    private Long maxVideoFromCachePositionMs;
    private Long minAudioFromNetworkPositionMs;
    private Long minVideoFromNetworkPositionMs;
    private final ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher;
    private String preloaderVsid;
    public static final int $stable = 8;
    private final YandexCacheKeyFactory defaultCacheKeyFactory = new YandexCacheKeyFactory(true, true, true);
    private final Map<String, he10> startLoadInfoMap = new LinkedHashMap();
    private final Map<String, PendingTransfer> pendingTransferInitializingMap = new LinkedHashMap();
    private final Map<String, PendingTransfer> pendingTransferEndMap = new LinkedHashMap();
    private final TimberPlayerLogger logger = new TimberPlayerLogger();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper$PendingTransfer;", "", "", "isNetwork", "Lnpg;", "dataSpec", "<init>", "(ZLnpg;)V", "component1", "()Z", "component2", "()Lnpg;", "copy", "(ZLnpg;)Lru/yandex/video/m3/player/impl/cache/StartFromCacheHelper$PendingTransfer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lnpg;", "getDataSpec", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PendingTransfer {
        private final npg dataSpec;
        private final boolean isNetwork;

        public PendingTransfer(boolean z, npg npgVar) {
            this.isNetwork = z;
            this.dataSpec = npgVar;
        }

        public static /* synthetic */ PendingTransfer copy$default(PendingTransfer pendingTransfer, boolean z, npg npgVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pendingTransfer.isNetwork;
            }
            if ((i & 2) != 0) {
                npgVar = pendingTransfer.dataSpec;
            }
            return pendingTransfer.copy(z, npgVar);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsNetwork() {
            return this.isNetwork;
        }

        /* renamed from: component2, reason: from getter */
        public final npg getDataSpec() {
            return this.dataSpec;
        }

        public final PendingTransfer copy(boolean isNetwork, npg dataSpec) {
            return new PendingTransfer(isNetwork, dataSpec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingTransfer)) {
                return false;
            }
            PendingTransfer pendingTransfer = (PendingTransfer) other;
            return this.isNetwork == pendingTransfer.isNetwork && jl40.l(this.dataSpec, pendingTransfer.dataSpec);
        }

        public final npg getDataSpec() {
            return this.dataSpec;
        }

        public int hashCode() {
            return this.dataSpec.hashCode() + (Boolean.hashCode(this.isNetwork) * 31);
        }

        public final boolean isNetwork() {
            return this.isNetwork;
        }

        public String toString() {
            return "PendingTransfer(isNetwork=" + this.isNetwork + ", dataSpec=" + this.dataSpec + ')';
        }
    }

    public StartFromCacheHelper(ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher, Looper looper) {
        this.observerDispatcher = observerDispatcher;
        this.exoThreadLooper = looper;
        this.currentExoThreadHandler = new Handler(looper);
    }

    private final void clearMaps() {
        this.startLoadInfoMap.clear();
        this.pendingTransferInitializingMap.clear();
        this.pendingTransferEndMap.clear();
    }

    private final long getMaxMediaFromCachePositionMs(int trackType) {
        Long l;
        if (trackType != 1) {
            l = this.maxVideoFromCachePositionMs;
            if (trackType != 2) {
                l = nullableMin(l, this.maxAudioFromCachePositionMs);
            }
        } else {
            l = this.maxAudioFromCachePositionMs;
        }
        if (l != null) {
            return l.longValue();
        }
        return Long.MIN_VALUE;
    }

    private final long getMinMediaFromNetworkStartPositionMs(int trackType) {
        Long l;
        if (trackType != 1) {
            l = this.minVideoFromNetworkPositionMs;
            if (trackType != 2) {
                l = nullableMin(l, this.minAudioFromNetworkPositionMs);
            }
        } else {
            l = this.minAudioFromNetworkPositionMs;
        }
        return l != null ? l.longValue() : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    }

    private final String getPathFromDataSpec(npg dataSpec, boolean isNetwork) {
        try {
            return this.defaultCacheKeyFactory.buildCacheKey(new npg(isNetwork ? dataSpec.a : Uri.parse(dataSpec.h)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Long nullableMin(Long a, Long b) {
        return a == null ? b : (b != null && a.longValue() >= b.longValue()) ? b : a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransferEnd$lambda$10(StartFromCacheHelper startFromCacheHelper, npg npgVar, boolean z) {
        if (startFromCacheHelper.shouldStopWatching()) {
            startFromCacheHelper.clearMaps();
        } else {
            startFromCacheHelper.processTransferEnd(npgVar, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTransferInitializing$lambda$9(StartFromCacheHelper startFromCacheHelper, npg npgVar, boolean z) {
        if (startFromCacheHelper.shouldStopWatching()) {
            startFromCacheHelper.clearMaps();
        } else {
            startFromCacheHelper.processTransferInitializing(npgVar, z);
        }
    }

    private final String print(he10 he10Var) {
        StringBuilder sb = new StringBuilder("MediaLoadData[");
        sb.append(he10Var.f);
        sb.append(LicenseUtility.SEPARATOR);
        sb.append(he10Var.g);
        sb.append("] dataType=");
        sb.append(toDataType(he10Var.a));
        sb.append(" trackType=");
        return b64.p(sb, toTrackType(he10Var.b), HexString.CHAR_SPACE);
    }

    private final void processTransferEnd(npg dataSpec, boolean isNetwork) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, PROCESS_TRANSFER_END, "onTransferEnd", new Object[0]);
        }
        String pathFromDataSpec = getPathFromDataSpec(dataSpec, isNetwork);
        he10 he10Var = this.startLoadInfoMap.get(pathFromDataSpec);
        TimberPlayerLogger timberPlayerLogger2 = this.logger;
        if (pathFromDataSpec == null) {
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, PROCESS_TRANSFER_END, "path is null dataSpec=" + dataSpec, new Object[0]);
                return;
            }
            return;
        }
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
            StringBuilder sb = new StringBuilder("isNetwork=");
            sb.append(isNetwork);
            sb.append(HexString.CHAR_SPACE);
            sb.append(he10Var != null ? print(he10Var) : null);
            sb.append(" l=");
            sb.append(dataSpec.g);
            sb.append(" p=");
            sb.append(dataSpec.f);
            sb.append(HexString.CHAR_SPACE);
            sb.append(gvu0.B0(15, pathFromDataSpec));
            timberPlayerLogger2.debug(TAG, PROCESS_TRANSFER_END, sb.toString(), new Object[0]);
        }
        if (he10Var == null) {
            TimberPlayerLogger timberPlayerLogger3 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger3)) {
                timberPlayerLogger3.debug(TAG, PROCESS_TRANSFER_END, "cant find startMediaLoadInfo by ".concat(gvu0.B0(15, pathFromDataSpec)), new Object[0]);
            }
            this.pendingTransferEndMap.put(pathFromDataSpec, new PendingTransfer(isNetwork, dataSpec));
            return;
        }
        int i = he10Var.b;
        if (isNetwork || he10Var.a != 1) {
            return;
        }
        if (i == 2 || i == 1 || i == 0) {
            long j = he10Var.g;
            if (j <= getMaxMediaFromCachePositionMs(i)) {
                TimberPlayerLogger timberPlayerLogger4 = this.logger;
                if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger4)) {
                    timberPlayerLogger4.debug(TAG, PROCESS_TRANSFER_END, "fromCachePositionMs for %s is %s %s", toTrackType(i), Long.valueOf(j), gvu0.B0(15, pathFromDataSpec));
                    return;
                }
                return;
            }
            updateMaxMediaFromCachePositionMs(i, j);
            TimberPlayerLogger timberPlayerLogger5 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger5)) {
                timberPlayerLogger5.debug(TAG, PROCESS_TRANSFER_END, "updateMaxMediaFromCachePositionMs for %s updated to %s %s", toTrackType(i), Long.valueOf(j), gvu0.B0(15, pathFromDataSpec));
            }
        }
    }

    private final void processTransferInitializing(npg dataSpec, boolean isNetwork) {
        HashSet H0;
        Object failure;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, PROCESS_TRANSFER_INITIALIZING, PROCESS_TRANSFER_INITIALIZING, new Object[0]);
        }
        String pathFromDataSpec = getPathFromDataSpec(dataSpec, isNetwork);
        he10 he10Var = this.startLoadInfoMap.get(pathFromDataSpec);
        TimberPlayerLogger timberPlayerLogger2 = this.logger;
        if (pathFromDataSpec == null) {
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, PROCESS_TRANSFER_INITIALIZING, "path is null dataSpec=" + dataSpec, new Object[0]);
                return;
            }
            return;
        }
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
            StringBuilder sb = new StringBuilder("isNetwork=");
            sb.append(isNetwork);
            sb.append(HexString.CHAR_SPACE);
            sb.append(he10Var != null ? print(he10Var) : null);
            sb.append(HexString.CHAR_SPACE);
            sb.append(gvu0.B0(15, pathFromDataSpec));
            timberPlayerLogger2.debug(TAG, PROCESS_TRANSFER_INITIALIZING, sb.toString(), new Object[0]);
        }
        if (he10Var == null) {
            TimberPlayerLogger timberPlayerLogger3 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger3)) {
                timberPlayerLogger3.debug(TAG, PROCESS_TRANSFER_INITIALIZING, "cant find startMediaLoadInfo by  ".concat(gvu0.B0(15, pathFromDataSpec)), new Object[0]);
            }
            this.pendingTransferInitializingMap.put(pathFromDataSpec, new PendingTransfer(isNetwork, dataSpec));
            return;
        }
        if (this.isManifestFromCache == null && he10Var.a == 1) {
            this.isManifestFromCache = Boolean.TRUE;
            TimberPlayerLogger timberPlayerLogger4 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger4)) {
                timberPlayerLogger4.debug(TAG, PROCESS_TRANSFER_INITIALIZING, "manifest from cache ".concat(gvu0.B0(15, pathFromDataSpec)), new Object[0]);
            }
        }
        if (isNetwork) {
            if (this.isManifestFromCache == null && he10Var.a == 4) {
                this.isManifestFromCache = Boolean.FALSE;
                TimberPlayerLogger timberPlayerLogger5 = this.logger;
                if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger5)) {
                    timberPlayerLogger5.debug(TAG, PROCESS_TRANSFER_INITIALIZING, "manifest from network ".concat(gvu0.B0(15, pathFromDataSpec)), new Object[0]);
                }
            }
            if (he10Var.a == 1) {
                int i = he10Var.b;
                if (i == 2 || i == 1 || i == 0) {
                    float f = (dataSpec.f * 1.0f) / (dataSpec.g + r3);
                    float f2 = ((he10Var.g - r3) * f) + he10Var.f;
                    if (f2 < getMinMediaFromNetworkStartPositionMs(i)) {
                        updateMinMediaFromNetworkStartPositionMs(he10Var.b, (long) f2);
                        TimberPlayerLogger timberPlayerLogger6 = this.logger;
                        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger6)) {
                            timberPlayerLogger6.debug(TAG, PROCESS_TRANSFER_INITIALIZING, "minMediaFromNetworkStartPositionMs for %s updated to %s %s", toTrackType(he10Var.b), Float.valueOf(f2), gvu0.B0(15, pathFromDataSpec));
                        }
                    } else {
                        TimberPlayerLogger timberPlayerLogger7 = this.logger;
                        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger7)) {
                            timberPlayerLogger7.debug(TAG, PROCESS_TRANSFER_INITIALIZING, "fromNetworkStartPositionMs for %s is %s %s", toTrackType(he10Var.b), Float.valueOf(f2), gvu0.B0(15, pathFromDataSpec));
                        }
                    }
                    if (this.minAudioFromNetworkPositionMs == null || this.minVideoFromNetworkPositionMs == null) {
                        return;
                    }
                    ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher = this.observerDispatcher;
                    synchronized (observerDispatcher.getObservers()) {
                        H0 = a.H0(observerDispatcher.getObservers());
                    }
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        try {
                            ((PlayerDelegate.Observer) it.next()).onStartFromCacheInfoReady(getStartFromCacheInfo());
                            failure = zy11.a;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            h5z0.a.f(a, "notifyObservers", new Object[0]);
                        }
                    }
                }
            }
        }
    }

    private final boolean shouldStopWatching() {
        return (this.isManifestFromCache == null || this.minVideoFromNetworkPositionMs == null || this.minAudioFromNetworkPositionMs == null) ? false : true;
    }

    private final String toDataType(int i) {
        return i != 1 ? i != 2 ? i != 4 ? "UNKNOWN" : "MANIFEST" : "MEDIA_INITIALIZATION" : DefaultErrorCategoryProvider.MEDIA;
    }

    private final String toTrackType(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "VIDEO" : "AUDIO" : "DEFAULT";
    }

    private final void updateMaxMediaFromCachePositionMs(int trackType, long newValue) {
        if (trackType == 1) {
            this.maxAudioFromCachePositionMs = Long.valueOf(newValue);
        } else if (trackType == 2) {
            this.maxVideoFromCachePositionMs = Long.valueOf(newValue);
        } else {
            this.maxVideoFromCachePositionMs = Long.valueOf(newValue);
            this.maxAudioFromCachePositionMs = Long.valueOf(newValue);
        }
    }

    private final void updateMinMediaFromNetworkStartPositionMs(int trackType, long newValue) {
        if (trackType == 1) {
            this.minAudioFromNetworkPositionMs = Long.valueOf(newValue);
        } else if (trackType == 2) {
            this.minVideoFromNetworkPositionMs = Long.valueOf(newValue);
        } else {
            this.minVideoFromNetworkPositionMs = Long.valueOf(newValue);
            this.minAudioFromNetworkPositionMs = Long.valueOf(newValue);
        }
    }

    public final StartFromCacheInfo getStartFromCacheInfo() {
        Long l;
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, GET_START_FROM_CACHE_INFO, "minVideoFromNetworkPositionMs=" + this.minVideoFromNetworkPositionMs + " maxVideoFromCachePositionMs=" + this.maxVideoFromCachePositionMs, new Object[0]);
            timberPlayerLogger.debug(TAG, GET_START_FROM_CACHE_INFO, "minAudioFromNetworkPositionMs=" + this.minAudioFromNetworkPositionMs + " maxAudioFromCachePositionMs=" + this.maxAudioFromCachePositionMs, new Object[0]);
        }
        Long l2 = this.maxVideoFromCachePositionMs;
        Long l3 = null;
        if (l2 != null) {
            Long l4 = this.minVideoFromNetworkPositionMs;
            l = l4 == null ? l2 : l4;
        } else {
            l = null;
        }
        Long l5 = this.maxAudioFromCachePositionMs;
        StartFromCacheInfo StartFromCacheInfo$default = StartFromCacheInfoKt.StartFromCacheInfo$default(this.preloaderVsid, this.isManifestFromCache, l, (l5 == null || (l3 = this.minAudioFromNetworkPositionMs) != null) ? l3 : l5, null, 16, null);
        TimberPlayerLogger timberPlayerLogger2 = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
            timberPlayerLogger2.debug(TAG, GET_START_FROM_CACHE_INFO, "StartFromCacheInfo=" + StartFromCacheInfo$default, new Object[0]);
        }
        return StartFromCacheInfo$default;
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(h42 h42Var, String str) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSinkError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
    }

    @Override // defpackage.cj01
    public void onBytesTransferred(kpg source, npg dataSpec, boolean isNetwork, int bytesTransferred) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, List list) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, rdf rdfVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(h42 h42Var, int i, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, i42 i42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCanceled(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCompleted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onLoadStarted(h42 eventTime, uwy loadEventInfo, he10 mediaLoadData) {
        if (shouldStopWatching()) {
            clearMaps();
            return;
        }
        String pathFromDataSpec = getPathFromDataSpec(loadEventInfo.a, true);
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            StringBuilder sb = new StringBuilder();
            sb.append(print(mediaLoadData));
            sb.append(HexString.CHAR_SPACE);
            sb.append(pathFromDataSpec != null ? gvu0.B0(15, pathFromDataSpec) : null);
            timberPlayerLogger.debug(TAG, ON_LOAD_STARTED, sb.toString(), new Object[0]);
        }
        this.startLoadInfoMap.put(String.valueOf(pathFromDataSpec), mediaLoadData);
        PendingTransfer pendingTransfer = this.pendingTransferInitializingMap.get(pathFromDataSpec);
        if (pendingTransfer != null) {
            TimberPlayerLogger timberPlayerLogger2 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger2)) {
                timberPlayerLogger2.debug(TAG, ON_LOAD_STARTED, "process pending transfer initializing", new Object[0]);
            }
            processTransferInitializing(pendingTransfer.getDataSpec(), pendingTransfer.isNetwork());
        }
        PendingTransfer pendingTransfer2 = this.pendingTransferEndMap.get(pathFromDataSpec);
        if (pendingTransfer2 != null) {
            TimberPlayerLogger timberPlayerLogger3 = this.logger;
            if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger3)) {
                timberPlayerLogger3.debug(TAG, ON_LOAD_STARTED, "process pending transfer end", new Object[0]);
            }
            processTransferEnd(pendingTransfer2.getDataSpec(), pendingTransfer2.isNetwork());
        }
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onMetadata(h42 h42Var, w820 w820Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerError(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(h42 h42Var, androidx.media3.common.PlaybackException playbackException) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public void onPlayerReleased(h42 eventTime) {
        this.currentExoThreadHandler.removeCallbacksAndMessages(null);
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy
    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(h42 h42Var, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(h42 h42Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTimelineChanged(h42 h42Var, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onTracksChanged(h42 h42Var, r801 r801Var) {
    }

    @Override // defpackage.cj01
    public void onTransferEnd(kpg onTransferEnd, npg dataSpec, boolean isNetwork) {
        this.currentExoThreadHandler.post(new b1u0(this, dataSpec, isNetwork, 0));
    }

    @Override // defpackage.cj01
    public void onTransferInitializing(kpg source, npg dataSpec, boolean isNetwork) {
        this.currentExoThreadHandler.post(new b1u0(this, dataSpec, isNetwork, 1));
    }

    @Override // defpackage.cj01
    public void onTransferStart(kpg source, npg dataSpec, boolean isNetwork) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoCodecError(h42 h42Var, Exception exc) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(h42 h42Var, String str) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onVolumeChanged(h42 h42Var, float f) {
    }

    @Override // ru.yandex.video.m3.player.MediaSourceListener
    public void onVsidChanged(String oldVsid, String newVsid) {
        TimberPlayerLogger timberPlayerLogger = this.logger;
        if (PlayerLoggerExtensionsKt.getEnabled(timberPlayerLogger)) {
            timberPlayerLogger.debug(TAG, "onVsidChanged", b64.l("preloaderVsid=", oldVsid, " newVsid = ", newVsid), new Object[0]);
        }
        this.preloaderVsid = oldVsid;
    }

    public final void reset() {
        this.preloaderVsid = null;
        this.isManifestFromCache = null;
        this.minVideoFromNetworkPositionMs = null;
        this.minAudioFromNetworkPositionMs = null;
        this.maxVideoFromCachePositionMs = null;
        this.maxAudioFromCachePositionMs = null;
        clearMaps();
        this.currentExoThreadHandler.removeCallbacksAndMessages(null);
    }

    @Override // ru.yandex.video.m3.player.impl.AnalyticsListenerProxy, defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }
}
