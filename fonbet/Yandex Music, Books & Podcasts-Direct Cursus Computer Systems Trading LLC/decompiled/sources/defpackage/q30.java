package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q30 extends uif implements Function1 {
    public final /* synthetic */ int r = 2;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(int i, int i2, cpi cpiVar, x0 x0Var) {
        super(1);
        this.s = i;
        this.t = i2;
        this.u = cpiVar;
        this.v = x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r5 == null) goto L14;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object wn7Var;
        switch (this.r) {
            case 0:
                jsk jskVar = (jsk) obj;
                ksk kskVar = (ksk) this.u;
                if (kskVar != null) {
                    jskVar.d(kskVar, 0, this.s, 0.0f);
                }
                ksk kskVar2 = (ksk) this.v;
                if (kskVar2 != null) {
                    jskVar.d(kskVar2, 0, this.t, 0.0f);
                }
                return Unit.a;
            case 1:
                jsk jskVar2 = (jsk) obj;
                ksk[] kskVarArr = (ksk[]) this.u;
                bl0 bl0Var = (bl0) this.v;
                for (ksk kskVar3 : kskVarArr) {
                    if (kskVar3 != null) {
                        long a = bl0Var.a.b.a((kskVar3.a << 32) | (kskVar3.b & 4294967295L), (this.s << 32) | (this.t & 4294967295L), xof.a);
                        jskVar2.d(kskVar3, (int) (a >> 32), (int) (a & 4294967295L), 0.0f);
                    }
                }
                return Unit.a;
            case 2:
                dxe dxeVar = (dxe) obj;
                Function1 key = dxeVar.c.getKey();
                int i = dxeVar.a;
                int max = Math.max(this.s, i);
                int min = Math.min(this.t, (dxeVar.b + i) - 1);
                if (max <= min) {
                    while (true) {
                        if (key != null) {
                            wn7Var = key.invoke(Integer.valueOf(max - i));
                            break;
                        }
                        wn7Var = new wn7(max);
                        ((cpi) this.u).i(max, wn7Var);
                        x0 x0Var = (x0) this.v;
                        ((Object[]) x0Var.d)[max - x0Var.b] = wn7Var;
                        if (max != min) {
                            max++;
                        }
                    }
                }
                return Unit.a;
            default:
                k6e k6eVar = (k6e) obj;
                k6eVar.getClass();
                int read = k6eVar.read((byte[]) this.u, this.s, this.t);
                if (read != -1) {
                    ((ulr) this.v).g += read;
                }
                return Integer.valueOf(read);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(ksk kskVar, int i, ksk kskVar2, int i2) {
        super(1);
        this.u = kskVar;
        this.s = i;
        this.v = kskVar2;
        this.t = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(byte[] bArr, int i, int i2, ulr ulrVar) {
        super(1);
        this.u = bArr;
        this.s = i;
        this.t = i2;
        this.v = ulrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(ksk[] kskVarArr, bl0 bl0Var, int i, int i2) {
        super(1);
        this.u = kskVarArr;
        this.v = bl0Var;
        this.s = i;
        this.t = i2;
    }
}
