package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class nz7 implements lz7 {
    public sfm a;

    @Override // defpackage.lz7
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        sfm sfmVar = this.a;
        return h4a.p(((hsm) sfmVar.b).a(), ((lz7) ((hsm) sfmVar.b).a).a(bArr, bArr2));
    }

    @Override // defpackage.lz7
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        sfm sfmVar = this.a;
        if (bArr.length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = sfmVar.v(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((lz7) ((hsm) it.next()).a).b(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    oz7.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                }
            }
        }
        Iterator it2 = sfmVar.v(c3x.f).iterator();
        while (it2.hasNext()) {
            try {
                return ((lz7) ((hsm) it2.next()).a).b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        b6e.m("decryption failed");
        return null;
    }
}
