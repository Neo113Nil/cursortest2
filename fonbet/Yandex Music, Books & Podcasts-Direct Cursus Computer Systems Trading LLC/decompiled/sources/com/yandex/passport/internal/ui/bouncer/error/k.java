package com.yandex.passport.internal.ui.bouncer.error;

import android.app.Activity;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.R;
import defpackage.ceg;
import defpackage.ceu;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.g96;
import defpackage.h96;
import defpackage.i96;
import defpackage.ldg;
import defpackage.q96;
import defpackage.y86;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class k extends y86 {
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Activity activity) {
        super(activity);
        activity.getClass();
        View view = (View) e.a.invoke(ezf.a0(this.a, 0), 0, 0);
        this.b.j(view);
        ImageView imageView = (ImageView) view;
        imageView.setImageResource(R.drawable.passport_error_slab_copy);
        this.d = imageView;
        int i = R.id.passport_error_slab_hint;
        View view2 = (View) f.a.invoke(ezf.a0(this.a, 0), 0, 0);
        if (i != -1) {
            view2.setId(i);
        }
        this.b.j(view2);
        TextView textView = (TextView) view2;
        textView.setText(R.string.passport_error_slab_hint_text);
        textView.setTextSize(14.0f);
        ldg.K(textView, R.color.passport_error_slab_text_secondary);
        ldg.J(textView, ru.yandex.music.R.font.ya_regular);
        textView.setLineSpacing(TypedValue.applyDimension(2, 1, g4i.a), textView.getLineSpacingMultiplier());
        this.e = textView;
        int i2 = R.id.passport_error_slab_datetime;
        View view3 = (View) g.a.invoke(ezf.a0(this.a, 0), 0, 0);
        if (i2 != -1) {
            view3.setId(i2);
        }
        this.b.j(view3);
        TextView textView2 = (TextView) view3;
        com.yandex.passport.data.network.token.i iVar = r.a;
        iVar.b(textView2);
        this.f = textView2;
        int i3 = R.id.passport_error_slab_app_id;
        View view4 = (View) h.a.invoke(ezf.a0(this.a, 0), 0, 0);
        if (i3 != -1) {
            view4.setId(i3);
        }
        this.b.j(view4);
        TextView textView3 = (TextView) view4;
        iVar.b(textView3);
        this.g = textView3;
        int i4 = R.id.passport_error_slab_details;
        View view5 = (View) i.a.invoke(ezf.a0(this.a, 0), 0, 0);
        if (i4 != -1) {
            view5.setId(i4);
        }
        this.b.j(view5);
        TextView textView4 = (TextView) view5;
        iVar.b(textView4);
        textView4.setMaxLines(3);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        this.h = textView4;
        int i5 = R.id.passport_error_slab_device_id;
        View view6 = (View) j.a.invoke(ezf.a0(this.a, 0), 0, 0);
        if (i5 != -1) {
            view6.setId(i5);
        }
        this.b.j(view6);
        TextView textView5 = (TextView) view6;
        iVar.b(textView5);
        this.i = textView5;
    }

    @Override // defpackage.y86
    public final void a(final q96 q96Var) {
        q96Var.getClass();
        q96Var.w(this.d, new c(0, q96Var));
        final int i = 0;
        q96Var.w(this.e, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.error.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                k kVar = this;
                q96 q96Var2 = q96Var;
                ceu ceuVar = (ceu) obj;
                switch (i2) {
                    case 0:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        g96 g = com.appsflyer.internal.k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.c;
                        g96 g2 = com.appsflyer.internal.k.g(i96Var2, i96Var2, ceuVar, 0);
                        Pair pair = new Pair(i96.d, i96Var2);
                        ImageView imageView = kVar.d;
                        imageView.getClass();
                        g96 a = ceuVar.a(pair, imageView.getId());
                        int i3 = (int) (15 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(g, g2, new h96((ceg) a.b, (ceg) a.c, i3));
                        break;
                    case 1:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        ceuVar.b.t(ceuVar.a, 0);
                        Pair pair2 = new Pair(i96.a, i96.b);
                        TextView textView = kVar.e;
                        textView.getClass();
                        g96 a2 = ceuVar.a(pair2, textView.getId());
                        int i4 = (int) (16 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i4);
                        i96 i96Var3 = i96.c;
                        Pair pair3 = new Pair(i96Var3, i96Var3);
                        textView.getClass();
                        g96 a3 = ceuVar.a(pair3, textView.getId());
                        i96 i96Var4 = i96.d;
                        q96Var2.v(h96Var, a3, com.appsflyer.internal.k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    case 2:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair4 = new Pair(i96.a, i96.b);
                        TextView textView2 = kVar.f;
                        textView2.getClass();
                        g96 a4 = ceuVar.a(pair4, textView2.getId());
                        int i5 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var2 = new h96((ceg) a4.b, (ceg) a4.c, i5);
                        i96 i96Var5 = i96.c;
                        Pair pair5 = new Pair(i96Var5, i96Var5);
                        textView2.getClass();
                        g96 a5 = ceuVar.a(pair5, textView2.getId());
                        i96 i96Var6 = i96.d;
                        q96Var2.v(h96Var2, a5, com.appsflyer.internal.k.g(i96Var6, i96Var6, ceuVar, 0));
                        break;
                    case 3:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        TextView textView3 = kVar.g;
                        textView3.getClass();
                        g96 a6 = ceuVar.a(pair6, textView3.getId());
                        int i6 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a6.b, (ceg) a6.c, i6);
                        i96 i96Var7 = i96.c;
                        Pair pair7 = new Pair(i96Var7, i96Var7);
                        textView3.getClass();
                        g96 a7 = ceuVar.a(pair7, textView3.getId());
                        i96 i96Var8 = i96.d;
                        q96Var2.v(h96Var3, a7, com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair8 = new Pair(i96.a, i96.b);
                        TextView textView4 = kVar.h;
                        textView4.getClass();
                        g96 a8 = ceuVar.a(pair8, textView4.getId());
                        int i7 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a8.b, (ceg) a8.c, i7);
                        i96 i96Var9 = i96.c;
                        Pair pair9 = new Pair(i96Var9, i96Var9);
                        textView4.getClass();
                        g96 a9 = ceuVar.a(pair9, textView4.getId());
                        i96 i96Var10 = i96.d;
                        q96Var2.v(h96Var4, a9, com.appsflyer.internal.k.g(i96Var10, i96Var10, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
        final int i2 = 1;
        q96Var.w(this.f, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.error.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                k kVar = this;
                q96 q96Var2 = q96Var;
                ceu ceuVar = (ceu) obj;
                switch (i22) {
                    case 0:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        g96 g = com.appsflyer.internal.k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.c;
                        g96 g2 = com.appsflyer.internal.k.g(i96Var2, i96Var2, ceuVar, 0);
                        Pair pair = new Pair(i96.d, i96Var2);
                        ImageView imageView = kVar.d;
                        imageView.getClass();
                        g96 a = ceuVar.a(pair, imageView.getId());
                        int i3 = (int) (15 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(g, g2, new h96((ceg) a.b, (ceg) a.c, i3));
                        break;
                    case 1:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        ceuVar.b.t(ceuVar.a, 0);
                        Pair pair2 = new Pair(i96.a, i96.b);
                        TextView textView = kVar.e;
                        textView.getClass();
                        g96 a2 = ceuVar.a(pair2, textView.getId());
                        int i4 = (int) (16 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i4);
                        i96 i96Var3 = i96.c;
                        Pair pair3 = new Pair(i96Var3, i96Var3);
                        textView.getClass();
                        g96 a3 = ceuVar.a(pair3, textView.getId());
                        i96 i96Var4 = i96.d;
                        q96Var2.v(h96Var, a3, com.appsflyer.internal.k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    case 2:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair4 = new Pair(i96.a, i96.b);
                        TextView textView2 = kVar.f;
                        textView2.getClass();
                        g96 a4 = ceuVar.a(pair4, textView2.getId());
                        int i5 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var2 = new h96((ceg) a4.b, (ceg) a4.c, i5);
                        i96 i96Var5 = i96.c;
                        Pair pair5 = new Pair(i96Var5, i96Var5);
                        textView2.getClass();
                        g96 a5 = ceuVar.a(pair5, textView2.getId());
                        i96 i96Var6 = i96.d;
                        q96Var2.v(h96Var2, a5, com.appsflyer.internal.k.g(i96Var6, i96Var6, ceuVar, 0));
                        break;
                    case 3:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        TextView textView3 = kVar.g;
                        textView3.getClass();
                        g96 a6 = ceuVar.a(pair6, textView3.getId());
                        int i6 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a6.b, (ceg) a6.c, i6);
                        i96 i96Var7 = i96.c;
                        Pair pair7 = new Pair(i96Var7, i96Var7);
                        textView3.getClass();
                        g96 a7 = ceuVar.a(pair7, textView3.getId());
                        i96 i96Var8 = i96.d;
                        q96Var2.v(h96Var3, a7, com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair8 = new Pair(i96.a, i96.b);
                        TextView textView4 = kVar.h;
                        textView4.getClass();
                        g96 a8 = ceuVar.a(pair8, textView4.getId());
                        int i7 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a8.b, (ceg) a8.c, i7);
                        i96 i96Var9 = i96.c;
                        Pair pair9 = new Pair(i96Var9, i96Var9);
                        textView4.getClass();
                        g96 a9 = ceuVar.a(pair9, textView4.getId());
                        i96 i96Var10 = i96.d;
                        q96Var2.v(h96Var4, a9, com.appsflyer.internal.k.g(i96Var10, i96Var10, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
        final int i3 = 2;
        q96Var.w(this.g, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.error.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                k kVar = this;
                q96 q96Var2 = q96Var;
                ceu ceuVar = (ceu) obj;
                switch (i22) {
                    case 0:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        g96 g = com.appsflyer.internal.k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.c;
                        g96 g2 = com.appsflyer.internal.k.g(i96Var2, i96Var2, ceuVar, 0);
                        Pair pair = new Pair(i96.d, i96Var2);
                        ImageView imageView = kVar.d;
                        imageView.getClass();
                        g96 a = ceuVar.a(pair, imageView.getId());
                        int i32 = (int) (15 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(g, g2, new h96((ceg) a.b, (ceg) a.c, i32));
                        break;
                    case 1:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        ceuVar.b.t(ceuVar.a, 0);
                        Pair pair2 = new Pair(i96.a, i96.b);
                        TextView textView = kVar.e;
                        textView.getClass();
                        g96 a2 = ceuVar.a(pair2, textView.getId());
                        int i4 = (int) (16 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i4);
                        i96 i96Var3 = i96.c;
                        Pair pair3 = new Pair(i96Var3, i96Var3);
                        textView.getClass();
                        g96 a3 = ceuVar.a(pair3, textView.getId());
                        i96 i96Var4 = i96.d;
                        q96Var2.v(h96Var, a3, com.appsflyer.internal.k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    case 2:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair4 = new Pair(i96.a, i96.b);
                        TextView textView2 = kVar.f;
                        textView2.getClass();
                        g96 a4 = ceuVar.a(pair4, textView2.getId());
                        int i5 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var2 = new h96((ceg) a4.b, (ceg) a4.c, i5);
                        i96 i96Var5 = i96.c;
                        Pair pair5 = new Pair(i96Var5, i96Var5);
                        textView2.getClass();
                        g96 a5 = ceuVar.a(pair5, textView2.getId());
                        i96 i96Var6 = i96.d;
                        q96Var2.v(h96Var2, a5, com.appsflyer.internal.k.g(i96Var6, i96Var6, ceuVar, 0));
                        break;
                    case 3:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        TextView textView3 = kVar.g;
                        textView3.getClass();
                        g96 a6 = ceuVar.a(pair6, textView3.getId());
                        int i6 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a6.b, (ceg) a6.c, i6);
                        i96 i96Var7 = i96.c;
                        Pair pair7 = new Pair(i96Var7, i96Var7);
                        textView3.getClass();
                        g96 a7 = ceuVar.a(pair7, textView3.getId());
                        i96 i96Var8 = i96.d;
                        q96Var2.v(h96Var3, a7, com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair8 = new Pair(i96.a, i96.b);
                        TextView textView4 = kVar.h;
                        textView4.getClass();
                        g96 a8 = ceuVar.a(pair8, textView4.getId());
                        int i7 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a8.b, (ceg) a8.c, i7);
                        i96 i96Var9 = i96.c;
                        Pair pair9 = new Pair(i96Var9, i96Var9);
                        textView4.getClass();
                        g96 a9 = ceuVar.a(pair9, textView4.getId());
                        i96 i96Var10 = i96.d;
                        q96Var2.v(h96Var4, a9, com.appsflyer.internal.k.g(i96Var10, i96Var10, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
        final int i4 = 3;
        q96Var.w(this.h, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.error.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i4;
                k kVar = this;
                q96 q96Var2 = q96Var;
                ceu ceuVar = (ceu) obj;
                switch (i22) {
                    case 0:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        g96 g = com.appsflyer.internal.k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.c;
                        g96 g2 = com.appsflyer.internal.k.g(i96Var2, i96Var2, ceuVar, 0);
                        Pair pair = new Pair(i96.d, i96Var2);
                        ImageView imageView = kVar.d;
                        imageView.getClass();
                        g96 a = ceuVar.a(pair, imageView.getId());
                        int i32 = (int) (15 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(g, g2, new h96((ceg) a.b, (ceg) a.c, i32));
                        break;
                    case 1:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        ceuVar.b.t(ceuVar.a, 0);
                        Pair pair2 = new Pair(i96.a, i96.b);
                        TextView textView = kVar.e;
                        textView.getClass();
                        g96 a2 = ceuVar.a(pair2, textView.getId());
                        int i42 = (int) (16 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i42);
                        i96 i96Var3 = i96.c;
                        Pair pair3 = new Pair(i96Var3, i96Var3);
                        textView.getClass();
                        g96 a3 = ceuVar.a(pair3, textView.getId());
                        i96 i96Var4 = i96.d;
                        q96Var2.v(h96Var, a3, com.appsflyer.internal.k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    case 2:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair4 = new Pair(i96.a, i96.b);
                        TextView textView2 = kVar.f;
                        textView2.getClass();
                        g96 a4 = ceuVar.a(pair4, textView2.getId());
                        int i5 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var2 = new h96((ceg) a4.b, (ceg) a4.c, i5);
                        i96 i96Var5 = i96.c;
                        Pair pair5 = new Pair(i96Var5, i96Var5);
                        textView2.getClass();
                        g96 a5 = ceuVar.a(pair5, textView2.getId());
                        i96 i96Var6 = i96.d;
                        q96Var2.v(h96Var2, a5, com.appsflyer.internal.k.g(i96Var6, i96Var6, ceuVar, 0));
                        break;
                    case 3:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        TextView textView3 = kVar.g;
                        textView3.getClass();
                        g96 a6 = ceuVar.a(pair6, textView3.getId());
                        int i6 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a6.b, (ceg) a6.c, i6);
                        i96 i96Var7 = i96.c;
                        Pair pair7 = new Pair(i96Var7, i96Var7);
                        textView3.getClass();
                        g96 a7 = ceuVar.a(pair7, textView3.getId());
                        i96 i96Var8 = i96.d;
                        q96Var2.v(h96Var3, a7, com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair8 = new Pair(i96.a, i96.b);
                        TextView textView4 = kVar.h;
                        textView4.getClass();
                        g96 a8 = ceuVar.a(pair8, textView4.getId());
                        int i7 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a8.b, (ceg) a8.c, i7);
                        i96 i96Var9 = i96.c;
                        Pair pair9 = new Pair(i96Var9, i96Var9);
                        textView4.getClass();
                        g96 a9 = ceuVar.a(pair9, textView4.getId());
                        i96 i96Var10 = i96.d;
                        q96Var2.v(h96Var4, a9, com.appsflyer.internal.k.g(i96Var10, i96Var10, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
        final int i5 = 4;
        q96Var.w(this.i, new Function1() { // from class: com.yandex.passport.internal.ui.bouncer.error.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i5;
                k kVar = this;
                q96 q96Var2 = q96Var;
                ceu ceuVar = (ceu) obj;
                switch (i22) {
                    case 0:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        i96 i96Var = i96.a;
                        g96 g = com.appsflyer.internal.k.g(i96Var, i96Var, ceuVar, 0);
                        i96 i96Var2 = i96.c;
                        g96 g2 = com.appsflyer.internal.k.g(i96Var2, i96Var2, ceuVar, 0);
                        Pair pair = new Pair(i96.d, i96Var2);
                        ImageView imageView = kVar.d;
                        imageView.getClass();
                        g96 a = ceuVar.a(pair, imageView.getId());
                        int i32 = (int) (15 * g4i.a.density);
                        q96Var2.getClass();
                        q96Var2.v(g, g2, new h96((ceg) a.b, (ceg) a.c, i32));
                        break;
                    case 1:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        ceuVar.b.t(ceuVar.a, 0);
                        Pair pair2 = new Pair(i96.a, i96.b);
                        TextView textView = kVar.e;
                        textView.getClass();
                        g96 a2 = ceuVar.a(pair2, textView.getId());
                        int i42 = (int) (16 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var = new h96((ceg) a2.b, (ceg) a2.c, i42);
                        i96 i96Var3 = i96.c;
                        Pair pair3 = new Pair(i96Var3, i96Var3);
                        textView.getClass();
                        g96 a3 = ceuVar.a(pair3, textView.getId());
                        i96 i96Var4 = i96.d;
                        q96Var2.v(h96Var, a3, com.appsflyer.internal.k.g(i96Var4, i96Var4, ceuVar, 0));
                        break;
                    case 2:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair4 = new Pair(i96.a, i96.b);
                        TextView textView2 = kVar.f;
                        textView2.getClass();
                        g96 a4 = ceuVar.a(pair4, textView2.getId());
                        int i52 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var2 = new h96((ceg) a4.b, (ceg) a4.c, i52);
                        i96 i96Var5 = i96.c;
                        Pair pair5 = new Pair(i96Var5, i96Var5);
                        textView2.getClass();
                        g96 a5 = ceuVar.a(pair5, textView2.getId());
                        i96 i96Var6 = i96.d;
                        q96Var2.v(h96Var2, a5, com.appsflyer.internal.k.g(i96Var6, i96Var6, ceuVar, 0));
                        break;
                    case 3:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair6 = new Pair(i96.a, i96.b);
                        TextView textView3 = kVar.g;
                        textView3.getClass();
                        g96 a6 = ceuVar.a(pair6, textView3.getId());
                        int i6 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var3 = new h96((ceg) a6.b, (ceg) a6.c, i6);
                        i96 i96Var7 = i96.c;
                        Pair pair7 = new Pair(i96Var7, i96Var7);
                        textView3.getClass();
                        g96 a7 = ceuVar.a(pair7, textView3.getId());
                        i96 i96Var8 = i96.d;
                        q96Var2.v(h96Var3, a7, com.appsflyer.internal.k.g(i96Var8, i96Var8, ceuVar, 0));
                        break;
                    default:
                        ceuVar.getClass();
                        ceuVar.c(0);
                        ceuVar.b(-2);
                        Pair pair8 = new Pair(i96.a, i96.b);
                        TextView textView4 = kVar.h;
                        textView4.getClass();
                        g96 a8 = ceuVar.a(pair8, textView4.getId());
                        int i7 = (int) (8 * g4i.a.density);
                        q96Var2.getClass();
                        h96 h96Var4 = new h96((ceg) a8.b, (ceg) a8.c, i7);
                        i96 i96Var9 = i96.c;
                        Pair pair9 = new Pair(i96Var9, i96Var9);
                        textView4.getClass();
                        g96 a9 = ceuVar.a(pair9, textView4.getId());
                        i96 i96Var10 = i96.d;
                        q96Var2.v(h96Var4, a9, com.appsflyer.internal.k.g(i96Var10, i96Var10, ceuVar, 0));
                        break;
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.y86
    public final void d(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        int i = (int) (16 * g4i.a.density);
        constraintLayout.setPadding(i, i, i, i);
        ldg.I(R.drawable.passport_error_slab_details_background, constraintLayout);
    }
}
