package com.yandex.payment.divkit.bind.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.aw3;
import defpackage.bfg;
import defpackage.bs5;
import defpackage.cx3;
import defpackage.dag;
import defpackage.dx3;
import defpackage.dxf;
import defpackage.e27;
import defpackage.gos;
import defpackage.gw3;
import defpackage.hx3;
import defpackage.jj4;
import defpackage.jtc;
import defpackage.lb4;
import defpackage.lne;
import defpackage.ol;
import defpackage.sq5;
import defpackage.vwb;
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
public final class DKCvnInput extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final jtc a;
    public gw3 b;
    public boolean c;
    public final String d;
    public Function0 e;
    public Function1 f;
    public Function0 g;
    public boolean h;
    public Function1 i;
    public vx3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKCvnInput(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_dk_cvn_input, this);
        int i2 = R.id.cvn_help_button;
        AppCompatImageView appCompatImageView = (AppCompatImageView) dag.v(R.id.cvn_help_button, this);
        if (appCompatImageView != null) {
            i2 = R.id.cvn_input_label;
            TextView textView = (TextView) dag.v(R.id.cvn_input_label, this);
            if (textView != null) {
                i2 = R.id.cvn_input_text;
                EditText editText = (EditText) dag.v(R.id.cvn_input_text, this);
                if (editText != null) {
                    jtc jtcVar = new jtc();
                    jtcVar.a = textView;
                    jtcVar.b = editText;
                    this.a = jtcVar;
                    String string = getResources().getString(R.string.paymentsdk_prebuilt_card_cvn_hint_zero_sym);
                    string.getClass();
                    this.d = string;
                    getVisibility();
                    this.e = bs5.D;
                    this.f = e27.s;
                    this.g = bs5.E;
                    this.i = e27.t;
                    hx3 hx3Var = hx3.AmericanExpress;
                    this.j = wxf.M();
                    setOrientation(1);
                    setGravity(8388627);
                    editText.addTextChangedListener(new lb4(4, this));
                    editText.setOnFocusChangeListener(new cx3(6, this));
                    editText.setOnEditorActionListener(new dx3(this, 3));
                    appCompatImageView.setOnClickListener(new ol(9, this));
                    editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.j.d)});
                    return;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        requestFocus();
        vwb.W((EditText) this.a.b);
    }

    public final void b(boolean z) {
        yx3 c = c();
        jtc jtcVar = this.a;
        if (z) {
            if (c == null || StringsKt.U(getCvn())) {
                TextView textView = (TextView) jtcVar.a;
                Resources.Theme theme = getContext().getTheme();
                theme.getClass();
                textView.setTextColor(bfg.F(R.attr.paymentsdk_prebuilt_divkitInputTitleTextColor, theme));
                this.h = false;
            } else {
                this.h = true;
                TextView textView2 = (TextView) jtcVar.a;
                Resources.Theme theme2 = getContext().getTheme();
                theme2.getClass();
                textView2.setTextColor(bfg.F(R.attr.colorError, theme2));
            }
        } else if (c == null) {
            TextView textView3 = (TextView) jtcVar.a;
            Resources.Theme theme3 = getContext().getTheme();
            theme3.getClass();
            textView3.setTextColor(bfg.F(R.attr.paymentsdk_prebuilt_divkitInputTitleTextColor, theme3));
            this.h = false;
        }
        this.e.invoke();
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
        hx3 hx3Var = this.j.a;
        boolean z = this.c;
        hx3Var.getClass();
        ArrayList arrayList = vx3.f;
        ((ArrayList) a.b).add(new dxf(gos.n(hx3Var, z).d));
        return a.b(aw3Var);
    }

    @NotNull
    public final String getCvn() {
        Editable text = ((EditText) this.a.b).getText();
        if (text == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char charAt = text.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public final boolean getHasError() {
        return this.h;
    }

    @NotNull
    public final Function0<Unit> getOnKeyboardAction() {
        return this.g;
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.e = function0;
    }

    public final void setCardType(@NotNull vx3 vx3Var) {
        vx3Var.getClass();
        this.j = vx3Var;
        jtc jtcVar = this.a;
        ((EditText) jtcVar.b).setHint(c.q(vx3Var.d, this.d));
        ((EditText) jtcVar.b).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.j.d)});
        if (this.j.d == 0) {
            super.setVisibility(8);
        }
    }

    public final void setHelpCallback(@NotNull Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.f = function1;
    }

    public final void setInputEventListener(@NotNull Function1<? super lne, Unit> function1) {
        function1.getClass();
        this.i = function1;
    }

    public final void setNoCvvMirEnabled(boolean z) {
        this.c = z;
    }

    public final void setOnKeyboardAction(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.g = function0;
    }

    public final void setValidator(@NotNull gw3 gw3Var) {
        gw3Var.getClass();
        this.b = gw3Var;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.j.d == 0) {
            super.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DKCvnInput(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ DKCvnInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DKCvnInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
