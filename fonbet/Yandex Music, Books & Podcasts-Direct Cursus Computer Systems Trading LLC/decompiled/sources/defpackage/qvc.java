package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qvc extends FrameLayout implements rof {
    public final /* synthetic */ sof a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvc(@NotNull Context context, int i, int i2) {
        super(context, null, i, i2);
        context.getClass();
        sof sofVar = new sof(context, pvc.a);
        this.a = sofVar;
        sofVar.c = this;
    }

    public final ViewGroup.LayoutParams a(int i, int i2) {
        return (FrameLayout.LayoutParams) this.a.a(i, i2);
    }

    public final View b(View view, Function1 function1) {
        view.getClass();
        this.a.b(view, function1);
        return view;
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
        this.a.j(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qvc(@NotNull Context context) {
        this(context, 0, 0);
        context.getClass();
    }
}
