package defpackage;

import android.view.Surface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class am7 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ dm7 s;
    public final /* synthetic */ Surface t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am7(dm7 dm7Var, Surface surface, int i) {
        super(0);
        this.r = i;
        this.s = dm7Var;
        this.t = surface;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                this.s.a.z(this.t);
                break;
            default:
                this.s.a.h(this.t);
                break;
        }
        return Unit.a;
    }
}
