package defpackage;

/* loaded from: classes5.dex */
public abstract class hm3 {
    public final zx0 a;
    public int b;

    public hm3(int i) {
        switch (i) {
            case 1:
                this.a = new zx0();
                break;
            default:
                this.a = new zx0();
                break;
        }
    }

    public void a(byte[] bArr) {
        bArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < az0.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < az0.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        synchronized (this) {
            zx0 zx0Var = this.a;
            bArr = null;
            byte[] bArr2 = (byte[]) (zx0Var.isEmpty() ? null : zx0Var.removeLast());
            if (bArr2 != null) {
                this.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public char[] d(int i) {
        char[] cArr;
        synchronized (this) {
            zx0 zx0Var = this.a;
            cArr = null;
            char[] cArr2 = (char[]) (zx0Var.isEmpty() ? null : zx0Var.removeLast());
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
