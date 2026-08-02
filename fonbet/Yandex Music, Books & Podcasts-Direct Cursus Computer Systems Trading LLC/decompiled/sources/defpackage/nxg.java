package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class nxg extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ qxg s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxg(qxg qxgVar, int i, int i2) {
        super(1);
        this.r = i2;
        this.s = qxgVar;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(qxg.a(this.s, this.t, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(qxg.a(this.s, this.t, ((Number) obj).longValue()));
        }
    }
}
