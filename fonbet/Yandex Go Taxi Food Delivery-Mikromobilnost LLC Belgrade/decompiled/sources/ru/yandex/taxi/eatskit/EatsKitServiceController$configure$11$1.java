package ru.yandex.taxi.eatskit;

import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.paymentlist.domain.i;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.h6w0;
import defpackage.ljd0;
import defpackage.qxx0;
import defpackage.r3k0;
import defpackage.v2d0;
import defpackage.vid0;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.cashback.sdk.OpenPlusSubscriptionAction;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsKitServiceController$configure$11$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        vid0 vid0Var = (vid0) obj;
        gcn gcnVar = (gcn) obj2;
        h6w0 h6w0Var = (h6w0) this.receiver;
        if (h6w0Var.a.g()) {
            List list = ((i) h6w0Var.b).a.b.g().e.a;
            if (!(list.isEmpty() ? PersonalAccount.l : (PersonalAccount) list.get(0)).equals(PersonalAccount.l)) {
                v2d0 v2d0Var = new v2d0();
                if (vid0Var != null) {
                    v2d0Var.a = OpenPlusSubscriptionAction.BUY_SUBSCRIPTION;
                }
                h6w0Var.e.i(h6w0Var.d, new qxx0(CashbackCardContext.SUPERAPP.getValue(), v2d0Var.a(), new r3k0(14, h6w0Var, gcnVar)));
                return zy11.a;
            }
        }
        gcnVar.a(new ck7(new ljd0(false), null));
        return zy11.a;
    }
}
