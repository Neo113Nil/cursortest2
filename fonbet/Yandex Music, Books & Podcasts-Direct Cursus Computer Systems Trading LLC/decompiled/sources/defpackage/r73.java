package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class r73 extends uif implements Function2 {
    public final /* synthetic */ ua5 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(ua5 ua5Var, String str, String str2, yci yciVar, boolean z, int i) {
        super(2);
        this.r = ua5Var;
        this.s = str;
        this.t = str2;
        this.u = yciVar;
        this.v = z;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        quj.e(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
        return Unit.a;
    }
}
