package com.yandex.payment.sdk.ui.view.card;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b6e;
import defpackage.bx3;
import defpackage.cx3;
import defpackage.dag;
import defpackage.dx3;
import defpackage.e1;
import defpackage.ex3;
import defpackage.fx3;
import defpackage.gos;
import defpackage.gw3;
import defpackage.gx3;
import defpackage.hx3;
import defpackage.jj4;
import defpackage.lne;
import defpackage.mlr;
import defpackage.nnd;
import defpackage.qgg;
import defpackage.rq1;
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
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class CardNumberInput extends LinearLayout {
    public static final /* synthetic */ int o = 0;
    public final nnd a;
    public Function0 b;
    public Function1 c;
    public Function0 d;
    public Function0 e;
    public fx3 f;
    public boolean g;
    public boolean h;
    public gw3 i;
    public Function1 j;
    public vx3 k;
    public Editable l;
    public Function1 m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_card_number_input, this);
        int i2 = R.id.paymentsdk_prebuilt_pan_input_label;
        TextView textView = (TextView) dag.v(R.id.paymentsdk_prebuilt_pan_input_label, this);
        if (textView != null) {
            i2 = R.id.paymentsdk_prebuilt_pan_input_text;
            EditText editText = (EditText) dag.v(R.id.paymentsdk_prebuilt_pan_input_text, this);
            if (editText != null) {
                this.a = new nnd(this, textView, editText);
                this.b = e1.X;
                this.c = gx3.s;
                this.e = e1.Y;
                this.f = fx3.a;
                hx3 hx3Var = hx3.AmericanExpress;
                this.k = wxf.M();
                this.m = rq1.B0;
                setOrientation(1);
                setGravity(8388627);
                Object systemService = context.getSystemService("accessibility");
                systemService.getClass();
                if (((AccessibilityManager) systemService).isEnabled()) {
                    editText.setHint(context.getString(R.string.paymentsdk_prebuilt_card_number_input_title));
                }
                int i3 = 0;
                editText.addTextChangedListener(new ex3(this, i3));
                editText.setOnFocusChangeListener(new cx3(i3, this));
                editText.setOnEditorActionListener(new dx3(this, 0));
                return;
            }
        }
        jj4.j("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(boolean z) {
        String string;
        if (this.f == fx3.b) {
            return;
        }
        String cardNumber = getCardNumber();
        cardNumber.getClass();
        bx3 bx3Var = new bx3(cardNumber);
        gw3 gw3Var = this.i;
        if (gw3Var == null) {
            Intrinsics.j("validator");
            throw null;
        }
        sq5 a = gw3Var.a();
        hx3 hx3Var = this.k.a;
        hx3Var.getClass();
        ArrayList arrayList = vx3.f;
        boolean z2 = false;
        ((ArrayList) a.b).add(new sq5(gos.n(hx3Var, false).c));
        yx3 b = a.b(bx3Var);
        boolean z3 = b == null;
        nnd nndVar = this.a;
        if (!z || z3 || StringsKt.U(getCardNumber())) {
            TextView textView = (TextView) nndVar.b;
            Resources.Theme theme = getContext().getTheme();
            theme.getClass();
            textView.setTextColor(qgg.c0(R.attr.paymentsdk_prebuilt_cardNumberHintColor, theme));
        } else {
            if (b == null || (string = b.a) == null) {
                string = getResources().getString(R.string.paymentsdk_prebuilt_wrong_card_number_message);
                string.getClass();
            }
            announceForAccessibility(string);
            TextView textView2 = (TextView) nndVar.b;
            Resources.Theme theme2 = getContext().getTheme();
            theme2.getClass();
            textView2.setTextColor(qgg.c0(R.attr.colorError, theme2));
            z2 = true;
        }
        this.g = z2;
        this.b.invoke();
        if (this.n != z3) {
            this.n = z3;
            this.c.invoke(Boolean.valueOf(z3));
        }
    }

    @NotNull
    public final String getCardNumber() {
        String str;
        int ordinal = this.f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return String.valueOf(this.l);
            }
            b6e.s();
            return null;
        }
        Editable text = ((EditText) this.a.c).getText();
        if (text != null) {
            StringBuilder sb = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char charAt = text.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public final boolean getHasError() {
        return this.g;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFinish() {
        return this.c;
    }

    public final Function0<Unit> getOnFocus() {
        return this.d;
    }

    @NotNull
    public final Function0<Unit> getOnKeyboardAction() {
        return this.e;
    }

    @NotNull
    public final fx3 getState() {
        return this.f;
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.b = function0;
    }

    public final void setEnableDebranding(boolean z) {
        this.h = z;
    }

    public final void setExternalPreparedNumber(@NotNull String str) {
        str.getClass();
        ((EditText) this.a.c).setText(str);
    }

    public final void setHasError(boolean z) {
        this.g = z;
    }

    public final void setInputEventListener(@NotNull Function1<? super lne, Unit> function1) {
        function1.getClass();
        this.m = function1;
    }

    public final void setOnCardTypeChangedListener(@NotNull Function1<? super vx3, Unit> function1) {
        function1.getClass();
        this.j = function1;
    }

    public final void setOnFinish(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setOnFocus(Function0<Unit> function0) {
        this.d = function0;
    }

    public final void setOnKeyboardAction(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.e = function0;
    }

    public final void setState(@NotNull fx3 fx3Var) {
        fx3Var.getClass();
        if (fx3Var != this.f) {
            this.f = fx3Var;
            int ordinal = fx3Var.ordinal();
            nnd nndVar = this.a;
            if (ordinal == 0) {
                ((EditText) nndVar.c).setText(this.l);
                EditText editText = (EditText) nndVar.c;
                Editable text = editText.getText();
                if (text != null) {
                    editText.setSelection(text.length());
                    return;
                }
                return;
            }
            if (ordinal != 1) {
                return;
            }
            this.l = ((EditText) nndVar.c).getText();
            SpannableString spannableString = new SpannableString(getContext().getString(R.string.paymentsdk_prebuilt_card_number_mask_format, mlr.L(4, String.valueOf(this.l))));
            Resources.Theme theme = getContext().getTheme();
            theme.getClass();
            spannableString.setSpan(new ForegroundColorSpan(qgg.c0(R.attr.paymentsdk_prebuilt_cardNumberHintColor, theme)), 0, 2, 33);
            ((EditText) nndVar.c).setText(spannableString);
        }
    }

    public final void setValidator(@NotNull gw3 gw3Var) {
        gw3Var.getClass();
        this.i = gw3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CardNumberInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
