package com.yandex.passport.internal.ui.social.gimap;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.widget.InputFieldView;
import defpackage.cx3;
import defpackage.etn;
import defpackage.mj4;
import defpackage.tot;
import defpackage.wdu;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public abstract class m extends e<n> {
    public static final /* synthetic */ int x = 0;
    public InputFieldView m;
    public InputFieldView n;
    public EditText o;
    public EditText p;
    public Switch q;
    public InputFieldView r;
    public Button s;
    public TextView t;
    public TextView u;
    public final com.yandex.passport.internal.ui.util.o v = new com.yandex.passport.internal.ui.util.o(new tot(28, this));
    public final mj4 w = new mj4(5, this);

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public void E(p pVar) {
        o M = M(pVar);
        this.p.setText(M.a);
        String str = M.b;
        if (str != null) {
            this.o.setText(str);
        }
        this.m.getEditText().setText(M.d);
        this.n.getEditText().setText(M.e);
        Boolean bool = M.c;
        if (bool != null) {
            this.q.setChecked(bool.booleanValue());
        }
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public void H(f fVar) {
        f fVar2 = f.c;
        switch (fVar.ordinal()) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                break;
            case 12:
            default:
                this.s.setEnabled(false);
                break;
        }
        this.t.setText(fVar.b);
        switch (fVar.ordinal()) {
            case 5:
                this.u.setText(R.string.passport_gimap_server_prefs_bad_email_err_text);
                break;
            case 6:
            case 12:
            default:
                this.u.setText(R.string.passport_gimap_server_prefs_err_common_text);
                break;
            case 7:
            case 8:
            case 11:
                this.u.setText(R.string.passport_gimap_ask_admin);
                break;
            case 9:
            case 10:
            case 13:
                this.u.setText(R.string.passport_gimap_try_later);
                break;
        }
        this.t.setVisibility(0);
        this.u.setVisibility(0);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final void I(Bundle bundle) {
        if (bundle.containsKey("gimap_sign_in_button_enabled")) {
            this.s.setEnabled(bundle.getBoolean("gimap_sign_in_button_enabled", false));
        }
        int i = bundle.getInt("show_error", 8);
        this.t.setVisibility(i);
        this.u.setVisibility(i);
    }

    public final o L() {
        return new o(com.yandex.plus.core.network.api.utils.a.z(this.p.getText().toString()), Boolean.valueOf(this.q.isChecked()), com.yandex.plus.core.network.api.utils.a.z(this.o.getText().toString()), com.yandex.plus.core.network.api.utils.a.z(this.m.getEditText().getText().toString().trim()), com.yandex.plus.core.network.api.utils.a.z(this.n.getEditText().getText().toString()));
    }

    public abstract o M(p pVar);

    public boolean N() {
        return L().d();
    }

    public abstract void O(View view);

    public abstract void P();

    @Override // com.yandex.passport.internal.ui.social.gimap.e, androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_gimap_server_prefs, viewGroup, false);
        this.p = (EditText) inflate.findViewById(R.id.gimap_edit_host);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.gimap_input_port_container);
        this.o = (EditText) viewGroup2.findViewById(R.id.gimap_input_port);
        int i2 = R.color.passport_tint_edittext_container;
        Drawable background = viewGroup2.getBackground();
        background.setTintList(etn.E(requireContext(), i2));
        WeakHashMap weakHashMap = wdu.a;
        viewGroup2.setBackground(background);
        viewGroup2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.b.o.requestFocus();
                        break;
                    case 1:
                        this.b.q.toggle();
                        break;
                    default:
                        this.b.P();
                        break;
                }
            }
        });
        this.o.setOnFocusChangeListener(new cx3(13, viewGroup2));
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.gimap_checkbox_ssl_container);
        Switch r6 = (Switch) inflate.findViewById(R.id.gimap_checkbox_ssl);
        this.q = r6;
        r6.setOnCheckedChangeListener(this.w);
        final int i3 = 1;
        viewGroup3.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.o.requestFocus();
                        break;
                    case 1:
                        this.b.q.toggle();
                        break;
                    default:
                        this.b.P();
                        break;
                }
            }
        });
        this.m = (InputFieldView) inflate.findViewById(R.id.gimap_input_login);
        this.n = (InputFieldView) inflate.findViewById(R.id.gimap_input_password);
        this.r = (InputFieldView) inflate.findViewById(R.id.input_email);
        EditText editText = this.m.getEditText();
        com.yandex.passport.internal.ui.util.o oVar = this.v;
        editText.addTextChangedListener(oVar);
        this.n.getEditText().addTextChangedListener(oVar);
        this.r.getEditText().addTextChangedListener(oVar);
        this.o.addTextChangedListener(oVar);
        this.p.addTextChangedListener(oVar);
        inflate.findViewById(R.id.gimap_button_password_masking).setOnClickListener(new com.yandex.passport.internal.ui.util.n(this.n.getEditText()));
        Button button = (Button) inflate.findViewById(R.id.button_sign_in);
        this.s = button;
        final int i4 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.l
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.b.o.requestFocus();
                        break;
                    case 1:
                        this.b.q.toggle();
                        break;
                    default:
                        this.b.P();
                        break;
                }
            }
        });
        this.t = (TextView) inflate.findViewById(R.id.error_title);
        this.u = (TextView) inflate.findViewById(R.id.error_text);
        O(inflate);
        return inflate;
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.s != null) {
            Bundle arguments = getArguments();
            arguments.getClass();
            arguments.putBoolean("gimap_sign_in_button_enabled", this.s.isEnabled());
            arguments.putInt("show_error", this.t.getVisibility());
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final com.yandex.passport.internal.ui.base.h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return new n(F(), passportProcessGlobalComponent.getEventReporter(), passportProcessGlobalComponent.getLoginController());
    }
}
