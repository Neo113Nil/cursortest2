package ru.CryptoPro.JCSP.params;

import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
class cl_2 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        return Integer.valueOf(new JCPPref(DefaultCSPProvider.class).getInt("NameType_class_default", 0));
    }
}
