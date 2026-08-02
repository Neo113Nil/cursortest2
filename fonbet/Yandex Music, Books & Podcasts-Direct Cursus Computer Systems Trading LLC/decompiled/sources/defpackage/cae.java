package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class cae implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ cae(boolean z, Function0 function0, yci yciVar, Function0 function02, boolean z2, int i) {
        this.b = z;
        this.c = function0;
        this.d = yciVar;
        this.e = function02;
        this.f = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xv7.n(rvf.R(1), (hq5) obj, this.d, this.c, this.e, this.b, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                q7g.d(rvf.R(1), (hq5) obj, this.d, this.c, this.e, this.b, this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cae(boolean z, boolean z2, Function0 function0, Function0 function02, yci yciVar, int i) {
        this.b = z;
        this.f = z2;
        this.c = function0;
        this.e = function02;
        this.d = yciVar;
    }
}
