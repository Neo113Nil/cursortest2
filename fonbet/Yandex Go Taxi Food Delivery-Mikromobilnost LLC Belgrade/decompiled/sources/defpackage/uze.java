package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.x0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.yandex.plus.home.common.ui.DisabledEmptyLineClickLinkMovementMethod;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.uze;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class uze {
    public static final /* synthetic */ kgx[] n = {new PropertyReference1Impl("toolbar", 0, "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", uze.class), b64.x(qoi0.a, uze.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new PropertyReference1Impl("subtitleTextView", 0, "getSubtitleTextView()Landroid/widget/TextView;", uze.class), new PropertyReference1Impl("offersRecyclerView", 0, "getOffersRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", uze.class), new PropertyReference1Impl("alternativeActionTextTextView", 0, "getAlternativeActionTextTextView()Landroid/widget/TextView;", uze.class), new PropertyReference1Impl("supportTextTextView", 0, "getSupportTextTextView()Landroid/widget/TextView;", uze.class), new PropertyReference1Impl("errorCodeTextView", 0, "getErrorCodeTextView()Landroid/widget/TextView;", uze.class), new PropertyReference1Impl("nextOfferButton", 0, "getNextOfferButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", uze.class), new PropertyReference1Impl("previousOfferButton", 0, "getPreviousOfferButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", uze.class)};
    public final CounterOffersContentView a;
    public final tls b;
    public final wv5 c;
    public final wv5 d;
    public final wv5 e;
    public final wv5 f;
    public final wv5 g;
    public final wv5 h;
    public final wv5 i;
    public final wv5 j;
    public final LinearLayoutManager k;
    public final qze l;
    public final lgd0 m;

    public uze(CounterOffersContentView counterOffersContentView, b5d0 b5d0Var, gbd0 gbd0Var, sls slsVar, tls tlsVar, tls tlsVar2) {
        this.a = counterOffersContentView;
        this.b = tlsVar;
        int i = z9h0.counter_offers_toolbar;
        wv5 wv5Var = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_title, 12));
        this.c = wv5Var;
        wv5 wv5Var2 = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_subtitle, 13));
        this.d = wv5Var2;
        this.e = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_recycler, 14));
        wv5 wv5Var3 = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_alternative_action_text, 15));
        this.f = wv5Var3;
        wv5 wv5Var4 = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_support_text, 16));
        this.g = wv5Var4;
        this.h = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_error_code_text, 17));
        wv5 wv5Var5 = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_next_button, 18));
        this.i = wv5Var5;
        wv5 wv5Var6 = new wv5(new j6c(counterOffersContentView, z9h0.counter_offers_previous_button, 19));
        this.j = wv5Var6;
        f0 f0Var = new f0();
        final int i2 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(counterOffersContentView.getContext(), 0, false);
        this.k = linearLayoutManager;
        qze qzeVar = new qze((PlusTheme) ((n4u0) ((qc20) gbd0Var).a).getValue(), b5d0Var, tlsVar2);
        this.l = qzeVar;
        kgx[] kgxVarArr = n;
        kgx kgxVar = kgxVarArr[0];
        try {
            View findViewById = counterOffersContentView.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView");
            }
            this.m = new lgd0((PlusPayToolbarView) findViewById, b5d0Var, slsVar);
            d().setAdapter(qzeVar);
            d().setLayoutManager(linearLayoutManager);
            bb1.L((FloatingActionButton) wv5Var6.a(kgxVarArr[8]), new View.OnClickListener(this) { // from class: sze
                public final /* synthetic */ uze b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    uze uzeVar = this.b;
                    switch (i3) {
                        case 0:
                            int H1 = uzeVar.k.H1();
                            if (H1 != 0) {
                                uzeVar.d().smoothScrollToPosition(H1 - 1);
                                break;
                            }
                            break;
                        default:
                            int L1 = uzeVar.k.L1();
                            if (L1 != r2.getItemCount() - 1) {
                                uzeVar.d().smoothScrollToPosition(L1 + 1);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i3 = 1;
            bb1.L((FloatingActionButton) wv5Var5.a(kgxVarArr[7]), new View.OnClickListener(this) { // from class: sze
                public final /* synthetic */ uze b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i3;
                    uze uzeVar = this.b;
                    switch (i32) {
                        case 0:
                            int H1 = uzeVar.k.H1();
                            if (H1 != 0) {
                                uzeVar.d().smoothScrollToPosition(H1 - 1);
                                break;
                            }
                            break;
                        default:
                            int L1 = uzeVar.k.L1();
                            if (L1 != r2.getItemCount() - 1) {
                                uzeVar.d().smoothScrollToPosition(L1 + 1);
                                break;
                            }
                            break;
                    }
                }
            });
            d().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.CounterOffersContentViewController$special$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    uze.a(uze.this);
                    uze.c(uze.this);
                    uze.b(uze.this);
                }
            });
            d().addOnScrollListener(new tze(this));
            f0Var.b(d());
            ((TextView) wv5Var.a(kgxVarArr[1])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
            ((TextView) wv5Var2.a(kgxVarArr[2])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
            ((TextView) wv5Var3.a(kgxVarArr[4])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
            ((TextView) wv5Var4.a(kgxVarArr[5])).setMovementMethod(new DisabledEmptyLineClickLinkMovementMethod());
        } catch (ClassCastException e) {
            dy31.f(kgxVar, e);
            throw null;
        }
    }

    public static final void a(uze uzeVar) {
        LinearLayoutManager linearLayoutManager = uzeVar.k;
        int K1 = linearLayoutManager.K1();
        int M1 = linearLayoutManager.M1();
        if (K1 > M1) {
            return;
        }
        while (true) {
            View X = linearLayoutManager.X(K1);
            if (X != null && e(0.8f, X)) {
                uzeVar.b.invoke(Integer.valueOf(K1));
            }
            if (K1 == M1) {
                return;
            } else {
                K1++;
            }
        }
    }

    public static final void b(uze uzeVar) {
        LinearLayoutManager linearLayoutManager = uzeVar.k;
        wv5 wv5Var = uzeVar.i;
        int M1 = linearLayoutManager.M1();
        x0 findViewHolderForLayoutPosition = uzeVar.d().findViewHolderForLayoutPosition(M1);
        if (findViewHolderForLayoutPosition == null) {
            return;
        }
        View view = findViewHolderForLayoutPosition.a;
        int itemCount = linearLayoutManager.getItemCount() - 1;
        kgx[] kgxVarArr = n;
        if (M1 == itemCount && e(1.0f, view)) {
            ((FloatingActionButton) wv5Var.a(kgxVarArr[7])).hide();
        } else {
            ((FloatingActionButton) wv5Var.a(kgxVarArr[7])).show();
        }
    }

    public static final void c(uze uzeVar) {
        LinearLayoutManager linearLayoutManager = uzeVar.k;
        wv5 wv5Var = uzeVar.j;
        int K1 = linearLayoutManager.K1();
        x0 findViewHolderForLayoutPosition = uzeVar.d().findViewHolderForLayoutPosition(K1);
        if (findViewHolderForLayoutPosition == null) {
            return;
        }
        View view = findViewHolderForLayoutPosition.a;
        kgx[] kgxVarArr = n;
        if (K1 == 0 && e(1.0f, view)) {
            ((FloatingActionButton) wv5Var.a(kgxVarArr[8])).hide();
        } else {
            ((FloatingActionButton) wv5Var.a(kgxVarArr[8])).show();
        }
    }

    public static boolean e(float f, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) >= ((float) view.getWidth()) * f;
    }

    public final RecyclerView d() {
        return (RecyclerView) this.e.a(n[3]);
    }
}
