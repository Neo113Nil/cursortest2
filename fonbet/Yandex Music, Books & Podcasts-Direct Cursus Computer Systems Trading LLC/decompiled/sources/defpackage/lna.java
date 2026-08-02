package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lna extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lna(int i, Function0 function0) {
        super(1);
        this.r = i;
        this.s = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.invoke();
                return Unit.a;
            case 1:
                this.s.invoke();
                return Unit.a;
            case 2:
                long j = ((enj) obj).a;
                this.s.invoke();
                return Unit.a;
            case 3:
                long j2 = ((enj) obj).a;
                this.s.invoke();
                return Unit.a;
            case 4:
                View view = (View) obj;
                view.getClass();
                if (view.getVisibility() == 0) {
                    this.s.invoke();
                }
                return Unit.a;
            case 5:
                View view2 = (View) obj;
                view2.getClass();
                if (view2.getVisibility() == 0) {
                    this.s.invoke();
                }
                return Unit.a;
            case 6:
                return new enj(((enj) this.s.invoke()).a);
            case 7:
                return new wpe(xv.t(eeh.b(((Number) this.s.invoke()).floatValue()), 0));
            default:
                return new enj(((enj) this.s.invoke()).a);
        }
    }
}
