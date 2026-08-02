package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class ii2 implements d0, xge {
    public final /* synthetic */ int a;
    public x0 b;

    public ii2(x0 x0Var) {
        this.a = 2;
        this.b = x0Var;
    }

    public static tz6 b(x0 x0Var) {
        try {
            return new tz6(d67.a(x0Var.X()));
        } catch (IllegalArgumentException e) {
            throw new g0(e.getMessage(), e);
        }
    }

    @Override // defpackage.xge
    public final s0 m() {
        switch (this.a) {
            case 0:
                return new hi2(this.b.X());
            case 1:
                return new ji2(this.b.X());
            case 2:
                return b(this.b);
            case 3:
                return d67.a(this.b.X());
            default:
                return d67.b(this.b.X());
        }
    }

    @Override // defpackage.d0
    public final s0 n() {
        switch (this.a) {
            case 0:
                try {
                    return new hi2(this.b.X());
                } catch (IOException e) {
                    xq0.q(e.getMessage());
                    return null;
                }
            case 1:
                try {
                    return new ji2(this.b.X());
                } catch (IOException e2) {
                    throw new q0(e2.getMessage(), e2);
                }
            case 2:
                try {
                    return b(this.b);
                } catch (IOException e3) {
                    throw new q0("unable to get DER object", e3);
                } catch (IllegalArgumentException e4) {
                    throw new q0("unable to get DER object", e4);
                }
            case 3:
                try {
                    return m();
                } catch (IOException e5) {
                    xq0.q(e5.getMessage());
                    return null;
                }
            default:
                try {
                    return m();
                } catch (IOException e6) {
                    throw new q0(e6.getMessage(), e6);
                }
        }
    }

    public /* synthetic */ ii2(int i) {
        this.a = i;
    }
}
