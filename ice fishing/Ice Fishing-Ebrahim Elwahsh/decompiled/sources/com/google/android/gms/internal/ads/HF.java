package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public abstract class HF implements InterfaceC3569mE {

    /* renamed from: a, reason: collision with root package name */
    public static final H7.b f25339a = new H7.b(4);

    public static C3893sF b(RE re) {
        byte[] bArr = C3893sF.f34216d;
        try {
            Cipher cipher = (Cipher) f25339a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (C3893sF.b(cipher)) {
                return new C3893sF(((C3791qK) re.f27323c.f26395u).b(), re.f27324d.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e6) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e6);
        }
    }
}
