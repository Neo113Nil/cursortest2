package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lightside.slab.SlotView;
import com.yandex.passport.R;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.ldg;
import defpackage.ndu;
import defpackage.q96;
import defpackage.tot;
import defpackage.trq;
import defpackage.wdu;
import defpackage.y86;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class x extends y86 {
    public final RecyclerView d;
    public final ImageView e;
    public final trq f;
    public final TextView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Activity activity, m mVar) {
        super(activity);
        activity.getClass();
        mVar.getClass();
        View view = (View) v.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view);
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(mVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.a));
        this.d = recyclerView;
        View view2 = (View) u.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view2);
        ImageView imageView = (ImageView) view2;
        int i = R.string.passport_roundabout_close_button_description;
        Context context = imageView.getContext();
        context.getClass();
        String string = context.getResources().getString(i);
        string.getClass();
        imageView.setContentDescription(string);
        imageView.setImageResource(R.drawable.passport_roundabout_close);
        imageView.setBackgroundResource(R.drawable.passport_roundabout_ripple_unbound);
        this.e = imageView;
        SlotView slotView = new SlotView(ezf.a0(this.a, 0), null, 0, 0);
        this.b.j(slotView);
        this.f = new trq(slotView);
        View view3 = (View) w.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view3);
        TextView textView = (TextView) view3;
        textView.setText(R.string.passport_accounts_select_text_to_enter);
        textView.setTextSize(16.0f);
        ldg.K(textView, R.color.passport_roundabout_text_primary);
        ldg.J(textView, ru.yandex.music.R.font.ys_text_medium);
        textView.setGravity(17);
        int i2 = (int) (24 * g4i.a.density);
        textView.setPadding(i2, textView.getPaddingTop(), i2, textView.getPaddingBottom());
        this.g = textView;
    }

    @Override // defpackage.y86
    public final void a(q96 q96Var) {
        q96Var.getClass();
        q96Var.w(this.e, new com.yandex.passport.internal.ui.bouncer.error.c(2, q96Var));
        com.yandex.passport.internal.ui.bouncer.error.c cVar = new com.yandex.passport.internal.ui.bouncer.error.c(3, q96Var);
        trq trqVar = this.f;
        trqVar.getClass();
        q96Var.w(trqVar.a, cVar);
        q96Var.w(this.g, new com.yandex.passport.internal.ui.bouncer.error.c(4, q96Var));
        q96Var.w(this.d, new com.yandex.passport.internal.ui.bouncer.o(5, q96Var, this));
    }

    @Override // defpackage.y86
    public final void d(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        tot totVar = new tot(20, constraintLayout);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(constraintLayout, totVar);
    }
}
