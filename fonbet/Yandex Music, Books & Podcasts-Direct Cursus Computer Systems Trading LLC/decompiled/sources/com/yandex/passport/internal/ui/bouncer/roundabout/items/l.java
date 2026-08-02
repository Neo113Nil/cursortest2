package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import com.yandex.passport.internal.badges.MaxLinesChipGroup;
import defpackage.ceg;
import defpackage.ceu;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.g96;
import defpackage.h96;
import defpackage.i96;
import defpackage.k96;
import defpackage.ldg;
import defpackage.p96;
import defpackage.q96;
import defpackage.ua4;
import defpackage.uf6;
import defpackage.v75;
import defpackage.xq0;
import defpackage.y86;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class l extends y86 {
    public final uf6 d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final MaxLinesChipGroup h;
    public final Space i;

    public l(uf6 uf6Var) {
        super(uf6Var);
        this.d = uf6Var;
        View view = (View) g.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view);
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_icon_user_unknown);
        this.e = imageView;
        View view2 = (View) i.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view2);
        TextView textView = (TextView) view2;
        textView.setId(R.id.passport_roundabout_account_title);
        textView.setTextSize(16.0f);
        ldg.K(textView, R.color.passport_roundabout_text_primary);
        ldg.J(textView, ru.yandex.music.R.font.ys_text_medium);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setGravity(8388627);
        textView.setTextDirection(5);
        this.f = textView;
        View view3 = (View) j.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view3);
        TextView textView2 = (TextView) view3;
        textView2.setId(R.id.passport_roundabout_account_subtitle);
        textView2.setTextSize(14.0f);
        ldg.K(textView2, R.color.passport_roundabout_text_secondary);
        ldg.J(textView2, ru.yandex.music.R.font.ys_text_regular);
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setGravity(8388627);
        this.g = textView2;
        View view4 = (View) k.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view4);
        MaxLinesChipGroup maxLinesChipGroup = (MaxLinesChipGroup) view4;
        maxLinesChipGroup.setId(R.id.passport_roundabout_order_flow);
        maxLinesChipGroup.setMaxLines(2);
        maxLinesChipGroup.setChipSpacing((int) (4 * g4i.a.density));
        this.h = maxLinesChipGroup;
        View view5 = (View) h.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view5);
        this.i = (Space) view5;
    }

    @Override // defpackage.y86
    public final void a(final q96 q96Var) {
        q96Var.getClass();
        com.yandex.passport.internal.ui.bouncer.error.c cVar = new com.yandex.passport.internal.ui.bouncer.error.c(5, q96Var);
        ImageView imageView = this.e;
        q96Var.w(imageView, cVar);
        int id = imageView.getId();
        p96 p96Var = new p96(id, 3);
        int id2 = imageView.getId();
        k96 k96Var = new k96(id2, 3);
        ua4[] ua4VarArr = ua4.a;
        ArrayList arrayList = new ArrayList();
        TextView textView = this.g;
        textView.getClass();
        Integer valueOf = Integer.valueOf(textView.getId());
        Float valueOf2 = Float.valueOf(1.0f);
        arrayList.add(new Pair(valueOf, valueOf2));
        TextView textView2 = this.f;
        textView2.getClass();
        arrayList.add(new Pair(Integer.valueOf(textView2.getId()), valueOf2));
        int n = p96Var.n();
        int n2 = k96Var.n();
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Number) ((Pair) it.next()).a).intValue()));
        }
        int[] v0 = CollectionsKt.v0(arrayList2);
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(((Number) ((Pair) it2.next()).b).floatValue()));
        }
        float[] t0 = CollectionsKt.t0(arrayList3);
        final int i = 2;
        if (v0.length < 2) {
            xq0.x("must have 2 or more widgets in a chain");
            return;
        }
        if (t0.length != v0.length) {
            xq0.x("must have 2 or more widgets in a chain");
            return;
        }
        final int i2 = 0;
        q96Var.k(v0[0]).e.U = t0[0];
        q96Var.k(v0[0]).e.X = 2;
        q96Var.h(v0[0], 3, id, n, 0);
        int i3 = 1;
        int i4 = 1;
        while (i4 < v0.length) {
            int i5 = i4;
            int i6 = i5 - 1;
            q96Var.h(v0[i5], 3, v0[i6], 4, 0);
            q96Var.h(v0[i6], 4, v0[i5], 3, 0);
            q96Var.k(v0[i5]).e.U = t0[i5];
            i4 = i5 + 1;
            i3 = i3;
        }
        final int i7 = i3;
        q96Var.h(v0[v0.length - i7], 4, id2, n2, 0);
        q96Var.w(textView2, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = i2;
                l lVar = this;
                q96 q96Var2 = q96Var;
                switch (i8) {
                    case 0:
                        ceu ceuVar = (ceu) obj;
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        Pair pair = new Pair(i96Var, i96Var);
                        ImageView imageView2 = lVar.e;
                        imageView2.getClass();
                        g96 a = ceuVar.a(pair, imageView2.getId());
                        i96 i96Var2 = i96.c;
                        i96 i96Var3 = i96.d;
                        Pair pair2 = new Pair(i96Var2, i96Var3);
                        imageView2.getClass();
                        g96 a2 = ceuVar.a(pair2, imageView2.getId());
                        float f = 12;
                        DisplayMetrics displayMetrics = g4i.a;
                        int i9 = (int) (displayMetrics.density * f);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i9);
                        g96 g = com.appsflyer.internal.k.g(i96Var3, i96Var3, ceuVar, 0);
                        h96 h96Var2 = new h96((ceg) g.b, (ceg) g.c, (int) (f * displayMetrics.density));
                        Pair pair3 = new Pair(i96.b, i96Var);
                        TextView textView3 = lVar.g;
                        textView3.getClass();
                        g96 a3 = ceuVar.a(pair3, textView3.getId());
                        q96Var2.v(a, h96Var, h96Var2, new h96((ceg) a3.b, (ceg) a3.c, (int) (2 * displayMetrics.density)));
                        break;
                    case 1:
                        ceu ceuVar2 = (ceu) obj;
                        ceuVar2.getClass();
                        ceuVar2.c(0);
                        ceuVar2.b(-2);
                        ceuVar2.b.t(ceuVar2.a, 0);
                        i96 i96Var4 = i96.a;
                        i96 i96Var5 = i96.b;
                        Pair pair4 = new Pair(i96Var4, i96Var5);
                        TextView textView4 = lVar.f;
                        textView4.getClass();
                        g96 a4 = ceuVar2.a(pair4, textView4.getId());
                        i96 i96Var6 = i96.c;
                        i96 i96Var7 = i96.d;
                        Pair pair5 = new Pair(i96Var6, i96Var7);
                        ImageView imageView3 = lVar.e;
                        imageView3.getClass();
                        g96 a5 = ceuVar2.a(pair5, imageView3.getId());
                        float f2 = 12;
                        DisplayMetrics displayMetrics2 = g4i.a;
                        int i10 = (int) (displayMetrics2.density * f2);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a5.b, (ceg) a5.c, i10);
                        g96 g2 = com.appsflyer.internal.k.g(i96Var7, i96Var7, ceuVar2, 0);
                        q96Var2.v(a4, h96Var3, new h96((ceg) g2.b, (ceg) g2.c, (int) (f2 * displayMetrics2.density)), ceuVar2.a(new Pair(i96Var5, i96Var5), imageView3.getId()));
                        break;
                    case 2:
                        ceu ceuVar3 = (ceu) obj;
                        ceuVar3.getClass();
                        ceuVar3.c(0);
                        ceuVar3.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        ImageView imageView4 = lVar.e;
                        imageView4.getClass();
                        g96 a6 = ceuVar3.a(pair6, imageView4.getId());
                        float f3 = 12;
                        DisplayMetrics displayMetrics3 = g4i.a;
                        int i11 = (int) (displayMetrics3.density * f3);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a6.b, (ceg) a6.c, i11);
                        i96 i96Var8 = i96.c;
                        g96 g3 = com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar3, 0);
                        h96 h96Var5 = new h96((ceg) g3.b, (ceg) g3.c, (int) (displayMetrics3.density * f3));
                        i96 i96Var9 = i96.d;
                        g96 g4 = com.appsflyer.internal.k.g(i96Var9, i96Var9, ceuVar3, 0);
                        q96Var2.v(h96Var4, h96Var5, new h96((ceg) g4.b, (ceg) g4.c, (int) (f3 * displayMetrics3.density)));
                        break;
                    default:
                        ceu ceuVar4 = (ceu) obj;
                        ceuVar4.getClass();
                        ceuVar4.c(0);
                        ceuVar4.b(0);
                        Pair pair7 = new Pair(i96.a, i96.b);
                        MaxLinesChipGroup maxLinesChipGroup = lVar.h;
                        maxLinesChipGroup.getClass();
                        g96 a7 = ceuVar4.a(pair7, maxLinesChipGroup.getId());
                        int i12 = (int) (12 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(new h96((ceg) a7.b, (ceg) a7.c, i12));
                        break;
                }
                return Unit.a;
            }
        });
        q96Var.w(textView, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = i7;
                l lVar = this;
                q96 q96Var2 = q96Var;
                switch (i8) {
                    case 0:
                        ceu ceuVar = (ceu) obj;
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        Pair pair = new Pair(i96Var, i96Var);
                        ImageView imageView2 = lVar.e;
                        imageView2.getClass();
                        g96 a = ceuVar.a(pair, imageView2.getId());
                        i96 i96Var2 = i96.c;
                        i96 i96Var3 = i96.d;
                        Pair pair2 = new Pair(i96Var2, i96Var3);
                        imageView2.getClass();
                        g96 a2 = ceuVar.a(pair2, imageView2.getId());
                        float f = 12;
                        DisplayMetrics displayMetrics = g4i.a;
                        int i9 = (int) (displayMetrics.density * f);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i9);
                        g96 g = com.appsflyer.internal.k.g(i96Var3, i96Var3, ceuVar, 0);
                        h96 h96Var2 = new h96((ceg) g.b, (ceg) g.c, (int) (f * displayMetrics.density));
                        Pair pair3 = new Pair(i96.b, i96Var);
                        TextView textView3 = lVar.g;
                        textView3.getClass();
                        g96 a3 = ceuVar.a(pair3, textView3.getId());
                        q96Var2.v(a, h96Var, h96Var2, new h96((ceg) a3.b, (ceg) a3.c, (int) (2 * displayMetrics.density)));
                        break;
                    case 1:
                        ceu ceuVar2 = (ceu) obj;
                        ceuVar2.getClass();
                        ceuVar2.c(0);
                        ceuVar2.b(-2);
                        ceuVar2.b.t(ceuVar2.a, 0);
                        i96 i96Var4 = i96.a;
                        i96 i96Var5 = i96.b;
                        Pair pair4 = new Pair(i96Var4, i96Var5);
                        TextView textView4 = lVar.f;
                        textView4.getClass();
                        g96 a4 = ceuVar2.a(pair4, textView4.getId());
                        i96 i96Var6 = i96.c;
                        i96 i96Var7 = i96.d;
                        Pair pair5 = new Pair(i96Var6, i96Var7);
                        ImageView imageView3 = lVar.e;
                        imageView3.getClass();
                        g96 a5 = ceuVar2.a(pair5, imageView3.getId());
                        float f2 = 12;
                        DisplayMetrics displayMetrics2 = g4i.a;
                        int i10 = (int) (displayMetrics2.density * f2);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a5.b, (ceg) a5.c, i10);
                        g96 g2 = com.appsflyer.internal.k.g(i96Var7, i96Var7, ceuVar2, 0);
                        q96Var2.v(a4, h96Var3, new h96((ceg) g2.b, (ceg) g2.c, (int) (f2 * displayMetrics2.density)), ceuVar2.a(new Pair(i96Var5, i96Var5), imageView3.getId()));
                        break;
                    case 2:
                        ceu ceuVar3 = (ceu) obj;
                        ceuVar3.getClass();
                        ceuVar3.c(0);
                        ceuVar3.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        ImageView imageView4 = lVar.e;
                        imageView4.getClass();
                        g96 a6 = ceuVar3.a(pair6, imageView4.getId());
                        float f3 = 12;
                        DisplayMetrics displayMetrics3 = g4i.a;
                        int i11 = (int) (displayMetrics3.density * f3);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a6.b, (ceg) a6.c, i11);
                        i96 i96Var8 = i96.c;
                        g96 g3 = com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar3, 0);
                        h96 h96Var5 = new h96((ceg) g3.b, (ceg) g3.c, (int) (displayMetrics3.density * f3));
                        i96 i96Var9 = i96.d;
                        g96 g4 = com.appsflyer.internal.k.g(i96Var9, i96Var9, ceuVar3, 0);
                        q96Var2.v(h96Var4, h96Var5, new h96((ceg) g4.b, (ceg) g4.c, (int) (f3 * displayMetrics3.density)));
                        break;
                    default:
                        ceu ceuVar4 = (ceu) obj;
                        ceuVar4.getClass();
                        ceuVar4.c(0);
                        ceuVar4.b(0);
                        Pair pair7 = new Pair(i96.a, i96.b);
                        MaxLinesChipGroup maxLinesChipGroup = lVar.h;
                        maxLinesChipGroup.getClass();
                        g96 a7 = ceuVar4.a(pair7, maxLinesChipGroup.getId());
                        int i12 = (int) (12 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(new h96((ceg) a7.b, (ceg) a7.c, i12));
                        break;
                }
                return Unit.a;
            }
        });
        q96Var.w(this.h, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i8 = i;
                l lVar = this;
                q96 q96Var2 = q96Var;
                switch (i8) {
                    case 0:
                        ceu ceuVar = (ceu) obj;
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        Pair pair = new Pair(i96Var, i96Var);
                        ImageView imageView2 = lVar.e;
                        imageView2.getClass();
                        g96 a = ceuVar.a(pair, imageView2.getId());
                        i96 i96Var2 = i96.c;
                        i96 i96Var3 = i96.d;
                        Pair pair2 = new Pair(i96Var2, i96Var3);
                        imageView2.getClass();
                        g96 a2 = ceuVar.a(pair2, imageView2.getId());
                        float f = 12;
                        DisplayMetrics displayMetrics = g4i.a;
                        int i9 = (int) (displayMetrics.density * f);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i9);
                        g96 g = com.appsflyer.internal.k.g(i96Var3, i96Var3, ceuVar, 0);
                        h96 h96Var2 = new h96((ceg) g.b, (ceg) g.c, (int) (f * displayMetrics.density));
                        Pair pair3 = new Pair(i96.b, i96Var);
                        TextView textView3 = lVar.g;
                        textView3.getClass();
                        g96 a3 = ceuVar.a(pair3, textView3.getId());
                        q96Var2.v(a, h96Var, h96Var2, new h96((ceg) a3.b, (ceg) a3.c, (int) (2 * displayMetrics.density)));
                        break;
                    case 1:
                        ceu ceuVar2 = (ceu) obj;
                        ceuVar2.getClass();
                        ceuVar2.c(0);
                        ceuVar2.b(-2);
                        ceuVar2.b.t(ceuVar2.a, 0);
                        i96 i96Var4 = i96.a;
                        i96 i96Var5 = i96.b;
                        Pair pair4 = new Pair(i96Var4, i96Var5);
                        TextView textView4 = lVar.f;
                        textView4.getClass();
                        g96 a4 = ceuVar2.a(pair4, textView4.getId());
                        i96 i96Var6 = i96.c;
                        i96 i96Var7 = i96.d;
                        Pair pair5 = new Pair(i96Var6, i96Var7);
                        ImageView imageView3 = lVar.e;
                        imageView3.getClass();
                        g96 a5 = ceuVar2.a(pair5, imageView3.getId());
                        float f2 = 12;
                        DisplayMetrics displayMetrics2 = g4i.a;
                        int i10 = (int) (displayMetrics2.density * f2);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a5.b, (ceg) a5.c, i10);
                        g96 g2 = com.appsflyer.internal.k.g(i96Var7, i96Var7, ceuVar2, 0);
                        q96Var2.v(a4, h96Var3, new h96((ceg) g2.b, (ceg) g2.c, (int) (f2 * displayMetrics2.density)), ceuVar2.a(new Pair(i96Var5, i96Var5), imageView3.getId()));
                        break;
                    case 2:
                        ceu ceuVar3 = (ceu) obj;
                        ceuVar3.getClass();
                        ceuVar3.c(0);
                        ceuVar3.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        ImageView imageView4 = lVar.e;
                        imageView4.getClass();
                        g96 a6 = ceuVar3.a(pair6, imageView4.getId());
                        float f3 = 12;
                        DisplayMetrics displayMetrics3 = g4i.a;
                        int i11 = (int) (displayMetrics3.density * f3);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a6.b, (ceg) a6.c, i11);
                        i96 i96Var8 = i96.c;
                        g96 g3 = com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar3, 0);
                        h96 h96Var5 = new h96((ceg) g3.b, (ceg) g3.c, (int) (displayMetrics3.density * f3));
                        i96 i96Var9 = i96.d;
                        g96 g4 = com.appsflyer.internal.k.g(i96Var9, i96Var9, ceuVar3, 0);
                        q96Var2.v(h96Var4, h96Var5, new h96((ceg) g4.b, (ceg) g4.c, (int) (f3 * displayMetrics3.density)));
                        break;
                    default:
                        ceu ceuVar4 = (ceu) obj;
                        ceuVar4.getClass();
                        ceuVar4.c(0);
                        ceuVar4.b(0);
                        Pair pair7 = new Pair(i96.a, i96.b);
                        MaxLinesChipGroup maxLinesChipGroup = lVar.h;
                        maxLinesChipGroup.getClass();
                        g96 a7 = ceuVar4.a(pair7, maxLinesChipGroup.getId());
                        int i12 = (int) (12 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(new h96((ceg) a7.b, (ceg) a7.c, i12));
                        break;
                }
                return Unit.a;
            }
        });
        final int i8 = 3;
        q96Var.w(this.i, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.roundabout.items.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i82 = i8;
                l lVar = this;
                q96 q96Var2 = q96Var;
                switch (i82) {
                    case 0:
                        ceu ceuVar = (ceu) obj;
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        Pair pair = new Pair(i96Var, i96Var);
                        ImageView imageView2 = lVar.e;
                        imageView2.getClass();
                        g96 a = ceuVar.a(pair, imageView2.getId());
                        i96 i96Var2 = i96.c;
                        i96 i96Var3 = i96.d;
                        Pair pair2 = new Pair(i96Var2, i96Var3);
                        imageView2.getClass();
                        g96 a2 = ceuVar.a(pair2, imageView2.getId());
                        float f = 12;
                        DisplayMetrics displayMetrics = g4i.a;
                        int i9 = (int) (displayMetrics.density * f);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i9);
                        g96 g = com.appsflyer.internal.k.g(i96Var3, i96Var3, ceuVar, 0);
                        h96 h96Var2 = new h96((ceg) g.b, (ceg) g.c, (int) (f * displayMetrics.density));
                        Pair pair3 = new Pair(i96.b, i96Var);
                        TextView textView3 = lVar.g;
                        textView3.getClass();
                        g96 a3 = ceuVar.a(pair3, textView3.getId());
                        q96Var2.v(a, h96Var, h96Var2, new h96((ceg) a3.b, (ceg) a3.c, (int) (2 * displayMetrics.density)));
                        break;
                    case 1:
                        ceu ceuVar2 = (ceu) obj;
                        ceuVar2.getClass();
                        ceuVar2.c(0);
                        ceuVar2.b(-2);
                        ceuVar2.b.t(ceuVar2.a, 0);
                        i96 i96Var4 = i96.a;
                        i96 i96Var5 = i96.b;
                        Pair pair4 = new Pair(i96Var4, i96Var5);
                        TextView textView4 = lVar.f;
                        textView4.getClass();
                        g96 a4 = ceuVar2.a(pair4, textView4.getId());
                        i96 i96Var6 = i96.c;
                        i96 i96Var7 = i96.d;
                        Pair pair5 = new Pair(i96Var6, i96Var7);
                        ImageView imageView3 = lVar.e;
                        imageView3.getClass();
                        g96 a5 = ceuVar2.a(pair5, imageView3.getId());
                        float f2 = 12;
                        DisplayMetrics displayMetrics2 = g4i.a;
                        int i10 = (int) (displayMetrics2.density * f2);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a5.b, (ceg) a5.c, i10);
                        g96 g2 = com.appsflyer.internal.k.g(i96Var7, i96Var7, ceuVar2, 0);
                        q96Var2.v(a4, h96Var3, new h96((ceg) g2.b, (ceg) g2.c, (int) (f2 * displayMetrics2.density)), ceuVar2.a(new Pair(i96Var5, i96Var5), imageView3.getId()));
                        break;
                    case 2:
                        ceu ceuVar3 = (ceu) obj;
                        ceuVar3.getClass();
                        ceuVar3.c(0);
                        ceuVar3.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        ImageView imageView4 = lVar.e;
                        imageView4.getClass();
                        g96 a6 = ceuVar3.a(pair6, imageView4.getId());
                        float f3 = 12;
                        DisplayMetrics displayMetrics3 = g4i.a;
                        int i11 = (int) (displayMetrics3.density * f3);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a6.b, (ceg) a6.c, i11);
                        i96 i96Var8 = i96.c;
                        g96 g3 = com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar3, 0);
                        h96 h96Var5 = new h96((ceg) g3.b, (ceg) g3.c, (int) (displayMetrics3.density * f3));
                        i96 i96Var9 = i96.d;
                        g96 g4 = com.appsflyer.internal.k.g(i96Var9, i96Var9, ceuVar3, 0);
                        q96Var2.v(h96Var4, h96Var5, new h96((ceg) g4.b, (ceg) g4.c, (int) (f3 * displayMetrics3.density)));
                        break;
                    default:
                        ceu ceuVar4 = (ceu) obj;
                        ceuVar4.getClass();
                        ceuVar4.c(0);
                        ceuVar4.b(0);
                        Pair pair7 = new Pair(i96.a, i96.b);
                        MaxLinesChipGroup maxLinesChipGroup = lVar.h;
                        maxLinesChipGroup.getClass();
                        g96 a7 = ceuVar4.a(pair7, maxLinesChipGroup.getId());
                        int i12 = (int) (12 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(new h96((ceg) a7.b, (ceg) a7.c, i12));
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.y86
    public final void d(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        constraintLayout.setClickable(true);
        constraintLayout.setBackgroundResource(R.drawable.passport_roundabout_account);
        constraintLayout.setClipToPadding(true);
    }
}
