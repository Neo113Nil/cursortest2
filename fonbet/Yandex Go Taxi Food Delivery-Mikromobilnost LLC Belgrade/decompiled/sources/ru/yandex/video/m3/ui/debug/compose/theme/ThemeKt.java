package ru.yandex.video.m3.ui.debug.compose.theme;

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
import defpackage.tty0;
import defpackage.vng;
import defpackage.vvf0;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\" \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"", "darkTheme", "Lkotlin/Function0;", "Lzy11;", "content", "DebugTheme", "(ZLwls;Lfid;II)V", "Landroidx/compose/runtime/h;", "Lru/yandex/video/m3/ui/debug/compose/theme/ColorScheme;", "LocalColorScheme", "Landroidx/compose/runtime/h;", "getLocalColorScheme", "()Landroidx/compose/runtime/h;", "Lru/yandex/video/m3/ui/debug/compose/theme/Typography;", "LocalTypography", "getLocalTypography", "Lru/yandex/video/m3/ui/debug/compose/theme/Spacers;", "LocalSpacers", "getLocalSpacers", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThemeKt {
    private static final h LocalColorScheme = new a7u0(new sls() { // from class: ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt$LocalColorScheme$1
        @Override // defpackage.sls
        public final ColorScheme invoke() {
            int i = ldc.n;
            long j = ldc.m;
            return new ColorScheme(j, j, j, j, j, j, j, null);
        }
    });
    private static final h LocalTypography = new a7u0(new sls() { // from class: ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt$LocalTypography$1
        @Override // defpackage.sls
        public final Typography invoke() {
            ety0 ety0Var = ety0.d;
            ety0 ety0Var2 = ety0.d;
            tty0[] tty0VarArr = sty0.b;
            return new Typography(ety0Var2, sty0.c, Float.NaN, null);
        }
    });
    private static final h LocalSpacers = new a7u0(new sls() { // from class: ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt$LocalSpacers$1
        @Override // defpackage.sls
        public final Spacers invoke() {
            return new Spacers(Float.NaN, Float.NaN, 0, Float.NaN, null);
        }
    });

    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.jvm.internal.Lambda, ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt$DebugTheme$1] */
    public static final void DebugTheme(boolean z, final wls wlsVar, fid fidVar, final int i, final int i2) {
        final boolean z2;
        int i3;
        ColorScheme colorScheme;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(684201976);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                z2 = z;
                if (btsVar.a(z2)) {
                    i4 = 4;
                    i3 = i4 | i;
                }
            } else {
                z2 = z;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
                int i5 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                z2 = cma1.f0(btsVar);
            }
            btsVar.u();
            if (z2) {
                DarkColorScheme darkColorScheme = DarkColorScheme.INSTANCE;
                colorScheme = new ColorScheme(darkColorScheme.m948getLabelPrimary0d7_KjU(), darkColorScheme.m947getLabelHighlightedPrimary0d7_KjU(), darkColorScheme.m942getBackPrimary0d7_KjU(), darkColorScheme.m943getBackSecondary0d7_KjU(), darkColorScheme.m945getGraphPrimary0d7_KjU(), darkColorScheme.m946getGraphSuccess0d7_KjU(), darkColorScheme.m944getGraphError0d7_KjU(), null);
            } else {
                LightColorScheme lightColorScheme = LightColorScheme.INSTANCE;
                colorScheme = new ColorScheme(lightColorScheme.m956getLabelPrimary0d7_KjU(), lightColorScheme.m955getLabelHighlightedPrimary0d7_KjU(), lightColorScheme.m950getBackPrimary0d7_KjU(), lightColorScheme.m951getBackSecondary0d7_KjU(), lightColorScheme.m953getGraphPrimary0d7_KjU(), lightColorScheme.m954getGraphSuccess0d7_KjU(), lightColorScheme.m952getGraphError0d7_KjU(), null);
            }
            sb2.c(new vvf0[]{LocalColorScheme.a(colorScheme), LocalTypography.a(new Typography(ety0.d, ((fwi) btsVar.m(j.h)).W(7.0f), 0.8f, null)), LocalSpacers.a(new Spacers(4.0f, 4.0f, 2, 3.8f, null))}, wwg.i(btsVar, 1528515768, new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt$DebugTheme$1
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
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.ui.debug.compose.theme.ThemeKt$DebugTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i6) {
                    ThemeKt.DebugTheme(z2, wlsVar, fidVar2, vng.O(i | 1), i2);
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
