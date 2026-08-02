package com.yandex.payment.sdk.ui.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.bs5;
import defpackage.cx3;
import defpackage.dag;
import defpackage.dw3;
import defpackage.gw3;
import defpackage.jj4;
import defpackage.jx9;
import defpackage.lb4;
import defpackage.oxa;
import defpackage.yx3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class EmailView extends LinearLayout {
    public static final /* synthetic */ int f = 0;
    public final oxa a;
    public gw3 b;
    public Function0 c;
    public String d;
    public Function1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_view_email, this);
        int i2 = R.id.field;
        if (((TextInputEditText) dag.v(R.id.field, this)) != null) {
            i2 = R.id.hint;
            if (((TextView) dag.v(R.id.hint, this)) != null) {
                i2 = R.id.layout;
                TextInputLayout textInputLayout = (TextInputLayout) dag.v(R.id.layout, this);
                if (textInputLayout != null) {
                    this.a = new oxa(this, textInputLayout);
                    this.c = bs5.A0;
                    this.e = jx9.J;
                    setOrientation(1);
                    EditText editText = textInputLayout.getEditText();
                    if (editText != null) {
                        editText.addTextChangedListener(new lb4(8, this));
                    }
                    EditText editText2 = textInputLayout.getEditText();
                    if (editText2 != null) {
                        editText2.setOnFocusChangeListener(new cx3(10, this));
                        return;
                    }
                    return;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(boolean z) {
        Editable text;
        this.d = null;
        oxa oxaVar = this.a;
        ((TextInputLayout) oxaVar.b).setErrorEnabled(false);
        TextInputLayout textInputLayout = (TextInputLayout) oxaVar.b;
        textInputLayout.setError(null);
        EditText editText = textInputLayout.getEditText();
        String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        if (!StringsKt.U(obj)) {
            gw3 gw3Var = this.b;
            if (gw3Var == null) {
                Intrinsics.j("validator");
                throw null;
            }
            yx3 b = gw3Var.b(new dw3(obj));
            if (b == null) {
                this.d = obj;
            } else if (z) {
                textInputLayout.setErrorEnabled(true);
                String str = b.a;
                if (str == null) {
                    str = getResources().getString(R.string.paymentsdk_email_error);
                }
                textInputLayout.setError(str);
            }
        }
        this.c.invoke();
    }

    public final String getEmail() {
        return this.d;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFocusChanged() {
        return this.e;
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.c = function0;
    }

    public final void setEmail(String str) {
        this.d = str;
        EditText editText = ((TextInputLayout) this.a.b).getEditText();
        if (editText != null) {
            editText.setText(str);
        }
    }

    public final void setOnFocusChanged(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.e = function1;
    }

    public final void setValidator(@NotNull gw3 gw3Var) {
        gw3Var.getClass();
        this.b = gw3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ EmailView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
