package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f16 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c26 b;
    public final /* synthetic */ pud c;
    public final /* synthetic */ int d;
    public final /* synthetic */ m16 e;

    public /* synthetic */ f16(c26 c26Var, pud pudVar, int i, m16 m16Var, int i2) {
        this.a = i2;
        this.b = c26Var;
        this.c = pudVar;
        this.d = i;
        this.e = m16Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        switch (i) {
            case 0:
                str.getClass();
                h06 h06Var = this.c.c;
                int i2 = this.d;
                spd spdVar = new spd(i2, 0, i2);
                this.e.b.size();
                this.b.t(booleanValue, h06Var, spdVar, str);
                break;
            default:
                str.getClass();
                h06 h06Var2 = this.c.c;
                int i3 = this.d;
                spd spdVar2 = new spd(i3, 0, i3);
                this.e.b.size();
                this.b.t(booleanValue, h06Var2, spdVar2, str);
                break;
        }
        return Unit.a;
    }
}
