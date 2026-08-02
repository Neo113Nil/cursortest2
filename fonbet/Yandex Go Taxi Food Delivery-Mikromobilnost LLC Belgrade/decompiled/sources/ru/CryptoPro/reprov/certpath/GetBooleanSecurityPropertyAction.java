package ru.CryptoPro.reprov.certpath;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes4.dex */
class GetBooleanSecurityPropertyAction implements PrivilegedAction {
    public String a;

    @Override // java.security.PrivilegedAction
    public Boolean run() {
        boolean z = false;
        try {
            String property = Security.getProperty(this.a);
            if (property != null) {
                if (property.equalsIgnoreCase("true")) {
                    z = true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return Boolean.valueOf(z);
    }
}
