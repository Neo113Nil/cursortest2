package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes5.dex */
public final class txm implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ txm(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                return Security.getProperty(this.b);
            default:
                return System.getProperty(this.b);
        }
    }
}
