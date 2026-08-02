package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class udu {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static jc6 b(View view, jc6 jc6Var) {
        ContentInfo f = jc6Var.a.f();
        Objects.requireNonNull(f);
        ContentInfo performReceiveContent = view.performReceiveContent(f);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == f ? jc6Var : new jc6(new fc6(performReceiveContent));
    }
}
