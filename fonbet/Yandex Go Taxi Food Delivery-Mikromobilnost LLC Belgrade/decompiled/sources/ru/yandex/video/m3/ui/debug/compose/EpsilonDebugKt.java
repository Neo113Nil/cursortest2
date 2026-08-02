package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.jl40;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.vvc;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y7m;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.debug.model.ListSdkPlayerDebugData;
import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.list_player_manager.model.MediaDataKt;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;
import ru.yandex.video.m3.ui.debug.EngineHolder;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;", "listState", "Lf530;", "modifier", "Lzy11;", "EpsilonDebug", "(Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;Lf530;Lfid;II)V", "", "Ly7m;", "calculateMaxColumnWidths", "(Lru/yandex/video/m3/debug/model/ListSdkPlayerDebugData;Lfid;I)Ljava/util/List;", "", Constants.KEY_DATA, "", "resId", "calculateCellWidth", "(Ljava/lang/Object;ILfid;I)F", "EpsilonDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EpsilonDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EpsilonDebug(final ListSdkPlayerDebugData listSdkPlayerDebugData, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        final f530 f530Var2;
        YandexPlayer<?> engine;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-713146495);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(listSdkPlayerDebugData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i3 & 19) == 18 || !btsVar.E()) {
                final f530 f530Var3 = i4 == 0 ? c530.a : f530Var2;
                if (Flags.INSTANCE.getListSdkDebugViewFlags(btsVar, 6).getShowEpsilonInfo()) {
                    aii0 v = btsVar.v();
                    if (v != null) {
                        v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebug$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar2, int i5) {
                                EpsilonDebugKt.EpsilonDebug(ListSdkPlayerDebugData.this, f530Var3, fidVar2, vng.O(i | 1), i2);
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
                List<y7m> calculateMaxColumnWidths = calculateMaxColumnWidths(listSdkPlayerDebugData, btsVar, i3 & 14);
                btsVar.f0(-483455358);
                boolean z = false;
                sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                btsVar.f0(-1323940314);
                int S = cma1.S(btsVar);
                r1b0 o = btsVar.o();
                ohd.G1.getClass();
                sls slsVar = d.b;
                a h = e.h(f530Var3);
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
                btsVar.f0(-68184317);
                for (MediaData mediaData : listSdkPlayerDebugData.getMediaData()) {
                    String videoContentId = mediaData.getVideoContentId();
                    Integer num = listSdkPlayerDebugData.getAttachedListPlayerIndex().get(mediaData);
                    EngineHolder engineHolder = listSdkPlayerDebugData.getAttachedEnginesData().get(mediaData);
                    Integer valueOf = (engineHolder == null || (engine = engineHolder.getEngine()) == null) ? null : Integer.valueOf(engine.getPlayerIndex());
                    PreloadState preloadState = listSdkPlayerDebugData.getPreloadData().get(mediaData);
                    VideoTrackData videoTrackData = listSdkPlayerDebugData.getVideoTrackData().get(mediaData);
                    EpsilonPlayerDebugKt.EpsilonPlayerDebug(videoContentId, num, valueOf, preloadState, videoTrackData != null ? videoTrackData.getResolution() : null, listSdkPlayerDebugData.getCurrentBufferSize().get(mediaData), jl40.l(listSdkPlayerDebugData.getActiveMediaData(), mediaData), calculateMaxColumnWidths, null, btsVar, 0, 256);
                    z = z;
                    f530Var3 = f530Var3;
                }
                f530 f530Var4 = f530Var3;
                boolean z2 = z;
                ly3.A(btsVar, z2, z2, true, z2);
                btsVar.t(z2);
                f530Var2 = f530Var4;
            } else {
                btsVar.Y();
            }
            aii0 v2 = btsVar.v();
            if (v2 != null) {
                v2.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebug$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i5) {
                        EpsilonDebugKt.EpsilonDebug(ListSdkPlayerDebugData.this, f530Var2, fidVar2, vng.O(i | 1), i2);
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
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (Flags.INSTANCE.getListSdkDebugViewFlags(btsVar, 6).getShowEpsilonInfo()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebugPreview$1] */
    public static final void EpsilonDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(314854214);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            EpsilonDebugKt$EpsilonDebugPreview$mediaData$1 epsilonDebugKt$EpsilonDebugPreview$mediaData$1 = new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebugPreview$mediaData$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("15155");
                }
            };
            EmptyList emptyList = EmptyList.a;
            final List g = scc.g(MediaDataKt.MediaData(emptyList, epsilonDebugKt$EpsilonDebugPreview$mediaData$1), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebugPreview$mediaData$2
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("221");
                }
            }), MediaDataKt.MediaData(emptyList, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebugPreview$mediaData$3
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MediaData.Builder) obj);
                    return zy11.a;
                }

                public final void invoke(MediaData.Builder builder) {
                    builder.setVideoContentId("34124214");
                }
            }));
            ThemeKt.DebugTheme(false, wwg.i(btsVar, -187227390, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebugPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i2) {
                    if ((i2 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    Map i3 = b.i(new Pair(g.get(0), 0), new Pair(g.get(1), 1), new Pair(g.get(2), 2));
                    EpsilonDebugKt.EpsilonDebug(new ListSdkPlayerDebugData(g, b.i(new Pair(g.get(0), PreloadState.SUCCESS), new Pair(g.get(1), PreloadState.ERROR), new Pair(g.get(2), PreloadState.NONE)), i3, null, null, null, null, null, null, b.i(new Pair(g.get(0), new VideoTrackData("1", 124421, new Size(1920, 1080))), new Pair(g.get(1), new VideoTrackData("2", 324421, new Size(3840, 2160))), new Pair(g.get(2), new VideoTrackData("3", 524421, new Size(1920, 1080)))), b.i(new Pair(g.get(0), new BufferSize(124414212144L, 1151241532L)), new Pair(g.get(1), new BufferSize(124414212144L, 1251241532L)), new Pair(g.get(2), new BufferSize(124414212144L, 1352241532L))), null, null, null, false, null, 63992, null), null, fidVar2, 0, 2);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonDebugKt$EpsilonDebugPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i2) {
                    EpsilonDebugKt.EpsilonDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    public static final float calculateCellWidth(Object obj, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(2018395674);
        int length = ohb1.e(btsVar, i).length() + BlocksKt.getDataText(Integer.valueOf(i), obj, btsVar, ((i2 << 3) & 112) | ((i2 >> 3) & 14)).length();
        float tableCharWidthMultiplier = (int) (Theme.INSTANCE.getSpacers(btsVar, 6).getTableCharWidthMultiplier() * (r2.getSpacers(btsVar, 6).getLabelSpace() + length));
        btsVar.t(false);
        return tableCharWidthMultiplier;
    }

    public static final List<y7m> calculateMaxColumnWidths(ListSdkPlayerDebugData listSdkPlayerDebugData, fid fidVar, int i) {
        YandexPlayer<?> engine;
        bts btsVar = (bts) fidVar;
        btsVar.f0(-676996018);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (MediaData mediaData : listSdkPlayerDebugData.getMediaData()) {
            f = ((y7m) vvc.c(new y7m(f), new y7m(calculateCellWidth(mediaData.getVideoContentId(), R.string.epsilonUuid, btsVar, 0)))).a;
            f2 = ((y7m) vvc.c(new y7m(f2), new y7m(calculateCellWidth(listSdkPlayerDebugData.getAttachedListPlayerIndex().get(mediaData), R.string.epsilonPlayerIndex, btsVar, 0)))).a;
            y7m y7mVar = new y7m(f3);
            EngineHolder engineHolder = listSdkPlayerDebugData.getAttachedEnginesData().get(mediaData);
            Size size = null;
            f3 = ((y7m) vvc.c(y7mVar, new y7m(calculateCellWidth((engineHolder == null || (engine = engineHolder.getEngine()) == null) ? null : Integer.valueOf(engine.getPlayerIndex()), R.string.epsilonEngineIndex, btsVar, 0)))).a;
            f4 = ((y7m) vvc.c(new y7m(f4), new y7m(calculateCellWidth(listSdkPlayerDebugData.getPreloadData().get(mediaData), R.string.epsilonPreloadState, btsVar, 0)))).a;
            y7m y7mVar2 = new y7m(f5);
            VideoTrackData videoTrackData = listSdkPlayerDebugData.getVideoTrackData().get(mediaData);
            if (videoTrackData != null) {
                size = videoTrackData.getResolution();
            }
            f5 = ((y7m) vvc.c(y7mVar2, new y7m(calculateCellWidth(size, R.string.epsilonCurrentQuality, btsVar, 0)))).a;
            f6 = ((y7m) vvc.c(new y7m(f6), new y7m(calculateCellWidth(listSdkPlayerDebugData.getCurrentBufferSize().get(mediaData), R.string.epsilonCurrentBufferSize, btsVar, 0)))).a;
        }
        List<y7m> g = scc.g(new y7m(f), new y7m(f2), new y7m(f3), new y7m(f4), new y7m(f5), new y7m(f6));
        btsVar.t(false);
        return g;
    }
}
