package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import yads.bi0;
import yads.cu;

/* loaded from: classes7.dex */
public final class vp61 implements dpk {
    public final bi61 a;
    public final a471 b;

    public vp61(bi61 bi61Var) {
        a471 a471Var = new a471();
        this.a = bi61Var;
        this.b = a471Var;
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Context context = view.getContext();
        this.b.getClass();
        s071 a = a471.a(egkVar);
        if (a != null) {
            cu cuVar = new cu(context, new bi0(this.a, a));
            view.setOnTouchListener(cuVar);
            view.setOnClickListener(cuVar);
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        this.b.getClass();
        return a471.a(egkVar) != null;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }
}
