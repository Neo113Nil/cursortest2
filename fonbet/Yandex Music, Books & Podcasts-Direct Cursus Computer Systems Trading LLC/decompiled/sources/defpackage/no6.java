package defpackage;

import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class no6 implements a2t {
    public final o8q a;
    public final dzs b;

    public no6(y9w y9wVar, o8q o8qVar, dzs dzsVar) {
        this.a = o8qVar;
        this.b = dzsVar;
    }

    @Override // defpackage.a2t
    public final po6 a(mqs mqsVar) {
        String str;
        CoverPath coverPath;
        mqsVar.getClass();
        co6 co6Var = this.b.apply(mqsVar) ? mqsVar.x0 : null;
        if (co6Var == null || (coverPath = co6Var.a) == null || (str = coverPath.getPathForSize(wct.s())) == null) {
            str = "";
        }
        String str2 = str;
        boolean U = StringsKt.U(mqsVar.j());
        o8q o8qVar = this.a;
        String c = (U && mqsVar.k == dg2.d) ? o8qVar.a.c(R.string.track_has_been_deleted) : mqsVar.j();
        String obj = zwf.a0(mqsVar, o8qVar, R.string.unknown_album).toString();
        return new po6(str2, c, !StringsKt.U(obj) ? obj : null, mqsVar.m == WarningContent.EXPLICIT, mqsVar.i(), mqsVar.o(), true);
    }
}
