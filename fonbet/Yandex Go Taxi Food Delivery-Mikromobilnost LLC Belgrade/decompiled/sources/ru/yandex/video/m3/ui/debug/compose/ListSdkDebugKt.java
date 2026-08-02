package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d6w;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.i43;
import defpackage.imz;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
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
import ru.yandex.video.m3.debug.model.ListSdkPlayerDebugData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.MediaDataKt;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatDataKt;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.DebugData;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/DebugData;", "playerState", "Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "listState", "Lf530;", "modifier", "Lzy11;", "ListSdkDebug", "(Lru/yandex/video/m3/player/ui/debug/model/DebugData;Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;Lf530;Lfid;II)V", "ListSdkDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListSdkDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListSdkDebug(final DebugData debugData, final ListSdkPlayerDebugData listSdkPlayerDebugData, f530 f530Var, fid fidVar, final int i, final int i2) {
        DebugData debugData2;
        int i3;
        f530 f530Var2;
        final f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-458996846);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            debugData2 = debugData;
        } else if ((i & 6) == 0) {
            debugData2 = debugData;
            i3 = (btsVar.e(debugData2) ? 4 : 2) | i;
        } else {
            debugData2 = debugData;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(listSdkPlayerDebugData) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            if ((i3 & 147) == 146 || !btsVar.E()) {
                f530 f530Var4 = i4 == 0 ? c530.a : f530Var2;
                Theme theme = Theme.INSTANCE;
                i43 i43Var = new i43(theme.getSpacers(btsVar, 6).m962getVerticalArrangementD9Ej5fM(), true, new quz(11));
                f530 k = an91.k(m4m0.b(ljs0.c(f530Var4, 1.0f), theme.getColorScheme(btsVar, 6).m935getBackPrimary0d7_KjU(), cyk0.c(16.0f)), 8.0f);
                btsVar.f0(-483455358);
                sic a = qic.a(i43Var, x4c.G, btsVar, 0);
                btsVar.f0(-1323940314);
                int S = cma1.S(btsVar);
                r1b0 o = btsVar.o();
                ohd.G1.getClass();
                sls slsVar = d.b;
                a h = e.h(k);
                if (btsVar.a != null) {
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
                EpsilonDebugKt.EpsilonDebug(listSdkPlayerDebugData, null, btsVar, (i3 >> 3) & 14, 2);
                DecodersDebugKt.DecodersDebug(listSdkPlayerDebugData.getDecoderData(), btsVar, 0);
                SpeedTelemetryDebugKt.SpeedTelemetryDebug(listSdkPlayerDebugData.getSpeedTelemetry(), listSdkPlayerDebugData.getPlayDelta(), listSdkPlayerDebugData.isCompactView(), null, btsVar, 0, 8);
                FatalErrorDebugKt.FatalErrorDebug(listSdkPlayerDebugData.getNumOfFatals(), null, btsVar, 0, 2);
                IsStartFromCacheDebugKt.IsStartFromCacheDebug(listSdkPlayerDebugData.isStartFromCache(), null, btsVar, 0, 2);
                OnDemandStartDebugKt.OnDemandStartDebug(listSdkPlayerDebugData.isOnDemand(), null, btsVar, 0, 2);
                BandwidthDebugKt.BandwidthDebug(debugData2.getTs(), listSdkPlayerDebugData.getListBandwidthHistory(), null, btsVar, 0, 4);
                NetworkRequestsDebugKt.NetworkRequestsDebug(debugData2.getTs(), listSdkPlayerDebugData.getLoadedChunksHistory(), null, btsVar, 0, 4);
                ly3.A(btsVar, false, true, false, false);
                f530Var3 = f530Var4;
            } else {
                btsVar.Y();
                f530Var3 = f530Var2;
            }
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebug$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i5) {
                        ListSdkDebugKt.ListSdkDebug(DebugData.this, listSdkPlayerDebugData, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        if (i4 == 0) {
        }
        Theme theme2 = Theme.INSTANCE;
        i43 i43Var2 = new i43(theme2.getSpacers(btsVar, 6).m962getVerticalArrangementD9Ej5fM(), true, new quz(11));
        f530 k2 = an91.k(m4m0.b(ljs0.c(f530Var4, 1.0f), theme2.getColorScheme(btsVar, 6).m935getBackPrimary0d7_KjU(), cyk0.c(16.0f)), 8.0f);
        btsVar.f0(-483455358);
        sic a2 = qic.a(i43Var2, x4c.G, btsVar, 0);
        btsVar.f0(-1323940314);
        int S2 = cma1.S(btsVar);
        r1b0 o2 = btsVar.o();
        ohd.G1.getClass();
        sls slsVar2 = d.b;
        a h2 = e.h(k2);
        if (btsVar.a != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$1] */
    public static final void ListSdkDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(753605382);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            ListSdkDebugKt$ListSdkDebugPreview$mediaData$1 listSdkDebugKt$ListSdkDebugPreview$mediaData$1 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$mediaData$1
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
            final List g = scc.g(MediaDataKt.MediaData(emptyList, listSdkDebugKt$ListSdkDebugPreview$mediaData$1), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$mediaData$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("2");
                }
            }), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$mediaData$3
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("3");
                }
            }));
            final TrackFormatData TrackFormatData = TrackFormatDataKt.TrackFormatData("codec 1920x1080 testId", new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$trackFormatData$1
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
            final int i2 = 100;
            final long j = 100;
            final long j2 = 1000;
            final long j3 = 3900000;
            final long j4 = 103000000;
            final int i3 = 50;
            final int i4 = 30;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, 251523778, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    Long l = 2258L;
                    if ((i5 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    DebugData debugData = new DebugData("844434ccff37525ff5bbfab4a64dc6027f479736cd36xANDx0092x1608821923", null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, false, 67108862, null);
                    ArrayList arrayList = new ArrayList();
                    int i6 = i2;
                    long j5 = currentTimeMillis;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j4;
                    int i7 = 0;
                    while (i7 < i6) {
                        long j10 = j9;
                        BandwidthEstimation bandwidthEstimation = (BandwidthEstimation) kotlin.collections.a.b0(arrayList);
                        long timestamp = bandwidthEstimation != null ? bandwidthEstimation.getTimestamp() : j5;
                        int i8 = i7;
                        imz imzVar = new imz(j6, j7, false);
                        Random.Default r2 = Random.a;
                        arrayList.add(new BandwidthEstimation(timestamp - y6i0.k(imzVar, r2), y6i0.k(new imz(j8, j10, false), r2)));
                        i7 = i8 + 1;
                        j9 = j10;
                        l = l;
                        i6 = i6;
                        j5 = j5;
                    }
                    Long l2 = l;
                    List q0 = kotlin.collections.a.q0(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    int i9 = i3;
                    long j11 = currentTimeMillis;
                    long j12 = j;
                    long j13 = j2;
                    int i10 = i4;
                    int i11 = 0;
                    while (i11 < i9) {
                        LoadedChunk loadedChunk = (LoadedChunk) kotlin.collections.a.b0(arrayList2);
                        long timestamp2 = loadedChunk != null ? loadedChunk.getTimestamp() : j11;
                        long j14 = j12;
                        long j15 = j13;
                        imz imzVar2 = new imz(j14, j15, false);
                        Random.Default r7 = Random.a;
                        long k = timestamp2 - y6i0.k(imzVar2, r7);
                        List list = q0;
                        int i12 = i9;
                        arrayList2.add(new LoadedChunk(k, y6i0.j(new d6w(1, 100, 1), r7) < i10));
                        i11++;
                        q0 = list;
                        i9 = i12;
                        j12 = j14;
                        j13 = j15;
                    }
                    List list2 = q0;
                    List q02 = kotlin.collections.a.q0(arrayList2);
                    MediaData mediaData = g.get(1);
                    SpeedTelemetry speedTelemetry = new SpeedTelemetry("vplvqpheuhe4ee7lotxq", null, 280L, l2, l2, "start_playback");
                    Map i13 = b.i(new Pair(g.get(0), 0), new Pair(g.get(1), 1), new Pair(g.get(2), 2));
                    Map i14 = b.i(new Pair(g.get(0), PreloadState.SUCCESS), new Pair(g.get(1), PreloadState.ERROR), new Pair(g.get(2), PreloadState.NONE));
                    Map i15 = b.i(new Pair(g.get(0), new VideoTrackData("1", 124421, new Size(1920, 1080))), new Pair(g.get(1), new VideoTrackData("2", 324421, new Size(3840, 2160))), new Pair(g.get(2), new VideoTrackData("3", 524421, new Size(1920, 1080))));
                    Map i16 = b.i(new Pair(g.get(0), new BufferSize(124414212144L, 1151241532L)), new Pair(g.get(1), new BufferSize(124414212144L, 1251241532L)), new Pair(g.get(2), new BufferSize(124414212144L, 1352241532L)));
                    Map i17 = b.i(new Pair(0, DecoderEventDataKt.DecoderEventData("c2.android.avc.decoder", 2, 2, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$1.3
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(0);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(1, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 2, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$1.4
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(4);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(2, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 0, TrackFormatData, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$1.5
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(42);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })));
                    List<MediaData> list3 = g;
                    Boolean bool = Boolean.FALSE;
                    ListSdkDebugKt.ListSdkDebug(debugData, new ListSdkPlayerDebugData(list3, i14, i13, null, i17, 0, speedTelemetry, bool, bool, i15, i16, list2, q02, mediaData, false, null, 49160, null), null, fidVar2, 0, 4);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.ListSdkDebugKt$ListSdkDebugPreview$2
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
                    ListSdkDebugKt.ListSdkDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }
}
