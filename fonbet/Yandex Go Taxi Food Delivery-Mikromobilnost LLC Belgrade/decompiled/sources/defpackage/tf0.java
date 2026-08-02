package defpackage;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.tf0;
import defpackage.tje;
import java.util.LinkedHashMap;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.contacts.a;

/* loaded from: classes13.dex */
public final class tf0 extends ad5 {
    public final zor0 A;
    public final vnr0 B;
    public final rf0 C;
    public CharSequence D;
    public CharSequence E;
    public boolean F;
    public final qf0 x;
    public final a y;
    public final v z;

    public tf0(qf0 qf0Var, a aVar, v vVar, zor0 zor0Var, vnr0 vnr0Var) {
        super(pf0.class);
        this.x = qf0Var;
        this.y = aVar;
        this.z = vVar;
        this.A = zor0Var;
        this.B = vnr0Var;
        this.C = qf0Var.d;
        this.D = "";
        this.E = "";
        String str = qf0Var.a.b;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = qf0Var.c;
        LinkedHashMap linkedHashMap = vnr0Var.w;
        linkedHashMap.put("group_id", str);
        linkedHashMap.put(ClidProvider.STATE, vnr0Var.k(str));
        linkedHashMap.put("open_reason", sharedPaymentsOpenReason.getAnalyticsName());
    }

    public static final void Kg(tf0 tf0Var, ide ideVar) {
        if (ideVar == null) {
            tf0Var.D = "";
            tf0Var.E = "";
        } else {
            tf0Var.getClass();
            tf0Var.D = evu0.k0(ideVar.a).toString();
            tf0Var.E = evu0.k0(ideVar.b).toString();
        }
        tf0Var.Mg();
    }

    public final Account Lg() {
        return this.x.a.b();
    }

    public final void Mg() {
        final int i = 1;
        final int i2 = 0;
        boolean z = this.F || !(evu0.J(this.D) || evu0.J(this.E));
        rf0 rf0Var = this.x.d;
        CharSequence charSequence = this.D;
        ((pf0) Dg()).X0(new zf0(rf0Var, charSequence, this.E, this.F ? pwf0.c : new Runnable(this) { // from class: com.yandex.go.payments.shared.members.addmember.a
            public final /* synthetic */ tf0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                tf0 tf0Var = this.b;
                switch (i3) {
                    case 0:
                        tf0Var.B.n(tf0Var.Lg().a, tf0Var.x.c, SharedPaymentAnalytics$Button.FROM_CONTACTS);
                        tje.N(tf0Var.Jg(), null, null, new AddMemberPresenter$onContactsClick$1(tf0Var, null), 3);
                        break;
                    default:
                        tf0Var.B.n(tf0Var.Lg().a, tf0Var.x.c, SharedPaymentAnalytics$Button.DONE);
                        tf0Var.F = true;
                        tf0Var.Mg();
                        tje.N(tf0Var.Jg(), null, null, new AddMemberPresenter$onAddClick$1(tf0Var, null), 3);
                        break;
                }
            }
        }, (!z || evu0.J(charSequence) || evu0.J(this.E)) ? pwf0.c : new Runnable(this) { // from class: com.yandex.go.payments.shared.members.addmember.a
            public final /* synthetic */ tf0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                tf0 tf0Var = this.b;
                switch (i3) {
                    case 0:
                        tf0Var.B.n(tf0Var.Lg().a, tf0Var.x.c, SharedPaymentAnalytics$Button.FROM_CONTACTS);
                        tje.N(tf0Var.Jg(), null, null, new AddMemberPresenter$onContactsClick$1(tf0Var, null), 3);
                        break;
                    default:
                        tf0Var.B.n(tf0Var.Lg().a, tf0Var.x.c, SharedPaymentAnalytics$Button.DONE);
                        tf0Var.F = true;
                        tf0Var.Mg();
                        tje.N(tf0Var.Jg(), null, null, new AddMemberPresenter$onAddClick$1(tf0Var, null), 3);
                        break;
                }
            }
        }, this.F, z));
    }
}
