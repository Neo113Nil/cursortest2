package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class l0r implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0r b;
    public final /* synthetic */ frs c;
    public final /* synthetic */ m0r d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ lzs g;
    public final /* synthetic */ e2g h;
    public final /* synthetic */ yci i;
    public final /* synthetic */ int j;

    public /* synthetic */ l0r(p0r p0rVar, frs frsVar, m0r m0rVar, long j, Function0 function0, lzs lzsVar, e2g e2gVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = p0rVar;
        this.c = frsVar;
        this.d = m0rVar;
        this.e = j;
        this.f = function0;
        this.g = lzsVar;
        this.h = e2gVar;
        this.i = yciVar;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hyf.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, rvf.R(this.j | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                hyf.i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, rvf.R(this.j | 1));
                break;
        }
        return Unit.a;
    }
}
