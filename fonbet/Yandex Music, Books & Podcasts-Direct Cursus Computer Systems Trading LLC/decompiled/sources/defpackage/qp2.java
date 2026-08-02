package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class qp2 implements rzm {
    public final /* synthetic */ int a;
    public final szm b;

    public /* synthetic */ qp2(szm szmVar, int i) {
        this.a = i;
        this.b = szmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                pxf pxfVar = (pxf) this.b.get();
                pxfVar.getClass();
                ugk ugkVar = pxfVar.a;
                int ordinal = ugkVar.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
                    int ordinal2 = ugkVar.ordinal();
                    if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 3 || ordinal2 == 4) {
                        return new ti4(null);
                    }
                    b6e.s();
                } else {
                    b6e.s();
                }
                return null;
            case 1:
                x60 x60Var = (x60) this.b.get();
                x60Var.getClass();
                return x60Var;
            case 2:
                xpi xpiVar = (xpi) this.b.get();
                xpiVar.getClass();
                return xpiVar;
            case 3:
                atj atjVar = (atj) this.b.get();
                atjVar.getClass();
                return atjVar;
            case 4:
                sdk sdkVar = (sdk) this.b.get();
                sdkVar.getClass();
                o9e o9eVar = (o9e) ((rzm) ((tdk) sdkVar).f.P).get();
                a4g.t(o9eVar);
                return o9eVar;
            case 5:
                atj atjVar2 = (atj) this.b.get();
                atjVar2.getClass();
                return atjVar2;
            case 6:
                Context context = (Context) this.b.get();
                context.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("flags_preferencese", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 7:
                bf bfVar = (bf) this.b.get();
                bfVar.getClass();
                return bfVar;
            case 8:
                ny6 ny6Var = (ny6) this.b.get();
                ny6Var.getClass();
                return ny6Var;
            case 9:
                ahu ahuVar = (ahu) this.b.get();
                ahuVar.getClass();
                return ahuVar;
            case 10:
                pxf pxfVar2 = (pxf) this.b.get();
                pxfVar2.getClass();
                return pxfVar2.a();
            case 11:
                return this.b.get();
            case 12:
                Context context2 = (Context) this.b.get();
                context2.getClass();
                return new br1(context2);
            default:
                ((g0c) this.b.get()).getClass();
                return new l3l();
        }
    }

    public /* synthetic */ qp2(Object obj, rzm rzmVar, int i) {
        this.a = i;
        this.b = rzmVar;
    }
}
