package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class vbi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wbi b;

    public /* synthetic */ vbi(wbi wbiVar, int i, int i2) {
        this.a = i2;
        this.b = wbiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.b.d(rvf.R(1), hq5Var);
                break;
            default:
                this.b.c(rvf.R(1), hq5Var);
                break;
        }
        return Unit.a;
    }
}
