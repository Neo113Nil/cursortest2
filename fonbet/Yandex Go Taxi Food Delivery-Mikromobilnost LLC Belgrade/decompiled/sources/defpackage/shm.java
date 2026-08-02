package defpackage;

import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.mobile.drive.wallet.DriveWalletGoErrorCode;
import com.yandex.mobile.drive.wallet.PaymentMethodType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes15.dex */
public final class shm implements tsr, ca20 {
    public hdm a;
    public ea20 b;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "drive_wallet_go");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        this.b = null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        oem oemVar;
        PaymentMethod$Type paymentMethod$Type;
        Object obj;
        String str = x920Var.a;
        if (this.a == null) {
            ((ba20) da20Var).error(DriveWalletGoErrorCode.MissingDelegate.getRaw(), "DriveWalletGoPlugin has no delegate and can't pass Flutter's requests to the client app", null);
            return;
        }
        if (!jl40.l(str, "pickPaymentMethods")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        Map map = (Map) x920Var.b;
        if (map == null) {
            ((ba20) da20Var).error(DriveWalletGoErrorCode.MissingArguments.getRaw(), b64.j(str, " requires cardId, isPlusSelected and allowedPaymentTypes"), null);
            return;
        }
        Object obj2 = map.get("cardId");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("isPlusSelected");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Object obj4 = map.get("allowedPaymentTypes");
        List<String> list = obj4 instanceof List ? (List) obj4 : null;
        if (list == null) {
            list = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            PaymentMethodType.Companion.getClass();
            Iterator<E> it = PaymentMethodType.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((PaymentMethodType) obj).getValue(), str3)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PaymentMethodType paymentMethodType = (PaymentMethodType) obj;
            if (paymentMethodType != null) {
                arrayList.add(paymentMethodType);
            }
        }
        Set N0 = a.N0(arrayList);
        hdm hdmVar = this.a;
        if (hdmVar != null) {
            ba20 ba20Var = (ba20) da20Var;
            gj7 gj7Var = new gj7(ba20Var, 1);
            fj7 fj7Var = new fj7(ba20Var, 1);
            DriveHostView driveHostView = (DriveHostView) ((zch) hdmVar).a;
            oemVar = driveHostView.drivePaymentMethodsProvider;
            Set set = N0;
            ArrayList arrayList2 = new ArrayList(tcc.n(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int i = vma0.b[((PaymentMethodType) it2.next()).ordinal()];
                if (i == 1) {
                    paymentMethod$Type = PaymentMethod$Type.SBP_TOKEN;
                } else if (i == 2) {
                    paymentMethod$Type = PaymentMethod$Type.PERSONAL_WALLET;
                } else if (i == 3) {
                    paymentMethod$Type = PaymentMethod$Type.CORP;
                } else {
                    if (i != 4 && i != 5) {
                        w511.b();
                        return;
                    }
                    paymentMethod$Type = PaymentMethod$Type.CARD;
                }
                arrayList2.add(paymentMethod$Type);
            }
            a.N0(arrayList2);
            qem qemVar = (qem) oemVar;
            ((pep0) qemVar.b).f(new zsa(14, (com.yandex.go.payments.drive.navigation.a) qemVar.a.get(), new t8j(7, gj7Var, driveHostView), new ymj(9, fj7Var, driveHostView)), new nem(str2, booleanValue), hxx.a);
        }
    }
}
