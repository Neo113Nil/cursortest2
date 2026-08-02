package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o1g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ v1g c;
    public final /* synthetic */ w3g d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ o1g(Function0 function0, v1g v1gVar, w3g w3gVar, yci yciVar, boolean z, Function0 function02, int i, int i2, int i3) {
        this.a = i3;
        this.b = function0;
        this.c = v1gVar;
        this.d = w3gVar;
        this.e = yciVar;
        this.f = z;
        this.g = function02;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                p1g.c(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                y1g.d(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
        }
        return Unit.a;
    }
}
