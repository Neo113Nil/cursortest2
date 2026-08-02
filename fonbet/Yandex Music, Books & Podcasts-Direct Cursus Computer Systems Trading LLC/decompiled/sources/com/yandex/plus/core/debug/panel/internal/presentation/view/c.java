package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.f1d;
import defpackage.mxt;
import defpackage.s9f;
import defpackage.v75;
import defpackage.yxm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class c extends ConstraintLayout {
    public static final /* synthetic */ s9f[] z = {new yxm(c.class, "fieldsChoiceRecyclerView", "getFieldsChoiceRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), f1d.c(ern.a, c.class, "shadowView", "getShadowView()Landroid/view/View;", 0), new yxm(c.class, "resetTextView", "getResetTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "confirmTextView", "getConfirmTextView()Landroid/widget/TextView;", 0), new yxm(c.class, "cancelTextView", "getCancelTextView()Landroid/widget/TextView;", 0)};
    public final Function1 q;
    public final Function0 r;
    public final Function0 s;
    public final com.yandex.plus.bdui.plus.content.controller.f t;
    public final mxt u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public final com.yandex.plus.bdui.plus.content.controller.f w;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final com.yandex.plus.bdui.plus.content.controller.f y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull Function2<? super Integer, ? super Boolean, Unit> function2, @NotNull List<com.yandex.plus.core.debug.panel.internal.model.ui.e> list, @NotNull Function1<? super List<Boolean>, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        super(context);
        context.getClass();
        function2.getClass();
        list.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        this.q = function1;
        this.r = function0;
        this.s = function02;
        final int i = 0;
        this.t = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, i));
        mxt mxtVar = new mxt(function2);
        this.u = mxtVar;
        final int i2 = 1;
        this.v = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, i2));
        final int i3 = 2;
        this.w = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, i3));
        final int i4 = 3;
        this.x = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, i4));
        this.y = new com.yandex.plus.bdui.plus.content.controller.f(new b(this, 4));
        r1.p(this, R.layout.plus_debug_panel_view_custom_dialog, true);
        getFieldsChoiceRecyclerView().setAdapter(mxtVar);
        mxtVar.v(list);
        r1.E(getShadowView(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.b.s.invoke();
                        break;
                    case 1:
                        this.b.s.invoke();
                        break;
                    case 2:
                        this.b.r.invoke();
                        break;
                    default:
                        c cVar = this.b;
                        Function1 function12 = cVar.q;
                        List list2 = cVar.u.d.f;
                        list2.getClass();
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boolean.valueOf(((com.yandex.plus.core.debug.panel.internal.model.ui.e) it.next()).b));
                        }
                        function12.invoke(arrayList);
                        break;
                }
            }
        });
        r1.E(getCancelTextView(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.b.s.invoke();
                        break;
                    case 1:
                        this.b.s.invoke();
                        break;
                    case 2:
                        this.b.r.invoke();
                        break;
                    default:
                        c cVar = this.b;
                        Function1 function12 = cVar.q;
                        List list2 = cVar.u.d.f;
                        list2.getClass();
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boolean.valueOf(((com.yandex.plus.core.debug.panel.internal.model.ui.e) it.next()).b));
                        }
                        function12.invoke(arrayList);
                        break;
                }
            }
        });
        r1.E(getResetTextView(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.s.invoke();
                        break;
                    case 1:
                        this.b.s.invoke();
                        break;
                    case 2:
                        this.b.r.invoke();
                        break;
                    default:
                        c cVar = this.b;
                        Function1 function12 = cVar.q;
                        List list2 = cVar.u.d.f;
                        list2.getClass();
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boolean.valueOf(((com.yandex.plus.core.debug.panel.internal.model.ui.e) it.next()).b));
                        }
                        function12.invoke(arrayList);
                        break;
                }
            }
        });
        r1.E(getConfirmTextView(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.b.s.invoke();
                        break;
                    case 1:
                        this.b.s.invoke();
                        break;
                    case 2:
                        this.b.r.invoke();
                        break;
                    default:
                        c cVar = this.b;
                        Function1 function12 = cVar.q;
                        List list2 = cVar.u.d.f;
                        list2.getClass();
                        List list3 = list2;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boolean.valueOf(((com.yandex.plus.core.debug.panel.internal.model.ui.e) it.next()).b));
                        }
                        function12.invoke(arrayList);
                        break;
                }
            }
        });
    }

    private final TextView getCancelTextView() {
        return (TextView) this.y.g(z[4]);
    }

    private final TextView getConfirmTextView() {
        return (TextView) this.x.g(z[3]);
    }

    private final RecyclerView getFieldsChoiceRecyclerView() {
        return (RecyclerView) this.t.g(z[0]);
    }

    private final TextView getResetTextView() {
        return (TextView) this.w.g(z[2]);
    }

    private final View getShadowView() {
        return (View) this.v.g(z[1]);
    }
}
