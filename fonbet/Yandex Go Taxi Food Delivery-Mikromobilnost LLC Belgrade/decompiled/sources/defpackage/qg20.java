package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class qg20 {
    public final ViewGroup a;
    public final imc0 b;
    public final yk c;
    public final yk d;
    public List e;
    public final yo40 f;
    public final ArrayList g;
    public final imc0 h;
    public final tls i;
    public final boolean j;

    public qg20(ViewGroup viewGroup, imc0 imc0Var, tls tlsVar, boolean z) {
        yk ykVar = new yk(13);
        yk ykVar2 = new yk(14);
        this.a = viewGroup;
        this.b = imc0Var;
        this.c = ykVar;
        this.d = ykVar2;
        this.e = EmptyList.a;
        this.f = new yo40(this);
        this.g = new ArrayList();
        this.h = imc0Var;
        this.i = tlsVar;
        this.j = z;
    }

    public static int a(l151 l151Var, Context context) {
        if (l151Var instanceof i151) {
            return -1;
        }
        if (l151Var instanceof j151) {
            return -2;
        }
        if (!(l151Var instanceof k151)) {
            w511.b();
            return 0;
        }
        return ((rkj) ((k151) l151Var).a()).b(context.getResources().getDisplayMetrics()).intValue();
    }

    public final void b(View view) {
        Object tag = view.getTag(cah0.plaque_sdk_micro_widget_view_holder_tag);
        if (tag instanceof drd0) {
            ((drd0) tag).a = true;
        } else {
            ((s59) this.b).l("Has not tag at ".concat(view.getClass().getSimpleName()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(List list) {
        List list2 = this.e;
        this.e = list;
        kp50.f(new dfx(list2, list, this), true).a(this.f);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            drd0 drd0Var = (drd0) arrayList.get(i);
            drd0Var.getClass();
            if (drd0Var.a) {
                n451 n451Var = (n451) drd0Var;
                eg20 eg20Var = (eg20) this.e.get(i);
                boolean z = eg20Var instanceof kf20;
                zy11 zy11Var = zy11.a;
                if (z) {
                    g451 g451Var = n451Var instanceof g451 ? (g451) n451Var : null;
                    if (g451Var != null) {
                        g451Var.b(eg20Var);
                        if (zy11Var == null) {
                            ((s59) this.h).l("Holder " + n451Var + " can't bind " + eg20Var);
                        }
                        if (this.j) {
                            View a = n451Var.a();
                            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                            if (layoutParams == null) {
                                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                return;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.width = a(eg20Var.c().b, n451Var.a().getContext());
                            eg20Var.c().getClass();
                            marginLayoutParams.height = a(j151.a, n451Var.a().getContext());
                            a.setLayoutParams(marginLayoutParams);
                        } else {
                            continue;
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                } else if (eg20Var instanceof of20) {
                    h451 h451Var = n451Var instanceof h451 ? (h451) n451Var : null;
                    if (h451Var != null) {
                        h451Var.b(eg20Var);
                        if (zy11Var == null) {
                        }
                        if (this.j) {
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                } else if (eg20Var instanceof vf20) {
                    j451 j451Var = n451Var instanceof j451 ? (j451) n451Var : null;
                    if (j451Var != null) {
                        j451Var.b(eg20Var);
                        if (zy11Var == null) {
                        }
                        if (this.j) {
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                } else if (eg20Var instanceof yf20) {
                    k451 k451Var = n451Var instanceof k451 ? (k451) n451Var : null;
                    if (k451Var != null) {
                        k451Var.b(eg20Var);
                        if (zy11Var == null) {
                        }
                        if (this.j) {
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                } else if (eg20Var instanceof ag20) {
                    l451 l451Var = n451Var instanceof l451 ? (l451) n451Var : null;
                    if (l451Var != null) {
                        l451Var.b(eg20Var);
                        if (zy11Var == null) {
                        }
                        if (this.j) {
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                } else if (eg20Var instanceof rf20) {
                    i451 i451Var = n451Var instanceof i451 ? (i451) n451Var : null;
                    if (i451Var != null) {
                        i451Var.b(eg20Var);
                        if (zy11Var == null) {
                        }
                        if (this.j) {
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                } else {
                    if (!(eg20Var instanceof if20)) {
                        w511.b();
                        return;
                    }
                    f451 f451Var = n451Var instanceof f451 ? (f451) n451Var : null;
                    if (f451Var != null) {
                        f451Var.b(eg20Var);
                        if (zy11Var == null) {
                        }
                        if (this.j) {
                        }
                    }
                    zy11Var = null;
                    if (zy11Var == null) {
                    }
                    if (this.j) {
                    }
                }
            }
            drd0Var.a = false;
        }
    }
}
