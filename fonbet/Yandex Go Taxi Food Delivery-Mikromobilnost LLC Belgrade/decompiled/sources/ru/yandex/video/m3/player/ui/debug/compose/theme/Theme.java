package ru.yandex.video.m3.player.ui.debug.compose.theme;

import defpackage.bts;
import defpackage.fid;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/compose/theme/Theme;", "", "<init>", "()V", "Lru/yandex/video/m3/player/ui/debug/compose/theme/ColorScheme;", "getColorScheme", "(Lfid;I)Lru/yandex/video/m3/player/ui/debug/compose/theme/ColorScheme;", "colorScheme", "Lru/yandex/video/m3/player/ui/debug/compose/theme/Typography;", "getTypography", "(Lfid;I)Lru/yandex/video/m3/player/ui/debug/compose/theme/Typography;", "typography", "Lru/yandex/video/m3/player/ui/debug/compose/theme/Spacers;", "getSpacers", "(Lfid;I)Lru/yandex/video/m3/player/ui/debug/compose/theme/Spacers;", "spacers", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Theme {
    public static final int $stable = 0;
    public static final Theme INSTANCE = new Theme();

    private Theme() {
    }

    public final ColorScheme getColorScheme(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(1636734315);
        ColorScheme colorScheme = (ColorScheme) btsVar.m(ThemeKt.getLocalColorScheme());
        btsVar.t(false);
        return colorScheme;
    }

    public final Spacers getSpacers(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1779962770);
        Spacers spacers = (Spacers) btsVar.m(ThemeKt.getLocalSpacers());
        btsVar.t(false);
        return spacers;
    }

    public final Typography getTypography(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-262692206);
        Typography typography = (Typography) btsVar.m(ThemeKt.getLocalTypography());
        btsVar.t(false);
        return typography;
    }
}
