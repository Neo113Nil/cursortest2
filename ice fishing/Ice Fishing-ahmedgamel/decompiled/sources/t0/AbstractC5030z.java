package t0;

import O.C0349t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3404j1;
import com.google.android.gms.internal.ads.C3698oP;
import h.C4543G;
import java.util.ArrayList;
import l.C4659e;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5030z {

    /* renamed from: a, reason: collision with root package name */
    public C4543G f40831a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f40832b;

    /* renamed from: c, reason: collision with root package name */
    public long f40833c;

    /* renamed from: d, reason: collision with root package name */
    public long f40834d;

    /* renamed from: e, reason: collision with root package name */
    public long f40835e;

    /* renamed from: f, reason: collision with root package name */
    public long f40836f;

    public static void b(AbstractC5000P abstractC5000P) {
        RecyclerView recyclerView;
        int i = abstractC5000P.f40651j;
        if (abstractC5000P.f() || (i & 4) != 0 || (recyclerView = abstractC5000P.f40659r) == null) {
            return;
        }
        recyclerView.F(abstractC5000P);
    }

    public abstract boolean a(AbstractC5000P abstractC5000P, AbstractC5000P abstractC5000P2, C0349t c0349t, C0349t c0349t2);

    public final void c(AbstractC5000P abstractC5000P) {
        C4543G c4543g = this.f40831a;
        if (c4543g != null) {
            boolean z6 = true;
            abstractC5000P.n(true);
            if (abstractC5000P.f40650h != null && abstractC5000P.i == null) {
                abstractC5000P.f40650h = null;
            }
            abstractC5000P.i = null;
            if ((abstractC5000P.f40651j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) c4543g.f37843n;
            recyclerView.a0();
            l4.g gVar = recyclerView.f5236x;
            C4659e c4659e = (C4659e) gVar.f38916u;
            RecyclerView recyclerView2 = (RecyclerView) c4659e.f38688u;
            View view = abstractC5000P.f40643a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                gVar.v(view);
            } else {
                C3404j1 c3404j1 = (C3404j1) gVar.f38917v;
                if (c3404j1.f(indexOfChild)) {
                    c3404j1.k(indexOfChild);
                    gVar.v(view);
                    c4659e.A(indexOfChild);
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                AbstractC5000P I8 = RecyclerView.I(view);
                C3698oP c3698oP = recyclerView.f5230u;
                c3698oP.j(I8);
                c3698oP.g(I8);
            }
            recyclerView.b0(!z6);
            if (z6 || !abstractC5000P.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(AbstractC5000P abstractC5000P);

    public abstract void e();

    public abstract boolean f();
}
