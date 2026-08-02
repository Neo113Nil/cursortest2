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
import defpackage.ly3;
import defpackage.ohd;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.vng;
import defpackage.wls;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "id", "", "name", "inits", "reuses", "releases", "Lf530;", "modifier", "Lzy11;", "DecoderDebug", "(ILjava/lang/String;IIILf530;Lfid;II)V", "DecoderDebugPreview", "(Lfid;I)V", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DecoderDebug(final int i, final String str, int i2, int i3, int i4, f530 f530Var, fid fidVar, final int i5, final int i6) {
        int i7;
        int i8;
        String str2;
        final int i9;
        final int i10;
        final int i11;
        int i12;
        f530 f530Var2;
        final f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-237966134);
        if ((i6 & 1) != 0) {
            i8 = i5 | 6;
            i7 = i;
        } else {
            i7 = i;
            if ((i5 & 6) == 0) {
                i8 = (btsVar.c(i7) ? 4 : 2) | i5;
            } else {
                i8 = i5;
            }
        }
        if ((i6 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            str2 = str;
            i8 |= btsVar.k(str2) ? 32 : 16;
            if ((i6 & 4) == 0) {
                i8 |= 384;
            } else if ((i5 & 384) == 0) {
                i9 = i2;
                i8 |= btsVar.c(i9) ? 256 : 128;
                if ((i6 & 8) != 0) {
                    i8 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i10 = i3;
                    i8 |= btsVar.c(i10) ? 2048 : 1024;
                    if ((i6 & 16) == 0) {
                        i8 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i11 = i4;
                        i8 |= btsVar.c(i11) ? 16384 : 8192;
                        i12 = i6 & 32;
                        if (i12 != 0) {
                            i8 |= ImageMetadata.EDGE_MODE;
                        } else if ((196608 & i5) == 0) {
                            f530Var2 = f530Var;
                            i8 |= btsVar.k(f530Var2) ? 131072 : 65536;
                            if ((74899 & i8) == 74898 || !btsVar.E()) {
                                f530Var3 = i12 == 0 ? c530.a : f530Var2;
                                i43 i43Var = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                                btsVar.f0(693286680);
                                lhl0 a = khl0.a(i43Var, x4c.D, btsVar, 0);
                                btsVar.f0(-1323940314);
                                int S = cma1.S(btsVar);
                                r1b0 o = btsVar.o();
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                a h = e.h(f530Var3);
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
                                Integer valueOf = Integer.valueOf(R.string.decodersId);
                                Integer valueOf2 = Integer.valueOf(i7);
                                Flags flags = Flags.INSTANCE;
                                int i13 = i8;
                                BlocksKt.DebugBlock(valueOf, valueOf2, null, false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderId(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderIdLabel(), btsVar, (i8 << 3) & 112, 12);
                                BlocksKt.DebugBlock(Integer.valueOf(R.string.decodersName), str2, new x2y(1.0f, false), false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderName(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderNameLabel(), btsVar, i13 & 112, 8);
                                BlocksKt.DebugBlock(Integer.valueOf(R.string.decodersNumOfInits), Integer.valueOf(i9), null, false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderInits(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderInitsLabel(), btsVar, (i13 >> 3) & 112, 12);
                                BlocksKt.DebugBlock(Integer.valueOf(R.string.decodersNumOfReuses), Integer.valueOf(i10), null, false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderReuses(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderReusesLabel(), btsVar, (i13 >> 6) & 112, 12);
                                BlocksKt.DebugBlock(Integer.valueOf(R.string.decodersNumOfReleases), Integer.valueOf(i11), null, false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderReleases(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowDecoderReleasesLabel(), btsVar, (i13 >> 9) & 112, 12);
                                ly3.A(btsVar, false, true, false, false);
                            } else {
                                btsVar.Y();
                                f530Var3 = f530Var2;
                            }
                            aii0 v = btsVar.v();
                            if (v != null) {
                                v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecoderDebugKt$DecoderDebug$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(fid fidVar2, int i14) {
                                        DecoderDebugKt.DecoderDebug(i, str, i9, i10, i11, f530Var3, fidVar2, vng.O(i5 | 1), i6);
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
                        if ((74899 & i8) == 74898) {
                        }
                        if (i12 == 0) {
                        }
                        i43 i43Var2 = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                        btsVar.f0(693286680);
                        lhl0 a2 = khl0.a(i43Var2, x4c.D, btsVar, 0);
                        btsVar.f0(-1323940314);
                        int S2 = cma1.S(btsVar);
                        r1b0 o2 = btsVar.o();
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        a h2 = e.h(f530Var3);
                        if (btsVar.a != null) {
                        }
                    }
                    i11 = i4;
                    i12 = i6 & 32;
                    if (i12 != 0) {
                    }
                    f530Var2 = f530Var;
                    if ((74899 & i8) == 74898) {
                    }
                    if (i12 == 0) {
                    }
                    i43 i43Var22 = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                    btsVar.f0(693286680);
                    lhl0 a22 = khl0.a(i43Var22, x4c.D, btsVar, 0);
                    btsVar.f0(-1323940314);
                    int S22 = cma1.S(btsVar);
                    r1b0 o22 = btsVar.o();
                    ohd.G1.getClass();
                    sls slsVar22 = d.b;
                    a h22 = e.h(f530Var3);
                    if (btsVar.a != null) {
                    }
                }
                i10 = i3;
                if ((i6 & 16) == 0) {
                }
                i11 = i4;
                i12 = i6 & 32;
                if (i12 != 0) {
                }
                f530Var2 = f530Var;
                if ((74899 & i8) == 74898) {
                }
                if (i12 == 0) {
                }
                i43 i43Var222 = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                btsVar.f0(693286680);
                lhl0 a222 = khl0.a(i43Var222, x4c.D, btsVar, 0);
                btsVar.f0(-1323940314);
                int S222 = cma1.S(btsVar);
                r1b0 o222 = btsVar.o();
                ohd.G1.getClass();
                sls slsVar222 = d.b;
                a h222 = e.h(f530Var3);
                if (btsVar.a != null) {
                }
            }
            i9 = i2;
            if ((i6 & 8) != 0) {
            }
            i10 = i3;
            if ((i6 & 16) == 0) {
            }
            i11 = i4;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            f530Var2 = f530Var;
            if ((74899 & i8) == 74898) {
            }
            if (i12 == 0) {
            }
            i43 i43Var2222 = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
            btsVar.f0(693286680);
            lhl0 a2222 = khl0.a(i43Var2222, x4c.D, btsVar, 0);
            btsVar.f0(-1323940314);
            int S2222 = cma1.S(btsVar);
            r1b0 o2222 = btsVar.o();
            ohd.G1.getClass();
            sls slsVar2222 = d.b;
            a h2222 = e.h(f530Var3);
            if (btsVar.a != null) {
            }
        }
        str2 = str;
        if ((i6 & 4) == 0) {
        }
        i9 = i2;
        if ((i6 & 8) != 0) {
        }
        i10 = i3;
        if ((i6 & 16) == 0) {
        }
        i11 = i4;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        f530Var2 = f530Var;
        if ((74899 & i8) == 74898) {
        }
        if (i12 == 0) {
        }
        i43 i43Var22222 = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
        btsVar.f0(693286680);
        lhl0 a22222 = khl0.a(i43Var22222, x4c.D, btsVar, 0);
        btsVar.f0(-1323940314);
        int S22222 = cma1.S(btsVar);
        r1b0 o22222 = btsVar.o();
        ohd.G1.getClass();
        sls slsVar22222 = d.b;
        a h22222 = e.h(f530Var3);
        if (btsVar.a != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DecoderDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-418082298);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$DecoderDebugKt.INSTANCE.m917getLambda1$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.DecoderDebugKt$DecoderDebugPreview$1
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
                    DecoderDebugKt.DecoderDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }
}
