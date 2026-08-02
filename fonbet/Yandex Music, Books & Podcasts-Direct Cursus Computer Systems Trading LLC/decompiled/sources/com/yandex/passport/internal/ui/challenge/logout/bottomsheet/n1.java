package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.b6;
import defpackage.c7g;
import defpackage.etn;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.jw;
import defpackage.ldg;
import defpackage.ndu;
import defpackage.rj7;
import defpackage.rof;
import defpackage.sof;
import defpackage.tot;
import defpackage.wdu;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class n1 extends b6 {
    public final a0 d;
    public final TextView e;
    public final View f;
    public final TextView g;
    public final c7g h;
    public final c7g i;
    public final com.yandex.passport.common.ui.view.g j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final c7g o;
    public final TextView p;
    public final TextView q;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(Activity activity) {
        super(activity, 10);
        a0 a0Var = new a0(1);
        a0 a0Var2 = new a0(2);
        a0 a0Var3 = new a0(3);
        a0 a0Var4 = new a0(4);
        a0 a0Var5 = new a0(5);
        a0 a0Var6 = new a0(6);
        this.d = new a0(this);
        View view = (View) e1.a.invoke(ezf.a0(activity, 0), 0, 0);
        boolean z = this instanceof rof;
        if (z) {
            ((rof) this).j(view);
        }
        TextView textView = (TextView) view;
        a0Var.b(textView);
        this.e = textView;
        View view2 = (View) m1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view2);
        }
        this.f = view2;
        View view3 = (View) f1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view3);
        }
        TextView textView2 = (TextView) view3;
        a0Var2.b(textView2);
        textView2.setTextColor(etn.E(textView2.getContext(), R.color.passport_logout_link));
        this.g = textView2;
        View view4 = (View) d1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view4);
        }
        ImageView imageView = (ImageView) view4;
        Context context = imageView.getContext();
        context.getClass();
        imageView.setImageDrawable(P(context, R.drawable.passport_logout_delete_trailing, R.color.passport_logout_secondary));
        imageView.setImageTintList(etn.E(imageView.getContext(), R.color.passport_logout_link));
        c7g c7gVar = new c7g(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(c7gVar);
        }
        c7gVar.setOrientation(0);
        c7gVar.setGravity(17);
        sof sofVar = c7gVar.a;
        sofVar.getClass();
        sofVar.j(textView2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c7gVar.a(-2, -2);
        layoutParams.width = -2;
        layoutParams.height = -2;
        sofVar.b(imageView, new com.yandex.passport.internal.storage.d(11));
        this.h = c7gVar;
        c7g c7gVar2 = new c7g(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(c7gVar2);
        }
        c7gVar2.setOrientation(0);
        c7gVar2.setGravity(17);
        float f = 24;
        DisplayMetrics displayMetrics = g4i.a;
        c7gVar2.setPaddingRelative((int) (displayMetrics.density * f), c7gVar2.getPaddingTop(), c7gVar2.getPaddingEnd(), c7gVar2.getPaddingBottom());
        c7gVar2.setPaddingRelative(c7gVar2.getPaddingStart(), c7gVar2.getPaddingTop(), (int) (f * displayMetrics.density), c7gVar2.getPaddingBottom());
        this.i = c7gVar2;
        com.yandex.passport.common.ui.view.g gVar = new com.yandex.passport.common.ui.view.g(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(gVar);
        }
        gVar.setFillViewport(true);
        sof sofVar2 = gVar.a;
        sofVar2.getClass();
        sofVar2.j(c7gVar2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) gVar.a.a(-2, -2);
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        int i = (int) (32 * g4i.a.density);
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i;
        c7gVar2.setLayoutParams(layoutParams2);
        this.j = gVar;
        View view5 = (View) g1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view5);
        }
        TextView textView3 = (TextView) view5;
        a0Var3.b(textView3);
        this.k = textView3;
        View view6 = (View) h1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view6);
        }
        TextView textView4 = (TextView) view6;
        a0Var4.b(textView4);
        this.l = textView4;
        View view7 = (View) i1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view7);
        }
        TextView textView5 = (TextView) view7;
        a0Var3.b(textView5);
        this.m = textView5;
        View view8 = (View) j1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view8);
        }
        TextView textView6 = (TextView) view8;
        a0Var4.b(textView6);
        this.n = textView6;
        c7g c7gVar3 = new c7g(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(c7gVar3);
        }
        c7gVar3.setOrientation(1);
        c7g Q = Q(textView3, textView4, R.id.passport_logout_option_logout_this);
        int i2 = 4;
        Continuation continuation = null;
        ldg.B(Q, new jw(this, Q, c7gVar3, continuation, i2));
        R(Q, true);
        sof sofVar3 = c7gVar3.a;
        sofVar3.getClass();
        sofVar3.j(Q);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c7gVar3.a(-2, -2);
        layoutParams3.width = -1;
        layoutParams3.height = -2;
        c7g Q2 = Q(textView5, textView6, R.id.passport_logout_option_logout_all);
        ldg.B(Q2, new jw(this, Q2, c7gVar3, continuation, i2));
        sofVar3.j(Q2);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) c7gVar3.a(-2, -2);
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        this.o = c7gVar3;
        View view9 = (View) k1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view9);
        }
        TextView textView7 = (TextView) view9;
        a0Var6.b(textView7);
        this.p = textView7;
        View view10 = (View) l1.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (z) {
            ((rof) this).j(view10);
        }
        TextView textView8 = (TextView) view10;
        a0Var5.b(textView8);
        this.q = textView8;
    }

    public static boolean O(View view) {
        View view2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    view2 = null;
                    break;
                }
                int i2 = i + 1;
                view2 = viewGroup.getChildAt(i);
                if (view2 == null) {
                    rj7.m();
                    return false;
                }
                if (view2 instanceof Checkable) {
                    break;
                }
                i = i2;
            }
            Checkable checkable = view2 instanceof Checkable ? (Checkable) view2 : null;
            if (checkable != null) {
                return checkable.isChecked();
            }
        }
        return false;
    }

    public static Drawable P(Context context, int i, int i2) {
        Drawable mutate;
        Drawable drawable = context.getDrawable(i);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        mutate.setTint(context.getColor(i2));
        return mutate;
    }

    public static void R(View view, boolean z) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            }
            Checkable checkable = childAt instanceof Checkable ? (Checkable) childAt : null;
            if (checkable != null) {
                checkable.setChecked(z);
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c7g Q(TextView textView, TextView textView2, int i) {
        WeakHashMap weakHashMap = wdu.a;
        int generateViewId = View.generateViewId();
        c7g c7gVar = new c7g(ezf.a0((Context) this.b, 0), 0, 0);
        if (generateViewId != -1) {
            c7gVar.setId(generateViewId);
        }
        if (this instanceof rof) {
            ((rof) this).j(c7gVar);
        }
        c7gVar.setOrientation(0);
        DisplayMetrics displayMetrics = g4i.a;
        int i2 = (int) (10 * displayMetrics.density);
        c7gVar.setPadding(0, i2, 0, i2);
        View view = (View) c1.a.invoke(ezf.a0(c7gVar.getCtx(), 0), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        sof sofVar = c7gVar.a;
        sofVar.j(view);
        RadioButton radioButton = (RadioButton) view;
        this.d.b(radioButton);
        ViewGroup.LayoutParams layoutParams = radioButton.getLayoutParams();
        int i3 = 12;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd((int) (12 * displayMetrics.density));
        radioButton.setLayoutParams(marginLayoutParams);
        radioButton.setClickable(false);
        radioButton.setFocusable(false);
        radioButton.setFocusableInTouchMode(false);
        c7g c7gVar2 = new c7g(ezf.a0(c7gVar.getCtx(), 0), 0, 0);
        sofVar.j(c7gVar2);
        c7gVar2.setOrientation(1);
        c7gVar2.setLayoutParams(c7gVar2.a(-1, -2));
        c7gVar2.b(textView, new com.yandex.passport.internal.storage.d(i3));
        c7gVar2.b(textView2, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar2, 8));
        return c7gVar;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        final int i = 0;
        final c7g c7gVar = new c7g(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(c7gVar);
        }
        final int i2 = 1;
        c7gVar.setOrientation(1);
        c7gVar.setPadding(c7gVar.getPaddingLeft(), (int) (44 * g4i.a.density), c7gVar.getPaddingRight(), c7gVar.getPaddingBottom());
        final com.yandex.passport.internal.storage.d dVar = new com.yandex.passport.internal.storage.d(10);
        c7gVar.b(this.e, new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        TextView textView = (TextView) obj;
                        textView.getClass();
                        ViewGroup.LayoutParams a = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a;
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.gravity = 1;
                        dVar.invoke(layoutParams);
                        textView.setLayoutParams(a);
                        break;
                    case 1:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        viewGroup.getClass();
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                        layoutParams2.gravity = -1;
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        dVar.invoke(layoutParams2);
                        layoutParams2.topMargin = (int) (8 * g4i.a.density);
                        viewGroup.setLayoutParams(layoutParams2);
                        c7g c7gVar2 = c7gVar;
                        c7gVar2.post(new com.yandex.passport.internal.interaction.c(5, viewGroup, c7gVar2));
                        break;
                    default:
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.getClass();
                        ViewGroup.LayoutParams a2 = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a2;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        dVar.invoke(layoutParams3);
                        layoutParams3.bottomMargin = (int) (24 * g4i.a.density);
                        linearLayout.setLayoutParams(a2);
                        break;
                }
                return Unit.a;
            }
        });
        c7gVar.b(this.h, new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        TextView textView = (TextView) obj;
                        textView.getClass();
                        ViewGroup.LayoutParams a = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a;
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.gravity = 1;
                        dVar.invoke(layoutParams);
                        textView.setLayoutParams(a);
                        break;
                    case 1:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        viewGroup.getClass();
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                        layoutParams2.gravity = -1;
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        dVar.invoke(layoutParams2);
                        layoutParams2.topMargin = (int) (8 * g4i.a.density);
                        viewGroup.setLayoutParams(layoutParams2);
                        c7g c7gVar2 = c7gVar;
                        c7gVar2.post(new com.yandex.passport.internal.interaction.c(5, viewGroup, c7gVar2));
                        break;
                    default:
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.getClass();
                        ViewGroup.LayoutParams a2 = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a2;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        dVar.invoke(layoutParams3);
                        layoutParams3.bottomMargin = (int) (24 * g4i.a.density);
                        linearLayout.setLayoutParams(a2);
                        break;
                }
                return Unit.a;
            }
        });
        c7gVar.b(this.j, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 9));
        c7gVar.b(this.f, new com.yandex.passport.internal.ui.bouncer.error.l(c7gVar, 10));
        final int i3 = 2;
        c7gVar.b(this.o, new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        TextView textView = (TextView) obj;
                        textView.getClass();
                        ViewGroup.LayoutParams a = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a;
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        layoutParams.gravity = 1;
                        dVar.invoke(layoutParams);
                        textView.setLayoutParams(a);
                        break;
                    case 1:
                        ViewGroup viewGroup = (ViewGroup) obj;
                        viewGroup.getClass();
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                        layoutParams2.gravity = -1;
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        dVar.invoke(layoutParams2);
                        layoutParams2.topMargin = (int) (8 * g4i.a.density);
                        viewGroup.setLayoutParams(layoutParams2);
                        c7g c7gVar2 = c7gVar;
                        c7gVar2.post(new com.yandex.passport.internal.interaction.c(5, viewGroup, c7gVar2));
                        break;
                    default:
                        LinearLayout linearLayout = (LinearLayout) obj;
                        linearLayout.getClass();
                        ViewGroup.LayoutParams a2 = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) a2;
                        layoutParams3.width = -1;
                        layoutParams3.height = -2;
                        dVar.invoke(layoutParams3);
                        layoutParams3.bottomMargin = (int) (24 * g4i.a.density);
                        linearLayout.setLayoutParams(a2);
                        break;
                }
                return Unit.a;
            }
        });
        final com.yandex.passport.internal.ui.bouncer.roundabout.k kVar = new com.yandex.passport.internal.ui.bouncer.roundabout.k(4, dVar);
        c7gVar.b(this.p, new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextView textView = (TextView) obj;
                switch (i) {
                    case 0:
                        textView.getClass();
                        ViewGroup.LayoutParams a = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a;
                        kVar.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (8 * g4i.a.density);
                        textView.setLayoutParams(a);
                        break;
                    default:
                        textView.getClass();
                        ViewGroup.LayoutParams a2 = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a2;
                        kVar.invoke(layoutParams2);
                        layoutParams2.bottomMargin = (int) (24 * g4i.a.density);
                        textView.setLayoutParams(a2);
                        break;
                }
                return Unit.a;
            }
        });
        c7gVar.b(this.q, new Function1() { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextView textView = (TextView) obj;
                switch (i2) {
                    case 0:
                        textView.getClass();
                        ViewGroup.LayoutParams a = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a;
                        kVar.invoke(layoutParams);
                        layoutParams.bottomMargin = (int) (8 * g4i.a.density);
                        textView.setLayoutParams(a);
                        break;
                    default:
                        textView.getClass();
                        ViewGroup.LayoutParams a2 = c7gVar.a(-2, -2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a2;
                        kVar.invoke(layoutParams2);
                        layoutParams2.bottomMargin = (int) (24 * g4i.a.density);
                        textView.setLayoutParams(a2);
                        break;
                }
                return Unit.a;
            }
        });
        tot totVar = new tot(22, c7gVar);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(c7gVar, totVar);
        return c7gVar;
    }
}
