package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class s73 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s73(String str, String str2, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = str;
        this.t = str2;
        this.u = yciVar;
        this.v = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                quj.d(rvf.R(this.v | 1), hq5Var, this.u, this.s, this.t);
                break;
            default:
                quj.h(rvf.R(this.v | 1), hq5Var, this.u, this.s, this.t);
                break;
        }
        return Unit.a;
    }
}
