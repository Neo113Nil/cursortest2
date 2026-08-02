package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class px0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ gz2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px0(gz2 gz2Var, int i) {
        super(2);
        this.r = i;
        this.s = gz2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return Integer.valueOf(this.s.a(0, ((Number) obj).intValue(), (xof) obj2));
            default:
                int i = (int) (((hqe) obj).a >> 32);
                return new wpe((this.s.a(0, i, (xof) obj2) << 32) | (0 & 4294967295L));
        }
    }
}
