package O;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class I {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0030f b(View view, C0030f c0030f) {
        ContentInfo v2 = c0030f.f802a.v();
        Objects.requireNonNull(v2);
        ContentInfo performReceiveContent = view.performReceiveContent(v2);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == v2 ? c0030f : new C0030f(new B.b(performReceiveContent));
    }
}
