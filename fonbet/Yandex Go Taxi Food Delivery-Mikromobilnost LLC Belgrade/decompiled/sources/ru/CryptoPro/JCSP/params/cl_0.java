package ru.CryptoPro.JCSP.params;

import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
class cl_0 implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ int b;

    public cl_0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        String b;
        JCPPref jCPPref = new JCPPref(DefaultCSPProvider.class);
        String str = this.a;
        b = DefaultCSPProvider.b(this.b);
        return jCPPref.get(str, b);
    }
}
