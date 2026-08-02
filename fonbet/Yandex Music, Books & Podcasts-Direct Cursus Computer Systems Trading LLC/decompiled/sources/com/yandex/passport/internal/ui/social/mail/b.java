package com.yandex.passport.internal.ui.social.mail;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.links.i;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.base.d;
import com.yandex.passport.internal.ui.f;
import com.yandex.passport.internal.ui.g;
import com.yandex.passport.internal.ui.social.gimap.h;
import com.yandex.passport.internal.ui.util.k;
import com.yandex.passport.internal.ui.util.n;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.internal.widget.InputFieldView;
import com.yandex.passport.internal.y;
import defpackage.ca8;
import defpackage.cq4;
import defpackage.cx3;
import defpackage.dq7;
import defpackage.dzf;
import defpackage.gr0;
import defpackage.mn7;
import defpackage.oba;
import defpackage.ot0;
import defpackage.v24;
import defpackage.x97;
import defpackage.xq0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/yandex/passport/internal/ui/social/mail/b;", "Lcom/yandex/passport/internal/ui/base/d;", "Lcom/yandex/passport/internal/ui/social/mail/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "com/yandex/passport/internal/ui/social/gimap/h", "com/yandex/passport/internal/ui/social/mail/a", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class b extends d<c> implements View.OnClickListener {
    public static final String[] p = {"rambler.ru", "lenta.ru", "autorambler.ru", "myrambler.ru", "ro.ru", "rambler.ua"};
    public InputFieldView j;
    public InputFieldView k;
    public Button l;
    public gr0 m;
    public LinearLayout n;
    public com.yandex.passport.internal.ui.login.a o;

    @Override // com.yandex.passport.internal.ui.base.d
    public final void A(boolean z) {
        gr0 gr0Var = this.m;
        if (z) {
            if (gr0Var != null) {
                gr0Var.show();
                return;
            } else {
                Intrinsics.j("progressDialog");
                throw null;
            }
        }
        if (gr0Var != null) {
            gr0Var.dismiss();
        } else {
            Intrinsics.j("progressDialog");
            throw null;
        }
    }

    public final void D() {
        E();
        InputFieldView inputFieldView = this.j;
        if (inputFieldView == null) {
            Intrinsics.j("inputLogin");
            throw null;
        }
        String obj = inputFieldView.getEditText().getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(obj.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj2 = obj.subSequence(i, length + 1).toString();
        InputFieldView inputFieldView2 = this.k;
        if (inputFieldView2 == null) {
            Intrinsics.j("inputPassword");
            throw null;
        }
        String obj3 = inputFieldView2.getEditText().getText().toString();
        c cVar = (c) this.g;
        cVar.getClass();
        obj2.getClass();
        obj3.getClass();
        a0 a = y.a(w1.m);
        cVar.s.v(a, false, "native_mail_password");
        cVar.l.m(Boolean.TRUE);
        cq4 F = ot0.F(cVar);
        dq7 dq7Var = ca8.a;
        x97.y(F, mn7.d, null, new v24(cVar, obj2, obj3, a, (Continuation) null, 19), 2);
    }

    public final void E() {
        if (this.o != null) {
            InputFieldView inputFieldView = this.j;
            if (inputFieldView == null) {
                Intrinsics.j("inputLogin");
                throw null;
            }
            Editable text = inputFieldView.getEditText().getText();
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class);
            if (foregroundColorSpanArr.length > 0) {
                text.removeSpan(foregroundColorSpanArr[0]);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (view.getId() == R.id.button_sign_in) {
            D();
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_rambler_login, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.input_login);
        findViewById.getClass();
        this.j = (InputFieldView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.input_password);
        findViewById2.getClass();
        this.k = (InputFieldView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.button_sign_in);
        findViewById3.getClass();
        Button button = (Button) findViewById3;
        this.l = button;
        button.setOnClickListener(this);
        Button button2 = this.l;
        if (button2 == null) {
            Intrinsics.j("signInButton");
            throw null;
        }
        button2.setEnabled(false);
        this.m = g.a(requireContext());
        InputFieldView inputFieldView = this.j;
        if (inputFieldView == null) {
            Intrinsics.j("inputLogin");
            throw null;
        }
        EditText editText = inputFieldView.getEditText();
        InputFieldView inputFieldView2 = this.k;
        if (inputFieldView2 == null) {
            Intrinsics.j("inputPassword");
            throw null;
        }
        editText.addTextChangedListener(new h(this, inputFieldView2));
        InputFieldView inputFieldView3 = this.k;
        if (inputFieldView3 == null) {
            Intrinsics.j("inputPassword");
            throw null;
        }
        EditText editText2 = inputFieldView3.getEditText();
        InputFieldView inputFieldView4 = this.k;
        if (inputFieldView4 == null) {
            Intrinsics.j("inputPassword");
            throw null;
        }
        editText2.addTextChangedListener(new h(this, inputFieldView4));
        InputFieldView inputFieldView5 = this.j;
        if (inputFieldView5 == null) {
            Intrinsics.j("inputLogin");
            throw null;
        }
        EditText editText3 = inputFieldView5.getEditText();
        editText3.getClass();
        this.o = new com.yandex.passport.internal.ui.login.a(p, editText3.getHintTextColors().getDefaultColor());
        Editable text = editText3.getText();
        text.setSpan(this.o, 0, text.length(), 18);
        View findViewById4 = inflate.findViewById(R.id.button_password_masking);
        InputFieldView inputFieldView6 = this.k;
        if (inputFieldView6 == null) {
            Intrinsics.j("inputPassword");
            throw null;
        }
        findViewById4.setOnClickListener(new n(inputFieldView6.getEditText()));
        InputFieldView inputFieldView7 = this.j;
        if (inputFieldView7 == null) {
            Intrinsics.j("inputLogin");
            throw null;
        }
        inputFieldView7.getEditText().setOnFocusChangeListener(new cx3(14, this));
        Bundle arguments = getArguments();
        arguments.getClass();
        boolean containsKey = arguments.containsKey("suggested-login");
        InputFieldView inputFieldView8 = this.j;
        if (containsKey) {
            if (inputFieldView8 == null) {
                Intrinsics.j("inputLogin");
                throw null;
            }
            EditText editText4 = inputFieldView8.getEditText();
            Bundle arguments2 = getArguments();
            arguments2.getClass();
            editText4.setText(arguments2.getString("suggested-login"));
            InputFieldView inputFieldView9 = this.k;
            if (inputFieldView9 == null) {
                Intrinsics.j("inputPassword");
                throw null;
            }
            inputFieldView9.requestFocus();
        } else {
            if (inputFieldView8 == null) {
                Intrinsics.j("inputLogin");
                throw null;
            }
            inputFieldView8.requestFocus();
        }
        View findViewById5 = inflate.findViewById(R.id.login_button_with_notice_form);
        findViewById5.getClass();
        this.n = (LinearLayout) findViewById5;
        ((TextView) inflate.findViewById(R.id.passport_login_rambler_notice_step1)).setText(getString(R.string.passport_login_rambler_notice_detail_comment, 1));
        ((TextView) inflate.findViewById(R.id.passport_login_rambler_notice_step2)).setText(getString(R.string.passport_login_rambler_notice_detail_comment, 2));
        ((TextView) inflate.findViewById(R.id.passport_login_rambler_notice_step3)).setText(getString(R.string.passport_login_rambler_notice_detail_comment, 3));
        return inflate;
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        k kVar = ((c) this.g).t;
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        i iVar = new i(3, this);
        kVar.getClass();
        kVar.f(viewLifecycleOwner, new com.yandex.passport.internal.ui.autologin.b(3, iVar));
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final com.yandex.passport.internal.ui.base.h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        passportProcessGlobalComponent.getClass();
        Bundle arguments = getArguments();
        arguments.getClass();
        l lVar = (l) com.appsflyer.internal.k.h(arguments, p.class, "passport-login-properties");
        if (lVar != null) {
            return new c(com.yandex.plus.core.network.api.utils.a.L(lVar.d.a), passportProcessGlobalComponent.getLoginController(), passportProcessGlobalComponent.getSocialReporter());
        }
        xq0.q(com.appsflyer.internal.k.m("Bundle has no ", l.class));
        return null;
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final void z(f fVar) {
        fVar.getClass();
        if (fVar.b instanceof IOException) {
            Context requireContext = requireContext();
            com.yandex.passport.internal.ui.i iVar = new com.yandex.passport.internal.ui.i(requireContext);
            iVar.e = requireContext.getString(R.string.passport_error_network);
            iVar.b(R.string.passport_am_error_try_again);
            iVar.c(R.string.passport_reg_try_again, new oba(5, this));
            iVar.i = requireContext.getText(R.string.passport_reg_cancel);
            iVar.j = null;
            gr0 a = iVar.a();
            a.show();
            this.i.add(new WeakReference(a));
            return;
        }
        TypedValue typedValue = new TypedValue();
        requireActivity().getTheme().resolveAttribute(R.attr.passportNextNoticeRamblerBackgroundColor, typedValue, true);
        int color = getResources().getColor(typedValue.resourceId);
        LinearLayout linearLayout = this.n;
        if (linearLayout == null) {
            Intrinsics.j("ramblerNoticeForm");
            throw null;
        }
        linearLayout.setBackgroundColor(color);
        LinearLayout linearLayout2 = this.n;
        if (linearLayout2 != null) {
            linearLayout2.findViewById(R.id.login_button_with_notice_text).setVisibility(0);
        } else {
            Intrinsics.j("ramblerNoticeForm");
            throw null;
        }
    }
}
