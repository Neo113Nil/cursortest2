package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.h;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.lifecycle.compose.a;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.i43;
import defpackage.imz;
import defpackage.jl40;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.n4u0;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.scc;
import defpackage.si6;
import defpackage.sic;
import defpackage.sls;
import defpackage.sty0;
import defpackage.tls;
import defpackage.uo5;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.random.Random;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.debug.model.ListSdkPlayerDebugData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.MediaDataKt;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatDataKt;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;
import ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt;
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
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfig;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfigKt;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlagsKt;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.ui.debug.ListSdkDebugViewFlags;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\f\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u000f\" \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00018\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Ln4u0;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "playerDebugDataStateFlow", "Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "listSdkPlayerDebugDataStateFlow", "Lf530;", "modifier", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "playerDebugViewFlags", "Lru/yandex/video/m3/ui/debug/ListSdkDebugViewFlags;", "listSdkDebugViewFlags", "Lzy11;", "ListDebugView", "(Ln4u0;Ln4u0;Lf530;Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;Lru/yandex/video/m3/ui/debug/ListSdkDebugViewFlags;Lfid;II)V", "ListDebugViewPreview", "(Lfid;I)V", "ListDebugViewCompactPreview", "Landroidx/compose/runtime/h;", "LocalListSdkDebugViewFlags", "Landroidx/compose/runtime/h;", "getLocalListSdkDebugViewFlags", "()Landroidx/compose/runtime/h;", "playerState", "listSdkPlayerState", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListDebugViewKt {
    private static final h LocalListSdkDebugViewFlags = new qwd(new sls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$LocalListSdkDebugViewFlags$1
        @Override // defpackage.sls
        public final ListSdkDebugViewFlags invoke() {
            return new ListSdkDebugViewFlags(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, 67108863, null);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0079  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugView$1$1$2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugView$1$1$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListDebugView(final n4u0 n4u0Var, final n4u0 n4u0Var2, f530 f530Var, PlayerDebugViewFlags playerDebugViewFlags, ListSdkDebugViewFlags listSdkDebugViewFlags, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        PlayerDebugViewFlags playerDebugViewFlags2;
        ListSdkDebugViewFlags listSdkDebugViewFlags2;
        f530 f530Var3;
        final PlayerDebugViewFlags playerDebugViewFlags3;
        ListSdkDebugViewFlags listSdkDebugViewFlags3;
        boolean z;
        bts btsVar;
        final f530 f530Var4;
        final PlayerDebugViewFlags playerDebugViewFlags4;
        ListSdkDebugViewFlags copy;
        int i4;
        int i5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(194755950);
        dmw0 dmw0Var = btsVar2.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.e(n4u0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar2.e(n4u0Var2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    playerDebugViewFlags2 = playerDebugViewFlags;
                    if (btsVar2.k(playerDebugViewFlags2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    playerDebugViewFlags2 = playerDebugViewFlags;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                playerDebugViewFlags2 = playerDebugViewFlags;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                if ((i2 & 16) == 0) {
                    listSdkDebugViewFlags2 = listSdkDebugViewFlags;
                    if (btsVar2.k(listSdkDebugViewFlags2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    listSdkDebugViewFlags2 = listSdkDebugViewFlags;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                listSdkDebugViewFlags2 = listSdkDebugViewFlags;
            }
            if ((i3 & 9363) == 9362 || !btsVar2.E()) {
                btsVar2.a0();
                if ((i & 1) != 0 || btsVar2.C()) {
                    f530Var3 = i6 == 0 ? c530.a : f530Var2;
                    if ((i2 & 8) == 0) {
                        playerDebugViewFlags3 = PlayerDebugViewFlagsKt.PlayerDebugViewFlags$default(null, 1, null);
                        i3 &= -7169;
                    } else {
                        playerDebugViewFlags3 = playerDebugViewFlags2;
                    }
                    if ((i2 & 16) != 0) {
                        listSdkDebugViewFlags3 = new ListSdkDebugViewFlags(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, 67108863, null);
                        i3 &= -57345;
                        btsVar2.u();
                        final oz40 c = a.c(n4u0Var, null, btsVar2, i3 & 14, 7);
                        final oz40 c2 = a.c(n4u0Var2, null, btsVar2, (i3 >> 3) & 14, 7);
                        uo5 uo5Var = x4c.y;
                        k3r k3rVar = ljs0.c;
                        f530 k = f530Var3.k(k3rVar);
                        btsVar2.f0(733328855);
                        si6 e = pi6.e(uo5Var, btsVar2, 6);
                        btsVar2.f0(-1323940314);
                        int S = cma1.S(btsVar2);
                        r1b0 o = btsVar2.o();
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        androidx.compose.runtime.internal.a h = e.h(k);
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar2, wlsVar, e);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar2, wlsVar2, o);
                        wls wlsVar3 = d.g;
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                            b64.z(S, btsVar2, S, wlsVar3);
                        }
                        h.invoke(new gns0(btsVar2), btsVar2, 0);
                        btsVar2.f0(2058660585);
                        i43 i43Var = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m962getVerticalArrangementD9Ej5fM(), true, new quz(11));
                        f530 k2 = an91.k(f530Var3, 4.0f).k(k3rVar);
                        btsVar2.f0(-483455358);
                        sic a = qic.a(i43Var, x4c.G, btsVar2, 0);
                        btsVar2.f0(-1323940314);
                        int S2 = cma1.S(btsVar2);
                        r1b0 o2 = btsVar2.o();
                        androidx.compose.runtime.internal.a h2 = e.h(k2);
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, wlsVar, a);
                        qje.W(btsVar2, wlsVar2, o2);
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S2))) {
                            b64.z(S2, btsVar2, S2, wlsVar3);
                        }
                        h2.invoke(new gns0(btsVar2), btsVar2, 0);
                        btsVar2.f0(2058660585);
                        if (ListDebugView$lambda$1(c2).isCompactView()) {
                            btsVar2.f0(339417920);
                            h hVar = LocalListSdkDebugViewFlags;
                            copy = listSdkDebugViewFlags3.copy((r83 & 1) != 0 ? listSdkDebugViewFlags3.showEpsilonInfo : false, (r83 & 2) != 0 ? listSdkDebugViewFlags3.showEpsilonUuid : false, (r83 & 4) != 0 ? listSdkDebugViewFlags3.showEpsilonUuidLabel : false, (r83 & 8) != 0 ? listSdkDebugViewFlags3.showEpsilonPlayerId : false, (r83 & 16) != 0 ? listSdkDebugViewFlags3.showEpsilonPlayerIdLabel : false, (r83 & 32) != 0 ? listSdkDebugViewFlags3.showEpsilonEngine : false, (r83 & 64) != 0 ? listSdkDebugViewFlags3.showEpsilonEngineLabel : false, (r83 & 128) != 0 ? listSdkDebugViewFlags3.showEpsilonPreloadState : false, (r83 & 256) != 0 ? listSdkDebugViewFlags3.showEpsilonPreloadStateLabel : false, (r83 & 512) != 0 ? listSdkDebugViewFlags3.showEpsilonCurrentQuality : false, (r83 & 1024) != 0 ? listSdkDebugViewFlags3.showEpsilonCurrentQualityLabel : false, (r83 & 2048) != 0 ? listSdkDebugViewFlags3.showEpsilonBufferSize : false, (r83 & 4096) != 0 ? listSdkDebugViewFlags3.showEpsilonBufferSizeLabel : false, (r83 & 8192) != 0 ? listSdkDebugViewFlags3.showDecodersInfo : false, (r83 & 16384) != 0 ? listSdkDebugViewFlags3.showDecoderId : false, (r83 & 32768) != 0 ? listSdkDebugViewFlags3.showDecoderIdLabel : false, (r83 & 65536) != 0 ? listSdkDebugViewFlags3.showDecoderName : false, (r83 & 131072) != 0 ? listSdkDebugViewFlags3.showDecoderNameLabel : false, (r83 & 262144) != 0 ? listSdkDebugViewFlags3.showDecoderInits : false, (r83 & 524288) != 0 ? listSdkDebugViewFlags3.showDecoderInitsLabel : false, (r83 & 1048576) != 0 ? listSdkDebugViewFlags3.showDecoderReuses : false, (r83 & 2097152) != 0 ? listSdkDebugViewFlags3.showDecoderReusesLabel : false, (r83 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? listSdkDebugViewFlags3.showDecoderReleases : false, (r83 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? listSdkDebugViewFlags3.showDecoderReleasesLabel : false, (r83 & 16777216) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryInfo : false, (r83 & SelfTester_JCP.DECRYPT_CFB) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryBlurShown : false, (r83 & SelfTester_JCP.DECRYPT_CBC) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryBlurShownLabel : false, (r83 & SelfTester_JCP.DECRYPT_CNT) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryImageShown : false, (r83 & SelfTester_JCP.IMITA) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryImageShownLabel : false, (r83 & 536870912) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryFirstFrameShown : false, (r83 & 1073741824) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryFirstFrameShownLabel : false, (r83 & Integer.MIN_VALUE) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryPlayDelta : false, (r84 & 1) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryPlayDeltaLabel : false, (r84 & 2) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryTotalTime : false, (r84 & 4) != 0 ? listSdkDebugViewFlags3.showSpeedTelemetryTotalTimeLabel : false, (r84 & 8) != 0 ? listSdkDebugViewFlags3.showNumOfFatals : false, (r84 & 16) != 0 ? listSdkDebugViewFlags3.showNumOfFatalsLabel : false, (r84 & 32) != 0 ? listSdkDebugViewFlags3.showIsStartFromCache : false, (r84 & 64) != 0 ? listSdkDebugViewFlags3.showIsCacheStartDebugLabel : false, (r84 & 128) != 0 ? listSdkDebugViewFlags3.showIsOnDemand : false, (r84 & 256) != 0 ? listSdkDebugViewFlags3.showIsOnDemandLabel : false, (r84 & 512) != 0 ? listSdkDebugViewFlags3.showBandwidth : false, (r84 & 1024) != 0 ? listSdkDebugViewFlags3.showBandwidthMinValue : false, (r84 & 2048) != 0 ? listSdkDebugViewFlags3.showBandwidthMinValueLabel : false, (r84 & 4096) != 0 ? listSdkDebugViewFlags3.showBandwidthMaxValue : false, (r84 & 8192) != 0 ? listSdkDebugViewFlags3.showBandwidthMaxValueLabel : false, (r84 & 16384) != 0 ? listSdkDebugViewFlags3.showBandwidthLastValue : false, (r84 & 32768) != 0 ? listSdkDebugViewFlags3.showBandwidthLastValueLabel : false, (r84 & 65536) != 0 ? listSdkDebugViewFlags3.showNetworkRequests : false, (r84 & 131072) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsGlobalSuccessCounter : false, (r84 & 262144) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsGlobalSuccessCounterLabel : false, (r84 & 524288) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsGlobalErrorsCounter : false, (r84 & 1048576) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsGlobalErrorsCounterLabel : false, (r84 & 2097152) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsMaxValues : false, (r84 & SelfTester_JCP.ENCRYPT_CBC) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsMaxValuesLabel : false, (r84 & SelfTester_JCP.ENCRYPT_CNT) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsLastValues : false, (r84 & 16777216) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsLastValuesLabel : false, (r84 & SelfTester_JCP.DECRYPT_CFB) != 0 ? listSdkDebugViewFlags3.showNetworkRequestsValuesNames : false);
                            listSdkDebugViewFlags2 = listSdkDebugViewFlags3;
                            sb2.b(hVar.a(copy), wwg.i(btsVar2, -1986978505, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugView$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(fid fidVar2, int i7) {
                                    DebugData ListDebugView$lambda$0;
                                    ListSdkPlayerDebugData ListDebugView$lambda$1;
                                    if ((i7 & 3) == 2) {
                                        bts btsVar3 = (bts) fidVar2;
                                        if (btsVar3.E()) {
                                            btsVar3.Y();
                                            return;
                                        }
                                    }
                                    ListDebugView$lambda$0 = ListDebugViewKt.ListDebugView$lambda$0(m3u0.this);
                                    ListDebugView$lambda$1 = ListDebugViewKt.ListDebugView$lambda$1(c2);
                                    ListSdkDebugKt.ListSdkDebug(ListDebugView$lambda$0, ListDebugView$lambda$1, null, fidVar2, 0, 4);
                                }

                                @Override // defpackage.wls
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((fid) obj, ((Number) obj2).intValue());
                                    return zy11.a;
                                }
                            }), btsVar2, 56);
                            z = false;
                            btsVar2.t(false);
                        } else {
                            listSdkDebugViewFlags2 = listSdkDebugViewFlags3;
                            z = false;
                            btsVar2.f0(340299994);
                            sb2.b(LocalListSdkDebugViewFlags.a(listSdkDebugViewFlags2), wwg.i(btsVar2, 642837262, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugView$1$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(fid fidVar2, int i7) {
                                    DebugData ListDebugView$lambda$0;
                                    ListSdkPlayerDebugData ListDebugView$lambda$1;
                                    if ((i7 & 3) == 2) {
                                        bts btsVar3 = (bts) fidVar2;
                                        if (btsVar3.E()) {
                                            btsVar3.Y();
                                            return;
                                        }
                                    }
                                    final long m966getFontSizeXSAIIZE = Theme.INSTANCE.getTypography(fidVar2, 6).m966getFontSizeXSAIIZE();
                                    n4u0 n4u0Var3 = n4u0.this;
                                    PlayerDebugViewFlags playerDebugViewFlags5 = playerDebugViewFlags3;
                                    bts btsVar4 = (bts) fidVar2;
                                    btsVar4.f0(881494809);
                                    boolean d = btsVar4.d(m966getFontSizeXSAIIZE);
                                    Object Q = btsVar4.Q();
                                    if (d || Q == did.a) {
                                        Q = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugView$1$1$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            public final void invoke(PlayerDebugViewConfig.Builder builder) {
                                                builder.m864setFontSizeqXeDRgA(new sty0(m966getFontSizeXSAIIZE));
                                            }

                                            @Override // defpackage.tls
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((PlayerDebugViewConfig.Builder) obj);
                                                return zy11.a;
                                            }
                                        };
                                        btsVar4.o0(Q);
                                    }
                                    btsVar4.t(false);
                                    DebugViewKt.DebugView(n4u0Var3, null, playerDebugViewFlags5, PlayerDebugViewConfigKt.PlayerDebugViewConfig((tls) Q), btsVar4, 0, 2);
                                    ListDebugView$lambda$0 = ListDebugViewKt.ListDebugView$lambda$0(c);
                                    ListDebugView$lambda$1 = ListDebugViewKt.ListDebugView$lambda$1(c2);
                                    ListSdkDebugKt.ListSdkDebug(ListDebugView$lambda$0, ListDebugView$lambda$1, null, btsVar4, 0, 4);
                                }

                                @Override // defpackage.wls
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((fid) obj, ((Number) obj2).intValue());
                                    return zy11.a;
                                }
                            }), btsVar2, 56);
                            btsVar2.t(false);
                        }
                        ly3.A(btsVar2, z, true, z, z);
                        ly3.A(btsVar2, z, true, z, z);
                        btsVar = btsVar2;
                        f530Var4 = f530Var3;
                        playerDebugViewFlags4 = playerDebugViewFlags3;
                    }
                } else {
                    btsVar2.Y();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    f530Var3 = f530Var2;
                    playerDebugViewFlags3 = playerDebugViewFlags2;
                }
                listSdkDebugViewFlags3 = listSdkDebugViewFlags2;
                btsVar2.u();
                final m3u0 c3 = a.c(n4u0Var, null, btsVar2, i3 & 14, 7);
                final m3u0 c22 = a.c(n4u0Var2, null, btsVar2, (i3 >> 3) & 14, 7);
                uo5 uo5Var2 = x4c.y;
                k3r k3rVar2 = ljs0.c;
                f530 k3 = f530Var3.k(k3rVar2);
                btsVar2.f0(733328855);
                si6 e2 = pi6.e(uo5Var2, btsVar2, 6);
                btsVar2.f0(-1323940314);
                int S3 = cma1.S(btsVar2);
                r1b0 o3 = btsVar2.o();
                ohd.G1.getClass();
                sls slsVar2 = d.b;
                androidx.compose.runtime.internal.a h3 = e.h(k3);
                if (dmw0Var == null) {
                }
            } else {
                btsVar2.Y();
                btsVar = btsVar2;
                f530Var4 = f530Var2;
                playerDebugViewFlags4 = playerDebugViewFlags2;
            }
            final ListSdkDebugViewFlags listSdkDebugViewFlags4 = listSdkDebugViewFlags2;
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugView$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i7) {
                        ListDebugViewKt.ListDebugView(n4u0.this, n4u0Var2, f530Var4, playerDebugViewFlags4, listSdkDebugViewFlags4, fidVar2, vng.O(i | 1), i2);
                    }

                    @Override // defpackage.wls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((fid) obj, ((Number) obj2).intValue());
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        btsVar2.a0();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        listSdkDebugViewFlags3 = listSdkDebugViewFlags2;
        btsVar2.u();
        final m3u0 c32 = a.c(n4u0Var, null, btsVar2, i3 & 14, 7);
        final m3u0 c222 = a.c(n4u0Var2, null, btsVar2, (i3 >> 3) & 14, 7);
        uo5 uo5Var22 = x4c.y;
        k3r k3rVar22 = ljs0.c;
        f530 k32 = f530Var3.k(k3rVar22);
        btsVar2.f0(733328855);
        si6 e22 = pi6.e(uo5Var22, btsVar2, 6);
        btsVar2.f0(-1323940314);
        int S32 = cma1.S(btsVar2);
        r1b0 o32 = btsVar2.o();
        ohd.G1.getClass();
        sls slsVar22 = d.b;
        androidx.compose.runtime.internal.a h32 = e.h(k32);
        if (dmw0Var == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebugData ListDebugView$lambda$0(m3u0 m3u0Var) {
        return (DebugData) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListSdkPlayerDebugData ListDebugView$lambda$1(m3u0 m3u0Var) {
        return (ListSdkPlayerDebugData) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$1] */
    public static final void ListDebugViewCompactPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-353557179);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ListDebugViewKt$ListDebugViewCompactPreview$mediaData$1 listDebugViewKt$ListDebugViewCompactPreview$mediaData$1 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$mediaData$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("1");
                }
            };
            EmptyList emptyList = EmptyList.a;
            final List g = scc.g(MediaDataKt.MediaData(emptyList, listDebugViewKt$ListDebugViewCompactPreview$mediaData$1), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$mediaData$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("2");
                }
            }), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$mediaData$3
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("3");
                }
            }));
            final TrackFormatData TrackFormatData = TrackFormatDataKt.TrackFormatData("codec 1920x1080 testId", new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$trackFormatData$1
                public final void invoke(TrackFormatData.Builder builder) {
                    builder.setVertical(Boolean.FALSE);
                    builder.setResolution(scc.g(1920, 1080));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TrackFormatData.Builder) obj);
                    return zy11.a;
                }
            });
            final int i2 = 587;
            final int i3 = 2000;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, 1359692041, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i4) {
                    if ((i4 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    ListSdkDebugViewFlags listSdkDebugViewFlags = new ListSdkDebugViewFlags(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, 67108863, null);
                    PlayerDebugViewFlags PlayerDebugViewFlags$default = PlayerDebugViewFlagsKt.PlayerDebugViewFlags$default(null, 1, null);
                    DecoderData decoderData = new DecoderData("c2.android.aac.decoder", 1, 1, 0, Boolean.FALSE);
                    AudioTrackData audioTrackData = new AudioTrackData("Русский", 132374, "en");
                    BytesLoaded bytesLoaded = new BytesLoaded(8232443L, 2634957L, 5597486L, 0L);
                    ContentData contentData = new ContentData("vvKDIjmoImXQ", CurrentStreamType.DASH, CurrentVideoType.VOD);
                    BufferSize bufferSize = new BufferSize(1727874019821L, 0L);
                    DrmMode drmMode = DrmMode.OFF;
                    BandwidthEstimation bandwidthEstimation = new BandwidthEstimation(1727873967499L, 41053332L);
                    LoadedChunk loadedChunk = new LoadedChunk(1727873967500L, true);
                    LatencyData latencyData = new LatencyData(-9223372036854775807L, -9223372036854775807L);
                    SessionColor sessionColor = SessionColor.GREEN;
                    SubtitlesTrackData subtitlesTrackData = new SubtitlesTrackData("Disabled.", null, null);
                    DecoderData decoderData2 = new DecoderData("c2.android.avc.decoder", 1, 1, 0, null, 16, null);
                    VideoTrackData videoTrackData = new VideoTrackData("Auto", 63226, new Size(1920, 1080));
                    Size size = new Size(2208, 1682);
                    ArrayList arrayList = new ArrayList();
                    int i5 = i2;
                    int i6 = 0;
                    while (i6 < i5) {
                        SubtitlesTrackData subtitlesTrackData2 = subtitlesTrackData;
                        LoadedChunk loadedChunk2 = loadedChunk;
                        LatencyData latencyData2 = latencyData;
                        AudioTrackData audioTrackData2 = audioTrackData;
                        arrayList.add(new LoadedChunk(0L, y6i0.j(new d6w(0, 10, 1), Random.a) % 3 == 0));
                        i6++;
                        audioTrackData = audioTrackData2;
                        subtitlesTrackData = subtitlesTrackData2;
                        loadedChunk = loadedChunk2;
                        latencyData = latencyData2;
                    }
                    r0 c = bvf0.c(new DebugData("844434ccff37525ff5bbfab4a64dc6027f479736cd36xANDx0092x1608821923", contentData, videoTrackData, audioTrackData, subtitlesTrackData, size, decoderData2, decoderData, drmMode, 15, "Wifi", bandwidthEstimation, loadedChunk, bytesLoaded, bufferSize, Long.valueOf(MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS), latencyData, null, "15:52:13, UTC+3, October 2 2024", sessionColor, null, arrayList, null, 1727875277758L, null, false, 22020096, null));
                    ArrayList arrayList2 = new ArrayList();
                    int i7 = 0;
                    for (int i8 = i3; i7 < i8; i8 = i8) {
                        BandwidthEstimation bandwidthEstimation2 = (BandwidthEstimation) kotlin.collections.a.b0(arrayList2);
                        long longValue = (bandwidthEstimation2 != null ? Long.valueOf(bandwidthEstimation2.getValue()) : Float.valueOf(0.0f)).longValue();
                        d6w d6wVar = new d6w(-1, 1, 1);
                        Random.Default r11 = Random.a;
                        arrayList2.add(new BandwidthEstimation(0L, Math.abs(longValue + (y6i0.j(new d6w(0, 100, 1), r11) * y6i0.j(d6wVar, r11)))));
                        i7++;
                    }
                    SpeedTelemetry speedTelemetry = new SpeedTelemetry("vplvqpheuhe4ee7lotxq", null, 280L, 2258L, 2258L, "start_playback");
                    ListDebugViewKt.ListDebugView(c, bvf0.c(new ListSdkPlayerDebugData(g, b.i(new Pair(g.get(0), PreloadState.SUCCESS), new Pair(g.get(1), PreloadState.ERROR), new Pair(g.get(2), PreloadState.NONE)), b.i(new Pair(g.get(0), 0), new Pair(g.get(1), 1), new Pair(g.get(2), 2)), null, b.i(new Pair(0, DecoderEventDataKt.DecoderEventData("c2.android.avc.decoder", 2, 2, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$1.3
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(0);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(1, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 2, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$1.4
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(4);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(2, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 0, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$1.5
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(42);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    }))), null, speedTelemetry, null, Boolean.TRUE, b.i(new Pair(g.get(0), new VideoTrackData("1", 124421, new Size(1920, 1080))), new Pair(g.get(1), new VideoTrackData("2", 324421, new Size(3840, 2160))), new Pair(g.get(2), new VideoTrackData("3", 524421, new Size(1920, 1080)))), b.i(new Pair(g.get(0), new BufferSize(124414212144L, 1151241532L)), new Pair(g.get(1), new BufferSize(124414212144L, 1251241532L)), new Pair(g.get(2), new BufferSize(124414212144L, 1352241532L))), arrayList2, null, null, true, null, 45224, null)), null, PlayerDebugViewFlags$default, listSdkDebugViewFlags, fidVar2, 0, 4);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            }), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewCompactPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i4) {
                    ListDebugViewKt.ListDebugViewCompactPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$1] */
    public static final void ListDebugViewPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1836576336);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            ListDebugViewKt$ListDebugViewPreview$mediaData$1 listDebugViewKt$ListDebugViewPreview$mediaData$1 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$mediaData$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("1");
                }
            };
            EmptyList emptyList = EmptyList.a;
            final List g = scc.g(MediaDataKt.MediaData(emptyList, listDebugViewKt$ListDebugViewPreview$mediaData$1), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$mediaData$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("2");
                }
            }), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$mediaData$3
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("3");
                }
            }));
            final TrackFormatData TrackFormatData = TrackFormatDataKt.TrackFormatData("codec 1920x1080 testId", new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$trackFormatData$1
                public final void invoke(TrackFormatData.Builder builder) {
                    builder.setVertical(Boolean.FALSE);
                    builder.setResolution(scc.g(1920, 1080));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((TrackFormatData.Builder) obj);
                    return zy11.a;
                }
            });
            final int i2 = 50;
            final long j = 100;
            final long j2 = 1000;
            final int i3 = 30;
            final int i4 = 100;
            final long j3 = 3900000;
            final long j4 = 103000000;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, 372492044, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    if ((i5 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    ListSdkDebugViewFlags listSdkDebugViewFlags = new ListSdkDebugViewFlags(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, 67108863, null);
                    PlayerDebugViewFlags PlayerDebugViewFlags$default = PlayerDebugViewFlagsKt.PlayerDebugViewFlags$default(null, 1, null);
                    DecoderData decoderData = new DecoderData("c2.android.aac.decoder", 1, 1, 0, Boolean.FALSE);
                    AudioTrackData audioTrackData = new AudioTrackData("Русский", 132374, "en");
                    BytesLoaded bytesLoaded = new BytesLoaded(8232443L, 2634957L, 5597486L, 0L);
                    ContentData contentData = new ContentData("vvKDIjmoImXQ", CurrentStreamType.DASH, CurrentVideoType.VOD);
                    BufferSize bufferSize = new BufferSize(1727874019821L, 0L);
                    DrmMode drmMode = DrmMode.OFF;
                    BandwidthEstimation bandwidthEstimation = new BandwidthEstimation(1727873967499L, 41053332L);
                    LoadedChunk loadedChunk = new LoadedChunk(1727873967500L, true);
                    LatencyData latencyData = new LatencyData(-9223372036854775807L, -9223372036854775807L);
                    SessionColor sessionColor = SessionColor.GREEN;
                    SubtitlesTrackData subtitlesTrackData = new SubtitlesTrackData("Disabled.", null, null);
                    DecoderData decoderData2 = new DecoderData("c2.android.avc.decoder", 1, 1, 0, null, 16, null);
                    VideoTrackData videoTrackData = new VideoTrackData("Auto", 63226, new Size(1920, 1080));
                    Size size = new Size(2208, 1682);
                    ArrayList arrayList = new ArrayList();
                    int i6 = i2;
                    long j5 = currentTimeMillis;
                    long j6 = j;
                    long j7 = j2;
                    int i7 = i3;
                    ArrayList arrayList2 = new ArrayList();
                    int i8 = 0;
                    while (i8 < i6) {
                        LoadedChunk loadedChunk2 = (LoadedChunk) kotlin.collections.a.b0(arrayList2);
                        long timestamp = loadedChunk2 != null ? loadedChunk2.getTimestamp() : j5;
                        long j8 = j6;
                        imz imzVar = new imz(j8, j7, false);
                        Random.Default r7 = Random.a;
                        BandwidthEstimation bandwidthEstimation2 = bandwidthEstimation;
                        int i9 = i8;
                        DecoderData decoderData3 = decoderData2;
                        VideoTrackData videoTrackData2 = videoTrackData;
                        arrayList2.add(new LoadedChunk(timestamp - y6i0.k(imzVar, r7), y6i0.j(new d6w(1, 100, 1), r7) < i7));
                        i8 = i9 + 1;
                        videoTrackData = videoTrackData2;
                        decoderData2 = decoderData3;
                        bandwidthEstimation = bandwidthEstimation2;
                        j6 = j8;
                    }
                    kotlin.collections.a.q0(arrayList2);
                    r0 c = bvf0.c(new DebugData("844434ccff37525ff5bbfab4a64dc6027f479736cd36xANDx0092x1608821923", contentData, videoTrackData, audioTrackData, subtitlesTrackData, size, decoderData2, decoderData, drmMode, 15, "Wifi", bandwidthEstimation, loadedChunk, bytesLoaded, bufferSize, Long.valueOf(MemoryDependsLoadControl.DEFAULT_MAX_DURATION_MS), latencyData, null, "15:52:13, UTC+3, October 2 2024", sessionColor, null, arrayList, null, currentTimeMillis, null, false, 22020096, null));
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = i4;
                    long j9 = currentTimeMillis;
                    long j10 = j;
                    long j11 = j2;
                    long j12 = j3;
                    long j13 = j4;
                    int i11 = 0;
                    while (i11 < i10) {
                        BandwidthEstimation bandwidthEstimation3 = (BandwidthEstimation) kotlin.collections.a.b0(arrayList3);
                        long timestamp2 = bandwidthEstimation3 != null ? bandwidthEstimation3.getTimestamp() : j9;
                        imz imzVar2 = new imz(j10, j11, false);
                        int i12 = i11;
                        Random.Default r3 = Random.a;
                        arrayList3.add(new BandwidthEstimation(timestamp2 - y6i0.k(imzVar2, r3), y6i0.k(new imz(j12, j13, false), r3)));
                        i11 = i12 + 1;
                        i10 = i10;
                        j10 = j10;
                    }
                    List q0 = kotlin.collections.a.q0(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int i13 = i2;
                    long j14 = currentTimeMillis;
                    long j15 = j;
                    long j16 = j2;
                    int i14 = i3;
                    int i15 = 0;
                    while (i15 < i13) {
                        LoadedChunk loadedChunk3 = (LoadedChunk) kotlin.collections.a.b0(arrayList4);
                        long timestamp3 = loadedChunk3 != null ? loadedChunk3.getTimestamp() : j14;
                        int i16 = i13;
                        imz imzVar3 = new imz(j15, j16, false);
                        long j17 = j16;
                        long j18 = j15;
                        Random.Default r6 = Random.a;
                        long j19 = j14;
                        arrayList4.add(new LoadedChunk(timestamp3 - y6i0.k(imzVar3, r6), y6i0.j(new d6w(1, 100, 1), r6) < i14));
                        i15++;
                        j16 = j17;
                        j15 = j18;
                        i13 = i16;
                        j14 = j19;
                    }
                    List q02 = kotlin.collections.a.q0(arrayList4);
                    MediaData mediaData = g.get(1);
                    SpeedTelemetry speedTelemetry = new SpeedTelemetry("vplvqpheuhe4ee7lotxq", null, 280L, 2258L, 2258L, "start_playback");
                    Map i17 = b.i(new Pair(g.get(0), 0), new Pair(g.get(1), 1), new Pair(g.get(2), 2));
                    ListDebugViewKt.ListDebugView(c, bvf0.c(new ListSdkPlayerDebugData(g, b.i(new Pair(g.get(0), PreloadState.SUCCESS), new Pair(g.get(1), PreloadState.ERROR), new Pair(g.get(2), PreloadState.NONE)), i17, null, b.i(new Pair(0, DecoderEventDataKt.DecoderEventData("c2.android.avc.decoder", 2, 2, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$1.4
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(0);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(1, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 2, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$1.5
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(4);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(2, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 0, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$1.6
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(42);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    }))), null, speedTelemetry, null, Boolean.TRUE, b.i(new Pair(g.get(0), new VideoTrackData("1", 124421, new Size(1920, 1080))), new Pair(g.get(1), new VideoTrackData("2", 324421, new Size(3840, 2160))), new Pair(g.get(2), new VideoTrackData("3", 524421, new Size(1920, 1080)))), b.i(new Pair(g.get(0), new BufferSize(124414212144L, 1151241532L)), new Pair(g.get(1), new BufferSize(124414212144L, 1251241532L)), new Pair(g.get(2), new BufferSize(124414212144L, 1352241532L))), q0, q02, mediaData, false, null, 49320, null)), null, PlayerDebugViewFlags$default, listSdkDebugViewFlags, fidVar2, 0, 4);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            }), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListDebugViewKt$ListDebugViewPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i5) {
                    ListDebugViewKt.ListDebugViewPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    public static final h getLocalListSdkDebugViewFlags() {
        return LocalListSdkDebugViewFlags;
    }
}
