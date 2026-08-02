package ru.yandex.video.m3.player.impl.source.dash;

import com.google.common.collect.ImmutableList;
import defpackage.a70;
import defpackage.bl51;
import defpackage.c8q0;
import defpackage.cgg;
import defpackage.cj01;
import defpackage.dgg;
import defpackage.egg;
import defpackage.evu0;
import defpackage.h5z0;
import defpackage.ic5;
import defpackage.ipg;
import defpackage.jc5;
import defpackage.kpg;
import defpackage.loo;
import defpackage.o2v0;
import defpackage.oyr;
import defpackage.ru6;
import defpackage.s4j0;
import defpackage.syc0;
import defpackage.t8c;
import defpackage.tyy;
import defpackage.vyc0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.CurrentBufferLengthProvider;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.baseurls.BaseUrlsManager;
import ru.yandex.video.m3.player.baseurls.BaseUrlsManagerProvider;
import ru.yandex.video.m3.player.lowlatency.TrackTypeIdentifier;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 F2\u00020\u0001:\u0002FGBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u0004\u0018\u00010\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u008f\u0001\u0010<\u001a\u00020;2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\f2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\f\u00104\u001a\b\u0018\u000102R\u0002032\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010AR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010CR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010CR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010C¨\u0006H"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/YandexDashChunkSourceFactory;", "Lcgg;", "Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;", "parsedBaseUrlsHolder", "Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;", "parsedSegmentBaseHolder", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "baseUrlsManagerProvider", "Lipg;", "dataSourceFactory", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "currentBufferLengthProvider", "", "experimentalRequestCMAFSegments", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "maxSegmentsPerLoad", "validateRangeRequests", "enableLowLatency", "experimentalAllowGzipSubtitles", "enablePreloadLiveDash", "<init>", "(Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;Lipg;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;ZLru/yandex/video/m3/player/utils/PlayerLogger;IZZZZ)V", "Legg;", "manifest", "periodIndex", "", "adaptationSetIndices", "Ljc5;", "baseUrlExclusionList", "", "getRepresentationInitialBaseUrl", "(Legg;I[ILjc5;)Ljava/lang/String;", "", "allBaseUrls", "representationInitialBaseUrl", "getPostfix", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "Ltyy;", "manifestLoaderErrorThrower", "Lloo;", "trackSelection", "type", "", "elapsedRealtimeOffsetMs", "enableEventMessageTrack", "", "Landroidx/media3/common/a;", "closedCaptionFormats", "Lsyc0;", "Landroidx/media3/exoplayer/dash/PlayerEmsgHandler;", "playerEmsgHandler", "Lcj01;", "transferListener", "Lvyc0;", "playerId", "Lt8c;", "cmcdConfiguration", "Ldgg;", "createDashChunkSource", "(Ltyy;Legg;Ljc5;I[ILloo;IJZLjava/util/List;Lsyc0;Lcj01;Lvyc0;Lt8c;)Ldgg;", "Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;", "Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManagerProvider;", "Lipg;", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "Z", "Lru/yandex/video/m3/player/utils/PlayerLogger;", CA20Status.STATUS_USER_I, "Companion", "FallbackToDefaultDashChunkSourceHelper", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexDashChunkSourceFactory implements cgg {
    public static final String TAG = "YandexDashChunkSourceFactory";
    private final BaseUrlsManagerProvider baseUrlsManagerProvider;
    private final CurrentBufferLengthProvider currentBufferLengthProvider;
    private ipg dataSourceFactory;
    private final boolean enableLowLatency;
    private final boolean enablePreloadLiveDash;
    private final boolean experimentalAllowGzipSubtitles;
    private final boolean experimentalRequestCMAFSegments;
    private final int maxSegmentsPerLoad;
    private ParsedBaseUrlsHolder parsedBaseUrlsHolder;
    private ParsedSegmentBaseHolder parsedSegmentBaseHolder;
    private final PlayerLogger playerLogger;
    private final boolean validateRangeRequests;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/YandexDashChunkSourceFactory$FallbackToDefaultDashChunkSourceHelper;", "", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "<init>", "(Lru/yandex/video/m3/player/impl/source/dash/YandexDashChunkSourceFactory;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "", CRLReasonCodeExtension.REASON, "Lzy11;", "fallback", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "", "<set-?>", "isForbiddenToInitializeMultiBaseUrlMode", "Z", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FallbackToDefaultDashChunkSourceHelper {
        private boolean isForbiddenToInitializeMultiBaseUrlMode;
        private final PlayerLogger playerLogger;

        public FallbackToDefaultDashChunkSourceHelper(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
        }

        public final void fallback(String reason) {
            this.isForbiddenToInitializeMultiBaseUrlMode = true;
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose(YandexDashChunkSourceFactory.TAG, "fallbackToDefault", "For some reason it is impossible to useMultipleBaseUrlsDashChunkSource", "reason=".concat(reason));
            }
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        /* renamed from: isForbiddenToInitializeMultiBaseUrlMode, reason: from getter */
        public final boolean getIsForbiddenToInitializeMultiBaseUrlMode() {
            return this.isForbiddenToInitializeMultiBaseUrlMode;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ YandexDashChunkSourceFactory(ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolder r16, ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolder r17, ru.yandex.video.m3.player.baseurls.BaseUrlsManagerProvider r18, defpackage.ipg r19, ru.yandex.video.m3.player.CurrentBufferLengthProvider r20, boolean r21, ru.yandex.video.m3.player.utils.PlayerLogger r22, int r23, boolean r24, boolean r25, boolean r26, boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L9
            r1 = 1
            r10 = r1
            goto Lb
        L9:
            r10 = r23
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r11 = r2
            goto L14
        L12:
            r11 = r24
        L14:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1a
            r12 = r2
            goto L1c
        L1a:
            r12 = r25
        L1c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L22
            r13 = r2
            goto L24
        L22:
            r13 = r26
        L24:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L39
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r2 = r15
            goto L4a
        L39:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
        L4a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.video.m3.player.impl.source.dash.YandexDashChunkSourceFactory.<init>(ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolder, ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolder, ru.yandex.video.m3.player.baseurls.BaseUrlsManagerProvider, ipg, ru.yandex.video.m3.player.CurrentBufferLengthProvider, boolean, ru.yandex.video.m3.player.utils.PlayerLogger, int, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final String getPostfix(List<String> allBaseUrls, String representationInitialBaseUrl) {
        Object obj;
        Iterator<T> it = allBaseUrls.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (evu0.y(representationInitialBaseUrl, (String) obj, false)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return evu0.Q(str, representationInitialBaseUrl);
        }
        return null;
    }

    private final String getRepresentationInitialBaseUrl(egg manifest, int periodIndex, int[] adaptationSetIndices, jc5 baseUrlExclusionList) {
        String str = null;
        for (int i : adaptationSetIndices) {
            for (s4j0 s4j0Var : ((a70) manifest.getPeriod(periodIndex).c.get(i)).c) {
                ImmutableList immutableList = s4j0Var.b;
                ImmutableList immutableList2 = s4j0Var.b;
                ic5 c = baseUrlExclusionList.c(immutableList);
                if (c == null) {
                    c = (ic5) a.P(immutableList2);
                }
                h5z0.a.a("format=" + s4j0Var.a + "  baseurls=" + immutableList2, new Object[0]);
                String str2 = c.a;
                if (str == null) {
                    str = str2;
                } else if (!str.equals(str2)) {
                    return null;
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ru.yandex.video.m3.player.impl.source.dash.YandexDashChunkSourceFactory$Companion] */
    @Override // defpackage.cgg
    public dgg createDashChunkSource(tyy manifestLoaderErrorThrower, egg manifest, jc5 baseUrlExclusionList, int periodIndex, int[] adaptationSetIndices, loo trackSelection, int type, long elapsedRealtimeOffsetMs, boolean enableEventMessageTrack, List<androidx.media3.common.a> closedCaptionFormats, syc0 playerEmsgHandler, cj01 transferListener, vyc0 playerId, t8c cmcdConfiguration) {
        egg eggVar;
        int i;
        int[] iArr;
        BaseUrlsManager baseUrlsManager;
        jc5 jc5Var;
        BaseUrlsManager baseUrlsManager2;
        ?? r17;
        ipg ipgVar = this.dataSourceFactory;
        TrackTypeIdentifier trackTypeIdentifier = ipgVar instanceof TrackTypeIdentifier ? (TrackTypeIdentifier) ipgVar : null;
        if (trackTypeIdentifier != null) {
            trackTypeIdentifier.setTrackType(type != 1 ? type != 2 ? type != 3 ? TrackType.Other : TrackType.Subtitles : TrackType.Video : TrackType.Audio);
        }
        kpg createDataSource = this.dataSourceFactory.createDataSource();
        if (transferListener != null) {
            createDataSource.addTransferListener(transferListener);
        }
        FallbackToDefaultDashChunkSourceHelper fallbackToDefaultDashChunkSourceHelper = new FallbackToDefaultDashChunkSourceHelper(this.playerLogger);
        List<String> allBaseUrls = this.parsedBaseUrlsHolder.getAllBaseUrls();
        if (allBaseUrls.size() < 2) {
            fallbackToDefaultDashChunkSourceHelper.fallback("not enough base urls");
            eggVar = manifest;
            i = periodIndex;
            iArr = adaptationSetIndices;
            baseUrlsManager = null;
            jc5Var = baseUrlExclusionList;
        } else {
            eggVar = manifest;
            i = periodIndex;
            iArr = adaptationSetIndices;
            baseUrlsManager = null;
            jc5Var = baseUrlExclusionList;
            String representationInitialBaseUrl = getRepresentationInitialBaseUrl(eggVar, i, iArr, jc5Var);
            if (representationInitialBaseUrl == null || representationInitialBaseUrl.length() == 0) {
                fallbackToDefaultDashChunkSourceHelper.fallback("failed find representationInitialBaseUrl");
            } else {
                String postfix = getPostfix(allBaseUrls, representationInitialBaseUrl);
                if (postfix != null) {
                    BaseUrlsManager baseUrlsManager3 = this.baseUrlsManagerProvider.get(eggVar.hashCode(), this.parsedBaseUrlsHolder.getAllBaseUrls());
                    baseUrlsManager3.setBaseUrlPostfix(type, postfix);
                    Map<String, c8q0> segmentBaseByFormatId = this.parsedSegmentBaseHolder.getSegmentBaseByFormatId();
                    PlayerLogger playerLogger = this.playerLogger;
                    if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                        playerLogger.verbose(TAG, "createDashChunkSource", "create MultipleBaseUrlsDashChunkSource", "allBaseUrls.size=" + allBaseUrls.size(), oyr.i(type, "type="), "baseUrlPostfix=".concat(postfix));
                    }
                    baseUrlsManager2 = baseUrlsManager3;
                    r17 = segmentBaseByFormatId;
                    return INSTANCE.internalCreateDashChunkSource$video_player_internalRelease(manifestLoaderErrorThrower, eggVar, jc5Var, i, iArr, trackSelection, type, createDataSource, elapsedRealtimeOffsetMs, this.maxSegmentsPerLoad, enableEventMessageTrack, closedCaptionFormats, playerEmsgHandler, baseUrlsManager2, r17, this.currentBufferLengthProvider, this.experimentalRequestCMAFSegments, this.playerLogger, this.validateRangeRequests, this.enableLowLatency, playerId, cmcdConfiguration, this.experimentalAllowGzipSubtitles, this.enablePreloadLiveDash);
                }
            }
        }
        baseUrlsManager2 = baseUrlsManager;
        r17 = baseUrlsManager2;
        return INSTANCE.internalCreateDashChunkSource$video_player_internalRelease(manifestLoaderErrorThrower, eggVar, jc5Var, i, iArr, trackSelection, type, createDataSource, elapsedRealtimeOffsetMs, this.maxSegmentsPerLoad, enableEventMessageTrack, closedCaptionFormats, playerEmsgHandler, baseUrlsManager2, r17, this.currentBufferLengthProvider, this.experimentalRequestCMAFSegments, this.playerLogger, this.validateRangeRequests, this.enableLowLatency, playerId, cmcdConfiguration, this.experimentalAllowGzipSubtitles, this.enablePreloadLiveDash);
    }

    @Override // defpackage.cgg
    public cgg experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this;
    }

    @Override // defpackage.cgg
    public cgg experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // defpackage.cgg
    public androidx.media3.common.a getOutputTextFormat(androidx.media3.common.a aVar) {
        return aVar;
    }

    @Override // defpackage.cgg
    public cgg setSubtitleParserFactory(o2v0 o2v0Var) {
        return this;
    }

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jï\u0001\u00104\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001d\u001a\b\u0018\u00010\u001bR\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0016H\u0000¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/YandexDashChunkSourceFactory$Companion;", "", "<init>", "()V", "Ltyy;", "manifestLoaderErrorThrower", "Legg;", "manifest", "Ljc5;", "baseUrlExclusionList", "", "periodIndex", "", "adaptationSetIndices", "Lloo;", "trackSelection", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lkpg;", "dataSource", "", "elapsedRealtimeOffsetMs", "maxSegmentsPerLoad", "", "enableEventMessageTrack", "", "Landroidx/media3/common/a;", "closedCaptionFormats", "Lsyc0;", "Landroidx/media3/exoplayer/dash/PlayerEmsgHandler;", "playerTrackEmsgHandler", "Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;", "baseUrlsManager", "", "", "Lc8q0;", "segmentBaseByFormatId", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "currentBufferLengthProvider", "experimentalRequestCMAFSegments", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "validateRangeRequests", "enableLowLatency", "Lvyc0;", "playerId", "Lt8c;", "cmcdConfiguration", "experimentalAllowGzipSubtitles", "enablePreloadLiveDash", "Ldgg;", "internalCreateDashChunkSource$video_player_internalRelease", "(Ltyy;Legg;Ljc5;I[ILloo;ILkpg;JIZLjava/util/List;Lsyc0;Lru/yandex/video/m3/player/baseurls/BaseUrlsManager;Ljava/util/Map;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;ZLru/yandex/video/m3/player/utils/PlayerLogger;ZZLvyc0;Lt8c;ZZ)Ldgg;", "internalCreateDashChunkSource", "TAG", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dgg internalCreateDashChunkSource$video_player_internalRelease(tyy manifestLoaderErrorThrower, egg manifest, jc5 baseUrlExclusionList, int periodIndex, int[] adaptationSetIndices, loo trackSelection, int trackType, kpg dataSource, long elapsedRealtimeOffsetMs, int maxSegmentsPerLoad, boolean enableEventMessageTrack, List<androidx.media3.common.a> closedCaptionFormats, syc0 playerTrackEmsgHandler, BaseUrlsManager baseUrlsManager, Map<String, ? extends c8q0> segmentBaseByFormatId, CurrentBufferLengthProvider currentBufferLengthProvider, boolean experimentalRequestCMAFSegments, PlayerLogger playerLogger, boolean validateRangeRequests, boolean enableLowLatency, vyc0 playerId, t8c cmcdConfiguration, boolean experimentalAllowGzipSubtitles, boolean enablePreloadLiveDash) {
            bl51 bl51Var = new bl51(new ru6(), manifestLoaderErrorThrower, manifest, baseUrlExclusionList, periodIndex, adaptationSetIndices, trackSelection, trackType, dataSource, elapsedRealtimeOffsetMs, maxSegmentsPerLoad, enableEventMessageTrack, closedCaptionFormats, playerTrackEmsgHandler, baseUrlsManager, segmentBaseByFormatId, currentBufferLengthProvider, experimentalRequestCMAFSegments, playerLogger, playerId, experimentalAllowGzipSubtitles);
            h5z0.a.a("YandexCachedPriorityDashChunkSource created", new Object[0]);
            bl51Var.p = enablePreloadLiveDash;
            bl51Var.a.shouldValidateRangeRequests(validateRangeRequests);
            return bl51Var;
        }

        private Companion() {
        }
    }

    public YandexDashChunkSourceFactory(ParsedBaseUrlsHolder parsedBaseUrlsHolder, ParsedSegmentBaseHolder parsedSegmentBaseHolder, BaseUrlsManagerProvider baseUrlsManagerProvider, ipg ipgVar, CurrentBufferLengthProvider currentBufferLengthProvider, boolean z, PlayerLogger playerLogger, int i, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.parsedBaseUrlsHolder = parsedBaseUrlsHolder;
        this.parsedSegmentBaseHolder = parsedSegmentBaseHolder;
        this.baseUrlsManagerProvider = baseUrlsManagerProvider;
        this.dataSourceFactory = ipgVar;
        this.currentBufferLengthProvider = currentBufferLengthProvider;
        this.experimentalRequestCMAFSegments = z;
        this.playerLogger = playerLogger;
        this.maxSegmentsPerLoad = i;
        this.validateRangeRequests = z2;
        this.enableLowLatency = z3;
        this.experimentalAllowGzipSubtitles = z4;
        this.enablePreloadLiveDash = z5;
    }
}
