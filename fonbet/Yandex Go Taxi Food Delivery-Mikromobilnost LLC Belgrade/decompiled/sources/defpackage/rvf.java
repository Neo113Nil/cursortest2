package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class rvf implements u1 {
    public final cph a;
    public int b = 0;

    public rvf(cph cphVar) {
        this.a = cphVar;
    }

    @Override // defpackage.mlv
    public final b3 a() {
        return s1.u(this.a.c());
    }

    @Override // defpackage.u1
    public final InputStream b() {
        String str;
        cph cphVar = this.a;
        int i = cphVar.w;
        if (i >= 1) {
            int read = cphVar.read();
            this.b = read;
            if (read > 0) {
                if (i < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (read > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                }
            }
            return cphVar;
        }
        str = "content octets cannot be empty";
        ny61.r(str);
        return null;
    }

    @Override // defpackage.u1
    public final int e() {
        return this.b;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        try {
            return a();
        } catch (IOException e) {
            throw new ASN1ParsingException(x4e.d(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
