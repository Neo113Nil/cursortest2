package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.post.ui.grid.PostGridItemsActivity;

/* loaded from: classes5.dex */
public final /* synthetic */ class gq2 implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gq2(View view, Function1 function1) {
        this.b = view;
        this.c = (aur) function1;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int c;
        lwg E;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hq2 hq2Var = (hq2) obj2;
                opn opnVar = (opn) obj;
                int i2 = 0;
                if (hq2Var.f != null && (c = opnVar.c()) != -1) {
                    Object obj3 = hq2Var.d.get(c);
                    PostGridItemsActivity postGridItemsActivity = (PostGridItemsActivity) hq2Var.f.b;
                    hqm hqmVar = (hqm) obj3;
                    int i3 = PostGridItemsActivity.H0;
                    fqm fqmVar = hqmVar.a;
                    nu1 nu1Var = hqmVar.b;
                    int D = ouj.D(fqmVar.f());
                    if (D == 0) {
                        E = g0g.E((c01) nu1Var);
                    } else if (D == 1 || D == 2) {
                        oq oqVar = (oq) nu1Var;
                        E = g0g.C(oqVar, (List) oqVar.n.stream().map(new cim(i2)).collect(Collectors.toList()));
                    } else if (D == 4) {
                        E = g0g.G((cvl) nu1Var);
                    } else {
                        xq0.q("Unsupported item type: ".concat(tlm.p(hqmVar.a.f())));
                    }
                    szf.R(postGridItemsActivity.getSupportFragmentManager(), new qvg(E), postGridItemsActivity.r());
                    break;
                }
                break;
            default:
                View view2 = (View) obj2;
                ?? r2 = (aur) obj;
                view2.getClass();
                Context context = view2.getContext();
                context.getClass();
                ComponentCallbacks2 E2 = tt0.E(context);
                dzf dzfVar = E2 instanceof dzf ? (dzf) E2 : null;
                x97.y(dzfVar != null ? wyf.F(dzfVar.getLifecycle()) : cmd.a, null, null, new x77(r2, null, 4), 3);
                break;
        }
        return true;
    }

    public /* synthetic */ gq2(hq2 hq2Var, opn opnVar) {
        this.b = hq2Var;
        this.c = opnVar;
    }
}
