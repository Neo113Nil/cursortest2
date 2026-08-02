package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class gz7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ w4k b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ int f;

    public /* synthetic */ gz7(w4k w4kVar, Function0 function0, String str, yci yciVar, int i) {
        this.b = w4kVar;
        this.c = function0;
        this.d = str;
        this.e = yciVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                nt0.k(rvf.R(this.f | 1), (hq5) obj, this.e, this.b, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                gld.r(rvf.R(this.f | 1), (hq5) obj, this.e, this.b, this.d, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gz7(String str, Function0 function0, yci yciVar, w4k w4kVar, int i) {
        this.d = str;
        this.c = function0;
        this.e = yciVar;
        this.b = w4kVar;
        this.f = i;
    }
}
