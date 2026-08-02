package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.cx3;
import defpackage.dag;
import defpackage.dx3;
import defpackage.ew3;
import defpackage.grb;
import defpackage.gw3;
import defpackage.j6e;
import defpackage.jj4;
import defpackage.k27;
import defpackage.lhb;
import defpackage.lne;
import defpackage.qgg;
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
public final class ExpirationDateInput extends LinearLayout {
    public static final /* synthetic */ int g = 0;
    public final j6e a;
    public gw3 b;
    public Function1 c;
    public Function0 d;
    public boolean e;
    public Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpirationDateInput(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_expiration_date_input, this);
        int i2 = R.id.paymentsdk_prebuilt_expiration_date_input_label;
        TextView textView = (TextView) dag.v(R.id.paymentsdk_prebuilt_expiration_date_input_label, this);
        if (textView != null) {
            i2 = R.id.paymentsdk_prebuilt_expiration_date_input_text;
            EditText editText = (EditText) dag.v(R.id.paymentsdk_prebuilt_expiration_date_input_text, this);
            if (editText != null) {
                j6e j6eVar = new j6e();
                j6eVar.a = textView;
                j6eVar.b = editText;
                this.a = j6eVar;
                this.c = lhb.u;
                this.d = grb.t;
                this.f = lhb.v;
                setOrientation(1);
                setGravity(8388627);
                editText.setFilters(new InputFilter[]{new DigitsKeyListener(), new InputFilter.LengthFilter(4)});
                editText.addTextChangedListener(new k27(this, 1));
                editText.setOnFocusChangeListener(new cx3(11, this));
                editText.setOnEditorActionListener(new dx3(this, 5));
                return;
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final String getString() {
        String obj;
        Editable text = ((EditText) this.a.b).getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final boolean a() {
        return c() == null;
    }

    public final void b(boolean z, boolean z2) {
        yx3 c = c();
        j6e j6eVar = this.a;
        if (z2) {
            if (c == null || StringsKt.U(getString())) {
                TextView textView = (TextView) j6eVar.a;
                Resources.Theme theme = getContext().getTheme();
                theme.getClass();
                textView.setTextColor(qgg.c0(R.attr.paymentsdk_prebuilt_cardNumberHintColor, theme));
                this.e = false;
            } else {
                String str = c.a;
                if (str == null) {
                    str = getResources().getString(R.string.paymentsdk_prebuilt_wrong_date_message);
                    str.getClass();
                }
                announceForAccessibility(str);
                TextView textView2 = (TextView) j6eVar.a;
                Resources.Theme theme2 = getContext().getTheme();
                theme2.getClass();
                textView2.setTextColor(qgg.c0(R.attr.colorError, theme2));
                this.e = true;
            }
        } else if (c == null) {
            TextView textView3 = (TextView) j6eVar.a;
            Resources.Theme theme3 = getContext().getTheme();
            theme3.getClass();
            textView3.setTextColor(qgg.c0(R.attr.paymentsdk_prebuilt_cardNumberHintColor, theme3));
            this.e = false;
        }
        this.c.invoke(Boolean.valueOf(z));
    }

    public final yx3 c() {
        gw3 gw3Var = this.b;
        if (gw3Var == null) {
            Intrinsics.j("validator");
            throw null;
        }
        String expirationMonth = getExpirationMonth();
        String expirationYear = getExpirationYear();
        expirationMonth.getClass();
        expirationYear.getClass();
        return gw3Var.b(new ew3(expirationMonth, expirationYear));
    }

    @NotNull
    public final String getExpirationMonth() {
        String string = getString();
        return string.length() < 2 ? "" : string.substring(0, 2);
    }

    @NotNull
    public final String getExpirationYear() {
        String string = getString();
        return string.length() == 4 ? string.substring(2) : "";
    }

    public final boolean getHasError() {
        return this.e;
    }

    @NotNull
    public final Function0<Unit> getOnKeyboardAction() {
        return this.d;
    }

    public final void setCallback(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setExternalDate(@NotNull String str) {
        str.getClass();
        ((EditText) this.a.b).setText(str);
    }

    public final void setHasError(boolean z) {
        this.e = z;
    }

    public final void setInputEventListener(@NotNull Function1<? super lne, Unit> function1) {
        function1.getClass();
        this.f = function1;
    }

    public final void setOnKeyboardAction(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.d = function0;
    }

    public final void setValidator(@NotNull gw3 gw3Var) {
        gw3Var.getClass();
        this.b = gw3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpirationDateInput(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ExpirationDateInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpirationDateInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
