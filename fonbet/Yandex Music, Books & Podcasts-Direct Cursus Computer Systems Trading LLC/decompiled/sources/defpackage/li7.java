package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.connectsdk.service.DeviceService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class li7 extends WebChromeClient {
    public final /* synthetic */ mi7 a;
    public final /* synthetic */ gv3 b;

    public li7(mi7 mi7Var, gv3 gv3Var) {
        this.a = mi7Var;
        this.b = gv3Var;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || consoleMessage.messageLevel().compareTo(ConsoleMessage.MessageLevel.ERROR) < 0) {
            return false;
        }
        String message = consoleMessage.message();
        message.getClass();
        uiq uiqVar = (uiq) this.b;
        uiqVar.getClass();
        zdv zdvVar = (zdv) uiqVar.b;
        g0c y = zdvVar.y();
        hgv n = zdvVar.getN();
        n.getClass();
        int ordinal = n.ordinal();
        String s = hrg.s("Javascript ошибка в вебвью: ", message, " (", ordinal != 0 ? ordinal != 1 ? "" : "оформление кредита" : "форма 3DS", ")");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put(Constants.KEY_VALUE, new jkr(message));
        linkedHashMap.put("webview_tag", new jkr(n.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(s));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "webview_javascript_error", "webview_javascript_error", vtmVar);
        x60 x60Var = (x60) y;
        x60Var.getClass();
        x60Var.a(j);
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.HitTestResult hitTestResult;
        String extra;
        if (webView != null && (hitTestResult = webView.getHitTestResult()) != null && (extra = hitTestResult.getExtra()) != null) {
            Uri parse = Uri.parse(extra);
            mi7 mi7Var = this.a;
            List list = mi7Var.d;
            parse.getClass();
            ArrayList f = mi7.f(parse, list);
            boolean isEmpty = f.isEmpty();
            boolean z3 = !isEmpty;
            Set e = mi7.e(f);
            g0c g0cVar = mi7Var.e;
            if (g0cVar != null) {
                String uri = parse.toString();
                uri.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr("Попытка открыть url из webview в новой вкладке"));
                linkedHashMap.put("new_tab_trusted", new mc3(z3));
                vtm k = su4.k(uri, linkedHashMap, "new_tab_url", linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                ((x60) g0cVar).a(su4.j(k, "event_name", "open_new_tab_url", "open_new_tab_url", k));
            }
            if (!isEmpty && e.contains("new_tab")) {
                Map headers = e.contains("version_header") ? mi7Var.getHeaders() : null;
                uiq uiqVar = (uiq) this.b;
                uiqVar.getClass();
                yfx w = new z0j(6).w();
                if (headers != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : headers.entrySet()) {
                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    ((Intent) w.b).putExtra("com.android.browser.headers", bundle);
                }
                w.p(((zdv) uiqVar.b).requireContext(), parse);
            }
        }
        return true;
    }
}
