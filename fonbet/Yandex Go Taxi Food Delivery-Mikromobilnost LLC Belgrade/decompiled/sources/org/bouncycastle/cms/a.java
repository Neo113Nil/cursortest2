package org.bouncycastle.cms;

import defpackage.a2;
import defpackage.c06;
import defpackage.u2;
import defpackage.x4e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class a extends c06 {
    public final a2 c;

    public a(u2 u2Var, a2 a2Var) {
        super(u2Var);
        this.c = a2Var;
    }

    @Override // defpackage.c06
    public final InputStream n() {
        int i;
        try {
            byte[] encoded = this.c.toASN1Primitive().getEncoded("DER");
            int i2 = 1;
            if ((encoded[0] & 31) == 31) {
                do {
                    i = encoded[i2] & DerValue.TAG_CONTEXT;
                    i2++;
                } while (i != 0);
            }
            int i3 = i2 + 1;
            byte b = encoded[i2];
            if ((b & DerValue.TAG_CONTEXT) != 0) {
                i3 += b & Byte.MAX_VALUE;
            }
            return new ByteArrayInputStream(encoded, i3, encoded.length - i3);
        } catch (IOException e) {
            CMSRuntimeException cMSRuntimeException = new CMSRuntimeException(x4e.d(e, new StringBuilder("unable to convert content to stream: ")));
            cMSRuntimeException.e = e;
            throw cMSRuntimeException;
        }
    }
}
