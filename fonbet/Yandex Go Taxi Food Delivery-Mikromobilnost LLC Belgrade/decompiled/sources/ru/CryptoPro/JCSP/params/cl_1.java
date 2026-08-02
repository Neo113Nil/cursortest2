package ru.CryptoPro.JCSP.params;

import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
class cl_1 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        return Integer.valueOf(new JCPPref(DefaultCSPProvider.class).getInt("KeySet_class_default", 0));
    }
}
