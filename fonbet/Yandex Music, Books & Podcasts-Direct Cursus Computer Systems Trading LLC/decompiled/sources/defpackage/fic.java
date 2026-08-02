package defpackage;

import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class fic {
    public final gh7 a;
    public final qne b;
    public FrameLayout c;
    public final o3a d;
    public final at5 e;

    public fic(gh7 gh7Var, dzf dzfVar, qne qneVar, t0a t0aVar) {
        this.a = gh7Var;
        this.b = qneVar;
        this.d = (o3a) t0aVar.invoke();
        at5 at5Var = new at5(24, this);
        this.e = at5Var;
        ViewGroup b = gh7Var.b();
        if (b != null) {
            LinkedHashMap linkedHashMap = gh7Var.a;
            Integer valueOf = Integer.valueOf(b.getId());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(at5Var);
        }
    }

    public final void a(boolean z) {
        qne qneVar = this.b;
        gh7 gh7Var = this.a;
        ViewGroup b = gh7Var.b();
        if (b != null) {
            if (z) {
                TransitionManager.beginDelayedTransition(b, new Fade().setDuration(150L));
                FrameLayout frameLayout = this.c;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            b.removeView(this.c);
            o3a o3aVar = this.d;
            o3aVar.getClass();
            o3aVar.e();
            LinkedHashMap linkedHashMap = gh7Var.a;
            ViewGroup b2 = gh7Var.b();
            List list = (List) linkedHashMap.get(b2 != null ? Integer.valueOf(b2.getId()) : null);
            if (list != null) {
                list.remove(this.e);
            }
            this.c = null;
        }
    }
}
