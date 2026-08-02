package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.bumptech.glide.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class psr extends o {
    public final vm7 g;
    public final HashSet h;
    public psr i;

    public psr() {
        vm7 vm7Var = new vm7();
        this.h = new HashSet();
        this.g = vm7Var;
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(Context context) {
        super.onAttach(context);
        o oVar = this;
        while (oVar.getParentFragment() != null) {
            oVar = oVar.getParentFragment();
        }
        y fragmentManager = oVar.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                x(getContext(), fragmentManager);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        super.onDestroy();
        this.g.e();
        psr psrVar = this.i;
        if (psrVar != null) {
            psrVar.h.remove(this);
            this.i = null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        psr psrVar = this.i;
        if (psrVar != null) {
            psrVar.h.remove(this);
            this.i = null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        vm7 vm7Var = this.g;
        vm7Var.a = true;
        Iterator it = xut.e((Set) vm7Var.c).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).b();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        vm7 vm7Var = this.g;
        vm7Var.a = false;
        Iterator it = xut.e((Set) vm7Var.c).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.o
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        o parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    public final void x(Context context, y yVar) {
        psr psrVar = this.i;
        if (psrVar != null) {
            psrVar.h.remove(this);
            this.i = null;
        }
        d1o d1oVar = a.a(context).e;
        HashMap hashMap = d1oVar.c;
        psr psrVar2 = (psr) hashMap.get(yVar);
        if (psrVar2 == null) {
            psr psrVar3 = (psr) yVar.D("com.bumptech.glide.manager");
            if (psrVar3 == null) {
                psrVar3 = new psr();
                hashMap.put(yVar, psrVar3);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.d(0, psrVar3, "com.bumptech.glide.manager", 1);
                aVar.k(true, true);
                d1oVar.d.obtainMessage(2, yVar).sendToTarget();
            }
            psrVar2 = psrVar3;
        }
        this.i = psrVar2;
        if (equals(psrVar2)) {
            return;
        }
        this.i.h.add(this);
    }
}
