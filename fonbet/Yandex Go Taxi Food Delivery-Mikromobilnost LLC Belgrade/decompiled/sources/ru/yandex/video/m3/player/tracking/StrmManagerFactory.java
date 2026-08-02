package ru.yandex.video.m3.player.tracking;

import defpackage.bvu0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.sls;
import defpackage.unr0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.playback.features.DisplayInfo;
import ru.yandex.video.m3.playback.features.PlaybackFeaturesKt;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.tracking.AdaptiveStrmManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.DecoderProvider;
import ru.yandex.video.m3.player.impl.tracking.FullscreenInfoProviderImpl;
import ru.yandex.video.m3.player.impl.tracking.OfflineStrmManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProvider;
import ru.yandex.video.m3.player.impl.tracking.SystemMediaVolumeProviderImpl;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventNameProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.LoggingFilter;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider;
import ru.yandex.video.m3.player.impl.tracking.pip.PictureInPictureStateObserverImpl;
import ru.yandex.video.m3.player.impl.tracking.utils.DefaultManifestUrlInflater;
import ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater;
import ru.yandex.video.m3.player.impl.tracking.utils.SimpleManifestInflater;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.impl.utils.battery.BatteryStateObserverImpl;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.drm.DrmTypeSupplier;
import ru.yandex.video.m3.player.report.builder.ReportBuilder;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.tracking.config.DisabledStrmManagerConfig;
import ru.yandex.video.m3.player.tracking.config.StrmManagerConfig;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/tracking/StrmManagerFactory;", "", "<init>", "()V", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/player/tracking/StrmManagerFactory$Parameters;", "parameters", "Lru/yandex/video/m3/player/tracking/StrmManager;", "createInternal", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;Lru/yandex/video/m3/player/tracking/StrmManagerFactory$Parameters;)Lru/yandex/video/m3/player/tracking/StrmManager;", "Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;", "create$video_player_internalRelease", "(Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;Lru/yandex/video/m3/player/tracking/StrmManagerFactory$Parameters;)Lru/yandex/video/m3/player/tracking/StrmManager;", "create", "", "", "", "toIntTestIds", "(Ljava/util/List;)Ljava/util/List;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "defaultJsonConverter$delegate", "Li3y;", "getDefaultJsonConverter", "()Lru/yandex/video/m3/player/utils/JsonConverter;", "defaultJsonConverter", "Parameters", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmManagerFactory {
    public static final int $stable = 8;

    /* renamed from: defaultJsonConverter$delegate, reason: from kotlin metadata */
    private final i3y defaultJsonConverter = a.a(new sls() { // from class: ru.yandex.video.m3.player.tracking.StrmManagerFactory$defaultJsonConverter$2
        @Override // defpackage.sls
        public final JsonConverterImpl invoke() {
            return new JsonConverterImpl();
        }
    });

    private final StrmManager createInternal(DefaultStrmManagerConfig config, Parameters parameters) {
        InfoProviderImpl infoProviderImpl = new InfoProviderImpl(config.getContext());
        OkHttpClient okHttpClient = config.getOkHttpClient();
        Executor executorService = config.getExecutorService();
        JsonConverter jsonConverter = config.getAdditionalFeatures().getJsonConverter();
        if (jsonConverter == null) {
            jsonConverter = getDefaultJsonConverter();
        }
        StrmTrackingApi strmTrackingApi = new StrmTrackingApi(okHttpClient, executorService, jsonConverter, infoProviderImpl, config.getAdditionalFeatures().getPlayerLogger(), config.getAdditionalFeatures().getStrmTrackingUrlParams());
        BatteryStateObserverImpl batteryStateObserverImpl = config.getAdditionalFeatures().getShouldUseBatteryObserver() ? new BatteryStateObserverImpl(config.getContext()) : null;
        PictureInPictureStateObserverImpl pictureInPictureStateObserverImpl = new PictureInPictureStateObserverImpl(config.getContext());
        FullscreenInfoProviderImpl fullscreenInfoProviderImpl = new FullscreenInfoProviderImpl(config.getContext(), null, 2, null);
        NetworkTypeProvider companion = NetworkTypeProviderImpl.INSTANCE.getInstance(config.getContext());
        Set<DisplayInfo> displayInfos = PlaybackFeaturesKt.getDisplayInfos(config.getContext());
        SystemMediaVolumeProvider buildFromContext = SystemMediaVolumeProviderImpl.INSTANCE.buildFromContext(config.getContext(), Integer.valueOf(parameters.getPlayerIndex()));
        ManifestUrlInflater simpleManifestInflater = parameters.getUseSimpleManifestUrlInflater() ? new SimpleManifestInflater(infoProviderImpl, config.getProviders().getTimeProvider(), false, 4, null) : new DefaultManifestUrlInflater(infoProviderImpl, config.getAdditionalFeatures().getPlayerLogger(), config.getProviders().getTimeProvider(), parameters.getAbConfig(), config.getPlaylistRequestConfiguration().getRequestSecondaryVideoTracks(), config.getPlaylistRequestConfiguration().getEnableLowLatency(), false, config.getPlaylistRequestConfiguration().getLoadPreviewsInDashPlaylistIfApplicable());
        EventNameProvider eventNameProvider = config.getProviders().getEventNameProvider();
        EventTypeProvider eventTypeProvider = config.getProviders().getEventTypeProvider();
        ErrorCodeProvider errorCodeProvider = config.getProviders().getErrorCodeProvider();
        ErrorCategoryProvider errorCategoryProvider = config.getProviders().getErrorCategoryProvider();
        LoggingFilter loggingFilter = config.getProviders().getLoggingFilter();
        TimeProvider timeProvider = config.getProviders().getTimeProvider();
        AccountProvider accountProvider = config.getProviders().getAccountProvider();
        DeviceInfoProvider deviceInfoProvider = config.getProviders().getDeviceInfoProvider();
        List<String> testIds = config.getTestIds();
        List<Integer> intTestIds = toIntTestIds(config.getTestIds());
        String service = config.getAdditionalFeatures().getService();
        String from = config.getFrom();
        Map<String, Object> additionalParameters = config.getAdditionalParameters();
        ScheduledExecutorService scheduledExecutorService = config.getScheduledExecutorService();
        JsonConverter jsonConverter2 = config.getAdditionalFeatures().getJsonConverter();
        if (jsonConverter2 == null) {
            jsonConverter2 = getDefaultJsonConverter();
        }
        return new StrmManagerImpl(eventNameProvider, eventTypeProvider, errorCodeProvider, errorCategoryProvider, loggingFilter, buildFromContext, timeProvider, infoProviderImpl, accountProvider, deviceInfoProvider, displayInfos, testIds, intTestIds, service, from, additionalParameters, strmTrackingApi, scheduledExecutorService, jsonConverter2, companion, config.getProviders().getLiveSpeedControlInfoProvider(), batteryStateObserverImpl, fullscreenInfoProviderImpl, pictureInPictureStateObserverImpl, config.getAdditionalFeatures().getOptimizeTelemetry(), parameters.getDrmTypeSupplier(), parameters.getReportBuilder(), parameters.getDecoderProviderConsumer(), parameters.getEventIndexGenerator(), parameters.getAbConfig(), config.getAdditionalFeatures().getPlayerLogger(), simpleManifestInflater, parameters.getShouldReleaseScheduledExecutorService());
    }

    private final JsonConverter getDefaultJsonConverter() {
        return (JsonConverter) this.defaultJsonConverter.getValue();
    }

    public final StrmManager create$video_player_internalRelease(StrmManagerConfig config, Parameters parameters) {
        if (config instanceof DisabledStrmManagerConfig) {
            return new OfflineStrmManagerImpl();
        }
        if (config instanceof DefaultStrmManagerConfig) {
            return new AdaptiveStrmManagerImpl(createInternal((DefaultStrmManagerConfig) config, parameters), new OfflineStrmManagerImpl());
        }
        w511.b();
        return null;
    }

    public final List<Integer> toIntTestIds(List<String> list) {
        List W;
        if (list.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            W = evu0.W((String) it.next(), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            String str = (String) kotlin.collections.a.R(W);
            Integer l = str != null ? bvu0.l(10, str) : null;
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Je\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u00060"}, d2 = {"Lru/yandex/video/m3/player/tracking/StrmManagerFactory$Parameters;", "", "drmTypeSupplier", "Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;", "reportBuilder", "Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "decoderProviderConsumer", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;", "abConfig", "Lru/yandex/video/m3/ab/config/AbConfig;", "playerIndex", "", "eventIndexGenerator", "Lru/yandex/video/m3/player/IndexGenerator;", "useSimpleManifestUrlInflater", "", "shouldReleaseScheduledExecutorService", "(Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;Lru/yandex/video/m3/player/report/builder/ReportBuilder;Lru/yandex/video/m3/player/provider/Consumer;Lru/yandex/video/m3/ab/config/AbConfig;ILru/yandex/video/m3/player/IndexGenerator;ZZ)V", "getAbConfig", "()Lru/yandex/video/m3/ab/config/AbConfig;", "getDecoderProviderConsumer", "()Lru/yandex/video/m3/player/provider/Consumer;", "getDrmTypeSupplier", "()Lru/yandex/video/m3/player/provider/drm/DrmTypeSupplier;", "getEventIndexGenerator", "()Lru/yandex/video/m3/player/IndexGenerator;", "getPlayerIndex", "()I", "getReportBuilder", "()Lru/yandex/video/m3/player/report/builder/ReportBuilder;", "getShouldReleaseScheduledExecutorService", "()Z", "getUseSimpleManifestUrlInflater", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Parameters {
        public static final int $stable = 8;
        private final AbConfig abConfig;
        private final Consumer<DecoderProvider> decoderProviderConsumer;
        private final DrmTypeSupplier drmTypeSupplier;
        private final IndexGenerator eventIndexGenerator;
        private final int playerIndex;
        private final ReportBuilder reportBuilder;
        private final boolean shouldReleaseScheduledExecutorService;
        private final boolean useSimpleManifestUrlInflater;

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Parameters(ru.yandex.video.m3.player.provider.drm.DrmTypeSupplier r12, ru.yandex.video.m3.player.report.builder.ReportBuilder r13, ru.yandex.video.m3.player.provider.Consumer r14, ru.yandex.video.m3.ab.config.AbConfig r15, int r16, ru.yandex.video.m3.player.IndexGenerator r17, boolean r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r11 = this;
                r0 = r20
                r1 = r0 & 32
                if (r1 == 0) goto Ld
                ru.yandex.video.m3.player.SimpleIndexGenerator r1 = new ru.yandex.video.m3.player.SimpleIndexGenerator
                r1.<init>()
                r8 = r1
                goto Lf
            Ld:
                r8 = r17
            Lf:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L16
                r9 = r2
                goto L18
            L16:
                r9 = r18
            L18:
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L25
                r10 = r2
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                r2 = r11
                goto L2e
            L25:
                r10 = r19
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
            L2e:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.yandex.video.m3.player.tracking.StrmManagerFactory.Parameters.<init>(ru.yandex.video.m3.player.provider.drm.DrmTypeSupplier, ru.yandex.video.m3.player.report.builder.ReportBuilder, ru.yandex.video.m3.player.provider.Consumer, ru.yandex.video.m3.ab.config.AbConfig, int, ru.yandex.video.m3.player.IndexGenerator, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, DrmTypeSupplier drmTypeSupplier, ReportBuilder reportBuilder, Consumer consumer, AbConfig abConfig, int i, IndexGenerator indexGenerator, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                drmTypeSupplier = parameters.drmTypeSupplier;
            }
            if ((i2 & 2) != 0) {
                reportBuilder = parameters.reportBuilder;
            }
            if ((i2 & 4) != 0) {
                consumer = parameters.decoderProviderConsumer;
            }
            if ((i2 & 8) != 0) {
                abConfig = parameters.abConfig;
            }
            if ((i2 & 16) != 0) {
                i = parameters.playerIndex;
            }
            if ((i2 & 32) != 0) {
                indexGenerator = parameters.eventIndexGenerator;
            }
            if ((i2 & 64) != 0) {
                z = parameters.useSimpleManifestUrlInflater;
            }
            if ((i2 & 128) != 0) {
                z2 = parameters.shouldReleaseScheduledExecutorService;
            }
            boolean z3 = z;
            boolean z4 = z2;
            int i3 = i;
            IndexGenerator indexGenerator2 = indexGenerator;
            return parameters.copy(drmTypeSupplier, reportBuilder, consumer, abConfig, i3, indexGenerator2, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final DrmTypeSupplier getDrmTypeSupplier() {
            return this.drmTypeSupplier;
        }

        /* renamed from: component2, reason: from getter */
        public final ReportBuilder getReportBuilder() {
            return this.reportBuilder;
        }

        public final Consumer<DecoderProvider> component3() {
            return this.decoderProviderConsumer;
        }

        /* renamed from: component4, reason: from getter */
        public final AbConfig getAbConfig() {
            return this.abConfig;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPlayerIndex() {
            return this.playerIndex;
        }

        /* renamed from: component6, reason: from getter */
        public final IndexGenerator getEventIndexGenerator() {
            return this.eventIndexGenerator;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getUseSimpleManifestUrlInflater() {
            return this.useSimpleManifestUrlInflater;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShouldReleaseScheduledExecutorService() {
            return this.shouldReleaseScheduledExecutorService;
        }

        public final Parameters copy(DrmTypeSupplier drmTypeSupplier, ReportBuilder reportBuilder, Consumer<DecoderProvider> decoderProviderConsumer, AbConfig abConfig, int playerIndex, IndexGenerator eventIndexGenerator, boolean useSimpleManifestUrlInflater, boolean shouldReleaseScheduledExecutorService) {
            return new Parameters(drmTypeSupplier, reportBuilder, decoderProviderConsumer, abConfig, playerIndex, eventIndexGenerator, useSimpleManifestUrlInflater, shouldReleaseScheduledExecutorService);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameters)) {
                return false;
            }
            Parameters parameters = (Parameters) other;
            return jl40.l(this.drmTypeSupplier, parameters.drmTypeSupplier) && jl40.l(this.reportBuilder, parameters.reportBuilder) && jl40.l(this.decoderProviderConsumer, parameters.decoderProviderConsumer) && jl40.l(this.abConfig, parameters.abConfig) && this.playerIndex == parameters.playerIndex && jl40.l(this.eventIndexGenerator, parameters.eventIndexGenerator) && this.useSimpleManifestUrlInflater == parameters.useSimpleManifestUrlInflater && this.shouldReleaseScheduledExecutorService == parameters.shouldReleaseScheduledExecutorService;
        }

        public final AbConfig getAbConfig() {
            return this.abConfig;
        }

        public final Consumer<DecoderProvider> getDecoderProviderConsumer() {
            return this.decoderProviderConsumer;
        }

        public final DrmTypeSupplier getDrmTypeSupplier() {
            return this.drmTypeSupplier;
        }

        public final IndexGenerator getEventIndexGenerator() {
            return this.eventIndexGenerator;
        }

        public final int getPlayerIndex() {
            return this.playerIndex;
        }

        public final ReportBuilder getReportBuilder() {
            return this.reportBuilder;
        }

        public final boolean getShouldReleaseScheduledExecutorService() {
            return this.shouldReleaseScheduledExecutorService;
        }

        public final boolean getUseSimpleManifestUrlInflater() {
            return this.useSimpleManifestUrlInflater;
        }

        public int hashCode() {
            DrmTypeSupplier drmTypeSupplier = this.drmTypeSupplier;
            int hashCode = (drmTypeSupplier == null ? 0 : drmTypeSupplier.hashCode()) * 31;
            ReportBuilder reportBuilder = this.reportBuilder;
            int hashCode2 = (hashCode + (reportBuilder == null ? 0 : reportBuilder.hashCode())) * 31;
            Consumer<DecoderProvider> consumer = this.decoderProviderConsumer;
            return Boolean.hashCode(this.shouldReleaseScheduledExecutorService) + unr0.e((this.eventIndexGenerator.hashCode() + oyr.b(this.playerIndex, (this.abConfig.hashCode() + ((hashCode2 + (consumer != null ? consumer.hashCode() : 0)) * 31)) * 31, 31)) * 31, 31, this.useSimpleManifestUrlInflater);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Parameters(drmTypeSupplier=");
            sb.append(this.drmTypeSupplier);
            sb.append(", reportBuilder=");
            sb.append(this.reportBuilder);
            sb.append(", decoderProviderConsumer=");
            sb.append(this.decoderProviderConsumer);
            sb.append(", abConfig=");
            sb.append(this.abConfig);
            sb.append(", playerIndex=");
            sb.append(this.playerIndex);
            sb.append(", eventIndexGenerator=");
            sb.append(this.eventIndexGenerator);
            sb.append(", useSimpleManifestUrlInflater=");
            sb.append(this.useSimpleManifestUrlInflater);
            sb.append(", shouldReleaseScheduledExecutorService=");
            return unr0.u(sb, this.shouldReleaseScheduledExecutorService, ')');
        }

        public Parameters(DrmTypeSupplier drmTypeSupplier, ReportBuilder reportBuilder, Consumer<DecoderProvider> consumer, AbConfig abConfig, int i, IndexGenerator indexGenerator, boolean z, boolean z2) {
            this.drmTypeSupplier = drmTypeSupplier;
            this.reportBuilder = reportBuilder;
            this.decoderProviderConsumer = consumer;
            this.abConfig = abConfig;
            this.playerIndex = i;
            this.eventIndexGenerator = indexGenerator;
            this.useSimpleManifestUrlInflater = z;
            this.shouldReleaseScheduledExecutorService = z2;
        }
    }
}
