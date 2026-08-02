package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.aw3;
import defpackage.bs5;
import defpackage.cx3;
import defpackage.dag;
import defpackage.dx3;
import defpackage.dxf;
import defpackage.gos;
import defpackage.gw3;
import defpackage.gx3;
import defpackage.hx3;
import defpackage.jj4;
import defpackage.lb4;
import defpackage.lne;
import defpackage.qgg;
import defpackage.qhk;
import defpackage.sq5;
import defpackage.vx3;
import defpackage.wxf;
import defpackage.yx3;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class CvnInput extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public final qhk a;
    public gw3 b;
    public final String c;
    public Function0 d;
    public Function0 e;
    public boolean f;
    public Function1 g;
    public vx3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvnInput(@NotNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_cvn_input, this);
        int i3 = R.id.paymentsdk_prebuilt_cvn_input_label;
        TextView textView = (TextView) dag.v(R.id.paymentsdk_prebuilt_cvn_input_label, this);
        if (textView != null) {
            i3 = R.id.paymentsdk_prebuilt_cvn_input_text;
            EditText editText = (EditText) dag.v(R.id.paymentsdk_prebuilt_cvn_input_text, this);
            if (editText != null) {
                this.a = new qhk(this, textView, editText);
                String string = getResources().getString(R.string.paymentsdk_prebuilt_card_cvn_hint_zero_sym);
                string.getClass();
                this.c = string;
                getVisibility();
                this.d = bs5.z;
                this.e = bs5.A;
                this.g = gx3.w0;
                hx3 hx3Var = hx3.AmericanExpress;
                this.h = wxf.M();
                setOrientation(1);
                setGravity(8388627);
                editText.addTextChangedListener(new lb4(1, this));
                editText.setOnFocusChangeListener(new cx3(3, this));
                editText.setOnEditorActionListener(new dx3(this, 1));
                editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.h.d)});
                return;
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    public final void a() {
        requestFocus();
        qgg.d0(this.a.b);
    }

    public final void b(boolean z) {
        yx3 c = c();
        qhk qhkVar = this.a;
        if (z) {
            if (c == null || StringsKt.U(getCvn())) {
                TextView textView = qhkVar.a;
                Resources.Theme theme = getContext().getTheme();
                theme.getClass();
                textView.setTextColor(qgg.c0(R.attr.paymentsdk_prebuilt_cardNumberHintColor, theme));
                this.f = false;
            } else {
                this.f = true;
                TextView textView2 = qhkVar.a;
                Resources.Theme theme2 = getContext().getTheme();
                theme2.getClass();
                textView2.setTextColor(qgg.c0(R.attr.colorError, theme2));
            }
        } else if (c == null) {
            TextView textView3 = qhkVar.a;
            Resources.Theme theme3 = getContext().getTheme();
            theme3.getClass();
            textView3.setTextColor(qgg.c0(R.attr.paymentsdk_prebuilt_cardNumberHintColor, theme3));
            this.f = false;
        }
        this.d.invoke();
    }

    public final yx3 c() {
        String cvn = getCvn();
        cvn.getClass();
        aw3 aw3Var = new aw3(cvn);
        gw3 gw3Var = this.b;
        if (gw3Var == null) {
            Intrinsics.j("validator");
            throw null;
        }
        sq5 a = gw3Var.a();
        hx3 hx3Var = this.h.a;
        hx3Var.getClass();
        ArrayList arrayList = vx3.f;
        ((ArrayList) a.b).add(new dxf(gos.n(hx3Var, false).d));
        return a.b(aw3Var);
    }

    @NotNull
    public final String getCvn() {
        Editable text = this.a.b.getText();
        if (text == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = text.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public final boolean getHasError() {
        return this.f;
    }

    @NotNull
    public final Function0<Unit> getOnKeyboardAction() {
        return this.e;
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.d = function0;
    }

    public final void setCardType(@NotNull vx3 vx3Var) {
        vx3Var.getClass();
        this.h = vx3Var;
        qhk qhkVar = this.a;
        qhkVar.b.setHint(c.q(vx3Var.d, this.c));
        qhkVar.b.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.h.d)});
        if (this.h.d == 0) {
            super.setVisibility(8);
        }
    }

    public final void setInputEventListener(@NotNull Function1<? super lne, Unit> function1) {
        function1.getClass();
        this.g = function1;
    }

    public final void setOnKeyboardAction(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.e = function0;
    }

    public final void setValidator(@NotNull gw3 gw3Var) {
        gw3Var.getClass();
        this.b = gw3Var;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (this.h.d == 0) {
            super.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvnInput(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CvnInput(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvnInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
