package ru.CryptoPro.JCSP.params;

import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.pref.JCPPref;

/* loaded from: classes4.dex */
class cl_3 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public Object run() {
        return Boolean.valueOf(new JCPPref(DefaultCSPProvider.class).getBoolean("add_provider_name_class_default", false));
    }
}
