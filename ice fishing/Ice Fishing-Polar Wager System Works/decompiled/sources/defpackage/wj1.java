package defpackage;

/* loaded from: classes.dex */
public final class wj1 {
    public static final java.lang.ThreadLocal F7NU4MC0GW = new java.lang.ThreadLocal();
    public final int IHQe1A4L2xu;
    public final defpackage.y oh6vYeIP;
    public volatile int r1MBDhnF = 0;

    public wj1(defpackage.y yVar, int i) {
        this.oh6vYeIP = yVar;
        this.IHQe1A4L2xu = i;
    }

    public final int IHQe1A4L2xu(int i) {
        defpackage.cj0 oh6vYeIP = oh6vYeIP();
        int IHQe1A4L2xu = oh6vYeIP.IHQe1A4L2xu(16);
        if (IHQe1A4L2xu == 0) {
            return 0;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) oh6vYeIP.EXtogiMhuM;
        int i2 = IHQe1A4L2xu + oh6vYeIP.adDC3e2L;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final defpackage.cj0 oh6vYeIP() {
        java.lang.ThreadLocal threadLocal = F7NU4MC0GW;
        defpackage.cj0 cj0Var = (defpackage.cj0) threadLocal.get();
        if (cj0Var == null) {
            cj0Var = new defpackage.cj0();
            threadLocal.set(cj0Var);
        }
        defpackage.dj0 dj0Var = (defpackage.dj0) this.oh6vYeIP.adDC3e2L;
        int IHQe1A4L2xu = dj0Var.IHQe1A4L2xu(6);
        if (IHQe1A4L2xu != 0) {
            int i = IHQe1A4L2xu + dj0Var.adDC3e2L;
            int i2 = (this.IHQe1A4L2xu * 4) + ((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getInt(i) + i + 4;
            int i3 = ((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getInt(i2) + i2;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) dj0Var.EXtogiMhuM;
            cj0Var.EXtogiMhuM = byteBuffer;
            if (byteBuffer != null) {
                cj0Var.adDC3e2L = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                cj0Var.xiZrDbcSW0 = i4;
                cj0Var.AARZUJiTa = ((java.nio.ByteBuffer) cj0Var.EXtogiMhuM).getShort(i4);
                return cj0Var;
            }
            cj0Var.adDC3e2L = 0;
            cj0Var.xiZrDbcSW0 = 0;
            cj0Var.AARZUJiTa = 0;
        }
        return cj0Var;
    }

    public final java.lang.String toString() {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        defpackage.cj0 oh6vYeIP = oh6vYeIP();
        int IHQe1A4L2xu = oh6vYeIP.IHQe1A4L2xu(4);
        sb.append(java.lang.Integer.toHexString(IHQe1A4L2xu != 0 ? ((java.nio.ByteBuffer) oh6vYeIP.EXtogiMhuM).getInt(IHQe1A4L2xu + oh6vYeIP.adDC3e2L) : 0));
        sb.append(", codepoints:");
        defpackage.cj0 oh6vYeIP2 = oh6vYeIP();
        int IHQe1A4L2xu2 = oh6vYeIP2.IHQe1A4L2xu(16);
        if (IHQe1A4L2xu2 != 0) {
            int i2 = IHQe1A4L2xu2 + oh6vYeIP2.adDC3e2L;
            i = ((java.nio.ByteBuffer) oh6vYeIP2.EXtogiMhuM).getInt(((java.nio.ByteBuffer) oh6vYeIP2.EXtogiMhuM).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(java.lang.Integer.toHexString(IHQe1A4L2xu(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
