package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public abstract class yds extends RecyclerView.Adapter implements e6u0 {
    public boolean A;
    public boolean B;
    public final Lifecycle a;
    public final FragmentManager b;
    public final rnz c = new rnz();
    public final rnz w = new rnz();
    public final rnz x = new rnz();
    public vds y;
    public final rds z;

    public yds(FragmentManager fragmentManager, Lifecycle lifecycle) {
        rds rdsVar = new rds();
        rdsVar.a = new CopyOnWriteArrayList();
        this.z = rdsVar;
        this.A = false;
        this.B = false;
        this.b = fragmentManager;
        this.a = lifecycle;
        super.setHasStableIds(true);
    }

    public static void f(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            ny61.r("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final boolean g(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final void h() {
        rnz rnzVar;
        rnz rnzVar2;
        Fragment fragment;
        View view;
        if (!this.B || this.b.S()) {
            return;
        }
        j63 j63Var = new j63();
        int i = 0;
        while (true) {
            rnzVar = this.c;
            int j = rnzVar.j();
            rnzVar2 = this.x;
            if (i >= j) {
                break;
            }
            long g = rnzVar.g(i);
            if (!g(g)) {
                j63Var.add(Long.valueOf(g));
                rnzVar2.i(g);
            }
            i++;
        }
        if (!this.A) {
            this.B = false;
            for (int i2 = 0; i2 < rnzVar.j(); i2++) {
                long g2 = rnzVar.g(i2);
                if (rnzVar2.e(g2) < 0 && ((fragment = (Fragment) rnzVar.c(g2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    j63Var.add(Long.valueOf(g2));
                }
            }
        }
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            k(((Long) r53Var.next()).longValue());
        }
    }

    public final Long i(int i) {
        int i2 = 0;
        Long l = null;
        while (true) {
            rnz rnzVar = this.x;
            if (i2 >= rnzVar.j()) {
                return l;
            }
            if (((Integer) rnzVar.l(i2)).intValue() == i) {
                if (l != null) {
                    ny61.r("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                l = Long.valueOf(rnzVar.g(i2));
            }
            i2++;
        }
    }

    public final void j(ies iesVar) {
        Fragment fragment = (Fragment) this.c.c(iesVar.x);
        if (fragment == null) {
            ny61.r("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) iesVar.a;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            ny61.r("Design assumption violated.");
            return;
        }
        boolean isAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.b;
        if (isAdded && view == null) {
            fragmentManager.d0(new ods(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                f(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            f(view, frameLayout);
            return;
        }
        if (fragmentManager.S()) {
            if (fragmentManager.L) {
                return;
            }
            this.a.a(new nds(this, iesVar));
            return;
        }
        fragmentManager.d0(new ods(this, fragment, frameLayout), false);
        rds rdsVar = this.z;
        rdsVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = rdsVar.a.iterator();
        while (it.hasNext()) {
            ((xds) it.next()).getClass();
            arrayList.add(xds.a);
        }
        try {
            fragment.setMenuVisibility(false);
            a aVar = new a(fragmentManager);
            aVar.f(0, fragment, "f" + iesVar.x, 1);
            aVar.q(fragment, Lifecycle.State.STARTED);
            aVar.m();
            this.y.b(false);
        } finally {
            rds.b(arrayList);
        }
    }

    public final void k(long j) {
        ViewParent parent;
        rnz rnzVar = this.c;
        Fragment fragment = (Fragment) rnzVar.c(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean g = g(j);
        rnz rnzVar2 = this.w;
        if (!g) {
            rnzVar2.i(j);
        }
        if (!fragment.isAdded()) {
            rnzVar.i(j);
            return;
        }
        FragmentManager fragmentManager = this.b;
        if (fragmentManager.S()) {
            this.B = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        wds wdsVar = xds.a;
        rds rdsVar = this.z;
        if (isAdded && g(j)) {
            rdsVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = rdsVar.a.iterator();
            while (it.hasNext()) {
                ((xds) it.next()).getClass();
                arrayList.add(wdsVar);
            }
            Fragment.SavedState i0 = fragmentManager.i0(fragment);
            rds.b(arrayList);
            rnzVar2.h(j, i0);
        }
        rdsVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = rdsVar.a.iterator();
        while (it2.hasNext()) {
            ((xds) it2.next()).getClass();
            arrayList2.add(wdsVar);
        }
        try {
            a aVar = new a(fragmentManager);
            aVar.p(fragment);
            aVar.m();
            rnzVar.i(j);
        } finally {
            rds.b(arrayList2);
        }
    }

    public final void l(Parcelable parcelable) {
        rnz rnzVar = this.w;
        if (rnzVar.f()) {
            rnz rnzVar2 = this.c;
            if (rnzVar2.f()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long parseLong = Long.parseLong(str.substring(2));
                        FragmentManager fragmentManager = this.b;
                        fragmentManager.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment b = fragmentManager.c.b(string);
                            if (b == null) {
                                fragmentManager.q0(new IllegalStateException(b64.l("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                            fragment = b;
                        }
                        rnzVar2.h(parseLong, fragment);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            ny61.g("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long parseLong2 = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (g(parseLong2)) {
                            rnzVar.h(parseLong2, savedState);
                        }
                    }
                }
                if (rnzVar2.f()) {
                    return;
                }
                this.B = true;
                this.A = true;
                h();
                Handler handler = new Handler(Looper.getMainLooper());
                i8m i8mVar = new i8m(13, this);
                this.a.a(new pds(handler, i8mVar));
                handler.postDelayed(i8mVar, 10000L);
                return;
            }
        }
        ny61.r("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final Bundle m() {
        rnz rnzVar = this.c;
        int j = rnzVar.j();
        rnz rnzVar2 = this.w;
        Bundle bundle = new Bundle(rnzVar2.j() + j);
        for (int i = 0; i < rnzVar.j(); i++) {
            long g = rnzVar.g(i);
            Fragment fragment = (Fragment) rnzVar.c(g);
            if (fragment != null && fragment.isAdded()) {
                this.b.c0(bundle, fragment, qv10.j(g, "f#"));
            }
        }
        for (int i2 = 0; i2 < rnzVar2.j(); i2++) {
            long g2 = rnzVar2.g(i2);
            if (g(g2)) {
                bundle.putParcelable(qv10.j(g2, "s#"), (Parcelable) rnzVar2.c(g2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        d6z.n(this.y == null);
        vds vdsVar = new vds(this);
        this.y = vdsVar;
        vdsVar.d = vds.a(recyclerView);
        sds sdsVar = new sds(vdsVar);
        vdsVar.a = sdsVar;
        vdsVar.d.registerOnPageChangeCallback(sdsVar);
        tds tdsVar = new tds(vdsVar);
        vdsVar.b = tdsVar;
        registerAdapterDataObserver(tdsVar);
        uds udsVar = new uds(vdsVar);
        vdsVar.c = udsVar;
        this.a.a(udsVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ies iesVar = (ies) x0Var;
        long j = iesVar.x;
        FrameLayout frameLayout = (FrameLayout) iesVar.a;
        int id = frameLayout.getId();
        Long i2 = i(id);
        rnz rnzVar = this.x;
        if (i2 != null && i2.longValue() != j) {
            k(i2.longValue());
            rnzVar.i(i2.longValue());
        }
        rnzVar.h(j, Integer.valueOf(id));
        long j2 = i;
        rnz rnzVar2 = this.c;
        if (rnzVar2.e(j2) < 0) {
            s6g0 s6g0Var = (s6g0) this;
            Fragment createFragment = ((FragmentScreen) s6g0Var.D.f.get(i)).createFragment(s6g0Var.C.M());
            s6g0Var.E.put(Integer.valueOf(i), new WeakReference(createFragment));
            createFragment.setInitialSavedState((Fragment.SavedState) this.w.c(j2));
            rnzVar2.h(j2, createFragment);
        }
        if (frameLayout.isAttachedToWindow()) {
            j(iesVar);
        }
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = ies.N;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new ies(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        vds vdsVar = this.y;
        vdsVar.getClass();
        vds.a(recyclerView).unregisterOnPageChangeCallback(vdsVar.a);
        yds ydsVar = vdsVar.f;
        ydsVar.unregisterAdapterDataObserver(vdsVar.b);
        ydsVar.a.d(vdsVar.c);
        vdsVar.d = null;
        this.y = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(x0 x0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(x0 x0Var) {
        j((ies) x0Var);
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        Long i = i(((FrameLayout) ((ies) x0Var).a).getId());
        if (i != null) {
            k(i.longValue());
            this.x.i(i.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
