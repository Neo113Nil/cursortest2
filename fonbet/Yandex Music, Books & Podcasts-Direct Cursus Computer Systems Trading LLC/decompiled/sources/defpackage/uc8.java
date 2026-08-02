package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class uc8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ View s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc8(bz2 bz2Var, View view, dp8 dp8Var, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = dp8Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dp8, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                bz2.m(this.s, this.t, bool);
                break;
            default:
                bz2.p(this.s, this.t, (rc8) obj);
                break;
        }
        return Unit.a;
    }
}
