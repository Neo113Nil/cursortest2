package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.asynclayoutinflater.view.a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class tsv {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(Context context, int i, int i2) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(context);
        if (obj == null) {
            obj = new a(context);
            linkedHashMap.put(context, obj);
        }
        a aVar = (a) obj;
        for (int i3 = 0; i3 < i2; i3++) {
            e89 e89Var = new e89(2, context, this);
            LayoutInflater layoutInflater = aVar.a;
            la3 la3Var = aVar.c;
            ka3 ka3Var = (ka3) la3Var.b.a();
            if (ka3Var == null) {
                ka3Var = new ka3();
            }
            ka3Var.a = layoutInflater;
            ka3Var.b = aVar.b;
            ka3Var.c = i;
            ka3Var.e = e89Var;
            try {
                la3Var.a.put(ka3Var);
            } catch (InterruptedException e) {
                ny61.n("Failed to enqueue async inflate request", e);
                return;
            }
        }
    }
}
