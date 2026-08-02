package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class sl3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ sl3(boolean z, yci yciVar, yci yciVar2, long j, long j2, b0g b0gVar, int i, int i2) {
        this.a = 2;
        this.b = z;
        this.d = yciVar;
        this.e = yciVar2;
        this.f = j;
        this.g = j2;
        this.c = b0gVar;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                saf.q(this.b, (Function0) this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                szf.b(this.b, (Function0) this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                a0g.e(this.b, this.d, this.e, this.f, this.g, (b0g) this.c, (hq5) obj, rvf.R(this.h | 1), this.i);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ sl3(boolean z, Function0 function0, yci yciVar, yci yciVar2, long j, long j2, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = function0;
        this.d = yciVar;
        this.e = yciVar2;
        this.f = j;
        this.g = j2;
        this.h = i;
        this.i = i2;
    }
}
