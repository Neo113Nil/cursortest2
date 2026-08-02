package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xl0 extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ e9b t;
    public final /* synthetic */ vpb u;
    public final /* synthetic */ String v;
    public final /* synthetic */ wn5 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(boolean z, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, int i) {
        super(2);
        this.r = z;
        this.s = yciVar;
        this.t = e9bVar;
        this.u = vpbVar;
        this.v = str;
        this.w = wn5Var;
        this.x = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        etn.e(this.r, this.s, this.t, this.u, this.v, this.w, (hq5) obj, rvf.R(this.x | 1));
        return Unit.a;
    }
}
