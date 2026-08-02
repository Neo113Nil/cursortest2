package ru.yandex.music.catalog.juicybottommenu.adapter.holders;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.bow;
import defpackage.ch;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fq2;
import defpackage.he0;
import defpackage.jj4;
import defpackage.jsg;
import defpackage.jyr;
import defpackage.ksw;
import defpackage.q13;
import defpackage.ql;
import defpackage.s9f;
import defpackage.sht;
import defpackage.t86;
import defpackage.vf;
import defpackage.wdu;
import defpackage.weo;
import defpackage.xb5;
import defpackage.y2x;
import defpackage.yxm;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes4.dex */
public final class a extends ch {
    public static final /* synthetic */ s9f[] C = {new yxm(a.class, "container", "getContainer()Landroid/view/View;", 0), f1d.c(ern.a, a.class, "icon", "getIcon()Landroid/widget/ImageView;", 0), new yxm(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), new yxm(a.class, "navigateIcon", "getNavigateIcon()Landroid/widget/ImageView;", 0), new yxm(a.class, "notificationDot", "getNotificationDot()Landroid/view/View;", 0)};
    public final q13 A;
    public final int B;
    public final q13 w;
    public final q13 x;
    public final q13 y;
    public final q13 z;

    public a(ViewGroup viewGroup) {
        super(viewGroup, R.layout.item_juicy_catalog_menu);
        View view = this.a;
        view.getClass();
        this.w = new q13(new ql(view, 15));
        View view2 = this.a;
        view2.getClass();
        this.x = new q13(new ql(view2, 16));
        View view3 = this.a;
        view3.getClass();
        this.y = new q13(new ql(view3, 17));
        View view4 = this.a;
        view4.getClass();
        this.z = new q13(new ql(view4, 18));
        View view5 = this.a;
        view5.getClass();
        this.A = new q13(new ql(view5, 19));
        this.B = R.attr.iconPrimary;
    }

    @Override // defpackage.ch
    public final void u(vf vfVar) {
        xb5 xb5Var = (xb5) vfVar;
        xb5Var.getClass();
        boolean z = xb5Var.j;
        s9f[] s9fVarArr = C;
        View view = (View) this.w.a(s9fVarArr[0]);
        view.setOnClickListener(new fq2(4, this, xb5Var));
        jsg jsgVar = xb5Var.d;
        boolean z2 = xb5Var.k;
        Context context = this.u;
        context.getClass();
        jsgVar.getClass();
        Resources resources = context.getResources();
        int i = jsgVar.b;
        CharSequence text = resources.getText(i);
        text.getClass();
        view.setContentDescription(text);
        jsg jsgVar2 = xb5Var.m;
        if (jsgVar2 != null) {
            CharSequence text2 = context.getResources().getText(jsgVar2.b);
            text2.getClass();
            wdu.s(view, text2);
        }
        view.setTag(xb5Var.g);
        ImageView v = v();
        jsg jsgVar3 = xb5Var.c;
        v.setVisibility(jsgVar3 != null ? 0 : 8);
        if (jsgVar3 != null) {
            ImageView v2 = v();
            int i2 = jsgVar3.b;
            jyr jyrVar = sht.a;
            Object nonNull = Preconditions.nonNull(y2x.w(context, i2));
            nonNull.getClass();
            v2.setImageDrawable((Drawable) nonNull);
            Integer valueOf = z ? Integer.valueOf(R.attr.iconDisabled) : xb5Var.h;
            v().setColorFilter(ksw.C(context, valueOf != null ? valueOf.intValue() : this.B));
        }
        TextView w = w();
        CharSequence text3 = context.getResources().getText(i);
        text3.getClass();
        w.setText(text3);
        if (z) {
            w().setTextColor(weo.M(context, R.attr.textDisabled));
        } else {
            w().setTextColor(weo.M(context, R.attr.textPrimary));
        }
        ((ImageView) this.z.a(s9fVarArr[3])).setVisibility(xb5Var.e ? 0 : 8);
        ((View) this.A.a(s9fVarArr[4])).setVisibility(z2 ? 0 : 8);
        if (z2) {
            x();
        }
        View view2 = this.a;
        view2.getClass();
        bow.D(view2);
    }

    public final ImageView v() {
        return (ImageView) this.x.a(C[1]);
    }

    public final TextView w() {
        return (TextView) this.y.a(C[2]);
    }

    public final void x() {
        int lineCount = w().getLineCount();
        if (lineCount == 0) {
            w().post(new he0(16, this));
            return;
        }
        s9f[] s9fVarArr = C;
        q13 q13Var = this.A;
        if (lineCount > 1) {
            View view = (View) q13Var.a(s9fVarArr[4]);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                jj4.j("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            t86 t86Var = (t86) layoutParams;
            t86Var.i = w().getId();
            t86Var.l = w().getId();
            t86Var.m = -1;
            view.setLayoutParams(t86Var);
            return;
        }
        View view2 = (View) q13Var.a(s9fVarArr[4]);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            jj4.j("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        t86 t86Var2 = (t86) layoutParams2;
        t86Var2.i = -1;
        t86Var2.l = -1;
        t86Var2.m = w().getId();
        view2.setLayoutParams(t86Var2);
    }
}
