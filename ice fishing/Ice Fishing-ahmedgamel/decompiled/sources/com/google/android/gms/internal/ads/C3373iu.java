package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3373iu {
    public static final String a(byte[] bArr, byte[] bArr2, String str, C2993bo c2993bo) {
        S0.l lVar;
        if (str != null) {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                    try {
                        PK pk = PK.f26757a;
                        int i = BK.f23877a;
                        C3506lI F8 = C3506lI.F(byteArrayInputStream, PK.f26758b);
                        byteArrayInputStream.close();
                        lVar = S0.l.I(F8);
                    } catch (Throwable th) {
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e9) {
                u2.z.k("Failed to get keysethandle".concat(e9.toString()));
                C4835j.f39733C.f39743h.d("CryptoUtils.getHandle", e9);
                lVar = null;
            }
            if (lVar != null) {
                try {
                    AbstractC3341iD.c();
                    byte[] a9 = ((InterfaceC3394jE) lVar.Q(AbstractC2639Kg.J, InterfaceC3394jE.class)).a(bArr, bArr2);
                    c2993bo.f29325a.put("ds", "1");
                    return new String(a9, StandardCharsets.UTF_8);
                } catch (UnsupportedOperationException | GeneralSecurityException e10) {
                    u2.z.k("Failed to decrypt ".concat(e10.toString()));
                    C4835j.f39733C.f39743h.d("CryptoUtils.decrypt", e10);
                    c2993bo.f29325a.put("dsf", e10.toString());
                }
            }
        }
        return null;
    }
}
