package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class uv implements defpackage.rb0 {
    public final java.lang.Enum[] ZpBGe2uQfcn8;
    public final defpackage.ti1 giKS3J6vZuNy;

    public uv(java.lang.String str, java.lang.Enum[] enumArr) {
        this.ZpBGe2uQfcn8 = enumArr;
        this.giKS3J6vZuNy = new defpackage.ti1(new defpackage.S0YpfprlOYIn(10, this, str));
    }

    @Override // defpackage.rb0
    public final void ZpBGe2uQfcn8(defpackage.up0 up0Var, java.lang.Object obj) {
        java.lang.Enum r5 = (java.lang.Enum) obj;
        r5.getClass();
        java.lang.Enum[] enumArr = this.ZpBGe2uQfcn8;
        int eSwlWMUpitz8 = defpackage.y7.eSwlWMUpitz8(enumArr, r5);
        if (eSwlWMUpitz8 != -1) {
            giKS3J6vZuNy().getClass();
            up0Var.h3m55N1URyyK(java.lang.Integer.valueOf(eSwlWMUpitz8));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(r5);
        java.lang.String ZpBGe2uQfcn8 = giKS3J6vZuNy().ZpBGe2uQfcn8();
        java.lang.String arrays = java.util.Arrays.toString(enumArr);
        arrays.getClass();
        sb.append(" is not a valid enum ");
        sb.append(ZpBGe2uQfcn8);
        sb.append(", must be one of ");
        sb.append(arrays);
        throw new defpackage.nc1(sb.toString());
    }

    @Override // defpackage.rb0
    public final defpackage.hc1 giKS3J6vZuNy() {
        return (defpackage.hc1) this.giKS3J6vZuNy.getValue();
    }

    public final java.lang.String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + giKS3J6vZuNy().ZpBGe2uQfcn8() + '>';
    }
}
