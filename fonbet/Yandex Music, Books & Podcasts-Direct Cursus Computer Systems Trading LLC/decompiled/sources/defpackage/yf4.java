package defpackage;

import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public abstract class yf4 {
    public static final dzs a;

    static {
        l18 l18Var = l18.b;
        bdt I = hag.I(dzs.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        a = (dzs) qdcVar.C(I);
    }

    public static zf4 a(rf4 rf4Var) {
        String str;
        CoverPath coverPath;
        rf4Var.getClass();
        mqs mqsVar = rf4Var.b;
        dzs dzsVar = a;
        dzsVar.getClass();
        mqsVar.getClass();
        co6 co6Var = dzsVar.apply(mqsVar) ? mqsVar.x0 : null;
        if (co6Var == null || (coverPath = co6Var.a) == null || (str = coverPath.getPathForSize(wct.s())) == null) {
            str = "";
        }
        String str2 = str;
        String j = mqsVar.j();
        String obj = fxf.W(mqsVar).toString();
        boolean z = mqsVar.m == WarningContent.EXPLICIT;
        jzb i = mqsVar.i();
        boolean o = mqsVar.o();
        lf4 lf4Var = rf4Var.d;
        return new zf4(lf4Var.a, lf4Var.b, j, obj, z, i, o, str2);
    }
}
