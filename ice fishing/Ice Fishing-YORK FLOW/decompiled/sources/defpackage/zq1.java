package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zq1 {
    public static final java.lang.ThreadLocal JhCgjQRTAOCT = new java.lang.ThreadLocal();
    public final int ZpBGe2uQfcn8;
    public volatile int fWTAfUmVKrZq = 0;
    public final defpackage.s81 giKS3J6vZuNy;

    public zq1(defpackage.s81 s81Var, int i) {
        this.giKS3J6vZuNy = s81Var;
        this.ZpBGe2uQfcn8 = i;
    }

    public final int ZpBGe2uQfcn8(int i) {
        defpackage.jl0 giKS3J6vZuNy = giKS3J6vZuNy();
        int ZpBGe2uQfcn8 = giKS3J6vZuNy.ZpBGe2uQfcn8(16);
        if (ZpBGe2uQfcn8 == 0) {
            return 0;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) giKS3J6vZuNy.P05cfTpS5W5L;
        int i2 = ZpBGe2uQfcn8 + giKS3J6vZuNy.WDYagTQQm9ns;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final defpackage.jl0 giKS3J6vZuNy() {
        java.lang.ThreadLocal threadLocal = JhCgjQRTAOCT;
        defpackage.jl0 jl0Var = (defpackage.jl0) threadLocal.get();
        if (jl0Var == null) {
            jl0Var = new defpackage.jl0();
            threadLocal.set(jl0Var);
        }
        defpackage.kl0 kl0Var = (defpackage.kl0) this.giKS3J6vZuNy.WDYagTQQm9ns;
        int ZpBGe2uQfcn8 = kl0Var.ZpBGe2uQfcn8(6);
        if (ZpBGe2uQfcn8 != 0) {
            int i = ZpBGe2uQfcn8 + kl0Var.WDYagTQQm9ns;
            int i2 = (this.ZpBGe2uQfcn8 * 4) + ((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(i) + i + 4;
            int i3 = ((java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L).getInt(i2) + i2;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) kl0Var.P05cfTpS5W5L;
            jl0Var.P05cfTpS5W5L = byteBuffer;
            if (byteBuffer != null) {
                jl0Var.WDYagTQQm9ns = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                jl0Var.oh71FJcDz6S2 = i4;
                jl0Var.QiMR8OkAhezm = ((java.nio.ByteBuffer) jl0Var.P05cfTpS5W5L).getShort(i4);
                return jl0Var;
            }
            jl0Var.WDYagTQQm9ns = 0;
            jl0Var.oh71FJcDz6S2 = 0;
            jl0Var.QiMR8OkAhezm = 0;
        }
        return jl0Var;
    }

    public final java.lang.String toString() {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        defpackage.jl0 giKS3J6vZuNy = giKS3J6vZuNy();
        int ZpBGe2uQfcn8 = giKS3J6vZuNy.ZpBGe2uQfcn8(4);
        sb.append(java.lang.Integer.toHexString(ZpBGe2uQfcn8 != 0 ? ((java.nio.ByteBuffer) giKS3J6vZuNy.P05cfTpS5W5L).getInt(ZpBGe2uQfcn8 + giKS3J6vZuNy.WDYagTQQm9ns) : 0));
        sb.append(", codepoints:");
        defpackage.jl0 giKS3J6vZuNy2 = giKS3J6vZuNy();
        int ZpBGe2uQfcn82 = giKS3J6vZuNy2.ZpBGe2uQfcn8(16);
        if (ZpBGe2uQfcn82 != 0) {
            int i2 = ZpBGe2uQfcn82 + giKS3J6vZuNy2.WDYagTQQm9ns;
            i = ((java.nio.ByteBuffer) giKS3J6vZuNy2.P05cfTpS5W5L).getInt(((java.nio.ByteBuffer) giKS3J6vZuNy2.P05cfTpS5W5L).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(java.lang.Integer.toHexString(ZpBGe2uQfcn8(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
