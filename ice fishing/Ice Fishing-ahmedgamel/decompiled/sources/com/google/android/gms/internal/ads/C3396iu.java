package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3396iu {
    public static final String a(byte[] bArr, byte[] bArr2, String str, C3069co c3069co) {
        S0.l lVar;
        if (str != null) {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                    try {
                        PK pk = PK.f27540a;
                        int i = BK.f24648a;
                        C3529lI F8 = C3529lI.F(byteArrayInputStream, PK.f27541b);
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
                w2.z.k("Failed to get keysethandle".concat(e9.toString()));
                C4906k.f40186C.f40196h.d("CryptoUtils.getHandle", e9);
                lVar = null;
            }
            if (lVar != null) {
                try {
                    AbstractC3364iD.c();
                    byte[] a9 = ((InterfaceC3417jE) lVar.Q(AbstractC2659Kg.J, InterfaceC3417jE.class)).a(bArr, bArr2);
                    c3069co.f30367a.put("ds", "1");
                    return new String(a9, StandardCharsets.UTF_8);
                } catch (UnsupportedOperationException | GeneralSecurityException e10) {
                    w2.z.k("Failed to decrypt ".concat(e10.toString()));
                    C4906k.f40186C.f40196h.d("CryptoUtils.decrypt", e10);
                    c3069co.f30367a.put("dsf", e10.toString());
                }
            }
        }
        return null;
    }
}
