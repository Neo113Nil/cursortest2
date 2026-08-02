package defpackage;

/* loaded from: classes3.dex */
public final class zk4 extends jcc {
    public int f;
    public int g;
    public int h;
    public om3 i;

    @Override // defpackage.jcc, defpackage.u97
    public final void Q(aa7 aa7Var, om3 om3Var) {
        om3 om3Var2 = this.i;
        while (om3Var.c > 0) {
            try {
                int D = ouj.D(this.h);
                if (D == 0) {
                    char h = om3Var.h();
                    if (h == '\r') {
                        this.h = 2;
                    } else {
                        int i = this.f * 16;
                        this.f = i;
                        if (h >= 'a' && h <= 'f') {
                            this.f = (h - 'W') + i;
                        } else if (h >= '0' && h <= '9') {
                            this.f = (h - '0') + i;
                        } else {
                            if (h < 'A' || h > 'F') {
                                super.b(new my1("invalid chunk length: " + h));
                                return;
                            }
                            this.f = (h - '7') + i;
                        }
                    }
                    this.g = this.f;
                } else if (D != 1) {
                    if (D == 3) {
                        int min = Math.min(this.g, om3Var.c);
                        int i2 = this.g - min;
                        this.g = i2;
                        if (i2 == 0) {
                            this.h = 5;
                        }
                        if (min != 0) {
                            om3Var.g(om3Var2, min);
                            v7g.s(this, om3Var2);
                        }
                    } else if (D != 4) {
                        if (D != 5) {
                            if (D == 6) {
                                return;
                            }
                        } else {
                            if (!i(om3Var.h(), '\n')) {
                                return;
                            }
                            if (this.f > 0) {
                                this.h = 1;
                            } else {
                                this.h = 7;
                                b(null);
                            }
                            this.f = 0;
                        }
                    } else if (!i(om3Var.h(), '\r')) {
                        return;
                    } else {
                        this.h = 6;
                    }
                } else if (!i(om3Var.h(), '\n')) {
                    return;
                } else {
                    this.h = 4;
                }
            } catch (Exception e) {
                super.b(e);
                return;
            }
        }
    }

    @Override // defpackage.jcc
    public final void b(Exception exc) {
        if (exc == null && this.h != 7) {
            exc = new my1("chunked input ended before final chunk");
        }
        super.b(exc);
    }

    public final boolean i(char c, char c2) {
        if (c == c2) {
            return true;
        }
        super.b(new my1(c2 + " was expected, got " + c));
        return false;
    }
}
