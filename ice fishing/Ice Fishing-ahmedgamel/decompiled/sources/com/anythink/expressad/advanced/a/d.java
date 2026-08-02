package com.anythink.expressad.advanced.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18517a = "d";

    /* renamed from: b, reason: collision with root package name */
    private WebView f18518b;

    /* renamed from: c, reason: collision with root package name */
    private int f18519c;

    public d(WebView webView) {
        this.f18518b = webView;
    }

    public final void a() {
        this.f18518b = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f18518b, 0);
                return;
            }
            if (!com.anythink.expressad.foundation.g.a.ca) {
                a(this.f18518b, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f18518b, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f18518b, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f18518b, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f18519c = networkType;
                int a9 = n.a(networkType);
                this.f18519c = a9;
                a(this.f18518b, a9);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void a(WebView webView, int i) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f18690m, i);
                h.a();
                com.anythink.core.express.d.a.a(webView, NativeAdvancedJsUtils.f18689l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
