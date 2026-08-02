package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v86 extends ConstraintLayout implements rof {
    public final /* synthetic */ sof q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v86(@NotNull Context context, int i, int i2) {
        super(context, null, i, i2);
        context.getClass();
        sof sofVar = new sof(context, u86.a);
        this.q = sofVar;
        sofVar.c = this;
        q96 q96Var = new q96();
        ox6.D(this);
        q96Var.f(this);
        setConstraintSet(q96Var);
    }

    @Override // defpackage.hdu
    @NotNull
    public Context getCtx() {
        Context context = getContext();
        context.getClass();
        return context;
    }

    @Override // defpackage.rof
    public final void j(View view) {
        view.getClass();
        this.q.j(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v86(@NotNull Context context) {
        this(context, 0, 0);
        context.getClass();
    }
}
