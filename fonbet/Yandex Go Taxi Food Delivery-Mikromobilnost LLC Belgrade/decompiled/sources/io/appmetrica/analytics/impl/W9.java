package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class W9 {
    public final C0882ye a;
    public final C0882ye b;

    public W9(C0357g9 c0357g9, C0215bb c0215bb, C0203b c0203b) {
        C0882ye c0882ye = new C0882ye(c0357g9);
        this.a = c0882ye;
        c0882ye.a(X9.NONE, c0357g9);
        c0882ye.a(X9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c0215bb);
        c0882ye.a(X9.AES_VALUE_ENCRYPTION, c0203b);
        this.b = new C0882ye(c0357g9);
    }

    public W9() {
        this(new C0357g9(), new C0215bb(), new C0203b());
    }
}
