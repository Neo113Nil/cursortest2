package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class orq implements srq, mm6, sh {
    public final jbk a;
    public final wqr b;
    public final qrq c;
    public Bundle d;
    public foo e;
    public String f;
    public boolean g;
    public Function0 h;
    public final n3a i;
    public final AtomicInteger j;

    public orq() {
        dq7 dq7Var = ca8.a;
        this.a = new jbk(j5h.a.g);
        this.b = a4g.n();
        this.c = new qrq(this, true);
        this.h = new nrq(0);
        this.i = new n3a();
        this.j = new AtomicInteger();
    }

    @Override // defpackage.srq
    public void a() {
        ((gzf) this.i.b).i(lyf.d);
    }

    @Override // defpackage.srq
    public void b() {
        ((gzf) this.i.b).i(lyf.d);
    }

    @Override // defpackage.srq
    public void c() {
        Function0 rlnVar;
        jbk jbkVar = this.a;
        jbkVar.f = false;
        Iterator it = jbkVar.g.iterator();
        it.getClass();
        while (it.hasNext()) {
            ibk ibkVar = (ibk) it.next();
            it.remove();
            ibkVar.c.F0(ibkVar.a, ibkVar.b);
        }
        i(this.d);
        this.d = null;
        Object context = h().getContext();
        nyf lifecycle = context instanceof dzf ? ((dzf) context).getLifecycle() : null;
        if (lifecycle == null) {
            rlnVar = new nrq(1);
        } else {
            ru2 ru2Var = new ru2(8, this);
            lifecycle.a(ru2Var);
            rlnVar = new rln(22, lifecycle, ru2Var);
        }
        this.h = rlnVar;
    }

    @Override // defpackage.srq
    public void d() {
        this.h.invoke();
        this.a.f = true;
        saf.E(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r0 instanceof android.widget.ScrollView) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View f() {
        ViewGroup viewGroup;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Looper.getMainLooper();
            Looper.myLooper();
        }
        if (!this.g) {
            this.g = true;
            j();
            h().addOnAttachStateChangeListener(this.c);
        }
        View h = h();
        if (h instanceof ViewGroup) {
            viewGroup = (ViewGroup) h;
            if (!(viewGroup instanceof RecyclerView)) {
            }
        }
        viewGroup = null;
        if (h().getId() != -1 && viewGroup != null && this.e == null) {
            Context context = h().getContext();
            context.getClass();
            foo fooVar = new foo(context, this);
            fooVar.setVisibility(8);
            fooVar.setId((h().getId() & 16777215) | 419430400);
            this.e = fooVar;
            viewGroup.addView(fooVar, new ViewGroup.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams m = m(h());
        if (m != null) {
            h().setLayoutParams(m);
        }
        return h();
    }

    public String g() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String e = eta.e();
        this.f = e;
        return e;
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.a.plus(this.b);
    }

    public abstract View h();

    public void j() {
        ((gzf) this.i.b).i(lyf.c);
    }

    public void k() {
        this.b.g(null);
        jbk jbkVar = this.a;
        jbkVar.f = true;
        jbkVar.g.clear();
        ((gzf) this.i.b).i(lyf.a);
    }

    public ViewGroup.LayoutParams m(View view) {
        view.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if ((r2 instanceof android.widget.ScrollView) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View n(View view) {
        ViewGroup viewGroup;
        view.getClass();
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            Looper.getMainLooper();
            Looper.myLooper();
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            xq0.q("viewToReplace must be attached to parent");
            return null;
        }
        if (h() == view) {
            return view;
        }
        if (!this.g) {
            this.g = true;
            j();
            h().addOnAttachStateChangeListener(this.c);
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        int indexOfChild = viewGroup2.indexOfChild(view);
        viewGroup2.removeViewInLayout(view);
        if (view.getId() != -1) {
            h().setId(view.getId());
        }
        View h = h();
        if (h instanceof ViewGroup) {
            viewGroup = (ViewGroup) h;
            if (!(viewGroup instanceof RecyclerView)) {
            }
        }
        viewGroup = null;
        if (view.getId() != -1 && viewGroup != null && this.e == null) {
            Context context = h().getContext();
            context.getClass();
            foo fooVar = new foo(context, this);
            fooVar.setVisibility(8);
            fooVar.setId((view.getId() & 16777215) | 419430400);
            this.e = fooVar;
            viewGroup.addView(fooVar, new ViewGroup.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams m = m(h());
        if (m == null) {
            m = view.getLayoutParams();
        }
        if (m != null) {
            viewGroup2.addView(h(), indexOfChild, m);
        } else {
            viewGroup2.addView(h(), indexOfChild);
        }
        return h();
    }

    @Override // defpackage.srq
    public void onResume() {
        ((gzf) this.i.b).i(lyf.e);
    }

    @Override // defpackage.srq
    public void onStop() {
        ((gzf) this.i.b).i(lyf.c);
    }

    @Override // defpackage.sh
    public final zh registerForActivityResult(uh uhVar, rh rhVar) {
        rrq rrqVar;
        Activity q = o8g.q(h().getContext());
        if (!(q instanceof hn5)) {
            q = null;
        }
        ji jiVar = (hn5) q;
        if (jiVar == null) {
            Context context = h().getContext();
            context.getClass();
            Activity q2 = o8g.q(context);
            t tVar = q2 instanceof t ? (t) q2 : null;
            if (tVar == null) {
                xq0.q("not a fragment activity");
                return null;
            }
            y supportFragmentManager = tVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            o D = supportFragmentManager.D("bricks_hook_fragment");
            if (D instanceof rrq) {
                rrqVar = (rrq) D;
            } else {
                rrqVar = new rrq();
                a aVar = new a(supportFragmentManager);
                aVar.d(0, rrqVar, "bricks_hook_fragment", 1);
                if (aVar.i) {
                    xq0.q("This transaction is already being added to the back stack");
                    return null;
                }
                aVar.j = false;
                aVar.t.A(aVar, true);
            }
            jiVar = rrqVar.requireActivity();
            jiVar.getClass();
        }
        fi activityResultRegistry = jiVar.getActivityResultRegistry();
        activityResultRegistry.getClass();
        return activityResultRegistry.d("slab_" + g() + "_rq#" + this.j.getAndIncrement(), this.i, uhVar, rhVar);
    }

    public void i(Bundle bundle) {
    }

    public void l(Bundle bundle) {
    }
}
