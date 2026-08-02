package defpackage;

import androidx.compose.foundation.lazy.b;
import com.yandex.go.summary.ui.compose.common.animation.c;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Mesh$PrimitiveMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tkb1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(vnx0 vnx0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        tls tlsVar3;
        f530 f530Var3;
        tls tlsVar4;
        aii0 v;
        tls tlsVar5;
        tls tlsVar6;
        bpl0 bpl0Var;
        List list;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2070881941);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(vnx0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.e(tlsVar) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                tlsVar3 = tlsVar2;
                i3 |= btsVar.e(tlsVar3) ? 2048 : 1024;
                if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
                    f530 f530Var4 = i5 != 0 ? c530.a : f530Var2;
                    o430 o430Var = did.a;
                    if (i4 != 0) {
                        Object Q = btsVar.Q();
                        if (Q == o430Var) {
                            Q = new xvq(12);
                            btsVar.o0(Q);
                        }
                        tlsVar5 = (tls) Q;
                    } else {
                        tlsVar5 = tlsVar3;
                    }
                    if (vnx0Var == null || (bpl0Var = vnx0Var.b) == null || (list = bpl0Var.a) == null || !(!list.isEmpty())) {
                        tlsVar6 = tlsVar5;
                        btsVar.e0(-732016966);
                        oeb1.c(btsVar, ljs0.e(f530Var4, 102.0f));
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-733313510);
                        b a = a7y.a(0, 3, btsVar);
                        c.b(a, vnx0Var.a, 0.0f, btsVar, 0);
                        int i6 = i3 & 14;
                        boolean z = i6 == 4;
                        Object Q2 = btsVar.Q();
                        if (z || Q2 == o430Var) {
                            Q2 = new s5w0(14, vnx0Var);
                            btsVar.o0(Q2);
                        }
                        f530 c = ljs0.c(fnq0.b(f530Var4, false, (tls) Q2), 1.0f);
                        l690 l690Var = new l690(16.0f, 8.0f, 16.0f, 8.0f);
                        i43 i43Var = new i43(8.0f, true, new quz(11));
                        boolean z2 = (i6 == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
                        Object Q3 = btsVar.Q();
                        if (z2 || Q3 == o430Var) {
                            Q3 = new lxo0(28, vnx0Var, tlsVar, tlsVar5);
                            btsVar.o0(Q3);
                        }
                        tlsVar6 = tlsVar5;
                        adb1.b(c, a, l690Var, i43Var, null, null, false, null, (tls) Q3, btsVar, 24960, 488);
                        btsVar.t(false);
                    }
                    f530Var3 = f530Var4;
                    tlsVar4 = tlsVar6;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    tlsVar4 = tlsVar3;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new p91(vnx0Var, f530Var3, tlsVar, tlsVar4, i, i2);
                    return;
                }
                return;
            }
            tlsVar3 = tlsVar2;
            if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        tlsVar3 = tlsVar2;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static zr10 b(m33 m33Var) {
        float f = m33Var.a / 100.0f;
        float f2 = (m33Var.b / 100.0f) / 2.0f;
        float f3 = f / 2.0f;
        float f4 = (m33Var.c / 100.0f) / 2.0f;
        float f5 = -f2;
        float f6 = -f3;
        float f7 = -f4;
        float[] fArr = {f5, f6, f4, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, f2, f6, f4, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, f2, f3, f4, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, f5, f3, f4, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, f5, f6, f7, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, f5, f3, f7, 1.0f, 1.0f, 0.0f, 0.0f, -1.0f, f2, f3, f7, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, f2, f6, f7, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, f5, f3, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, f5, f3, f4, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, f2, f3, f4, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, f2, f3, f7, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, f5, f6, f7, 1.0f, 1.0f, 0.0f, -1.0f, 0.0f, f2, f6, f7, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, f2, f6, f4, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, f5, f6, f4, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, f2, f6, f7, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, f2, f3, f7, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, f2, f3, f4, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, f2, f6, f4, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, f5, f6, f7, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, f5, f6, f4, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, f5, f3, f4, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, f5, f3, f7, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f};
        int[] iArr = {0, 1, 2, 0, 2, 3, 4, 5, 6, 4, 6, 7, 8, 9, 10, 8, 10, 11, 12, 13, 14, 12, 14, 15, 16, 17, 18, 16, 18, 19, 20, 21, 22, 20, 22, 23};
        float[] fArr2 = new float[72];
        float[] fArr3 = new float[48];
        float[] fArr4 = new float[72];
        for (int i = 0; i < 24; i++) {
            int i2 = i * 8;
            int i3 = i * 3;
            int i4 = i * 2;
            fArr2[i3] = fArr[i2];
            int i5 = i3 + 1;
            fArr2[i5] = fArr[i2 + 1];
            int i6 = i3 + 2;
            fArr2[i6] = fArr[i2 + 2];
            fArr3[i4] = fArr[i2 + 3];
            fArr3[i4 + 1] = fArr[i2 + 4];
            fArr4[i3] = fArr[i2 + 5];
            fArr4[i5] = fArr[i2 + 6];
            fArr4[i6] = fArr[i2 + 7];
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(288).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr2);
        asFloatBuffer.position(0);
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(192).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(fArr3);
        asFloatBuffer2.position(0);
        FloatBuffer asFloatBuffer3 = ByteBuffer.allocateDirect(288).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer3.put(fArr4);
        asFloatBuffer3.position(0);
        IntBuffer asIntBuffer = ByteBuffer.allocateDirect(144).order(ByteOrder.nativeOrder()).asIntBuffer();
        asIntBuffer.put(iArr);
        asIntBuffer.position(0);
        return new zr10(Mesh$PrimitiveMode.TRIANGLES, new ern(asIntBuffer), new r2x0[]{new r2x0(3, asFloatBuffer), new r2x0(2, asFloatBuffer2), new r2x0(3, asFloatBuffer3)});
    }
}
