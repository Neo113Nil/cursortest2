package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class w3 {
    public final /* synthetic */ int a;
    public final Class b;

    public /* synthetic */ w3(int i, Class cls) {
        this.a = i;
        this.b = cls;
    }

    public void a(a3 a3Var) {
        if (this.b.isInstance(a3Var)) {
            return;
        }
        ny61.r("unexpected object: ".concat(a3Var.getClass().getName()));
    }

    public abstract vt10 b(vt10 vt10Var);

    public a3 c(byte[] bArr) {
        a3 m = a3.m(bArr);
        a(m);
        return m;
    }

    public a3 d(h3 h3Var) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public a3 e(cqf cqfVar) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    public a3 f(r3 r3Var, boolean z) {
        a3 d;
        if (128 != r3Var.b) {
            ny61.r("this method only valid for CONTEXT_SPECIFIC tags");
            return null;
        }
        int i = r3Var.a;
        z1 z1Var = r3Var.w;
        if (z) {
            if (!r3Var.q()) {
                ny61.r("object explicit - implicit expected.");
                return null;
            }
            d = z1Var.toASN1Primitive();
            a(d);
        } else {
            if (1 == i) {
                ny61.r("object explicit - implicit expected.");
                return null;
            }
            a3 aSN1Primitive = z1Var.toASN1Primitive();
            if (i == 3) {
                d = d(r3Var.r(aSN1Primitive));
            } else if (i != 4) {
                a(aSN1Primitive);
                d = aSN1Primitive;
            } else {
                d = aSN1Primitive instanceof h3 ? d((h3) aSN1Primitive) : e((cqf) aSN1Primitive);
            }
        }
        a(d);
        return d;
    }

    public Map g() {
        return Collections.EMPTY_MAP;
    }

    public abstract vt10 h(ByteString byteString);

    public abstract void i(vt10 vt10Var);
}
