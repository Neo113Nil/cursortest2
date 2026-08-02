package com.yandex.passport.internal.ui.domik.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.app.q;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.util.o;
import com.yandex.passport.internal.util.n;
import defpackage.gi;
import defpackage.ild;
import defpackage.j8s;
import defpackage.lno;
import defpackage.onx;
import defpackage.pmd;
import defpackage.rad;
import defpackage.tot;
import defpackage.vh;
import defpackage.xal;
import defpackage.zh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/common/b;", "Lcom/yandex/passport/internal/ui/domik/base/b;", "V", "Lcom/yandex/passport/internal/ui/domik/e;", "T", "Lcom/yandex/passport/internal/ui/domik/base/a;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class b<V extends com.yandex.passport.internal.ui.domik.base.b, T extends com.yandex.passport.internal.ui.domik.e> extends com.yandex.passport.internal.ui.domik.base.a<V, T> {
    public Space A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final zh E;
    public com.yandex.passport.internal.f t;
    public TextView u;
    public View v;
    public EditText w;
    public TextView x;
    public CheckBox y;
    public Space z;

    public b() {
        zh registerForActivityResult = registerForActivityResult(new vh(5), new gi(16, this));
        registerForActivityResult.getClass();
        this.E = registerForActivityResult;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public boolean H(String str) {
        str.getClass();
        return true;
    }

    public abstract void L();

    public final EditText M() {
        EditText editText = this.w;
        if (editText != null) {
            return editText;
        }
        Intrinsics.j("editPhone");
        throw null;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        a.getSmsRetrieverHelper();
        this.t = a.getContextUtils();
        TypedArray obtainStyledAttributes = requireActivity().getTheme().obtainStyledAttributes(new int[]{R.attr.passportPhoneNumberScreenKeyboardShowed});
        try {
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.C = z;
            obtainStyledAttributes = requireActivity().getTheme().obtainStyledAttributes(new int[]{R.attr.passportUberLogo});
            try {
                boolean z2 = obtainStyledAttributes.getResourceId(0, -1) != -1;
                obtainStyledAttributes.recycle();
                this.D = z2;
                super.onCreate(bundle);
            } finally {
            }
        } finally {
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(E().getDomikDesignProvider().b, viewGroup, false);
        if (bundle != null) {
            this.B = bundle.getBoolean("hint-request-sent", false);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        if (!this.B) {
            t requireActivity = requireActivity();
            requireActivity.getClass();
            if (pmd.e.b(requireActivity, 220000000) == 0) {
                try {
                    rad radVar = new rad(0);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Phone Number Hint started", 8);
                    }
                    onx e = ild.z(requireActivity()).e(radVar);
                    tot totVar = new tot(24, new a(this, 0));
                    e.getClass();
                    lno lnoVar = j8s.a;
                    e.d(lnoVar, totVar);
                    e.c(lnoVar, new q(18));
                } catch (Exception e2) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint failed", e2);
                    }
                    this.r.k(e2);
                }
                this.B = true;
                return;
            }
        }
        if (this.C) {
            com.yandex.passport.internal.ui.base.d.B(M(), this.l);
        }
        View view = getView();
        TextView textView = this.l;
        textView.getClass();
        CharSequence text = textView.getText();
        text.getClass();
        if (view != null) {
            view.announceForAccessibility(text);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putBoolean("hint-request-sent", this.B);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.edit_phone_number);
        findViewById.getClass();
        this.w = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.text_message);
        findViewById2.getClass();
        this.x = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.image_logo);
        findViewById3.getClass();
        this.v = findViewById3;
        this.z = (Space) view.findViewById(R.id.spacer_1);
        this.A = (Space) view.findViewById(R.id.spacer_2);
        View findViewById4 = view.findViewById(R.id.text_legal);
        findViewById4.getClass();
        this.u = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.button_lite_next);
        findViewById5.getClass();
        View findViewById6 = view.findViewById(R.id.checkbox_unsubscribe_mailing);
        findViewById6.getClass();
        this.y = (CheckBox) findViewById6;
        com.yandex.passport.internal.f fVar = this.t;
        if (fVar == null) {
            Intrinsics.j("contextUtils");
            throw null;
        }
        M().addTextChangedListener(new PhoneNumberFormattingTextWatcher(fVar.a()));
        M().addTextChangedListener(new o(new tot(25, this)));
        EditText M = M();
        Context requireContext = requireContext();
        requireContext.getClass();
        M.setText(n.a(requireContext));
        M().setSelection(M().getText().length());
        this.j.setOnClickListener(new xal(17, this));
        EditText M2 = M();
        TextView textView = this.l;
        textView.getClass();
        M2.setContentDescription(textView.getText());
        this.p.y.f(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.base.g(1, new a(this, 1)));
    }
}
