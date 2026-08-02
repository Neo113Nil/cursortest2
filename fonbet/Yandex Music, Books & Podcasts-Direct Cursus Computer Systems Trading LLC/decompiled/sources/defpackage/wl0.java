package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wl0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ e9b u;
    public final /* synthetic */ vpb v;
    public final /* synthetic */ String w;
    public final /* synthetic */ wn5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl0(boolean z, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.s = z;
        this.t = yciVar;
        this.u = e9bVar;
        this.v = vpbVar;
        this.w = str;
        this.x = wn5Var;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                etn.f(this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1), this.z);
                break;
            default:
                ((Number) obj2).intValue();
                etn.h(this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1), this.z);
                break;
        }
        return Unit.a;
    }
}
