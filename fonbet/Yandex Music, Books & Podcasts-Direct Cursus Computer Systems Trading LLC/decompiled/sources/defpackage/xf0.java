package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xf0 extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(yci yciVar, int i, int i2) {
        super(2);
        this.r = yciVar;
        this.s = i;
        this.t = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bg0.b(rvf.R(this.s | 1), this.t, (hq5) obj, this.r);
        return Unit.a;
    }
}
