package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xk0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk0(int i, Object obj) {
        super(1);
        this.r = i;
        this.s = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                break;
            case 1:
                ((List) obj).add(this.s);
                break;
            case 2:
                ((Unit) obj).getClass();
                break;
            default:
                ((Number) obj).intValue();
                break;
        }
        return this.s;
    }
}
