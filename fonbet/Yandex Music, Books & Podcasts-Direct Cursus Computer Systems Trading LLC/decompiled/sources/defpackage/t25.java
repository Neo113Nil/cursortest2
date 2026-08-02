package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class t25 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm6 b;
    public final /* synthetic */ o3k c;
    public final /* synthetic */ int d;

    public /* synthetic */ t25(mm6 mm6Var, o3k o3kVar, int i, int i2) {
        this.a = i2;
        this.b = mm6Var;
        this.c = o3kVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                x97.y(this.b, null, null, new l71(this.c, this.d, null, 1), 3);
                break;
            default:
                x97.y(this.b, null, null, new l71(this.c, this.d, null, 4), 3);
                break;
        }
        return Unit.a;
    }
}
