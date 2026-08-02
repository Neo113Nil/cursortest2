package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.q0;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final class t6s {
    public final gci0 a;

    public t6s(o5s o5sVar, b6s b6sVar) {
        ThemeStyle themeStyle;
        gci0 gci0Var = o5sVar.c;
        syc sycVar = new syc(gci0Var, 16);
        q0 a = wsr0.a(xsr0.a, 3);
        j5s j5sVar = (j5s) gci0Var.a.getValue();
        this.a = e.R(sycVar, b6sVar, a, (j5sVar == null || (themeStyle = j5sVar.g) == null) ? ThemeStyle.DEFAULT : themeStyle);
    }
}
