package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class sy3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ sy3(int i, int i2, yci yciVar, int i3) {
        this.a = 0;
        this.b = i;
        this.d = i2;
        this.c = yciVar;
        this.e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yci yciVar = (yci) this.c;
                ((Integer) obj2).getClass();
                int R = rvf.R(this.e | 1);
                sj2.d(this.b, this.d, R, (hq5) obj, yciVar);
                break;
            case 1:
                yci yciVar2 = (yci) this.c;
                ((Integer) obj2).getClass();
                int R2 = rvf.R(this.d | 1);
                szf.k(this.b, R2, this.e, (hq5) obj, yciVar2);
                break;
            case 2:
                yci yciVar3 = (yci) this.c;
                ((Integer) obj2).getClass();
                int R3 = rvf.R(this.d | 1);
                a0g.t(this.b, R3, this.e, (hq5) obj, yciVar3);
                break;
            default:
                osj osjVar = (osj) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                osjVar.g(booleanValue, this.b, this.d, this.e, str);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sy3(int i, yci yciVar, int i2, int i3) {
        this.a = 1;
        this.b = i;
        this.c = yciVar;
        this.d = i2;
        this.e = i3;
    }

    public /* synthetic */ sy3(Object obj, int i, int i2, int i3, int i4) {
        this.a = i4;
        this.c = obj;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }
}
