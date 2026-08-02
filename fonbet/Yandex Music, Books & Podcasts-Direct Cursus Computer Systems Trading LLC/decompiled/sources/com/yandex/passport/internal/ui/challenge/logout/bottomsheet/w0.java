package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.R;
import defpackage.c7g;
import defpackage.cce;
import defpackage.ck0;
import defpackage.cs1;
import defpackage.e7t;
import defpackage.ezf;
import defpackage.fft;
import defpackage.g4i;
import defpackage.hs4;
import defpackage.ldg;
import defpackage.pce;
import defpackage.rof;
import defpackage.sof;
import defpackage.t13;
import defpackage.u75;
import defpackage.v75;
import defpackage.xee;
import defpackage.xwh;
import defpackage.xz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class w0 extends t13 {
    public final n1 l;

    public w0(n1 n1Var) {
        this.l = n1Var;
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t13
    public final Object p(Object obj, cs1 cs1Var) {
        Continuation continuation;
        Continuation continuation2;
        g0 g0Var = (g0) obj;
        n1 n1Var = this.l;
        View e = n1Var.e();
        int i = 2;
        if (e.isAttachedToWindow()) {
            g0Var.f.invoke();
        } else {
            e.addOnAttachStateChangeListener(new com.yandex.passport.internal.ui.bouncer.roundabout.n(i, e, g0Var));
        }
        TextView textView = n1Var.e;
        com.yandex.passport.common.ui.view.g gVar = n1Var.j;
        c7g c7gVar = n1Var.h;
        View view = n1Var.f;
        List list = g0Var.b;
        boolean z = g0Var.e;
        ldg.L(textView, list.size() < 2 ? R.string.passport_logout_sheet_title : R.string.passport_logout_sheet_title_profiles);
        int i2 = 8;
        Continuation continuation3 = null;
        int i3 = 0;
        if (g0Var.d) {
            ldg.L(n1Var.g, R.string.passport_logout_delete_account);
            ldg.B(c7gVar, new u0(g0Var, continuation3, i3));
            c7gVar.setVisibility(0);
        } else {
            c7gVar.setVisibility(8);
        }
        List list2 = g0Var.b;
        if (list2.size() < 2) {
            gVar.setVisibility(8);
            view.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.height = (int) ((z ? 32 : 44) * g4i.a.density);
                view.setLayoutParams(layoutParams);
            }
            continuation = null;
        } else {
            gVar.setVisibility(0);
            Context context = ((LinearLayout) n1Var.e()).getContext();
            int i4 = R.string.passport_logout_profiles_item_description;
            List list3 = list2;
            continuation = null;
            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.yandex.passport.internal.entities.n) it.next()).e);
            }
            int i5 = 1;
            gVar.setContentDescription(context.getString(i4, CollectionsKt.X(arrayList, ", ", null, null, null, 62)));
            view.setVisibility(8);
            int i6 = (int) ((list2.size() > 2 ? 72 : 96) * g4i.a.density);
            int i7 = 0;
            for (Object obj2 : list3) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    u75.n();
                    throw null;
                }
                com.yandex.passport.internal.entities.n nVar = (com.yandex.passport.internal.entities.n) obj2;
                int i9 = i7 == list2.size() + (-1) ? i3 : (int) (12 * g4i.a.density);
                nVar.getClass();
                Integer valueOf = Integer.valueOf(i3);
                c7g c7gVar2 = new c7g(ezf.a0((Context) n1Var.b, i3), i3, i3);
                if (n1Var instanceof rof) {
                    ((rof) n1Var).j(c7gVar2);
                }
                c7gVar2.setOrientation(i5);
                View view2 = (View) a1.a.invoke(ezf.a0(c7gVar2.getCtx(), i3), valueOf, valueOf);
                sof sofVar = c7gVar2.a;
                sofVar.j(view2);
                ImageView imageView = (ImageView) view2;
                int i10 = i3;
                ViewGroup.LayoutParams a = c7gVar2.a(i6, i6);
                List list4 = list2;
                ((LinearLayout.LayoutParams) a).bottomMargin = (int) (i2 * g4i.a.density);
                imageView.setLayoutParams(a);
                String str = nVar.g;
                if (str != null) {
                    cce C = hs4.C(imageView.getContext());
                    pce pceVar = new pce(imageView.getContext());
                    pceVar.c = str;
                    pceVar.f(imageView);
                    Context context2 = imageView.getContext();
                    context2.getClass();
                    String str2 = (context2.getResources().getConfiguration().uiMode & 48) + str;
                    pceVar.g = str2;
                    pceVar.f = new xwh(str2);
                    pceVar.b();
                    pceVar.c(R.drawable.passport_icon_user_unknown);
                    e7t[] e7tVarArr = new e7t[1];
                    e7tVarArr[i10] = new com.yandex.passport.internal.ui.bouncer.roundabout.avatar.b(i6, nVar.h.contains("has_plus"));
                    pceVar.j = xee.L(xz0.X(e7tVarArr));
                    C.d(pceVar.a());
                }
                View view3 = (View) b1.a.invoke(ezf.a0(c7gVar2.getCtx(), i10), valueOf, valueOf);
                sofVar.j(view3);
                TextView textView2 = (TextView) view3;
                textView2.setLayoutParams(c7gVar2.a(-1, -2));
                textView2.setTextSize(12.0f);
                ldg.K(textView2, R.color.passport_roundabout_text_primary);
                ldg.J(textView2, ru.yandex.music.R.font.ys_text_regular);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setSingleLine(true);
                textView2.setFocusable(false);
                textView2.setFocusableInTouchMode(false);
                textView2.setGravity(1);
                textView2.setText(nVar.e);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginEnd(i9);
                c7gVar2.setLayoutParams(layoutParams2);
                c7gVar2.setImportantForAccessibility(2);
                n1Var.i.addView(c7gVar2);
                i7 = i8;
                list2 = list4;
                i5 = 1;
                i2 = 8;
                i3 = 0;
            }
        }
        ldg.L(n1Var.k, R.string.passport_logout_current_app_option);
        ldg.L(n1Var.l, R.string.passport_logout_current_app_hint);
        ldg.L(n1Var.m, R.string.passport_logout_all_apps_option);
        ldg.L(n1Var.n, g0Var.c ? R.string.passport_logout_all_apps_hint : R.string.passport_logout_all_apps_hint_whitelabel);
        c7g c7gVar3 = n1Var.o;
        if (z) {
            c7gVar3.setVisibility(0);
        } else {
            c7gVar3.setVisibility(8);
        }
        TextView textView3 = n1Var.p;
        ldg.L(textView3, R.string.passport_logout_exit);
        if (z) {
            continuation2 = continuation;
            ldg.B(textView3, new ck0(n1Var, g0Var, continuation2, 7));
        } else {
            continuation2 = continuation;
            ldg.B(textView3, new u0(g0Var, continuation2, 1));
        }
        TextView textView4 = n1Var.q;
        ldg.L(textView4, R.string.passport_reg_cancel);
        ldg.B(textView4, new u0(g0Var, continuation2, 2));
        return Unit.a;
    }
}
