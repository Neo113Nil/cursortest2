package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f7m implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f7m(float f, Function1 function1, Function0 function0, Function0 function02, yci yciVar, uoi uoiVar, int i, int i2) {
        this.b = f;
        this.g = function1;
        this.c = function0;
        this.h = function02;
        this.d = yciVar;
        this.i = uoiVar;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                y7g.c((String) this.g, this.c, this.d, (ges) this.h, (o0k) this.i, this.b, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                q7g.s(this.b, (Function1) this.g, this.c, (Function0) this.h, this.d, (uoi) this.i, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f7m(String str, Function0 function0, yci yciVar, ges gesVar, o0k o0kVar, float f, int i, int i2) {
        this.g = str;
        this.c = function0;
        this.d = yciVar;
        this.h = gesVar;
        this.i = o0kVar;
        this.b = f;
        this.e = i;
        this.f = i2;
    }
}
