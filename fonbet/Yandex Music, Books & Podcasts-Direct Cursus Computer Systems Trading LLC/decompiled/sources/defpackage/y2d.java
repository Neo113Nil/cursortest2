package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class y2d extends k0 implements c0 {
    public final d0 a;
    public final int b;

    public y2d(int i, k0 k0Var) {
        this.a = k0Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y2d t(d0 d0Var) {
        n0 n0Var;
        if (d0Var == 0 || (d0Var instanceof y2d)) {
            return (y2d) d0Var;
        }
        if (!(d0Var instanceof z0)) {
            if (!(d0Var instanceof byte[])) {
                xq0.x("unknown object in getInstance: ".concat(d0Var.getClass().getName()));
                return null;
            }
            try {
                return t(s0.y((byte[]) d0Var));
            } catch (IOException unused) {
                xq0.x("unable to parse encoded general name");
                return null;
            }
        }
        z0 z0Var = (z0) d0Var;
        int i = z0Var.c;
        y yVar = v0.b;
        switch (i) {
            case 0:
            case 3:
            case 5:
                break;
            case 1:
            case 2:
            case 6:
                break;
            case 4:
                zh2 zh2Var = q6w.f;
                break;
            case 7:
                break;
            case 8:
                y yVar2 = n0.c;
                int i2 = z0Var.a;
                if (i2 != 3 && i2 != 4) {
                    if (128 != z0Var.b) {
                        xq0.q("this method only valid for CONTEXT_SPECIFIC tags");
                        break;
                    } else {
                        s0 n = z0Var.d.n();
                        if (!(n instanceof n0)) {
                            n0Var = n0.B(o0.B(n).a, true);
                            break;
                        }
                    }
                }
                n0Var = (n0) n0.c.f(z0Var, false);
                break;
            default:
                xq0.x(k5r.i(i, "unknown tag: "));
                break;
        }
        return null;
    }

    @Override // defpackage.d0
    public final s0 n() {
        int i = this.b;
        return new ki2(i == 4, i, this.a, 1);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.b;
        stringBuffer.append(i);
        stringBuffer.append(": ");
        d0 d0Var = this.a;
        if (i != 1 && i != 2) {
            if (i == 4) {
                stringBuffer.append(q6w.t(d0Var).toString());
            } else if (i != 6) {
                stringBuffer.append(d0Var.toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(fxf.B(xz6.B(d0Var).a));
        return stringBuffer.toString();
    }
}
