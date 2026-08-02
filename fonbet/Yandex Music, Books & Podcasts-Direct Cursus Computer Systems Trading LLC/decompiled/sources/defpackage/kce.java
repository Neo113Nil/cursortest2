package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class kce extends at2 {
    public int A;
    public dsc B;
    public i33 C;
    public qg7 D;
    public ImageOutput E;
    public Bitmap F;
    public boolean G;
    public wx0 H;
    public wx0 I;
    public int J;
    public boolean K;
    public final gbe r;
    public final qg7 s;
    public final ArrayDeque t;
    public boolean u;
    public boolean v;
    public jce w;
    public long x;
    public long y;
    public int z;

    public kce(gbe gbeVar) {
        super(4);
        this.r = gbeVar;
        this.E = ImageOutput.a;
        this.s = new qg7(0);
        this.w = jce.c;
        this.t = new ArrayDeque();
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = 0;
        this.A = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.at2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(dsc[] dscVarArr, long j, long j2, uvh uvhVar) {
        if (this.w.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.t;
            if (arrayDeque.isEmpty()) {
                long j3 = this.y;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.x;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new jce(this.y, j2));
            return;
        }
        this.w = new jce(-9223372036854775807L, j2);
    }

    @Override // defpackage.at2
    public final void E(long j, long j2) {
        if (this.v) {
            return;
        }
        if (this.B == null) {
            qdc qdcVar = this.c;
            qdcVar.s();
            qg7 qg7Var = this.s;
            qg7Var.z();
            int D = D(qdcVar, qg7Var, 2);
            if (D != -5) {
                if (D == -4) {
                    vq1.A(qg7Var.f(4));
                    this.u = true;
                    this.v = true;
                    return;
                }
                return;
            }
            dsc dscVar = (dsc) qdcVar.c;
            vq1.B(dscVar);
            this.B = dscVar;
            this.K = true;
        }
        if (this.C == null) {
            M();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (K(j)) {
            }
            while (L(j)) {
            }
            Trace.endSection();
        } catch (obe e) {
            throw h(e, null, false, 4003);
        }
    }

    @Override // defpackage.at2
    public final int I(dsc dscVar) {
        return ((znk) this.r).D(dscVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0145, code lost:
    
        if (r14 == ((r0 * r1.K) - 1)) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(long j) {
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2 = this.F;
        if ((bitmap2 == null || this.H != null) && (this.A != 0 || this.h == 2)) {
            ArrayDeque arrayDeque = this.t;
            if (bitmap2 == null) {
                vq1.B(this.C);
                h33 h33Var = (h33) this.C.g();
                if (h33Var != null) {
                    if (!h33Var.f(4)) {
                        vq1.C(h33Var.j, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.F = h33Var.j;
                        h33Var.A();
                    } else {
                        if (this.z == 3) {
                            N();
                            vq1.B(this.B);
                            M();
                            return false;
                        }
                        h33Var.A();
                        if (arrayDeque.isEmpty()) {
                            this.v = true;
                            return false;
                        }
                    }
                }
            }
            if (this.G && this.F != null && this.H != null) {
                vq1.B(this.B);
                dsc dscVar = this.B;
                int i = dscVar.K;
                int i2 = dscVar.L;
                boolean z2 = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                wx0 wx0Var = this.H;
                if (((Bitmap) wx0Var.c) == null) {
                    if (z2) {
                        int i3 = wx0Var.a;
                        vq1.B(this.F);
                        int width = this.F.getWidth();
                        dsc dscVar2 = this.B;
                        vq1.B(dscVar2);
                        int i4 = width / dscVar2.K;
                        int height = this.F.getHeight();
                        dsc dscVar3 = this.B;
                        vq1.B(dscVar3);
                        int i5 = height / dscVar3.L;
                        int i6 = this.B.K;
                        bitmap = Bitmap.createBitmap(this.F, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.F;
                        vq1.B(bitmap);
                    }
                    wx0Var.c = bitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.H.c;
                vq1.B(bitmap3);
                long j2 = this.H.b;
                long j3 = j2 - j;
                boolean z3 = this.h == 2;
                int i7 = this.A;
                if (i7 != 0) {
                    if (i7 == 1) {
                        z3 = true;
                    } else {
                        if (i7 != 3) {
                            e7o.n();
                            return false;
                        }
                        z3 = false;
                    }
                }
                if (z3 || j3 < 30000) {
                    this.E.onImageAvailable(j2 - this.w.b, bitmap3);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    wx0 wx0Var2 = this.H;
                    vq1.B(wx0Var2);
                    long j4 = wx0Var2.b;
                    this.x = j4;
                    while (!arrayDeque.isEmpty() && j4 >= ((jce) arrayDeque.peek()).a) {
                        this.w = (jce) arrayDeque.removeFirst();
                    }
                    this.A = 3;
                    if (z2) {
                        wx0 wx0Var3 = this.H;
                        vq1.B(wx0Var3);
                        int i8 = wx0Var3.a;
                        dsc dscVar4 = this.B;
                        vq1.B(dscVar4);
                        int i9 = dscVar4.L;
                        dsc dscVar5 = this.B;
                        vq1.B(dscVar5);
                    }
                    this.F = null;
                    this.H = this.I;
                    this.I = null;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(long j) {
        boolean z;
        qg7 qg7Var;
        dsc dscVar;
        int i;
        qg7 qg7Var2;
        if (!this.G || this.H == null) {
            qdc qdcVar = this.c;
            qdcVar.s();
            i33 i33Var = this.C;
            if (i33Var != null && this.z != 3 && !this.u) {
                if (this.D == null) {
                    qg7 qg7Var3 = (qg7) i33Var.f();
                    this.D = qg7Var3;
                }
                int i2 = this.z;
                qg7 qg7Var4 = this.D;
                if (i2 == 2) {
                    vq1.B(qg7Var4);
                    this.D.b = 4;
                    i33 i33Var2 = this.C;
                    vq1.B(i33Var2);
                    i33Var2.h(this.D);
                    this.D = null;
                    this.z = 3;
                    return false;
                }
                int D = D(qdcVar, qg7Var4, 0);
                if (D == -5) {
                    dsc dscVar2 = (dsc) qdcVar.c;
                    vq1.B(dscVar2);
                    this.B = dscVar2;
                    this.K = true;
                    this.z = 2;
                    return true;
                }
                if (D == -4) {
                    this.D.C();
                    ByteBuffer byteBuffer = this.D.i;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        qg7 qg7Var5 = this.D;
                        vq1.B(qg7Var5);
                        if (!qg7Var5.f(4)) {
                            z = false;
                            if (z) {
                                i33 i33Var3 = this.C;
                                vq1.B(i33Var3);
                                qg7 qg7Var6 = this.D;
                                vq1.B(qg7Var6);
                                i33Var3.h(qg7Var6);
                                this.J = 0;
                            }
                            qg7Var = this.D;
                            vq1.B(qg7Var);
                            if (qg7Var.f(4)) {
                                int i3 = this.J;
                                long j2 = qg7Var.k;
                                wx0 wx0Var = new wx0();
                                wx0Var.a = i3;
                                wx0Var.b = j2;
                                this.I = wx0Var;
                                this.J = i3 + 1;
                                if (!this.G) {
                                    boolean z2 = j2 - 30000 <= j && j <= 30000 + j2;
                                    wx0 wx0Var2 = this.H;
                                    boolean z3 = wx0Var2 != null && wx0Var2.b <= j && j < j2;
                                    dsc dscVar3 = this.B;
                                    vq1.B(dscVar3);
                                    this.G = z2 || z3 || (dscVar3.K == -1 || (i = (dscVar = this.B).L) == -1 || i3 == (i * dscVar.K) - 1);
                                    if (z3) {
                                    }
                                }
                                this.H = this.I;
                                this.I = null;
                            } else {
                                this.G = true;
                            }
                            qg7Var2 = this.D;
                            vq1.B(qg7Var2);
                            if (!qg7Var2.f(4)) {
                                this.u = true;
                                this.D = null;
                                return false;
                            }
                            long j3 = this.y;
                            qg7 qg7Var7 = this.D;
                            vq1.B(qg7Var7);
                            this.y = Math.max(j3, qg7Var7.k);
                            if (z) {
                                this.D = null;
                            } else {
                                qg7 qg7Var8 = this.D;
                                vq1.B(qg7Var8);
                                qg7Var8.z();
                            }
                            return !this.G;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    qg7Var = this.D;
                    vq1.B(qg7Var);
                    if (qg7Var.f(4)) {
                    }
                    qg7Var2 = this.D;
                    vq1.B(qg7Var2);
                    if (!qg7Var2.f(4)) {
                    }
                } else if (D != -3) {
                    e7o.n();
                    return false;
                }
            }
        }
        return false;
    }

    public final void M() {
        if (this.K) {
            dsc dscVar = this.B;
            dscVar.getClass();
            znk znkVar = (znk) this.r;
            int D = znkVar.D(dscVar);
            if (D != at2.e(4, 0, 0, 0) && D != at2.e(3, 0, 0, 0)) {
                throw h(new obe("Provided decoder factory can't create decoder for format."), this.B, false, 4005);
            }
            i33 i33Var = this.C;
            if (i33Var != null) {
                i33Var.a();
            }
            this.C = new i33((xq0) znkVar.b);
            this.K = false;
        }
    }

    public final void N() {
        this.D = null;
        this.z = 0;
        this.y = -9223372036854775807L;
        i33 i33Var = this.C;
        if (i33Var != null) {
            i33Var.a();
            this.C = null;
        }
    }

    @Override // defpackage.at2, defpackage.ogl
    public final void a(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.E = imageOutput;
    }

    @Override // defpackage.at2
    public final String k() {
        return "ImageRenderer";
    }

    @Override // defpackage.at2
    public final boolean n() {
        return this.v;
    }

    @Override // defpackage.at2
    public final boolean p() {
        int i = this.A;
        if (i != 3) {
            return i == 0 && this.G;
        }
        return true;
    }

    @Override // defpackage.at2
    public final void u() {
        this.B = null;
        this.w = jce.c;
        this.t.clear();
        N();
        this.E.a();
    }

    @Override // defpackage.at2
    public final void v(boolean z, boolean z2) {
        this.A = z2 ? 1 : 0;
    }

    @Override // defpackage.at2
    public final void w(long j, boolean z) {
        this.A = Math.min(this.A, 1);
        this.v = false;
        this.u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        i33 i33Var = this.C;
        if (i33Var != null) {
            i33Var.flush();
        }
        this.t.clear();
    }

    @Override // defpackage.at2
    public final void x() {
        N();
    }

    @Override // defpackage.at2
    public final void z() {
        N();
        this.A = Math.min(this.A, 1);
    }
}
