package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes9.dex */
public abstract class v2 extends a3 implements x2 {
    public static final q1 b = new q1(5, v2.class);
    public static final byte[] c = new byte[0];
    public final byte[] a;

    public v2(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            ny61.t("'string' cannot be null");
            throw null;
        }
    }

    public static v2 p(Object obj) {
        if (obj == null || (obj instanceof v2)) {
            return (v2) obj;
        }
        if (obj instanceof z1) {
            a3 aSN1Primitive = ((z1) obj).toASN1Primitive();
            if (aSN1Primitive instanceof v2) {
                return (v2) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (v2) b.c((byte[]) obj);
            } catch (IOException e) {
                ny61.g(x4e.d(e, new StringBuilder("failed to construct OCTET STRING from byte[]: ")));
                return null;
            }
        }
        ny61.g(qv10.n(obj, "illegal object in getInstance: "));
        return null;
    }

    @Override // defpackage.llv
    public final a3 a() {
        return this;
    }

    @Override // defpackage.x2
    public final InputStream d() {
        return new ByteArrayInputStream(this.a);
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof v2) {
            return Arrays.equals(this.a, ((v2) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ffx.T(this.a);
    }

    @Override // defpackage.a3
    public a3 n() {
        return new cqf(this.a);
    }

    @Override // defpackage.a3
    public a3 o() {
        return new cqf(this.a);
    }

    public final String toString() {
        return ShimmerDivHandler.NUMBER_SING.concat(ruu0.a(rfu.b(this.a)));
    }
}
