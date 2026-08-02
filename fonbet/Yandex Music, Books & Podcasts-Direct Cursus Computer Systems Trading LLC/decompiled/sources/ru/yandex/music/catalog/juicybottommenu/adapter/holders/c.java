package ru.yandex.music.catalog.juicybottommenu.adapter.holders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.bow;
import defpackage.ch;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fum;
import defpackage.n9s;
import defpackage.q13;
import defpackage.s9f;
import defpackage.vf;
import defpackage.xal;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class c extends ch {
    public static final /* synthetic */ s9f[] y = {new yxm(c.class, "container", "getContainer()Landroid/view/View;", 0), f1d.c(ern.a, c.class, "title", "getTitle()Landroid/widget/TextView;", 0)};
    public final q13 w;
    public final q13 x;

    public c(ViewGroup viewGroup) {
        super(viewGroup, R.layout.item_juicy_catalog_menu);
        View view = this.a;
        view.getClass();
        this.w = new q13(new fum(view, 3));
        View view2 = this.a;
        view2.getClass();
        this.x = new q13(new fum(view2, 4));
    }

    @Override // defpackage.ch
    public final void u(vf vfVar) {
        ((n9s) vfVar).getClass();
        s9f[] s9fVarArr = y;
        ((TextView) this.x.a(s9fVarArr[1])).setText(0);
        ((View) this.w.a(s9fVarArr[0])).setOnClickListener(new xal(10, this));
        View view = this.a;
        view.getClass();
        bow.D(view);
    }
}
