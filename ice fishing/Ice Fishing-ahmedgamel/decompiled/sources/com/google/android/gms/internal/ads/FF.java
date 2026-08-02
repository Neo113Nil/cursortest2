package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public abstract class FF implements InterfaceC3417jE {

    /* renamed from: a, reason: collision with root package name */
    public static final L7.b f25533a = new L7.b(4);

    public static C3742pF b(OE oe) {
        byte[] bArr = C3742pF.f33836d;
        try {
            Cipher cipher = (Cipher) f25533a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (C3742pF.b(cipher)) {
                return new C3742pF(((C3263gK) oe.f27374c.f30647u).b(), oe.f27375d.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e9) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e9);
        }
    }
}
