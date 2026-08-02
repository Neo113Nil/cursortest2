package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class bjs extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ cjs s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bjs(cjs cjsVar, int i) {
        super(1);
        this.r = i;
        this.s = cjsVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((Number) obj).longValue();
                cjs.a(this.s);
                break;
            default:
                ((Number) obj).longValue();
                cjs.a(this.s);
                break;
        }
        return Unit.a;
    }
}
