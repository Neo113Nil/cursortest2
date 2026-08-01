package t0;

import O.C0344t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3381j1;
import com.google.android.gms.internal.ads.C3675oP;
import java.util.ArrayList;
import l.C4648e;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5031z {

    /* renamed from: a, reason: collision with root package name */
    public C4986A f40782a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f40783b;

    /* renamed from: c, reason: collision with root package name */
    public long f40784c;

    /* renamed from: d, reason: collision with root package name */
    public long f40785d;

    /* renamed from: e, reason: collision with root package name */
    public long f40786e;

    /* renamed from: f, reason: collision with root package name */
    public long f40787f;

    public static void b(AbstractC5003S abstractC5003S) {
        RecyclerView recyclerView;
        int i = abstractC5003S.f40601j;
        if (abstractC5003S.f() || (i & 4) != 0 || (recyclerView = abstractC5003S.f40609r) == null) {
            return;
        }
        recyclerView.F(abstractC5003S);
    }

    public abstract boolean a(AbstractC5003S abstractC5003S, AbstractC5003S abstractC5003S2, C0344t c0344t, C0344t c0344t2);

    public final void c(AbstractC5003S abstractC5003S) {
        C4986A c4986a = this.f40782a;
        if (c4986a != null) {
            boolean z3 = true;
            abstractC5003S.n(true);
            if (abstractC5003S.f40600h != null && abstractC5003S.i == null) {
                abstractC5003S.f40600h = null;
            }
            abstractC5003S.i = null;
            if ((abstractC5003S.f40601j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) c4986a.f40533n;
            recyclerView.a0();
            j4.g gVar = recyclerView.f5270x;
            C4648e c4648e = (C4648e) gVar.f38404u;
            RecyclerView recyclerView2 = (RecyclerView) c4648e.f38761u;
            View view = abstractC5003S.f40593a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                gVar.v(view);
            } else {
                C3381j1 c3381j1 = (C3381j1) gVar.f38405v;
                if (c3381j1.e(indexOfChild)) {
                    c3381j1.n(indexOfChild);
                    gVar.v(view);
                    c4648e.o(indexOfChild);
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                AbstractC5003S I8 = RecyclerView.I(view);
                C3675oP c3675oP = recyclerView.f5264u;
                c3675oP.j(I8);
                c3675oP.g(I8);
            }
            recyclerView.b0(!z3);
            if (z3 || !abstractC5003S.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(AbstractC5003S abstractC5003S);

    public abstract void e();

    public abstract boolean f();
}
