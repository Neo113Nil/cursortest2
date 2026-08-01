package O;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import g1.C4523c;
import java.util.Objects;

/* loaded from: classes.dex */
public final class U implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0346v f2049a;

    public U(InterfaceC0346v interfaceC0346v) {
        this.f2049a = interfaceC0346v;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0331f c0331f = new C0331f(new C4523c(contentInfo));
        C0331f a9 = ((U.r) this.f2049a).a(view, c0331f);
        if (a9 == null) {
            return null;
        }
        if (a9 == c0331f) {
            return contentInfo;
        }
        ContentInfo v9 = a9.f2074a.v();
        Objects.requireNonNull(v9);
        return B3.e.q(v9);
    }
}
