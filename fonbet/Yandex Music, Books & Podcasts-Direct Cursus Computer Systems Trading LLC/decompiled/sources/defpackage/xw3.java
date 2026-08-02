package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class xw3 extends ow3 {
    public final cr a;
    public vw3 b;
    public nw3 c;
    public g0c d;
    public sdk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw3(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.paymentsdk_card_input_view_impl, this);
        int i2 = R.id.paymentsdk_prebuilt_card_binding_layout;
        if (((LinearLayout) dag.v(R.id.paymentsdk_prebuilt_card_binding_layout, this)) != null) {
            i2 = R.id.paymentsdk_prebuilt_card_number_input;
            CardNumberInput cardNumberInput = (CardNumberInput) dag.v(R.id.paymentsdk_prebuilt_card_number_input, this);
            if (cardNumberInput != null) {
                i2 = R.id.paymentsdk_prebuilt_card_number_to_expiration_date_space;
                Space space = (Space) dag.v(R.id.paymentsdk_prebuilt_card_number_to_expiration_date_space, this);
                if (space != null) {
                    i2 = R.id.paymentsdk_prebuilt_card_number_to_scanner_space;
                    Space space2 = (Space) dag.v(R.id.paymentsdk_prebuilt_card_number_to_scanner_space, this);
                    if (space2 != null) {
                        i2 = R.id.paymentsdk_prebuilt_card_root_layout;
                        if (((LinearLayout) dag.v(R.id.paymentsdk_prebuilt_card_root_layout, this)) != null) {
                            i2 = R.id.paymentsdk_prebuilt_card_scanner;
                            ImageView imageView = (ImageView) dag.v(R.id.paymentsdk_prebuilt_card_scanner, this);
                            if (imageView != null) {
                                i2 = R.id.paymentsdk_prebuilt_cvn_input;
                                CvnInput cvnInput = (CvnInput) dag.v(R.id.paymentsdk_prebuilt_cvn_input, this);
                                if (cvnInput != null) {
                                    i2 = R.id.paymentsdk_prebuilt_error_text;
                                    TextView textView = (TextView) dag.v(R.id.paymentsdk_prebuilt_error_text, this);
                                    if (textView != null) {
                                        i2 = R.id.paymentsdk_prebuilt_expiration_date_input;
                                        ExpirationDateInput expirationDateInput = (ExpirationDateInput) dag.v(R.id.paymentsdk_prebuilt_expiration_date_input, this);
                                        if (expirationDateInput != null) {
                                            i2 = R.id.paymentsdk_prebuilt_expiration_date_to_cvn_space;
                                            Space space3 = (Space) dag.v(R.id.paymentsdk_prebuilt_expiration_date_to_cvn_space, this);
                                            if (space3 != null) {
                                                this.a = new cr(this, cardNumberInput, space, space2, imageView, cvnInput, textView, expirationDateInput, space3);
                                                return;
                                            }
                                        }
                                    }
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
        vw3 vw3Var = this.b;
        if (vw3Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        ((EditText) vw3Var.d.a.b).setText((CharSequence) null);
        vw3Var.e.a.b.setText((CharSequence) null);
        vw3Var.e(jw3.a);
        CardNumberInput cardNumberInput = vw3Var.c;
        TextView textView = (TextView) cardNumberInput.a.b;
        Resources.Theme theme = cardNumberInput.getContext().getTheme();
        theme.getClass();
        textView.setTextColor(qgg.c0(R.attr.colorError, theme));
    }

    @Override // defpackage.kw3
    public final void e() {
        vw3 vw3Var = this.b;
        if (vw3Var != null) {
            vw3Var.c();
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

    @Override // defpackage.kw3
    public final void h() {
        sdk sdkVar;
        vw3 vw3Var = this.b;
        if (vw3Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        CvnInput cvnInput = vw3Var.e;
        ExpirationDateInput expirationDateInput = vw3Var.d;
        CardNumberInput cardNumberInput = vw3Var.c;
        g3j g3jVar = (cardNumberInput.n && expirationDateInput.a() && cvnInput.c() == null) ? new g3j(cardNumberInput.getCardNumber(), expirationDateInput.getExpirationMonth(), expirationDateInput.getExpirationYear(), cvnInput.getCvn(), vw3Var.k, cm2.UnknownBank) : null;
        if (g3jVar != null) {
            nw3 nw3Var = this.c;
            if (nw3Var == null) {
                Intrinsics.j("cardInputMode");
                throw null;
            }
            int ordinal = nw3Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (sdkVar = this.e) != null) {
                    qgg.D(sdkVar).d(g3jVar);
                    return;
                }
                return;
            }
            sdk sdkVar2 = this.e;
            if (sdkVar2 != null) {
                qgg.D(sdkVar2).a(g3jVar);
            }
        }
    }

    @Override // defpackage.kw3
    public final void j() {
        vw3 vw3Var = this.b;
        if (vw3Var == null) {
            Intrinsics.j("controller");
            throw null;
        }
        CardNumberInput cardNumberInput = vw3Var.c;
        ExpirationDateInput expirationDateInput = vw3Var.d;
        CvnInput cvnInput = vw3Var.e;
        int ordinal = vw3Var.b.ordinal();
        if (ordinal == 0) {
            cardNumberInput.requestFocus();
            qgg.d0((EditText) cardNumberInput.a.c);
            return;
        }
        if (ordinal == 1) {
            cardNumberInput.requestFocus();
            qgg.d0((EditText) cardNumberInput.a.c);
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            cvnInput.a();
        } else if (expirationDateInput.a()) {
            cvnInput.a();
        } else {
            expirationDateInput.requestFocus();
            qgg.d0((EditText) expirationDateInput.a.b);
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    public void setCardPaymentSystemListener(Function1<? super ix3, Unit> function1) {
        vw3 vw3Var = this.b;
        if (vw3Var != null) {
            vw3Var.h = function1;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    public void setMaskedCardNumberListener(Function1<? super String, Unit> function1) {
        vw3 vw3Var = this.b;
        if (vw3Var != null) {
            vw3Var.g = function1;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    @Override // defpackage.ow3, defpackage.kw3
    public void setOnStateChangeListener(Function1<? super jw3, Unit> function1) {
        vw3 vw3Var = this.b;
        if (vw3Var != null) {
            vw3Var.f = new s30(12, this, function1);
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
        vw3 vw3Var = this.b;
        if (vw3Var != null) {
            vw3Var.k = z;
        } else {
            Intrinsics.j("controller");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xw3(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ xw3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xw3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
