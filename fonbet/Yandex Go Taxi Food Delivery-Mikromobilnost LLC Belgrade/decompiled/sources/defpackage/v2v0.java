package defpackage;

import androidx.media3.common.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class v2v0 implements g001 {
    public final g001 a;
    public final o2v0 b;
    public q2v0 h;
    public a i;
    public boolean j;
    public final qdf c = new qdf();
    public int e = 0;
    public int f = 0;
    public byte[] g = tw21.c;
    public final ef90 d = new ef90();

    public v2v0(g001 g001Var, o2v0 o2v0Var) {
        this.a = g001Var;
        this.b = o2v0Var;
    }

    @Override // defpackage.g001
    public final void a(ef90 ef90Var, int i, int i2) {
        if (this.h == null) {
            this.a.a(ef90Var, i, i2);
            return;
        }
        e(i);
        ef90Var.i(this.f, i, this.g);
        this.f += i;
    }

    @Override // defpackage.g001
    public final int b(apg apgVar, int i, boolean z) {
        if (this.h == null) {
            return this.a.b(apgVar, i, z);
        }
        e(i);
        int read = apgVar.read(this.g, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        }
        if (z) {
            return -1;
        }
        ny61.b();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.g001
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j, int i, int i2, int i3, f001 f001Var) {
        int i4;
        int i5;
        if (this.h == null) {
            this.a.c(j, i, i2, i3, f001Var);
            return;
        }
        d6z.k("DRM on subtitles is not supported", f001Var == null);
        int i6 = (this.f - i3) - i2;
        try {
            i4 = i6;
        } catch (RuntimeException e) {
            e = e;
            i4 = i6;
        }
        try {
            this.h.b(this.g, i4, i2, p2v0.c, new u2v0(this, j, i));
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!this.j) {
                throw runtimeException;
            }
            lk91.k("Parsing subtitles failed, ignoring sample.", runtimeException);
            i5 = i4 + i2;
            this.e = i5;
            if (i5 != this.f) {
            }
        }
        i5 = i4 + i2;
        this.e = i5;
        if (i5 != this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // defpackage.g001
    public final void d(a aVar) {
        aVar.n.getClass();
        String str = aVar.n;
        d6z.l(eh20.i(str) == 3);
        boolean equals = aVar.equals(this.i);
        o2v0 o2v0Var = this.b;
        if (!equals) {
            this.i = aVar;
            this.h = o2v0Var.supportsFormat(aVar) ? o2v0Var.e(aVar) : null;
        }
        q2v0 q2v0Var = this.h;
        g001 g001Var = this.a;
        if (q2v0Var == null) {
            g001Var.d(aVar);
            return;
        }
        f7s a = aVar.a();
        a.m = eh20.q("application/x-media3-cues");
        a.j = str;
        a.r = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        a.I = o2v0Var.a(aVar);
        smw0.u(a, g001Var);
    }

    public final void e(int i) {
        int length = this.g.length;
        int i2 = this.f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.e;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.e, bArr2, 0, i3);
        this.e = 0;
        this.f = i3;
        this.g = bArr2;
    }
}
