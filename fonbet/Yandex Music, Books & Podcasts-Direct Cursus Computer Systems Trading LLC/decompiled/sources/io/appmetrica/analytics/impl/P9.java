package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class P9 {
    public final C0374je a;
    public final C0374je b;

    public P9(C0110a9 c0110a9, Ta ta, C0129b c0129b) {
        C0374je c0374je = new C0374je(c0110a9);
        this.a = c0374je;
        c0374je.a(Q9.NONE, c0110a9);
        c0374je.a(Q9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, ta);
        c0374je.a(Q9.AES_VALUE_ENCRYPTION, c0129b);
        this.b = new C0374je(c0110a9);
    }

    public P9() {
        this(new C0110a9(), new Ta(), new C0129b());
    }
}
