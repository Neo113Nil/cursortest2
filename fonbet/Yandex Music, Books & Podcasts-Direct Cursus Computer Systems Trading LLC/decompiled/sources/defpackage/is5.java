package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ru.yandex.music.ui.view.CompoundImageView;

/* loaded from: classes6.dex */
public final class is5 {
    public Drawable a;
    public final Rect b = new Rect();
    public final String c;
    public ColorFilter d;
    public final /* synthetic */ CompoundImageView e;

    public is5(CompoundImageView compoundImageView, String str) {
        this.e = compoundImageView;
        this.c = str;
        this.a = compoundImageView.getContext().getDrawable(to6.a(compoundImageView.k, compoundImageView.getContext()));
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b.set(i, i2, i3, i4);
        CompoundImageView compoundImageView = this.e;
        Context context = compoundImageView.getContext();
        tfc tfcVar = new tfc(this.c);
        qo6 qo6Var = compoundImageView.k;
        qo6Var.getClass();
        co6 co6Var = new co6(tfcVar, qo6Var, null);
        znk znkVar = new znk(16, this);
        aln alnVar = new aln(compoundImageView);
        context.getClass();
        pce X = i4w.X(co6Var, context, wct.t());
        X.d = znkVar;
        X.d();
        X.x = alnVar;
        X.d();
        rce a = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
    }
}
