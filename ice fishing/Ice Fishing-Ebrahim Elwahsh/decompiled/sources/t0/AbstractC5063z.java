package t0;

import O.C0357t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BP;
import com.google.android.gms.internal.ads.C3288h1;
import g1.C4524d;
import java.util.ArrayList;
import m.Q0;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5063z {

    /* renamed from: a, reason: collision with root package name */
    public i8.m f40801a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f40802b;

    /* renamed from: c, reason: collision with root package name */
    public long f40803c;

    /* renamed from: d, reason: collision with root package name */
    public long f40804d;

    /* renamed from: e, reason: collision with root package name */
    public long f40805e;

    /* renamed from: f, reason: collision with root package name */
    public long f40806f;

    public static void b(AbstractC5032P abstractC5032P) {
        RecyclerView recyclerView;
        int i = abstractC5032P.f40623j;
        if (abstractC5032P.f() || (i & 4) != 0 || (recyclerView = abstractC5032P.f40631r) == null) {
            return;
        }
        recyclerView.F(abstractC5032P);
    }

    public abstract boolean a(AbstractC5032P abstractC5032P, AbstractC5032P abstractC5032P2, C0357t c0357t, C0357t c0357t2);

    public final void c(AbstractC5032P abstractC5032P) {
        i8.m mVar = this.f40801a;
        if (mVar != null) {
            boolean z8 = true;
            abstractC5032P.n(true);
            if (abstractC5032P.f40622h != null && abstractC5032P.i == null) {
                abstractC5032P.f40622h = null;
            }
            abstractC5032P.i = null;
            if ((abstractC5032P.f40623j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) mVar.f38384n;
            recyclerView.a0();
            Q0 q02 = recyclerView.f5382x;
            C4524d c4524d = (C4524d) q02.f39325b;
            RecyclerView recyclerView2 = (RecyclerView) c4524d.f37858u;
            View view = abstractC5032P.f40615a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                q02.s(view);
            } else {
                C3288h1 c3288h1 = (C3288h1) q02.f39326c;
                if (c3288h1.f(indexOfChild)) {
                    c3288h1.l(indexOfChild);
                    q02.s(view);
                    c4524d.H(indexOfChild);
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                AbstractC5032P I2 = RecyclerView.I(view);
                BP bp = recyclerView.f5376u;
                bp.j(I2);
                bp.g(I2);
            }
            recyclerView.b0(!z8);
            if (z8 || !abstractC5032P.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(AbstractC5032P abstractC5032P);

    public abstract void e();

    public abstract boolean f();
}
