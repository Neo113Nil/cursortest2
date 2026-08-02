package ru.yandex.video.m3.player.ui.debug.compose;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.h;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj91;
import defpackage.gns0;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.m4m0;
import defpackage.mhl0;
import defpackage.n4u0;
import defpackage.nhl0;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.si6;
import defpackage.sic;
import defpackage.sls;
import defpackage.tic;
import defpackage.uic;
import defpackage.uo5;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt;
import ru.yandex.video.m3.player.ui.debug.compose.util.StringFormattingUtilKt;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.ContentData;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfig;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfigKt;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlags;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewFlagsKt;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0006\u0010\f\u001a'\u0010\u0010\u001a\u00020\u0005*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0018\u001a\u00020\u0005*\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001e\u001a\u00020\u0005*\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010\"\u001a\u00020\u0005*\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\"\u0010#\u001a'\u0010&\u001a\u00020\u0005*\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b&\u0010'\u001aA\u0010-\u001a\u00020\u0005*\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b-\u0010.\u001a!\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b0\u00101\u001a%\u00103\u001a\u00020\u0005*\u0002022\u0006\u0010/\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b3\u00104\" \u00106\u001a\b\u0012\u0004\u0012\u00020\b058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020\u00168AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<²\u0006\f\u0010/\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"Ln4u0;", "Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "stateFlow", "Lf530;", "modifier", "Lzy11;", "DebugView", "(Ln4u0;Lf530;Lfid;II)V", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;", "playerDebugViewFlags", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "playerDebugViewConfig", "(Ln4u0;Lf530;Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewFlags;Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;Lfid;II)V", "Ltic;", "", "vsid", "VsidBlock", "(Ltic;Ljava/lang/String;Lf530;Lfid;II)V", "Lru/yandex/video/m3/player/ui/debug/model/ContentData;", "contentData", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "drmMode", "", "isCompact", "ContentBlock", "(Ltic;Lru/yandex/video/m3/player/ui/debug/model/ContentData;Lru/yandex/video/m3/player/ui/debug/model/DrmMode;ZLf530;Lfid;II)V", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "videoTrackData", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "audioTrackData", "VideoAndAudioTracksBlock", "(Ltic;Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;ZLf530;Lfid;II)V", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "subtitlesTrackData", "SubtitlesTrackBlock", "(Ltic;Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;ZLf530;Lfid;II)V", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "viewPortSize", "ViewportBlock", "(Ltic;Lru/yandex/video/m3/player/ui/debug/model/Size;Lf530;Lfid;II)V", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "videoDecoderData", "audioDecoderData", "", "droppedFrames", "VideoAndAudioCodecBlock", "(Ltic;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;Lru/yandex/video/m3/player/ui/debug/model/DecoderData;IZLf530;Lfid;II)V", ClidProvider.STATE, "GraphsAndQrBlock", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;Lf530;Lfid;II)V", "Lmhl0;", "DebugBlockWithGraphs", "(Lmhl0;Lru/yandex/video/m3/player/ui/debug/model/DebugData;Lf530;Lfid;II)V", "Landroidx/compose/runtime/h;", "LocalPlayerDebugViewFlags", "Landroidx/compose/runtime/h;", "getLocalPlayerDebugViewFlags", "()Landroidx/compose/runtime/h;", "isLandscape", "(Lfid;I)Z", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugViewKt {
    private static final h LocalPlayerDebugViewFlags = new qwd(new sls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$LocalPlayerDebugViewFlags$1
        @Override // defpackage.sls
        public final PlayerDebugViewFlags invoke() {
            return PlayerDebugViewFlagsKt.PlayerDebugViewFlags$default(null, 1, null);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContentBlock(final tic ticVar, final ContentData contentData, final DrmMode drmMode, final boolean z, f530 f530Var, fid fidVar, final int i, final int i2) {
        tic ticVar2;
        int i3;
        f530 f530Var2;
        final f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1068870031);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            ticVar2 = ticVar;
        } else {
            ticVar2 = ticVar;
            if ((i & 6) == 0) {
                i3 = (btsVar.k(ticVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(contentData) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(drmMode) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.a(z) ? 2048 : 1024;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 16384 : 8192;
            if ((i3 & 9363) == 9362 || !btsVar.E()) {
                f530 f530Var4 = i4 == 0 ? c530.a : f530Var2;
                String e = ohb1.e(btsVar, R.string.content_label);
                int i5 = i3 >> 3;
                String textForContent = StringFormattingUtilKt.getTextForContent(contentData, drmMode, z, btsVar, i5 & 1022);
                Flags flags = Flags.INSTANCE;
                BlocksKt.DebugBlock(ticVar2, e, textForContent, f530Var4, flags.getPlayerDebugViewFlags(btsVar, 6).getShowDrm(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowDrmLabel(), btsVar, (i3 & 14) | (i5 & 7168), 0);
                f530Var3 = f530Var4;
            } else {
                btsVar.Y();
                f530Var3 = f530Var2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$ContentBlock$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i6) {
                        DebugViewKt.ContentBlock(tic.this, contentData, drmMode, z, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        if ((i3 & 9363) == 9362) {
        }
        if (i4 == 0) {
        }
        String e2 = ohb1.e(btsVar, R.string.content_label);
        int i52 = i3 >> 3;
        String textForContent2 = StringFormattingUtilKt.getTextForContent(contentData, drmMode, z, btsVar, i52 & 1022);
        Flags flags2 = Flags.INSTANCE;
        BlocksKt.DebugBlock(ticVar2, e2, textForContent2, f530Var4, flags2.getPlayerDebugViewFlags(btsVar, 6).getShowDrm(), flags2.getPlayerDebugViewFlags(btsVar, 6).getShowDrmLabel(), btsVar, (i3 & 14) | (i52 & 7168), 0);
        f530Var3 = f530Var4;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlockWithGraphs(final mhl0 mhl0Var, DebugData debugData, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        final DebugData debugData2;
        int i4;
        f530 f530Var2;
        boolean z;
        final f530 f530Var3;
        CurrentVideoType videoType;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-220750962);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(mhl0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            debugData2 = debugData;
            i3 |= btsVar.e(debugData2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f530Var2 = f530Var;
                i3 |= btsVar.k(f530Var2) ? 256 : 128;
                if ((i3 & 147) == 146 || !btsVar.E()) {
                    f530 f530Var4 = i4 != 0 ? c530.a : f530Var2;
                    f530 a = mhl0Var.a(f530Var4, isLandscape(btsVar, 0) ? 0.8f : 0.75f, true);
                    btsVar.f0(-483455358);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
                    btsVar.f0(-1323940314);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    a h = e.h(a);
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a2);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    h.invoke(new gns0(btsVar), btsVar, 0);
                    btsVar.f0(2058660585);
                    String e = ohb1.e(btsVar, R.string.bandwidth_estimation_label);
                    String textForBandwidthEstimation = StringFormattingUtilKt.getTextForBandwidthEstimation(debugData2.getLastBandwidthEstimation(), btsVar, 0);
                    f530 f530Var5 = f530Var4;
                    List<BandwidthEstimation> bandwidthEstimationsHistory = debugData2.getBandwidthEstimationsHistory();
                    long ts = debugData2.getTs();
                    Flags flags = Flags.INSTANCE;
                    boolean showBandwidthEstimation = flags.getPlayerDebugViewFlags(btsVar, 6).getShowBandwidthEstimation();
                    boolean showBandwidthEstimationLabel = flags.getPlayerDebugViewFlags(btsVar, 6).getShowBandwidthEstimationLabel();
                    int i5 = 6 | ((i3 << 9) & ImageMetadata.JPEG_GPS_COORDINATES);
                    uic uicVar = uic.a;
                    BlocksKt.DebugBlockWithLineGraph(uicVar, e, textForBandwidthEstimation, bandwidthEstimationsHistory, ts, f530Var5, showBandwidthEstimation, showBandwidthEstimationLabel, btsVar, i5, 0);
                    oeb1.c(btsVar, ljs0.e(f530Var5, 2.0f));
                    int i6 = i3;
                    BlocksKt.DebugBlockWithLineGraph(uicVar, ohb1.e(btsVar, R.string.buffer_size_label), StringFormattingUtilKt.getTextForBuffersSize(debugData2.getCurrentBufferSize(), debugData2.getTargetBufferSize(), btsVar, 0), debugData2.getBufferSizeHistory(), debugData2.getTs(), f530Var5, flags.getPlayerDebugViewFlags(btsVar, 6).getShowBufferSize(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowBufferSizeLabel(), btsVar, i5, 0);
                    oeb1.c(btsVar, ljs0.e(f530Var5, 2.0f));
                    BlocksKt.DebugBlockWithLoadedChunkGraph(uicVar, ohb1.e(btsVar, R.string.bytes_loaded_label), StringFormattingUtilKt.getTextForBytesLoaded(debugData2.getBytesLoaded(), btsVar, 0), debugData2.getLoadedChunksHistory(), debugData2.getTs(), f530Var5, flags.getPlayerDebugViewFlags(btsVar, 6).getShowBytesLoaded(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowBytesLoadedLabel(), btsVar, i5, 0);
                    btsVar = btsVar;
                    LatencyData latencyData = debugData2.getLatencyData();
                    ContentData contentData = debugData2.getContentData();
                    boolean z2 = (contentData == null || (videoType = contentData.getVideoType()) == null || (videoType != CurrentVideoType.LIVE && videoType != CurrentVideoType.EVENT)) ? false : true;
                    btsVar.f0(1789155981);
                    if (latencyData != null && z2) {
                        BlocksKt.DebugBlockWithQr(uicVar, ohb1.e(btsVar, R.string.latency_label), StringFormattingUtilKt.getTextForLatency(latencyData, btsVar, 0), f530Var5, flags.getPlayerDebugViewFlags(btsVar, 6).getShowLatency(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowLatencyLabel(), btsVar, ((i6 << 3) & 7168) | 6, 0);
                    }
                    btsVar.t(false);
                    int i7 = 6 | ((i6 << 3) & 7168);
                    BlocksKt.DebugBlockWithQr(uicVar, ohb1.e(btsVar, R.string.extra_info_label), StringFormattingUtilKt.getTextForExtraInfo(debugData2.getNetworkTypeName(), debugData2.getDateTime(), btsVar, 0), f530Var5, flags.getPlayerDebugViewFlags(btsVar, 6).getShowExtraInfo(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowExtraInfoLabel(), btsVar, i7, 0);
                    btsVar.f0(1789182060);
                    if (debugData2.getLastError() != null) {
                        z = false;
                        BlocksKt.DebugBlockWithQr(uicVar, ohb1.e(btsVar, R.string.last_error_label), StringFormattingUtilKt.getTextForLastError(debugData2.getLastError(), btsVar, 0), f530Var5, flags.getPlayerDebugViewFlags(btsVar, 6).getShowLastError(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowLastErrorLabel(), btsVar, i7, 0);
                    } else {
                        z = false;
                    }
                    ly3.A(btsVar, z, z, true, z);
                    btsVar.t(z);
                    f530Var3 = f530Var5;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                }
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugBlockWithGraphs$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(fid fidVar2, int i8) {
                            DebugViewKt.DebugBlockWithGraphs(mhl0.this, debugData2, f530Var3, fidVar2, vng.O(i | 1), i2);
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
            if ((i3 & 147) == 146) {
            }
            if (i4 != 0) {
            }
            f530 a3 = mhl0Var.a(f530Var4, isLandscape(btsVar, 0) ? 0.8f : 0.75f, true);
            btsVar.f0(-483455358);
            sic a22 = qic.a(lr20.c, x4c.G, btsVar, 0);
            btsVar.f0(-1323940314);
            int S2 = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            a h2 = e.h(a3);
            if (btsVar.a == null) {
            }
        }
        debugData2 = debugData;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        f530Var2 = f530Var;
        if ((i3 & 147) == 146) {
        }
        if (i4 != 0) {
        }
        f530 a32 = mhl0Var.a(f530Var4, isLandscape(btsVar, 0) ? 0.8f : 0.75f, true);
        btsVar.f0(-483455358);
        sic a222 = qic.a(lr20.c, x4c.G, btsVar, 0);
        btsVar.f0(-1323940314);
        int S22 = cma1.S(btsVar);
        r1b0 o22 = btsVar.o();
        ohd.G1.getClass();
        sls slsVar22 = d.b;
        a h22 = e.h(a32);
        if (btsVar.a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if ((r16 & 8) != 0) goto L58;
     */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugView$2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugView(final n4u0 n4u0Var, final f530 f530Var, PlayerDebugViewFlags playerDebugViewFlags, final PlayerDebugViewConfig playerDebugViewConfig, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-905909998);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.e(n4u0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && btsVar.k(playerDebugViewFlags)) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= ((i2 & 8) == 0 && btsVar.k(playerDebugViewConfig)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if (i4 != 0) {
                    f530Var = c530.a;
                }
                if ((i2 & 4) != 0) {
                    playerDebugViewFlags = PlayerDebugViewFlagsKt.PlayerDebugViewFlags$default(null, 1, null);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    playerDebugViewConfig = PlayerDebugViewConfigKt.PlayerDebugViewConfig$default(null, 1, null);
                    i3 &= -7169;
                }
                btsVar.u();
                final oz40 c = androidx.lifecycle.compose.a.c(n4u0Var, null, btsVar, i3 & 14, 7);
                sb2.b(LocalPlayerDebugViewFlags.a(playerDebugViewFlags), wwg.i(btsVar, -2066768430, new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugView$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugView$2$1] */
                    public final void invoke(fid fidVar2, int i5) {
                        if ((i5 & 3) == 2) {
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.E()) {
                                btsVar2.Y();
                                return;
                            }
                        }
                        PlayerDebugViewConfig playerDebugViewConfig2 = PlayerDebugViewConfig.this;
                        final f530 f530Var2 = f530Var;
                        final m3u0 m3u0Var = c;
                        ThemeKt.DebugTheme(false, playerDebugViewConfig2, wwg.i(fidVar2, -1642474985, new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugView$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar3, int i6) {
                                DebugData DebugView$lambda$0;
                                DebugData DebugView$lambda$02;
                                DebugData DebugView$lambda$03;
                                DebugData DebugView$lambda$04;
                                DebugData DebugView$lambda$05;
                                DebugData DebugView$lambda$06;
                                DebugData DebugView$lambda$07;
                                DebugData DebugView$lambda$08;
                                DebugData DebugView$lambda$09;
                                DebugData DebugView$lambda$010;
                                DebugData DebugView$lambda$011;
                                DebugData DebugView$lambda$012;
                                DebugData DebugView$lambda$013;
                                DebugData DebugView$lambda$014;
                                DebugData DebugView$lambda$015;
                                DebugData DebugView$lambda$016;
                                if ((i6 & 3) == 2) {
                                    bts btsVar3 = (bts) fidVar3;
                                    if (btsVar3.E()) {
                                        btsVar3.Y();
                                        return;
                                    }
                                }
                                f530 b = m4m0.b(fj91.c(ljs0.c(f530.this, 1.0f), IntrinsicSize.Min), Theme.INSTANCE.getColorScheme(fidVar3, 6).m831getBackPrimary0d7_KjU(), cyk0.c(16.0f));
                                uo5 uo5Var = x4c.y;
                                f530 f530Var3 = f530.this;
                                m3u0 m3u0Var2 = m3u0Var;
                                bts btsVar4 = (bts) fidVar3;
                                btsVar4.f0(733328855);
                                dmw0 dmw0Var = btsVar4.a;
                                si6 e = pi6.e(uo5Var, btsVar4, 6);
                                btsVar4.f0(-1323940314);
                                int S = cma1.S(btsVar4);
                                r1b0 o = btsVar4.o();
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                a h = e.h(b);
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar);
                                } else {
                                    btsVar4.r0();
                                }
                                wls wlsVar = d.f;
                                qje.W(btsVar4, wlsVar, e);
                                wls wlsVar2 = d.e;
                                qje.W(btsVar4, wlsVar2, o);
                                wls wlsVar3 = d.g;
                                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(S))) {
                                    b64.z(S, btsVar4, S, wlsVar3);
                                }
                                h.invoke(new gns0(btsVar4), btsVar4, 0);
                                btsVar4.f0(2058660585);
                                f530 k = an91.k(f530Var3, 4.0f);
                                btsVar4.f0(-483455358);
                                sic a = qic.a(lr20.c, x4c.G, btsVar4, 0);
                                btsVar4.f0(-1323940314);
                                int S2 = cma1.S(btsVar4);
                                r1b0 o2 = btsVar4.o();
                                a h2 = e.h(k);
                                btsVar4.i0();
                                if (btsVar4.S) {
                                    btsVar4.n(slsVar);
                                } else {
                                    btsVar4.r0();
                                }
                                qje.W(btsVar4, wlsVar, a);
                                qje.W(btsVar4, wlsVar2, o2);
                                if (btsVar4.S || !jl40.l(btsVar4.Q(), Integer.valueOf(S2))) {
                                    b64.z(S2, btsVar4, S2, wlsVar3);
                                }
                                h2.invoke(new gns0(btsVar4), btsVar4, 0);
                                btsVar4.f0(2058660585);
                                DebugView$lambda$0 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                String vsid = DebugView$lambda$0.getVsid();
                                uic uicVar = uic.a;
                                DebugViewKt.VsidBlock(uicVar, vsid, f530Var3, btsVar4, 6, 0);
                                DebugView$lambda$02 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                ContentData contentData = DebugView$lambda$02.getContentData();
                                DebugView$lambda$03 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DrmMode drmMode = DebugView$lambda$03.getDrmMode();
                                DebugView$lambda$04 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DebugViewKt.ContentBlock(uicVar, contentData, drmMode, DebugView$lambda$04.isCompact(), f530Var3, btsVar4, 6, 0);
                                DebugView$lambda$05 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                VideoTrackData videoTrackData = DebugView$lambda$05.getVideoTrackData();
                                DebugView$lambda$06 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                AudioTrackData audioTrackData = DebugView$lambda$06.getAudioTrackData();
                                DebugView$lambda$07 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DebugViewKt.VideoAndAudioTracksBlock(uicVar, videoTrackData, audioTrackData, DebugView$lambda$07.isCompact(), f530Var3, btsVar4, 6, 0);
                                DebugView$lambda$08 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                SubtitlesTrackData subtitlesTrackData = DebugView$lambda$08.getSubtitlesTrackData();
                                DebugView$lambda$09 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DebugViewKt.SubtitlesTrackBlock(uicVar, subtitlesTrackData, DebugView$lambda$09.isCompact(), f530Var3, btsVar4, 6, 0);
                                DebugView$lambda$010 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DebugViewKt.ViewportBlock(uicVar, DebugView$lambda$010.getViewPortSize(), f530Var3, btsVar4, 6, 0);
                                DebugView$lambda$011 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DecoderData videoDecoderData = DebugView$lambda$011.getVideoDecoderData();
                                DebugView$lambda$012 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DecoderData audioDecoderData = DebugView$lambda$012.getAudioDecoderData();
                                DebugView$lambda$013 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                int droppedFrames = DebugView$lambda$013.getDroppedFrames();
                                DebugView$lambda$014 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                DebugViewKt.VideoAndAudioCodecBlock(uicVar, videoDecoderData, audioDecoderData, droppedFrames, DebugView$lambda$014.isCompact(), f530Var3, btsVar4, 6, 0);
                                btsVar4.f0(-618953414);
                                DebugView$lambda$015 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                if (!DebugView$lambda$015.isCompact()) {
                                    DebugView$lambda$016 = DebugViewKt.DebugView$lambda$0(m3u0Var2);
                                    DebugViewKt.GraphsAndQrBlock(DebugView$lambda$016, f530Var3, btsVar4, 0, 0);
                                }
                                ly3.A(btsVar4, false, false, true, false);
                                ly3.A(btsVar4, false, false, true, false);
                                btsVar4.t(false);
                            }

                            @Override // defpackage.wls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((fid) obj, ((Number) obj2).intValue());
                                return zy11.a;
                            }
                        }), fidVar2, 384, 1);
                    }

                    @Override // defpackage.wls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((fid) obj, ((Number) obj2).intValue());
                        return zy11.a;
                    }
                }), btsVar, 56);
            } else {
                btsVar.Y();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
        }
        final f530 f530Var2 = f530Var;
        final PlayerDebugViewFlags playerDebugViewFlags2 = playerDebugViewFlags;
        final PlayerDebugViewConfig playerDebugViewConfig2 = playerDebugViewConfig;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    DebugViewKt.DebugView(n4u0.this, f530Var2, playerDebugViewFlags2, playerDebugViewConfig2, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebugData DebugView$lambda$0(m3u0 m3u0Var) {
        return (DebugData) m3u0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GraphsAndQrBlock(final DebugData debugData, final f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1127788655);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.e(debugData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            c530 c530Var = c530.a;
            f530 f530Var2 = i4 != 0 ? c530Var : f530Var;
            btsVar.f0(693286680);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            btsVar.f0(-1323940314);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            ohd.G1.getClass();
            sls slsVar = d.b;
            a h = e.h(c530Var);
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar);
            }
            h.invoke(new gns0(btsVar), btsVar, 0);
            btsVar.f0(2058660585);
            int i5 = i3 << 3;
            nhl0 nhl0Var = nhl0.a;
            DebugBlockWithGraphs(nhl0Var, debugData, f530Var2, btsVar, (i5 & 112) | 6 | (i5 & 896), 0);
            f530 f530Var3 = f530Var2;
            QrCodeKt.QrCode(nhl0Var, debugData.getVsid(), debugData.getVsidBitmap(), debugData.getSessionColor(), f530Var3, btsVar, 6 | ((i3 << 9) & HProv.ALG_CLASS_ALL), 0);
            btsVar = btsVar;
            ly3.A(btsVar, false, true, false, false);
            f530Var = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$GraphsAndQrBlock$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i6) {
                    DebugViewKt.GraphsAndQrBlock(DebugData.this, f530Var, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubtitlesTrackBlock(tic ticVar, final SubtitlesTrackData subtitlesTrackData, final boolean z, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        tic ticVar2;
        final f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2023424689);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(ticVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(subtitlesTrackData) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.a(z) ? 256 : 128;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            ticVar2 = ticVar;
            f530Var2 = f530Var;
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var3 = f530Var;
            String e = ohb1.e(btsVar, R.string.subtitles_track_label);
            String textForSubtitlesTrack = StringFormattingUtilKt.getTextForSubtitlesTrack(subtitlesTrackData, z, btsVar, (i3 >> 3) & HProv.PP_DELETE_SAVED_PASSWD);
            Flags flags = Flags.INSTANCE;
            ticVar2 = ticVar;
            BlocksKt.DebugBlock(ticVar2, e, textForSubtitlesTrack, f530Var3, flags.getPlayerDebugViewFlags(btsVar, 6).getShowSubtitlesTrack(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowSubtitlesTrackLabel(), btsVar, i3 & 7182, 0);
            f530Var2 = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final tic ticVar3 = ticVar2;
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$SubtitlesTrackBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    DebugViewKt.SubtitlesTrackBlock(tic.this, subtitlesTrackData, z, f530Var2, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoAndAudioCodecBlock(final tic ticVar, final DecoderData decoderData, final DecoderData decoderData2, int i, final boolean z, f530 f530Var, fid fidVar, final int i2, final int i3) {
        int i4;
        final int i5;
        int i6;
        f530 f530Var2;
        final f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(73893652);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (btsVar.k(ticVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= btsVar.k(decoderData) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= btsVar.k(decoderData2) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i5 = i;
            i4 |= btsVar.c(i5) ? 2048 : 1024;
            if ((i3 & 8) == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i4 |= btsVar.a(z) ? 16384 : 8192;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i2) == 0) {
                f530Var2 = f530Var;
                i4 |= btsVar.k(f530Var2) ? 131072 : 65536;
                if ((74899 & i4) == 74898 || !btsVar.E()) {
                    c530 c530Var = c530.a;
                    f530 f530Var4 = i6 != 0 ? c530Var : f530Var2;
                    String e = ohb1.e(btsVar, R.string.video_decoder_label);
                    int i7 = i4 >> 6;
                    String textForVideoCodec = StringFormattingUtilKt.getTextForVideoCodec(decoderData, Integer.valueOf(i5), z, btsVar, ((i4 >> 3) & 14) | (i7 & 112) | (i7 & 896));
                    String e2 = ohb1.e(btsVar, R.string.audio_decoder_label);
                    String textForAudioCodec = StringFormattingUtilKt.getTextForAudioCodec(decoderData2, z, btsVar, (i7 & 14) | ((i4 >> 9) & 112));
                    if (isLandscape(btsVar, 0)) {
                        btsVar.f0(-1221290723);
                        btsVar.f0(693286680);
                        lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
                        btsVar.f0(-1323940314);
                        int S = cma1.S(btsVar);
                        r1b0 o = btsVar.o();
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        a h = e.h(c530Var);
                        if (btsVar.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, d.f, a);
                        qje.W(btsVar, d.e, o);
                        wls wlsVar = d.g;
                        if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                            b64.z(S, btsVar, S, wlsVar);
                        }
                        h.invoke(new gns0(btsVar), btsVar, 0);
                        btsVar.f0(2058660585);
                        Flags flags = Flags.INSTANCE;
                        boolean showVideoDecoder = flags.getPlayerDebugViewFlags(btsVar, 6).getShowVideoDecoder();
                        boolean showVideoDecoderLabel = flags.getPlayerDebugViewFlags(btsVar, 6).getShowVideoDecoderLabel();
                        int i8 = 6 | (i7 & 7168);
                        nhl0 nhl0Var = nhl0.a;
                        BlocksKt.DebugBlock(nhl0Var, e, textForVideoCodec, f530Var4, showVideoDecoder, showVideoDecoderLabel, btsVar, i8, 0);
                        BlocksKt.DebugBlock(nhl0Var, e2, textForAudioCodec, f530Var4, flags.getPlayerDebugViewFlags(btsVar, 6).getShowAudioDecoder(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowAudioDecoderLabel(), btsVar, i8, 0);
                        ly3.A(btsVar, false, true, false, false);
                        btsVar.t(false);
                    } else {
                        btsVar.f0(-1220657331);
                        Flags flags2 = Flags.INSTANCE;
                        int i9 = (i4 & 14) | (i7 & 7168);
                        BlocksKt.DebugBlock(ticVar, e, textForVideoCodec, f530Var4, flags2.getPlayerDebugViewFlags(btsVar, 6).getShowVideoDecoder(), flags2.getPlayerDebugViewFlags(btsVar, 6).getShowVideoDecoderLabel(), btsVar, i9, 0);
                        BlocksKt.DebugBlock(ticVar, e2, textForAudioCodec, f530Var4, flags2.getPlayerDebugViewFlags(btsVar, 6).getShowAudioDecoder(), flags2.getPlayerDebugViewFlags(btsVar, 6).getShowAudioDecoderLabel(), btsVar, i9, 0);
                        btsVar.t(false);
                    }
                    f530Var3 = f530Var4;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$VideoAndAudioCodecBlock$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(fid fidVar2, int i10) {
                            DebugViewKt.VideoAndAudioCodecBlock(tic.this, decoderData, decoderData2, i5, z, f530Var3, fidVar2, vng.O(i2 | 1), i3);
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
            if ((74899 & i4) == 74898) {
            }
            c530 c530Var2 = c530.a;
            if (i6 != 0) {
            }
            String e3 = ohb1.e(btsVar, R.string.video_decoder_label);
            int i72 = i4 >> 6;
            String textForVideoCodec2 = StringFormattingUtilKt.getTextForVideoCodec(decoderData, Integer.valueOf(i5), z, btsVar, ((i4 >> 3) & 14) | (i72 & 112) | (i72 & 896));
            String e22 = ohb1.e(btsVar, R.string.audio_decoder_label);
            String textForAudioCodec2 = StringFormattingUtilKt.getTextForAudioCodec(decoderData2, z, btsVar, (i72 & 14) | ((i4 >> 9) & 112));
            if (isLandscape(btsVar, 0)) {
            }
            f530Var3 = f530Var4;
            v = btsVar.v();
            if (v != null) {
            }
        }
        i5 = i;
        if ((i3 & 8) == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        f530Var2 = f530Var;
        if ((74899 & i4) == 74898) {
        }
        c530 c530Var22 = c530.a;
        if (i6 != 0) {
        }
        String e32 = ohb1.e(btsVar, R.string.video_decoder_label);
        int i722 = i4 >> 6;
        String textForVideoCodec22 = StringFormattingUtilKt.getTextForVideoCodec(decoderData, Integer.valueOf(i5), z, btsVar, ((i4 >> 3) & 14) | (i722 & 112) | (i722 & 896));
        String e222 = ohb1.e(btsVar, R.string.audio_decoder_label);
        String textForAudioCodec22 = StringFormattingUtilKt.getTextForAudioCodec(decoderData2, z, btsVar, (i722 & 14) | ((i4 >> 9) & 112));
        if (isLandscape(btsVar, 0)) {
        }
        f530Var3 = f530Var4;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoAndAudioTracksBlock(final tic ticVar, final VideoTrackData videoTrackData, final AudioTrackData audioTrackData, final boolean z, f530 f530Var, fid fidVar, final int i, final int i2) {
        tic ticVar2;
        int i3;
        f530 f530Var2;
        final f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-461443808);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            ticVar2 = ticVar;
        } else {
            ticVar2 = ticVar;
            if ((i & 6) == 0) {
                i3 = (btsVar.k(ticVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(videoTrackData) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(audioTrackData) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.a(z) ? 2048 : 1024;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 16384 : 8192;
            if ((i3 & 9363) == 9362 || !btsVar.E()) {
                c530 c530Var = c530.a;
                f530 f530Var4 = i4 == 0 ? c530Var : f530Var2;
                String e = ohb1.e(btsVar, R.string.video_track_label);
                int i5 = i3 >> 3;
                int i6 = i3 >> 6;
                String textForVideoTrack = StringFormattingUtilKt.getTextForVideoTrack(videoTrackData, z, btsVar, (i5 & 14) | (i6 & 112));
                String e2 = ohb1.e(btsVar, R.string.audio_track_label);
                String textForAudioTrack = StringFormattingUtilKt.getTextForAudioTrack(audioTrackData, z, btsVar, i6 & HProv.PP_DELETE_SAVED_PASSWD);
                if (isLandscape(btsVar, 0)) {
                    btsVar.f0(348786637);
                    Flags flags = Flags.INSTANCE;
                    int i7 = (i3 & 14) | (i5 & 7168);
                    BlocksKt.DebugBlock(ticVar2, e, textForVideoTrack, f530Var4, flags.getPlayerDebugViewFlags(btsVar, 6).getShowVideoTrack(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowVideoTrackLabel(), btsVar, i7, 0);
                    BlocksKt.DebugBlock(ticVar, e2, textForAudioTrack, f530Var4, flags.getPlayerDebugViewFlags(btsVar, 6).getShowAudioTrack(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowAudioTrackLabel(), btsVar, i7, 0);
                    btsVar.t(false);
                } else {
                    btsVar.f0(348161181);
                    btsVar.f0(693286680);
                    lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
                    btsVar.f0(-1323940314);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    a h = e.h(c530Var);
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar, S, wlsVar);
                    }
                    h.invoke(new gns0(btsVar), btsVar, 0);
                    btsVar.f0(2058660585);
                    Flags flags2 = Flags.INSTANCE;
                    boolean showVideoTrack = flags2.getPlayerDebugViewFlags(btsVar, 6).getShowVideoTrack();
                    boolean showVideoTrackLabel = flags2.getPlayerDebugViewFlags(btsVar, 6).getShowVideoTrackLabel();
                    int i8 = 6 | (i5 & 7168);
                    nhl0 nhl0Var = nhl0.a;
                    BlocksKt.DebugBlock(nhl0Var, e, textForVideoTrack, f530Var4, showVideoTrack, showVideoTrackLabel, btsVar, i8, 0);
                    BlocksKt.DebugBlock(nhl0Var, e2, textForAudioTrack, f530Var4, flags2.getPlayerDebugViewFlags(btsVar, 6).getShowAudioTrack(), flags2.getPlayerDebugViewFlags(btsVar, 6).getShowAudioTrackLabel(), btsVar, i8, 0);
                    ly3.A(btsVar, false, true, false, false);
                    btsVar.t(false);
                }
                f530Var3 = f530Var4;
            } else {
                btsVar.Y();
                f530Var3 = f530Var2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$VideoAndAudioTracksBlock$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i9) {
                        DebugViewKt.VideoAndAudioTracksBlock(tic.this, videoTrackData, audioTrackData, z, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        if ((i3 & 9363) == 9362) {
        }
        c530 c530Var2 = c530.a;
        if (i4 == 0) {
        }
        String e3 = ohb1.e(btsVar, R.string.video_track_label);
        int i52 = i3 >> 3;
        int i62 = i3 >> 6;
        String textForVideoTrack2 = StringFormattingUtilKt.getTextForVideoTrack(videoTrackData, z, btsVar, (i52 & 14) | (i62 & 112));
        String e22 = ohb1.e(btsVar, R.string.audio_track_label);
        String textForAudioTrack2 = StringFormattingUtilKt.getTextForAudioTrack(audioTrackData, z, btsVar, i62 & HProv.PP_DELETE_SAVED_PASSWD);
        if (isLandscape(btsVar, 0)) {
        }
        f530Var3 = f530Var4;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViewportBlock(tic ticVar, final Size size, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        tic ticVar2;
        final f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-442871730);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(ticVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(size) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            ticVar2 = ticVar;
            f530Var2 = f530Var;
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var3 = f530Var;
            String e = ohb1.e(btsVar, R.string.viewport_size_label);
            String textForViewportSize = StringFormattingUtilKt.getTextForViewportSize(size, btsVar, (i3 >> 3) & 14);
            Flags flags = Flags.INSTANCE;
            ticVar2 = ticVar;
            BlocksKt.DebugBlock(ticVar2, e, textForViewportSize, f530Var3, flags.getPlayerDebugViewFlags(btsVar, 6).getShowViewportSize(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowViewportSizeLabel(), btsVar, (i3 & 14) | ((i3 << 3) & 7168), 0);
            f530Var2 = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final tic ticVar3 = ticVar2;
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$ViewportBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    DebugViewKt.ViewportBlock(tic.this, size, f530Var2, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VsidBlock(tic ticVar, final String str, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        tic ticVar2;
        final f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1835137996);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(ticVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            ticVar2 = ticVar;
            f530Var2 = f530Var;
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var3 = f530Var;
            String e = ohb1.e(btsVar, R.string.vsid_label);
            String textForVsid = StringFormattingUtilKt.getTextForVsid(str, btsVar, (i3 >> 3) & 14);
            Flags flags = Flags.INSTANCE;
            ticVar2 = ticVar;
            BlocksKt.DebugBlock(ticVar2, e, textForVsid, f530Var3, flags.getPlayerDebugViewFlags(btsVar, 6).getShowVsid(), flags.getPlayerDebugViewFlags(btsVar, 6).getShowVsidLabel(), btsVar, (i3 & 14) | ((i3 << 3) & 7168), 0);
            f530Var2 = f530Var3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final tic ticVar3 = ticVar2;
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$VsidBlock$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    DebugViewKt.VsidBlock(tic.this, str, f530Var2, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    public static final h getLocalPlayerDebugViewFlags() {
        return LocalPlayerDebugViewFlags;
    }

    public static final boolean isLandscape(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1091839180);
        boolean z = ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).orientation == 2;
        btsVar.t(false);
        return z;
    }

    public static final void DebugView(n4u0 n4u0Var, final f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        final n4u0 n4u0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-291380563);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.e(n4u0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
            n4u0Var2 = n4u0Var;
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var2 = f530Var;
            n4u0Var2 = n4u0Var;
            DebugView(n4u0Var2, f530Var2, null, PlayerDebugViewConfigKt.PlayerDebugViewConfig$default(null, 1, null), btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD, 4);
            f530Var = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.DebugViewKt$DebugView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    DebugViewKt.DebugView(n4u0.this, f530Var, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }
}
