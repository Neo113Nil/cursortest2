package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;
import ru.yandex.taxi.themes.experiments.e;
import ru.yandex.taxi.themes.g;

/* loaded from: classes8.dex */
public final class whf {
    public final h3y a;
    public final h3y b;
    public final h3y c;

    public whf(h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
    }

    public final ThemeChangeMode a() {
        DarkThemeSwitchExperiment darkThemeSwitchExperiment = (DarkThemeSwitchExperiment) ((e) this.a.get()).a.c();
        g gVar = (g) this.c.get();
        ThemeChangeMode themeChangeMode = (ThemeChangeMode) ((r0) ((pz40) ((pay0) this.b.get()).d.getValue())).getValue();
        gVar.getClass();
        return g.b(darkThemeSwitchExperiment, themeChangeMode);
    }
}
