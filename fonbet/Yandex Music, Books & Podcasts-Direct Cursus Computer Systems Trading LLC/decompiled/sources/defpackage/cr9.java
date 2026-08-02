package defpackage;

import android.text.method.MovementMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class cr9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d89 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr9(er9 er9Var, d89 d89Var, int i) {
        super(1);
        this.r = i;
        this.s = d89Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    str = "…";
                }
                this.s.setEllipsis(str);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                d89 d89Var = this.s;
                MovementMethod movementMethod = d89Var.getMovementMethod();
                d89Var.setTextIsSelectable(booleanValue);
                if (movementMethod instanceof kdp) {
                    d89Var.setMovementMethod(movementMethod);
                }
                break;
            case 2:
                er9.P(this.s, (e89) obj);
                break;
            case 3:
                this.s.setTightenWidth(((Boolean) obj).booleanValue());
                break;
            default:
                er9.T(this.s, (e89) obj);
                break;
        }
        return Unit.a;
    }
}
