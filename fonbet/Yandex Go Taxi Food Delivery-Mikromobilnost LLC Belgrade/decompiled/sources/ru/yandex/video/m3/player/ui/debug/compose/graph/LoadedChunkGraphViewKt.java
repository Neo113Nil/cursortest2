package ru.yandex.video.m3.player.ui.debug.compose.graph;

import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cjs0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.kub1;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.qam;
import defpackage.qeb1;
import defpackage.qke;
import defpackage.rzo;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;

@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "events", "Lf530;", "modifier", "", "ts", "Lzy11;", "LoadedChunkGraphView", "(Ljava/util/List;Lf530;JLfid;II)V", "Lldc;", "graphBackgroundColor", "J", "DEFAULT_HISTORY_LENGTH_MS", "", "DEFAULT_GRAPH_WIDTH", "F", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadedChunkGraphViewKt {
    private static final float DEFAULT_GRAPH_WIDTH = 4.0f;
    private static final long DEFAULT_HISTORY_LENGTH_MS = 30000;
    private static final long graphBackgroundColor = ldc.b(rzo.f(4279771176L), 0.5f, 0.0f, 0.0f, 0.0f, 14);

    public static final void LoadedChunkGraphView(final List<LoadedChunk> list, f530 f530Var, final long j, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-918474802);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.e(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.d(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 b = m4m0.b(ljs0.h(f530Var, 16.0f), graphBackgroundColor, qke.q);
            btsVar.f0(1247655271);
            boolean e = ((i3 & 896) == 256) | btsVar.e(list);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new tls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.graph.LoadedChunkGraphViewKt$LoadedChunkGraphView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(qam qamVar) {
                        float b2 = cjs0.b(qamVar.c());
                        long j2 = j - 30000;
                        for (LoadedChunk loadedChunk : list) {
                            if (loadedChunk.getTimestamp() >= j2) {
                                float timestamp = ((loadedChunk.getTimestamp() - j2) / 30000.0f) * cjs0.d(qamVar.c());
                                qamVar.h(loadedChunk.isSuccessful() ? ldc.h : ldc.g, kub1.a(timestamp, 0.0f), kub1.a(timestamp, b2), 4.0f, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                            }
                        }
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((qam) obj);
                        return zy11.a;
                    }
                };
                btsVar.o0(Q);
            }
            btsVar.t(false);
            qeb1.a(0, btsVar, (tls) Q, b);
        }
        final f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.graph.LoadedChunkGraphViewKt$LoadedChunkGraphView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    LoadedChunkGraphViewKt.LoadedChunkGraphView(list, f530Var2, j, fidVar2, vng.O(i | 1), i2);
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
