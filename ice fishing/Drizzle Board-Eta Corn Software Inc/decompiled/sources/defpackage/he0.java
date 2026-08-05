package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class he0 extends bb0 implements dl {
    public final /* synthetic */ mw[] OnDfzHZD;
    public mw[] P7K7Inc8;
    public md0 Qr9iLBAD;
    public ie0 b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public int k3x7lurq;
    public final /* synthetic */ md0 lDXGDhIF;
    public int ow5vqvCr;
    public final /* synthetic */ ie0 ygLcUYwZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he0(mw[] mwVarArr, ie0 ie0Var, md0 md0Var, g9 g9Var) {
        super(2, g9Var);
        this.OnDfzHZD = mwVarArr;
        this.ygLcUYwZ = ie0Var;
        this.lDXGDhIF = md0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r6.MdtA4re8(r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:10:0x0075). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        int length;
        int i;
        md0 md0Var;
        mw[] mwVarArr;
        int i2;
        ie0 ie0Var;
        int i3 = this.ow5vqvCr;
        if (i3 == 0) {
            fn.SgZGMMPL(obj);
            mw[] mwVarArr2 = this.OnDfzHZD;
            length = mwVarArr2.length;
            i = 0;
            ie0 ie0Var2 = this.ygLcUYwZ;
            md0Var = this.lDXGDhIF;
            mwVarArr = mwVarArr2;
            i2 = 0;
            ie0Var = ie0Var2;
            if (i >= length) {
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.k3x7lurq;
            i = this.eVhOlqcC;
            int i4 = this.jb9XjC4I;
            md0Var = this.Qr9iLBAD;
            ie0Var = this.b2ZJblxo;
            mwVarArr = this.P7K7Inc8;
            fn.SgZGMMPL(obj);
            i2 = i4;
            i++;
            if (i >= length) {
                int i5 = i2 + 1;
                int ordinal = mwVarArr[i].ordinal();
                if (ordinal != 0) {
                    u9 u9Var = u9.NCTxEWno;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new d7();
                        }
                        this.P7K7Inc8 = mwVarArr;
                        this.b2ZJblxo = ie0Var;
                        this.Qr9iLBAD = md0Var;
                        this.jb9XjC4I = i5;
                        this.eVhOlqcC = i;
                        this.k3x7lurq = length;
                        this.ow5vqvCr = 2;
                        if (ie0Var.wxUZMvaN(md0Var, i2, this) != u9Var) {
                            i4 = i5;
                            i2 = i4;
                        }
                        return u9Var;
                    }
                    this.P7K7Inc8 = mwVarArr;
                    this.b2ZJblxo = ie0Var;
                    this.Qr9iLBAD = md0Var;
                    this.jb9XjC4I = i5;
                    this.eVhOlqcC = i;
                    this.k3x7lurq = length;
                    this.ow5vqvCr = 1;
                    i++;
                    if (i >= length) {
                        return xe0.qoPGr6Ce;
                    }
                } else {
                    i2 = i5;
                    i++;
                    if (i >= length) {
                    }
                }
            }
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((he0) lDXGDhIF((g9) obj2, (cz) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new he0(this.OnDfzHZD, this.ygLcUYwZ, this.lDXGDhIF, g9Var);
    }
}
