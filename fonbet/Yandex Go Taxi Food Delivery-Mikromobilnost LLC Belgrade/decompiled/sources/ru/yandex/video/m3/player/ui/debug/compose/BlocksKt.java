package ru.yandex.video.m3.player.ui.debug.compose;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.gxv;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.mhl0;
import defpackage.nhl0;
import defpackage.ohd;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.sty0;
import defpackage.tic;
import defpackage.to5;
import defpackage.uh6;
import defpackage.vng;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.ui.debug.compose.graph.LineGraphViewKt;
import ru.yandex.video.m3.player.ui.debug.compose.graph.LoadedChunkGraphViewKt;
import ru.yandex.video.m3.player.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.player.ui.debug.compose.util.ComposeUtilsKt;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;
import ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\n\u001a\u00020\t*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\r\u001aA\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000b\u001aY\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aY\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\u001a#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0!H\u0001¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Ltic;", "", "label", "textToShow", "Lf530;", "modifier", "", "showBlock", "showLabel", "Lzy11;", "DebugBlock", "(Ltic;Ljava/lang/String;Ljava/lang/String;Lf530;ZZLfid;II)V", "Lmhl0;", "(Lmhl0;Ljava/lang/String;Ljava/lang/String;Lf530;ZZLfid;II)V", "DebugBlockWithQr", "", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "events", "", "ts", "DebugBlockWithLoadedChunkGraph", "(Ltic;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLf530;ZZLfid;II)V", "Lru/yandex/video/m3/player/ui/debug/view/graph/LineGraphView$Event;", "DebugBlockWithLineGraph", "text", "Label", "(Ljava/lang/String;Lf530;Lfid;II)V", "DebugText", "withQr", "Lkotlin/Pair;", "", "getWeightsForRow", "(ZLfid;I)Lkotlin/Pair;", "Lkotlin/Triple;", "getWeightsForRowWithQr", "(Lfid;I)Lkotlin/Triple;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlocksKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlock(final tic ticVar, final String str, final String str2, f530 f530Var, boolean z, boolean z2, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        final f530 f530Var3;
        boolean z5;
        double d;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(44117094);
        if ((i2 & Integer.MIN_VALUE) != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z3 = z;
                i3 |= btsVar.a(z3) ? 16384 : 8192;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= btsVar.a(z4) ? 131072 : 65536;
                    if ((74899 & i3) == 74898 || !btsVar.E()) {
                        f530 f530Var4 = i6 == 0 ? c530.a : f530Var2;
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (z3) {
                            Pair<Float, Float> weightsForRow = getWeightsForRow(false, btsVar, 6);
                            float floatValue = ((Number) weightsForRow.getFirst()).floatValue();
                            float floatValue2 = ((Number) weightsForRow.getSecond()).floatValue();
                            f530 a = ticVar.a(x4c.I, f530Var4);
                            to5 to5Var = x4c.E;
                            btsVar.f0(693286680);
                            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
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
                            btsVar.f0(-1527645023);
                            if (z4) {
                                d = 0.0d;
                                if (floatValue <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                if (floatValue > Float.MAX_VALUE) {
                                    floatValue = Float.MAX_VALUE;
                                }
                                z5 = false;
                                Label(str, f530Var4.k(new x2y(floatValue, true)), btsVar, (i3 >> 3) & 14, 0);
                                ComposeUtilsKt.m860EmptySpacer8Feqmps(Theme.INSTANCE.getSpacers(btsVar, 6).m858getLabelSpaceD9Ej5fM(), btsVar, 0);
                            } else {
                                z5 = false;
                                d = 0.0d;
                            }
                            btsVar.t(z5);
                            if (floatValue2 <= d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            if (floatValue2 > Float.MAX_VALUE) {
                                floatValue2 = Float.MAX_VALUE;
                            }
                            DebugText(str2, f530Var4.k(new x2y(floatValue2, true)), btsVar, (i3 >> 6) & 14, 0);
                            ly3.A(btsVar, false, true, false, false);
                        }
                        f530Var3 = f530Var4;
                    } else {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                    }
                    final boolean z6 = z3;
                    final boolean z7 = z4;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$DebugBlock$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar2, int i7) {
                                BlocksKt.DebugBlock(tic.this, str, str2, f530Var3, z6, z7, fidVar2, vng.O(i | 1), i2);
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
                z4 = z2;
                if ((74899 & i3) == 74898) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (z3) {
                }
                f530Var3 = f530Var4;
                final boolean z62 = z3;
                final boolean z72 = z4;
                v = btsVar.v();
                if (v == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((74899 & i3) == 74898) {
            }
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (z3) {
            }
            f530Var3 = f530Var4;
            final boolean z622 = z3;
            final boolean z722 = z4;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((74899 & i3) == 74898) {
        }
        if (i6 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (z3) {
        }
        f530Var3 = f530Var4;
        final boolean z6222 = z3;
        final boolean z7222 = z4;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0097  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlockWithLineGraph(final tic ticVar, final String str, final String str2, final List<? extends LineGraphView.Event> list, final long j, f530 f530Var, boolean z, boolean z2, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        f530 f530Var2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        final boolean z6;
        final boolean z7;
        final f530 f530Var3;
        ?? r6;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1197475384);
        if ((i2 & Integer.MIN_VALUE) != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(list) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.d(j) ? 16384 : 8192;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                f530Var2 = f530Var;
                i3 |= btsVar.k(f530Var2) ? 131072 : 65536;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    z3 = z;
                    i3 |= btsVar.a(z3) ? 1048576 : 524288;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        z4 = z2;
                        i3 |= btsVar.a(z4) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        int i7 = i3;
                        if ((4793491 & i3) == 4793490 || !btsVar.E()) {
                            if (i4 != 0) {
                                f530Var2 = c530.a;
                            }
                            z5 = i5 != 0 ? true : z3;
                            z6 = i6 != 0 ? true : z4;
                            if (z5) {
                                Triple<Float, Float, Float> weightsForRowWithQr = getWeightsForRowWithQr(btsVar, 0);
                                float floatValue = ((Number) weightsForRowWithQr.getFirst()).floatValue();
                                float floatValue2 = ((Number) weightsForRowWithQr.getSecond()).floatValue();
                                float floatValue3 = ((Number) weightsForRowWithQr.getThird()).floatValue();
                                f530 a = ticVar.a(x4c.I, f530Var2);
                                to5 to5Var = x4c.E;
                                btsVar.f0(693286680);
                                lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
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
                                btsVar.f0(-1520405549);
                                nhl0 nhl0Var = nhl0.a;
                                if (z6) {
                                    r6 = 0;
                                    Label(str, nhl0Var.a(f530Var2, floatValue, true), btsVar, (i7 >> 3) & 14, 0);
                                    ComposeUtilsKt.m860EmptySpacer8Feqmps(Theme.INSTANCE.getSpacers(btsVar, 6).m858getLabelSpaceD9Ej5fM(), btsVar, 0);
                                } else {
                                    r6 = 0;
                                }
                                btsVar.t(r6);
                                int i8 = i7 >> 6;
                                DebugText(str2, nhl0Var.a(f530Var2, floatValue2, true), btsVar, i8 & 14, r6);
                                LineGraphViewKt.LineGraphView(list == null ? EmptyList.a : list, nhl0Var.a(f530Var2, floatValue3, true), j, btsVar, i8 & 896, 0);
                                ly3.A(btsVar, r6, true, r6, r6);
                            }
                            f530 f530Var4 = f530Var2;
                            z7 = z5;
                            f530Var3 = f530Var4;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            z7 = z3;
                            z6 = z4;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$DebugBlockWithLineGraph$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void invoke(fid fidVar2, int i9) {
                                    BlocksKt.DebugBlockWithLineGraph(tic.this, str, str2, list, j, f530Var3, z7, z6, fidVar2, vng.O(i | 1), i2);
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
                    z4 = z2;
                    int i72 = i3;
                    if ((4793491 & i3) == 4793490) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (z5) {
                    }
                    f530 f530Var42 = f530Var2;
                    z7 = z5;
                    f530Var3 = f530Var42;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z3 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z4 = z2;
                int i722 = i3;
                if ((4793491 & i3) == 4793490) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (z5) {
                }
                f530 f530Var422 = f530Var2;
                z7 = z5;
                f530Var3 = f530Var422;
                v = btsVar.v();
                if (v != null) {
                }
            }
            f530Var2 = f530Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z4 = z2;
            int i7222 = i3;
            if ((4793491 & i3) == 4793490) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (z5) {
            }
            f530 f530Var4222 = f530Var2;
            z7 = z5;
            f530Var3 = f530Var4222;
            v = btsVar.v();
            if (v != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f530Var2 = f530Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z4 = z2;
        int i72222 = i3;
        if ((4793491 & i3) == 4793490) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (z5) {
        }
        f530 f530Var42222 = f530Var2;
        z7 = z5;
        f530Var3 = f530Var42222;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0097  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlockWithLoadedChunkGraph(final tic ticVar, final String str, final String str2, final List<LoadedChunk> list, final long j, f530 f530Var, boolean z, boolean z2, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        f530 f530Var2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        final boolean z6;
        final boolean z7;
        final f530 f530Var3;
        ?? r6;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(440784976);
        if ((i2 & Integer.MIN_VALUE) != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(list) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.d(j) ? 16384 : 8192;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                f530Var2 = f530Var;
                i3 |= btsVar.k(f530Var2) ? 131072 : 65536;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    z3 = z;
                    i3 |= btsVar.a(z3) ? 1048576 : 524288;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        z4 = z2;
                        i3 |= btsVar.a(z4) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        int i7 = i3;
                        if ((4793491 & i3) == 4793490 || !btsVar.E()) {
                            if (i4 != 0) {
                                f530Var2 = c530.a;
                            }
                            z5 = i5 != 0 ? true : z3;
                            z6 = i6 != 0 ? true : z4;
                            if (z5) {
                                Triple<Float, Float, Float> weightsForRowWithQr = getWeightsForRowWithQr(btsVar, 0);
                                float floatValue = ((Number) weightsForRowWithQr.getFirst()).floatValue();
                                float floatValue2 = ((Number) weightsForRowWithQr.getSecond()).floatValue();
                                float floatValue3 = ((Number) weightsForRowWithQr.getThird()).floatValue();
                                f530 a = ticVar.a(x4c.I, f530Var2);
                                to5 to5Var = x4c.E;
                                btsVar.f0(693286680);
                                lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
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
                                btsVar.f0(1390373997);
                                nhl0 nhl0Var = nhl0.a;
                                if (z6) {
                                    r6 = 0;
                                    Label(str, nhl0Var.a(f530Var2, floatValue, true), btsVar, (i7 >> 3) & 14, 0);
                                    ComposeUtilsKt.m860EmptySpacer8Feqmps(Theme.INSTANCE.getSpacers(btsVar, 6).m858getLabelSpaceD9Ej5fM(), btsVar, 0);
                                } else {
                                    r6 = 0;
                                }
                                btsVar.t(r6);
                                int i8 = i7 >> 6;
                                DebugText(str2, nhl0Var.a(f530Var2, floatValue2, true), btsVar, i8 & 14, r6);
                                LoadedChunkGraphViewKt.LoadedChunkGraphView(list == null ? EmptyList.a : list, nhl0Var.a(f530Var2, floatValue3, true), j, btsVar, i8 & 896, 0);
                                ly3.A(btsVar, r6, true, r6, r6);
                            }
                            f530 f530Var4 = f530Var2;
                            z7 = z5;
                            f530Var3 = f530Var4;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            z7 = z3;
                            z6 = z4;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$DebugBlockWithLoadedChunkGraph$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(fid fidVar2, int i9) {
                                    BlocksKt.DebugBlockWithLoadedChunkGraph(tic.this, str, str2, list, j, f530Var3, z7, z6, fidVar2, vng.O(i | 1), i2);
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
                    z4 = z2;
                    int i72 = i3;
                    if ((4793491 & i3) == 4793490) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (z5) {
                    }
                    f530 f530Var42 = f530Var2;
                    z7 = z5;
                    f530Var3 = f530Var42;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z3 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z4 = z2;
                int i722 = i3;
                if ((4793491 & i3) == 4793490) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (z5) {
                }
                f530 f530Var422 = f530Var2;
                z7 = z5;
                f530Var3 = f530Var422;
                v = btsVar.v();
                if (v != null) {
                }
            }
            f530Var2 = f530Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z3 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z4 = z2;
            int i7222 = i3;
            if ((4793491 & i3) == 4793490) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (z5) {
            }
            f530 f530Var4222 = f530Var2;
            z7 = z5;
            f530Var3 = f530Var4222;
            v = btsVar.v();
            if (v != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f530Var2 = f530Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z3 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z4 = z2;
        int i72222 = i3;
        if ((4793491 & i3) == 4793490) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (z5) {
        }
        f530 f530Var42222 = f530Var2;
        z7 = z5;
        f530Var3 = f530Var42222;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlockWithQr(final tic ticVar, final String str, final String str2, f530 f530Var, boolean z, boolean z2, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        final f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1038684339);
        if ((i2 & Integer.MIN_VALUE) != 0) {
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
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z3 = z;
                i3 |= btsVar.a(z3) ? 16384 : 8192;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= btsVar.a(z4) ? 131072 : 65536;
                    if ((74899 & i3) == 74898 || !btsVar.E()) {
                        f530 f530Var4 = i6 == 0 ? c530.a : f530Var2;
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (z3) {
                            Pair<Float, Float> weightsForRow = getWeightsForRow(true, btsVar, 6);
                            float floatValue = ((Number) weightsForRow.getFirst()).floatValue();
                            float floatValue2 = ((Number) weightsForRow.getSecond()).floatValue();
                            f530 a = ticVar.a(x4c.I, f530Var4);
                            to5 to5Var = x4c.E;
                            btsVar.f0(693286680);
                            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
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
                            btsVar.f0(2146159112);
                            if (z4) {
                                if (floatValue <= 0.0d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                if (floatValue > Float.MAX_VALUE) {
                                    floatValue = Float.MAX_VALUE;
                                }
                                Label(str, f530Var4.k(new x2y(floatValue, true)), btsVar, (i3 >> 3) & 14, 0);
                                ComposeUtilsKt.m860EmptySpacer8Feqmps(Theme.INSTANCE.getSpacers(btsVar, 6).m858getLabelSpaceD9Ej5fM(), btsVar, 0);
                            }
                            btsVar.t(false);
                            if (floatValue2 <= 0.0d) {
                                gxv.a("invalid weight; must be greater than zero");
                            }
                            if (floatValue2 > Float.MAX_VALUE) {
                                floatValue2 = Float.MAX_VALUE;
                            }
                            DebugText(str2, f530Var4.k(new x2y(floatValue2, true)), btsVar, (i3 >> 6) & 14, 0);
                            ly3.A(btsVar, false, true, false, false);
                        }
                        f530Var3 = f530Var4;
                    } else {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                    }
                    final boolean z5 = z3;
                    final boolean z6 = z4;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$DebugBlockWithQr$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar2, int i7) {
                                BlocksKt.DebugBlockWithQr(tic.this, str, str2, f530Var3, z5, z6, fidVar2, vng.O(i | 1), i2);
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
                z4 = z2;
                if ((74899 & i3) == 74898) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (z3) {
                }
                f530Var3 = f530Var4;
                final boolean z52 = z3;
                final boolean z62 = z4;
                v = btsVar.v();
                if (v == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((74899 & i3) == 74898) {
            }
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (z3) {
            }
            f530Var3 = f530Var4;
            final boolean z522 = z3;
            final boolean z622 = z4;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((74899 & i3) == 74898) {
        }
        if (i6 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (z3) {
        }
        f530Var3 = f530Var4;
        final boolean z5222 = z3;
        final boolean z6222 = z4;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugText(final String str, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar;
        final f530 f530Var3;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1318287863);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (btsVar2.k(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 19) == 18 || !btsVar2.E()) {
                f530 f530Var4 = i4 == 0 ? c530.a : f530Var2;
                Theme theme = Theme.INSTANCE;
                btsVar = btsVar2;
                f530Var3 = f530Var4;
                vqy0.b(str, f530Var3, theme.getColorScheme(btsVar2, 6).m837getLabelPrimary0d7_KjU(), 0L, null, 0L, new sjy0(5), 0L, 0, false, 0, 0, theme.getTypography(btsVar2, 6).getTextStyle(), btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD, 0, 65016);
            } else {
                btsVar2.Y();
                btsVar = btsVar2;
                f530Var3 = f530Var2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$DebugText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i5) {
                        BlocksKt.DebugText(str, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        Theme theme2 = Theme.INSTANCE;
        btsVar = btsVar2;
        f530Var3 = f530Var4;
        vqy0.b(str, f530Var3, theme2.getColorScheme(btsVar2, 6).m837getLabelPrimary0d7_KjU(), 0L, null, 0L, new sjy0(5), 0L, 0, false, 0, 0, theme2.getTypography(btsVar2, 6).getTextStyle(), btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD, 0, 65016);
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Label(final String str, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        bts btsVar;
        final f530 f530Var3;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(312353717);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (btsVar2.k(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            if ((i3 & 19) == 18 || !btsVar2.E()) {
                f530 f530Var4 = i4 == 0 ? c530.a : f530Var2;
                Theme theme = Theme.INSTANCE;
                long m837getLabelPrimary0d7_KjU = theme.getColorScheme(btsVar2, 6).m837getLabelPrimary0d7_KjU();
                int i5 = i3;
                lzr lzrVar = lzr.G;
                ety0 textStyle = theme.getTypography(btsVar2, 6).getTextStyle();
                long j = theme.getTypography(btsVar2, 6).getTextStyle().a.b;
                float labelSizeMultiplier = theme.getTypography(btsVar2, 6).getLabelSizeMultiplier();
                uh6.g(j);
                btsVar = btsVar2;
                f530Var3 = f530Var4;
                vqy0.b(str, f530Var3, m837getLabelPrimary0d7_KjU, 0L, lzrVar, 0L, new sjy0(6), 0L, 0, false, 0, 0, ety0.a(textStyle, 0L, uh6.K(sty0.c(j) * labelSizeMultiplier, 1095216660480L & j), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i5 & 14) | ImageMetadata.EDGE_MODE | (i5 & 112), 384, 60888);
            } else {
                btsVar2.Y();
                btsVar = btsVar2;
                f530Var3 = f530Var2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$Label$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i6) {
                        BlocksKt.Label(str, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        Theme theme2 = Theme.INSTANCE;
        long m837getLabelPrimary0d7_KjU2 = theme2.getColorScheme(btsVar2, 6).m837getLabelPrimary0d7_KjU();
        int i52 = i3;
        lzr lzrVar2 = lzr.G;
        ety0 textStyle2 = theme2.getTypography(btsVar2, 6).getTextStyle();
        long j2 = theme2.getTypography(btsVar2, 6).getTextStyle().a.b;
        float labelSizeMultiplier2 = theme2.getTypography(btsVar2, 6).getLabelSizeMultiplier();
        uh6.g(j2);
        btsVar = btsVar2;
        f530Var3 = f530Var4;
        vqy0.b(str, f530Var3, m837getLabelPrimary0d7_KjU2, 0L, lzrVar2, 0L, new sjy0(6), 0L, 0, false, 0, 0, ety0.a(textStyle2, 0L, uh6.K(sty0.c(j2) * labelSizeMultiplier2, 1095216660480L & j2), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i52 & 14) | ImageMetadata.EDGE_MODE | (i52 & 112), 384, 60888);
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final Pair<Float, Float> getWeightsForRow(boolean z, fid fidVar, int i) {
        Pair<Float, Float> pair;
        Float valueOf = Float.valueOf(0.75f);
        Float valueOf2 = Float.valueOf(0.25f);
        bts btsVar = (bts) fidVar;
        btsVar.f0(1073054999);
        if (z) {
            btsVar.f0(-365298646);
            pair = DebugViewKt.isLandscape(btsVar, 0) ? new Pair<>(valueOf2, valueOf) : new Pair<>(Float.valueOf(0.33f), Float.valueOf(0.67f));
            btsVar.t(false);
        } else {
            btsVar.f0(-365170740);
            pair = DebugViewKt.isLandscape(btsVar, 0) ? new Pair<>(Float.valueOf(0.2f), Float.valueOf(0.8f)) : new Pair<>(valueOf2, valueOf);
            btsVar.t(false);
        }
        btsVar.t(false);
        return pair;
    }

    public static final Triple<Float, Float, Float> getWeightsForRowWithQr(fid fidVar, int i) {
        Float valueOf = Float.valueOf(0.25f);
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1606771198);
        Triple<Float, Float, Float> triple = DebugViewKt.isLandscape(btsVar, 0) ? new Triple<>(valueOf, valueOf, Float.valueOf(0.5f)) : new Triple<>(Float.valueOf(0.33f), Float.valueOf(0.27f), Float.valueOf(0.4f));
        btsVar.t(false);
        return triple;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlock(final mhl0 mhl0Var, final String str, final String str2, f530 f530Var, boolean z, boolean z2, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        final f530 f530Var3;
        double d;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-576215218);
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
            i3 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.k(str2) ? 256 : 128;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z3 = z;
                i3 |= btsVar.a(z3) ? 16384 : 8192;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= ImageMetadata.EDGE_MODE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= btsVar.a(z4) ? 131072 : 65536;
                    if ((74899 & i3) != 74898 && btsVar.E()) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                    } else {
                        f530 f530Var4 = i6 == 0 ? c530.a : f530Var2;
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i5 != 0) {
                            z4 = true;
                        }
                        if (z3) {
                            to5 to5Var = x4c.E;
                            f530 a = mhl0Var.a(mhl0Var.b(f530Var4, to5Var), 0.5f, true);
                            btsVar.f0(693286680);
                            lhl0 a2 = khl0.a(lr20.a, to5Var, btsVar, 48);
                            btsVar.f0(-1323940314);
                            int S = cma1.S(btsVar);
                            r1b0 o = btsVar.o();
                            ohd.G1.getClass();
                            sls slsVar = d.b;
                            a h = e.h(a);
                            if (btsVar.a != null) {
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
                                btsVar.f0(-1527623046);
                                if (z4) {
                                    d = 0.0d;
                                    if (0.4f <= 0.0d) {
                                        gxv.a("invalid weight; must be greater than zero");
                                    }
                                    Label(str, f530Var4.k(new x2y(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true)), btsVar, (i3 >> 3) & 14, 0);
                                    ComposeUtilsKt.m860EmptySpacer8Feqmps(Theme.INSTANCE.getSpacers(btsVar, 6).m858getLabelSpaceD9Ej5fM(), btsVar, 0);
                                } else {
                                    d = 0.0d;
                                }
                                btsVar.t(false);
                                if (0.6f <= d) {
                                    gxv.a("invalid weight; must be greater than zero");
                                }
                                DebugText(str2, f530Var4.k(new x2y(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true)), btsVar, (i3 >> 6) & 14, 0);
                                ly3.A(btsVar, false, true, false, false);
                            } else {
                                cma1.b0();
                                throw null;
                            }
                        }
                        f530Var3 = f530Var4;
                    }
                    final boolean z5 = z3;
                    final boolean z6 = z4;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.BlocksKt$DebugBlock$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(fid fidVar2, int i7) {
                                BlocksKt.DebugBlock(mhl0.this, str, str2, f530Var3, z5, z6, fidVar2, vng.O(i | 1), i2);
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
                z4 = z2;
                if ((74899 & i3) != 74898) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (z3) {
                }
                f530Var3 = f530Var4;
                final boolean z52 = z3;
                final boolean z62 = z4;
                v = btsVar.v();
                if (v == null) {
                }
            }
            z3 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((74899 & i3) != 74898) {
            }
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (z3) {
            }
            f530Var3 = f530Var4;
            final boolean z522 = z3;
            final boolean z622 = z4;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((74899 & i3) != 74898) {
        }
        if (i6 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (z3) {
        }
        f530Var3 = f530Var4;
        final boolean z5222 = z3;
        final boolean z6222 = z4;
        v = btsVar.v();
        if (v == null) {
        }
    }
}
