package defpackage;

import android.webkit.JavascriptInterface;
import java.util.function.Supplier;
import ru.yandex.taxi.plus.sdk.payments.web.n;
import ru.yandex.taxi.plus.sdk.payments.web.o;

/* loaded from: classes6.dex */
public final class zka0 {
    public final Supplier a;
    public final wnt b;
    public joa0 c;

    public zka0(Supplier supplier, wnt wntVar) {
        this.a = supplier;
        this.b = wntVar;
    }

    @JavascriptInterface
    public final String getToken() {
        return (String) this.a.get();
    }

    @JavascriptInterface
    public final void onEvent(String str) {
        joa0 joa0Var = this.c;
        if (joa0Var != null) {
            try {
                joa0Var.a((o) ((xnt) this.b).c(str, o.Companion.serializer()));
            } catch (Exception unused) {
                joa0Var.a(n.a);
            }
        }
    }
}
