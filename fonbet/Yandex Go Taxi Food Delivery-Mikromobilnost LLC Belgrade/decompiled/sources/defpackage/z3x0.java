package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.webkit.CookieManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes8.dex */
public final class z3x0 extends id5 {
    public final k5h a;
    public final i3y b;

    public z3x0(int i) {
        this.a = new k5h();
        this.b = a.b(LazyThreadSafetyMode.SYNCHRONIZED, new xlw0(12));
    }

    @Override // defpackage.id5
    public final String a(Uri uri) {
        return ((CookieManager) this.b.getValue()).getCookie(uri.toString());
    }

    @Override // defpackage.id5
    public final void b(Uri uri, String str, tls tlsVar) {
        r8c0 r8c0Var = new r8c0(this, uri, str, tlsVar, 16);
        if (Looper.myLooper() != null) {
            r8c0Var.invoke();
            return;
        }
        k5h k5hVar = this.a;
        k5hVar.getClass();
        if (Looper.getMainLooper().isCurrentThread()) {
            r8c0Var.invoke();
        } else {
            k5hVar.a.post(new oxe(15, r8c0Var));
        }
    }

    public z3x0() {
        this(0);
    }
}
