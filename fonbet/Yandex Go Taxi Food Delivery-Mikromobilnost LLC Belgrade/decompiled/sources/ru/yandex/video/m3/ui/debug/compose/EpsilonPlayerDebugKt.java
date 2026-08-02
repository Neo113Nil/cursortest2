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
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.i43;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.ly3;
import defpackage.ohd;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.scc;
import defpackage.sls;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y7m;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.ui.debug.PreloadState;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001ak\u0010\u0013\u001a\u00020\u00122\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0000*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"", "mediaDataUUID", "", "yandexPlayerIndex", "engineIndex", "Lru/yandex/video/m3/ui/debug/PreloadState;", "preloadState", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "currentQuality", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "bufferSize", "", "isActiveMediaData", "", "Ly7m;", "columnWidths", "Lf530;", "modifier", "Lzy11;", "EpsilonPlayerDebug", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/yandex/video/m3/ui/debug/PreloadState;Lru/yandex/video/m3/player/ui/debug/model/Size;Lru/yandex/video/m3/player/ui/debug/model/BufferSize;ZLjava/util/List;Lf530;Lfid;II)V", "", "millisecondsToSecondsString", "(J)Ljava/lang/String;", "EpsilonPlayerDebugPreview", "(Lfid;I)V", "EpsilonPlayerDebugActiveMediaDataPreview", "EpsilonPlayerDebugNullDataPreview", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EpsilonPlayerDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EpsilonPlayerDebug(final String str, final Integer num, final Integer num2, final PreloadState preloadState, final Size size, final BufferSize bufferSize, final boolean z, final List<y7m> list, f530 f530Var, fid fidVar, final int i, final int i2) {
        String str2;
        int i3;
        PreloadState preloadState2;
        Size size2;
        boolean z2;
        int i4;
        f530 f530Var2;
        bts btsVar;
        final f530 f530Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1823947856);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (btsVar2.k(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar2.k(num) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= btsVar2.k(num2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    preloadState2 = preloadState;
                    i3 |= btsVar2.k(preloadState2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        size2 = size;
                        i3 |= btsVar2.k(size2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ImageMetadata.EDGE_MODE;
                        } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
                            i3 |= btsVar2.k(bufferSize) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i & 1572864) == 0) {
                                i3 |= btsVar2.a(z2) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= btsVar2.e(list) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                        }
                        i4 = i2 & 256;
                        if (i4 != 0) {
                            i3 |= 100663296;
                        } else if ((100663296 & i) == 0) {
                            f530Var2 = f530Var;
                            i3 |= btsVar2.k(f530Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                            if ((i3 & 38347923) == 38347922 || !btsVar2.E()) {
                                c530 c530Var = c530.a;
                                int i5 = i3;
                                f530 f530Var4 = i4 == 0 ? c530Var : f530Var2;
                                i43 i43Var = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                                btsVar2.f0(693286680);
                                lhl0 a = khl0.a(i43Var, x4c.D, btsVar2, 0);
                                btsVar2.f0(-1323940314);
                                int S = cma1.S(btsVar2);
                                r1b0 o = btsVar2.o();
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                a h = e.h(f530Var4);
                                if (btsVar2.a != null) {
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
                                int i6 = R.string.epsilonUuid;
                                Flags flags = Flags.INSTANCE;
                                boolean showEpsilonUuid = flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonUuid();
                                boolean showEpsilonUuidLabel = flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonUuidLabel();
                                int i7 = i5 >> 9;
                                int i8 = i7 & 7168;
                                BlocksKt.DebugBlock(Integer.valueOf(i6), str2, ljs0.q(c530Var, list.get(0).a), z2, showEpsilonUuid, showEpsilonUuidLabel, btsVar2, ((i5 << 3) & 112) | i8, 0);
                                int i9 = R.string.epsilonPlayerIndex;
                                BlocksKt.DebugBlock(Integer.valueOf(i9), num, ljs0.q(c530Var, list.get(1).a), z, flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonPlayerId(), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonPlayerIdLabel(), btsVar2, (i5 & 112) | i8, 0);
                                int i10 = R.string.epsilonEngineIndex;
                                BlocksKt.DebugBlock(Integer.valueOf(i10), num2, ljs0.q(c530Var, list.get(2).a), z, flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonEngine(), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonEngineLabel(), btsVar2, ((i5 >> 3) & 112) | i8, 0);
                                int i11 = R.string.epsilonPreloadState;
                                PreloadState preloadState3 = preloadState2;
                                BlocksKt.DebugBlock(Integer.valueOf(i11), preloadState3, ljs0.q(c530Var, list.get(3).a), z, flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonPreloadState(), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonPreloadStateLabel(), btsVar2, ((i5 >> 6) & 112) | i8, 0);
                                int i12 = R.string.epsilonCurrentQuality;
                                Size size3 = size2;
                                BlocksKt.DebugBlock(Integer.valueOf(i12), size3, ljs0.q(c530Var, list.get(4).a), z, flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonCurrentQuality(), flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonCurrentQualityLabel(), btsVar2, i7 & 7280, 0);
                                int i13 = R.string.epsilonCurrentBufferSize;
                                String millisecondsToSecondsString = bufferSize != null ? millisecondsToSecondsString(bufferSize.getValue()) : null;
                                boolean showEpsilonBufferSize = flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonBufferSize();
                                boolean showEpsilonBufferSizeLabel = flags.getListSdkDebugViewFlags(btsVar2, 6).getShowEpsilonBufferSizeLabel();
                                BlocksKt.DebugBlock(Integer.valueOf(i13), millisecondsToSecondsString, ljs0.q(c530Var, list.get(5).a), z, showEpsilonBufferSize, showEpsilonBufferSizeLabel, btsVar2, i8, 0);
                                btsVar = btsVar2;
                                ly3.A(btsVar, false, true, false, false);
                                f530Var3 = f530Var4;
                            } else {
                                btsVar2.Y();
                                btsVar = btsVar2;
                                f530Var3 = f530Var2;
                            }
                            aii0 v = btsVar.v();
                            if (v != null) {
                                v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebug$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(fid fidVar2, int i14) {
                                        EpsilonPlayerDebugKt.EpsilonPlayerDebug(str, num, num2, preloadState, size, bufferSize, z, list, f530Var3, fidVar2, vng.O(i | 1), i2);
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
                        if ((i3 & 38347923) == 38347922) {
                        }
                        c530 c530Var2 = c530.a;
                        int i52 = i3;
                        f530 f530Var42 = i4 == 0 ? c530Var2 : f530Var2;
                        i43 i43Var2 = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                        btsVar2.f0(693286680);
                        lhl0 a2 = khl0.a(i43Var2, x4c.D, btsVar2, 0);
                        btsVar2.f0(-1323940314);
                        int S2 = cma1.S(btsVar2);
                        r1b0 o2 = btsVar2.o();
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        a h2 = e.h(f530Var42);
                        if (btsVar2.a != null) {
                        }
                    }
                    size2 = size;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    i4 = i2 & 256;
                    if (i4 != 0) {
                    }
                    f530Var2 = f530Var;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    c530 c530Var22 = c530.a;
                    int i522 = i3;
                    f530 f530Var422 = i4 == 0 ? c530Var22 : f530Var2;
                    i43 i43Var22 = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                    btsVar2.f0(693286680);
                    lhl0 a22 = khl0.a(i43Var22, x4c.D, btsVar2, 0);
                    btsVar2.f0(-1323940314);
                    int S22 = cma1.S(btsVar2);
                    r1b0 o22 = btsVar2.o();
                    ohd.G1.getClass();
                    sls slsVar22 = d.b;
                    a h22 = e.h(f530Var422);
                    if (btsVar2.a != null) {
                    }
                }
                preloadState2 = preloadState;
                if ((i2 & 16) == 0) {
                }
                size2 = size;
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i4 = i2 & 256;
                if (i4 != 0) {
                }
                f530Var2 = f530Var;
                if ((i3 & 38347923) == 38347922) {
                }
                c530 c530Var222 = c530.a;
                int i5222 = i3;
                f530 f530Var4222 = i4 == 0 ? c530Var222 : f530Var2;
                i43 i43Var222 = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                btsVar2.f0(693286680);
                lhl0 a222 = khl0.a(i43Var222, x4c.D, btsVar2, 0);
                btsVar2.f0(-1323940314);
                int S222 = cma1.S(btsVar2);
                r1b0 o222 = btsVar2.o();
                ohd.G1.getClass();
                sls slsVar222 = d.b;
                a h222 = e.h(f530Var4222);
                if (btsVar2.a != null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            preloadState2 = preloadState;
            if ((i2 & 16) == 0) {
            }
            size2 = size;
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i2 & 256;
            if (i4 != 0) {
            }
            f530Var2 = f530Var;
            if ((i3 & 38347923) == 38347922) {
            }
            c530 c530Var2222 = c530.a;
            int i52222 = i3;
            f530 f530Var42222 = i4 == 0 ? c530Var2222 : f530Var2;
            i43 i43Var2222 = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
            btsVar2.f0(693286680);
            lhl0 a2222 = khl0.a(i43Var2222, x4c.D, btsVar2, 0);
            btsVar2.f0(-1323940314);
            int S2222 = cma1.S(btsVar2);
            r1b0 o2222 = btsVar2.o();
            ohd.G1.getClass();
            sls slsVar2222 = d.b;
            a h2222 = e.h(f530Var42222);
            if (btsVar2.a != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        preloadState2 = preloadState;
        if ((i2 & 16) == 0) {
        }
        size2 = size;
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i2 & 256;
        if (i4 != 0) {
        }
        f530Var2 = f530Var;
        if ((i3 & 38347923) == 38347922) {
        }
        c530 c530Var22222 = c530.a;
        int i522222 = i3;
        f530 f530Var422222 = i4 == 0 ? c530Var22222 : f530Var2;
        i43 i43Var22222 = new i43(Theme.INSTANCE.getSpacers(btsVar2, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
        btsVar2.f0(693286680);
        lhl0 a22222 = khl0.a(i43Var22222, x4c.D, btsVar2, 0);
        btsVar2.f0(-1323940314);
        int S22222 = cma1.S(btsVar2);
        r1b0 o22222 = btsVar2.o();
        ohd.G1.getClass();
        sls slsVar22222 = d.b;
        a h22222 = e.h(f530Var422222);
        if (btsVar2.a != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugActiveMediaDataPreview$1] */
    public static final void EpsilonPlayerDebugActiveMediaDataPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-585402334);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final PreloadState preloadState = PreloadState.SUCCESS;
            final Size size = new Size(1920, 1080);
            final BufferSize bufferSize = new BufferSize(124414212144L, 24215L);
            final String str = "vplvgolp6p4wwbviudnd";
            final int i2 = 3;
            final int i3 = 1;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, -1501844762, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugActiveMediaDataPreview$1
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
                    EpsilonPlayerDebugKt.EpsilonPlayerDebug(str, Integer.valueOf(i2), Integer.valueOf(i3), preloadState, size, bufferSize, true, scc.g(new y7m(EpsilonDebugKt.calculateCellWidth(str, R.string.epsilonUuid, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(Integer.valueOf(i2), R.string.epsilonPlayerIndex, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(Integer.valueOf(i3), R.string.epsilonEngineIndex, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(preloadState, R.string.epsilonPreloadState, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(size, R.string.epsilonCurrentQuality, fidVar2, 0)), new y7m(EpsilonDebugKt.calculateCellWidth(bufferSize, R.string.epsilonCurrentBufferSize, fidVar2, 0))), null, fidVar2, 1576374, 256);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugActiveMediaDataPreview$2
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
                    EpsilonPlayerDebugKt.EpsilonPlayerDebugActiveMediaDataPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugNullDataPreview$1] */
    public static final void EpsilonPlayerDebugNullDataPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(238674519);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final String str = "vplvgolp6p4wwbviudnd";
            final Void r3 = null;
            final Void r4 = null;
            final Void r5 = null;
            final Void r6 = null;
            final Void r7 = null;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, -372276205, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugNullDataPreview$1
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
                    String str2 = str;
                    EpsilonPlayerDebugKt.EpsilonPlayerDebug(str2, (Integer) r3, (Integer) r4, (PreloadState) r5, (Size) r6, (BufferSize) r7, false, scc.g(new y7m(EpsilonDebugKt.calculateCellWidth(str2, R.string.epsilonUuid, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(r3, R.string.epsilonPlayerIndex, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(r4, R.string.epsilonEngineIndex, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(r5, R.string.epsilonPreloadState, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(r6, R.string.epsilonCurrentQuality, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(r7, R.string.epsilonCurrentBufferSize, fidVar2, 6))), null, fidVar2, 1797558, 256);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugNullDataPreview$2
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
                    EpsilonPlayerDebugKt.EpsilonPlayerDebugNullDataPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugPreview$1] */
    public static final void EpsilonPlayerDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1833119846);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            final PreloadState preloadState = PreloadState.SUCCESS;
            final Size size = new Size(1920, 1080);
            final BufferSize bufferSize = new BufferSize(124414212144L, 24215L);
            final String str = "vplvgolp6p4wwbviudnd";
            final int i2 = 3;
            final int i3 = 1;
            ThemeKt.DebugTheme(false, wwg.i(btsVar, -150712798, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugPreview$1
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
                    EpsilonPlayerDebugKt.EpsilonPlayerDebug(str, Integer.valueOf(i2), Integer.valueOf(i3), preloadState, size, bufferSize, false, scc.g(new y7m(EpsilonDebugKt.calculateCellWidth(str, R.string.epsilonUuid, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(Integer.valueOf(i2), R.string.epsilonPlayerIndex, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(Integer.valueOf(i3), R.string.epsilonEngineIndex, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(preloadState, R.string.epsilonPreloadState, fidVar2, 6)), new y7m(EpsilonDebugKt.calculateCellWidth(size, R.string.epsilonCurrentQuality, fidVar2, 0)), new y7m(EpsilonDebugKt.calculateCellWidth(bufferSize, R.string.epsilonCurrentBufferSize, fidVar2, 0))), null, fidVar2, 1576374, 256);
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
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.EpsilonPlayerDebugKt$EpsilonPlayerDebugPreview$2
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
                    EpsilonPlayerDebugKt.EpsilonPlayerDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    private static final String millisecondsToSecondsString(long j) {
        return String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(j / 1000.0f)}, 1)).concat("s");
    }
}
