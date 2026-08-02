package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class eae extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ w4k s;
    public final /* synthetic */ String t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eae(w4k w4kVar, String str, yci yciVar, long j, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.s = w4kVar;
        this.t = str;
        this.u = yciVar;
        this.v = j;
        this.w = i;
        this.x = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                gae.b(this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1), this.x);
                break;
            default:
                ((Number) obj2).intValue();
                fae.a(this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1), this.x);
                break;
        }
        return Unit.a;
    }
}
