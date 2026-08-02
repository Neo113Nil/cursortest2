package defpackage;

import androidx.media3.common.ParserException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public final class z9x implements b5p {
    public d5p b;
    public int c;
    public int d;
    public int e;
    public va30 g;
    public c5p h;
    public qgg i;
    public wb30 j;
    public final ef90 a = new ef90(6);
    public long f = -1;

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            wb30 wb30Var = this.j;
            wb30Var.getClass();
            wb30Var.a(j, j2);
        }
    }

    public final void b() {
        d5p d5pVar = this.b;
        d5pVar.getClass();
        d5pVar.A();
        this.b.w(new qb4(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.b = d5pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(c5p c5pVar, xde0 xde0Var) {
        String t;
        qgg qggVar;
        va30 va30Var;
        long j;
        int i = this.c;
        long j2 = -1;
        ef90 ef90Var = this.a;
        if (i == 0) {
            ef90Var.H(2);
            c5pVar.readFully(ef90Var.a, 0, 2);
            int E = ef90Var.E();
            this.d = E;
            if (E == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                b();
                return 0;
            }
            if ((E < 65488 || E > 65497) && E != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i == 1) {
            ef90Var.H(2);
            c5pVar.readFully(ef90Var.a, 0, 2);
            this.e = ef90Var.E() - 2;
            this.c = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    ny61.k();
                    return 0;
                }
                if (this.i == null || c5pVar != this.h) {
                    this.h = c5pVar;
                    this.i = new qgg(c5pVar, this.f);
                }
                wb30 wb30Var = this.j;
                wb30Var.getClass();
                int g = wb30Var.g(this.i, xde0Var);
                if (g == 1) {
                    xde0Var.a += this.f;
                }
                return g;
            }
            long position = c5pVar.getPosition();
            long j3 = this.f;
            if (position != j3) {
                xde0Var.a = j3;
                return 1;
            }
            if (!c5pVar.H(ef90Var.a, 0, 1, true)) {
                b();
                return 0;
            }
            c5pVar.J();
            if (this.j == null) {
                this.j = new wb30(8, o2v0.d4);
            }
            qgg qggVar2 = new qgg(c5pVar, this.f);
            this.i = qggVar2;
            if (!this.j.h(qggVar2)) {
                b();
                return 0;
            }
            wb30 wb30Var2 = this.j;
            long j4 = this.f;
            d5p d5pVar = this.b;
            d5pVar.getClass();
            wb30Var2.e(new qgg(j4, d5pVar, 6));
            va30 va30Var2 = this.g;
            va30Var2.getClass();
            d5p d5pVar2 = this.b;
            d5pVar2.getClass();
            g001 B = d5pVar2.B(1024, 4);
            f7s f7sVar = new f7s();
            f7sVar.l = eh20.q("image/jpeg");
            f7sVar.k = new w820(va30Var2);
            smw0.u(f7sVar, B);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            ef90 ef90Var2 = new ef90(this.e);
            c5pVar.readFully(ef90Var2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(ef90Var2.t()) && (t = ef90Var2.t()) != null) {
                long length = c5pVar.getLength();
                if (length != -1) {
                    try {
                        qggVar = ue51.a(t);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        lk91.j("Ignoring unexpected XMP metadata");
                        qggVar = null;
                    }
                    if (qggVar != null) {
                        List list = (List) qggVar.c;
                        if (list.size() >= 2) {
                            int size = list.size() - 1;
                            long j5 = -1;
                            long j6 = -1;
                            long j7 = -1;
                            long j8 = -1;
                            boolean z = false;
                            while (size >= 0) {
                                ua30 ua30Var = (ua30) list.get(size);
                                long j9 = j2;
                                boolean equals = "video/mp4".equals(ua30Var.a) | z;
                                if (size == 0) {
                                    length -= ua30Var.c;
                                    j = 0;
                                } else {
                                    j = length - ua30Var.b;
                                }
                                long j10 = length;
                                length = j;
                                if (!equals || length == j10) {
                                    z = equals;
                                } else {
                                    j8 = j10 - length;
                                    j7 = length;
                                    z = false;
                                }
                                if (size == 0) {
                                    j6 = j10;
                                    j5 = length;
                                }
                                size--;
                                j2 = j9;
                            }
                            long j11 = j2;
                            if (j7 != j11 && j8 != j11 && j5 != j11 && j6 != j11) {
                                va30Var = new va30(j5, j6, qggVar.b, j7, j8);
                                this.g = va30Var;
                                if (va30Var != null) {
                                    this.f = va30Var.w;
                                }
                            }
                        }
                    }
                }
                va30Var = null;
                this.g = va30Var;
                if (va30Var != null) {
                }
            }
        } else {
            c5pVar.O(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        kbh kbhVar = (kbh) c5pVar;
        ef90 ef90Var = this.a;
        ef90Var.H(2);
        kbhVar.H(ef90Var.a, 0, 2, false);
        if (ef90Var.E() == 65496) {
            ef90Var.H(2);
            kbhVar.H(ef90Var.a, 0, 2, false);
            int E = ef90Var.E();
            this.d = E;
            if (E == 65504) {
                ef90Var.H(2);
                kbhVar.H(ef90Var.a, 0, 2, false);
                kbhVar.a(ef90Var.E() - 2, false);
                ef90Var.H(2);
                kbhVar.H(ef90Var.a, 0, 2, false);
                this.d = ef90Var.E();
            }
            if (this.d == 65505) {
                kbhVar.a(2, false);
                ef90Var.H(6);
                kbhVar.H(ef90Var.a, 0, 6, false);
                if (ef90Var.A() == 1165519206 && ef90Var.E() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
        wb30 wb30Var = this.j;
        if (wb30Var != null) {
            wb30Var.getClass();
        }
    }
}
