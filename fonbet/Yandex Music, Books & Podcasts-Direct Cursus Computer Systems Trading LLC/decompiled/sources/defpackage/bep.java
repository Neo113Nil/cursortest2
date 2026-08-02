package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bep extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ wn5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bep(yci yciVar, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = yciVar;
        this.t = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                pcg.i(this.s, this.t, hq5Var, rvf.R(49));
                break;
            default:
                tyf.h(this.s, this.t, hq5Var, rvf.R(49));
                break;
        }
        return Unit.a;
    }
}
