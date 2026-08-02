package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class t73 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ List u;
    public final /* synthetic */ long v;
    public final /* synthetic */ yci w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t73(String str, String str2, List list, long j, yci yciVar, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = str;
        this.t = str2;
        this.u = list;
        this.v = j;
        this.w = yciVar;
        this.x = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                quj.f(this.s, this.t, this.u, this.v, this.w, (hq5) obj, rvf.R(this.x | 1));
                break;
            default:
                ((Number) obj2).intValue();
                quj.g(this.s, this.t, this.u, this.v, this.w, (hq5) obj, rvf.R(this.x | 1));
                break;
        }
        return Unit.a;
    }
}
