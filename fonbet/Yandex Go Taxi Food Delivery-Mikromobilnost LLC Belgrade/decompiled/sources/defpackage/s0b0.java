package defpackage;

import android.content.Context;
import androidx.core.app.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.util.List;

/* loaded from: classes10.dex */
public final class s0b0 implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lifecycle.Event b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0b0(Lifecycle.Event event, Object obj, int i) {
        this.a = i;
        this.b = event;
        this.c = obj;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = this.a;
        Object obj = yza0.a;
        Object obj2 = this.c;
        Lifecycle.Event event2 = this.b;
        switch (i) {
            case 0:
                dz40 dz40Var = (dz40) obj2;
                if (event == event2 && !jl40.l(dz40Var.a(), obj)) {
                    Context context = dz40Var.b;
                    String str = dz40Var.a;
                    if (qke.h(context, str) != 0) {
                        obj = new xza0(b.M(dz40Var.c, str));
                    }
                    dz40Var.d.setValue(obj);
                    break;
                }
                break;
            default:
                if (event == event2) {
                    for (dz40 dz40Var2 : (List) obj2) {
                        if (!jl40.l(dz40Var2.a(), obj)) {
                            Context context2 = dz40Var2.b;
                            String str2 = dz40Var2.a;
                            dz40Var2.d.setValue(qke.h(context2, str2) == 0 ? obj : new xza0(b.M(dz40Var2.c, str2)));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
