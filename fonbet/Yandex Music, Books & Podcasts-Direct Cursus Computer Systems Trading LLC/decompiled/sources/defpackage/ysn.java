package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import com.yandex.payment.sdk.ui.SplashActivity;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ysn {
    public final Context a;
    public final jdk b;
    public final pyh c;
    public final ugk d;
    public final ln e;
    public final g86 f;
    public final a g;
    public final jyr h;
    public final jyr i;

    public ysn(Context context, jdk jdkVar, pyh pyhVar, ugk ugkVar, ln lnVar, g86 g86Var, a aVar) {
        String str = jdkVar.c;
        context.getClass();
        this.a = context;
        this.b = jdkVar;
        this.c = pyhVar;
        this.d = ugkVar;
        this.e = lnVar;
        this.f = g86Var;
        this.g = aVar;
        this.h = btf.b(new xsn(this, 0));
        if (ugkVar.a) {
            y7o n = uwf.n(jdkVar.a, str);
            if (n.b()) {
                r7w r7wVar = n.b;
                up6.D(r7wVar);
                xq0.o(r7wVar.getMessage());
                throw null;
            }
        }
        x60 x60Var = (x60) b().w.get();
        if (str != null) {
            x60Var.b.a.put("uid", str);
        } else {
            x60Var.getClass();
        }
        wm wmVar = x60Var.b;
        String str2 = pyhVar.a;
        str2.getClass();
        wmVar.a.put("service_token", str2);
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        uoe[] uoeVarArr = uoe.b;
        LinkedHashMap linkedHashMap = wmVar.a;
        linkedHashMap.put("api_instance_id", uuid);
        linkedHashMap.put("api_instance_type", "sdk_dialog");
        btf.b(new xsn(this, 4));
        this.i = btf.b(new xsn(this, 1));
        btf.b(new xsn(this, 5));
        btf.b(new xsn(this, 3));
        btf.b(new xsn(this, 2));
        btf.b(new xsn(this, 6));
    }

    public final Intent a(Class cls, boolean z) {
        Context context = this.a;
        Intent putExtra = (z ? new Intent(context, (Class<?>) SplashActivity.class).putExtra("com.yandex.payment.sdk.ui.network.extra.CLASS_NAME", cls) : new Intent(context, (Class<?>) cls)).putExtra("com.yandex.payment.sdk.ui.network.extra.PAYER_DATA", this.b).putExtra("com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA", this.c).putExtra("com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT", (Parcelable) this.d).putExtra("com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS", this.e).putExtra("com.yandex.payment.sdk.ui.extra.CONSOLE_LOGGING_MODE", (Parcelable) this.f).putExtra("com.yandex.payment.sdk.ui.network.extra.LOGGER_KEY", (String) this.i.getValue());
        putExtra.getClass();
        return putExtra;
    }

    public final p77 b() {
        return (p77) this.h.getValue();
    }

    public final void c(xzi xziVar) {
        String str;
        g0c c = b().c();
        xo0 xo0Var = (xo0) xziVar.a;
        switch (xo0Var.ordinal()) {
            case 0:
                str = "запустить процесс оплаты";
                break;
            case 1:
                str = "запустить процесс привязки карты без верификации";
                break;
            case 2:
                str = "запустить процесс привязки карты с верификацией";
                break;
            case 3:
                str = "запустить процесс привязки СБП токена";
                break;
            case 4:
                str = "запустить процесс верификации карты";
                break;
            case 5:
                str = "запустить процесс выбора способа оплаты";
                break;
            case 6:
                str = "запустить процесс выбора способа оплаты с досылкой токена и последующей оплатой (Preselect&Pay)";
                break;
            case 7:
                str = "запустить получение токена GooglePay";
                break;
            case 8:
                str = "привязать GooglePay токен";
                break;
            case 9:
                str = "привязать ApplePay токен";
                break;
            case 10:
                str = "запустить процесс оплаты через ApplePay";
                break;
            case 11:
                str = "отобразить переопределенный результат в диалоге PaymentSDK";
                break;
            case 12:
                str = "дослать ошибку в Preselect&Pay";
                break;
            case 13:
                str = "дослать токен в Preselect&Pay";
                break;
            case 14:
                str = "обновить кнопку выбора метода оплаты";
                break;
            case 15:
                str = "обновить методы оплаты";
                break;
            case 16:
                str = "скрыть интерфейс PaymentSDK";
                break;
            case 17:
                str = "применить CVV и оплатить";
                break;
            case 18:
                str = "запустить процесс оплаты iPayment";
                break;
            case 19:
                str = "запустить процесс пополнения транспортной карты";
                break;
            case 20:
                str = "запустить процесс подписки и оплаты счетов RTP";
                break;
            case 21:
                str = "вызвать remote action";
                break;
            default:
                str = "";
                break;
        }
        String concat = "Вызов конкретного публичного метода PaymentKit: ".concat(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("method", new jkr(xo0Var.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "api_method_call", "api_method_call", vtmVar);
        x60 x60Var = (x60) c;
        x60Var.getClass();
        x60Var.a(j);
    }
}
