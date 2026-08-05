package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k6 extends bb0 implements dl {
    public final /* synthetic */ el OnDfzHZD;
    public j4 P7K7Inc8;
    public int Qr9iLBAD;
    public byte[] b2ZJblxo;
    public int eVhOlqcC;
    public int jb9XjC4I;
    public /* synthetic */ Object k3x7lurq;
    public final /* synthetic */ xg[] ow5vqvCr;
    public final /* synthetic */ yg ygLcUYwZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(g9 g9Var, yg ygVar, el elVar, xg[] xgVarArr) {
        super(2, g9Var);
        this.ow5vqvCr = xgVarArr;
        this.OnDfzHZD = elVar;
        this.ygLcUYwZ = ygVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        if (r11 == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r17.OnDfzHZD.b2ZJblxo(r17.ygLcUYwZ, r10, r17) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d3 -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        byte[] bArr;
        j4 j4Var;
        int i;
        Object[] objArr;
        int i2;
        Object obj2;
        lf lfVar = fn.amk52bBQ;
        int i3 = this.eVhOlqcC;
        u9 u9Var = u9.NCTxEWno;
        if (i3 == 0) {
            fn.SgZGMMPL(obj);
            t9 t9Var = (t9) this.k3x7lurq;
            xg[] xgVarArr = this.ow5vqvCr;
            int length = xgVarArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                int i4 = 0;
                Arrays.fill(objArr2, 0, length, lfVar);
                z2 MdtA4re8 = w30.MdtA4re8(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                int i5 = 0;
                while (i5 < length) {
                    fn.Ey6iv0m0(t9Var, null, new j6(xgVarArr, i5, atomicInteger, MdtA4re8, null), 3);
                    i5++;
                    i4 = i4;
                }
                int i6 = i4;
                bArr = new byte[length];
                j4Var = MdtA4re8;
                i = length;
                objArr = objArr2;
                i2 = i6;
            }
            return xe0.qoPGr6Ce;
        }
        if (i3 == 1) {
            i2 = this.jb9XjC4I;
            i = this.Qr9iLBAD;
            bArr = this.b2ZJblxo;
            j4Var = this.P7K7Inc8;
            objArr = (Object[]) this.k3x7lurq;
            fn.SgZGMMPL(obj);
            obj2 = ((u4) obj).qoPGr6Ce;
            if (obj2 instanceof t4) {
                obj2 = null;
            }
            tm tmVar = (tm) obj2;
            if (tmVar != null) {
                while (true) {
                    int i7 = tmVar.qoPGr6Ce;
                    Object obj3 = objArr[i7];
                    objArr[i7] = tmVar.NCTxEWno;
                    if (obj3 == lfVar) {
                        i--;
                    }
                    if (bArr[i7] != i2) {
                        bArr[i7] = (byte) i2;
                        Object NCTxEWno = j4Var.NCTxEWno();
                        if (NCTxEWno instanceof t4) {
                            NCTxEWno = null;
                        }
                        tmVar = (tm) NCTxEWno;
                        if (tmVar != null) {
                        }
                    }
                    if (i == 0) {
                        this.k3x7lurq = objArr;
                        this.P7K7Inc8 = j4Var;
                        this.b2ZJblxo = bArr;
                        this.Qr9iLBAD = i;
                        this.jb9XjC4I = i2;
                        this.eVhOlqcC = 2;
                    }
                }
                return u9Var;
            }
            return xe0.qoPGr6Ce;
        }
        if (i3 != 2 && i3 != 3) {
            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = this.jb9XjC4I;
        i = this.Qr9iLBAD;
        bArr = this.b2ZJblxo;
        j4Var = this.P7K7Inc8;
        objArr = (Object[]) this.k3x7lurq;
        fn.SgZGMMPL(obj);
        i2 = (byte) (i2 + 1);
        this.k3x7lurq = objArr;
        this.P7K7Inc8 = j4Var;
        this.b2ZJblxo = bArr;
        this.Qr9iLBAD = i;
        this.jb9XjC4I = i2;
        this.eVhOlqcC = 1;
        obj2 = j4Var.ow5vqvCr(this);
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((k6) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        k6 k6Var = new k6(g9Var, this.ygLcUYwZ, this.OnDfzHZD, this.ow5vqvCr);
        k6Var.k3x7lurq = obj;
        return k6Var;
    }
}
