package E2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.XB;
import com.google.android.gms.internal.ads.YB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import x2.C5189a;

/* renamed from: E2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f777a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f778b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f779c;

    /* renamed from: d, reason: collision with root package name */
    public final C5189a f780d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f781e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f782f = new AtomicBoolean(false);

    public C0305b(Context context, ArrayList arrayList, C5189a c5189a) {
        this.f777a = context;
        this.f778b = context.getApplicationInfo();
        this.f779c = arrayList;
        this.f780d = c5189a;
    }

    public final void a(WebView webView) {
        if (this.f782f.getAndSet(true)) {
            return;
        }
        ApplicationInfo applicationInfo = this.f778b;
        PackageInfo packageInfo = null;
        if (applicationInfo != null) {
            try {
                packageInfo = X2.b.a(this.f777a).g(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f781e;
        if (packageInfo != null) {
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.f19852M, packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e9) {
                C4906k.f40186C.f40196h.d("PawAppSignalGenerator.initialize", e9);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f779c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.jb)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f780d.f41845n);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) AbstractC2823Ua.f28724b.r()).booleanValue() && com.bumptech.glide.f.m("DOCUMENT_START_SCRIPT") && webView != null) {
            String format = String.format(Locale.getDefault(), (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.ib), b());
            int i = XB.f29283v;
            YB yb = new YB("*");
            int i4 = H0.e.f1187a;
            if (!I0.m.f1297e.b()) {
                throw I0.m.a();
            }
        }
    }

    public final JSONObject b() {
        if (!this.f782f.get()) {
            a(null);
        }
        return this.f781e;
    }
}
