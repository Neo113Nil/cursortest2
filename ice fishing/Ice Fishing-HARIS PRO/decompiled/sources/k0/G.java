package k0;

import O.C0038n;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public B f3373a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3374b;

    /* renamed from: c, reason: collision with root package name */
    public long f3375c;

    /* renamed from: d, reason: collision with root package name */
    public long f3376d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f3377f;

    public static void b(b0 b0Var) {
        RecyclerView recyclerView;
        int i = b0Var.j;
        if (b0Var.h() || (i & 4) != 0 || (recyclerView = b0Var.f3463r) == null) {
            return;
        }
        recyclerView.I(b0Var);
    }

    public abstract boolean a(b0 b0Var, b0 b0Var2, C0038n c0038n, C0038n c0038n2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(b0 b0Var) {
        B b2 = this.f3373a;
        if (b2 != null) {
            boolean z2 = true;
            b0Var.p(true);
            if (b0Var.f3455h != null && b0Var.i == null) {
                b0Var.f3455h = null;
            }
            b0Var.i = null;
            if ((b0Var.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = b2.f3369a;
            recyclerView.i0();
            C0190d c0190d = recyclerView.f2148f;
            C0189c c0189c = c0190d.f3470b;
            B b3 = c0190d.f3469a;
            int i = c0190d.f3472d;
            View view = b0Var.f3449a;
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                try {
                    c0190d.f3472d = 2;
                    int indexOfChild = b3.f3369a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        c0190d.j(view);
                    } else if (c0189c.d(indexOfChild)) {
                        c0189c.f(indexOfChild);
                        c0190d.j(view);
                        b3.h(indexOfChild);
                    }
                    if (z2) {
                        b0 L2 = RecyclerView.L(view);
                        Q q2 = recyclerView.f2143c;
                        q2.l(L2);
                        q2.i(L2);
                        if (RecyclerView.f2109A0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.j0(!z2);
                    if (z2 && b0Var.l()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } finally {
                    c0190d.f3472d = 0;
                }
            }
            if (c0190d.e != view) {
                throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
            }
            z2 = false;
            if (z2) {
            }
            recyclerView.j0(!z2);
            if (z2) {
            }
        }
    }

    public abstract void d(b0 b0Var);

    public abstract void e();

    public abstract boolean f();
}
