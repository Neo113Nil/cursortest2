package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a1s extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1s(boolean z, Function0 function0, yci yciVar, boolean z2, Function2 function2, long j, long j2, int i) {
        super(2);
        this.r = z;
        this.s = function0;
        this.t = yciVar;
        this.u = z2;
        this.v = function2;
        this.w = j;
        this.x = j2;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f1s.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1));
        return Unit.a;
    }
}
