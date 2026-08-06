package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hj0 implements defpackage.hp {
    public final /* synthetic */ defpackage.kj0 P05cfTpS5W5L;
    public boolean WDYagTQQm9ns;
    public long oh71FJcDz6S2 = 9223372034707292159L;
    public long QiMR8OkAhezm = 0;

    public hj0(defpackage.kj0 kj0Var) {
        this.P05cfTpS5W5L = kj0Var;
    }

    public final void ZpBGe2uQfcn8(defpackage.o50 o50Var, float f) {
        defpackage.kj0 kj0Var = this.P05cfTpS5W5L;
        defpackage.qp0 qp0Var = kj0Var.WmetiUbpKU9I;
        if (qp0Var == null) {
            qp0Var = new defpackage.qp0();
            kj0Var.WmetiUbpKU9I = qp0Var;
        }
        int eSwlWMUpitz8 = defpackage.y7.eSwlWMUpitz8((defpackage.o50[]) qp0Var.giKS3J6vZuNy, o50Var);
        if (eSwlWMUpitz8 >= 0) {
            float[] fArr = (float[]) qp0Var.fWTAfUmVKrZq;
            if (fArr[eSwlWMUpitz8] != f) {
                fArr[eSwlWMUpitz8] = f;
                ((byte[]) qp0Var.JhCgjQRTAOCT)[eSwlWMUpitz8] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) qp0Var.JhCgjQRTAOCT;
                if (bArr[eSwlWMUpitz8] == 2) {
                    bArr[eSwlWMUpitz8] = 0;
                    return;
                }
                return;
            }
        }
        int i = qp0Var.ZpBGe2uQfcn8;
        defpackage.o50[] o50VarArr = (defpackage.o50[]) qp0Var.giKS3J6vZuNy;
        if (i == o50VarArr.length) {
            int i2 = i * 2;
            qp0Var.giKS3J6vZuNy = (defpackage.o50[]) java.util.Arrays.copyOf(o50VarArr, i2);
            qp0Var.fWTAfUmVKrZq = java.util.Arrays.copyOf((float[]) qp0Var.fWTAfUmVKrZq, i2);
            qp0Var.JhCgjQRTAOCT = java.util.Arrays.copyOf((byte[]) qp0Var.JhCgjQRTAOCT, i2);
        }
        ((defpackage.o50[]) qp0Var.giKS3J6vZuNy)[i] = o50Var;
        ((byte[]) qp0Var.JhCgjQRTAOCT)[i] = 3;
        ((float[]) qp0Var.fWTAfUmVKrZq)[i] = f;
        qp0Var.ZpBGe2uQfcn8++;
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return this.P05cfTpS5W5L.giKS3J6vZuNy();
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return this.P05cfTpS5W5L.h3m55N1URyyK();
    }
}
