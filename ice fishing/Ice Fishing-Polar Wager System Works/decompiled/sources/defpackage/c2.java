package defpackage;

/* loaded from: classes.dex */
public final class c2 extends defpackage.o11 implements defpackage.k00 {
    public int AARZUJiTa;
    public /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ defpackage.e2 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(defpackage.e2 e2Var, defpackage.ej ejVar) {
        super(ejVar);
        this.riuEU0zW4 = e2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r13 != r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        if (r13 == r5) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
    @Override // defpackage.v7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.fe1 fe1Var;
        java.lang.Object obj2;
        int i = this.AARZUJiTa;
        defpackage.e2 e2Var = this.riuEU0zW4;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            fe1Var = (defpackage.fe1) this.EXtogiMhuM;
            this.EXtogiMhuM = fe1Var;
            this.AARZUJiTa = 1;
            obj = defpackage.xe1.IHQe1A4L2xu(fe1Var, (r3 & 1) != 0, defpackage.pv0.xiZrDbcSW0, this);
        } else if (i == 1) {
            fe1Var = (defpackage.fe1) this.EXtogiMhuM;
            defpackage.f70.nBH8hAHy(obj);
        } else {
            if (i != 2) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fe1Var = (defpackage.fe1) this.EXtogiMhuM;
            defpackage.f70.nBH8hAHy(obj);
            java.util.List list = ((defpackage.ov0) obj).IHQe1A4L2xu;
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                java.lang.Object obj3 = list.get(i3);
                if (((defpackage.sv0) obj3).F7NU4MC0GW) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (defpackage.c80.G3OKOH3wZRC(((defpackage.sv0) obj2).IHQe1A4L2xu, e2Var.EXtogiMhuM)) {
                    break;
                }
                i2++;
            }
            defpackage.sv0 sv0Var = (defpackage.sv0) obj2;
            if (sv0Var == null) {
                sv0Var = (defpackage.sv0) defpackage.td.gG5uWf3dqScO(arrayList);
            }
            if (sv0Var != null) {
                e2Var.EXtogiMhuM = sv0Var.IHQe1A4L2xu;
                e2Var.oh6vYeIP = sv0Var.r1MBDhnF;
            }
            if (arrayList.isEmpty()) {
                e2Var.EXtogiMhuM = -1L;
                return defpackage.ok1.IHQe1A4L2xu;
            }
            this.EXtogiMhuM = fe1Var;
            this.AARZUJiTa = 2;
            obj = fe1Var.IHQe1A4L2xu(defpackage.pv0.xiZrDbcSW0, this);
        }
        defpackage.sv0 sv0Var2 = (defpackage.sv0) obj;
        e2Var.EXtogiMhuM = sv0Var2.IHQe1A4L2xu;
        e2Var.oh6vYeIP = sv0Var2.r1MBDhnF;
        this.EXtogiMhuM = fe1Var;
        this.AARZUJiTa = 2;
        obj = fe1Var.IHQe1A4L2xu(defpackage.pv0.xiZrDbcSW0, this);
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.c2) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.fe1) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.c2 c2Var = new defpackage.c2(this.riuEU0zW4, ejVar);
        c2Var.EXtogiMhuM = obj;
        return c2Var;
    }
}
