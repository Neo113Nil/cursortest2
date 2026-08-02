package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.a;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class vdv extends a95 {
    public long A;
    public int B;
    public int C;
    public a D;
    public n06 E;
    public nyg F;
    public ImageOutput G;
    public Bitmap H;
    public boolean I;
    public os7 J;
    public os7 K;
    public int L;
    public boolean M;
    public final h9v a;
    public final nyg b;
    public final ArrayDeque c;
    public boolean w;
    public boolean x;
    public udv y;
    public long z;

    public vdv(h9v h9vVar) {
        super(4);
        this.a = h9vVar;
        this.G = ImageOutput.a;
        this.b = new nyg(0);
        this.y = udv.c;
        this.c = new ArrayDeque();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = 0;
        this.C = 1;
    }

    @Override // defpackage.fyi0, defpackage.iyi0
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // defpackage.a95, defpackage.xyc0
    public final void handleMessage(int i, Object obj) {
        if (i != 15) {
            super.handleMessage(i, obj);
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.a;
        }
        this.G = imageOutput;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (r14 == ((r0 * r1.K) - 1)) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(long j) {
        Bitmap bitmap;
        if ((this.H == null || this.J != null) && (this.C != 0 || getState() == 2)) {
            Bitmap bitmap2 = this.H;
            ArrayDeque arrayDeque = this.c;
            if (bitmap2 == null) {
                d6z.z(this.E);
                gcv gcvVar = (gcv) this.E.g();
                if (gcvVar != null) {
                    if (!gcvVar.b(4)) {
                        d6z.A(gcvVar.w, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.H = gcvVar.w;
                        gcvVar.e();
                    } else {
                        if (this.B == 3) {
                            l();
                            d6z.z(this.D);
                            k();
                            return false;
                        }
                        gcvVar.e();
                        if (arrayDeque.isEmpty()) {
                            this.x = true;
                            return false;
                        }
                    }
                }
            }
            if (this.I && this.H != null && this.J != null) {
                d6z.z(this.D);
                a aVar = this.D;
                int i = aVar.K;
                int i2 = aVar.L;
                boolean z = ((i == 1 && i2 == 1) || i == -1 || i2 == -1) ? false : true;
                os7 os7Var = this.J;
                if (((Bitmap) os7Var.c) == null) {
                    if (z) {
                        int i3 = os7Var.a;
                        d6z.z(this.H);
                        int width = this.H.getWidth();
                        a aVar2 = this.D;
                        d6z.z(aVar2);
                        int i4 = width / aVar2.K;
                        int height = this.H.getHeight();
                        a aVar3 = this.D;
                        d6z.z(aVar3);
                        int i5 = height / aVar3.L;
                        int i6 = this.D.K;
                        bitmap = Bitmap.createBitmap(this.H, (i3 % i6) * i4, (i3 / i6) * i5, i4, i5);
                    } else {
                        bitmap = this.H;
                        d6z.z(bitmap);
                    }
                    os7Var.c = bitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.J.c;
                d6z.z(bitmap3);
                long j2 = this.J.b;
                long j3 = j2 - j;
                boolean z2 = getState() == 2;
                int i7 = this.C;
                if (i7 != 0) {
                    if (i7 == 1) {
                        z2 = true;
                    } else {
                        if (i7 != 3) {
                            ny61.k();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (z2 || j3 < 30000) {
                    this.G.onImageAvailable(j2 - this.y.b, bitmap3);
                    os7 os7Var2 = this.J;
                    d6z.z(os7Var2);
                    long j4 = os7Var2.b;
                    this.z = j4;
                    while (!arrayDeque.isEmpty() && j4 >= ((udv) arrayDeque.peek()).a) {
                        this.y = (udv) arrayDeque.removeFirst();
                    }
                    this.C = 3;
                    if (z) {
                        os7 os7Var3 = this.J;
                        d6z.z(os7Var3);
                        int i8 = os7Var3.a;
                        a aVar4 = this.D;
                        d6z.z(aVar4);
                        int i9 = aVar4.L;
                        a aVar5 = this.D;
                        d6z.z(aVar5);
                    }
                    this.H = null;
                    this.J = this.K;
                    this.K = null;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.a95, defpackage.fyi0
    public final boolean isEnded() {
        return this.x;
    }

    @Override // defpackage.fyi0
    public final boolean isReady() {
        int i = this.C;
        if (i != 3) {
            return i == 0 && this.I;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0100, code lost:
    
        if (r2 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(long j) {
        boolean z;
        nyg nygVar;
        a aVar;
        int i;
        nyg nygVar2;
        if (!this.I || this.J == null) {
            o7s formatHolder = getFormatHolder();
            n06 n06Var = this.E;
            if (n06Var != null && this.B != 3 && !this.w) {
                if (this.F == null) {
                    nyg nygVar3 = (nyg) n06Var.d();
                    this.F = nygVar3;
                }
                int i2 = this.B;
                nyg nygVar4 = this.F;
                if (i2 == 2) {
                    d6z.z(nygVar4);
                    this.F.a = 4;
                    n06 n06Var2 = this.E;
                    d6z.z(n06Var2);
                    n06Var2.e(this.F);
                    this.F = null;
                    this.B = 3;
                    return false;
                }
                int readSource = readSource(formatHolder, nygVar4, 0);
                if (readSource == -5) {
                    a aVar2 = formatHolder.b;
                    d6z.z(aVar2);
                    this.D = aVar2;
                    this.M = true;
                    this.B = 2;
                    return true;
                }
                if (readSource == -4) {
                    this.F.j();
                    ByteBuffer byteBuffer = this.F.w;
                    if (byteBuffer == null || byteBuffer.remaining() <= 0) {
                        nyg nygVar5 = this.F;
                        d6z.z(nygVar5);
                        if (!nygVar5.b(4)) {
                            z = false;
                            if (z) {
                                n06 n06Var3 = this.E;
                                d6z.z(n06Var3);
                                nyg nygVar6 = this.F;
                                d6z.z(nygVar6);
                                n06Var3.e(nygVar6);
                                this.L = 0;
                            }
                            nygVar = this.F;
                            d6z.z(nygVar);
                            if (nygVar.b(4)) {
                                int i3 = this.L;
                                long j2 = nygVar.y;
                                os7 os7Var = new os7();
                                os7Var.a = i3;
                                os7Var.b = j2;
                                this.K = os7Var;
                                this.L = i3 + 1;
                                if (!this.I) {
                                    boolean z2 = j2 - 30000 <= j && j <= 30000 + j2;
                                    os7 os7Var2 = this.J;
                                    boolean z3 = os7Var2 != null && os7Var2.b <= j && j < j2;
                                    a aVar3 = this.D;
                                    d6z.z(aVar3);
                                    this.I = z2 || z3 || (aVar3.K == -1 || (i = (aVar = this.D).L) == -1 || i3 == (i * aVar.K) - 1);
                                    if (z3) {
                                    }
                                }
                                this.J = this.K;
                                this.K = null;
                            } else {
                                this.I = true;
                            }
                            nygVar2 = this.F;
                            d6z.z(nygVar2);
                            if (!nygVar2.b(4)) {
                                this.w = true;
                                this.F = null;
                                return false;
                            }
                            long j3 = this.A;
                            nyg nygVar7 = this.F;
                            d6z.z(nygVar7);
                            this.A = Math.max(j3, nygVar7.y);
                            if (z) {
                                this.F = null;
                            } else {
                                nyg nygVar8 = this.F;
                                d6z.z(nygVar8);
                                nygVar8.d();
                            }
                            return !this.I;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    nygVar = this.F;
                    d6z.z(nygVar);
                    if (nygVar.b(4)) {
                    }
                    nygVar2 = this.F;
                    d6z.z(nygVar2);
                    if (!nygVar2.b(4)) {
                    }
                } else if (readSource != -3) {
                    ny61.k();
                    return false;
                }
            }
        }
        return false;
    }

    public final void k() {
        if (this.M) {
            a aVar = this.D;
            aVar.getClass();
            m06 m06Var = (m06) this.a;
            int a = m06Var.a(aVar);
            if (a != iyi0.a(4, 0, 0, 0) && a != iyi0.a(3, 0, 0, 0)) {
                throw createRendererException(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.D, 4005);
            }
            n06 n06Var = this.E;
            if (n06Var != null) {
                n06Var.release();
            }
            this.E = new n06(m06Var.b);
            this.M = false;
        }
    }

    public final void l() {
        this.F = null;
        this.B = 0;
        this.A = -9223372036854775807L;
        n06 n06Var = this.E;
        if (n06Var != null) {
            n06Var.release();
            this.E = null;
        }
    }

    @Override // defpackage.a95
    public final void onDisabled() {
        this.D = null;
        this.y = udv.c;
        this.c.clear();
        l();
        this.G.a();
    }

    @Override // defpackage.a95
    public final void onEnabled(boolean z, boolean z2) {
        this.C = z2 ? 1 : 0;
    }

    @Override // defpackage.a95
    public final void onPositionReset(long j, boolean z) {
        this.C = Math.min(this.C, 1);
        this.x = false;
        this.w = false;
        this.H = null;
        this.J = null;
        this.K = null;
        this.I = false;
        this.F = null;
        n06 n06Var = this.E;
        if (n06Var != null) {
            n06Var.flush();
        }
        this.c.clear();
    }

    @Override // defpackage.a95
    public final void onRelease() {
        l();
    }

    @Override // defpackage.a95
    public final void onReset() {
        l();
        this.C = Math.min(this.C, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.a95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStreamChanged(a[] aVarArr, long j, long j2, sf10 sf10Var) {
        if (this.y.b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.c;
            if (arrayDeque.isEmpty()) {
                long j3 = this.A;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.z;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new udv(this.A, j2));
            return;
        }
        this.y = new udv(-9223372036854775807L, j2);
    }

    @Override // defpackage.fyi0
    public final void render(long j, long j2) {
        if (this.x) {
            return;
        }
        if (this.D == null) {
            o7s formatHolder = getFormatHolder();
            nyg nygVar = this.b;
            nygVar.d();
            int readSource = readSource(formatHolder, nygVar, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    d6z.x(nygVar.b(4));
                    this.w = true;
                    this.x = true;
                    return;
                }
                return;
            }
            a aVar = formatHolder.b;
            d6z.z(aVar);
            this.D = aVar;
            this.M = true;
        }
        if (this.E == null) {
            k();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (i(j)) {
            }
            while (j(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw createRendererException(e, null, 4003);
        }
    }

    @Override // defpackage.iyi0
    public final int supportsFormat(a aVar) {
        return ((m06) this.a).a(aVar);
    }
}
