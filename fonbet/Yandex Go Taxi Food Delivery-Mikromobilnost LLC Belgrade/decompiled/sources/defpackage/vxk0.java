package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class vxk0 {
    public final Context a;
    public final boolean b;
    public final efs0 c;
    public final ArrayList d;
    public final bdc e;
    public final bdc f;
    public final int g;

    public vxk0(Context context, List list, boolean z) {
        this.a = context;
        this.b = z;
        this.c = new efs0();
        this.d = new ArrayList(list);
        this.e = new bdc(xng0.bgMain);
        this.f = new bdc(xng0.cardDivider);
        this.g = tje.r(usg0.round_section_divider_height, context);
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.d;
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (jl40.l(((uxk0) it.next()).e, "RequiredAltChoiceSection")) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            int i2 = 26;
            arrayList2.removeIf(new sdc(i2, new jdk0(i2)));
            arrayList2.addAll(intValue, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0187 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        View view;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List<View> list = ((uxk0) next).a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (View view2 : list) {
                    if (view2.getVisibility() == 0 && (!(view2 instanceof ViewGroup) || ((ViewGroup) view2).getChildCount() > 0)) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        uxk0 uxk0Var = null;
        for (uxk0 uxk0Var2 : a.q0(arrayList)) {
            List list2 = uxk0Var2.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                View view3 = (View) obj;
                if (view3.getVisibility() == 0 && (!(view3 instanceof ViewGroup) || ((ViewGroup) view3).getChildCount() > 0)) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                View view4 = (View) next2;
                boolean z = true;
                if (i <= 0 || i >= arrayList2.size() - 1) {
                    boolean z2 = i == 0 && !uxk0Var2.b;
                    if (i != arrayList2.size() - 1 || ((uxk0Var != null && uxk0Var.b) || (this.b && uxk0Var == null))) {
                        z = false;
                    }
                    boolean z3 = uxk0Var2.c;
                    Context context = this.a;
                    if (z3) {
                        if (z2 && z) {
                            view4.setBackground(vng.t(f1h0.round_section_bg, context));
                        } else if (z2) {
                            view4.setBackground(vng.t(f1h0.round_section_bg_top, context));
                        } else if (z) {
                            view4.setBackground(vng.t(f1h0.round_section_bg_bottom, context));
                        } else {
                            view4.setBackgroundColor(s8o.m(this.e, context));
                        }
                    }
                    if (i == 0 && uxk0Var2.d) {
                        ViewParent parent = view4.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(view4);
                            if (indexOfChild > 0) {
                                int i3 = indexOfChild - 1;
                                if (jl40.l(viewGroup.getChildAt(i3).getTag(), "section_divider")) {
                                    view = viewGroup.getChildAt(i3);
                                    efs0 efs0Var = this.c;
                                    if (!z2 || view == null) {
                                        bdc bdcVar = this.f;
                                        if (!z2 && view == null) {
                                            View b = efs0Var.b(-1);
                                            if (b == null) {
                                                b = new View(context);
                                                b.setLayoutParams(new ViewGroup.LayoutParams(-1, this.g));
                                                b.setBackgroundColor(s8o.m(bdcVar, b.getContext()));
                                                b.setTag("section_divider");
                                            }
                                            viewGroup.addView(b, indexOfChild);
                                        } else if (view == null) {
                                            view.setBackgroundColor(s8o.m(bdcVar, context));
                                        }
                                    } else {
                                        viewGroup.removeView(view);
                                        efs0Var.a(-1, view);
                                    }
                                    i = i2;
                                }
                            }
                            view = null;
                            efs0 efs0Var2 = this.c;
                            if (z2) {
                            }
                            bdc bdcVar2 = this.f;
                            if (!z2) {
                            }
                            if (view == null) {
                            }
                            i = i2;
                        }
                    }
                }
                i = i2;
            }
            uxk0Var = uxk0Var2;
        }
    }

    public /* synthetic */ vxk0(Context context) {
        this(context, EmptyList.a, false);
    }
}
