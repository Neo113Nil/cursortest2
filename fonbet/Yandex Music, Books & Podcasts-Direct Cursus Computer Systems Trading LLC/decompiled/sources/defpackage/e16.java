package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e16 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yci b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e16(pud pudVar, c26 c26Var, long j, int i, yci yciVar, int i2) {
        this.f = pudVar;
        this.g = c26Var;
        this.c = j;
        this.d = i;
        this.b = yciVar;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                lg3.u((pud) this.f, (c26) this.g, this.c, this.d, this.b, (hq5) obj, rvf.R(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gdg.g((String) this.f, this.b, this.c, (Function0) this.g, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e16(String str, yci yciVar, long j, Function0 function0, int i, int i2) {
        this.f = str;
        this.b = yciVar;
        this.c = j;
        this.g = function0;
        this.d = i;
        this.e = i2;
    }
}
