package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class u8e extends InputStream {
    public final /* synthetic */ int a;
    public boolean b = true;
    public InputStream c;
    public final Object w;

    public /* synthetic */ u8e(int i, Object obj) {
        this.a = i;
        this.w = obj;
    }

    public x2 a() {
        o3 o3Var = (o3) this.w;
        int read = ((tfy) o3Var.w).read();
        z1 u = read < 0 ? null : o3Var.u(read);
        if (u == null) {
            return null;
        }
        if (u instanceof x2) {
            return (x2) u;
        }
        w511.r(u.getClass(), "unknown object encountered: ");
        return null;
    }

    public y2 c() {
        a2 G = ((o3) this.w).G();
        if (G == null) {
            return null;
        }
        if (G instanceof y2) {
            return (y2) G;
        }
        w511.r(G.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        x2 a;
        y2 c;
        int i3 = 0;
        switch (this.a) {
            case 0:
                if (this.c == null) {
                    if (this.b && (a = a()) != null) {
                        this.b = false;
                        this.c = a.d();
                    }
                }
                while (true) {
                    int read = this.c.read(bArr, i + i3, i2 - i3);
                    if (read >= 0) {
                        i3 += read;
                        if (i3 == i2) {
                        }
                    } else {
                        x2 a2 = a();
                        if (a2 == null) {
                            this.c = null;
                            if (i3 < 1) {
                            }
                        } else {
                            this.c = a2.d();
                        }
                    }
                }
                break;
            default:
                if (this.c == null) {
                    if (this.b && (c = c()) != null) {
                        this.b = false;
                        this.c = c.d();
                    }
                }
                while (true) {
                    int read2 = this.c.read(bArr, i + i3, i2 - i3);
                    if (read2 >= 0) {
                        i3 += read2;
                        if (i3 == i2) {
                        }
                    } else {
                        y2 c2 = c();
                        if (c2 == null) {
                            this.c = null;
                            if (i3 < 1) {
                            }
                        } else {
                            this.c = c2.d();
                        }
                    }
                }
                break;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        x2 a;
        y2 c;
        switch (this.a) {
            case 0:
                if (this.c == null) {
                    if (this.b && (a = a()) != null) {
                        this.b = false;
                        this.c = a.d();
                    }
                }
                while (true) {
                    int read = this.c.read();
                    if (read >= 0) {
                        break;
                    } else {
                        x2 a2 = a();
                        if (a2 == null) {
                            this.c = null;
                            break;
                        } else {
                            this.c = a2.d();
                        }
                    }
                }
                break;
            default:
                if (this.c == null) {
                    if (this.b && (c = c()) != null) {
                        this.b = false;
                        this.c = c.d();
                    }
                }
                while (true) {
                    int read2 = this.c.read();
                    if (read2 >= 0) {
                        break;
                    } else {
                        y2 c2 = c();
                        if (c2 == null) {
                            this.c = null;
                            break;
                        } else {
                            this.c = c2.d();
                        }
                    }
                }
                break;
        }
        return -1;
    }
}
