package defpackage;

import android.content.Intent;
import java.net.SocketAddress;

/* loaded from: classes5.dex */
public final class ee0 extends SocketAddress {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = 0;
    public final Intent a;

    public ee0(Intent intent) {
        o2g.J("'bindIntent' must be explicit. Specify either a package or ComponentName.", (intent.getComponent() == null && intent.getPackage() == null) ? false : true);
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ee0) {
            return this.a.filterEquals(((ee0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return "AndroidComponentAddress[" + this.a + "]";
    }
}
