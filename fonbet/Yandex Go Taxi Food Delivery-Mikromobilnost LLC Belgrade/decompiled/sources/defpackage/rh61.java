package defpackage;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import yads.aa2;

/* loaded from: classes7.dex */
public final class rh61 implements n771 {
    public static final int[] m = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final int q;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public long h;
    public yg71 i;
    public fb81 j;
    public w471 k;
    public boolean l;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        n = iArr;
        int i = rf71.a;
        Charset charset = md81.c;
        o = "#!AMR\n".getBytes(charset);
        p = "#!AMR-WB\n".getBytes(charset);
        q = iArr[8];
    }

    public final int a(w971 w971Var) {
        boolean z;
        w971Var.y = 0;
        byte[] bArr = this.a;
        w971Var.I(bArr, 0, 1, false);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            dy31.g(null, q8a1.c(b, "Invalid padding bits for frame header "));
            return 0;
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.b) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? n[i] : m[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new aa2(sb.toString(), null, true, 1);
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.i = yg71Var;
        this.j = yg71Var.l(0, 1);
        yg71Var.mo495a();
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.h = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        int i = 0;
        if (this.j == null) {
            ny61.k();
            return 0;
        }
        int i2 = rf71.a;
        w971 w971Var = (w971) bb71Var;
        if (w971Var.w == 0) {
            w971Var.y = 0;
            byte[] bArr = o;
            byte[] bArr2 = new byte[bArr.length];
            w971Var.I(bArr2, 0, bArr.length, false);
            if (Arrays.equals(bArr2, bArr)) {
                this.b = false;
                w971Var.b(bArr.length);
            } else {
                w971Var.y = 0;
                byte[] bArr3 = p;
                byte[] bArr4 = new byte[bArr3.length];
                w971Var.I(bArr4, 0, bArr3.length, false);
                if (!Arrays.equals(bArr4, bArr3)) {
                    dy31.g(null, "Could not find AMR header.");
                    return 0;
                }
                this.b = true;
                w971Var.b(bArr3.length);
            }
        }
        if (!this.l) {
            this.l = true;
            boolean z = this.b;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i3 = z ? 16000 : 8000;
            fb81 fb81Var = this.j;
            da81 da81Var = new da81();
            da81Var.k = str;
            da81Var.l = q;
            da81Var.x = 1;
            da81Var.y = i3;
            fb81Var.k(new qd81(da81Var));
        }
        if (this.e == 0) {
            try {
                int a = a((w971) bb71Var);
                this.d = a;
                this.e = a;
                if (this.g == -1) {
                    this.g = a;
                }
            } catch (EOFException unused) {
            }
        }
        int c = this.j.c(bb71Var, this.e, true);
        if (c != -1) {
            int i4 = this.e - c;
            this.e = i4;
            if (i4 <= 0) {
                this.j.b(this.c + this.h, 1, this.d, 0, null);
                this.c += DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
            }
            if (!this.f) {
                w471 w471Var = new w471(-9223372036854775807L, 0L);
                this.k = w471Var;
                this.i.r(w471Var);
                this.f = true;
            }
            return i;
        }
        i = -1;
        if (!this.f) {
        }
        return i;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        w971 w971Var = (w971) bb71Var;
        w971Var.y = 0;
        byte[] bArr = o;
        byte[] bArr2 = new byte[bArr.length];
        w971Var.I(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.b = false;
            w971Var.b(bArr.length);
            return true;
        }
        w971Var.y = 0;
        byte[] bArr3 = p;
        byte[] bArr4 = new byte[bArr3.length];
        w971Var.I(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.b = true;
        w971Var.b(bArr3.length);
        return true;
    }
}
