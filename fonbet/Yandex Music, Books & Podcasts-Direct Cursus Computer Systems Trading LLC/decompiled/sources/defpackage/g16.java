package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g16 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c26 b;
    public final /* synthetic */ pud c;
    public final /* synthetic */ int d;

    public /* synthetic */ g16(c26 c26Var, pud pudVar, int i, int i2) {
        this.a = i2;
        this.b = c26Var;
        this.c = pudVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                h06 h06Var = this.c.c;
                int i = this.d;
                this.b.u(h06Var, new spd(i, 0, i));
                break;
            case 1:
                h06 h06Var2 = this.c.c;
                int i2 = this.d;
                this.b.u(h06Var2, new spd(i2, 0, i2));
                break;
            case 2:
                h06 h06Var3 = this.c.c;
                int i3 = this.d;
                this.b.u(h06Var3, new spd(i3, 0, i3));
                break;
            case 3:
                h06 h06Var4 = this.c.c;
                int i4 = this.d;
                this.b.u(h06Var4, new spd(i4, 0, i4));
                break;
            default:
                h06 h06Var5 = this.c.c;
                int i5 = this.d;
                this.b.p(h06Var5, new spd(i5, 0, i5));
                break;
        }
        return Unit.a;
    }
}
