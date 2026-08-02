package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wl5 extends bfu {
    public final jyr k;
    public final jyr l;
    public final xdr m;

    @wiu
    public wl5(@NotNull nl5 nl5Var) {
        Object value;
        nl5Var.getClass();
        bdt I = hag.I(uz1.class);
        l18 l18Var = l18.b;
        this.k = l18Var.b(I, true);
        this.l = l18Var.b(hag.I(ioi.class), true);
        jyr b = l18Var.b(hag.I(qy7.class), true);
        yiq yiqVar = new yiq();
        addCloseable((AutoCloseable) yiqVar);
        mm6 r = hld.r(yiqVar, dm6.b);
        xdr a = ydr.a(rl5.a);
        this.m = a;
        if ((a.getValue() instanceof rl5) || (a.getValue() instanceof sl5)) {
            String uri = Uri.parse("https://music.yandex.ru/complaint").buildUpon().appendQueryParameter("contentType", "track").appendQueryParameter("contentId", nl5Var.a).appendQueryParameter("lang", swf.H().a).appendQueryParameter("theme", ((qy7) b.getValue()).a().b() ? "black" : "white").build().toString();
            uri.getClass();
            Continuation continuation = null;
            rar y = x97.y(r, null, pm6.b, new vv4(this, uri, continuation, 7), 1);
            x97.y(r, null, null, new ja4(this, continuation, 10), 3);
            do {
                value = a.getValue();
            } while (!a.k(value, new tl5(y, false)));
            y.start();
        }
    }

    public final void a(String str) {
        Object value;
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("postMessageType");
            String string2 = jSONObject.getString(Constants.KEY_ACTION);
            if (Intrinsics.d(string, "COMPLAINT_RESULT") && Intrinsics.d(string2, "close")) {
                xdr xdrVar = this.m;
                do {
                    value = xdrVar.getValue();
                    ul5 ul5Var = (ul5) value;
                    if (ul5Var instanceof tl5) {
                        ((tl5) ul5Var).a.g(null);
                    }
                } while (!xdrVar.k(value, ql5.a));
            }
        } catch (JSONException unused) {
        }
    }
}
