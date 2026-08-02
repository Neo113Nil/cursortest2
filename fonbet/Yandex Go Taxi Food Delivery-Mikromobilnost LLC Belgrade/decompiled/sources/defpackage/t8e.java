package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class t8e extends InputStream {
    public final /* synthetic */ int a;
    public boolean b = true;
    public int c = 0;
    public InputStream w;
    public final Object x;
    public Object y;

    public /* synthetic */ t8e(int i, Object obj) {
        this.a = i;
        this.x = obj;
    }

    public t1 a() {
        o3 o3Var = (o3) this.x;
        int read = ((tfy) o3Var.w).read();
        z1 u = read < 0 ? null : o3Var.u(read);
        if (u == null) {
            return null;
        }
        if (!(u instanceof t1)) {
            w511.r(u.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.c == 0) {
            return (t1) u;
        }
        ny61.v("only the last nested bitstring can have padding");
        return null;
    }

    public u1 c() {
        a2 G = ((o3) this.x).G();
        if (G == null) {
            return null;
        }
        if (!(G instanceof u1)) {
            w511.r(G.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.c == 0) {
            return (u1) G;
        }
        ny61.v("only the last nested bitstring can have padding");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        switch (this.a) {
            case 0:
                if (this.w == null) {
                    if (this.b) {
                        t1 a = a();
                        this.y = a;
                        if (a != null) {
                            this.b = false;
                            this.w = a.b();
                        }
                    }
                }
                while (true) {
                    int read = this.w.read(bArr, i + i3, i2 - i3);
                    if (read >= 0) {
                        i3 += read;
                        if (i3 == i2) {
                        }
                    } else {
                        this.c = ((t1) this.y).e();
                        t1 a2 = a();
                        this.y = a2;
                        if (a2 == null) {
                            this.w = null;
                            if (i3 < 1) {
                            }
                        } else {
                            this.w = a2.b();
                        }
                    }
                }
                break;
            default:
                if (this.w == null) {
                    if (this.b) {
                        u1 c = c();
                        this.y = c;
                        if (c != null) {
                            this.b = false;
                            this.w = c.b();
                        }
                    }
                }
                while (true) {
                    int read2 = this.w.read(bArr, i + i3, i2 - i3);
                    if (read2 >= 0) {
                        i3 += read2;
                        if (i3 == i2) {
                        }
                    } else {
                        this.c = ((u1) this.y).e();
                        u1 c2 = c();
                        this.y = c2;
                        if (c2 == null) {
                            this.w = null;
                            if (i3 < 1) {
                            }
                        } else {
                            this.w = c2.b();
                        }
                    }
                }
                break;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                if (this.w == null) {
                    if (this.b) {
                        t1 a = a();
                        this.y = a;
                        if (a != null) {
                            this.b = false;
                            this.w = a.b();
                        }
                    }
                }
                while (true) {
                    int read = this.w.read();
                    if (read >= 0) {
                        break;
                    } else {
                        this.c = ((t1) this.y).e();
                        t1 a2 = a();
                        this.y = a2;
                        if (a2 == null) {
                            this.w = null;
                            break;
                        } else {
                            this.w = a2.b();
                        }
                    }
                }
                break;
            default:
                if (this.w == null) {
                    if (this.b) {
                        u1 c = c();
                        this.y = c;
                        if (c != null) {
                            this.b = false;
                            this.w = c.b();
                        }
                    }
                }
                while (true) {
                    int read2 = this.w.read();
                    if (read2 >= 0) {
                        break;
                    } else {
                        this.c = ((u1) this.y).e();
                        u1 c2 = c();
                        this.y = c2;
                        if (c2 == null) {
                            this.w = null;
                            break;
                        } else {
                            this.w = c2.b();
                        }
                    }
                }
                break;
        }
        return -1;
    }
}
