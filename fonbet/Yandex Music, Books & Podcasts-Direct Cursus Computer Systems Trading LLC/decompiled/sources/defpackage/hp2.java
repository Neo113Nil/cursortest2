package defpackage;

import android.app.Application;
import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class hp2 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ op2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp2(op2 op2Var, int i) {
        super(0);
        this.r = i;
        this.s = op2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        op2 op2Var = this.s;
        switch (i) {
            case 0:
                op2 op2Var2 = this.s;
                Parcelable parcelableExtra = op2Var2.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS");
                parcelableExtra.getClass();
                ln lnVar = (ln) parcelableExtra;
                gp2 gp2Var = gp2.a;
                gp2.b = new WeakReference(op2Var2);
                d51 d51Var = d51.b;
                Parcelable parcelableExtra2 = op2Var2.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYER_DATA");
                parcelableExtra2.getClass();
                jdk jdkVar = (jdk) parcelableExtra2;
                Parcelable parcelableExtra3 = op2Var2.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA");
                parcelableExtra3.getClass();
                pyh pyhVar = (pyh) parcelableExtra3;
                Parcelable parcelableExtra4 = op2Var2.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT");
                parcelableExtra4.getClass();
                ugk ugkVar = (ugk) parcelableExtra4;
                Parcelable parcelableExtra5 = op2Var2.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.extra.CONSOLE_LOGGING_MODE");
                parcelableExtra5.getClass();
                g86 g86Var = (g86) parcelableExtra5;
                String stringExtra = op2Var2.getIntent().getStringExtra("com.yandex.payment.sdk.ui.network.extra.LOGGER_KEY");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                p77 d = d51Var.d(op2Var2, jdkVar, pyhVar, lnVar, ugkVar, stringExtra, g86Var, gp2Var);
                g0c c = d.c();
                wfk R = wxf.R(d.a().b);
                ArrayList arrayList = R.g;
                boolean z = R.f;
                boolean z2 = R.e;
                boolean z3 = R.d;
                boolean z4 = R.c;
                boolean z5 = R.b;
                boolean z6 = R.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((t7w) it.next()).a);
                }
                String o = ouj.o(ouj.o(ouj.o(ouj.o(ouj.o(ouj.o("Фильтр методов оплаты: оплата привязанной картой ".concat(z6 ? "доступна" : "не доступна").concat("; оплата через ApplePay не доступна"), "; оплата через GooglePay ", z5 ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей ", z4 ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ", z3 ? "доступна" : "не доступна"), "; оплата привязанным СБП токеном ", z2 ? "доступна" : "не доступна"), "; оплата через счёт в Яндекс-Банке ", z ? "доступна" : "не доступна"), "; доступные типы карт Яндекс-Банка: ", CollectionsKt.X(arrayList2, ", ", null, null, null, 62));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                StringBuilder j = eta.j("{ isStoredCardAvailable: ", z6, ", isApplePayAvailable: false, isGooglePayAvailable: ", z5, ", isSBPAvailable: ");
                dfi.t(j, z4, ", isNewSbpTokenAvailable: ", z3, ", isSBPTokensAvailable: ");
                dfi.t(j, z2, ", isYandexBankAccountAvailable: ", z, " , isSplitAvailable: ");
                linkedHashMap.put(Constants.KEY_VALUE, new jkr(vz1.t(j, arrayList, " }")));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(o));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j2 = su4.j(vtmVar, "event_name", "payment_methods_filter", "payment_methods_filter", vtmVar);
                x60 x60Var = (x60) c;
                x60Var.getClass();
                x60Var.a(j2);
                return d;
            case 1:
                return op2Var.l().d();
            default:
                Application application = op2Var.getApplication();
                application.getClass();
                pyh pyhVar2 = (pyh) op2Var.l().u.get();
                jdk e = op2Var.l().e();
                g0c c2 = op2Var.l().c();
                pxf d2 = op2Var.l().d();
                atj atjVar = (atj) op2Var.l().A.get();
                boolean m = op2Var.m();
                pyhVar2.getClass();
                e.getClass();
                c2.getClass();
                d2.getClass();
                atjVar.getClass();
                return new s77(new klx(20), new kjn(13), new hil(), new rxk(), application, pyhVar2, e, c2, d2, atjVar, Boolean.valueOf(m));
        }
    }
}
