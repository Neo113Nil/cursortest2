package defpackage;

import android.os.SystemClock;
import com.yandex.messenger.websdk.internal.web.MessageType;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final /* synthetic */ class ydb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ heb b;

    public /* synthetic */ ydb(heb hebVar, int i) {
        this.a = i;
        this.b = hebVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        heb hebVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                hebVar.g.c("wm_chat_data_loaded", gw00.e(new Pair("intent_page", ChatWebViewController$IntentPage.CHAT)));
                hebVar.F = true;
                hebVar.k();
                p370 p370Var = hebVar.r;
                p370Var.getClass();
                jl40.m();
                g790 g790Var = (g790) p370Var.c;
                if (g790Var != null) {
                    g790Var.b = Long.valueOf(SystemClock.elapsedRealtime());
                }
                if (str != null) {
                    hebVar.a(str);
                    break;
                }
                break;
            case 1:
                hebVar.g.c("wm_chat_list_data_loaded", gw00.e(new Pair("intent_page", ChatWebViewController$IntentPage.CHAT_LIST)));
                hebVar.G = true;
                hebVar.k();
                hebVar.j(deb.a);
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                c9v c9vVar = hebVar.C;
                if (c9vVar == null) {
                    c9vVar = null;
                }
                hdu hduVar = hebVar.e().a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "setVisibility");
                jSONObject.put(Constants.KEY_DATA, new JSONObject().put("visible", booleanValue));
                c9v.h(c9vVar, nax.b(hdu.n(hduVar, MessageType.Request, jSONObject, null)));
                hebVar.H = booleanValue;
                hebVar.g.c("wm_visibility_updated", b.i(new Pair("isVisible", bool), new Pair("tag", hebVar.h.c)));
                hebVar.k();
                break;
        }
        return zy11Var;
    }
}
