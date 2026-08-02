package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class eq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qo6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ dup e;
    public final /* synthetic */ klu f;
    public final /* synthetic */ uoi g;
    public final /* synthetic */ yci h;
    public final /* synthetic */ int i;

    public /* synthetic */ eq(String str, qo6 qo6Var, boolean z, dup dupVar, klu kluVar, uoi uoiVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = qo6Var;
        this.d = z;
        this.e = dupVar;
        this.f = kluVar;
        this.g = uoiVar;
        this.h = yciVar;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                rb.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                rb.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, rvf.R(this.i | 1));
                break;
        }
        return Unit.a;
    }
}
