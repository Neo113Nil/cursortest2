package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class le8 extends uif implements Function0 {
    public final /* synthetic */ View A;
    public final /* synthetic */ sm8 B;
    public final /* synthetic */ szb C;
    public final /* synthetic */ List r;
    public final /* synthetic */ List s;
    public final /* synthetic */ List t;
    public final /* synthetic */ List u;
    public final /* synthetic */ List v;
    public final /* synthetic */ List w;
    public final /* synthetic */ List x;
    public final /* synthetic */ pe8 y;
    public final /* synthetic */ e23 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le8(List list, List list2, List list3, List list4, List list5, List list6, List list7, pe8 pe8Var, e23 e23Var, View view, sm8 sm8Var, szb szbVar) {
        super(0);
        this.r = list;
        this.s = list2;
        this.t = list3;
        this.u = list4;
        this.v = list5;
        this.w = list6;
        this.x = list7;
        this.y = pe8Var;
        this.z = e23Var;
        this.A = view;
        this.B = sm8Var;
        this.C = szbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024b  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.View$OnHoverListener, android.view.View$OnTouchListener] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r40v10 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r40v8 */
    /* JADX WARN: Type inference failed for: r40v9 */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v20, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        final e23 e23Var;
        final szb szbVar;
        final View view;
        int i;
        View view2;
        View view3;
        Object obj2;
        pe8 pe8Var;
        View view4;
        List list;
        int i2;
        h19 h19Var;
        View view5;
        szb szbVar2;
        View view6;
        ?? r12;
        int i3;
        boolean z;
        Object obj3;
        View view7;
        int i4;
        View view8;
        boolean z2;
        boolean z3;
        ?? r40;
        ?? r6;
        pe8 pe8Var2;
        ne8 ne8Var;
        ?? r62;
        List w;
        List list2 = this.r;
        if (list2 == null) {
            list2 = c5b.a;
        }
        List list3 = list2;
        List list4 = this.s;
        if (list4 == null) {
            list4 = c5b.a;
        }
        List list5 = list4;
        List list6 = this.t;
        if (list6 == null) {
            list6 = c5b.a;
        }
        final List list7 = list6;
        List list8 = this.u;
        if (list8 == null) {
            list8 = c5b.a;
        }
        List list9 = this.v;
        if (list9 == null) {
            list9 = c5b.a;
        }
        final List list10 = list9;
        List list11 = this.w;
        if (list11 == null) {
            list11 = c5b.a;
        }
        List list12 = list11;
        List list13 = this.x;
        if (list13 == null) {
            list13 = c5b.a;
        }
        List list14 = list13;
        final pe8 pe8Var3 = this.y;
        boolean z4 = pe8Var3.e;
        boolean isEmpty = list7.isEmpty();
        final View view9 = this.A;
        h19 h19Var2 = new h19(!isEmpty || q6k.B(view9));
        boolean isEmpty2 = list3.isEmpty();
        boolean z5 = pe8Var3.d;
        boolean isEmpty3 = list7.isEmpty();
        final e23 e23Var2 = this.z;
        final szb szbVar3 = this.C;
        if (isEmpty3) {
            if (!z5 || isEmpty2) {
                view9.setOnLongClickListener(null);
                view9.setLongClickable(false);
            } else if (q6k.B(view9)) {
                final oe8 oe8Var = pe8Var3.f;
                view9.setOnLongClickListener(new View.OnLongClickListener() { // from class: ie8
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view10) {
                        return ((Boolean) oe8Var.invoke(view10)).booleanValue();
                    }
                });
                view9.setTag(R.id.div_penetrating_longtap_tag, Boolean.TRUE);
            } else {
                view9.setOnLongClickListener(null);
                view9.setLongClickable(false);
                view9.setTag(R.id.div_penetrating_longtap_tag, null);
            }
            view2 = view9;
            e23Var = e23Var2;
            szbVar = szbVar3;
        } else {
            final gc8 gc8Var = e23Var2.a;
            final xzb xzbVar = e23Var2.b;
            if (z5) {
                view9.setTag(R.id.div_penetrating_longtap_tag, Boolean.TRUE);
            }
            Iterator it = list7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                List list15 = ((bd8) obj).e;
                if (list15 != null && !list15.isEmpty() && !z4) {
                    break;
                }
            }
            final bd8 bd8Var = (bd8) obj;
            if (bd8Var == null) {
                View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: fe8
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view10) {
                        q6k.h(view10, szbVar3, gc8Var.getInputFocusTracker$div_release(), xzbVar);
                        pe8Var3.a.d(e23Var2, view9, list7, "long_click");
                        return true;
                    }
                };
                e23Var = e23Var2;
                szbVar = szbVar3;
                view = view9;
                view.setOnLongClickListener(onLongClickListener);
            } else {
                e23Var = e23Var2;
                szbVar = szbVar3;
                view = view9;
                List list16 = bd8Var.e;
                if (list16 != null) {
                    gc8 gc8Var2 = e23Var.a;
                    view.getContext();
                    final j6e j6eVar = new j6e(view);
                    j6eVar.b = new vx6((Object) pe8Var3, (Object) e23Var, (Object) list16, false, 7);
                    gc8Var2.y();
                    i = 20;
                    gc8Var2.R(new y9w(i));
                    View.OnLongClickListener onLongClickListener2 = new View.OnLongClickListener() { // from class: ge8
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view10) {
                            String uuid = UUID.randomUUID().toString();
                            pe8 pe8Var4 = pe8.this;
                            ce8 ce8Var = pe8Var4.c;
                            bd8 bd8Var2 = bd8Var;
                            xzb xzbVar2 = xzbVar;
                            ce8Var.b(bd8Var2, xzbVar2);
                            gc8 gc8Var3 = gc8Var;
                            q6k.h(view10, szbVar, gc8Var3.getInputFocusTracker$div_release(), xzbVar2);
                            ol olVar = new ol(27, j6eVar);
                            View view11 = view;
                            olVar.onClick(view11);
                            Iterator it2 = list7.iterator();
                            while (it2.hasNext()) {
                                pe8Var4.b.r(gc8Var3, xzbVar2, view11, (bd8) it2.next(), uuid);
                            }
                            return true;
                        }
                    };
                    View view10 = view;
                    list7 = list7;
                    view10.setOnLongClickListener(onLongClickListener2);
                    view3 = view10;
                    if (list5.isEmpty()) {
                        gc8 gc8Var3 = e23Var.a;
                        xzb xzbVar2 = e23Var.b;
                        Iterator it2 = list5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            List list17 = ((bd8) obj2).e;
                            if (list17 != null && !list17.isEmpty() && !z4) {
                                break;
                            }
                        }
                        bd8 bd8Var2 = (bd8) obj2;
                        if (bd8Var2 == null) {
                            View view11 = view3;
                            pe8Var = pe8Var3;
                            view4 = view11;
                            h19Var2.c = new me8(e23Var, gc8Var3, pe8Var3, szbVar, xzbVar2, view11, list5);
                            list = list8;
                            h19Var = h19Var2;
                            i2 = i;
                        } else {
                            pe8Var = pe8Var3;
                            int i5 = i;
                            view4 = view3;
                            List list18 = bd8Var2.e;
                            if (list18 != null) {
                                gc8 gc8Var4 = e23Var.a;
                                view4.getContext();
                                j6e j6eVar2 = new j6e(view4);
                                list = list8;
                                i2 = i5;
                                h19Var = h19Var2;
                                pe8Var3 = pe8Var;
                                j6eVar2.b = new vx6((Object) pe8Var3, (Object) e23Var, (Object) list18, false, 7);
                                gc8Var4.y();
                                gc8Var4.R(new y9w(i2));
                                me8 me8Var = new me8(pe8Var3, gc8Var3, xzbVar2, view4, bd8Var2, szbVar, j6eVar2, 0);
                                view5 = view4;
                                szbVar2 = szbVar;
                                h19Var.c = me8Var;
                                boolean z6 = list7.isEmpty() || !list5.isEmpty();
                                gc8 gc8Var5 = e23Var.a;
                                xzb xzbVar3 = e23Var.b;
                                int i6 = 22;
                                if (!list3.isEmpty()) {
                                    boolean z7 = true;
                                    r12 = 0;
                                    z3 = false;
                                    r12 = 0;
                                    i3 = 0;
                                    Iterator it3 = list3.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z = z7;
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it3.next();
                                        z = z7;
                                        List list19 = ((bd8) obj3).e;
                                        if (list19 != null && !list19.isEmpty() && !z4) {
                                            break;
                                        }
                                        z7 = z ? 1 : 0;
                                    }
                                    bd8 bd8Var3 = (bd8) obj3;
                                    if (bd8Var3 == null) {
                                        pe8 pe8Var4 = pe8Var3;
                                        e23 e23Var3 = e23Var;
                                        View view12 = view5;
                                        he8 he8Var = new he8(e23Var3, gc8Var5, pe8Var4, szbVar2, xzbVar3, view12, list3);
                                        e23Var = e23Var3;
                                        pe8Var3 = pe8Var4;
                                        view7 = view12;
                                        if (h19Var.c != null) {
                                            h19Var.b = new qs6(i6, he8Var, view7);
                                        } else {
                                            view7.setOnClickListener(he8Var);
                                        }
                                    } else {
                                        szb szbVar4 = szbVar2;
                                        view7 = view5;
                                        List list20 = bd8Var3.e;
                                        if (list20 != null) {
                                            gc8 gc8Var6 = e23Var.a;
                                            view7.getContext();
                                            j6e j6eVar3 = new j6e(view7);
                                            i4 = 0;
                                            j6eVar3.b = new vx6((Object) pe8Var3, (Object) e23Var, (Object) list20, false, 7);
                                            gc8Var6.y();
                                            gc8Var6.R(new y9w(i2));
                                            he8 he8Var2 = new he8(pe8Var3, gc8Var5, xzbVar3, view7, bd8Var3, szbVar4, j6eVar3);
                                            View view13 = view7;
                                            if (h19Var.c != null) {
                                                h19Var.b = new qs6(i6, he8Var2, view13);
                                                r6 = view13;
                                                r40 = z;
                                            } else {
                                                view13.setOnClickListener(he8Var2);
                                                r6 = view13;
                                                r40 = z;
                                            }
                                        }
                                    }
                                    view8 = view7;
                                    z2 = z;
                                    i4 = i3;
                                    r6 = view8;
                                    r12 = z3;
                                    r40 = z2;
                                } else if (z6) {
                                    jl2 jl2Var = new jl2(1, szbVar2, gc8Var5, xzbVar3);
                                    if (h19Var.c != null) {
                                        h19Var.b = new qs6(i6, jl2Var, view5);
                                    } else {
                                        view5.setOnClickListener(jl2Var);
                                    }
                                    r40 = 1;
                                    r12 = 0;
                                    i4 = 0;
                                    r6 = view5;
                                } else {
                                    z3 = false;
                                    h19Var.b = null;
                                    view5.setOnClickListener(null);
                                    i3 = 0;
                                    view5.setClickable(false);
                                    z2 = true;
                                    view8 = view5;
                                    i4 = i3;
                                    r6 = view8;
                                    r12 = z3;
                                    r40 = z2;
                                }
                                List[] listArr = new List[3];
                                listArr[i4] = list3;
                                listArr[r40] = list7;
                                listArr[2] = list5;
                                s30 u = bg3.u(r6, e23Var, !leu.z(listArr) ? this.B : r12, h19Var);
                                if (list12.isEmpty() || !list14.isEmpty()) {
                                    pe8Var2 = pe8Var3;
                                    e23 e23Var4 = e23Var;
                                    e23Var = e23Var4;
                                    ne8Var = new ne8(pe8Var2, e23Var4, r6, list12, list14);
                                } else {
                                    pe8Var2 = pe8Var3;
                                    ne8Var = r12;
                                }
                                if (list.isEmpty() || !list10.isEmpty()) {
                                    final View view14 = r6;
                                    final List list21 = list;
                                    final pe8 pe8Var5 = pe8Var2;
                                    View.OnHoverListener onHoverListener = new View.OnHoverListener() { // from class: ee8
                                        @Override // android.view.View.OnHoverListener
                                        public final boolean onHover(View view15, MotionEvent motionEvent) {
                                            qg8 qg8Var = pe8.this.a;
                                            int action = motionEvent.getAction();
                                            e23 e23Var5 = e23Var;
                                            View view16 = view14;
                                            if (action == 9) {
                                                qg8Var.d(e23Var5, view16, list21, "hover");
                                                return false;
                                            }
                                            if (action != 10) {
                                                return false;
                                            }
                                            qg8Var.d(e23Var5, view16, list10, "unhover");
                                            return false;
                                        }
                                    };
                                    View view15 = view14;
                                    view15.setOnHoverListener(onHoverListener);
                                    r62 = view15;
                                } else {
                                    r6.setOnHoverListener(r12);
                                    r62 = r6;
                                }
                                Function2[] function2Arr = new Function2[2];
                                function2Arr[i4] = u;
                                function2Arr[r40] = ne8Var;
                                w = xz0.w(function2Arr);
                                if (w.isEmpty()) {
                                    r62.setOnTouchListener(r12);
                                } else {
                                    r62.setOnTouchListener(new de8(i4, w));
                                }
                                return Unit.a;
                            }
                            list = list8;
                            i2 = i5;
                            h19Var = h19Var2;
                        }
                        view6 = view4;
                        pe8Var3 = pe8Var;
                    } else {
                        h19Var2.c = null;
                        list = list8;
                        i2 = i;
                        h19Var = h19Var2;
                        view6 = view3;
                    }
                    szbVar2 = szbVar;
                    view5 = view6;
                    if (list7.isEmpty()) {
                    }
                    gc8 gc8Var52 = e23Var.a;
                    xzb xzbVar32 = e23Var.b;
                    int i62 = 22;
                    if (!list3.isEmpty()) {
                    }
                    List[] listArr2 = new List[3];
                    listArr2[i4] = list3;
                    listArr2[r40] = list7;
                    listArr2[2] = list5;
                    s30 u2 = bg3.u(r6, e23Var, !leu.z(listArr2) ? this.B : r12, h19Var);
                    if (list12.isEmpty()) {
                    }
                    pe8Var2 = pe8Var3;
                    e23 e23Var42 = e23Var;
                    e23Var = e23Var42;
                    ne8Var = new ne8(pe8Var2, e23Var42, r6, list12, list14);
                    if (list.isEmpty()) {
                    }
                    final View view142 = r6;
                    final List list212 = list;
                    final pe8 pe8Var52 = pe8Var2;
                    View.OnHoverListener onHoverListener2 = new View.OnHoverListener() { // from class: ee8
                        @Override // android.view.View.OnHoverListener
                        public final boolean onHover(View view152, MotionEvent motionEvent) {
                            qg8 qg8Var = pe8.this.a;
                            int action = motionEvent.getAction();
                            e23 e23Var5 = e23Var;
                            View view16 = view142;
                            if (action == 9) {
                                qg8Var.d(e23Var5, view16, list212, "hover");
                                return false;
                            }
                            if (action != 10) {
                                return false;
                            }
                            qg8Var.d(e23Var5, view16, list10, "unhover");
                            return false;
                        }
                    };
                    View view152 = view142;
                    view152.setOnHoverListener(onHoverListener2);
                    r62 = view152;
                    Function2[] function2Arr2 = new Function2[2];
                    function2Arr2[i4] = u2;
                    function2Arr2[r40] = ne8Var;
                    w = xz0.w(function2Arr2);
                    if (w.isEmpty()) {
                    }
                    return Unit.a;
                }
            }
            view2 = view;
        }
        i = 20;
        view3 = view2;
        if (list5.isEmpty()) {
        }
        szbVar2 = szbVar;
        view5 = view6;
        if (list7.isEmpty()) {
        }
        gc8 gc8Var522 = e23Var.a;
        xzb xzbVar322 = e23Var.b;
        int i622 = 22;
        if (!list3.isEmpty()) {
        }
        List[] listArr22 = new List[3];
        listArr22[i4] = list3;
        listArr22[r40] = list7;
        listArr22[2] = list5;
        s30 u22 = bg3.u(r6, e23Var, !leu.z(listArr22) ? this.B : r12, h19Var);
        if (list12.isEmpty()) {
        }
        pe8Var2 = pe8Var3;
        e23 e23Var422 = e23Var;
        e23Var = e23Var422;
        ne8Var = new ne8(pe8Var2, e23Var422, r6, list12, list14);
        if (list.isEmpty()) {
        }
        final View view1422 = r6;
        final List list2122 = list;
        final pe8 pe8Var522 = pe8Var2;
        View.OnHoverListener onHoverListener22 = new View.OnHoverListener() { // from class: ee8
            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view1522, MotionEvent motionEvent) {
                qg8 qg8Var = pe8.this.a;
                int action = motionEvent.getAction();
                e23 e23Var5 = e23Var;
                View view16 = view1422;
                if (action == 9) {
                    qg8Var.d(e23Var5, view16, list2122, "hover");
                    return false;
                }
                if (action != 10) {
                    return false;
                }
                qg8Var.d(e23Var5, view16, list10, "unhover");
                return false;
            }
        };
        View view1522 = view1422;
        view1522.setOnHoverListener(onHoverListener22);
        r62 = view1522;
        Function2[] function2Arr22 = new Function2[2];
        function2Arr22[i4] = u22;
        function2Arr22[r40] = ne8Var;
        w = xz0.w(function2Arr22);
        if (w.isEmpty()) {
        }
        return Unit.a;
    }
}
