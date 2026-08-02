package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e8j extends uif implements Function0 {
    public final /* synthetic */ f8j r;
    public final /* synthetic */ xci s;
    public final /* synthetic */ b8j t;
    public final /* synthetic */ long u;
    public final /* synthetic */ gzd v;
    public final /* synthetic */ int w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8j(f8j f8jVar, xci xciVar, b8j b8jVar, long j, gzd gzdVar, int i, boolean z, float f) {
        super(0);
        this.r = f8jVar;
        this.s = xciVar;
        this.t = b8jVar;
        this.u = j;
        this.v = gzdVar;
        this.w = i;
        this.x = z;
        this.y = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.r.p1(rzf.s(this.s, this.t.s()), this.t, this.u, this.v, this.w, this.x, this.y, false);
        return Unit.a;
    }
}
