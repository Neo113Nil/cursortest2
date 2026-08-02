package defpackage;

import java.io.IOException;
import java.io.InputStream;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class qvf implements t1 {
    public final bph a;
    public int b = 0;

    public qvf(bph bphVar) {
        this.a = bphVar;
    }

    @Override // defpackage.llv
    public final a3 a() {
        return r1.p(this.a.c());
    }

    @Override // defpackage.t1
    public final InputStream b() {
        bph bphVar = this.a;
        int i = bphVar.w;
        if (i < 1) {
            ny61.r("content octets cannot be empty");
            return null;
        }
        int read = bphVar.read();
        this.b = read;
        if (read > 0) {
            if (i < 2) {
                ny61.r("zero length data with non-zero pad bits");
                return null;
            }
            if (read > 7) {
                ny61.r("pad bits cannot be greater than 7 or less than 0");
                return null;
            }
        }
        return bphVar;
    }

    @Override // defpackage.t1
    public final int e() {
        return this.b;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        try {
            return a();
        } catch (IOException e) {
            throw new ASN1ParsingException(x4e.d(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
