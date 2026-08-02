package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.connectsdk.service.DeviceService;
import com.yandex.passport.internal.ui.social.gimap.m;
import com.yandex.passport.internal.ui.social.mail.b;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import com.yandex.payment.sdk.ui.view.EmailView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes4.dex */
public final /* synthetic */ class cx3 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CardNumberInput cardNumberInput = (CardNumberInput) obj;
                int i2 = CardNumberInput.o;
                if (z) {
                    Function0 function0 = cardNumberInput.d;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    cardNumberInput.a(true);
                }
                cardNumberInput.m.invoke(new jne(z, fbs.CARD_NUMBER));
                break;
            case 1:
                dn4 dn4Var = (dn4) obj;
                dn4Var.s(dn4Var.t());
                break;
            case 2:
                rn5 rn5Var = (rn5) obj;
                if (z) {
                    ((EditText) rn5Var.d).setOnFocusChangeListener(null);
                    p30 p30Var = (p30) rn5Var.e;
                    if (p30Var != null && p30Var.isShowing()) {
                        ((Window) Preconditions.nonNull(((p30) rn5Var.e).getWindow())).setSoftInputMode(5);
                        break;
                    }
                }
                break;
            case 3:
                CvnInput cvnInput = (CvnInput) obj;
                int i3 = CvnInput.i;
                cvnInput.g.invoke(new jne(z, fbs.CVN));
                if (!z) {
                    cvnInput.b(true);
                    break;
                }
                break;
            case 4:
                my6 my6Var = (my6) obj;
                int i4 = my6.h;
                Function1 function1 = my6Var.e;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
                if (!z) {
                    my6Var.b(true);
                    break;
                }
                break;
            case 5:
                DKCardNumberInput dKCardNumberInput = (DKCardNumberInput) obj;
                int i5 = DKCardNumberInput.q;
                if (z) {
                    Function0 function02 = dKCardNumberInput.e;
                    if (function02 != null) {
                        function02.invoke();
                    }
                } else {
                    dKCardNumberInput.a(true);
                }
                dKCardNumberInput.n.invoke(new jne(z, fbs.CARD_NUMBER));
                break;
            case 6:
                DKCvnInput dKCvnInput = (DKCvnInput) obj;
                int i6 = DKCvnInput.k;
                dKCvnInput.i.invoke(new jne(z, fbs.CVN));
                if (!z) {
                    dKCvnInput.b(true);
                    break;
                }
                break;
            case 7:
                DKExpirationDateInput dKExpirationDateInput = (DKExpirationDateInput) obj;
                int i7 = DKExpirationDateInput.g;
                dKExpirationDateInput.f.invoke(new jne(z, fbs.EXPIRATION_DATE));
                if (!z) {
                    dKExpirationDateInput.b(false, true);
                    break;
                }
                break;
            case 8:
                f2a f2aVar = (f2a) obj;
                int i8 = f2a.j;
                g0c g0cVar = f2aVar.h;
                if (g0cVar != null) {
                    ((x60) g0cVar).a(gut.s1(fbs.CVN, z, null));
                }
                if (!z) {
                    f2aVar.b(true);
                    break;
                }
                break;
            case 9:
                wra wraVar = (wra) obj;
                wraVar.l = z;
                wraVar.p();
                if (!z) {
                    wraVar.s(false);
                    wraVar.m = false;
                    break;
                }
                break;
            case 10:
                EmailView emailView = (EmailView) obj;
                int i9 = EmailView.f;
                emailView.e.invoke(Boolean.valueOf(z));
                if (!z) {
                    emailView.a(true);
                    break;
                }
                break;
            case 11:
                ExpirationDateInput expirationDateInput = (ExpirationDateInput) obj;
                int i10 = ExpirationDateInput.g;
                expirationDateInput.f.invoke(new jne(z, fbs.EXPIRATION_DATE));
                if (!z) {
                    expirationDateInput.b(false, true);
                    break;
                }
                break;
            case 12:
                sqo sqoVar = (sqo) obj;
                if (z) {
                    g0c y = sqoVar.y();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    vtm k = su4.k("Пользователь нажал на поиск в списке банков СБП", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = su4.g(1, ci0Var.a);
                    k.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j = su4.j(k, "event_name", "sbp_tap_on_search", "sbp_tap_on_search", k);
                    x60 x60Var = (x60) y;
                    x60Var.getClass();
                    x60Var.a(j);
                    break;
                }
                break;
            case 13:
                int i11 = m.x;
                ((ViewGroup) obj).invalidate();
                break;
            default:
                b bVar = (b) obj;
                if (!z) {
                    bVar.E();
                    break;
                }
                break;
        }
    }
}
