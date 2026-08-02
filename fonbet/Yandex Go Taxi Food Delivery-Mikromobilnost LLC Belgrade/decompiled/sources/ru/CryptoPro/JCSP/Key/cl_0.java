package ru.CryptoPro.JCSP.Key;

import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCSP.JCSPLicense;

/* loaded from: classes4.dex */
class cl_0 implements PrivilegedExceptionAction {
    final /* synthetic */ AbstractKeySpec a;

    public cl_0(AbstractKeySpec abstractKeySpec) {
        this.a = abstractKeySpec;
    }

    @Override // java.security.PrivilegedExceptionAction
    public Object run() throws Exception {
        new JCSPLicense().check();
        return null;
    }
}
