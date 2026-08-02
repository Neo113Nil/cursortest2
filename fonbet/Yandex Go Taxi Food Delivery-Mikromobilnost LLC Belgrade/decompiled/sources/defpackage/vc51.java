package defpackage;

import java.io.IOException;
import java.security.Principal;

/* loaded from: classes4.dex */
public final class vc51 extends rc51 implements Principal {
    public vc51(byte[] bArr) {
        try {
            super(i3.z(new j2(bArr).n()));
        } catch (IllegalArgumentException e) {
            w511.h(e, "not an ASN.1 Sequence: ");
            throw null;
        }
    }

    @Override // defpackage.o2
    public final byte[] getEncoded() {
        try {
            return getEncoded("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public vc51(rc51 rc51Var) {
        super((i3) rc51Var.toASN1Primitive());
    }
}
