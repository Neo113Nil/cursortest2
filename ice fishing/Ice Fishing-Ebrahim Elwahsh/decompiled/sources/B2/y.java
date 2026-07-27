package B2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f319c;

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.f317a = i;
        this.f318b = obj;
        this.f319c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        boolean z8 = false;
        Object obj = this.f318b;
        Object obj2 = this.f319c;
        switch (this.f317a) {
            case 0:
                return ((C0267a) obj).getClickSignals((String) obj2);
            case 1:
                return ((p2.e) obj).k((Context) obj2);
            case 2:
                Context context = (Context) obj;
                Context context2 = (Context) obj2;
                if (context != null) {
                    t2.C.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    t2.C.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z8 = true;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    t2.C.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z8) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        t2.C.k("Persisting user agent.");
                    }
                }
                return string;
            default:
                t2.D d2 = t2.G.f40858l;
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setDatabasePath(((Context) obj2).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31781s1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }
}
