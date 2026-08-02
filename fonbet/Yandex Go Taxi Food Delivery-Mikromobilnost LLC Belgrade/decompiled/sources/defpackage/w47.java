package defpackage;

import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class w47 extends bys {
    public final cx7 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w47(cx7 cx7Var) {
        super(r0, Collections.singletonList(new zxs(r1.a(), 0, r5, EmptyList.a, new he7(1, r2), null)));
        t47 t47Var = new t47(0, cx7Var);
        int i = v47.S;
        g0c a = qoi0.a(oz7.class);
        wk6 wk6Var = new wk6(11);
        wk6 wk6Var2 = new wk6(12);
        this.z = cx7Var;
    }

    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        return jl40.l((oz7) obj, (oz7) obj2);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        return jl40.l(((oz7) obj).a, ((oz7) obj2).a);
    }

    @Override // defpackage.bys
    public final Object l(Object obj, Object obj2) {
        oz7 oz7Var = (oz7) obj;
        oz7 oz7Var2 = (oz7) obj2;
        return (oz7Var.e != oz7Var2.e && jl40.l(oz7Var.a, oz7Var2.a) && jl40.l(oz7Var.d, oz7Var2.d) && jl40.l(oz7Var.b, oz7Var2.b) && jl40.l(oz7Var.c, oz7Var2.c)) ? 1 : 0;
    }

    @Override // defpackage.bys, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: o */
    public final void onBindViewHolder(wys wysVar, int i, List list) {
        oz7 oz7Var = (oz7) getItem(i);
        v47 v47Var = (v47) wysVar;
        if (!list.contains(1)) {
            v47Var.c(oz7Var);
            v47Var.a.setOnClickListener(new k5(11, this, oz7Var));
            return;
        }
        int i2 = u47.a[oz7Var.e.ordinal()];
        ListItemComponent listItemComponent = v47Var.R;
        if (i2 == 1) {
            listItemComponent.startProgressAnimation();
            listItemComponent.setEnabled(false);
        } else {
            listItemComponent.stopProgressAnimation();
            listItemComponent.setEnabled(true);
        }
    }

    @Override // defpackage.bys, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: p */
    public final wys onCreateViewHolder(ViewGroup viewGroup, int i) {
        ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, tje.u(56, listItemComponent.getContext()));
        marginLayoutParams.topMargin = tje.u(4, listItemComponent.getContext());
        listItemComponent.setLayoutParams(marginLayoutParams);
        return new v47(listItemComponent);
    }
}
