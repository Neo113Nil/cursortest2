package defpackage;

import java.security.PrivilegedAction;

/* loaded from: classes5.dex */
public final class wtw implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ xtw b;

    public wtw(xtw xtwVar, String str) {
        this.b = xtwVar;
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        ClassLoader classLoader = this.b.c;
        String str = this.a;
        return classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
    }
}
