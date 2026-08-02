package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class w07 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ z07 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w07(z07 z07Var, int i) {
        super(0);
        this.r = i;
        this.s = z07Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return new z03(this.s.l);
            default:
                return new j3j(this.s.l);
        }
    }
}
