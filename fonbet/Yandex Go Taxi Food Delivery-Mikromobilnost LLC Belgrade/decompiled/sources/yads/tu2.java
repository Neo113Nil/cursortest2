package yads;

import defpackage.j971;
import defpackage.ny61;
import defpackage.sls;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class tu2 extends Lambda implements sls {
    public static final tu2 w = new tu2();

    public tu2() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        X509TrustManager a = j971.a(null);
        if (a != null) {
            return a;
        }
        ny61.g("Failed to create default TrustManager");
        return null;
    }
}
