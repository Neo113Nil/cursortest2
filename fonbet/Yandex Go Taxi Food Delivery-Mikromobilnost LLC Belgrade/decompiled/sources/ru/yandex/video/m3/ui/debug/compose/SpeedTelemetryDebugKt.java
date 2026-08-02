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
import defpackage.i43;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ly3;
import defpackage.nhl0;
import defpackage.ohd;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.vng;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.ui.debug.SpeedTelemetry;
import ru.yandex.video.m3.ui.debug.compose.theme.Theme;
import ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a5\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "speedTelemetry", "", "playDelta", "", "isCompactView", "Lf530;", "modifier", "Lzy11;", "SpeedTelemetryDebug", "(Lru/yandex/video/m3/ui/debug/SpeedTelemetry;Ljava/lang/Long;ZLf530;Lfid;II)V", "", "millisecondsToString", "(JZ)Ljava/lang/String;", "SpeedTelemetryDebugPreview", "(Lfid;I)V", "SpeedTelemetryDebugIsCompactPreview", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpeedTelemetryDebugKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SpeedTelemetryDebug(final SpeedTelemetry speedTelemetry, final Long l, final boolean z, f530 f530Var, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        final f530 f530Var3;
        Flags flags;
        Long totalTime;
        Long firstFrameShown;
        Long imageShown;
        Long blurShown;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(311207663);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(speedTelemetry) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(l) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.a(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !btsVar.E()) {
                c530 c530Var = c530.a;
                f530Var3 = i4 == 0 ? c530Var : f530Var2;
                flags = Flags.INSTANCE;
                if (flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryInfo()) {
                    i43 i43Var = new i43(Theme.INSTANCE.getSpacers(btsVar, 6).m961getHorizontalArrangementD9Ej5fM(), true, new quz(11));
                    btsVar.f0(693286680);
                    lhl0 a = khl0.a(i43Var, x4c.D, btsVar, 0);
                    btsVar.f0(-1323940314);
                    int S = cma1.S(btsVar);
                    r1b0 o = btsVar.o();
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    a h = e.h(f530Var3);
                    String str = null;
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
                    int i5 = z ? R.string.compactSpeedTelemetryBlurShownTime : R.string.speedTelemetryBlurShownTime;
                    String millisecondsToString = (speedTelemetry == null || (blurShown = speedTelemetry.getBlurShown()) == null) ? null : millisecondsToString(blurShown.longValue(), z);
                    boolean showSpeedTelemetryBlurShown = flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryBlurShown();
                    boolean showSpeedTelemetryBlurShownLabel = flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryBlurShownLabel();
                    nhl0 nhl0Var = nhl0.a;
                    BlocksKt.DebugBlock(Integer.valueOf(i5), millisecondsToString, nhl0Var.a(c530Var, 1.0f, false), false, showSpeedTelemetryBlurShown, showSpeedTelemetryBlurShownLabel, btsVar, 0, 8);
                    int i6 = z ? R.string.compactSpeedTelemetryImageShownTime : R.string.speedTelemetryImageShownTime;
                    BlocksKt.DebugBlock(Integer.valueOf(i6), (speedTelemetry == null || (imageShown = speedTelemetry.getImageShown()) == null) ? null : millisecondsToString(imageShown.longValue(), z), nhl0Var.a(c530Var, 1.0f, false), false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryImageShown(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryImageShownLabel(), btsVar, 0, 8);
                    int i7 = z ? R.string.compactSpeedTelemetryFirstFrameShownTime : R.string.speedTelemetryFirstFrameShownTime;
                    BlocksKt.DebugBlock(Integer.valueOf(i7), (speedTelemetry == null || (firstFrameShown = speedTelemetry.getFirstFrameShown()) == null) ? null : millisecondsToString(firstFrameShown.longValue(), z), nhl0Var.a(c530Var, 1.0f, false), false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryFirstFrameShown(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryFirstFrameShownLabel(), btsVar, 0, 8);
                    int i8 = z ? R.string.compactSpeedTelemetryPlayDeltaTime : R.string.speedTelemetryPlayDeltaTime;
                    BlocksKt.DebugBlock(Integer.valueOf(i8), l != null ? millisecondsToString(l.longValue(), z) : null, nhl0Var.a(c530Var, 1.0f, false), false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryPlayDelta(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryPlayDeltaLabel(), btsVar, 0, 8);
                    int i9 = z ? R.string.compactSpeedTelemetryTotalTime : R.string.speedTelemetryTotalTime;
                    if (speedTelemetry != null && (totalTime = speedTelemetry.getTotalTime()) != null) {
                        str = millisecondsToString(totalTime.longValue(), z);
                    }
                    BlocksKt.DebugBlock(Integer.valueOf(i9), str, nhl0Var.a(c530Var, 1.0f, false), false, flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryTotalTime(), flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryTotalTimeLabel(), btsVar, 0, 8);
                    ly3.A(btsVar, false, true, false, false);
                }
            } else {
                btsVar.Y();
                f530Var3 = f530Var2;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.SpeedTelemetryDebugKt$SpeedTelemetryDebug$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(fid fidVar2, int i10) {
                        SpeedTelemetryDebugKt.SpeedTelemetryDebug(SpeedTelemetry.this, l, z, f530Var3, fidVar2, vng.O(i | 1), i2);
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
        if ((i3 & 1171) == 1170) {
        }
        c530 c530Var2 = c530.a;
        if (i4 == 0) {
        }
        flags = Flags.INSTANCE;
        if (flags.getListSdkDebugViewFlags(btsVar, 6).getShowSpeedTelemetryInfo()) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpeedTelemetryDebugIsCompactPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1615907311);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$SpeedTelemetryDebugKt.INSTANCE.m922getLambda2$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.SpeedTelemetryDebugKt$SpeedTelemetryDebugIsCompactPreview$1
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
                    SpeedTelemetryDebugKt.SpeedTelemetryDebugIsCompactPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SpeedTelemetryDebugPreview(fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1704279102);
        if (i == 0 && btsVar.E()) {
            btsVar.Y();
        } else {
            ThemeKt.DebugTheme(false, ComposableSingletons$SpeedTelemetryDebugKt.INSTANCE.m921getLambda1$video_player_internalRelease(), btsVar, 48, 1);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.SpeedTelemetryDebugKt$SpeedTelemetryDebugPreview$1
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
                    SpeedTelemetryDebugKt.SpeedTelemetryDebugPreview(fidVar2, vng.O(i | 1));
                }
            };
        }
    }

    private static final String millisecondsToString(long j, boolean z) {
        if (z) {
            return String.valueOf(j);
        }
        return j + "ms";
    }
}
