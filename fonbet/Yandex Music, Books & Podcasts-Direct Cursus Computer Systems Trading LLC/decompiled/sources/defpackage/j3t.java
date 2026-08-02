package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.databases.user.UserDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class j3t {
    public final o3t a;

    public j3t(o3t o3tVar) {
        this.a = o3tVar;
    }

    public final ArrayList a(String str, Collection collection) {
        collection.getClass();
        List q0 = CollectionsKt.q0(collection, 5);
        String str2 = collection.size() > 5 ? "..." : "";
        StringBuilder sb = new StringBuilder("delete ");
        sb.append(q0);
        sb.append(StringUtil.SPACE);
        sb.append(str2);
        sb.append(", for user ");
        v3w.m(sb, str, 4, "TracksCacheDatabaseImpl", null);
        UserDatabase userDatabase = (UserDatabase) this.a.a.c(str);
        userDatabase.b();
        try {
            ArrayList c = o3t.c(userDatabase.B().b(CollectionsKt.w0(collection)));
            userDatabase.B().a(CollectionsKt.w0(collection));
            userDatabase.t();
            return c;
        } finally {
            userDatabase.g();
        }
    }

    public final void b(String str, ess essVar) {
        str.getClass();
        ssg.a(4, "TracksCacheDatabaseImpl", "delete " + essVar + ", for user " + str, null);
        i3t a = this.a.a(str);
        zvs zvsVar = essVar.a;
        o5n o5nVar = essVar.b;
        thr thrVar = essVar.c;
        a.getClass();
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        up6.F(a.a, false, true, new zzq(8, zvsVar, o5nVar, thrVar));
    }

    public final ArrayList c(String str) {
        ssg.a(4, "TracksCacheDatabaseImpl", "getAll for user ".concat(str), null);
        return o3t.c((List) up6.F(this.a.a(str).a, true, true, new phs(29)));
    }

    public final ArrayList d(zvs zvsVar, String str) {
        zvsVar.getClass();
        ssg.a(4, "TracksCacheDatabaseImpl", hrg.r("getById for ", zvsVar.a, ", for user ", str), null);
        return o3t.c(this.a.a(str).b(t75.c(zvsVar)));
    }

    public final void e(String str, ess essVar, String str2, bb6 bb6Var) {
        str.getClass();
        str2.getClass();
        ssg.a(4, "TracksCacheDatabaseImpl", "updateCacheKey for user ".concat(str), null);
        i3t a = this.a.a(str);
        zvs zvsVar = essVar.a;
        o5n o5nVar = essVar.b;
        thr thrVar = essVar.c;
        a.getClass();
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        up6.F(a.a, false, true, new r90(str2, bb6Var, zvsVar, o5nVar, thrVar, 9));
    }
}
