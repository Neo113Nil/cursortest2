package ru.yandex.music.novelties.podcasts;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import defpackage.bdt;
import defpackage.ern;
import defpackage.eup;
import defpackage.f1d;
import defpackage.ff7;
import defpackage.h1b;
import defpackage.h5;
import defpackage.hag;
import defpackage.jyr;
import defpackage.k8w;
import defpackage.l18;
import defpackage.o8f;
import defpackage.q13;
import defpackage.rvf;
import defpackage.s9f;
import defpackage.t0f;
import defpackage.t3g;
import defpackage.x9e;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class a extends t0f {
    public static final /* synthetic */ s9f[] H = {new yxm(a.class, "root", "getRoot()Landroid/view/View;", 0), f1d.c(ern.a, a.class, "cover", "getCover()Lru/yandex/music/ui/view/SquaredByWidthShapeableImageView;", 0), new yxm(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new yxm(a.class, "explicitMark", "getExplicitMark()Lru/yandex/music/ui/view/IcExplicitView;", 0), new yxm(a.class, "placeView", "getPlaceView()Landroid/widget/TextView;", 0), new yxm(a.class, "positionBlock", "getPositionBlock()Landroid/widget/LinearLayout;", 0), new yxm(a.class, "iconView", "getIconView()Landroid/widget/ImageView;", 0), new yxm(a.class, "plusBadgeView", "getPlusBadgeView()Landroid/widget/ImageView;", 0)};
    public final q13 A;
    public final q13 B;
    public final q13 C;
    public final q13 D;
    public final jyr E;
    public final jyr F;
    public final eup G;
    public final q13 v;
    public final q13 w;
    public final q13 x;
    public final q13 y;
    public final q13 z;

    public a(ViewGroup viewGroup, boolean z) {
        super(viewGroup, z ? R.layout.item_podcast_chart : R.layout.item_podcast);
        View view = this.a;
        view.getClass();
        this.v = new q13(new o8f(view, 14));
        View view2 = this.a;
        view2.getClass();
        this.w = new q13(new o8f(view2, 15));
        View view3 = this.a;
        view3.getClass();
        this.x = new q13(new o8f(view3, 16));
        View view4 = this.a;
        view4.getClass();
        this.y = new q13(new o8f(view4, 17));
        View view5 = this.a;
        view5.getClass();
        this.z = new q13(new o8f(view5, 18));
        View view6 = this.a;
        view6.getClass();
        this.A = new q13(new o8f(view6, 19));
        View view7 = this.a;
        view7.getClass();
        this.B = new q13(new o8f(view7, 20));
        View view8 = this.a;
        view8.getClass();
        this.C = new q13(new o8f(view8, 21));
        View view9 = this.a;
        view9.getClass();
        this.D = new q13(new o8f(view9, 22));
        bdt I = hag.I(t3g.class);
        l18 l18Var = l18.b;
        this.E = l18Var.b(I, true);
        this.F = l18Var.b(hag.I(k8w.class), true);
        h1b h1bVar = new h1b();
        h1b h1bVar2 = new h1b();
        h1b h1bVar3 = new h1b();
        h1b h1bVar4 = new h1b();
        float dimension = viewGroup.getContext().getResources().getDimension(R.dimen.corner_6);
        ff7 y = rvf.y(0);
        h5 h5Var = new h5(dimension);
        h5 h5Var2 = new h5(dimension);
        h5 h5Var3 = new h5(dimension);
        h5 h5Var4 = new h5(dimension);
        eup eupVar = new eup();
        eupVar.a = y;
        eupVar.b = y;
        eupVar.c = y;
        eupVar.d = y;
        eupVar.e = h5Var;
        eupVar.f = h5Var2;
        eupVar.g = h5Var3;
        eupVar.h = h5Var4;
        eupVar.i = h1bVar;
        eupVar.j = h1bVar2;
        eupVar.k = h1bVar3;
        eupVar.l = h1bVar4;
        this.G = eupVar;
    }

    public final x9e t() {
        return (x9e) this.z.a(H[4]);
    }

    public final View u() {
        return (View) this.v.a(H[0]);
    }

    public final TextView v() {
        return (TextView) this.y.a(H[3]);
    }

    public final TextView w() {
        return (TextView) this.x.a(H[2]);
    }
}
