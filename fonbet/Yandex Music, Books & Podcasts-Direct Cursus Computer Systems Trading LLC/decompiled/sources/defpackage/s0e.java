package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class s0e extends zno {
    public final Map H;
    public pqa I;

    public s0e(zi7 zi7Var, gra graVar, cra craVar, Map map) {
        super(zi7Var, graVar, craVar);
        this.H = map;
    }

    @Override // defpackage.zno
    public final dsc m(dsc dscVar) {
        pqa pqaVar;
        pqa pqaVar2 = this.I;
        if (pqaVar2 == null) {
            pqaVar2 = dscVar.r;
        }
        if (pqaVar2 != null && (pqaVar = (pqa) this.H.get(pqaVar2.c)) != null) {
            pqaVar2 = pqaVar;
        }
        u2i u2iVar = dscVar.l;
        u2i u2iVar2 = null;
        if (u2iVar != null) {
            n2i[] n2iVarArr = u2iVar.a;
            int length = n2iVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                n2i n2iVar = n2iVarArr[i2];
                if ((n2iVar instanceof tsm) && "com.apple.streaming.transportStreamTimestamp".equals(((tsm) n2iVar).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    n2i[] n2iVarArr2 = new n2i[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            n2iVarArr2[i < i2 ? i : i - 1] = n2iVarArr[i];
                        }
                        i++;
                    }
                    u2iVar2 = new u2i(n2iVarArr2);
                }
            }
            if (pqaVar2 == dscVar.r || u2iVar != dscVar.l) {
                bsc a = dscVar.a();
                a.q = pqaVar2;
                a.k = u2iVar;
                dscVar = new dsc(a);
            }
            return super.m(dscVar);
        }
        u2iVar = u2iVar2;
        if (pqaVar2 == dscVar.r) {
        }
        bsc a2 = dscVar.a();
        a2.q = pqaVar2;
        a2.k = u2iVar;
        dscVar = new dsc(a2);
        return super.m(dscVar);
    }
}
