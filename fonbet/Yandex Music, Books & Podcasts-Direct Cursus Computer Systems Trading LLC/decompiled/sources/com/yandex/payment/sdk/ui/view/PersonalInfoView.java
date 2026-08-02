package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.payment.sdk.ui.view.PersonalInfoView;
import defpackage.dag;
import defpackage.eps;
import defpackage.jj4;
import defpackage.kmk;
import defpackage.lmk;
import defpackage.ok7;
import defpackage.omk;
import defpackage.ouj;
import defpackage.pmk;
import defpackage.vr1;
import defpackage.xuj;
import defpackage.yx3;
import defpackage.zx3;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class PersonalInfoView extends ConstraintLayout {
    public static final /* synthetic */ int u = 0;
    public final eps q;
    public ok7 r;
    public final EmailView s;
    public Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInfoView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_view_personal_info, this);
        int i2 = R.id.email_view;
        EmailView emailView = (EmailView) dag.v(R.id.email_view, this);
        if (emailView != null) {
            i2 = R.id.first_name;
            TextInputEditText textInputEditText = (TextInputEditText) dag.v(R.id.first_name, this);
            if (textInputEditText != null) {
                i2 = R.id.first_name_layout;
                TextInputLayout textInputLayout = (TextInputLayout) dag.v(R.id.first_name_layout, this);
                if (textInputLayout != null) {
                    i2 = R.id.last_name;
                    TextInputEditText textInputEditText2 = (TextInputEditText) dag.v(R.id.last_name, this);
                    if (textInputEditText2 != null) {
                        i2 = R.id.last_name_layout;
                        TextInputLayout textInputLayout2 = (TextInputLayout) dag.v(R.id.last_name_layout, this);
                        if (textInputLayout2 != null) {
                            i2 = R.id.phone;
                            TextInputEditText textInputEditText3 = (TextInputEditText) dag.v(R.id.phone, this);
                            if (textInputEditText3 != null) {
                                i2 = R.id.phone_layout;
                                TextInputLayout textInputLayout3 = (TextInputLayout) dag.v(R.id.phone_layout, this);
                                if (textInputLayout3 != null) {
                                    eps epsVar = new eps();
                                    epsVar.a = emailView;
                                    epsVar.b = textInputEditText;
                                    epsVar.c = textInputLayout;
                                    epsVar.d = textInputEditText2;
                                    epsVar.e = textInputLayout2;
                                    epsVar.f = textInputEditText3;
                                    epsVar.g = textInputLayout3;
                                    this.q = epsVar;
                                    this.s = emailView;
                                    this.t = xuj.A;
                                    EditText editText = textInputLayout.getEditText();
                                    final int i3 = 0;
                                    if (editText != null) {
                                        editText.addTextChangedListener(new omk(this, 0));
                                    }
                                    EditText editText2 = textInputLayout.getEditText();
                                    if (editText2 != null) {
                                        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: nmk
                                            public final /* synthetic */ PersonalInfoView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i4 = i3;
                                                PersonalInfoView personalInfoView = this.b;
                                                switch (i4) {
                                                    case 0:
                                                        int i5 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        int i6 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        int i7 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t(true);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    EditText editText3 = textInputLayout2.getEditText();
                                    final int i4 = 1;
                                    if (editText3 != null) {
                                        editText3.addTextChangedListener(new omk(this, 1));
                                    }
                                    EditText editText4 = textInputLayout2.getEditText();
                                    if (editText4 != null) {
                                        editText4.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: nmk
                                            public final /* synthetic */ PersonalInfoView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i42 = i4;
                                                PersonalInfoView personalInfoView = this.b;
                                                switch (i42) {
                                                    case 0:
                                                        int i5 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        int i6 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        int i7 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t(true);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    EditText editText5 = textInputLayout3.getEditText();
                                    final int i5 = 2;
                                    if (editText5 != null) {
                                        editText5.addTextChangedListener(new omk(this, 2));
                                    }
                                    EditText editText6 = textInputLayout3.getEditText();
                                    if (editText6 != null) {
                                        editText6.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: nmk
                                            public final /* synthetic */ PersonalInfoView b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                int i42 = i5;
                                                PersonalInfoView personalInfoView = this.b;
                                                switch (i42) {
                                                    case 0:
                                                        int i52 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    case 1:
                                                        int i6 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t.invoke();
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        int i7 = PersonalInfoView.u;
                                                        if (!z) {
                                                            personalInfoView.t(true);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @NotNull
    public final EmailView getEmailView() {
        return this.s;
    }

    @NotNull
    public final kmk getPersonalInfo() {
        eps epsVar = this.q;
        Editable text = ((TextInputEditText) epsVar.b).getText();
        String obj = text != null ? text.toString() : null;
        Editable text2 = ((TextInputEditText) epsVar.d).getText();
        String obj2 = text2 != null ? text2.toString() : null;
        Editable text3 = ((TextInputEditText) epsVar.f).getText();
        return new kmk(obj, obj2, text3 != null ? text3.toString() : null, this.s.getEmail());
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.t = function0;
        ((EmailView) this.q.a).setCallback(new vr1(4, function0));
    }

    public final void setPersonalInfo(@NotNull kmk kmkVar) {
        kmkVar.getClass();
        eps epsVar = this.q;
        ((TextInputEditText) epsVar.b).setText(kmkVar.a);
        ((TextInputEditText) epsVar.d).setText(kmkVar.b);
        ((TextInputEditText) epsVar.f).setText(kmkVar.c);
        this.s.setEmail(kmkVar.d);
    }

    public final void setPersonalInfoVisibility(@NotNull pmk pmkVar) {
        pmkVar.getClass();
        lmk lmkVar = pmkVar.b;
        eps epsVar = this.q;
        TextInputLayout textInputLayout = (TextInputLayout) epsVar.c;
        boolean z = pmkVar.a;
        int i = 8;
        textInputLayout.setVisibility((z && lmkVar.b) ? 0 : 8);
        ((TextInputLayout) epsVar.e).setVisibility((z && lmkVar.b) ? 0 : 8);
        ((TextInputLayout) epsVar.g).setVisibility((z && lmkVar.c) ? 0 : 8);
        EmailView emailView = (EmailView) epsVar.a;
        if (z && lmkVar.d) {
            i = 0;
        }
        emailView.setVisibility(i);
    }

    public final void setValidators(@NotNull zx3 zx3Var) {
        zx3Var.getClass();
        ((EmailView) this.q.a).setValidator(zx3Var.d);
        this.r = zx3Var.e;
    }

    public final void t(boolean z) {
        Editable text;
        eps epsVar = this.q;
        ((TextInputLayout) epsVar.g).setErrorEnabled(false);
        TextInputLayout textInputLayout = (TextInputLayout) epsVar.g;
        textInputLayout.setError(null);
        EditText editText = textInputLayout.getEditText();
        String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        if (!StringsKt.U(obj)) {
            if (this.r == null) {
                Intrinsics.j("phoneValidator");
                throw null;
            }
            Locale locale = Locale.US;
            yx3 yx3Var = new Regex("^((\\+7|7|8)+([0-9]){10})$").e(ouj.s(locale, obj, locale)) ? null : yx3.b;
            if (yx3Var != null && z) {
                textInputLayout.setErrorEnabled(true);
                String str = yx3Var.a;
                if (str == null) {
                    str = getResources().getString(R.string.paymentsdk_phone_error);
                }
                textInputLayout.setError(str);
            }
        }
        this.t.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PersonalInfoView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ PersonalInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PersonalInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
