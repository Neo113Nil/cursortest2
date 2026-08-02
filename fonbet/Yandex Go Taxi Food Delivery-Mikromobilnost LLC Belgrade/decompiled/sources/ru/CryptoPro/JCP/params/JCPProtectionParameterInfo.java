package ru.CryptoPro.JCP.params;

import java.security.KeyStore;

/* loaded from: classes4.dex */
public class JCPProtectionParameterInfo implements KeyStore.ProtectionParameter {
    public boolean a = true;

    public boolean isNeedPassword() {
        return this.a;
    }

    public void needPassword(boolean z) {
        this.a = z;
    }
}
