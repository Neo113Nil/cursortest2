package ru.yandex.video.m3.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.fid;
import defpackage.gns0;
import defpackage.jl40;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventDataKt;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatDataKt;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", "decodersData", "Lzy11;", "DecodersDebug", "(Ljava/util/Map;Lfid;I)V", "DecodersDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecodersDebugKt {
    public static final void DecodersDebug(final Map<Integer, DecoderEventData> map, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-727567064);
        if ((((i & 6) == 0 ? (btsVar.e(map) ? 4 : 2) | i : i) & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (!Flags.INSTANCE.getListSdkDebugViewFlags(btsVar, 6).getShowDecodersInfo()) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebug$1
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
                            DecodersDebugKt.DecodersDebug(map, fidVar2, vng.O(i | 1));
                        }
                    };
                    return;
                }
                return;
            }
            btsVar.f0(-483455358);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            btsVar.f0(-1323940314);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            ohd.G1.getClass();
            sls slsVar = d.b;
            a h = e.h(c530.a);
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
            btsVar.f0(1504830099);
            for (Map.Entry<Integer, DecoderEventData> entry : map.entrySet()) {
                DecoderDebugKt.DecoderDebug(entry.getKey().intValue(), entry.getValue().getName(), entry.getValue().getInits(), entry.getValue().getReuses(), entry.getValue().getReleases(), null, btsVar, 0, 32);
            }
            ly3.A(btsVar, false, false, true, false);
            btsVar.t(false);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebug$3
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
                    DecodersDebugKt.DecodersDebug(map, fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$1] */
    public static final void DecodersDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-622740676);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final TrackFormatData TrackFormatData = TrackFormatDataKt.TrackFormatData("codec 1920x1080 testId", new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$trackFormatData$1
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
            ThemeKt.DebugTheme(false, wwg.i(btsVar, -2086824968, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$1
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
                    DecodersDebugKt.DecodersDebug(b.i(new Pair(0, DecoderEventDataKt.DecoderEventData("c2.android.avc.decoder", 2, 2, TrackFormatData.this, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$1.1
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(0);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(1, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 2, TrackFormatData.this, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$1.2
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(4);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    })), new Pair(2, DecoderEventDataKt.DecoderEventData("c2.goldfish.h264.decoder", 3, 0, TrackFormatData.this, (TrackFormatData) null, new tls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$1.3
                        public final void invoke(DecoderEventData.Builder builder) {
                            builder.setReuses(42);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DecoderEventData.Builder) obj);
                            return zy11.a;
                        }
                    }))), fidVar2, 0);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecodersDebugKt$DecodersDebugPreview$2
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
                    DecodersDebugKt.DecodersDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }
}
