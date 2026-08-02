package defpackage;

import j$.time.LocalDate;
import java.util.Date;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public final class cej {
    public final jyr a = l18.b.b(hag.I(dzs.class), true);

    public final raj a(mqs mqsVar, boolean z) {
        LocalDate d;
        CoverPath coverPath;
        mqsVar.getClass();
        dzs dzsVar = (dzs) this.a.getValue();
        dzsVar.getClass();
        g0t g0tVar = null;
        co6 co6Var = dzsVar.apply(mqsVar) ? mqsVar.x0 : null;
        String pathForSize = (co6Var == null || (coverPath = co6Var.a) == null) ? null : coverPath.getPathForSize(wct.s());
        if (pathForSize == null) {
            pathForSize = "";
        }
        String str = pathForSize;
        String j = mqsVar.j();
        boolean z2 = mqsVar.m == WarningContent.EXPLICIT;
        jzb i = mqsVar.i();
        boolean o = mqsVar.o();
        Date date = mqsVar.x;
        if (date != null && (d = gkg.d(date)) != null) {
            g0tVar = new g0t(gkg.a(d), gkg.c(d));
        }
        return new raj(str, j, z2, i, o, g0tVar, false, z, 192);
    }
}
