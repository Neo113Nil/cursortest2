package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class k17 extends ow3 {
    public final mmo a;
    public j17 b;
    public nw3 c;
    public g0c d;
    public sdk e;
    public Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k17(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_dk_card_input_view_impl, this);
        int i2 = R.id.paymentsdk_prebuilt_card_binding_layout;
        if (((LinearLayout) dag.v(R.id.paymentsdk_prebuilt_card_binding_layout, this)) != null) {
            i2 = R.id.paymentsdk_prebuilt_card_number_input;
            DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) dag.v(R.id.paymentsdk_prebuilt_card_number_input, this);
            if (dKCardNumberInput != null) {
                i2 = R.id.paymentsdk_prebuilt_card_number_to_expiration_date_space;
                Space space = (Space) dag.v(R.id.paymentsdk_prebuilt_card_number_to_expiration_date_space, this);
                if (space != null) {
                    i2 = R.id.paymentsdk_prebuilt_card_root_layout;
                    if (((LinearLayout) dag.v(R.id.paymentsdk_prebuilt_card_root_layout, this)) != null) {
                        i2 = R.id.paymentsdk_prebuilt_cvn_input;
                        DKCvnInput dKCvnInput = (DKCvnInput) dag.v(R.id.paymentsdk_prebuilt_cvn_input, this);
                        if (dKCvnInput != null) {
                            i2 = R.id.paymentsdk_prebuilt_expiration_date_input;
                            DKExpirationDateInput dKExpirationDateInput = (DKExpirationDateInput) dag.v(R.id.paymentsdk_prebuilt_expiration_date_input, this);
                            if (dKExpirationDateInput != null) {
                                i2 = R.id.paymentsdk_prebuilt_expiration_date_to_cvn_space;
                                Space space2 = (Space) dag.v(R.id.paymentsdk_prebuilt_expiration_date_to_cvn_space, this);
                                if (space2 != null) {
                                    this.a = new mmo(this, dKCardNumberInput, space, dKCvnInput, dKExpirationDateInput, space2, 14);
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

    @Override // defpackage.ow3
    public final void a() {
        j17 j17Var = this.b;
        if (j17Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        j17Var.e.a.b.setText((CharSequence) null);
        ((EditText) j17Var.f.a.b).setText((CharSequence) null);
        j17Var.f(jw3.a);
        DKCardNumberInput dKCardNumberInput = j17Var.d;
        TextView textView = (TextView) dKCardNumberInput.a.f;
        Resources.Theme theme = dKCardNumberInput.getContext().getTheme();
        theme.getClass();
        textView.setTextColor(bfg.F(R.attr.colorError, theme));
    }

    @Override // defpackage.kw3
    public final void e() {
        j17 j17Var = this.b;
        if (j17Var != null) {
            j17Var.d();
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    @NotNull
    public nw3 getMode() {
        nw3 nw3Var = this.c;
        if (nw3Var != null) {
            return nw3Var;
        }
        Intrinsics.j("cardInputMode");
        throw null;
    }

    public g3j getNewCard() {
        j17 j17Var = this.b;
        if (j17Var != null) {
            return j17Var.b();
        }
        Intrinsics.j("controller");
        throw null;
    }

    @NotNull
    public jw3 getState() {
        j17 j17Var = this.b;
        if (j17Var != null) {
            return j17Var.c;
        }
        Intrinsics.j("controller");
        throw null;
    }

    @Override // defpackage.kw3
    public final void h() {
        sdk sdkVar;
        j17 j17Var = this.b;
        if (j17Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        g3j b = j17Var.b();
        if (b != null) {
            nw3 nw3Var = this.c;
            if (nw3Var == null) {
                Intrinsics.j("cardInputMode");
                throw null;
            }
            int ordinal = nw3Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (sdkVar = this.e) != null) {
                    vwb.G(sdkVar).d(b);
                    return;
                }
                return;
            }
            sdk sdkVar2 = this.e;
            if (sdkVar2 != null) {
                vwb.G(sdkVar2).a(b);
            }
        }
    }

    @Override // defpackage.kw3
    public final void j() {
        j17 j17Var = this.b;
        if (j17Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        DKCardNumberInput dKCardNumberInput = j17Var.d;
        DKCvnInput dKCvnInput = j17Var.f;
        DKExpirationDateInput dKExpirationDateInput = j17Var.e;
        int ordinal = j17Var.c.ordinal();
        if (ordinal == 0) {
            dKCardNumberInput.requestFocus();
            vwb.W((EditText) dKCardNumberInput.a.g);
            return;
        }
        if (ordinal == 1) {
            dKCardNumberInput.requestFocus();
            vwb.W((EditText) dKCardNumberInput.a.g);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            dKCvnInput.a();
        } else if (dKExpirationDateInput.a()) {
            dKCvnInput.a();
        } else {
            dKExpirationDateInput.requestFocus();
            vwb.W(dKExpirationDateInput.a.b);
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    public void setCardPaymentSystemListener(Function1<? super ix3, Unit> function1) {
        j17 j17Var = this.b;
        if (j17Var != null) {
            j17Var.m = function1;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    public void setFragmentOnStateChangeListener(Function1<? super jw3, Unit> function1) {
        this.f = function1;
    }

    public void setHelpCallback(@NotNull Function1<? super Integer, Unit> function1) {
        function1.getClass();
        j17 j17Var = this.b;
        if (j17Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        function1.getClass();
        j17Var.f.setHelpCallback(function1);
    }

    public void setInputErrorListener(Function1<? super ene, Unit> function1) {
        j17 j17Var = this.b;
        if (j17Var != null) {
            j17Var.k = function1;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    public void setMaskedCardNumberListener(Function1<? super String, Unit> function1) {
        j17 j17Var = this.b;
        if (j17Var != null) {
            j17Var.l = function1;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    public void setOnStateChangeListener(Function1<? super jw3, Unit> function1) {
        j17 j17Var = this.b;
        if (j17Var != null) {
            j17Var.j = new s30(18, this, function1);
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    @Override // defpackage.ow3
    public void setPaymentApi(sdk sdkVar) {
        this.e = sdkVar;
    }

    @Override // defpackage.ow3
    public void setSaveCardOnPayment(boolean z) {
        j17 j17Var = this.b;
        if (j17Var != null) {
            j17Var.o = z;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k17(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ k17(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k17(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
