package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class uyl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ mm6 d;
    public final /* synthetic */ fvf e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ uyl(Function1 function1, Object obj, mm6 mm6Var, fvf fvfVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = function1;
        this.c = obj;
        this.d = mm6Var;
        this.e = fvfVar;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.invoke(((hcc) this.c).a);
                x97.y(this.d, null, null, new tyl(this.e, this.f, this.g, null, 0), 3);
                break;
            case 1:
                this.b.invoke(((hcc) this.c).a);
                x97.y(this.d, null, null, new tyl(this.e, this.f, this.g, null, 1), 3);
                break;
            default:
                this.b.invoke((n1p) this.c);
                x97.y(this.d, null, null, new tyl(this.e, this.f, this.g, null, 2), 3);
                break;
        }
        return Unit.a;
    }
}
