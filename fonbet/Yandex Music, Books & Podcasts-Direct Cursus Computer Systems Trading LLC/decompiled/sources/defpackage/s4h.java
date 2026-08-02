package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s4h implements q4h {
    public final sfm a;
    public final byte[] b = {0};

    public s4h(sfm sfmVar) {
        this.a = sfmVar;
    }

    @Override // defpackage.q4h
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            b6e.m("tag too short");
            return;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        sfm sfmVar = this.a;
        for (hsm hsmVar : sfmVar.v(copyOf)) {
            try {
                boolean equals = hsmVar.d.equals(oyj.LEGACY);
                Object obj = hsmVar.a;
                if (equals) {
                    ((q4h) obj).a(copyOfRange, h4a.p(bArr2, this.b));
                } else {
                    ((q4h) obj).a(copyOfRange, bArr2);
                }
                return;
            } catch (GeneralSecurityException e) {
                t4h.a.info("tag prefix matches a key, but cannot verify: " + e);
            }
        }
        Iterator it = sfmVar.v(c3x.f).iterator();
        while (it.hasNext()) {
            try {
                ((q4h) ((hsm) it.next()).a).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        b6e.m("invalid MAC");
    }

    @Override // defpackage.q4h
    public final byte[] b(byte[] bArr) {
        sfm sfmVar = this.a;
        boolean equals = ((hsm) sfmVar.b).d.equals(oyj.LEGACY);
        hsm hsmVar = (hsm) sfmVar.b;
        return equals ? h4a.p(hsmVar.a(), ((q4h) ((hsm) sfmVar.b).a).b(h4a.p(bArr, this.b))) : h4a.p(hsmVar.a(), ((q4h) ((hsm) sfmVar.b).a).b(bArr));
    }
}
