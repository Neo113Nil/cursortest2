package defpackage;

/* loaded from: classes.dex */
public final class vt extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.cu AARZUJiTa;
    public final /* synthetic */ defpackage.su EXtogiMhuM;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt(defpackage.cu cuVar, defpackage.su suVar, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = cuVar;
        this.EXtogiMhuM = suVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r9.IHQe1A4L2xu.IHQe1A4L2xu != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r8 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (r1.IHQe1A4L2xu.IHQe1A4L2xu != null) goto L26;
     */
    @Override // defpackage.g00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.tv tvVar;
        defpackage.tv tvVar2;
        int i = this.xiZrDbcSW0;
        defpackage.cu cuVar = this.AARZUJiTa;
        defpackage.st stVar = defpackage.st.AARZUJiTa;
        defpackage.st stVar2 = defpackage.st.xiZrDbcSW0;
        defpackage.st stVar3 = defpackage.st.adDC3e2L;
        float f = 1.0f;
        defpackage.su suVar = this.EXtogiMhuM;
        switch (i) {
            case 0:
                defpackage.hi1 hi1Var = (defpackage.hi1) obj;
                if (hi1Var.IHQe1A4L2xu(stVar3, stVar2)) {
                    defpackage.yu yuVar = cuVar.IHQe1A4L2xu.IHQe1A4L2xu;
                    return (yuVar == null || (tvVar2 = yuVar.IHQe1A4L2xu) == null) ? defpackage.xt.oh6vYeIP : tvVar2;
                }
                if (!hi1Var.IHQe1A4L2xu(stVar2, stVar)) {
                    return defpackage.xt.oh6vYeIP;
                }
                defpackage.yu yuVar2 = suVar.IHQe1A4L2xu.IHQe1A4L2xu;
                return (yuVar2 == null || (tvVar = yuVar2.IHQe1A4L2xu) == null) ? defpackage.xt.oh6vYeIP : tvVar;
            case 1:
                int ordinal = ((defpackage.st) obj).ordinal();
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            defpackage.db.F7NU4MC0GW();
                            return null;
                        }
                        break;
                    }
                    return java.lang.Float.valueOf(f);
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.hi1 hi1Var2 = (defpackage.hi1) obj;
                if (hi1Var2.IHQe1A4L2xu(stVar3, stVar2)) {
                    return defpackage.xt.oh6vYeIP;
                }
                if (!hi1Var2.IHQe1A4L2xu(stVar2, stVar)) {
                    return defpackage.xt.oh6vYeIP;
                }
                defpackage.mi1 mi1Var = suVar.IHQe1A4L2xu;
                return defpackage.xt.oh6vYeIP;
            default:
                int ordinal2 = ((defpackage.st) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        defpackage.db.F7NU4MC0GW();
                        return null;
                    }
                    defpackage.mi1 mi1Var2 = suVar.IHQe1A4L2xu;
                }
                return java.lang.Float.valueOf(1.0f);
        }
    }
}
