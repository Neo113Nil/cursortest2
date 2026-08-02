package ru.CryptoPro.JCP.tools;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class a implements PrivilegedAction {
    public final /* synthetic */ AbstractLicense a;

    public a(AbstractLicense abstractLicense) {
        this.a = abstractLicense;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        AbstractLicense abstractLicense = this.a;
        return abstractLicense.node.getByteArraySilent(abstractLicense.getPrefName(), null);
    }
}
