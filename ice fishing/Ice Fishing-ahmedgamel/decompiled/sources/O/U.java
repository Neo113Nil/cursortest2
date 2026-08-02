package O;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class U implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0351v f2137a;

    public U(InterfaceC0351v interfaceC0351v) {
        this.f2137a = interfaceC0351v;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0336f c0336f = new C0336f(new n4.c(contentInfo));
        C0336f a9 = ((U.r) this.f2137a).a(view, c0336f);
        if (a9 == null) {
            return null;
        }
        if (a9 == c0336f) {
            return contentInfo;
        }
        ContentInfo x9 = a9.f2162a.x();
        Objects.requireNonNull(x9);
        return D3.e.q(x9);
    }
}
