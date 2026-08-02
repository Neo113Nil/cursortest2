package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class u29 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g23 s;
    public final /* synthetic */ f23 t;
    public final /* synthetic */ i39 u;
    public final /* synthetic */ Drawable v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u29(g23 g23Var, f23 f23Var, i39 i39Var, Drawable drawable, int i) {
        super(0);
        this.r = i;
        this.s = g23Var;
        this.t = f23Var;
        this.u = i39Var;
        this.v = drawable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f23 f23Var;
        switch (this.r) {
            case 0:
                f23Var = this.t;
                this.s.d();
                try {
                    this.u.setImageDrawable(this.v);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            default:
                f23Var = this.t;
                this.s.d();
                try {
                    this.u.setPlaceholder(this.v);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
        }
    }
}
