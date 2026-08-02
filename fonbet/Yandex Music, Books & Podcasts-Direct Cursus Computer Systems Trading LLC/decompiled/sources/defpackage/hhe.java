package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class hhe implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pgt b;
    public final /* synthetic */ ahe c;
    public final /* synthetic */ khe d;
    public final /* synthetic */ yci e;
    public final /* synthetic */ int f;

    public /* synthetic */ hhe(pgt pgtVar, ahe aheVar, khe kheVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = pgtVar;
        this.c = aheVar;
        this.d = kheVar;
        this.e = yciVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                jhe.c(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jhe.h(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1));
                break;
        }
        return Unit.a;
    }
}
