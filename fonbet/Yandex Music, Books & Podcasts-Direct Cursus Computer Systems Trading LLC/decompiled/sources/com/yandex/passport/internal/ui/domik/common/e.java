package com.yandex.passport.internal.ui.domik.common;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.data.models.k;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.common.g;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.util.m;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;
import defpackage.l83;
import defpackage.phg;
import defpackage.srb;
import defpackage.xal;

/* loaded from: classes4.dex */
public abstract class e<V extends com.yandex.passport.internal.ui.domik.base.b & g, T extends com.yandex.passport.internal.ui.domik.e> extends com.yandex.passport.internal.ui.domik.base.a<V, T> {
    public ConfirmationCodeInput t;
    public View u;
    public com.yandex.passport.internal.smsretriever.b v;
    public com.yandex.passport.internal.ui.util.a w;
    public final l83 x = new l83(25, this);

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d
    public final void A(boolean z) {
        super.A(z);
        this.t.setEditable(!z);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        return "confirmations_limit.exceeded".equals(str) || "code.invalid".equals(str) || "rate.limit_exceeded".equals(str) || "code.empty".equals(str);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final void K(com.yandex.passport.internal.ui.e eVar, String str) {
        super.K(eVar, str);
        this.t.requestFocus();
    }

    public final void L() {
        this.q.d();
        g gVar = (g) ((com.yandex.passport.internal.ui.domik.base.b) this.g);
        com.yandex.passport.internal.ui.domik.e eVar = this.o;
        String code = this.t.getCode();
        gVar.getClass();
        eVar.getClass();
        code.getClass();
        com.yandex.passport.internal.interaction.a aVar = gVar.t;
        aVar.getClass();
        aVar.c.m(Boolean.TRUE);
        aVar.a.a(z5.d(new srb(aVar, eVar, code, gVar instanceof com.yandex.passport.internal.ui.domik.smsauth.b, 5)));
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.yandex.passport.internal.smsretriever.b smsRetrieverHelper = com.yandex.passport.internal.di.a.a().getSmsRetrieverHelper();
        this.v = smsRetrieverHelper;
        smsRetrieverHelper.b();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(E().getDomikDesignProvider().c, viewGroup, false);
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onDestroyView() {
        com.yandex.passport.internal.ui.util.a aVar = this.w;
        aVar.g.removeCallbacks(aVar.h);
        super.onDestroyView();
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.yandex.passport.internal.ui.util.a aVar = this.w;
        if (aVar != null) {
            aVar.getClass();
            bundle.getClass();
            bundle.putBoolean("resend_button_clicked", aVar.e);
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        context.getClass();
        phg.a(context).b(this.x, new IntentFilter("com.yandex.passport.internal.SMS_CODE_RECEIVED"));
        this.w.a();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, androidx.fragment.app.o
    public final void onStop() {
        Context context = getContext();
        context.getClass();
        phg.a(context).d(this.x);
        super.onStop();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.t = (ConfirmationCodeInput) view.findViewById(R.id.input_phone_code);
        com.yandex.passport.internal.ui.domik.e eVar = this.o;
        String str = eVar instanceof com.yandex.passport.internal.ui.domik.d ? ((com.yandex.passport.internal.ui.domik.d) eVar).n : null;
        if (str == null) {
            str = eVar.d();
        }
        Spanned fromHtml = Html.fromHtml(getString(R.string.passport_sms_text, "<br />".concat(com.yandex.passport.legacy.f.e(str))));
        ((TextView) view.findViewById(R.id.text_message)).setText(fromHtml);
        this.t.setContentDescription(fromHtml);
        this.t.h.add(new c(this));
        this.j.setOnClickListener(new xal(18, this));
        this.w = new com.yandex.passport.internal.ui.util.a((Button) view.findViewById(R.id.button_resend_sms), new d(this, 0));
        k kVar = (k) requireArguments().getParcelable("phone_confirmation_result");
        kVar.getClass();
        com.yandex.passport.internal.ui.util.a aVar = this.w;
        aVar.f = kVar.a;
        aVar.a();
        com.yandex.passport.internal.ui.util.a aVar2 = this.w;
        boolean z = false;
        if (bundle != null) {
            aVar2.getClass();
            z = bundle.getBoolean("resend_button_clicked", false);
        }
        aVar2.e = z;
        this.t.setCodeLength(kVar.c);
        com.yandex.passport.internal.ui.base.d.B(this.t, this.l);
        this.p.y.f(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.autologin.b(1, this));
        this.t.setOnEditorActionListener(new m(new d(this, 1)));
        this.u = view.findViewById(R.id.scroll_view_content);
        ((g) ((com.yandex.passport.internal.ui.domik.base.b) this.g)).s.n(getViewLifecycleOwner(), new com.yandex.passport.internal.links.i(2, this));
    }
}
