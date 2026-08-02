package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.g43;
import defpackage.gns0;
import defpackage.i43;
import defpackage.imz;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.random.Random;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.ui.debug.GraphData;
import ru.yandex.video.m3.ui.debug.compose.theme.GraphicsStyle;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u000b0\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "ts", "", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "loadedChunksHistory", "Lf530;", "modifier", "Lzy11;", "NetworkRequestsDebug", "(JLjava/util/List;Lf530;Lfid;II)V", "events", "Lru/yandex/video/m3/ui/debug/GraphData;", "formatEvent", "(Ljava/util/List;)Ljava/util/List;", "NetworkRequestsDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequestsDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NetworkRequestsDebug(final long j, final List<LoadedChunk> list, f530 f530Var, fid fidVar, final int i, final int i2) {
        long j2;
        int i3;
        f530 f530Var2;
        int i4;
        int i5;
        int i6;
        final f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1952201787);
        dmw0 dmw0Var = btsVar.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 6) == 0) {
                i3 = (btsVar.d(j2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.e(list) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 256 : 128;
            i4 = i3;
            if ((i4 & 147) == 146 || !btsVar.E()) {
                c530 c530Var = c530.a;
                final f530 f530Var4 = i7 == 0 ? c530Var : f530Var2;
                if (Flags.INSTANCE.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequests()) {
                    aii0 v = btsVar.v();
                    if (v != null) {
                        final long j3 = j2;
                        v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.NetworkRequestsDebugKt$NetworkRequestsDebug$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar2, int i8) {
                                NetworkRequestsDebugKt.NetworkRequestsDebug(j3, list, f530Var4, fidVar2, vng.O(i | 1), i2);
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
                f530 f530Var5 = f530Var4;
                List<List<GraphData<Long>>> formatEvent = formatEvent(list);
                btsVar.f0(-483455358);
                so5 so5Var = x4c.G;
                g43 g43Var = lr20.c;
                sic a = qic.a(g43Var, so5Var, btsVar, 0);
                btsVar.f0(-1323940314);
                int S = cma1.S(btsVar);
                r1b0 o = btsVar.o();
                ohd.G1.getClass();
                sls slsVar = d.b;
                a h = e.h(c530Var);
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar, wlsVar, a);
                wls wlsVar2 = d.e;
                qje.W(btsVar, wlsVar2, o);
                wls wlsVar3 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar, S, wlsVar3);
                }
                h.invoke(new gns0(btsVar), btsVar, 0);
                btsVar.f0(2058660585);
                BlocksKt.Label(ohb1.e(btsVar, R.string.networkRequestsLabel), null, false, btsVar, 0, 6);
                i43 i43Var = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                btsVar.f0(693286680);
                lhl0 a2 = khl0.a(i43Var, x4c.D, btsVar, 0);
                btsVar.f0(-1323940314);
                int S2 = cma1.S(btsVar);
                r1b0 o2 = btsVar.o();
                a h2 = e.h(f530Var5);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a2);
                qje.W(btsVar, wlsVar2, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S2))) {
                    b64.z(S2, btsVar, S2, wlsVar3);
                }
                h2.invoke(new gns0(btsVar), btsVar, 0);
                btsVar.f0(2058660585);
                btsVar.f0(-483455358);
                sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
                btsVar.f0(-1323940314);
                int S3 = cma1.S(btsVar);
                r1b0 o3 = btsVar.o();
                a h3 = e.h(c530Var);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a3);
                qje.W(btsVar, wlsVar2, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S3))) {
                    b64.z(S3, btsVar, S3, wlsVar3);
                }
                h3.invoke(new gns0(btsVar), btsVar, 0);
                btsVar.f0(2058660585);
                Integer valueOf = Integer.valueOf(R.string.networkRequestsTotalNumOfSuccess);
                List<LoadedChunk> list2 = list;
                boolean z = list2 instanceof Collection;
                if (z && list2.isEmpty()) {
                    i5 = 0;
                } else {
                    Iterator<T> it = list2.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        if (((LoadedChunk) it.next()).isSuccessful() && (i5 = i5 + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                Integer valueOf2 = Integer.valueOf(i5);
                Flags flags = Flags.INSTANCE;
                BlocksKt.DebugBlock(valueOf, valueOf2, null, false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsGlobalSuccessCounter(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsGlobalSuccessCounterLabel(), btsVar, 0, 12);
                Integer valueOf3 = Integer.valueOf(R.string.networkRequestsTotalNumOfErrors);
                if (z && list2.isEmpty()) {
                    i6 = 0;
                } else {
                    Iterator<T> it2 = list2.iterator();
                    i6 = 0;
                    while (it2.hasNext()) {
                        if (!((LoadedChunk) it2.next()).isSuccessful() && (i6 = i6 + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                Integer valueOf4 = Integer.valueOf(i6);
                Flags flags2 = Flags.INSTANCE;
                BlocksKt.DebugBlock(valueOf3, valueOf4, null, false, flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsGlobalErrorsCounter(), flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsGlobalErrorsCounterLabel(), btsVar, 0, 12);
                ly3.A(btsVar, false, true, false, false);
                boolean showNetworkRequestsMaxValues = flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsMaxValues();
                boolean showNetworkRequestsMaxValuesLabel = flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsMaxValuesLabel();
                int i8 = R.string.networkRequestsMaxValues;
                boolean showNetworkRequestsLastValues = flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsLastValues();
                boolean showNetworkRequestsLastValuesLabel = flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsLastValuesLabel();
                int i9 = R.string.networkRequestsLastValues;
                Theme theme = Theme.INSTANCE;
                AccumulationGraphKt.AccumulationGraph(formatEvent, j, 3.0f, 30000L, ljs0.e(ljs0.c(f530Var5, 1.0f), GraphicsStyle.INSTANCE.m949getHEIGHTD9Ej5fM()), null, true, scc.g(new ldc(theme.getColorScheme(btsVar, 6).m937getGraphError0d7_KjU()), new ldc(theme.getColorScheme(btsVar, 6).m939getGraphSuccess0d7_KjU())), scc.g(ohb1.e(btsVar, R.string.networkRequestsCurrentNumOfErrors), ohb1.e(btsVar, R.string.networkRequestsCurrentNumOfSuccess)), flags2.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequestsValuesNames(), showNetworkRequestsMaxValues, showNetworkRequestsMaxValuesLabel, Integer.valueOf(i8), showNetworkRequestsLastValues, showNetworkRequestsLastValuesLabel, Integer.valueOf(i9), null, btsVar, ((i4 << 3) & 112) | 1576320, 0, ImageMetadata.CONTROL_AF_STATE);
                btsVar = btsVar;
                ly3.A(btsVar, false, true, false, false);
                ly3.A(btsVar, false, true, false, false);
                f530Var3 = f530Var5;
            } else {
                btsVar.Y();
                f530Var3 = f530Var2;
            }
            aii0 v2 = btsVar.v();
            if (v2 != null) {
                v2.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.NetworkRequestsDebugKt$NetworkRequestsDebug$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i10) {
                        NetworkRequestsDebugKt.NetworkRequestsDebug(j, list, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        i4 = i3;
        if ((i4 & 147) == 146) {
        }
        c530 c530Var2 = c530.a;
        if (i7 == 0) {
        }
        if (Flags.INSTANCE.getListSdkDebugViewFlags(btsVar, 6).getShowNetworkRequests()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.NetworkRequestsDebugKt$NetworkRequestsDebugPreview$1] */
    public static final void NetworkRequestsDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(393625670);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            final int i2 = 50;
            final long j = 100;
            final long j2 = 1000;
            final int i3 = 30;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, 2075795458, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.NetworkRequestsDebugKt$NetworkRequestsDebugPreview$1
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
                    ArrayList arrayList = new ArrayList();
                    int i5 = i2;
                    long j3 = currentTimeMillis;
                    long j4 = j;
                    long j5 = j2;
                    int i6 = i3;
                    int i7 = 0;
                    while (i7 < i5) {
                        LoadedChunk loadedChunk = (LoadedChunk) kotlin.collections.a.b0(arrayList);
                        long timestamp = loadedChunk != null ? loadedChunk.getTimestamp() : j3;
                        imz imzVar = new imz(j4, j5, false);
                        Random.Default r10 = Random.a;
                        long k = timestamp - y6i0.k(imzVar, r10);
                        int i8 = i5;
                        boolean z = true;
                        if (y6i0.j(new d6w(1, 100, 1), r10) >= i6) {
                            z = false;
                        }
                        arrayList.add(new LoadedChunk(k, z));
                        i7++;
                        i5 = i8;
                    }
                    NetworkRequestsDebugKt.NetworkRequestsDebug(System.currentTimeMillis(), kotlin.collections.a.q0(arrayList), null, fidVar2, 0, 4);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.NetworkRequestsDebugKt$NetworkRequestsDebugPreview$2
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
                    NetworkRequestsDebugKt.NetworkRequestsDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    private static final List<List<GraphData<Long>>> formatEvent(List<LoadedChunk> list) {
        List<List<GraphData<Long>>> g = scc.g(new ArrayList(), new ArrayList());
        long j = 0;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            LoadedChunk loadedChunk = (LoadedChunk) obj;
            if (loadedChunk.isSuccessful()) {
                j++;
            }
            g.get(0).add(new GraphData<>(Long.valueOf((i - j) + 1), loadedChunk.getTimestamp()));
            g.get(1).add(new GraphData<>(Long.valueOf(j), loadedChunk.getTimestamp()));
            i = i2;
        }
        return g;
    }
}
