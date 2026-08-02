package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.textfield.TextInputEditText;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class ex3 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ex3(LinearLayout linearLayout, int i) {
        this.a = i;
        this.c = linearLayout;
        this.b = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ed, code lost:
    
        if (r13 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f0, code lost:
    
        r16 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
    
        if (r13 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242 A[PHI: r16
      0x0242: PHI (r16v6 java.lang.Integer) = 
      (r16v1 java.lang.Integer)
      (r16v2 java.lang.Integer)
      (r16v3 java.lang.Integer)
      (r16v4 java.lang.Integer)
      (r16v5 java.lang.Integer)
      (r16v7 java.lang.Integer)
      (r16v8 java.lang.Integer)
      (r16v9 java.lang.Integer)
      (r16v10 java.lang.Integer)
      (r16v11 java.lang.Integer)
      (r16v12 java.lang.Integer)
      (r16v13 java.lang.Integer)
      (r16v14 java.lang.Integer)
      (r16v1 java.lang.Integer)
      (r16v15 java.lang.Integer)
      (r16v16 java.lang.Integer)
      (r16v17 java.lang.Integer)
      (r16v18 java.lang.Integer)
     binds: [B:89:0x0218, B:96:0x023b, B:95:0x0233, B:94:0x022b, B:92:0x0220, B:69:0x0211, B:65:0x01f6, B:64:0x01f3, B:63:0x01f0, B:60:0x01e1, B:59:0x01dd, B:58:0x01d9, B:57:0x01d5, B:54:0x01cd, B:68:0x0209, B:67:0x0201, B:66:0x01f9, B:61:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024d  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        Function1 function1;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                editable.getClass();
                CardNumberInput cardNumberInput = (CardNumberInput) obj;
                if (cardNumberInput.getState() == fx3.b || Intrinsics.d(editable.toString(), (String) this.b)) {
                    return;
                }
                cardNumberInput.m.invoke(new kne(fbs.CARD_NUMBER));
                StringBuilder sb = new StringBuilder();
                int length = editable.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = editable.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                ArrayList arrayList = vx3.f;
                vx3 o = gos.o(sb.toString());
                if (sb.length() <= ((Number) CollectionsKt.Y(o.c)).intValue()) {
                    this.b = ox6.t(sb.toString(), o.e);
                    editable.setFilters(new InputFilter[0]);
                }
                int length2 = editable.length();
                String str = (String) this.b;
                editable.replace(0, length2, str, 0, str.length());
                nnd nndVar = cardNumberInput.a;
                vx3 o2 = gos.o(cardNumberInput.getCardNumber());
                hx3 hx3Var = cardNumberInput.k.a;
                hx3 hx3Var2 = o2.a;
                if (hx3Var != hx3Var2) {
                    cardNumberInput.k = o2;
                    ix3 K0 = zsd.K0(hx3Var2);
                    String str2 = hx3Var2.a;
                    Context context = cardNumberInput.getContext();
                    context.getClass();
                    Integer r = dag.r(K0, true, cardNumberInput.h);
                    Drawable drawable = r != null ? context.getDrawable(r.intValue()) : null;
                    if (hx3Var2 != hx3.UNKNOWN) {
                        cardNumberInput.announceForAccessibility(str2);
                        ((EditText) nndVar.c).setHint(cardNumberInput.getContext().getString(R.string.paymentsdk_prebuilt_card_number_input_title) + StringUtil.SPACE + str2);
                    } else {
                        ((EditText) nndVar.c).setHint(cardNumberInput.getContext().getString(R.string.paymentsdk_prebuilt_card_number_input_title));
                    }
                    ((EditText) nndVar.c).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    Function1 function12 = cardNumberInput.j;
                    if (function12 != null) {
                        function12.invoke(cardNumberInput.k);
                    }
                }
                cardNumberInput.a(sb.length() >= 16);
                return;
            case 1:
                editable.getClass();
                DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) obj;
                if (dKCardNumberInput.getState() == l17.b || Intrinsics.d(editable.toString(), (String) this.b)) {
                    return;
                }
                dKCardNumberInput.n.invoke(new kne(fbs.CARD_NUMBER));
                StringBuilder sb2 = new StringBuilder();
                int length3 = editable.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    char charAt2 = editable.charAt(i3);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                }
                ArrayList arrayList2 = vx3.f;
                vx3 o3 = gos.o(sb2.toString());
                if (sb2.length() <= ((Number) CollectionsKt.Y(o3.c)).intValue()) {
                    this.b = ox6.t(sb2.toString(), o3.e);
                    editable.setFilters(new InputFilter[0]);
                }
                int length4 = editable.length();
                String str3 = (String) this.b;
                editable.replace(0, length4, str3, 0, str3.length());
                rdk rdkVar = dKCardNumberInput.a;
                vx3 o4 = gos.o(dKCardNumberInput.getCardNumber());
                hx3 hx3Var3 = dKCardNumberInput.l.a;
                hx3 hx3Var4 = o4.a;
                if (hx3Var3 != hx3Var4) {
                    dKCardNumberInput.l = o4;
                    ix3 K02 = zsd.K0(hx3Var4);
                    String str4 = hx3Var4.a;
                    Resources.Theme theme = dKCardNumberInput.getContext().getTheme();
                    theme.getClass();
                    boolean E = bfg.E(theme, R.attr.paymentsdk_is_light_theme, true);
                    Context context2 = dKCardNumberInput.getContext();
                    context2.getClass();
                    boolean z = dKCardNumberInput.i;
                    Integer valueOf = Integer.valueOf(R.drawable.paymentsdk_dk_ic_american_express);
                    Integer valueOf2 = Integer.valueOf(R.drawable.paymentsdk_dk_ic_diners);
                    Integer valueOf3 = Integer.valueOf(R.drawable.paymentsdk_dk_ic_rps);
                    Integer valueOf4 = Integer.valueOf(R.drawable.paymentsdk_dk_ic_uzcard);
                    Integer valueOf5 = Integer.valueOf(R.drawable.paymentsdk_dk_ic_visa);
                    Integer valueOf6 = Integer.valueOf(R.drawable.paymentsdk_dk_ic_visa_electron);
                    if (E) {
                        switch (K02.ordinal()) {
                            case 0:
                                Drawable drawable2 = valueOf == null ? context2.getDrawable(valueOf.intValue()) : null;
                                if (hx3Var4 == hx3.UNKNOWN) {
                                    dKCardNumberInput.announceForAccessibility(str4);
                                    ((EditText) rdkVar.g).setHint(dKCardNumberInput.getContext().getString(R.string.paymentsdk_prebuilt_card_number_input_title) + StringUtil.SPACE + str4);
                                } else {
                                    ((EditText) rdkVar.g).setHint(dKCardNumberInput.p.isEnabled() ? dKCardNumberInput.getContext().getString(R.string.paymentsdk_prebuilt_card_number_input_title) : dKCardNumberInput.getContext().getString(R.string.paymentsdk_prebuilt_card_number_hint));
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                    function1.invoke(dKCardNumberInput.l);
                                    break;
                                }
                                break;
                            case 1:
                                valueOf = valueOf2;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 2:
                                valueOf = 2131232387;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 3:
                                valueOf = 2131232391;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 4:
                                valueOf = 2131232388;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 5:
                                valueOf = 2131232392;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 6:
                                valueOf = 2131232393;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 7:
                                break;
                            case 8:
                                valueOf = Integer.valueOf(R.drawable.paymentsdk_dk_ic_union_pay_light);
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 9:
                                valueOf = valueOf4;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 10:
                                valueOf = valueOf5;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 11:
                                valueOf = valueOf6;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 12:
                                valueOf = null;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            default:
                                b6e.s();
                                return;
                        }
                    } else {
                        switch (K02.ordinal()) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                valueOf = 2131232386;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 3:
                                valueOf = Integer.valueOf(R.drawable.paymentsdk_dk_ic_jcb_dark);
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 4:
                                valueOf = 2131232389;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                valueOf = 2131232395;
                                if (valueOf == null) {
                                }
                                if (hx3Var4 == hx3.UNKNOWN) {
                                }
                                ((ImageView) rdkVar.b).setVisibility(drawable2 == null ? 0 : 8);
                                ((ImageView) rdkVar.b).setImageDrawable(drawable2);
                                function1 = dKCardNumberInput.k;
                                if (function1 != null) {
                                }
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            case 11:
                                break;
                            case 12:
                                break;
                            default:
                                b6e.s();
                                return;
                        }
                    }
                }
                dKCardNumberInput.getOnEmpty().invoke(Boolean.valueOf(editable.length() == 0));
                dKCardNumberInput.a(sb2.length() >= 16);
                return;
            case 2:
                Function1 function13 = (Function1) this.b;
                String obj2 = editable != null ? editable.toString() : null;
                if (obj2 == null) {
                    obj2 = "";
                }
                function13.invoke(obj2);
                ((ImageView) ((u37) obj).a.c).setVisibility((editable == null || StringsKt.U(editable)) ? 8 : 0);
                return;
            case 3:
                sqo sqoVar = (sqo) this.b;
                ol2 ol2Var = sqoVar.k;
                if (ol2Var == null) {
                    Intrinsics.j("banksAdapter");
                    throw null;
                }
                ol2Var.e.filter(editable);
                String valueOf7 = String.valueOf(editable);
                String concat = "Введенное значение в поиске банков: ".concat(valueOf7);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("input", new jkr(valueOf7));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = ((EditText) obj).hasFocus() ? su4.j(vtmVar, "event_name", "sbp_other_bank_list-bank_search-input", "sbp_other_bank_list-bank_search-input", vtmVar) : null;
                if (j != null) {
                    x60 x60Var = (x60) sqoVar.y();
                    x60Var.getClass();
                    x60Var.a(j);
                    return;
                }
                return;
            default:
                TextInputEditText textInputEditText = (TextInputEditText) this.b;
                if (textInputEditText.hasFocus()) {
                    g0c g0cVar = ((mcp) obj).h;
                    qne D = gut.D(String.valueOf(textInputEditText.length()));
                    x60 x60Var2 = (x60) g0cVar;
                    x60Var2.getClass();
                    x60Var2.a(D);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    public /* synthetic */ ex3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }
}
