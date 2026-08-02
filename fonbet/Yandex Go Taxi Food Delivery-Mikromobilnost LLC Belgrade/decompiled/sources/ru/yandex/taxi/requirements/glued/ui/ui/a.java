package ru.yandex.taxi.requirements.glued.ui.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.i8h;
import defpackage.jgv;
import defpackage.ki9;
import defpackage.pav;
import defpackage.sls;
import defpackage.tt2;
import defpackage.wx31;
import ru.yandex.taxi.requirements.glued.ui.image.i;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class a {
    public final ImageView a;
    public final View b;
    public final ViewGroup c;
    public final i d;

    public a(i8h i8hVar, ImageView imageView, RecyclerView recyclerView, View view, ViewGroup viewGroup, sls slsVar) {
        this.a = imageView;
        this.b = view;
        this.c = viewGroup;
        ki9 ki9Var = i8hVar.a;
        i iVar = new i((pav) ki9Var.a.get(), (tt2) ki9Var.b.get(), (jgv) ki9Var.c.get(), (x) ki9Var.d.get(), (wx31) ki9Var.e.get(), imageView, recyclerView);
        iVar.p = new SolidSummaryCarImageBinder$defaultBinder$1$1(0, this, a.class, "updateImage", "updateImage()V", 0);
        iVar.q = slsVar;
        this.d = iVar;
    }
}
