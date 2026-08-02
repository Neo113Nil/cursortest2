package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class q8m {
    public static void a(g561 g561Var, qam0 qam0Var) {
        qam0Var.invoke();
        ((LinearLayout) g561Var.d.b).animate().alpha(0.0f).y(g561Var.a.getHeight()).setDuration(900L).setUpdateListener(new p8m(g561Var, 0)).start();
        g561Var.b.animate().alpha(0.0f).setDuration(900L).setStartDelay(300L).setUpdateListener(new p8m(g561Var, 1)).start();
        ((LinearLayout) g561Var.c.c).animate().alpha(0.0f).setDuration(900L).setUpdateListener(new p8m(g561Var, 2)).start();
    }

    public final void b(ybm0 ybm0Var, g561 g561Var, qam0 qam0Var) {
        ho4 ho4Var = g561Var.c;
        LinearLayout linearLayout = (LinearLayout) ho4Var.c;
        ArrayList arrayList = ybm0Var.j;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            gc5 gc5Var = (gc5) next;
            if ((gc5Var instanceof fam0 ? (fam0) gc5Var : null) != null) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() < 2) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            List A0 = a.A0(arrayList2, 2);
            Context context = g561Var.a.getContext();
            float d = rje.d(iwg0.ybsdk_savings_dashboard_account_cell_bottom_padding, context);
            linearLayout.setAlpha(0.0f);
            SavingsCardView savingsCardView = (SavingsCardView) ho4Var.d;
            SavingsCardView savingsCardView2 = (SavingsCardView) ho4Var.b;
            linearLayout.setY(g561Var.i.getY());
            savingsCardView2.setBackgroundFetcher(new z2m0());
            savingsCardView.setBackgroundFetcher(new z2m0());
            savingsCardView2.render(((fam0) A0.get(0)).c(context));
            savingsCardView.render(((fam0) A0.get(1)).c(context));
            linearLayout.setVisibility(0);
            linearLayout.post(new m8m(this, g561Var, qam0Var, d, 0));
        }
    }
}
