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
import defpackage.imz;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.random.Random;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.ui.debug.GraphData;
import ru.yandex.video.m3.ui.debug.compose.theme.GraphicsStyle;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;
import ru.yandex.video.m3.ui.debug.util.ExtensionsUtilsKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "ts", "", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "listBandwidthHistory", "Lf530;", "modifier", "Lzy11;", "BandwidthDebug", "(JLjava/util/List;Lf530;Lfid;II)V", "BandwidthDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BandwidthDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BandwidthDebug(final long j, final List<BandwidthEstimation> list, f530 f530Var, fid fidVar, final int i, final int i2) {
        final long j2;
        int i3;
        f530 f530Var2;
        int i4;
        bts btsVar;
        final f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1138733501);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else if ((i & 6) == 0) {
            j2 = j;
            i3 = (btsVar2.d(j2) ? 4 : 2) | i;
        } else {
            j2 = j;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar2.e(list) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            i4 = i3;
            if ((i4 & 147) == 146 || !btsVar2.E()) {
                c530 c530Var = c530.a;
                if (i5 != 0) {
                    f530Var2 = c530Var;
                }
                if (Flags.INSTANCE.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidth()) {
                    aii0 v = btsVar2.v();
                    if (v != null) {
                        final f530 f530Var4 = f530Var2;
                        v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BandwidthDebugKt$BandwidthDebug$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar2, int i6) {
                                BandwidthDebugKt.BandwidthDebug(j2, list, f530Var4, fidVar2, vng.O(i | 1), i2);
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
                f530 f530Var5 = f530Var2;
                List<BandwidthEstimation> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                for (BandwidthEstimation bandwidthEstimation : list2) {
                    arrayList.add(new GraphData(Long.valueOf(bandwidthEstimation.getValue()), bandwidthEstimation.getTimestamp()));
                }
                btsVar2.f0(-483455358);
                sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                btsVar2.f0(-1323940314);
                int S = cma1.S(btsVar2);
                r1b0 o = btsVar2.o();
                ohd.G1.getClass();
                sls slsVar = d.b;
                a h = e.h(c530Var);
                if (btsVar2.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, d.f, a);
                qje.W(btsVar2, d.e, o);
                wls wlsVar = d.g;
                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar2, S, wlsVar);
                }
                h.invoke(new gns0(btsVar2), btsVar2, 0);
                btsVar2.f0(2058660585);
                BlocksKt.Label(ohb1.e(btsVar2, R.string.bandwidthLabel), null, false, btsVar2, 0, 6);
                long m938getGraphPrimary0d7_KjU = Theme.INSTANCE.getColorScheme(btsVar2, 6).m938getGraphPrimary0d7_KjU();
                Flags flags = Flags.INSTANCE;
                boolean showBandwidthMinValue = flags.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidthMinValue();
                boolean showBandwidthMinValueLabel = flags.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidthMinValueLabel();
                int i6 = R.string.bandwidthMinValue;
                LineGraphKt.m923LineGraphFl0aNZw(arrayList, j, 3.0f, m938getGraphPrimary0d7_KjU, 30000L, ljs0.e(ljs0.c(f530Var5, 1.0f), GraphicsStyle.INSTANCE.m949getHEIGHTD9Ej5fM()), null, showBandwidthMinValue, showBandwidthMinValueLabel, Integer.valueOf(i6), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidthMaxValue(), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidthMaxValueLabel(), Integer.valueOf(R.string.bandwidthMaxValue), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidthLastValue(), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidthLastValueLabel(), Integer.valueOf(R.string.bandwidthLastValue), new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.BandwidthDebugKt$BandwidthDebug$2$1
                    @Override // defpackage.tls
                    public final String invoke(Long l) {
                        String bitsToHumanReadable;
                        if (l == null || (bitsToHumanReadable = ExtensionsUtilsKt.bitsToHumanReadable(l.longValue())) == null) {
                            return null;
                        }
                        return ExtensionsUtilsKt.perSeconds(bitsToHumanReadable);
                    }
                }, btsVar2, ((i4 << 3) & 112) | 24960, 1572864, 64);
                btsVar = btsVar2;
                ly3.A(btsVar, false, true, false, false);
                f530Var3 = f530Var5;
            } else {
                btsVar2.Y();
                btsVar = btsVar2;
                f530Var3 = f530Var2;
            }
            aii0 v2 = btsVar.v();
            if (v2 != null) {
                v2.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BandwidthDebugKt$BandwidthDebug$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i7) {
                        BandwidthDebugKt.BandwidthDebug(j, list, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        if (i5 != 0) {
        }
        if (Flags.INSTANCE.getListSdkDebugViewFlags(btsVar2, 6).getShowBandwidth()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.BandwidthDebugKt$BandwidthDebugPreview$1] */
    public static final void BandwidthDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1278649946);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            final int i2 = 500;
            final long j = 100;
            final long j2 = 1000;
            final long j3 = 3900000;
            final long j4 = 103000000;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, 485618530, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BandwidthDebugKt$BandwidthDebugPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i3) {
                    if ((i3 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    long j5 = currentTimeMillis;
                    ArrayList arrayList = new ArrayList();
                    int i4 = i2;
                    long j6 = currentTimeMillis;
                    long j7 = j;
                    long j8 = j2;
                    long j9 = j3;
                    long j10 = j4;
                    int i5 = 0;
                    while (i5 < i4) {
                        BandwidthEstimation bandwidthEstimation = (BandwidthEstimation) kotlin.collections.a.b0(arrayList);
                        long timestamp = bandwidthEstimation != null ? bandwidthEstimation.getTimestamp() : j6;
                        long j11 = j10;
                        imz imzVar = new imz(j7, j8, false);
                        Random.Default r12 = Random.a;
                        long j12 = j9;
                        arrayList.add(new BandwidthEstimation(timestamp - y6i0.k(imzVar, r12), y6i0.k(new imz(j12, j11, false), r12)));
                        i5++;
                        i4 = i4;
                        j6 = j6;
                        j5 = j5;
                        j9 = j12;
                        j10 = j11;
                    }
                    BandwidthDebugKt.BandwidthDebug(j5, kotlin.collections.a.q0(arrayList), null, fidVar2, 0, 4);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BandwidthDebugKt$BandwidthDebugPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }

                public final void invoke(fid fidVar2, int i3) {
                    BandwidthDebugKt.BandwidthDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }
}
