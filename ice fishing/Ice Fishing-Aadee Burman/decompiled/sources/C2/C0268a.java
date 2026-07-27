package C2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2801Ua;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3213fu;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3441k7;
import com.google.android.gms.internal.ads.C4237yv;
import com.google.android.gms.internal.ads.LD;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: C2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f306a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f307b;

    /* renamed from: c, reason: collision with root package name */
    public final C3441k7 f308c;

    /* renamed from: d, reason: collision with root package name */
    public final C3213fu f309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f310e;

    /* renamed from: f, reason: collision with root package name */
    public final C3315ho f311f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f312g;

    /* renamed from: h, reason: collision with root package name */
    public final C3360ig f313h = AbstractC3413jg.f31273f;
    public final C4237yv i;

    /* renamed from: j, reason: collision with root package name */
    public final D f314j;

    /* renamed from: k, reason: collision with root package name */
    public final C0269b f315k;

    /* renamed from: l, reason: collision with root package name */
    public final A f316l;

    public C0268a(WebView webView, C3441k7 c3441k7, C3315ho c3315ho, C4237yv c4237yv, C3213fu c3213fu, D d2, C0269b c0269b, A a9) {
        this.f307b = webView;
        Context context = webView.getContext();
        this.f306a = context;
        this.f308c = c3441k7;
        this.f311f = c3315ho;
        AbstractC3569ma.a(context);
        C3301ha c3301ha = AbstractC3569ma.Ya;
        q2.r rVar = q2.r.f40204e;
        this.f310e = ((Integer) rVar.f40207c.a(c3301ha)).intValue();
        this.f312g = ((Boolean) rVar.f40207c.a(AbstractC3569ma.Za)).booleanValue();
        this.i = c4237yv;
        this.f309d = c3213fu;
        this.f314j = d2;
        this.f315k = c0269b;
        this.f316l = a9;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            C4835j c4835j = C4835j.f39730C;
            c4835j.f39742k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String h9 = this.f308c.f31381b.h(this.f306a, str, this.f307b);
            if (!this.f312g) {
                return h9;
            }
            c4835j.f39742k.getClass();
            com.bumptech.glide.d.p(this.f311f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return h9;
        } catch (RuntimeException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Exception getting click signals. ", e9);
            C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.getClickSignals", e9);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            String m4 = D.y.m(i, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 51));
            int i6 = u2.z.f41319b;
            v2.i.c(m4);
            return "";
        }
        try {
            return (String) AbstractC3413jg.f31268a.b(new x(0, this, str)).get(Math.min(i, this.f310e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e9) {
            int i9 = u2.z.f41319b;
            v2.i.d("Exception getting click signals with timeout. ", e9);
            C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e9);
            return e9 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        u2.D d2 = C4835j.f39730C.f39735c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        v vVar = new v(this, uuid);
        if (((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue()) {
            this.f314j.a(this.f307b, vVar);
            return uuid;
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.bb)).booleanValue()) {
            this.f313h.execute(new y(0, this, bundle, vVar));
            return uuid;
        }
        F2.a.a(this.f306a, k2.b.BANNER, new k2.g((k2.f) new k2.f(2).e(bundle)), vVar);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            C4835j c4835j = C4835j.f39730C;
            c4835j.f39742k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String i = this.f308c.f31381b.i(this.f306a, this.f307b, null);
            if (!this.f312g) {
                return i;
            }
            c4835j.f39742k.getClass();
            com.bumptech.glide.d.p(this.f311f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return i;
        } catch (RuntimeException e9) {
            int i6 = u2.z.f41319b;
            v2.i.d("Exception getting view signals. ", e9);
            C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.getViewSignals", e9);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String m4 = D.y.m(i, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 50));
            int i6 = u2.z.f41319b;
            v2.i.c(m4);
            return "";
        }
        try {
            return (String) AbstractC3413jg.f31268a.b(new w(0, this)).get(Math.min(i, this.f310e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e9) {
            int i9 = u2.z.f41319b;
            v2.i.d("Exception getting view signals with timeout. ", e9);
            C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e9);
            return e9 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.db)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3413jg.f31268a.execute(new LD(2, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i6 = jSONObject.getInt("x");
            int i9 = jSONObject.getInt("y");
            int i10 = jSONObject.getInt("duration_ms");
            float f3 = (float) jSONObject.getDouble("force");
            int i11 = jSONObject.getInt("type");
            if (i11 != 0) {
                i = 1;
                if (i11 != 1) {
                    i = 2;
                    if (i11 != 2) {
                        i = 3;
                        if (i11 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.f308c.f31381b.b(MotionEvent.obtain(0L, i10, i, i6, i9, f3, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e9) {
                e = e9;
                int i12 = u2.z.f41319b;
                v2.i.d("Failed to parse the touch string. ", e);
                C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e10) {
                e = e10;
                int i122 = u2.z.f41319b;
                v2.i.d("Failed to parse the touch string. ", e);
                C4835j.f39730C.f39740h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e11) {
            e = e11;
        }
    }
}
