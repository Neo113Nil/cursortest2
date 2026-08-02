package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class av8 extends p9 {
    public final gp8 b;
    public final dv8 c;
    public final tx8 d;
    public final szm e;

    public av8(gp8 gp8Var, dv8 dv8Var, tx8 tx8Var, szm szmVar) {
        super(gp8Var);
        this.b = gp8Var;
        this.c = dv8Var;
        this.d = tx8Var;
        this.e = szmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void G(av8 av8Var, kv8 kv8Var, View view, yu8 yu8Var, yu8 yu8Var2, e23 e23Var, vh0 vh0Var, ii iiVar) {
        Object obj;
        View view2;
        if (view != null) {
            db8 div = kv8Var.getDiv();
            if (Intrinsics.d(div != null ? div.c.j : null, yu8Var2.j) && yu8Var != null) {
                List list = yu8Var.q;
                if (list == null) {
                    list = c5b.a;
                }
                if (list != null) {
                    int size = list.size();
                    List list2 = yu8Var2.q;
                    if (list2 == null) {
                        list2 = c5b.a;
                    }
                    if (size == list2.size()) {
                        view2 = view;
                        gc8 gc8Var = e23Var.a;
                        if (!Intrinsics.d(view, view2)) {
                            if (kv8Var.getChildCount() != 0) {
                                yd5.R(gc8Var.getReleaseViewVisitor$div_release(), gdg.z(kv8Var, 0));
                                kv8Var.removeViewAt(0);
                            }
                            kv8Var.addView(view2);
                        }
                        synchronized (d51.l) {
                        }
                        if (qht.a.a()) {
                            iiVar.invoke(view2);
                        } else {
                            dq7 dq7Var = ca8.a;
                            x97.D(j5h.a, new nz5((Continuation) null, iiVar, view2, 9));
                        }
                        gp8 gp8Var = av8Var.b;
                        String str = yu8Var2.p;
                        gp8Var.getClass();
                        int a = gc8Var.getViewComponent$div_release().l().a(str);
                        view2.setTag(str);
                        view2.setId(a);
                        av8Var.d.a(gc8Var, e23Var.b, view2, yu8Var2);
                        return;
                    }
                }
            }
        }
        synchronized (d51.l) {
        }
        if (qht.a.a()) {
            View view3 = (View) vh0Var.invoke();
            view3.setTag(R.id.div_custom_tag, yu8Var2);
            obj = view3;
        } else {
            dq7 dq7Var2 = ca8.a;
            obj = x97.D(j5h.a, new nz5((Continuation) null, vh0Var, yu8Var2, 8));
        }
        view2 = (View) obj;
        gc8 gc8Var2 = e23Var.a;
        if (!Intrinsics.d(view, view2)) {
        }
        synchronized (d51.l) {
        }
    }
}
