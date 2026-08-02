package com.yandex.passport.internal.ui.domik.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.t;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.ui.base.d;
import com.yandex.passport.internal.ui.base.m;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.domik.f;
import com.yandex.passport.internal.ui.domik.k;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.ui.i;
import com.yandex.passport.internal.util.j;
import com.yandex.passport.legacy.c;
import defpackage.b6e;
import defpackage.bjt;
import defpackage.cxb;
import defpackage.e3o;
import defpackage.e5b;
import defpackage.ern;
import defpackage.gfu;
import defpackage.gr0;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.tn3;
import defpackage.xq0;
import defpackage.xr6;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class a<V extends b, T extends e> extends d<V> {
    public Button j;
    public TextView k;
    public TextView l;
    public View m;
    public ScrollView n;
    public e o;
    public f p;
    public n0 q;
    public o0 r;
    public Typeface s;

    public static a D(e eVar, Callable callable) {
        try {
            a aVar = (a) callable.call();
            Bundle bundle = new Bundle();
            eVar.getClass();
            bundle.putAll(cxb.K(new Pair("track", eVar)));
            aVar.setArguments(bundle);
            return aVar;
        } catch (Exception e) {
            b6e.q(e);
            return null;
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public void A(boolean z) {
        View view = this.m;
        if (view != null) {
            view.setVisibility(z ? 0 : 4);
        }
        Button button = this.j;
        if (button != null) {
            button.setEnabled(!z);
        }
    }

    public final com.yandex.passport.internal.ui.domik.di.a E() {
        return ((DomikActivity) ((k) requireActivity())).j;
    }

    public abstract m0 F();

    public void G() {
        TextView textView = this.k;
        if (textView != null) {
            E().getDomikDesignProvider().getClass();
            textView.setVisibility(4);
        }
    }

    public abstract boolean H(String str);

    public final void I(View view) {
        if (view instanceof TextInputLayout) {
            ((TextInputLayout) view).setTypeface(this.s);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                I(viewGroup.getChildAt(i));
            }
        }
    }

    public void K(com.yandex.passport.internal.ui.e eVar, String str) {
        TextView textView = this.k;
        if (textView == null) {
            return;
        }
        textView.setText(eVar.b(str));
        this.k.setVisibility(0);
        TextView textView2 = this.k;
        if (textView2 != null) {
            textView2.performAccessibilityAction(64, null);
        }
        if (textView2 != null) {
            textView2.sendAccessibilityEvent(SQLiteDatabase.OPEN_NOMUTEX);
        }
        ScrollView scrollView = this.n;
        if (scrollView != null) {
            scrollView.post(new androidx.core.app.a(9, this));
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        t requireActivity = requireActivity();
        requireActivity.getClass();
        jfu viewModelStore = requireActivity.getViewModelStore();
        gfu defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
        is6 defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        lm4 a = ern.a(f.class);
        String f = a.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.p = (f) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        e eVar = (e) requireArguments().getParcelable("track");
        eVar.getClass();
        this.o = eVar;
        PassportProcessGlobalComponent a2 = com.yandex.passport.internal.di.a.a();
        this.q = a2.getStatefulReporter();
        this.r = a2.getEventReporter();
        a2.getFlagRepository();
        setHasOptionsMenu(true);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
        com.yandex.passport.internal.ui.f fVar = this.p.C;
        if (fVar != null) {
            ((b) this.g).k.l(fVar);
            this.p.C = null;
        }
        f fVar2 = this.p;
        com.yandex.passport.internal.ui.f fVar3 = fVar2.D;
        if (fVar3 != null) {
            fVar2.D = fVar3;
            fVar2.q.m(new m(null, "pop_back", false, 1));
        }
        super.onStart();
        if (F() != m0.NONE) {
            e eVar = this.o;
            boolean z = eVar instanceof a0;
            n0 n0Var = this.q;
            if (z) {
                n0Var.c = ((a0) eVar).j;
            } else {
                n0Var.c = null;
            }
            m0 F = F();
            n0Var.getClass();
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            n0Var.e = F;
            n0Var.c(F, l0.OPEN_SCREEN, n0Var.a(e5bVar));
        }
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
        super.onStop();
        if (F() != m0.NONE) {
            n0 n0Var = this.q;
            m0 F = F();
            n0Var.getClass();
            l0 l0Var = l0.CLOSE_SCREEN;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            n0Var.c(F, l0Var, e5bVar);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        try {
            this.s = e3o.a(requireContext(), R.font.ys_text_regular);
        } catch (Resources.NotFoundException unused) {
        }
        I(view);
        super.onViewCreated(view, bundle);
        this.j = (Button) view.findViewById(com.yandex.passport.R.id.button_next);
        this.k = (TextView) view.findViewById(com.yandex.passport.R.id.text_error);
        this.l = (TextView) view.findViewById(com.yandex.passport.R.id.text_message);
        this.m = view.findViewById(com.yandex.passport.R.id.progress);
        this.n = (ScrollView) view.findViewById(com.yandex.passport.R.id.scroll_view);
        com.yandex.passport.legacy.f.h(com.yandex.passport.R.color.passport_progress_bar, view);
        G();
        TextView textView = (TextView) view.findViewById(com.yandex.passport.R.id.text_legal);
        if (textView != null) {
            n0 n0Var = this.q;
            x properties = com.yandex.passport.internal.di.a.a().getProperties();
            y1 y1Var = this.o.e().e;
            Context context = textView.getContext();
            String string = context.getString(com.yandex.passport.R.string.passport_use_eula_agreement);
            String c = com.yandex.passport.legacy.f.c(context, properties, false);
            String d = com.yandex.passport.legacy.f.d(context, properties, false);
            String string2 = context.getString(com.yandex.passport.R.string.passport_eula_wallet_license_url);
            String string3 = context.getString(com.yandex.passport.R.string.passport_eula_taxi_agreement_url_override);
            String string4 = context.getString(com.yandex.passport.R.string.passport_eula_user_agreement_text);
            String string5 = context.getString(com.yandex.passport.R.string.passport_eula_privacy_policy_text);
            SpannableString spannableString = new SpannableString(Html.fromHtml("taxi".equalsIgnoreCase(context.getString(com.yandex.passport.R.string.passport_use_eula_agreement)) ? context.getString(com.yandex.passport.R.string.passport_eula_reg_taxi_format_android, com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(string3, context.getString(com.yandex.passport.R.string.passport_eula_taxi_agreement_text_override))), com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(c, string4)), com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(d, string5))) : (context.getPackageName().startsWith("ru.yandex.money") || "money".equalsIgnoreCase(string)) ? context.getString(com.yandex.passport.R.string.passport_eula_reg_money_format_android, com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(c, string4)), com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(d, string5)), com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(string2, context.getString(com.yandex.passport.R.string.passport_eula_wallet_license_text)))) : context.getString(com.yandex.passport.R.string.passport_eula_reg_format_android, com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(c, string4)), com.yandex.passport.legacy.f.e(com.yandex.passport.legacy.f.f(d, string5)))));
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new com.yandex.passport.legacy.e(uRLSpan.getURL()), spanStart, spanEnd, 0);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(new j(new c(c, n0Var, d, string2, string3, textView, y1Var)));
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public void z(com.yandex.passport.internal.ui.f fVar) {
        String str = fVar.a;
        this.q.b(fVar);
        o oVar = ((b) this.g).q;
        if (oVar.b.contains(str) || com.yandex.passport.internal.ui.e.d.matcher(str).find()) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(getString(((b) this.g).q.b(str)));
            valueOf.setSpan(new RelativeSizeSpan(1.2f), 0, valueOf.length(), 0);
            this.p.x.m(valueOf.toString());
            View view = getView();
            if (view != null) {
                view.announceForAccessibility(valueOf);
                return;
            }
            return;
        }
        if ("action.required_external_or_native".equals(str) || "action.required_native".equals(str)) {
            if ("action.required_external_or_native".equals(str)) {
                v domikRouter = E().getDomikRouter();
                com.yandex.passport.internal.ui.domik.d h = this.o.h();
                domikRouter.getClass();
                domikRouter.a.q.m(new m(new tn3(11, h), "ExternalActionFragment.FRAGMENT_TAG", true, 3));
                return;
            }
            f fVar2 = this.p;
            fVar2.C = fVar;
            fVar2.q.m(new m(null, "pop_back", false, 1));
            this.q.b(fVar);
            return;
        }
        if (!oVar.c.contains(str)) {
            if (H(str)) {
                K(oVar, str);
                return;
            }
            f fVar3 = this.p;
            fVar3.C = fVar;
            fVar3.q.m(new m(null, "pop_back", false, 1));
            return;
        }
        xr6 xr6Var = new xr6(1, this, fVar);
        o oVar2 = ((b) this.g).q;
        i iVar = new i(requireContext(), E().getDomikDesignProvider().d);
        Context requireContext = requireContext();
        oVar2.getClass();
        iVar.e = requireContext.getString(com.yandex.passport.R.string.passport_fatal_error_dialog_text);
        iVar.b(oVar2.b(str));
        iVar.b = false;
        iVar.c = false;
        iVar.c(com.yandex.passport.R.string.passport_fatal_error_dialog_button, xr6Var);
        gr0 a = iVar.a();
        this.i.add(new WeakReference(a));
        a.show();
    }
}
