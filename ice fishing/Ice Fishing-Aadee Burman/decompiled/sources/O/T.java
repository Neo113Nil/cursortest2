package O;

import android.view.ContentInfo;
import android.view.View;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class T {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0331f b(View view, C0331f c0331f) {
        ContentInfo v9 = c0331f.f2074a.v();
        Objects.requireNonNull(v9);
        ContentInfo q8 = B3.e.q(v9);
        ContentInfo performReceiveContent = view.performReceiveContent(q8);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == q8 ? c0331f : new C0331f(new C4523c(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0346v interfaceC0346v) {
        if (interfaceC0346v == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new U(interfaceC0346v));
        }
    }
}
