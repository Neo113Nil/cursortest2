package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a1v implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ a1v(Function0 function0, yci yciVar, boolean z, String str, int i, int i2) {
        this.c = function0;
        this.d = yciVar;
        this.b = z;
        this.e = str;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                a0g.x(rvf.R(this.f | 1), this.g, (hq5) obj, this.d, this.e, this.c, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                o2g.l(rvf.R(this.f | 1), this.g, (hq5) obj, this.d, this.e, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a1v(boolean z, Function0 function0, yci yciVar, String str, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.d = yciVar;
        this.e = str;
        this.f = i;
        this.g = i2;
    }
}
