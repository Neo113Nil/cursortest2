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
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.sty0;
import defpackage.to5;
import defpackage.uh6;
import defpackage.vng;
import defpackage.vqy0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aM\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aF\u0010\u0015\u001a\u00020\n2\n\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0016\u001a\u00020\r2\n\b\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u000f\u0010\u001d\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u000f\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001e\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"", "resId", "", Constants.KEY_DATA, "Lf530;", "modifier", "", "isHighlighted", "showBlock", "showLabel", "Lzy11;", "DebugBlock", "(Ljava/lang/Integer;Ljava/lang/Object;Lf530;ZZZLfid;II)V", "", "text", "Label", "(Ljava/lang/String;Lf530;ZLfid;II)V", "Lldc;", "color", "DebugText-yrwZFoE", "(Ljava/lang/Integer;Ljava/lang/Object;Lf530;ZJLfid;II)V", "DebugText", "getDataText", "(Ljava/lang/Integer;Ljava/lang/Object;Lfid;I)Ljava/lang/String;", "isErrorIfDataIsNull", "(I)Z", "DebugBlockPreview", "(Lfid;I)V", "DebugBlockIsHighlightedPreview", "DebugBlockNullDataPreview", "DebugBlockNullDataErrorPreview", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlocksKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebugBlock(final Integer num, final Object obj, f530 f530Var, boolean z, boolean z2, boolean z3, fid fidVar, final int i, final int i2) {
        int i3;
        Object obj2;
        final f530 f530Var2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        bts btsVar;
        final boolean z7;
        boolean z8;
        boolean z9;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-442642022);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            obj2 = obj;
        } else {
            obj2 = obj;
            if ((i & 48) == 0) {
                i3 |= btsVar2.e(obj2) ? 32 : 16;
            }
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                z4 = z;
                i3 |= btsVar2.a(z4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    z5 = z2;
                    i3 |= btsVar2.a(z5) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i) == 0) {
                        z6 = z3;
                        i3 |= btsVar2.a(z6) ? 131072 : 65536;
                        i7 = i3;
                        if ((74899 & i7) == 74898 || !btsVar2.E()) {
                            c530 c530Var = c530.a;
                            f530 f530Var3 = i8 != 0 ? c530Var : f530Var2;
                            boolean z10 = i4 != 0 ? false : z4;
                            if (i5 != 0) {
                                z5 = true;
                            }
                            if (i6 != 0) {
                                z6 = true;
                            }
                            if (z5) {
                                to5 to5Var = x4c.E;
                                btsVar2.f0(693286680);
                                lhl0 a = khl0.a(lr20.a, to5Var, btsVar2, 48);
                                btsVar2.f0(-1323940314);
                                int S = cma1.S(btsVar2);
                                r1b0 o = btsVar2.o();
                                ohd.G1.getClass();
                                sls slsVar = d.b;
                                a h = e.h(f530Var3);
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
                                btsVar2.f0(-1710999514);
                                if (z6) {
                                    btsVar2.f0(-1710998367);
                                    if (num == null) {
                                        z8 = false;
                                        z9 = true;
                                    } else {
                                        z8 = false;
                                        z9 = true;
                                        Label(ohb1.e(btsVar2, num.intValue()), null, z10, btsVar2, (i7 >> 3) & 896, 2);
                                    }
                                    btsVar2.t(z8);
                                    oeb1.c(btsVar2, ljs0.q(c530Var, Theme.INSTANCE.getSpacers(btsVar2, 6).getLabelSpace()));
                                } else {
                                    z8 = false;
                                    z9 = true;
                                }
                                btsVar2.t(z8);
                                m912DebugTextyrwZFoE(num, obj2, null, z10, 0L, btsVar2, i7 & 7294, 20);
                                btsVar2 = btsVar2;
                                ly3.A(btsVar2, z8, z9, z8, z8);
                            }
                            btsVar = btsVar2;
                            z7 = z10;
                            f530Var2 = f530Var3;
                        } else {
                            btsVar2.Y();
                            btsVar = btsVar2;
                            z7 = z4;
                        }
                        final boolean z11 = z5;
                        final boolean z12 = z6;
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$DebugBlock$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(fid fidVar2, int i9) {
                                    BlocksKt.DebugBlock(num, obj, f530Var2, z7, z11, z12, fidVar2, vng.O(i | 1), i2);
                                }

                                @Override // defpackage.wls
                                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                                    invoke((fid) obj3, ((Number) obj4).intValue());
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z6 = z3;
                    i7 = i3;
                    if ((74899 & i7) == 74898) {
                    }
                    c530 c530Var2 = c530.a;
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (z5) {
                    }
                    btsVar = btsVar2;
                    z7 = z10;
                    f530Var2 = f530Var3;
                    final boolean z112 = z5;
                    final boolean z122 = z6;
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z5 = z2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z6 = z3;
                i7 = i3;
                if ((74899 & i7) == 74898) {
                }
                c530 c530Var22 = c530.a;
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (z5) {
                }
                btsVar = btsVar2;
                z7 = z10;
                f530Var2 = f530Var3;
                final boolean z1122 = z5;
                final boolean z1222 = z6;
                v = btsVar.v();
                if (v != null) {
                }
            }
            z4 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z5 = z2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z6 = z3;
            i7 = i3;
            if ((74899 & i7) == 74898) {
            }
            c530 c530Var222 = c530.a;
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (z5) {
            }
            btsVar = btsVar2;
            z7 = z10;
            f530Var2 = f530Var3;
            final boolean z11222 = z5;
            final boolean z12222 = z6;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z5 = z2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z6 = z3;
        i7 = i3;
        if ((74899 & i7) == 74898) {
        }
        c530 c530Var2222 = c530.a;
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (z5) {
        }
        btsVar = btsVar2;
        z7 = z10;
        f530Var2 = f530Var3;
        final boolean z112222 = z5;
        final boolean z122222 = z6;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DebugBlockIsHighlightedPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1534523789);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$BlocksKt.INSTANCE.m914getLambda2$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$DebugBlockIsHighlightedPreview$1
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
                    BlocksKt.DebugBlockIsHighlightedPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DebugBlockNullDataErrorPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(987161953);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$BlocksKt.INSTANCE.m916getLambda4$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$DebugBlockNullDataErrorPreview$1
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
                    BlocksKt.DebugBlockNullDataErrorPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DebugBlockNullDataPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(409393419);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$BlocksKt.INSTANCE.m915getLambda3$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$DebugBlockNullDataPreview$1
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
                    BlocksKt.DebugBlockNullDataPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DebugBlockPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1063155610);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$BlocksKt.INSTANCE.m913getLambda1$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$DebugBlockPreview$1
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
                    BlocksKt.DebugBlockPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0062  */
    /* renamed from: DebugText-yrwZFoE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m912DebugTextyrwZFoE(final Integer num, final Object obj, f530 f530Var, boolean z, long j, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        boolean z2;
        long j2;
        final long j3;
        f530 f530Var3;
        bts btsVar;
        final boolean z3;
        final f530 f530Var4;
        aii0 v;
        int i5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1757086545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar2.k(num) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar2.e(obj) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                z2 = z;
                i3 |= btsVar2.a(z2) ? 2048 : 1024;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (btsVar2.d(j2)) {
                            i5 = 16384;
                            i3 |= i5;
                        }
                    } else {
                        j2 = j;
                    }
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                if ((i3 & 9363) == 9362 || !btsVar2.E()) {
                    btsVar2.a0();
                    if ((i & 1) != 0 || btsVar2.C()) {
                        f530 f530Var5 = i6 != 0 ? c530.a : f530Var2;
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            j3 = Theme.INSTANCE.getColorScheme(btsVar2, 6).m941getLabelPrimary0d7_KjU();
                            i3 &= -57345;
                        } else {
                            j3 = j2;
                        }
                        f530Var3 = f530Var5;
                    } else {
                        btsVar2.Y();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        long j4 = j2;
                        f530Var3 = f530Var2;
                        j3 = j4;
                    }
                    int i7 = i3;
                    boolean z4 = z2;
                    btsVar2.u();
                    String dataText = getDataText(num, obj, btsVar2, i7 & HProv.PP_DELETE_SAVED_PASSWD);
                    btsVar2.f0(-662919159);
                    long m940getLabelHighlightedPrimary0d7_KjU = z4 ? Theme.INSTANCE.getColorScheme(btsVar2, 6).m940getLabelHighlightedPrimary0d7_KjU() : j3;
                    btsVar2.t(false);
                    lzr lzrVar = z4 ? lzr.G : lzr.D;
                    Theme theme = Theme.INSTANCE;
                    btsVar = btsVar2;
                    vqy0.b(dataText, f530Var3, m940getLabelHighlightedPrimary0d7_KjU, 0L, lzrVar, 0L, new sjy0(5), 0L, 0, false, 0, 0, ety0.a(theme.getTypography(btsVar2, 6).getTextStyle(), 0L, theme.getTypography(btsVar2, 6).m966getFontSizeXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i7 >> 3) & 112, 0, 64984);
                    z3 = z4;
                    f530Var4 = f530Var3;
                } else {
                    btsVar2.Y();
                    btsVar = btsVar2;
                    f530Var4 = f530Var2;
                    z3 = z2;
                    j3 = j2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$DebugText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(fid fidVar2, int i8) {
                            BlocksKt.m912DebugTextyrwZFoE(num, obj, f530Var4, z3, j3, fidVar2, vng.O(i | 1), i2);
                        }

                        @Override // defpackage.wls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((fid) obj2, ((Number) obj3).intValue());
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            btsVar2.a0();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            f530Var3 = f530Var5;
            int i72 = i3;
            boolean z42 = z2;
            btsVar2.u();
            String dataText2 = getDataText(num, obj, btsVar2, i72 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar2.f0(-662919159);
            if (z42) {
            }
            btsVar2.t(false);
            if (z42) {
            }
            Theme theme2 = Theme.INSTANCE;
            btsVar = btsVar2;
            vqy0.b(dataText2, f530Var3, m940getLabelHighlightedPrimary0d7_KjU, 0L, lzrVar, 0L, new sjy0(5), 0L, 0, false, 0, 0, ety0.a(theme2.getTypography(btsVar2, 6).getTextStyle(), 0L, theme2.getTypography(btsVar2, 6).m966getFontSizeXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i72 >> 3) & 112, 0, 64984);
            z3 = z42;
            f530Var4 = f530Var3;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        btsVar2.a0();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        f530Var3 = f530Var5;
        int i722 = i3;
        boolean z422 = z2;
        btsVar2.u();
        String dataText22 = getDataText(num, obj, btsVar2, i722 & HProv.PP_DELETE_SAVED_PASSWD);
        btsVar2.f0(-662919159);
        if (z422) {
        }
        btsVar2.t(false);
        if (z422) {
        }
        Theme theme22 = Theme.INSTANCE;
        btsVar = btsVar2;
        vqy0.b(dataText22, f530Var3, m940getLabelHighlightedPrimary0d7_KjU, 0L, lzrVar, 0L, new sjy0(5), 0L, 0, false, 0, 0, ety0.a(theme22.getTypography(btsVar2, 6).getTextStyle(), 0L, theme22.getTypography(btsVar2, 6).m966getFontSizeXSAIIZE(), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i722 >> 3) & 112, 0, 64984);
        z3 = z422;
        f530Var4 = f530Var3;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Label(final String str, f530 f530Var, boolean z, fid fidVar, final int i, final int i2) {
        String str2;
        int i3;
        f530 f530Var2;
        int i4;
        boolean z2;
        boolean z3;
        long m941getLabelPrimary0d7_KjU;
        bts btsVar;
        final f530 f530Var3;
        final boolean z4;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-159945410);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (btsVar2.k(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= btsVar2.a(z2) ? 256 : 128;
                if ((i3 & 147) == 146 || !btsVar2.E()) {
                    f530 f530Var4 = i5 != 0 ? c530.a : f530Var2;
                    z3 = i4 != 0 ? false : z2;
                    if (z3) {
                        btsVar2.f0(535230011);
                        m941getLabelPrimary0d7_KjU = Theme.INSTANCE.getColorScheme(btsVar2, 6).m940getLabelHighlightedPrimary0d7_KjU();
                        btsVar2.t(false);
                    } else {
                        btsVar2.f0(535300102);
                        m941getLabelPrimary0d7_KjU = Theme.INSTANCE.getColorScheme(btsVar2, 6).m941getLabelPrimary0d7_KjU();
                        btsVar2.t(false);
                    }
                    lzr lzrVar = lzr.G;
                    Theme theme = Theme.INSTANCE;
                    ety0 textStyle = theme.getTypography(btsVar2, 6).getTextStyle();
                    long m966getFontSizeXSAIIZE = theme.getTypography(btsVar2, 6).m966getFontSizeXSAIIZE();
                    float labelSizeMultiplier = theme.getTypography(btsVar2, 6).getLabelSizeMultiplier();
                    uh6.g(m966getFontSizeXSAIIZE);
                    btsVar = btsVar2;
                    f530 f530Var5 = f530Var4;
                    vqy0.b(str2, f530Var5, m941getLabelPrimary0d7_KjU, 0L, lzrVar, 0L, new sjy0(6), 0L, 0, false, 0, 0, ety0.a(textStyle, 0L, uh6.K(sty0.c(m966getFontSizeXSAIIZE) * labelSizeMultiplier, 1095216660480L & m966getFontSizeXSAIIZE), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i3 & 14) | ImageMetadata.EDGE_MODE | (i3 & 112), 384, 60888);
                    f530Var3 = f530Var5;
                    z4 = z3;
                } else {
                    btsVar2.Y();
                    btsVar = btsVar2;
                    f530Var3 = f530Var2;
                    z4 = z2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.BlocksKt$Label$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(fid fidVar2, int i6) {
                            BlocksKt.Label(str, f530Var3, z4, fidVar2, vng.O(i | 1), i2);
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
            z2 = z;
            if ((i3 & 147) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (z3) {
            }
            lzr lzrVar2 = lzr.G;
            Theme theme2 = Theme.INSTANCE;
            ety0 textStyle2 = theme2.getTypography(btsVar2, 6).getTextStyle();
            long m966getFontSizeXSAIIZE2 = theme2.getTypography(btsVar2, 6).m966getFontSizeXSAIIZE();
            float labelSizeMultiplier2 = theme2.getTypography(btsVar2, 6).getLabelSizeMultiplier();
            uh6.g(m966getFontSizeXSAIIZE2);
            btsVar = btsVar2;
            f530 f530Var52 = f530Var4;
            vqy0.b(str2, f530Var52, m941getLabelPrimary0d7_KjU, 0L, lzrVar2, 0L, new sjy0(6), 0L, 0, false, 0, 0, ety0.a(textStyle2, 0L, uh6.K(sty0.c(m966getFontSizeXSAIIZE2) * labelSizeMultiplier2, 1095216660480L & m966getFontSizeXSAIIZE2), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i3 & 14) | ImageMetadata.EDGE_MODE | (i3 & 112), 384, 60888);
            f530Var3 = f530Var52;
            z4 = z3;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i3 & 147) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (z3) {
        }
        lzr lzrVar22 = lzr.G;
        Theme theme22 = Theme.INSTANCE;
        ety0 textStyle22 = theme22.getTypography(btsVar2, 6).getTextStyle();
        long m966getFontSizeXSAIIZE22 = theme22.getTypography(btsVar2, 6).m966getFontSizeXSAIIZE();
        float labelSizeMultiplier22 = theme22.getTypography(btsVar2, 6).getLabelSizeMultiplier();
        uh6.g(m966getFontSizeXSAIIZE22);
        btsVar = btsVar2;
        f530 f530Var522 = f530Var4;
        vqy0.b(str2, f530Var522, m941getLabelPrimary0d7_KjU, 0L, lzrVar22, 0L, new sjy0(6), 0L, 0, false, 0, 0, ety0.a(textStyle22, 0L, uh6.K(sty0.c(m966getFontSizeXSAIIZE22) * labelSizeMultiplier22, 1095216660480L & m966getFontSizeXSAIIZE22), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), btsVar, (i3 & 14) | ImageMetadata.EDGE_MODE | (i3 & 112), 384, 60888);
        f530Var3 = f530Var522;
        z4 = z3;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final String getDataText(Integer num, Object obj, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1388819989);
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 == null) {
            if (num == null || !isErrorIfDataIsNull(num.intValue())) {
                btsVar.f0(-707788702);
                obj2 = ohb1.e(btsVar, R.string.noDataLabel);
                btsVar.t(false);
            } else {
                btsVar.f0(-707858173);
                obj2 = ohb1.e(btsVar, R.string.errorLabel);
                btsVar.t(false);
            }
        }
        btsVar.t(false);
        return obj2;
    }

    private static final boolean isErrorIfDataIsNull(int i) {
        if (i == R.string.epsilonUuid) {
            return true;
        }
        if (i == R.string.epsilonPlayerIndex || i == R.string.epsilonEngineIndex || i == R.string.epsilonPreloadState || i == R.string.epsilonCurrentQuality || i == R.string.epsilonCurrentBufferSize) {
            return false;
        }
        if (i == R.string.decodersId || i == R.string.decodersName || i == R.string.decodersNumOfInits || i == R.string.decodersNumOfReuses || i == R.string.decodersNumOfReleases || i == R.string.speedTelemetryBlurShownTime || i == R.string.speedTelemetryImageShownTime || i == R.string.speedTelemetryFirstFrameShownTime || i == R.string.speedTelemetryPlayDeltaTime || i == R.string.speedTelemetryTotalTime) {
            return true;
        }
        if (i == R.string.compactSpeedTelemetryBlurShownTime || i == R.string.compactSpeedTelemetryImageShownTime || i == R.string.compactSpeedTelemetryFirstFrameShownTime || i == R.string.compactSpeedTelemetryPlayDeltaTime || i == R.string.compactSpeedTelemetryTotalTime) {
            return false;
        }
        if (i == R.string.numOfFatals || i == R.string.isStartFromCache || i == R.string.isOnDemandStart) {
            return true;
        }
        return (i == R.string.bandwidthMinValue || i == R.string.bandwidthMaxValue || i == R.string.bandwidthLastValue || i == R.string.networkRequestsTotalNumOfSuccess || i == R.string.networkRequestsTotalNumOfErrors || i == R.string.networkRequestsCurrentNumOfSuccess || i == R.string.networkRequestsCurrentNumOfErrors || i == R.string.networkRequestsMaxValues || i == R.string.networkRequestsLastValues) ? false : true;
    }
}
