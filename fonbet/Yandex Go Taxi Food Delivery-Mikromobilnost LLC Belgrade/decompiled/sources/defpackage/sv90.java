package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.Scenario;
import com.yandex.xplat.payment.sdk.ServiceStatusForAnalytics;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public class sv90 {
    public static iho A(String str) {
        String concat = "Ошибка записи блоков на карту: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("nfc_write_blocks_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, CRLReasonCodeExtension.REASON, str));
    }

    public static /* synthetic */ iho A0(sv90 sv90Var, TextFieldNameForAnalytics textFieldNameForAnalytics, boolean z) {
        sv90Var.getClass();
        return z0(textFieldNameForAnalytics, z, null);
    }

    public static iho B() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешная запись блоков на карту", "nfc_write_blocks_success");
    }

    public static iho B0(String str, String str2, WebViewTagForAnalytics webViewTagForAnalytics) {
        String t = oyr.t(b64.v("HTTP ошибка в вебвью с кодом ", str2, " при загрузке страницы по адресу ", str, Extension.O_BRAKE_SPACE), s(webViewTagForAnalytics), Extension.C_BRAKE);
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "webview_url", str, "value", str2);
        i.k("webview_tag", webViewTagForAnalytics.getValue());
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, t);
        return y891.c("webview_error_http_code", i);
    }

    public static iho C(String str, String str2) {
        String l = b64.l("Ошибка при открытии ссылки ", str, " в браузере: ", str2);
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        if (str2 != null) {
            wj00Var.k(CRLReasonCodeExtension.REASON, str2);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("open_browser_url_error", wj00Var);
    }

    public static iho C0(String str, WebViewTagForAnalytics webViewTagForAnalytics) {
        String p = unr0.p("Javascript ошибка в вебвью: ", str, Extension.O_BRAKE_SPACE, s(webViewTagForAnalytics), Extension.C_BRAKE);
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("value", str);
        wj00Var.k("webview_tag", webViewTagForAnalytics.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        return y891.c("webview_javascript_error", wj00Var);
    }

    public static iho D() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь нажал на ActionButton", "pay_button_tapped");
    }

    public static iho D0(String str, WebViewTagForAnalytics webViewTagForAnalytics) {
        String p = unr0.p("Завершение загрузки WebView 3DS по адресу ", str, Extension.O_BRAKE_SPACE, s(webViewTagForAnalytics), "), размер страницы nil");
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "webview_url", str, "webview_html_size", "nil");
        i.k("webview_tag", webViewTagForAnalytics.getValue());
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        return y891.c("webview_load_finished", i);
    }

    public static iho E(String str) {
        String concat = "Оплата завершилась с ошибкой: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("failed_payment", vfc.i(0, CRLReasonCodeExtension.REASON, str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho E0(String str, WebViewTagForAnalytics webViewTagForAnalytics) {
        String p = unr0.p("Загрузка конкретной страницы в вебвью по адресу ", str, Extension.O_BRAKE_SPACE, s(webViewTagForAnalytics), Extension.C_BRAKE);
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("webview_url", str);
        wj00Var.k("webview_tag", webViewTagForAnalytics.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        return y891.c("webview_load_started", wj00Var);
    }

    public static iho F() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Кнопка Оплатить заблокирована", "payment_form_button_disabled");
    }

    public static iho G() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Кнопка Оплатить доступна для нажатия", "payment_form_button_enabled");
    }

    public static iho H(Scenario scenario) {
        String str;
        String concat = scenario != null ? "Завершена валидация значения cvn в сценарии ".concat(r(scenario)) : "Завершена валидация значения cvn";
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        if (scenario == null || (str = scenario.getValue()) == null) {
            str = null;
        }
        if (str != null) {
            wj00Var.k("scenario", str);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("payment_form_cvn_validation_completed", wj00Var);
    }

    public static iho I(Scenario scenario) {
        String str;
        String concat = scenario != null ? "Завершена валидация значения номера карты в сценарии ".concat(r(scenario)) : "Завершена валидация значения номера карты";
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        if (scenario == null || (str = scenario.getValue()) == null) {
            str = null;
        }
        if (str != null) {
            wj00Var.k("scenario", str);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("payment_form_card_validation_completed", wj00Var);
    }

    public static iho J(Scenario scenario) {
        String str;
        String concat = scenario != null ? "Завершена валидация значения срока действия в сценарии ".concat(r(scenario)) : "Завершена валидация значения срока действия";
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        if (scenario == null || (str = scenario.getValue()) == null) {
            str = null;
        }
        if (str != null) {
            wj00Var.k("scenario", str);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("payment_form_date_validation_completed", wj00Var);
    }

    public static iho K(String str) {
        String concat = "Ошибка валидации текстового поля: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("payment_form_validation_error", vfc.i(0, "value", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho L(String str, String str2, String str3, String str4) {
        String r = unr0.r(b64.v("Выполнение сетевого запроса по адресу ", str4, " в ручку ", str, " с параметрами: request_id = "), str3, ", traceparent = ", str2);
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "target_path", str, "traceparent", str2);
        i.k("request_id", str3);
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, r);
        i.k(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str4);
        return y891.c("perform_request", i);
    }

    public static iho M(long j, String str, String str2, String str3, String str4, int i) {
        String r = unr0.r(b64.v("Выполнение сетевого запроса по адресу ", str4, " в ручку ", str, " с параметрами: request_id = "), str3, ", traceparent = ", str2);
        sv90 sv90Var = qv90.a;
        wj00 i2 = vfc.i(0, "target_path", str, "traceparent", str2);
        i2.k("request_id", str3);
        i2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, r);
        i2.k(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, str4);
        i2.b.put("request_duration", new t6w(j, true));
        i2.j(i, "code_response");
        return y891.c("perform_request", i2);
    }

    public static iho N() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Карта Пэй отсутствует у пользователя - отображается пункт с открытием Карты Пэй", "plus_card_need_open_shown");
    }

    public static iho O() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь нажал на предложение открыть Карту Пэй", "plus_card_open_button_tapped");
    }

    public static iho P() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь закрыл шторку открытия Карты Пэй", "plus_card_open_sheet_dismissed_by_user");
    }

    public static iho Q() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Показ шторки открытия Карты Пэй", "plus_card_open_sheet_shown");
    }

    public static iho R() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пополнение Карты Пэй завершилось с ошибкой", "plus_card_top_up_fail");
    }

    public static iho S() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пополнение Карты Пэй в ожидании", "plus_card_top_up_pending");
    }

    public static iho T() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Пользователь закрыл шторку пополнения Карты Пэй", "plus_card_top_up_sheet_dismissed_by_user");
    }

    public static iho U() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Показ шторки пополнения Карты Пэй", "plus_card_top_up_sheet_shown");
    }

    public static iho V() {
        String concat = "Карта Пэй недоступна по причине: ".concat("Not in host");
        sv90 sv90Var = qv90.a;
        return y891.c("plus_card_unavailable", vfc.i(0, CRLReasonCodeExtension.REASON, "Not in host", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho W() {
        String concat = "Карта Пэй присутствует в списке платежных методов, но при этом недоступна по причине: ".concat("Not in host");
        sv90 sv90Var = qv90.a;
        return y891.c("plus_card_unexpected_unavailable", vfc.i(0, CRLReasonCodeExtension.REASON, "Not in host", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho X() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Проверка баланса Карты Пэй завершилось с ошибкой", "plus_card_verify_balance_fail");
    }

    public static iho Y(int i) {
        String i2 = oyr.i(i, "Проверка баланса Карты Пэй завершилось успешно, пополнение не требуется; количество попыток: ");
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.j(i, "attempts");
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, i2);
        return y891.c("plus_card_verify_balance_success", wj00Var);
    }

    public static iho Z(String str) {
        String concat = "Статус, с которым завершился процесс 3DS: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("3ds_status", vfc.i(0, "status_3ds", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho a(String str, boolean z) {
        String str2 = z ? "Доверификация завершена успешно" : "Доверификация завершена неуспешно";
        String str3 = z ? "additional_verify_finished_successfully" : "additional_verify_finished_unsuccessfully";
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        if (str != null) {
            wj00Var.k("errors", str);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        return y891.c(str3, wj00Var);
    }

    public static iho a0(String str, String str2, String str3) {
        StringBuilder v = b64.v("Старт ", str.equals("sms_challenge") ? "СМС челленджа" : str.equals("random_amt") ? "челленджа на сумму" : "неизвестного челленджа", ": challenge_method = ", str, ", verification_id = ");
        v.append(str2);
        String sb = v.toString();
        if (str3 != null) {
            sb = g8e.p(sb, ", format = ", str3);
        }
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "challenge_method", str, "verification_id", str2);
        if (str3 != null) {
            i.k("format", str3);
        }
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, sb);
        return y891.c("received_challenge_info", i);
    }

    public static iho b(boolean z, Scenario scenario, boolean z2) {
        String str = z2 ? "byDefault" : null;
        String l = b64.l("Изменилось значение в чекбоксе Привязать карточку на ", z ? "Выбрано" : "Не выбрано", " в сценарии ", r(scenario));
        if (z2) {
            l = l.concat(", значение задано по умолчанию");
        }
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("scenario", scenario.getValue());
        if (str != null) {
            wj00Var.k("check_box_status", str);
        }
        wj00Var.i("value", z);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("link_card_checkbox-changed", wj00Var);
    }

    public static iho b0(String str) {
        String concat = "Получена нетерминальная ошибка: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("received_non_terminal_error", vfc.i(0, CRLReasonCodeExtension.REASON, str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho c(String str) {
        String concat = "Ошибка генерации ключевой пары: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("biometry_generate_key_pair_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, CRLReasonCodeExtension.REASON, str));
    }

    public static iho c0(String str, String str2, String str3) {
        String l = b64.l("Получен Челлендж на сумму, verification_id = ", str, ", валюта: ", str2);
        if (str3 != null) {
            l = g8e.p(l, ", authorize_amount_format = ", str3);
        }
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "verification_id", str, "authorize_currency", str2);
        if (str3 != null) {
            i.k("authorize_amount_format", str3);
        }
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("received_random_amt_challenge", i);
    }

    public static iho d(String str, PaymentOptionNameForAnalytics paymentOptionNameForAnalytics) {
        String q = q(paymentOptionNameForAnalytics);
        String concat = "Отправка публичного ключа для метода: ".concat(q);
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, "device_pubkey", str);
        i.k("current_methods", q);
        return y891.c("biometry_send_public_key", i);
    }

    public static iho d0(String str) {
        String concat = "Получен неизвестный Челлендж, метод: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("received_undefined_challenge", vfc.i(0, "method", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho e(String str) {
        String concat = "Данные для подписания: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("biometry_signature_data", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, "value", str));
    }

    public static iho e0() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Повторная инициализация платежа", "reinit_payment");
    }

    public static iho f(String str) {
        String concat = "Ошибка формирования подписи: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("biometry_signature_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, CRLReasonCodeExtension.REASON, str));
    }

    public static iho f0(DivCardForAnalytics divCardForAnalytics) {
        sv90 sv90Var = qv90.a;
        ArrayList i = scc.i(divCardForAnalytics);
        sv90Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(((DivCardForAnalytics) it.next()).getValue());
        }
        String concat = "Запрос в Template Renderer, div_cards = ".concat(a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62));
        sv90 sv90Var2 = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.b.put("div_cards", y0(arrayList));
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("request_to_template_renderer", wj00Var);
    }

    public static iho g() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Проверка с помощью YB возможности совершения платежа", "check_payment_called");
    }

    public static iho g0(String str, String str2) {
        String concat = "Переход в банк по ссылке из urlTemplate при оплате через СБП, scheme = ".concat(str2);
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "scheme", str2, "url_template", str);
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("sbp_bank_url_opened", i);
    }

    public static iho h() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Нажатие на системную кнопку назад (Android)", "clicked_back_button_system");
    }

    public static iho h0(String str) {
        String concat = "Пользователь израсходовал все попытки на ввод кода, verification_id = ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_challenger_attempts_limit", vfc.i(0, "verification_id", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho i(ServiceStatusForAnalytics serviceStatusForAnalytics, String str) {
        int i = rv90.a[serviceStatusForAnalytics.ordinal()];
        String str2 = "успеха";
        if (i != 1) {
            if (i == 2) {
                str2 = "неудачи";
            } else if (i == 3) {
                str2 = "отмены";
            } else if (i == 4) {
                str2 = "закрытия пользователем";
            }
        }
        String concat = "Закрытие формы после ".concat(str2);
        if (str != null) {
            concat = g8e.p(concat, ", причина: ", str);
        }
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k(ACSPConstants.STATUS, String.valueOf(serviceStatusForAnalytics));
        if (str != null) {
            wj00Var.k(CRLReasonCodeExtension.REASON, str);
        }
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("closed", wj00Var);
    }

    public static iho i0(String str, boolean z) {
        String l = b64.l("Открытие приложения банка ", str, " ", z ? "успешно" : "неудачно");
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("selected_bank", str);
        wj00Var.k(TarifficatorScenarioActivity.RESULT_KEY, z ? "success" : "fail");
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("sbp_challenger_bank_open", wj00Var);
    }

    public static /* synthetic */ iho j(sv90 sv90Var, ServiceStatusForAnalytics serviceStatusForAnalytics) {
        sv90Var.getClass();
        return i(serviceStatusForAnalytics, null);
    }

    public static iho j0(String str) {
        String concat = "Пользователь заполнил текстовое поле на экране СБП Челленджера, verification_id = ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_challenger_fill_complete", vfc.i(0, "verification_id", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho k() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начался процесс 3DS", "3ds_confirmation");
    }

    public static iho k0(String str, boolean z) {
        String l = b64.l("Результат попытки ввода кода или суммы ", z ? "успешный" : "неудачный", ", verification_id = ", str);
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("verification_id", str);
        wj00Var.k(TarifficatorScenarioActivity.RESULT_KEY, z ? "success" : "fail");
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("sbp_challenger_guess_result", wj00Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static iho l(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2105971089:
                if (str.equals("NEW_CARD")) {
                    str2 = "оплата новой картой";
                    break;
                }
                str2 = str;
                break;
            case -1855318471:
                if (str.equals("SBP_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей";
                    break;
                }
                str2 = str;
                break;
            case -1048776318:
                if (str.equals("GOOGLE_PAY")) {
                    str2 = "оплата через GooglePay";
                    break;
                }
                str2 = str;
                break;
            case 2061107:
                if (str.equals("CASH")) {
                    str2 = "оплата наличными";
                    break;
                }
                str2 = str;
                break;
            case 693748227:
                if (str.equals("APPLE_PAY")) {
                    str2 = "оплата через ApplePay";
                    break;
                }
                str2 = str;
                break;
            case 1649876030:
                if (str.equals("NEW_SBP_TOKEN_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
                    break;
                }
                str2 = str;
                break;
            default:
                str2 = str;
                break;
        }
        String concat = "Выбран предвыбранный метод оплаты: ".concat(str2);
        sv90 sv90Var = qv90.a;
        return y891.c("default_payment_option_selected", vfc.i(0, "value", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho l0(String str) {
        String concat = "Пользователь повторно запросил СМС код, verification_id = ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_challenger_resend_sms", vfc.i(0, "verification_id", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static iho m(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2105971089:
                if (str.equals("NEW_CARD")) {
                    str2 = "оплата новой картой";
                    break;
                }
                str2 = str;
                break;
            case -1855318471:
                if (str.equals("SBP_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей";
                    break;
                }
                str2 = str;
                break;
            case -1048776318:
                if (str.equals("GOOGLE_PAY")) {
                    str2 = "оплата через GooglePay";
                    break;
                }
                str2 = str;
                break;
            case 2061107:
                if (str.equals("CASH")) {
                    str2 = "оплата наличными";
                    break;
                }
                str2 = str;
                break;
            case 693748227:
                if (str.equals("APPLE_PAY")) {
                    str2 = "оплата через ApplePay";
                    break;
                }
                str2 = str;
                break;
            case 1649876030:
                if (str.equals("NEW_SBP_TOKEN_ID")) {
                    str2 = "оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
                    break;
                }
                str2 = str;
                break;
            default:
                str2 = str;
                break;
        }
        String concat = "Не получилось предвыбрать метод оплаты: ".concat(str2);
        sv90 sv90Var = qv90.a;
        return y891.c("default_payment_option_selection_failed", vfc.i(0, "value", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho m0(String str, String str2) {
        String l = b64.l("Открытие экрана СБП Челленджера, sbp_token_id = ", str, ", verification_id = ", str2);
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, "sbp_token_id", str, "verification_id", str2);
        i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("sbp_challenger_screen_opened", i);
    }

    public static iho n(String str) {
        String concat = "Ошибка при парсинге DivKit: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("divkit_parsing_error", vfc.i(0, CRLReasonCodeExtension.REASON, str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho n0(String str) {
        String concat = "Ошибка открытия банка ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_failed_bank_open", vfc.i(0, "scheme", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static iho o(String str) {
        String p = oyr.p("Пользователь ввел текст длиной ", str, " в поле ввода CVV");
        sv90 sv90Var = qv90.a;
        return y891.c("entering_cvv_in_input_field", vfc.i(0, "bank_list", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p));
    }

    public static iho o0(String str) {
        String concat = "Ошибка старта активити при открытии банка: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_failed_bank_open_activity", vfc.i(0, CRLReasonCodeExtension.REASON, str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static String p(TextFieldNameForAnalytics textFieldNameForAnalytics) {
        int i = rv90.d[textFieldNameForAnalytics.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "scanner" : "email" : "CVN" : "срока действия карты" : "номера карты";
    }

    public static iho p0(String str) {
        String concat = "Выбран банк из списка установленных: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_installed_bank_list-select_bank-tapped", vfc.i(0, "selected_bank", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static String q(PaymentOptionNameForAnalytics paymentOptionNameForAnalytics) {
        switch (rv90.c[paymentOptionNameForAnalytics.ordinal()]) {
            case 1:
                return "Оплата привязанной картой";
            case 2:
                return "Оплата новой картой";
            case 3:
                return "Оплата через yb карту";
            case 4:
                return "Оплата через Систему Быстрых Платежей";
            case 5:
                return "Оплата через Систему Быстрых Платежей с возможностью привязки СБП токена";
            case 6:
                return "Оплата привязанным СБП токеном";
            case 7:
                return "Оплата наличными";
            case 8:
                return "Оплата через ApplePay";
            case 9:
                return "Оплата через GooglePay";
            default:
                return "Неизвестный метод оплаты";
        }
    }

    public static iho q0(String str) {
        String concat = "Выбран банк из полного списка: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_other_bank_list-select_bank-tapped", vfc.i(0, "selected_bank", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static String r(Scenario scenario) {
        int i = rv90.f[scenario.ordinal()];
        return i != 1 ? i != 2 ? "" : "привязки карты" : "оплаты новой картой";
    }

    public static iho r0(String str) {
        String concat = "Отображение экрана ожидания ответа от банка ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("sbp_waiting_payment-shown", vfc.i(0, "selected_bank", str, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat));
    }

    public static String s(WebViewTagForAnalytics webViewTagForAnalytics) {
        int i = rv90.g[webViewTagForAnalytics.ordinal()];
        return i != 1 ? i != 2 ? "" : "оформление кредита" : "форма 3DS";
    }

    public static iho s0(String str, PaymentOptionNameForAnalytics paymentOptionNameForAnalytics, Integer num, Integer num2, ArrayList arrayList) {
        String str2;
        String str3 = "Ошибка при выборе метода оплаты";
        String str4 = null;
        if (paymentOptionNameForAnalytics != null) {
            str2 = q(paymentOptionNameForAnalytics);
            str3 = "Ошибка при выборе метода оплаты".concat(str2);
        } else {
            str2 = null;
        }
        String p = g8e.p(str3, Extension.COLON_SPACE, str);
        if (num != null) {
            p = p + ", индекс = " + num;
        }
        if (num2 != null) {
            p = p + ", размер списка методов оплаты = " + num2;
        }
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(q((PaymentOptionNameForAnalytics) it.next()));
            }
            str4 = a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62);
            p = g8e.p(p, ", методы оплаты: ", str4);
        }
        sv90 sv90Var = qv90.a;
        wj00 i = vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p, Constants.KEY_MESSAGE, str);
        if (str2 != null) {
            i.k("current_methods", str2);
        }
        if (num != null) {
            i.j(num.intValue(), "position");
        }
        if (num2 != null) {
            i.j(num2.intValue(), "methods_list_size");
        }
        if (str4 != null) {
            i.k("payment_methods", str4);
        }
        return y891.c("select_payment_method_error", i);
    }

    public static iho t(String str) {
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        if (str == null) {
            str = "default";
        }
        wj00Var.k("diehard_instance_id", str);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Интеграционный профиль получен от бэка");
        return y891.c("integration_profile_from_back", wj00Var);
    }

    public static iho t0(PaymentOptionNameForAnalytics paymentOptionNameForAnalytics, boolean z) {
        String str;
        switch (rv90.c[paymentOptionNameForAnalytics.ordinal()]) {
            case 1:
                str = "Выбрана оплата привязанной картой в качестве метода оплаты";
                break;
            case 2:
                str = "Выбрана оплата новой картой в качестве метода оплаты";
                break;
            case 3:
                str = "Выбрана оплата через счёт в yb в качестве метода оплаты";
                break;
            case 4:
                str = "Выбрана оплата через Систему Быстрых Платежей в качестве метода оплаты";
                break;
            case 5:
                str = "Выбрана оплата через Систему Быстрых Платежей с возможностью привязки СБП токена в качестве метода оплаты";
                break;
            case 6:
                str = "Выбрана оплата привязанным СБП токеном в качестве метода оплаты";
                break;
            case 7:
                str = "Выбрана оплата наличными в качестве метода оплаты";
                break;
            case 8:
                str = "Выбрана оплата через ApplePay в качестве метода оплаты";
                break;
            case 9:
                str = "Выбрана оплата через GooglePay в качестве метода оплаты";
                break;
            default:
                str = "Выбран метод оплаты";
                break;
        }
        if (z) {
            str = str.concat(" по тапу пользователя");
        }
        sv90 sv90Var = qv90.a;
        String str2 = "select_" + paymentOptionNameForAnalytics + "_option";
        wj00 wj00Var = new wj00(0);
        wj00Var.i("by_tap", z);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str);
        return y891.c(str2, wj00Var);
    }

    public static iho u(Scenario scenario) {
        String concat = "Кнопка Оплатить на экране ввода новой карты активна в сценарии ".concat(r(scenario));
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("scenario", scenario.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("new_card-pay_button-active", wj00Var);
    }

    public static iho u0() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие экрана ввода новой карточки", "show_main_screen_add_new_card");
    }

    public static iho v(Scenario scenario) {
        String concat = "Показывать CVN в карточной форме в сценарии ".concat(r(scenario));
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("scenario", scenario.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("card_data_form_cvn_shown", wj00Var);
    }

    public static iho v0() {
        String concat = "Открытие экрана со способами оплаты, предвыбранный метод оплаты ".concat("не существует");
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.i("preferred", false);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("show_main_screen_select_payment_method", wj00Var);
    }

    public static iho w(TextFieldNameForAnalytics textFieldNameForAnalytics, Scenario scenario) {
        String l = b64.l("Изменилось значение в поле ввода ", p(textFieldNameForAnalytics), " на экране ввода новой карты в сценарии ", r(scenario));
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("scenario", scenario.getValue());
        wj00Var.k("field", textFieldNameForAnalytics.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, l);
        return y891.c("card_data_form-input", wj00Var);
    }

    public static iho w0(PsdkScreen psdkScreen) {
        String str;
        switch (rv90.j[psdkScreen.ordinal()]) {
            case 1:
                str = "нативного экрана привязки новой карты";
                break;
            case 2:
                str = "DivKit экрана привязки новой карты";
                break;
            case 3:
                str = "нативного экрана выбора способа оплаты";
                break;
            case 4:
                str = "DivKit экрана выбора способа оплаты";
                break;
            case 5:
                str = "нативного экрана предвыбора способа оплаты";
                break;
            case 6:
                str = "DivKit экрана предвыбора способа оплаты";
                break;
            case 7:
                str = "нативного экрана выбора банка";
                break;
            case 8:
                str = "DivKit экрана выбора банка";
                break;
            case 9:
                str = "нативного экрана лицензионного соглашения";
                break;
            case 10:
                str = "DivKit экрана лицензионного соглашения";
                break;
            case 11:
                str = "экрана ввода CVV";
                break;
            case 12:
                str = "экрана вебвью";
                break;
            case 13:
                str = "нативного экрана СМС Челленджа";
                break;
            case 14:
                str = "DivKit экрана СМС Челленджа";
                break;
            case 15:
                str = "нативного экрана Челленджа на сумму";
                break;
            case 16:
                str = "DivKit экрана Челленджа на сумму";
                break;
            default:
                str = "экрана";
                break;
        }
        String concat = "Показ ".concat(str);
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, "screen_shown_" + psdkScreen);
    }

    public static iho x(Scenario scenario) {
        String concat = "Открытие экрана ввода новой карты в сценарии ".concat(r(scenario));
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("scenario", scenario.getValue());
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
        return y891.c("card_data_form-shown", wj00Var);
    }

    public static iho x0() {
        sv90 sv90Var = qv90.a;
        return xvz.f(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Метод оплаты был предвыбран, экран со способами оплаты не требуется", "skip_main_screen_select_payment_method");
    }

    public static iho y(String str) {
        String concat = "Ошибка чтения блоков карты: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("nfc_read_blocks_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, CRLReasonCodeExtension.REASON, str));
    }

    public static n53 y0(ArrayList arrayList) {
        n53 n53Var = new n53(0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n53Var.b.add(new ktu0((String) it.next()));
        }
        return n53Var;
    }

    public static iho z(String str) {
        String concat = "Ошибка чтения номера карты: ".concat(str);
        sv90 sv90Var = qv90.a;
        return y891.c("nfc_read_card_number_error", vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat, CRLReasonCodeExtension.REASON, str));
    }

    public static iho z0(TextFieldNameForAnalytics textFieldNameForAnalytics, boolean z, Scenario scenario) {
        String str;
        String p = unr0.p("Фокус перешел на другое текстовое поле на экране ввода новой карты: поле ввода ", p(textFieldNameForAnalytics), " ", z ? "получило" : "потеряло", " фокус");
        if (scenario != null) {
            p = g8e.p(p, " в сценарии ", r(scenario));
        }
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("field", textFieldNameForAnalytics.getValue());
        if (scenario == null || (str = scenario.getValue()) == null) {
            str = null;
        }
        if (str != null) {
            wj00Var.k("scenario", str);
        }
        wj00Var.i("focus", z);
        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
        return y891.c("text_field_focus_changed", wj00Var);
    }
}
