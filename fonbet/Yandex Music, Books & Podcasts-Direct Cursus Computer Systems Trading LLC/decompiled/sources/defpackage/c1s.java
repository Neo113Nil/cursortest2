package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c1s extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ wn5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1s(int i, int i2, long j, long j2, wn5 wn5Var, yci yciVar, Function0 function0, boolean z, boolean z2) {
        super(2);
        this.r = z;
        this.s = function0;
        this.t = yciVar;
        this.u = z2;
        this.v = j;
        this.w = j2;
        this.x = wn5Var;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f1s.c(rvf.R(this.y | 1), this.z, this.v, this.w, this.x, (hq5) obj, this.t, this.s, this.r, this.u);
        return Unit.a;
    }
}
