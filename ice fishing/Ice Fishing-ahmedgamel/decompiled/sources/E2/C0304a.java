package E2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3236fu;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.C3464k7;
import com.google.android.gms.internal.ads.C4260yv;
import com.google.android.gms.internal.ads.LD;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: E2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f766a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f767b;

    /* renamed from: c, reason: collision with root package name */
    public final C3464k7 f768c;

    /* renamed from: d, reason: collision with root package name */
    public final C3236fu f769d;

    /* renamed from: e, reason: collision with root package name */
    public final int f770e;

    /* renamed from: f, reason: collision with root package name */
    public final C3391io f771f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f772g;

    /* renamed from: h, reason: collision with root package name */
    public final C3383ig f773h = AbstractC3436jg.f32060f;
    public final C4260yv i;

    /* renamed from: j, reason: collision with root package name */
    public final C f774j;

    /* renamed from: k, reason: collision with root package name */
    public final C0305b f775k;

    /* renamed from: l, reason: collision with root package name */
    public final z f776l;

    public C0304a(WebView webView, C3464k7 c3464k7, C3391io c3391io, C4260yv c4260yv, C3236fu c3236fu, C c9, C0305b c0305b, z zVar) {
        this.f767b = webView;
        Context context = webView.getContext();
        this.f766a = context;
        this.f768c = c3464k7;
        this.f771f = c3391io;
        AbstractC3592ma.a(context);
        C3324ha c3324ha = AbstractC3592ma.Ya;
        s2.r rVar = s2.r.f40506e;
        this.f770e = ((Integer) rVar.f40509c.a(c3324ha)).intValue();
        this.f772g = ((Boolean) rVar.f40509c.a(AbstractC3592ma.Za)).booleanValue();
        this.i = c4260yv;
        this.f769d = c3236fu;
        this.f774j = c9;
        this.f775k = c0305b;
        this.f776l = zVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String h3 = this.f768c.f32160b.h(this.f766a, str, this.f767b);
            if (!this.f772g) {
                return h3;
            }
            c4906k.f40198k.getClass();
            t8.g.z(this.f771f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return h3;
        } catch (RuntimeException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Exception getting click signals. ", e9);
            C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.getClickSignals", e9);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            String k9 = D.x.k(i, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 51));
            int i4 = w2.z.f41712b;
            x2.i.c(k9);
            return "";
        }
        try {
            return (String) AbstractC3436jg.f32055a.b(new w(0, this, str)).get(Math.min(i, this.f770e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e9) {
            int i6 = w2.z.f41712b;
            x2.i.d("Exception getting click signals with timeout. ", e9);
            C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e9);
            return e9 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        w2.D d9 = C4906k.f40186C.f40191c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        u uVar = new u(this, uuid);
        if (((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue()) {
            this.f774j.a(this.f767b, uVar);
            return uuid;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.bb)).booleanValue()) {
            this.f773h.execute(new x(0, this, bundle, uVar));
            return uuid;
        }
        H2.a.a(this.f766a, m2.b.BANNER, new m2.g((m2.f) new m2.f(3).e(bundle)), uVar);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            C4906k c4906k = C4906k.f40186C;
            c4906k.f40198k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String i = this.f768c.f32160b.i(this.f766a, this.f767b, null);
            if (!this.f772g) {
                return i;
            }
            c4906k.f40198k.getClass();
            t8.g.z(this.f771f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return i;
        } catch (RuntimeException e9) {
            int i4 = w2.z.f41712b;
            x2.i.d("Exception getting view signals. ", e9);
            C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.getViewSignals", e9);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String k9 = D.x.k(i, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 50));
            int i4 = w2.z.f41712b;
            x2.i.c(k9);
            return "";
        }
        try {
            return (String) AbstractC3436jg.f32055a.b(new v(0, this)).get(Math.min(i, this.f770e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e9) {
            int i6 = w2.z.f41712b;
            x2.i.d("Exception getting view signals with timeout. ", e9);
            C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e9);
            return e9 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.db)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3436jg.f32055a.execute(new LD(5, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i4 = jSONObject.getInt("x");
            int i6 = jSONObject.getInt("y");
            int i9 = jSONObject.getInt("duration_ms");
            float f2 = (float) jSONObject.getDouble("force");
            int i10 = jSONObject.getInt("type");
            if (i10 != 0) {
                i = 1;
                if (i10 != 1) {
                    i = 2;
                    if (i10 != 2) {
                        i = 3;
                        if (i10 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.f768c.f32160b.b(MotionEvent.obtain(0L, i9, i, i4, i6, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e9) {
                e = e9;
                int i11 = w2.z.f41712b;
                x2.i.d("Failed to parse the touch string. ", e);
                C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e10) {
                e = e10;
                int i112 = w2.z.f41712b;
                x2.i.d("Failed to parse the touch string. ", e);
                C4906k.f40186C.f40196h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e11) {
            e = e11;
        }
    }
}
