package defpackage;

import java.io.IOException;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes11.dex */
public class vd4 implements z1, llv {
    public final int a;
    public final int b;
    public final o3 c;

    public vd4(int i, int i2, o3 o3Var) {
        this.a = i;
        this.b = i2;
        this.c = o3Var;
    }

    public a3 a() {
        return this.c.x(this.a, this.b);
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        try {
            return a();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
