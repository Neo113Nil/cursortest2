package C2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2801Ua;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.XB;
import com.google.android.gms.internal.ads.YB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: C2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f317a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f318b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f319c;

    /* renamed from: d, reason: collision with root package name */
    public final C5110a f320d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f321e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f322f = new AtomicBoolean(false);

    public C0269b(Context context, ArrayList arrayList, C5110a c5110a) {
        this.f317a = context;
        this.f318b = context.getApplicationInfo();
        this.f319c = arrayList;
        this.f320d = c5110a;
    }

    public final void a(WebView webView) {
        if (this.f322f.getAndSet(true)) {
            return;
        }
        ApplicationInfo applicationInfo = this.f318b;
        PackageInfo packageInfo = null;
        if (applicationInfo != null) {
            try {
                packageInfo = V2.c.a(this.f317a).c(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f321e;
        if (packageInfo != null) {
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.f19065M, packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e9) {
                C4835j.f39733C.f39743h.d("PawAppSignalGenerator.initialize", e9);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f319c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.jb)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f320d.f41391n);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) AbstractC2801Ua.f27926b.r()).booleanValue() && com.bumptech.glide.f.o("DOCUMENT_START_SCRIPT") && webView != null) {
            String format = String.format(Locale.getDefault(), (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.ib), b());
            int i = XB.f28503v;
            YB yb = new YB("*");
            int i6 = H0.e.f1084a;
            if (!I0.m.f1270e.b()) {
                throw I0.m.a();
            }
        }
    }

    public final JSONObject b() {
        if (!this.f322f.get()) {
            a(null);
        }
        return this.f321e;
    }
}
