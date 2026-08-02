package defpackage;

import kotlin.Pair;

/* loaded from: classes3.dex */
public final class ztg extends hjq {
    public static final ztg b = new ztg(1);

    public final void g(Throwable th, boolean z) {
        ot0.A(e(), "login_failure", uah.e(new Pair("autologin", Boolean.valueOf(z)), new Pair("throwable", th)));
    }
}
