package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class gvc extends bvc {
    @Override // defpackage.bvc
    public final void a(View view, Object obj) {
        ((b8t) obj).e(view);
    }

    @Override // defpackage.bvc
    public final void b(Object obj, ArrayList arrayList) {
        b8t b8tVar = (b8t) obj;
        if (b8tVar == null) {
            return;
        }
        int i = 0;
        if (b8tVar instanceof n8t) {
            n8t n8tVar = (n8t) b8tVar;
            int size = n8tVar.H.size();
            while (i < size) {
                b(n8tVar.X(i), arrayList);
                i++;
            }
            return;
        }
        if (bvc.k(b8tVar.e) && bvc.k(b8tVar.g) && bvc.k(b8tVar.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                b8tVar.e((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.bvc
    public final void c(Object obj) {
        ((w7t) obj).h();
    }

    @Override // defpackage.bvc
    public final void d(Object obj, jt6 jt6Var) {
        w7t w7tVar = (w7t) obj;
        w7tVar.g = jt6Var;
        if (!w7tVar.b) {
            w7tVar.d = 2;
        } else {
            w7tVar.i();
            w7tVar.e.a(0.0f);
        }
    }

    @Override // defpackage.bvc
    public final void e(ViewGroup viewGroup, Object obj) {
        l8t.a(viewGroup, (b8t) obj);
    }

    @Override // defpackage.bvc
    public final boolean g(Object obj) {
        return obj instanceof b8t;
    }

    @Override // defpackage.bvc
    public final Object h(Object obj) {
        if (obj != null) {
            return ((b8t) obj).clone();
        }
        return null;
    }

    @Override // defpackage.bvc
    public final Object i(ViewGroup viewGroup, Object obj) {
        b8t b8tVar = (b8t) obj;
        ArrayList arrayList = l8t.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (b8tVar.y()) {
                arrayList.add(viewGroup);
                b8t clone = b8tVar.clone();
                n8t n8tVar = new n8t();
                n8tVar.W(clone);
                l8t.e(viewGroup, n8tVar);
                viewGroup.setTag(R.id.transition_current_scene, null);
                l8t.d(viewGroup, n8tVar);
                viewGroup.invalidate();
                w7t w7tVar = new w7t(n8tVar);
                n8tVar.B = w7tVar;
                n8tVar.b(w7tVar);
                return n8tVar.B;
            }
            xq0.x("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.bvc
    public final boolean l() {
        return true;
    }

    @Override // defpackage.bvc
    public final boolean m(Object obj) {
        boolean y = ((b8t) obj).y();
        if (!y) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return y;
    }

    @Override // defpackage.bvc
    public final Object n(Object obj, Object obj2, Object obj3) {
        b8t b8tVar = (b8t) obj;
        b8t b8tVar2 = (b8t) obj2;
        b8t b8tVar3 = (b8t) obj3;
        if (b8tVar != null && b8tVar2 != null) {
            n8t n8tVar = new n8t();
            n8tVar.W(b8tVar);
            n8tVar.W(b8tVar2);
            n8tVar.Z(1);
            b8tVar = n8tVar;
        } else if (b8tVar == null) {
            b8tVar = b8tVar2 != null ? b8tVar2 : null;
        }
        if (b8tVar3 == null) {
            return b8tVar;
        }
        n8t n8tVar2 = new n8t();
        if (b8tVar != null) {
            n8tVar2.W(b8tVar);
        }
        n8tVar2.W(b8tVar3);
        return n8tVar2;
    }

    @Override // defpackage.bvc
    public final Object o(Object obj, Object obj2) {
        n8t n8tVar = new n8t();
        if (obj != null) {
            n8tVar.W((b8t) obj);
        }
        n8tVar.W((b8t) obj2);
        return n8tVar;
    }

    @Override // defpackage.bvc
    public final void p(View view, Object obj, ArrayList arrayList) {
        ((b8t) obj).b(new dvc(view, arrayList));
    }

    @Override // defpackage.bvc
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((b8t) obj).b(new evc(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.bvc
    public final void r(Object obj, float f) {
        w7t w7tVar = (w7t) obj;
        boolean z = w7tVar.b;
        if (z) {
            n8t n8tVar = w7tVar.h;
            long j = n8tVar.A;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (w7tVar.e != null) {
                xq0.q("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j3 = w7tVar.a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!w7tVar.c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    n8tVar.L(j2, j3);
                    w7tVar.a = j2;
                }
            }
            w2r w2rVar = w7tVar.f;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (w2rVar.b + 1) % 20;
            w2rVar.b = i;
            ((long[]) w2rVar.c)[i] = currentAnimationTimeMillis;
            ((float[]) w2rVar.d)[i] = j2;
        }
    }

    @Override // defpackage.bvc
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            bvc.j(rect, view);
            ((b8t) obj).N(new cvc(0, rect));
        }
    }

    @Override // defpackage.bvc
    public final void t(Object obj, Rect rect) {
        ((b8t) obj).N(new cvc(1, rect));
    }

    @Override // defpackage.bvc
    public final void u(o oVar, Object obj, hu3 hu3Var, Runnable runnable) {
        v(obj, hu3Var, null, runnable);
    }

    @Override // defpackage.bvc
    public final void v(Object obj, hu3 hu3Var, he0 he0Var, Runnable runnable) {
        b8t b8tVar = (b8t) obj;
        hu3Var.b(new u13(5, he0Var, b8tVar, runnable));
        b8tVar.b(new fvc(runnable));
    }

    @Override // defpackage.bvc
    public final void w(View view, Object obj, ArrayList arrayList) {
        n8t n8tVar = (n8t) obj;
        ArrayList arrayList2 = n8tVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bvc.f(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(n8tVar, arrayList);
    }

    @Override // defpackage.bvc
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        n8t n8tVar = (n8t) obj;
        if (n8tVar != null) {
            ArrayList arrayList3 = n8tVar.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(n8tVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.bvc
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        n8t n8tVar = new n8t();
        n8tVar.W((b8t) obj);
        return n8tVar;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        b8t b8tVar = (b8t) obj;
        int i = 0;
        if (b8tVar instanceof n8t) {
            n8t n8tVar = (n8t) b8tVar;
            int size = n8tVar.H.size();
            while (i < size) {
                z(n8tVar.X(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (bvc.k(b8tVar.e) && bvc.k(b8tVar.g)) {
            ArrayList arrayList3 = b8tVar.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    b8tVar.e((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    b8tVar.I((View) arrayList.get(size3));
                }
            }
        }
    }
}
