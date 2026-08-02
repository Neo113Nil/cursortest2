package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class ps2 implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;

    public ps2(rzm rzmVar) {
        this.a = 10;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                x60 x60Var = (x60) this.b.get();
                x60Var.getClass();
                return x60Var;
            case 1:
                ((tbk) this.b.get()).getClass();
                return new fnd();
            case 2:
                yuo yuoVar = (yuo) this.b.get();
                yuoVar.getClass();
                return yuoVar;
            case 3:
                Context context = (Context) this.b.get();
                context.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("flags_preferencese", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 4:
                t23 t23Var = (t23) this.b.get();
                t23Var.getClass();
                return new n23(t23Var);
            case 5:
                bf bfVar = (bf) this.b.get();
                bfVar.getClass();
                return new yf8(bfVar);
            case 6:
                bf bfVar2 = (bf) this.b.get();
                bfVar2.getClass();
                return bfVar2;
            case 7:
                ny6 ny6Var = (ny6) this.b.get();
                ny6Var.getClass();
                return ny6Var;
            case 8:
                k8c k8cVar = (k8c) this.b.get();
                k8cVar.getClass();
                return new n37(k8cVar);
            case 9:
                ahu ahuVar = (ahu) this.b.get();
                ahuVar.getClass();
                return ahuVar;
            case 10:
                ((bxi) this.b.get()).getClass();
                return new ogp();
            case 11:
                bf bfVar3 = (bf) this.b.get();
                bfVar3.getClass();
                return bfVar3;
            case 12:
                bf bfVar4 = (bf) this.b.get();
                bfVar4.getClass();
                return bfVar4;
            case 13:
                ahu ahuVar2 = (ahu) this.b.get();
                ahuVar2.getClass();
                return ahuVar2;
            default:
                ahu ahuVar3 = (ahu) this.b.get();
                ahuVar3.getClass();
                return ahuVar3;
        }
    }

    public /* synthetic */ ps2(Object obj, rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }
}
