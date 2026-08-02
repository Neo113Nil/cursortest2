package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.connectsdk.service.DeviceService;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.S2;

/* loaded from: classes.dex */
public final class k5 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(int i, Object obj) {
        super(0);
        this.r = i;
        this.s = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        double d;
        Resources resources;
        int i = this.r;
        boolean z = false;
        sv3 sv3Var = sv3.a;
        str = "";
        Object obj = this.s;
        switch (i) {
            case 0:
                ((s5) obj).v.invoke();
                return Boolean.TRUE;
            case 1:
                s9 s9Var = (s9) obj;
                return S2.a(s9Var.a, s9Var.a());
            case 2:
                wj wjVar = (wj) obj;
                vj vjVar = wjVar.e;
                TextView textView = wjVar.a;
                if (vjVar == null) {
                    return Boolean.TRUE;
                }
                if (TextUtils.isEmpty(textView.getText())) {
                    return Boolean.TRUE;
                }
                if (wjVar.f) {
                    wjVar.a();
                    wjVar.f = false;
                    return Boolean.TRUE;
                }
                int lineCount = textView.getLineCount();
                int i2 = vjVar.a;
                Integer num = lineCount <= vjVar.b + i2 ? Integer.MAX_VALUE : null;
                if (num != null) {
                    i2 = num.intValue();
                }
                if (i2 != textView.getMaxLines()) {
                    textView.setMaxLines(i2);
                    wjVar.f = true;
                } else {
                    wjVar.a();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                gld.L(((th0) obj).c, null);
                return Unit.a;
            case 4:
                ((ii0) obj).j.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.a;
            case 5:
                vq1.Z((ji0) obj);
                return Unit.a;
            case 6:
                ((zi0) obj).b = null;
                return Unit.a;
            case 7:
                ((aw0) obj).i.getValue();
                return Unit.a;
            case 8:
                return (rce) ((fs1) obj).r.getValue();
            case 9:
                z0j z0jVar = (z0j) obj;
                boolean z2 = z0jVar.b;
                x2b x2bVar = (x2b) z0jVar.c;
                if (!z2) {
                    return Boolean.TRUE;
                }
                int height = (x2bVar.getHeight() - x2bVar.getCompoundPaddingTop()) - x2bVar.getCompoundPaddingBottom();
                int lineForVertical = x2bVar.getLayout() == null ? 0 : x2bVar.getLayout().getLineForVertical(height);
                int i3 = lineForVertical + 1;
                if (height >= c9g.N(x2bVar, i3)) {
                    lineForVertical = i3;
                }
                if (lineForVertical <= 0 || lineForVertical >= x2bVar.getLineCount()) {
                    if (((gzj) z0jVar.e) != null) {
                        x2bVar.getViewTreeObserver().removeOnPreDrawListener((gzj) z0jVar.e);
                        z0jVar.e = null;
                    }
                    z = true;
                } else {
                    int i4 = i9f.a;
                    x2bVar.setMaxLines(lineForVertical);
                }
                return Boolean.valueOf(z);
            case 10:
                return (mn0) obj;
            case 11:
                Unit unit = Unit.a;
                ((iwe) obj).onSuccess(unit);
                return unit;
            case 12:
                int i5 = ddu.o;
                BindCardActivity bindCardActivity = (BindCardActivity) obj;
                a6p a6pVar = new a6p(bindCardActivity.l().c());
                jfu viewModelStore = bindCardActivity.getViewModelStore();
                is6 defaultViewModelCreationExtras = bindCardActivity.getDefaultViewModelCreationExtras();
                viewModelStore.getClass();
                defaultViewModelCreationExtras.getClass();
                bjt bjtVar = new bjt(viewModelStore, a6pVar, defaultViewModelCreationExtras);
                lm4 a = ern.a(u8q.class);
                String f = a.f();
                if (f != null) {
                    return (u8q) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                }
                xq0.x("Local and anonymous classes can not be ViewModels");
                return null;
            case 13:
                ((pt0) ((jzi) obj).a).onSuccess(sv3Var);
                return Unit.a;
            case 14:
                ((pt0) ((xzi) obj).a).onSuccess(sv3Var);
                return Unit.a;
            case 15:
                return g33.b((g33) obj, new BitmapFactory.Options());
            case 16:
                return (ynn) obj;
            case 17:
                mw3 mw3Var = (mw3) obj;
                g0c g0cVar = (g0c) mw3Var.a;
                kw3 kw3Var = (kw3) mw3Var.c;
                if (kw3Var == null) {
                    xq0.q("Null card input");
                    return null;
                }
                int ordinal = ((jw3) mw3Var.g).ordinal();
                if (ordinal == 1) {
                    zso I = qgg.I(kw3Var.getMode());
                    int ordinal2 = I.ordinal();
                    if (ordinal2 == 0) {
                        str = "оплаты новой картой";
                    } else if (ordinal2 == 1) {
                        str = "привязки карты";
                    }
                    String concat = "Пользователь нажал на кнопку Продолжить на экране ввода новой карты в сценарии ".concat(str);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    r1f r1fVar = r1f.a;
                    linkedHashMap.put("scenario", new jkr(I.a));
                    linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                    vtm vtmVar = new vtm((Map) linkedHashMap);
                    ci0 ci0Var = qjb.a;
                    ci0Var.a = up6.z(1) + ci0Var.a;
                    vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                    qne j = su4.j(vtmVar, "event_name", "card_data_form_next_button-tapped", "card_data_form_next_button-tapped", vtmVar);
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(j);
                    kw3Var.e();
                } else {
                    if (ordinal != 3) {
                        xq0.q("Illegal card input state");
                        return null;
                    }
                    zso I2 = qgg.I(kw3Var.getMode());
                    int ordinal3 = I2.ordinal();
                    if (ordinal3 == 0) {
                        str = "оплаты новой картой";
                    } else if (ordinal3 == 1) {
                        str = "привязки карты";
                    }
                    String concat2 = "Пользователь нажал на кнопку Оплатить на экране ввода новой карты в сценарии ".concat(str);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    r1f r1fVar2 = r1f.a;
                    linkedHashMap2.put("scenario", new jkr(I2.a));
                    linkedHashMap2.put(DeviceService.KEY_DESC, new jkr(concat2));
                    vtm vtmVar2 = new vtm((Map) linkedHashMap2);
                    ci0 ci0Var2 = qjb.a;
                    ci0Var2.a = up6.z(1) + ci0Var2.a;
                    vtmVar2.u(qee.n() + ci0Var2.a, "eventus_id");
                    qne j2 = su4.j(vtmVar2, "event_name", "new_card_pay_button-tapped", "new_card_pay_button-tapped", vtmVar2);
                    x60 x60Var2 = (x60) g0cVar;
                    x60Var2.getClass();
                    x60Var2.a(j2);
                    mw3Var.f();
                }
                return Unit.a;
            case 18:
                return Boolean.valueOf(((vn4) obj).c());
            case 19:
                return f8g.d0((ajh) obj);
            case 20:
                return f8g.d0((wih) obj);
            case 21:
                return f8g.d0((xih) obj);
            case 22:
                return f8g.d0((bjh) obj);
            case 23:
                Function0 function0 = ((gb5) obj).I;
                if (function0 != null) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 24:
                wnb wnbVar = ((uk2) obj).c;
                if (wnbVar.d >= 128000.0d) {
                    gya gyaVar = wnbVar.b;
                    double d2 = 1;
                    double pow = gyaVar.b / (d2 - Math.pow(gyaVar.a, gyaVar.c));
                    gya gyaVar2 = wnbVar.c;
                    d = Math.min(pow, gyaVar2.b / (d2 - Math.pow(gyaVar2.a, gyaVar2.c)));
                } else {
                    d = wnbVar.a;
                }
                return Long.valueOf((long) d);
            case 25:
                br5 br5Var = (br5) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(br5Var.a);
                String str2 = br5Var.b;
                sb.append(str2.length() > 0 ? "#".concat(str2) : "");
                sb.append('#');
                sb.append(br5Var.c);
                return sb.toString();
            case 26:
                Object systemService = ((Context) ((xiu) obj).b).getApplicationContext().getSystemService("connectivity");
                systemService.getClass();
                return (ConnectivityManager) systemService;
            case 27:
                resources = super/*uf6*/.getResources();
                return new fsm(resources);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((axf) obj).d();
            default:
                return new lbs((bxj) obj, 0.0f);
        }
    }
}
