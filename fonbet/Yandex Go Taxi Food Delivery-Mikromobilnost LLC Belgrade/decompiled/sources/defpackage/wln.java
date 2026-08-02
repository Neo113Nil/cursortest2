package defpackage;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.Member;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.Iterator;
import ru.yandex.taxi.contacts.a;
import ru.yandex.taxi.exception.UnregisterPhoneException;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class wln extends ad5 {
    public final a A;
    public final zor0 B;
    public final zuj0 C;
    public final vnr0 D;
    public final String E;
    public final vor0 F;
    public final il G;
    public final SharedPaymentsOpenReason H;
    public final kh10 I;
    public bmn J;
    public final vln x;
    public final mum y;
    public final v z;

    public wln(vln vlnVar, mum mumVar, v vVar, a aVar, zor0 zor0Var, zuj0 zuj0Var, vnr0 vnr0Var) {
        super(uln.class);
        this.x = vlnVar;
        this.y = mumVar;
        this.z = vVar;
        this.A = aVar;
        this.B = zor0Var;
        this.C = zuj0Var;
        this.D = vnr0Var;
        this.E = vlnVar.a;
        this.F = vlnVar.c;
        this.G = vlnVar.b;
        this.H = vlnVar.d;
        kh10 kh10Var = vlnVar.e;
        this.I = kh10Var;
        this.J = new bmn(kh10Var);
    }

    public static final void Kg(wln wlnVar, ide ideVar) {
        bmn bmnVar = wlnVar.J;
        if (ideVar == null) {
            bmnVar.b = "";
            bmnVar.d = "";
        } else {
            bmnVar.b = evu0.k0(ideVar.a).toString();
            wlnVar.J.d = evu0.k0(ideVar.b).toString();
        }
        wlnVar.J.i = true;
        wlnVar.Og();
    }

    public static final void Lg(wln wlnVar, Account account) {
        wlnVar.G.a = account;
        bmn bmnVar = wlnVar.J;
        bmnVar.o = true;
        bmnVar.j = wlnVar.I.l;
        bmnVar.i = false;
        bmnVar.k = false;
        wlnVar.Og();
    }

    public final Member Mg() {
        Object obj;
        Iterator it = this.G.b().d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((Member) obj).a, this.E)) {
                break;
            }
        }
        if (obj != null) {
            return (Member) obj;
        }
        ny61.g("Member not found in account");
        return null;
    }

    public final void Ng(Throwable th) {
        if (!(th instanceof ValidationException)) {
            boolean z = th instanceof UnregisterPhoneException;
            vor0 vor0Var = this.F;
            if (!z) {
                vor0Var.a.n(this.B.a(th), true);
                return;
            }
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            String sharingText = ((UnregisterPhoneException) th).getSharingText();
            uhm uhmVar = new uhm(12, this);
            y yVar = vor0Var.a;
            vmn0 vmn0Var = new vmn0(yVar.a, message, sharingText, vor0Var.b.i);
            vmn0Var.x = uhmVar;
            vmn0Var.y = new yue(yVar, 2);
            ((AlertDialog) vmn0Var.w).show();
            return;
        }
        for (jz21 jz21Var : ((ValidationException) th).getErrors()) {
            String str = jz21Var.a;
            String str2 = jz21Var.b;
            int hashCode = str.hashCode();
            if (hashCode != 3373707) {
                if (hashCode != 102976443) {
                    if (hashCode == 106642798 && str.equals("phone")) {
                        this.J.e = str2;
                    }
                    jst.e.x(new IllegalStateException("Unknown field name = ".concat(jz21Var.a)), jz21Var.toString());
                } else if (str.equals("limit")) {
                    this.J.h = str2;
                } else {
                    jst.e.x(new IllegalStateException("Unknown field name = ".concat(jz21Var.a)), jz21Var.toString());
                }
            } else if (str.equals("name")) {
                this.J.c = str2;
            } else {
                jst.e.x(new IllegalStateException("Unknown field name = ".concat(jz21Var.a)), jz21Var.toString());
            }
        }
        Og();
    }

    public final void Og() {
        ((uln) Dg()).rg(this.J);
    }

    public final void onDismiss() {
        this.D.m(this.G.b, this.H, this.J, SharedPaymentAnalytics$Button.BACK);
        this.F.a.d();
    }
}
