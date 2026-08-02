package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c1o extends Fragment {
    public final vm7 a;
    public final z6n b;
    public final HashSet c;
    public b1o d;
    public c1o e;
    public Fragment f;

    public c1o() {
        vm7 vm7Var = new vm7();
        this.b = new z6n(3, this);
        this.c = new HashSet();
        this.a = vm7Var;
    }

    public final void a(Activity activity) {
        c1o c1oVar = this.e;
        if (c1oVar != null) {
            c1oVar.c.remove(this);
            this.e = null;
        }
        d1o d1oVar = a.a(activity).e;
        d1oVar.getClass();
        c1o h = d1oVar.h(activity.getFragmentManager(), null);
        this.e = h;
        if (equals(h)) {
            return;
        }
        this.e.c.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.e();
        c1o c1oVar = this.e;
        if (c1oVar != null) {
            c1oVar.c.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        c1o c1oVar = this.e;
        if (c1oVar != null) {
            c1oVar.c.remove(this);
            this.e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        vm7 vm7Var = this.a;
        vm7Var.a = true;
        Iterator it = xut.e((Set) vm7Var.c).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).b();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        vm7 vm7Var = this.a;
        vm7Var.a = false;
        Iterator it = xut.e((Set) vm7Var.c).iterator();
        while (it.hasNext()) {
            ((zyf) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
