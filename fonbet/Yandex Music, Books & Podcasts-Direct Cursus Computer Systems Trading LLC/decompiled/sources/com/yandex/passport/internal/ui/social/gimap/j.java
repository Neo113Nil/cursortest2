package com.yandex.passport.internal.ui.social.gimap;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.widget.InputFieldView;
import defpackage.kac;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public class j extends e<k> {
    public static final /* synthetic */ int t = 0;
    public Button m;
    public View n;
    public InputFieldView o;
    public InputFieldView p;
    public TextView q;
    public TextView r;
    public i s = i.a;

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final void E(p pVar) {
        this.o.getEditText().setText(pVar.a);
        this.p.getEditText().setText(pVar.b);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final p G(p pVar) {
        String L = L();
        String z = com.yandex.plus.core.network.api.utils.a.z(this.p.getEditText().getText().toString());
        pVar.getClass();
        p a = p.a(pVar, L, z, null, null, 28);
        String str = pVar.a;
        if (!(str != null ? str.substring(StringsKt.T(str, "@", 0, false, 6) + 1) : "").equals(L != null ? L.substring(StringsKt.T(L, "@", 0, false, 6) + 1) : "")) {
            a = p.a(a, null, null, new o(null, null, null, null, null), new o(null, null, null, null, null), 19);
        }
        p pVar2 = a;
        if (!Intrinsics.d(pVar.b, z)) {
            pVar2 = p.a(pVar2, null, null, o.b(pVar2.c, null, null, null, null, z, 15), o.b(pVar2.d, null, null, null, null, z, 15), 19);
        }
        p pVar3 = pVar2;
        o oVar = pVar3.c;
        String str2 = oVar.d;
        String str3 = str2 == null ? L : str2;
        String str4 = oVar.e;
        return p.a(pVar3, null, null, o.b(oVar, null, null, null, str3, str4 == null ? z : str4, 7), null, 27);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final void H(f fVar) {
        this.q.setText(fVar.b);
        switch (fVar) {
            case EF0:
            case EF2:
            case EF3:
            case EF5:
                this.r.setText(R.string.passport_gimap_err_common_text);
                break;
            case EF1:
            case EF4:
                this.r.setText(R.string.passport_gimap_err_with_pass);
                break;
            case c:
            case EF164:
            default:
                kac.j(fVar, "unexpected gimapError ");
            case EF7:
            case EF8:
            case EF149:
                this.r.setText(R.string.passport_gimap_ask_admin);
                break;
            case EF9:
            case d:
            case EF179:
                this.r.setText(R.string.passport_gimap_try_later);
                break;
        }
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
                this.m.setEnabled(false);
                break;
        }
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final void I(Bundle bundle) {
        i iVar = (i) bundle.getSerializable("current_state");
        if (iVar == null) {
            iVar = i.a;
        }
        M(iVar, getView());
        if (bundle.containsKey("gimap_sign_in_button_enabled")) {
            this.m.setEnabled(bundle.getBoolean("gimap_sign_in_button_enabled", false));
        }
    }

    public final String L() {
        return com.yandex.plus.core.network.api.utils.a.z(this.o.getEditText().getText().toString().trim());
    }

    public final void M(i iVar, View view) {
        this.s = iVar;
        int ordinal = iVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                this.n.setVisibility(0);
                ImageView imageView = (ImageView) view.findViewById(R.id.passport_auth_yandex_logo);
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.passport_icon_gimap_logo_err);
                }
                ImageView imageView2 = (ImageView) view.findViewById(R.id.gimap_left_icon);
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.passport_icon_gimap_sw600_land_err_left);
                }
                ImageView imageView3 = (ImageView) view.findViewById(R.id.gimap_right_icon);
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.passport_icon_gimap_sw600_land_err_right);
                }
                this.n.requestFocus();
            }
            N();
        }
        this.p.setVisibility(0);
        this.m.setText(R.string.passport_login);
        N();
    }

    public final void N() {
        String L = L();
        String z = com.yandex.plus.core.network.api.utils.a.z(this.p.getEditText().getText().toString());
        int ordinal = this.s.ordinal();
        if (ordinal == 0) {
            this.m.setEnabled(e.D(L));
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            this.m.setEnabled(e.D(L) && !TextUtils.isEmpty(z));
        }
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e, androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_gimap_identification, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.button_sign_in);
        this.m = button;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p G;
                int i2 = 8;
                switch (i) {
                    case 0:
                        j jVar = this.b;
                        int i3 = j.t;
                        String L = jVar.L();
                        int ordinal = jVar.s.ordinal();
                        if (ordinal == 0) {
                            k kVar = (k) jVar.g;
                            L.getClass();
                            kVar.l.m(Boolean.TRUE);
                            kVar.m.a(z5.d(new com.yandex.passport.internal.interaction.c(8, kVar, L)));
                            return;
                        }
                        if (ordinal == 1 || ordinal == 2) {
                            com.yandex.passport.internal.interaction.d dVar = ((k) jVar.g).s;
                            q F = jVar.F();
                            synchronized (F) {
                                G = jVar.G(F.u);
                                F.u = G;
                            }
                            dVar.a(G);
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.b;
                        int i4 = j.t;
                        MailGIMAPActivity mailGIMAPActivity = (MailGIMAPActivity) jVar2.requireActivity();
                        mailGIMAPActivity.getClass();
                        com.yandex.passport.internal.ui.authbytrack.a aVar = new com.yandex.passport.internal.ui.authbytrack.a(i2);
                        int i5 = r.y;
                        mailGIMAPActivity.n(new com.yandex.passport.internal.ui.base.m(aVar, "r", true, 1));
                        return;
                }
            }
        });
        this.o = (InputFieldView) inflate.findViewById(R.id.input_login);
        this.p = (InputFieldView) inflate.findViewById(R.id.input_password);
        this.o.getEditText().addTextChangedListener(new h(this, this.o));
        this.p.getEditText().addTextChangedListener(new h(this, this.p));
        inflate.findViewById(R.id.button_password_masking).setOnClickListener(new com.yandex.passport.internal.ui.util.n(this.p.getEditText()));
        View findViewById = inflate.findViewById(R.id.login_button_with_notice_form);
        this.n = findViewById;
        this.q = (TextView) findViewById.findViewById(R.id.error_title);
        this.r = (TextView) this.n.findViewById(R.id.error_text);
        final int i2 = 1;
        ((Button) this.n.findViewById(R.id.button_gimap_ext)).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.g
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p G;
                int i22 = 8;
                switch (i2) {
                    case 0:
                        j jVar = this.b;
                        int i3 = j.t;
                        String L = jVar.L();
                        int ordinal = jVar.s.ordinal();
                        if (ordinal == 0) {
                            k kVar = (k) jVar.g;
                            L.getClass();
                            kVar.l.m(Boolean.TRUE);
                            kVar.m.a(z5.d(new com.yandex.passport.internal.interaction.c(8, kVar, L)));
                            return;
                        }
                        if (ordinal == 1 || ordinal == 2) {
                            com.yandex.passport.internal.interaction.d dVar = ((k) jVar.g).s;
                            q F = jVar.F();
                            synchronized (F) {
                                G = jVar.G(F.u);
                                F.u = G;
                            }
                            dVar.a(G);
                            return;
                        }
                        return;
                    default:
                        j jVar2 = this.b;
                        int i4 = j.t;
                        MailGIMAPActivity mailGIMAPActivity = (MailGIMAPActivity) jVar2.requireActivity();
                        mailGIMAPActivity.getClass();
                        com.yandex.passport.internal.ui.authbytrack.a aVar = new com.yandex.passport.internal.ui.authbytrack.a(i22);
                        int i5 = r.y;
                        mailGIMAPActivity.n(new com.yandex.passport.internal.ui.base.m(aVar, "r", true, 1));
                        return;
                }
            }
        });
        ((k) this.g).t.f(this, new com.yandex.passport.internal.ui.autologin.b(2, this));
        return inflate;
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.m != null) {
            Bundle arguments = getArguments();
            arguments.getClass();
            arguments.putBoolean("gimap_sign_in_button_enabled", this.m.isEnabled());
            arguments.putSerializable("current_state", this.s);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final com.yandex.passport.internal.ui.base.h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return new k(F(), passportProcessGlobalComponent.getEventReporter(), passportProcessGlobalComponent.getLoginController());
    }
}
