package m;

import O.C0349t;
import O.InterfaceC0346p;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import o1.C4800d;
import t0.AbstractC4987C;
import t0.AbstractC5000P;
import t0.C4988D;
import t0.C5012h;
import v0.AbstractC5095a;

/* loaded from: classes.dex */
public final class R0 implements l.k, t0.Y {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39127n;

    public /* synthetic */ R0(Object obj) {
        this.f39127n = obj;
    }

    public void a(AbstractC5095a... migrations) {
        kotlin.jvm.internal.h.e(migrations, "migrations");
        for (AbstractC5095a abstractC5095a : migrations) {
            int i = abstractC5095a.f41078a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f39127n;
            Integer valueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i4 = abstractC5095a.f41079b;
            if (treeMap.containsKey(Integer.valueOf(i4))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i4)) + " with " + abstractC5095a);
            }
            treeMap.put(Integer.valueOf(i4), abstractC5095a);
        }
    }

    @Override // t0.Y
    public int b(View view) {
        C4988D c4988d = (C4988D) view.getLayoutParams();
        ((AbstractC4987C) this.f39127n).getClass();
        return (view.getLeft() - ((C4988D) view.getLayoutParams()).f40605b.left) - ((ViewGroup.MarginLayoutParams) c4988d).leftMargin;
    }

    public void c(C4800d c4800d, com.bumptech.glide.manager.n nVar, RunnableC3214fP runnableC3214fP) {
        synchronized (c4800d.f39740w) {
            c4800d.f39731B = true;
        }
        c4800d.a("post-response");
        ((Q2.A) this.f39127n).execute(new E2.x(13, c4800d, nVar, runnableC3214fP));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AbstractC5000P abstractC5000P, C0349t c0349t, C0349t c0349t2) {
        boolean z6;
        RecyclerView recyclerView = (RecyclerView) this.f39127n;
        recyclerView.getClass();
        abstractC5000P.n(false);
        C5012h c5012h = (C5012h) recyclerView.f5221l0;
        if (c0349t != null) {
            c5012h.getClass();
            int i = c0349t.f2221a;
            int i4 = c0349t2.f2221a;
            if (i != i4 || c0349t.f2222b != c0349t2.f2222b) {
                z6 = c5012h.g(abstractC5000P, i, c0349t.f2222b, i4, c0349t2.f2222b);
                if (z6) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c5012h.l(abstractC5000P);
        abstractC5000P.f40643a.setAlpha(0.0f);
        c5012h.i.add(abstractC5000P);
        z6 = true;
        if (z6) {
        }
    }

    @Override // t0.Y
    public int e() {
        return ((AbstractC4987C) this.f39127n).E();
    }

    public void f(AbstractC5000P abstractC5000P, C0349t c0349t, C0349t c0349t2) {
        boolean z6;
        RecyclerView recyclerView = (RecyclerView) this.f39127n;
        recyclerView.f5230u.j(abstractC5000P);
        recyclerView.f(abstractC5000P);
        abstractC5000P.n(false);
        C5012h c5012h = (C5012h) recyclerView.f5221l0;
        c5012h.getClass();
        int i = c0349t.f2221a;
        int i4 = c0349t.f2222b;
        View view = abstractC5000P.f40643a;
        int left = c0349t2 == null ? view.getLeft() : c0349t2.f2221a;
        int top = c0349t2 == null ? view.getTop() : c0349t2.f2222b;
        if (abstractC5000P.h() || (i == left && i4 == top)) {
            c5012h.l(abstractC5000P);
            c5012h.f40730h.add(abstractC5000P);
            z6 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z6 = c5012h.g(abstractC5000P, i, i4, left, top);
        }
        if (z6) {
            recyclerView.S();
        }
    }

    @Override // l.k
    public void h(l.m mVar) {
        Toolbar toolbar = (Toolbar) this.f39127n;
        C4708k c4708k = toolbar.f4579n.f4530M;
        if (c4708k == null || !c4708k.k()) {
            Iterator it = toolbar.f4577k0.f2200b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.F) ((InterfaceC0346p) it.next())).f4792a.s();
            }
        }
        I0.j jVar = toolbar.f4585s0;
        if (jVar != null) {
            jVar.h(mVar);
        }
    }

    @Override // t0.Y
    public int l() {
        AbstractC4987C abstractC4987C = (AbstractC4987C) this.f39127n;
        return abstractC4987C.f40602n - abstractC4987C.F();
    }

    @Override // l.k
    public boolean m(l.m mVar, MenuItem menuItem) {
        I0.j jVar = ((Toolbar) this.f39127n).f4585s0;
        return false;
    }

    @Override // t0.Y
    public View r(int i) {
        return ((AbstractC4987C) this.f39127n).u(i);
    }

    @Override // t0.Y
    public int s(View view) {
        C4988D c4988d = (C4988D) view.getLayoutParams();
        ((AbstractC4987C) this.f39127n).getClass();
        return view.getRight() + ((C4988D) view.getLayoutParams()).f40605b.right + ((ViewGroup.MarginLayoutParams) c4988d).rightMargin;
    }

    public R0(Handler handler) {
        this.f39127n = new Q2.A(4, handler);
    }

    public R0() {
        this.f39127n = new LinkedHashMap();
    }
}
