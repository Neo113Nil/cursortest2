package com.yandex.payment.divkit.bind.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.b6e;
import defpackage.bfg;
import defpackage.bs5;
import defpackage.bx3;
import defpackage.cx3;
import defpackage.dag;
import defpackage.dx3;
import defpackage.edr;
import defpackage.ex3;
import defpackage.gos;
import defpackage.gw3;
import defpackage.gx3;
import defpackage.hx3;
import defpackage.jj4;
import defpackage.l17;
import defpackage.lne;
import defpackage.mlr;
import defpackage.rdk;
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
public final class DKCardNumberInput extends LinearLayout {
    public static final /* synthetic */ int q = 0;
    public final rdk a;
    public Function0 b;
    public Function1 c;
    public Function1 d;
    public Function0 e;
    public Function0 f;
    public l17 g;
    public boolean h;
    public boolean i;
    public gw3 j;
    public Function1 k;
    public vx3 l;
    public Editable m;
    public Function1 n;
    public boolean o;
    public final AccessibilityManager p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKCardNumberInput(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_dk_card_number_input, this);
        int i2 = R.id.cardInputContainer;
        if (((LinearLayout) dag.v(R.id.cardInputContainer, this)) != null) {
            i2 = R.id.cardTypeIcon;
            ImageView imageView = (ImageView) dag.v(R.id.cardTypeIcon, this);
            if (imageView != null) {
                i2 = R.id.dotTextView;
                TextView textView = (TextView) dag.v(R.id.dotTextView, this);
                if (textView != null) {
                    i2 = R.id.paymentsdk_prebuilt_card_scanner;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) dag.v(R.id.paymentsdk_prebuilt_card_scanner, this);
                    if (appCompatImageView != null) {
                        i2 = R.id.paymentsdk_prebuilt_clear_input;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) dag.v(R.id.paymentsdk_prebuilt_clear_input, this);
                        if (appCompatImageView2 != null) {
                            i2 = R.id.paymentsdk_prebuilt_pan_input_label;
                            TextView textView2 = (TextView) dag.v(R.id.paymentsdk_prebuilt_pan_input_label, this);
                            if (textView2 != null) {
                                i2 = R.id.paymentsdk_prebuilt_pan_input_text;
                                EditText editText = (EditText) dag.v(R.id.paymentsdk_prebuilt_pan_input_text, this);
                                if (editText != null) {
                                    this.a = new rdk(this, imageView, textView, appCompatImageView, appCompatImageView2, textView2, editText, 15);
                                    this.b = bs5.B;
                                    this.c = gx3.B0;
                                    this.d = gx3.A0;
                                    this.f = bs5.C;
                                    this.g = l17.a;
                                    hx3 hx3Var = hx3.AmericanExpress;
                                    this.l = wxf.M();
                                    this.n = gx3.z0;
                                    int i3 = 1;
                                    setOrientation(1);
                                    setGravity(8388627);
                                    Object systemService = context.getSystemService("accessibility");
                                    systemService.getClass();
                                    AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                                    this.p = accessibilityManager;
                                    if (accessibilityManager.isEnabled()) {
                                        editText.setHint(context.getString(R.string.paymentsdk_prebuilt_card_number_input_title));
                                    }
                                    editText.addTextChangedListener(new ex3(this, i3));
                                    editText.setOnFocusChangeListener(new cx3(5, this));
                                    editText.setOnEditorActionListener(new dx3(this, 2));
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

    public final void a(boolean z) {
        String string;
        if (this.g == l17.b) {
            return;
        }
        String cardNumber = getCardNumber();
        cardNumber.getClass();
        bx3 bx3Var = new bx3(cardNumber);
        gw3 gw3Var = this.j;
        if (gw3Var == null) {
            Intrinsics.j("validator");
            throw null;
        }
        sq5 a = gw3Var.a();
        hx3 hx3Var = this.l.a;
        hx3Var.getClass();
        ArrayList arrayList = vx3.f;
        boolean z2 = false;
        ((ArrayList) a.b).add(new sq5(gos.n(hx3Var, false).c));
        yx3 b = a.b(bx3Var);
        boolean z3 = b == null;
        boolean z4 = b instanceof edr;
        rdk rdkVar = this.a;
        if (z4 || !(!z || z3 || StringsKt.U(getCardNumber()))) {
            if (b == null || (string = b.a) == null) {
                string = getResources().getString(R.string.paymentsdk_prebuilt_wrong_card_number_message);
                string.getClass();
            }
            announceForAccessibility(string);
            TextView textView = (TextView) rdkVar.f;
            Resources.Theme theme = getContext().getTheme();
            theme.getClass();
            textView.setTextColor(bfg.F(R.attr.colorError, theme));
            z2 = true;
        } else {
            TextView textView2 = (TextView) rdkVar.f;
            Resources.Theme theme2 = getContext().getTheme();
            theme2.getClass();
            textView2.setTextColor(bfg.F(R.attr.paymentsdk_prebuilt_divkitInputTitleTextColor, theme2));
        }
        this.h = z2;
        this.b.invoke();
        if (this.o != z3) {
            this.o = z3;
            this.c.invoke(Boolean.valueOf(z3));
        }
    }

    @NotNull
    public final String getCardNumber() {
        String str;
        int ordinal = this.g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return String.valueOf(this.m);
            }
            b6e.s();
            return null;
        }
        Editable text = ((EditText) this.a.g).getText();
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

    @NotNull
    public final ImageView getClearInputView() {
        return (AppCompatImageView) this.a.e;
    }

    public final boolean getHasError() {
        return this.h;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnEmpty() {
        return this.d;
    }

    @NotNull
    public final Function1<Boolean, Unit> getOnFinish() {
        return this.c;
    }

    public final Function0<Unit> getOnFocus() {
        return this.e;
    }

    @NotNull
    public final Function0<Unit> getOnKeyboardAction() {
        return this.f;
    }

    @NotNull
    public final ImageView getScannerImageView() {
        return (AppCompatImageView) this.a.d;
    }

    @NotNull
    public final l17 getState() {
        return this.g;
    }

    public final void setCallback(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.b = function0;
    }

    public final void setEnableDebranding(boolean z) {
        this.i = z;
    }

    public final void setExternalPreparedNumber(@NotNull String str) {
        str.getClass();
        ((EditText) this.a.g).setText(str);
    }

    public final void setHasError(boolean z) {
        this.h = z;
    }

    public final void setInputEventListener(@NotNull Function1<? super lne, Unit> function1) {
        function1.getClass();
        this.n = function1;
    }

    public final void setOnCardTypeChangedListener(@NotNull Function1<? super vx3, Unit> function1) {
        function1.getClass();
        this.k = function1;
    }

    public final void setOnEmpty(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.d = function1;
    }

    public final void setOnFinish(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setOnFocus(Function0<Unit> function0) {
        this.e = function0;
    }

    public final void setOnKeyboardAction(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f = function0;
    }

    public final void setState(@NotNull l17 l17Var) {
        l17Var.getClass();
        if (l17Var != this.g) {
            this.g = l17Var;
            int ordinal = l17Var.ordinal();
            rdk rdkVar = this.a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                }
                this.m = ((EditText) rdkVar.g).getText();
                ((TextView) rdkVar.c).setVisibility(0);
                ((EditText) rdkVar.g).setText(mlr.L(4, String.valueOf(this.m)));
                return;
            }
            ((EditText) rdkVar.g).setText(this.m);
            ((TextView) rdkVar.c).setVisibility(8);
            EditText editText = (EditText) rdkVar.g;
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
    }

    public final void setValidator(@NotNull gw3 gw3Var) {
        gw3Var.getClass();
        this.j = gw3Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DKCardNumberInput(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ DKCardNumberInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DKCardNumberInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
