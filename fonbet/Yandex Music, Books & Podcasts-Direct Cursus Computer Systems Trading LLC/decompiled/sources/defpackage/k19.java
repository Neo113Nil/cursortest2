package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class k19 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ g23 s;
    public final /* synthetic */ f23 t;
    public final /* synthetic */ v19 u;
    public final /* synthetic */ Drawable v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k19(g23 g23Var, f23 f23Var, v19 v19Var, Drawable drawable, int i) {
        super(0);
        this.r = i;
        this.s = g23Var;
        this.t = f23Var;
        this.u = v19Var;
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
                    this.u.setImage(this.v);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            case 1:
                f23Var = this.t;
                this.s.d();
                try {
                    this.u.setPlaceholder(this.v);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
            default:
                f23Var = this.t;
                this.s.d();
                try {
                    this.u.setPreview(this.v);
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                }
        }
    }
}
