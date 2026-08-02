package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class q8f extends s13 {
    public final ftb w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8f(ViewGroup viewGroup) {
        super(viewGroup, R.layout.item_juicy_header_menu);
        viewGroup.getClass();
        View view = this.a;
        view.getClass();
        this.w = new ftb(view);
    }

    @Override // defpackage.s13
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void e(jvd jvdVar) {
        jvdVar.getClass();
        super.e(jvdVar);
        ftb ftbVar = this.w;
        ftbVar.getClass();
        q13 q13Var = ftbVar.a;
        s9f[] s9fVarArr = ftb.e;
        ((TextView) q13Var.a(s9fVarArr[0])).setText(jvdVar.a);
        sht.e((TextView) ftbVar.b.a(s9fVarArr[1]), jvdVar.b);
        qne qneVar = new qne(ftbVar, jvdVar);
        Context context = ftbVar.a().getContext();
        context.getClass();
        pce X = i4w.X(jvdVar.c, context, wct.s());
        X.d = qneVar;
        X.d();
        rce a = X.a();
        l18 l18Var = l18.b;
        bdt I = hag.I(cce.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ((cce) qdcVar.C(I)).d(a);
    }
}
