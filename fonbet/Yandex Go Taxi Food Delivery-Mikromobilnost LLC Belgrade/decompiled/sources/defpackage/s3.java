package defpackage;

import java.io.IOException;
import java.util.Arrays;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes4.dex */
public abstract class s3 extends b3 implements t3 {
    public final int a;
    public final int b;
    public final int c;
    public final a2 w;

    public s3(int i, int i2, int i3, a2 a2Var) {
        if (a2Var == null) {
            ny61.t("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            ny61.g(oyr.i(i2, "invalid tag class: "));
            throw null;
        }
        this.a = a2Var instanceof y1 ? 1 : i;
        this.b = i2;
        this.c = i3;
        this.w = a2Var;
    }

    public static s3 A(Object obj) {
        String d;
        if (obj == null || (obj instanceof s3)) {
            return (s3) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof s3) {
                return (s3) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                b3 r = b3.r((byte[]) obj);
                if (r instanceof s3) {
                    return (s3) r;
                }
                throw new IllegalStateException("unexpected object: ".concat(r.getClass().getName()));
            } catch (IOException e) {
                d = x4e.d(e, new StringBuilder("failed to construct tagged object from byte[]: "));
            }
        }
        d = qv10.n(obj, "unknown object in getInstance: ");
        ny61.g(d);
        return null;
    }

    public static s3 B(Object obj) {
        if (obj == null) {
            ny61.t("'obj' cannot be null");
            return null;
        }
        s3 A = A(obj);
        int i = A.b;
        if (128 == i) {
            return A;
        }
        ny61.g("unexpected tag in getInstance: ".concat(z3.b(i, A.c)));
        return null;
    }

    public static s3 z(s3 s3Var) {
        if (128 != s3Var.b) {
            ny61.r("this method only valid for CONTEXT_SPECIFIC tags");
            return null;
        }
        if (!s3Var.C()) {
            ny61.r("object implicit - explicit expected.");
            return null;
        }
        b3 aSN1Primitive = s3Var.w.toASN1Primitive();
        if (aSN1Primitive instanceof s3) {
            return (s3) aSN1Primitive;
        }
        ny61.r("unexpected object: ".concat(aSN1Primitive.getClass().getName()));
        return null;
    }

    public final boolean C() {
        int i = this.a;
        return i == 1 || i == 3;
    }

    public abstract i3 E(b3 b3Var);

    @Override // defpackage.mlv
    public final b3 a() {
        return this;
    }

    @Override // defpackage.t3
    public final a2 g() {
        return y();
    }

    @Override // defpackage.t3
    public final int h() {
        return this.c;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return this.w.toASN1Primitive().hashCode() ^ (((this.b * 7919) ^ this.c) ^ (C() ? 15 : PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC));
    }

    @Override // defpackage.t3
    public final int i() {
        return this.b;
    }

    @Override // defpackage.t3
    public final a2 j(int i) {
        p1 p1Var;
        a2 a2Var;
        switch (i) {
            case 1:
                p1Var = w1.b;
                break;
            case 2:
                p1Var = l2.c;
                break;
            case 3:
                p1Var = s1.b;
                break;
            case 4:
                p1Var = w2.b;
                break;
            case 5:
                p1Var = m2.a;
                break;
            case 6:
                p1Var = u2.c;
                break;
            case 7:
                p1Var = q2.b;
                break;
            case 8:
                p1Var = opf.z;
                break;
            case 9:
            case 11:
            case 14:
            case 15:
            case 29:
            default:
                p1Var = null;
                break;
            case 10:
                p1Var = e2.c;
                break;
            case 12:
                p1Var = rqf.b;
                break;
            case 13:
                p1Var = d3.c;
                break;
            case 16:
                p1Var = i3.b;
                break;
            case 17:
                p1Var = m3.c;
                break;
            case 18:
                p1Var = bqf.b;
                break;
            case 19:
                p1Var = hqf.b;
                break;
            case 20:
                p1Var = nqf.b;
                break;
            case 21:
                p1Var = vqf.b;
                break;
            case 22:
                p1Var = xpf.b;
                break;
            case 23:
                p1Var = v3.b;
                break;
            case 24:
                p1Var = g2.b;
                break;
            case 25:
                p1Var = vpf.b;
                break;
            case 26:
                p1Var = xqf.b;
                break;
            case 27:
                p1Var = rpf.b;
                break;
            case 28:
                p1Var = tqf.b;
                break;
            case 30:
                p1Var = kpf.b;
                break;
        }
        if (p1Var == null) {
            ny61.g(oyr.i(i, "unsupported UNIVERSAL tag number: "));
            return null;
        }
        b3 x = x(false, p1Var);
        if (i == 3) {
            a2Var = (s1) x;
        } else {
            if (i != 4) {
                if (i == 16) {
                    i3 i3Var = (i3) x;
                    return new g3(i3Var, i3Var.size());
                }
                if (i != 17) {
                    return x;
                }
                m3 m3Var = (m3) x;
                return new k3(m3Var, m3Var.a.length);
            }
            a2Var = (w2) x;
        }
        a2Var.getClass();
        return a2Var;
    }

    @Override // defpackage.t3
    public final boolean k(int i) {
        return this.b == 128 && this.c == i;
    }

    @Override // defpackage.t3
    public final boolean l(int i) {
        return this.b == 128 && this.c == i;
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (!(b3Var instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) b3Var;
        if (this.c != s3Var.c || this.b != s3Var.b) {
            return false;
        }
        if (this.a != s3Var.a && C() != s3Var.C()) {
            return false;
        }
        b3 aSN1Primitive = this.w.toASN1Primitive();
        b3 aSN1Primitive2 = s3Var.w.toASN1Primitive();
        if (aSN1Primitive == aSN1Primitive2) {
            return true;
        }
        if (C()) {
            return aSN1Primitive.m(aSN1Primitive2);
        }
        try {
            return Arrays.equals(getEncoded(), s3Var.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.b3
    public b3 s() {
        return new oqf(this.a, this.b, this.c, this.w, 0);
    }

    @Override // defpackage.b3
    public b3 t() {
        return new oqf(this.a, this.b, this.c, this.w, 1);
    }

    public final String toString() {
        return z3.b(this.b, this.c) + this.w;
    }

    public final o2 u() {
        a2 a2Var = this.w;
        return a2Var instanceof o2 ? (o2) a2Var : a2Var.toASN1Primitive();
    }

    public final b3 x(boolean z, x3 x3Var) {
        a2 a2Var = this.w;
        if (z) {
            if (!C()) {
                ny61.r("object explicit - implicit expected.");
                return null;
            }
            b3 aSN1Primitive = a2Var.toASN1Primitive();
            x3Var.Cg(aSN1Primitive);
            return aSN1Primitive;
        }
        int i = this.a;
        if (1 == i) {
            ny61.r("object explicit - implicit expected.");
            return null;
        }
        b3 aSN1Primitive2 = a2Var.toASN1Primitive();
        if (i == 3) {
            return x3Var.Fg(E(aSN1Primitive2));
        }
        if (i == 4) {
            return aSN1Primitive2 instanceof i3 ? x3Var.Fg((i3) aSN1Primitive2) : x3Var.Gg((dqf) aSN1Primitive2);
        }
        x3Var.Cg(aSN1Primitive2);
        return aSN1Primitive2;
    }

    public final o2 y() {
        if (C()) {
            a2 a2Var = this.w;
            return a2Var instanceof o2 ? (o2) a2Var : a2Var.toASN1Primitive();
        }
        ny61.r("object implicit - explicit expected.");
        return null;
    }

    public s3(boolean z, int i, a2 a2Var) {
        this(z ? 1 : 2, 128, i, a2Var);
    }
}
