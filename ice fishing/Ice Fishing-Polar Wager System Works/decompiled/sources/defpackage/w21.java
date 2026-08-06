package defpackage;

/* loaded from: classes.dex */
public final class w21 extends defpackage.ja0 {
    public static final defpackage.w21 r1MBDhnF = new defpackage.w21("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int oh6vYeIP;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w21(java.lang.String str, int i) {
        super(str);
        this.oh6vYeIP = i;
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        switch (this.oh6vYeIP) {
            case 0:
                int size = list.size();
                defpackage.ot otVar = defpackage.ot.adDC3e2L;
                if (size == 0) {
                    return ki0Var.EoOhNTTfIN7K(defpackage.ki.SH1y5HwkJhh(j), defpackage.ki.riuEU0zW4(j), otVar, defpackage.vs0.riuEU0zW4);
                }
                if (size == 1) {
                    defpackage.bv0 xiZrDbcSW0 = ((defpackage.di0) list.get(0)).xiZrDbcSW0(j);
                    return ki0Var.EoOhNTTfIN7K(defpackage.li.xiZrDbcSW0(xiZrDbcSW0.adDC3e2L, j), defpackage.li.adDC3e2L(xiZrDbcSW0.xiZrDbcSW0, j), otVar, new defpackage.j0(xiZrDbcSW0, 4));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    defpackage.bv0 xiZrDbcSW02 = ((defpackage.di0) list.get(i3)).xiZrDbcSW0(j);
                    i = java.lang.Math.max(xiZrDbcSW02.adDC3e2L, i);
                    i2 = java.lang.Math.max(xiZrDbcSW02.xiZrDbcSW0, i2);
                    arrayList.add(xiZrDbcSW02);
                }
                return ki0Var.EoOhNTTfIN7K(defpackage.li.xiZrDbcSW0(i, j), defpackage.li.adDC3e2L(i2, j), otVar, new defpackage.v1(2, arrayList));
            default:
                throw new java.lang.IllegalStateException("Undefined measure and it is required");
        }
    }
}
