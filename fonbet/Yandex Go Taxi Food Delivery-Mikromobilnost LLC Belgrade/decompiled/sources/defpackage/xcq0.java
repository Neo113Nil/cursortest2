package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;
import com.yandex.payment.sdk.core.data.BankName;
import com.yandex.payment.sdk.core.data.CardPaymentSystem;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;
import com.yandex.payment.sdk.ui.view.payment.SelectPaymentAdapter$AdapterMode;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.y22;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class xcq0 extends RecyclerView.Adapter {
    public vcq0 A;
    public boolean B;
    public boolean C;
    public final ucq0 a;
    public final dn60 b;
    public final boolean c;
    public final SelectPaymentAdapter$AdapterMode w;
    public final rwo x;
    public List y = EmptyList.a;
    public boolean z;

    public xcq0(ucq0 ucq0Var, dn60 dn60Var, boolean z, SelectPaymentAdapter$AdapterMode selectPaymentAdapter$AdapterMode, rwo rwoVar) {
        this.a = ucq0Var;
        this.b = dn60Var;
        this.c = z;
        this.w = selectPaymentAdapter$AdapterMode;
        this.x = rwoVar;
    }

    public static final void f(xcq0 xcq0Var, vcq0 vcq0Var, ImageView imageView, ImageView imageView2, Context context) {
        Integer valueOf;
        int i;
        int i2;
        int i3;
        PaymentMethod paymentMethod = vcq0Var.a;
        boolean z = xcq0Var.c;
        boolean z2 = xcq0Var.C;
        if (z) {
            if (paymentMethod instanceof PaymentMethod.Card) {
                valueOf = eja0.a(((PaymentMethod.Card) paymentMethod).getSystem(), z, z2);
            } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
                valueOf = Integer.valueOf(z2 ? dxg0.paymentsdk_ic_unknown_bank_light : dxg0.paymentsdk_ic_sbp);
            } else if (paymentMethod instanceof PaymentMethod.YBMethod) {
                if (z2) {
                    i3 = dxg0.paymentsdk_ic_unknown_bank_light;
                } else {
                    PaymentMethod.YBMethod yBMethod = (PaymentMethod.YBMethod) paymentMethod;
                    i3 = yBMethod.isSplitCard() ? dxg0.paymentsdk_ic_split_card : yBMethod.isProCard() ? dxg0.paymentsdk_ic_pro_card : dxg0.paymentsdk_ic_yb;
                }
                valueOf = Integer.valueOf(i3);
            } else if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE)) {
                valueOf = Integer.valueOf(dxg0.paymentsdk_ic_card_cash);
            } else if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
                valueOf = Integer.valueOf(dxg0.paymentsdk_ic_card_google_pay);
            } else if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
                valueOf = Integer.valueOf(dxg0.paymentsdk_ic_card_new_light);
            } else if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE) || paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
                valueOf = Integer.valueOf(z2 ? dxg0.paymentsdk_ic_unknown_bank_light : dxg0.paymentsdk_ic_sbp);
            } else {
                if (!paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE) && !paymentMethod.equals(PaymentMethod.Split.INSTANCE) && !paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                    w511.b();
                    return;
                }
                valueOf = null;
            }
        } else if (paymentMethod instanceof PaymentMethod.Card) {
            valueOf = eja0.a(((PaymentMethod.Card) paymentMethod).getSystem(), z, z2);
        } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
            valueOf = Integer.valueOf(z2 ? dxg0.paymentsdk_ic_unknown_bank_light : dxg0.paymentsdk_ic_sbp);
        } else if (paymentMethod instanceof PaymentMethod.YBMethod) {
            if (z2) {
                i = dxg0.paymentsdk_ic_unknown_bank_light;
            } else {
                PaymentMethod.YBMethod yBMethod2 = (PaymentMethod.YBMethod) paymentMethod;
                i = yBMethod2.isSplitCard() ? dxg0.paymentsdk_ic_split_card : yBMethod2.isProCard() ? dxg0.paymentsdk_ic_pro_card : dxg0.paymentsdk_ic_yb;
            }
            valueOf = Integer.valueOf(i);
        } else if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE)) {
            valueOf = Integer.valueOf(dxg0.paymentsdk_ic_card_cash);
        } else if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            valueOf = Integer.valueOf(dxg0.paymentsdk_ic_card_google_pay);
        } else if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            valueOf = Integer.valueOf(dxg0.paymentsdk_ic_card_new_dark);
        } else if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE) || paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
            valueOf = Integer.valueOf(z2 ? dxg0.paymentsdk_ic_unknown_bank_light : dxg0.paymentsdk_ic_sbp);
        } else {
            if (!paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE) && !paymentMethod.equals(PaymentMethod.Split.INSTANCE) && !paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
                w511.b();
                return;
            }
            valueOf = null;
        }
        Drawable drawable = valueOf != null ? context.getDrawable(valueOf.intValue()) : null;
        int i4 = wcq0.a[xcq0Var.w.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                imageView2.setVisibility(8);
            } else if (i4 != 3) {
                w511.b();
                return;
            } else {
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
            }
        } else if (paymentMethod instanceof PaymentMethod.Card) {
            BankName bankName = ((PaymentMethod.Card) paymentMethod).getBankName();
            if (!z) {
                switch (dja0.a[bankName.ordinal()]) {
                    case 1:
                        i2 = dxg0.paymentsdk_ic_alfa_light;
                        break;
                    case 2:
                        i2 = dxg0.paymentsdk_ic_sber_light;
                        break;
                    case 3:
                        i2 = dxg0.paymentsdk_ic_tinkoff_light;
                        break;
                    case 4:
                        i2 = dxg0.paymentsdk_ic_vtb_light;
                        break;
                    case 5:
                        i2 = dxg0.paymentsdk_ic_gazprom_dark;
                        break;
                    case 6:
                        i2 = dxg0.paymentsdk_ic_open_light;
                        break;
                    case 7:
                        i2 = dxg0.paymentsdk_ic_psb_dark;
                        break;
                    case 8:
                        i2 = dxg0.paymentsdk_ic_ros_light;
                        break;
                    case 9:
                        i2 = dxg0.paymentsdk_ic_unicredit_light;
                        break;
                    case 10:
                        i2 = dxg0.paymentsdk_ic_raiffeisen_light;
                        break;
                    default:
                        i2 = dxg0.paymentsdk_ic_unknown_bank_light;
                        break;
                }
            } else {
                switch (dja0.a[bankName.ordinal()]) {
                    case 1:
                        i2 = dxg0.paymentsdk_ic_alfa_light;
                        break;
                    case 2:
                        i2 = dxg0.paymentsdk_ic_sber_light;
                        break;
                    case 3:
                        i2 = dxg0.paymentsdk_ic_tinkoff_light;
                        break;
                    case 4:
                        i2 = dxg0.paymentsdk_ic_vtb_light;
                        break;
                    case 5:
                        i2 = dxg0.paymentsdk_ic_gazprom_light;
                        break;
                    case 6:
                        i2 = dxg0.paymentsdk_ic_open_light;
                        break;
                    case 7:
                        i2 = dxg0.paymentsdk_ic_psb_light;
                        break;
                    case 8:
                        i2 = dxg0.paymentsdk_ic_ros_light;
                        break;
                    case 9:
                        i2 = dxg0.paymentsdk_ic_unicredit_light;
                        break;
                    case 10:
                        i2 = dxg0.paymentsdk_ic_raiffeisen_light;
                        break;
                    default:
                        i2 = dxg0.paymentsdk_ic_unknown_bank_light;
                        break;
                }
            }
            imageView.setImageDrawable(context.getDrawable(i2));
            imageView2.setImageDrawable(drawable);
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
        } else if (paymentMethod instanceof PaymentMethod.SbpToken) {
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            imageView2.setVisibility(8);
        }
        if (paymentMethod instanceof PaymentMethod.SbpToken) {
            ((p5j0) Glide.with(imageView).load(vcq0Var.d).o(dxg0.paymentsdk_ic_unknown_bank_light)).G(imageView);
            imageView2.setImageResource(xcq0Var.C ? dxg0.paymentsdk_ic_unknown_bank_light : dxg0.paymentsdk_ic_sbp);
        }
    }

    public static final String g(xcq0 xcq0Var, PaymentMethod paymentMethod, Context context, boolean z) {
        int i;
        String string;
        String str = "";
        if (paymentMethod instanceof PaymentMethod.Card) {
            PaymentMethod.Card card = (PaymentMethod.Card) paymentMethod;
            CardPaymentSystem system = card.getSystem() == CardPaymentSystem.MIR ? null : card.getSystem();
            CardPaymentSystem system2 = z ? null : card.getSystem();
            if (system2 != null) {
                system = system2;
            }
            if (card.getFamilyInfo() != null && (string = context.getString(tyh0.paymentsdk_prebuilt_family_pay_title)) != null) {
                str = string;
            } else if (system != null) {
                str = znb1.g(system);
            }
            return context.getString(tyh0.paymentsdk_prebuilt_card_list_item_number_format, str, gvu0.B0(4, card.getAccount()));
        }
        if (paymentMethod instanceof PaymentMethod.SbpToken) {
            if (n891.l()) {
                String memberNameRus = ((PaymentMethod.SbpToken) paymentMethod).getMemberNameRus();
                if (memberNameRus != null) {
                    return memberNameRus;
                }
            } else {
                String memberName = ((PaymentMethod.SbpToken) paymentMethod).getMemberName();
                if (memberName != null) {
                    return memberName;
                }
            }
            return "";
        }
        if (paymentMethod instanceof PaymentMethod.YBMethod) {
            if (z) {
                i = tyh0.paymentsdk_non_new_sbp_title;
            } else {
                PaymentMethod.YBMethod yBMethod = (PaymentMethod.YBMethod) paymentMethod;
                i = yBMethod.isProCard() ? tyh0.paymentsdk_prebuilt_yb_pro_title : yBMethod.isSplitCard() ? tyh0.paymentsdk_prebuilt_yb_split_title : tyh0.paymentsdk_prebuilt_yb_title;
            }
            return context.getString(i);
        }
        if (paymentMethod.equals(PaymentMethod.Cash.INSTANCE)) {
            return context.getString(tyh0.paymentsdk_prebuilt_cash_title);
        }
        if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            return context.getString(tyh0.paymentsdk_prebuilt_gpay_title);
        }
        if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            return context.getString(tyh0.paymentsdk_prebuilt_another_card);
        }
        if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE) || paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
            return context.getString(z ? tyh0.paymentsdk_non_new_sbp_title : tyh0.paymentsdk_prebuilt_sbp_title);
        }
        if (paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE)) {
            return "Tinkoff credit";
        }
        if (paymentMethod.equals(PaymentMethod.Split.INSTANCE)) {
            return "split";
        }
        if (paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
            return "challenge polling";
        }
        w511.b();
        return null;
    }

    public static /* synthetic */ void i(xcq0 xcq0Var, List list, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        xcq0Var.h(list, num, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return ((vcq0) this.y.get(i)).a instanceof PaymentMethod.Card ? ((PaymentMethod.Card) r0).getId().hashCode() : r0.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        vcq0 vcq0Var = (vcq0) this.y.get(i);
        if (vcq0Var == null) {
            ny61.r("Unknown data type");
            return 0;
        }
        if (vcq0Var.c) {
            return 4;
        }
        PaymentMethod paymentMethod = vcq0Var.a;
        if (paymentMethod instanceof PaymentMethod.Card) {
            return vcq0Var.b ? 1 : 3;
        }
        if ((paymentMethod instanceof PaymentMethod.SbpToken) || (paymentMethod instanceof PaymentMethod.YBMethod) || paymentMethod.equals(PaymentMethod.Cash.INSTANCE) || paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            return 3;
        }
        if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            return 2;
        }
        if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE) || paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE) || paymentMethod.equals(PaymentMethod.TinkoffCredit.INSTANCE) || paymentMethod.equals(PaymentMethod.Split.INSTANCE) || paymentMethod.equals(PaymentMethod.ChallengePollingMethod.INSTANCE)) {
            return 3;
        }
        w511.b();
        return 0;
    }

    public final void h(List list, Integer num, boolean z) {
        vcq0 vcq0Var;
        this.y = list;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue >= list.size() || intValue < 0) {
                ny61.m("Selected index is out of methods array");
                return;
            }
            vcq0Var = (vcq0) list.get(intValue);
        } else {
            vcq0Var = null;
        }
        this.A = vcq0Var;
        if (z) {
            this.z = true;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((rcq0) x0Var).W(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            if (i == 2) {
                return new tcq0(this, from.inflate(xlh0.paymentsdk_item_payment_method, viewGroup, false), 0);
            }
            if (i == 3) {
                return new rcq0(this, from.inflate(xlh0.paymentsdk_item_payment_method, viewGroup, false), 0);
            }
            if (i == 4) {
                return new rcq0(this, from.inflate(xlh0.paymentsdk_item_payment_method, viewGroup, false), 1);
            }
            ny61.r(oyr.i(i, "Unknown view type: "));
            return null;
        }
        View inflate = from.inflate(xlh0.paymentsdk_item_payment_method_new_cvv_card, viewGroup, false);
        CvnInputViewImpl B = this.b.B(viewGroup.getContext());
        B.setOnCvnInputFocusChangeListener(new uyo0(19, this));
        final TextInputEditText textInputEditText = (TextInputEditText) B.findViewById(o9h0.paymentsdk_prebuilt_cvn_field);
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.sdk.ui.view.payment.SelectPaymentAdapter$onCreateViewHolder$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    if (TextInputEditText.this.hasFocus()) {
                        rwo rwoVar = this.x;
                        sv90 sv90Var = qv90.a;
                        String valueOf = String.valueOf(TextInputEditText.this.length());
                        sv90Var.getClass();
                        ((y22) rwoVar).a(sv90.o(valueOf));
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }
            });
        }
        ((FrameLayout) inflate.findViewById(o9h0.cvn_view)).addView(B);
        return new scq0(this, inflate, B);
    }
}
