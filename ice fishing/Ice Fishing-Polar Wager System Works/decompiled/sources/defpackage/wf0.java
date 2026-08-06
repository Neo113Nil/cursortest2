package defpackage;

/* loaded from: classes.dex */
public final class wf0 implements defpackage.qn {
    public final /* synthetic */ defpackage.zf0 EXtogiMhuM;
    public boolean adDC3e2L;
    public long xiZrDbcSW0 = 9223372034707292159L;
    public long AARZUJiTa = 0;

    public wf0(defpackage.zf0 zf0Var) {
        this.EXtogiMhuM = zf0Var;
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        return this.EXtogiMhuM.EXtogiMhuM();
    }

    public final void IHQe1A4L2xu(defpackage.i40 i40Var, float f) {
        defpackage.zf0 zf0Var = this.EXtogiMhuM;
        defpackage.jn0 jn0Var = zf0Var.G3OKOH3wZRC;
        if (jn0Var == null) {
            jn0Var = new defpackage.jn0();
            zf0Var.G3OKOH3wZRC = jn0Var;
        }
        int JcqDrWrgMf = defpackage.t6.JcqDrWrgMf((defpackage.i40[]) jn0Var.oh6vYeIP, i40Var);
        if (JcqDrWrgMf >= 0) {
            float[] fArr = (float[]) jn0Var.r1MBDhnF;
            if (fArr[JcqDrWrgMf] != f) {
                fArr[JcqDrWrgMf] = f;
                ((byte[]) jn0Var.F7NU4MC0GW)[JcqDrWrgMf] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) jn0Var.F7NU4MC0GW;
                if (bArr[JcqDrWrgMf] == 2) {
                    bArr[JcqDrWrgMf] = 0;
                    return;
                }
                return;
            }
        }
        int i = jn0Var.IHQe1A4L2xu;
        defpackage.i40[] i40VarArr = (defpackage.i40[]) jn0Var.oh6vYeIP;
        if (i == i40VarArr.length) {
            int i2 = i * 2;
            jn0Var.oh6vYeIP = (defpackage.i40[]) java.util.Arrays.copyOf(i40VarArr, i2);
            jn0Var.r1MBDhnF = java.util.Arrays.copyOf((float[]) jn0Var.r1MBDhnF, i2);
            jn0Var.F7NU4MC0GW = java.util.Arrays.copyOf((byte[]) jn0Var.F7NU4MC0GW, i2);
        }
        ((defpackage.i40[]) jn0Var.oh6vYeIP)[i] = i40Var;
        ((byte[]) jn0Var.F7NU4MC0GW)[i] = 3;
        ((float[]) jn0Var.r1MBDhnF)[i] = f;
        jn0Var.IHQe1A4L2xu++;
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        return this.EXtogiMhuM.oh6vYeIP();
    }
}
