package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a72 {
    public final yfx a;

    public a72(yfx yfxVar) {
        this.a = yfxVar;
    }

    public final pjc a() {
        xdr xdrVar = saa.a;
        yfx yfxVar = this.a;
        String str = ((frt) yfxVar.c).c().a;
        str.getClass();
        ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "get all flow for user ".concat(str), null);
        w62 w62Var = (w62) yfxVar.b;
        return zsd.k0(w62Var.a.a(str, new qi(w62Var, null, 10)), dm6.a);
    }

    public final pjc b(css cssVar) {
        cssVar.getClass();
        xdr xdrVar = saa.a;
        yfx yfxVar = this.a;
        String str = ((frt) yfxVar.c).c().a;
        str.getClass();
        ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "get all auto cached flow for user " + str + ", cacheType=" + cssVar, null);
        w62 w62Var = (w62) yfxVar.b;
        return zsd.k0(w62Var.a.a(str, new n71(cssVar, w62Var, (Continuation) null, 2)), dm6.a);
    }
}
