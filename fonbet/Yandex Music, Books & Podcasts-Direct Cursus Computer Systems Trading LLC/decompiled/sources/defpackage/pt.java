package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pt implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rab b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ pt(rab rabVar, Function0 function0, yci yciVar, boolean z, Function0 function02, int i, int i2) {
        this.b = rabVar;
        this.c = function0;
        this.d = yciVar;
        this.e = z;
        this.f = function02;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                irf.a(rvf.R(this.g | 1), this.h, (hq5) obj, this.b, this.d, this.c, this.f, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                swf.j(rvf.R(this.g | 1), this.h, (hq5) obj, this.b, this.d, this.c, this.f, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pt(Function0 function0, rab rabVar, yci yciVar, Function0 function02, boolean z, int i, int i2) {
        this.c = function0;
        this.b = rabVar;
        this.d = yciVar;
        this.f = function02;
        this.e = z;
        this.g = i;
        this.h = i2;
    }
}
