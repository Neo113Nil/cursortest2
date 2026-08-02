package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nn7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ tn7 c;

    public /* synthetic */ nn7(tn7 tn7Var, ArrayList arrayList, int i) {
        this.a = i;
        this.c = tn7Var;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    tn7 tn7Var = this.c;
                    if (!hasNext) {
                        arrayList.clear();
                        tn7Var.m.remove(arrayList);
                        break;
                    } else {
                        sn7 sn7Var = (sn7) it.next();
                        opn opnVar = sn7Var.a;
                        int i = sn7Var.b;
                        int i2 = sn7Var.c;
                        int i3 = sn7Var.d;
                        int i4 = sn7Var.e;
                        tn7Var.getClass();
                        View view = opnVar.a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        tn7Var.p.add(opnVar);
                        animate.setDuration(tn7Var.e).setListener(new pn7(tn7Var, opnVar, i5, view, i6, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    tn7 tn7Var2 = this.c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        tn7Var2.n.remove(arrayList2);
                        break;
                    } else {
                        rn7 rn7Var = (rn7) it2.next();
                        ArrayList arrayList3 = tn7Var2.r;
                        long j = tn7Var2.f;
                        opn opnVar2 = rn7Var.a;
                        View view2 = opnVar2 == null ? null : opnVar2.a;
                        opn opnVar3 = rn7Var.b;
                        View view3 = opnVar3 != null ? opnVar3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(rn7Var.a);
                            duration.translationX(rn7Var.e - rn7Var.c);
                            duration.translationY(rn7Var.f - rn7Var.d);
                            duration.alpha(0.0f).setListener(new qn7(tn7Var2, rn7Var, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(rn7Var.b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new qn7(tn7Var2, rn7Var, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    tn7 tn7Var3 = this.c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        tn7Var3.l.remove(arrayList4);
                        break;
                    } else {
                        opn opnVar4 = (opn) it3.next();
                        tn7Var3.getClass();
                        View view4 = opnVar4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        tn7Var3.o.add(opnVar4);
                        animate3.alpha(1.0f).setDuration(tn7Var3.c).setListener(new on7(tn7Var3, opnVar4, view4, animate3)).start();
                    }
                }
        }
    }
}
