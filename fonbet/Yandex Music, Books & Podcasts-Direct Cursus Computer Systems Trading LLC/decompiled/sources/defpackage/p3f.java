package defpackage;

import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p3f implements r2c {
    public t2c b;
    public int c;
    public int d;
    public int e;
    public uei g;
    public s2c h;
    public au1 i;
    public xfi j;
    public final d7k a = new d7k(6);
    public long f = -1;

    @Override // defpackage.r2c
    public final void a() {
        xfi xfiVar = this.j;
        if (xfiVar != null) {
            xfiVar.getClass();
        }
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            xfi xfiVar = this.j;
            xfiVar.getClass();
            xfiVar.b(j, j2);
        }
    }

    public final void c() {
        t2c t2cVar = this.b;
        t2cVar.getClass();
        t2cVar.K();
        this.b.E(new zg2(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        gm7 gm7Var = (gm7) s2cVar;
        d7k d7kVar = this.a;
        d7kVar.E(2);
        gm7Var.l(d7kVar.a, 0, 2, false);
        if (d7kVar.B() == 65496) {
            d7kVar.E(2);
            gm7Var.l(d7kVar.a, 0, 2, false);
            int B = d7kVar.B();
            this.d = B;
            if (B == 65504) {
                d7kVar.E(2);
                gm7Var.l(d7kVar.a, 0, 2, false);
                gm7Var.c(d7kVar.B() - 2, false);
                d7kVar.E(2);
                gm7Var.l(d7kVar.a, 0, 2, false);
                this.d = d7kVar.B();
            }
            if (this.d == 65505) {
                gm7Var.c(2, false);
                d7kVar.E(6);
                gm7Var.l(d7kVar.a, 0, 6, false);
                if (d7kVar.x() == 1165519206 && d7kVar.B() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0179  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        String q;
        au1 au1Var;
        qsn qsnVar;
        int i;
        uei ueiVar;
        long j;
        int i2 = this.c;
        d7k d7kVar = this.a;
        if (i2 == 0) {
            d7kVar.E(2);
            s2cVar.readFully(d7kVar.a, 0, 2);
            int B = d7kVar.B();
            this.d = B;
            if (B == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                c();
                return 0;
            }
            if ((B < 65488 || B > 65497) && B != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            d7kVar.E(2);
            s2cVar.readFully(d7kVar.a, 0, 2);
            this.e = d7kVar.B() - 2;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    e7o.n();
                    return 0;
                }
                if (this.i == null || s2cVar != this.h) {
                    this.h = s2cVar;
                    this.i = new au1(s2cVar, this.f);
                }
                xfi xfiVar = this.j;
                xfiVar.getClass();
                int h = xfiVar.h(this.i, ci0Var);
                if (h == 1) {
                    ci0Var.a += this.f;
                }
                return h;
            }
            long position = s2cVar.getPosition();
            long j2 = this.f;
            if (position != j2) {
                ci0Var.a = j2;
                return 1;
            }
            if (!s2cVar.l(d7kVar.a, 0, 1, true)) {
                c();
                return 0;
            }
            s2cVar.n();
            if (this.j == null) {
                this.j = new xfi(spr.p0, 8);
            }
            au1 au1Var2 = new au1(s2cVar, this.f);
            this.i = au1Var2;
            if (!this.j.d(au1Var2)) {
                c();
                return 0;
            }
            xfi xfiVar2 = this.j;
            long j3 = this.f;
            t2c t2cVar = this.b;
            t2cVar.getClass();
            xfiVar2.l(new au1(j3, t2cVar, 13));
            uei ueiVar2 = this.g;
            ueiVar2.getClass();
            t2c t2cVar2 = this.b;
            t2cVar2.getClass();
            azs M = t2cVar2.M(1024, 4);
            bsc bscVar = new bsc();
            bscVar.l = l5i.p("image/jpeg");
            bscVar.k = new u2i(ueiVar2);
            eta.o(bscVar, M);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            d7k d7kVar2 = new d7k(this.e);
            s2cVar.readFully(d7kVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(d7kVar2.q()) && (q = d7kVar2.q()) != null) {
                long length = s2cVar.getLength();
                if (length != -1) {
                    try {
                        au1Var = xp3.Y(q);
                    } catch (NumberFormatException | XmlPullParserException | r7k unused) {
                        vq1.n0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        au1Var = null;
                    }
                    if (au1Var != null && (i = (qsnVar = (qsn) au1Var.c).d) >= 2) {
                        int i3 = i - 1;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        while (i3 >= 0) {
                            tei teiVar = (tei) qsnVar.get(i3);
                            boolean equals = "video/mp4".equals(teiVar.a) | z;
                            if (i3 == 0) {
                                length -= teiVar.c;
                                j = 0;
                            } else {
                                j = length - teiVar.b;
                            }
                            long j8 = j;
                            long j9 = length;
                            length = j8;
                            if (equals && length != j9) {
                                j7 = j9 - length;
                                j6 = length;
                                equals = false;
                            }
                            if (i3 == 0) {
                                j4 = length;
                                j5 = j9;
                            }
                            i3--;
                            z = equals;
                        }
                        if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                            ueiVar = new uei(j4, j5, au1Var.b, j6, j7);
                            this.g = ueiVar;
                            if (ueiVar != null) {
                                this.f = ueiVar.d;
                            }
                        }
                    }
                }
                ueiVar = null;
                this.g = ueiVar;
                if (ueiVar != null) {
                }
            }
        } else {
            s2cVar.y(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.b = t2cVar;
    }
}
