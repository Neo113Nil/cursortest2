package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.f;
import com.yandex.plus.acquisition.sdk.pay.common.api.j;
import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.acquisition.sdk.pay.impl.analytics.d;
import com.yandex.plus.acquisition.sdk.pay.impl.analytics.e;
import com.yandex.plus.acquisition.sdk.pay.impl.b;
import com.yandex.plus.core.strings.a;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class mw3 {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;

    public mw3(f fVar, c cVar, b bVar, a aVar) {
        cVar.getClass();
        aVar.getClass();
        this.a = fVar;
        this.b = cVar;
        this.c = bVar;
        this.d = aVar;
        this.g = btf.b(new h0(23, this));
    }

    public void a(kw3 kw3Var, mv3 mv3Var, cdv cdvVar, sx3 sx3Var) {
        kw3Var.getClass();
        this.c = kw3Var;
        kw3Var.setOnStateChangeListener(new m40(20, this));
        mv3Var.j(new iv3(yv3.a));
        mv3Var.p(new k5(17, this));
        this.d = mv3Var;
        this.e = cdvVar;
        sx3Var.a(nx3.a);
        this.f = sx3Var;
    }

    public void b(com.yandex.plus.acquisition.sdk.button.section.ui.api.a aVar) {
        int i;
        int i2;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        aVar.getClass();
        k kVar = aVar.a;
        boolean z = kVar.f;
        f fVar = (f) this.a;
        TextView legalsTextView = fVar.getLegalsTextView();
        if (z) {
            legalsTextView.setMovementMethod(LinkMovementMethod.getInstance());
            legalsTextView.setText(aVar.b, TextView.BufferType.SPANNABLE);
        }
        Context context = fVar.getView().getContext();
        context.getClass();
        int dimensionPixelSize = z ? context.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_100) : context.getResources().getDimensionPixelSize(R.dimen.acquisition_sdk_dimension_size_200);
        n20 n20Var = (n20) this.e;
        int i3 = 0;
        if (n20Var != null) {
            int paddingBottom = fVar.getView().getPaddingBottom();
            AnimatorSet animatorSet = null;
            if (z) {
                legalsTextView.getClass();
                Object parent = legalsTextView.getParent();
                parent.getClass();
                View view = (View) parent;
                legalsTextView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getHeight(), Integer.MIN_VALUE));
                int measuredHeight = legalsTextView.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i4 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                i = i4 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
            } else {
                i = 0;
            }
            int height = fVar.getView().getHeight();
            int i5 = (height - paddingBottom) + dimensionPixelSize + i;
            legalsTextView.getClass();
            if (legalsTextView.getVisibility() == 8) {
                i2 = 0;
            } else {
                int height2 = legalsTextView.getHeight();
                ViewGroup.LayoutParams layoutParams3 = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i6 = height2 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                ViewGroup.LayoutParams layoutParams4 = legalsTextView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                i2 = i6 + (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
            }
            int i7 = i5 - i2;
            View view2 = fVar.getView();
            ps psVar = new ps(legalsTextView, z, 12);
            view2.getClass();
            if (!n20Var.a) {
                n20Var.a = true;
                if (height == i7) {
                    valueAnimator = null;
                } else {
                    valueAnimator = new ValueAnimator();
                    int i8 = view2.getLayoutParams().height;
                    valueAnimator.setIntValues(height, i7);
                    com.yandex.plus.pay.ui.core.b.h(valueAnimator, new xvb(view2, 3));
                    valueAnimator.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(i3, new xkg(i8, view2)));
                }
                if (paddingBottom == dimensionPixelSize) {
                    valueAnimator2 = null;
                } else {
                    valueAnimator2 = new ValueAnimator();
                    valueAnimator2.setIntValues(paddingBottom, dimensionPixelSize);
                    com.yandex.plus.pay.ui.core.b.h(valueAnimator2, new xvb(view2, 4));
                }
                ArrayList arrayList = new ArrayList();
                if (valueAnimator != null) {
                    arrayList.add(valueAnimator);
                }
                if (valueAnimator2 != null) {
                    arrayList.add(valueAnimator2);
                }
                if (!arrayList.isEmpty()) {
                    animatorSet = new AnimatorSet();
                    animatorSet.setDuration(200L);
                    animatorSet.setInterpolator(new LinearInterpolator());
                    animatorSet.playTogether(arrayList);
                    animatorSet.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.animators.b(arrayList, psVar, n20Var));
                }
                if (animatorSet != null) {
                    animatorSet.start();
                }
            }
        } else {
            legalsTextView.setVisibility(z ? 0 : 8);
            View view3 = fVar.getView();
            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), dimensionPixelSize);
        }
        fVar.getPurchaseButton().getPurchaseTextView().setText(kVar.g.b);
    }

    public void c() {
        f fVar = (f) this.a;
        View view = fVar.getPurchaseButton().getView();
        jyr jyrVar = (jyr) this.g;
        view.setBackground(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) jyrVar.getValue()).a);
        fVar.getPurchaseButton().getPurchaseTextView().setTextAppearance(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) jyrVar.getValue()).b);
        fVar.getPurchaseButton().getReadMoreTextView().setTextAppearance(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.a) jyrVar.getValue()).b);
    }

    public void d(int i) {
        View view = ((f) this.a).getView();
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public void e() {
        f fVar = (f) this.a;
        fVar.getView().setVisibility(0);
        fVar.getContentContainer().setVisibility(0);
        fVar.getPurchaseButton().getView().setVisibility(0);
        fVar.getProgressBar().setVisibility(8);
    }

    public abstract void f();

    public void g() {
        this.e = null;
        this.f = null;
        f fVar = (f) this.a;
        View view = fVar.getView();
        view.getClass();
        com.yandex.plus.core.locale.b.D(-2, view);
        FrameLayout contentContainer = fVar.getContentContainer();
        contentContainer.getClass();
        com.yandex.plus.core.locale.b.D(-2, contentContainer);
        fVar.getContentContainer().removeAllViews();
    }

    public void h(k kVar, com.yandex.plus.acquisition.sdk.pay.common.api.a aVar) {
        kVar.getClass();
        aVar.getClass();
        c cVar = (c) this.b;
        Long l = kVar.j.e;
        String str = kVar.b;
        String str2 = kVar.c;
        int i = kVar.a;
        j jVar = kVar.g;
        String str3 = jVar.a;
        String str4 = jVar.f;
        String str5 = jVar.d;
        cVar.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a aVar2 = cVar.a;
        String l2 = l != null ? l.toString() : null;
        if (l2 == null) {
            l2 = "no_value";
        }
        if (str == null) {
            str = "no_value";
        }
        if (str2 == null) {
            str2 = "no_value";
        }
        aVar2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("config_id", l2);
        linkedHashMap.put(Constants.KEY_PAGE, str);
        eta.m(i, "place", str2, "position", linkedHashMap);
        linkedHashMap.put("title", str3);
        linkedHashMap.put("subtitle", str4);
        linkedHashMap.put("button_text", str5);
        linkedHashMap.put("_meta", com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a.a(new HashMap()));
        aVar2.b("OfferSection.Showed", linkedHashMap);
        e eVar = (e) ((com.yandex.plus.acquisition.sdk.pay.common.api.b) ((b) this.c).h.getValue());
        eVar.getClass();
        PlusPayCompositeOffers.Offer a = ((com.yandex.plus.acquisition.sdk.pay.impl.providers.b) eVar.d).a(kVar);
        if (a != null) {
            x97.y(eVar.e, null, null, new d(eVar, a, kVar, aVar, null), 3);
        }
    }

    public void i(bfk bfkVar) {
        bfkVar.getClass();
        cdv cdvVar = (cdv) this.e;
        if (cdvVar != null) {
            cdvVar.C(ycv.a);
        }
        sx3 sx3Var = (sx3) this.f;
        if (sx3Var != null) {
            sx3Var.a(new mx3(bfkVar));
        }
    }

    public lv3 j(jw3 jw3Var) {
        jw3Var.getClass();
        int ordinal = jw3Var.ordinal();
        if (ordinal == 0) {
            return new iv3(yv3.a);
        }
        if (ordinal == 1) {
            return new jv3(yv3.a);
        }
        if (ordinal == 2) {
            return new iv3(yv3.b);
        }
        if (ordinal == 3) {
            return new jv3(yv3.b);
        }
        b6e.s();
        return null;
    }

    public mw3(g0c g0cVar) {
        g0cVar.getClass();
        this.a = g0cVar;
        this.b = new lw3(0, this);
        this.g = jw3.a;
    }
}
