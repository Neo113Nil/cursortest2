package ru.yandex.video.m3.player.ui.debug.compose.theme;

import androidx.compose.runtime.h;
import androidx.compose.ui.platform.j;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cma1;
import defpackage.ety0;
import defpackage.f810;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ldc;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sty0;
import defpackage.vng;
import defpackage.vvf0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfig;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfigKt;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000e\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"", "darkTheme", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "playerDebugViewConfig", "Lkotlin/Function0;", "Lzy11;", "content", "DebugTheme", "(ZLru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;Lwls;Lfid;II)V", "Landroidx/compose/runtime/h;", "Lru/yandex/video/m3/player/ui/debug/compose/theme/ColorScheme;", "LocalColorScheme", "Landroidx/compose/runtime/h;", "getLocalColorScheme", "()Landroidx/compose/runtime/h;", "Lru/yandex/video/m3/player/ui/debug/compose/theme/Typography;", "LocalTypography", "getLocalTypography", "Lru/yandex/video/m3/player/ui/debug/compose/theme/Spacers;", "LocalSpacers", "getLocalSpacers", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThemeKt {
    private static final h LocalColorScheme = new a7u0(new sls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt$LocalColorScheme$1
        @Override // defpackage.sls
        public final ColorScheme invoke() {
            int i = ldc.n;
            long j = ldc.m;
            return new ColorScheme(j, j, j, j, j, j, j, null);
        }
    });
    private static final h LocalTypography = new a7u0(new sls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt$LocalTypography$1
        @Override // defpackage.sls
        public final Typography invoke() {
            ety0 ety0Var = ety0.d;
            return new Typography(ety0.d, Float.NaN);
        }
    });
    private static final h LocalSpacers = new a7u0(new sls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt$LocalSpacers$1
        @Override // defpackage.sls
        public final Spacers invoke() {
            return new Spacers(Float.NaN, Float.NaN, Float.NaN, null);
        }
    });

    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt$DebugTheme$1] */
    public static final void DebugTheme(boolean z, PlayerDebugViewConfig playerDebugViewConfig, final wls wlsVar, fid fidVar, final int i, final int i2) {
        final boolean z2;
        int i3;
        PlayerDebugViewConfig playerDebugViewConfig2;
        ColorScheme colorScheme;
        int i4;
        int i5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1107609198);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                z2 = z;
                if (btsVar.a(z2)) {
                    i5 = 4;
                    i3 = i5 | i;
                }
            } else {
                z2 = z;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                playerDebugViewConfig2 = playerDebugViewConfig;
                if (btsVar.k(playerDebugViewConfig2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                playerDebugViewConfig2 = playerDebugViewConfig;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            playerDebugViewConfig2 = playerDebugViewConfig;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if ((i2 & 1) != 0) {
                    z2 = cma1.f0(btsVar);
                }
                if ((i2 & 2) != 0) {
                    playerDebugViewConfig2 = PlayerDebugViewConfigKt.PlayerDebugViewConfig$default(null, 1, null);
                }
            } else {
                btsVar.Y();
            }
            btsVar.u();
            if (z2) {
                DarkColorScheme darkColorScheme = DarkColorScheme.INSTANCE;
                colorScheme = new ColorScheme(darkColorScheme.m844getLabelPrimary0d7_KjU(), darkColorScheme.m843getLabelHighlightedPrimary0d7_KjU(), darkColorScheme.m838getBackPrimary0d7_KjU(), darkColorScheme.m839getBackSecondary0d7_KjU(), darkColorScheme.m841getGraphPrimary0d7_KjU(), darkColorScheme.m842getGraphSuccess0d7_KjU(), darkColorScheme.m840getGraphError0d7_KjU(), null);
            } else {
                LightColorScheme lightColorScheme = LightColorScheme.INSTANCE;
                colorScheme = new ColorScheme(lightColorScheme.m851getLabelPrimary0d7_KjU(), lightColorScheme.m850getLabelHighlightedPrimary0d7_KjU(), lightColorScheme.m845getBackPrimary0d7_KjU(), lightColorScheme.m846getBackSecondary0d7_KjU(), lightColorScheme.m848getGraphPrimary0d7_KjU(), lightColorScheme.m849getGraphSuccess0d7_KjU(), lightColorScheme.m847getGraphError0d7_KjU(), null);
            }
            sty0 fontSize = playerDebugViewConfig2.getFontSize();
            btsVar.f0(1000554526);
            long W = fontSize == null ? ((fwi) btsVar.m(j.h)).W(7.0f) : fontSize.a;
            btsVar.t(false);
            sb2.c(new vvf0[]{LocalColorScheme.a(colorScheme), LocalTypography.a(new Typography(new ety0(0L, W, null, null, null, null, 0L, 0, 0L, null, null, 16777213), 0.8f)), LocalSpacers.a(new Spacers(4.0f, 4.0f, 2.0f, null))}, wwg.i(btsVar, 82132178, new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt$DebugTheme$1
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i6) {
                    if ((i6 & 3) == 2) {
                        bts btsVar2 = (bts) fidVar2;
                        if (btsVar2.E()) {
                            btsVar2.Y();
                            return;
                        }
                    }
                    f810.b(null, null, null, wls.this, fidVar2, 0, 7);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            }), btsVar, 48);
        }
        final PlayerDebugViewConfig playerDebugViewConfig3 = playerDebugViewConfig2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.theme.ThemeKt$DebugTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i6) {
                    ThemeKt.DebugTheme(z2, playerDebugViewConfig3, wlsVar, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    public static final h getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final h getLocalSpacers() {
        return LocalSpacers;
    }

    public static final h getLocalTypography() {
        return LocalTypography;
    }
}
