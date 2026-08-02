package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class w2 extends b3 implements y2 {
    public static final p1 b = new p1(14, w2.class);
    public static final byte[] c = new byte[0];
    public final byte[] a;

    public w2(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            ny61.t("'string' cannot be null");
            throw null;
        }
    }

    public static w2 u(s3 s3Var, boolean z) {
        return (w2) b.Hg(s3Var, z);
    }

    public static w2 x(Object obj) {
        String d;
        if (obj == null || (obj instanceof w2)) {
            return (w2) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof w2) {
                return (w2) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (w2) b.Eg((byte[]) obj);
            } catch (IOException e) {
                d = x4e.d(e, new StringBuilder("failed to construct OCTET STRING from byte[]: "));
            }
        }
        d = qv10.n(obj, "illegal object in getInstance: ");
        ny61.g(d);
        return null;
    }

    @Override // defpackage.mlv
    public final b3 a() {
        return this;
    }

    @Override // defpackage.y2
    public final InputStream d() {
        return new ByteArrayInputStream(this.a);
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return rza1.e(this.a);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var instanceof w2) {
            return Arrays.equals(this.a, ((w2) b3Var).a);
        }
        return false;
    }

    @Override // defpackage.b3
    public b3 s() {
        return new dqf(this.a);
    }

    @Override // defpackage.b3
    public b3 t() {
        return new dqf(this.a);
    }

    public final String toString() {
        agu aguVar = qfu.a;
        byte[] bArr = this.a;
        return ShimmerDivHandler.NUMBER_SING.concat(quu0.a(qfu.c(bArr.length, bArr)));
    }
}
