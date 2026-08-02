package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public class wd4 implements t3 {
    public final int a;
    public final int b;
    public final o3 c;

    public wd4(int i, int i2, o3 o3Var) {
        this.a = i;
        this.b = i2;
        this.c = o3Var;
    }

    public b3 a() {
        return this.c.y(this.a, this.b);
    }

    @Override // defpackage.t3
    public a2 g() {
        return this.c.G();
    }

    @Override // defpackage.t3
    public final int h() {
        return this.b;
    }

    @Override // defpackage.t3
    public final int i() {
        return this.a;
    }

    @Override // defpackage.t3
    public a2 j(int i) {
        return this.c.D(i);
    }

    @Override // defpackage.t3
    public final boolean k(int i) {
        return this.a == 128 && this.b == i;
    }

    @Override // defpackage.t3
    public final boolean l(int i) {
        return this.a == 128 && this.b == i;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        try {
            return a();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
