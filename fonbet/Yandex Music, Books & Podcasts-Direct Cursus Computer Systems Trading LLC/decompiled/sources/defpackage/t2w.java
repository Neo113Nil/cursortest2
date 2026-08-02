package defpackage;

import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class t2w {
    public final d0w a;

    public t2w(d0w d0wVar) {
        d0wVar.getClass();
        this.a = d0wVar;
    }

    public static mzv a(xrv xrvVar) {
        String id = xrvVar.getId();
        String name = xrvVar.getName();
        CoverPath a = xrvVar.a();
        String w = a != null ? vz1.w(a) : null;
        if (w == null) {
            w = "";
        }
        return new mzv(id, name, w, xrvVar);
    }
}
