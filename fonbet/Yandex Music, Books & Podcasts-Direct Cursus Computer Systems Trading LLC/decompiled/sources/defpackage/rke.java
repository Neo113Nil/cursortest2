package defpackage;

import android.content.Context;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes5.dex */
public final class rke {
    public static pke a(Context context) {
        Object t7oVar;
        context.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = (np2) vq2.R(context);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            ssg.a(6, null, "Can't unwrap activity as BaseActivity", a);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        np2 np2Var = (np2) t7oVar;
        return (np2Var == null || (np2Var instanceof StubActivity)) ? oke.a : (pke) np2Var.t.getValue();
    }
}
