package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class nu2 {
    public final va7 a;

    public nu2(va7 va7Var) {
        va7Var.getClass();
        this.a = va7Var;
    }

    public final boolean a(String str) {
        Object t7oVar;
        str.getClass();
        db7 a = this.a.a();
        a.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri build = Uri.parse(str).buildUpon().clearQuery().path("ping").build();
        vq1.C(build, "The uri must be set.");
        nb7 nb7Var = new nb7(build, 0L, 1, null, map, 0L, -1L, null, 2);
        Timber.INSTANCE.d("ping url is " + nb7Var.a, new Object[0]);
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Boolean.valueOf(a.a(nb7Var) >= 0);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object obj = Boolean.FALSE;
        if (t7oVar instanceof t7o) {
            t7oVar = obj;
        }
        a.close();
        return ((Boolean) t7oVar).booleanValue();
    }
}
