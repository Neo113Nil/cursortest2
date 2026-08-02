package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public final class sd4 implements n3 {
    public o3 a;

    @Override // defpackage.mlv
    public final b3 a() {
        return new rd4(this.a.I(), false);
    }

    @Override // defpackage.n3
    public final a2 readObject() {
        return this.a.G();
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        try {
            return new rd4(this.a.I(), false);
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
