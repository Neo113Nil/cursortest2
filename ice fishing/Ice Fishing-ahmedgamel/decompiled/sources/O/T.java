package O;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class T {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0336f b(View view, C0336f c0336f) {
        ContentInfo x9 = c0336f.f2162a.x();
        Objects.requireNonNull(x9);
        ContentInfo q8 = D3.e.q(x9);
        ContentInfo performReceiveContent = view.performReceiveContent(q8);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == q8 ? c0336f : new C0336f(new n4.c(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0351v interfaceC0351v) {
        if (interfaceC0351v == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new U(interfaceC0351v));
        }
    }
}
