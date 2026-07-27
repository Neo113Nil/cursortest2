package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public abstract class FF implements InterfaceC3394jE {

    /* renamed from: a, reason: collision with root package name */
    public static final L7.b f24777a = new L7.b(4);

    public static C3719pF b(OE oe) {
        byte[] bArr = C3719pF.f33046d;
        try {
            Cipher cipher = (Cipher) f24777a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (C3719pF.b(cipher)) {
                return new C3719pF(((C3240gK) oe.f26592c.f29859u).b(), oe.f26593d.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e9) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e9);
        }
    }
}
