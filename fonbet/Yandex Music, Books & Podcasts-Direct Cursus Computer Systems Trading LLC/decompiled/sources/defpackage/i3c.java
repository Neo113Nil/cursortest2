package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i3c implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ i3c(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        ja jaVar;
        String string;
        rtm rtmVar;
        pt0 pt0Var;
        ja N;
        switch (this.a) {
            case 0:
                ybl yblVar = nsh.o;
                gs4 o = gs4.i.o();
                SharedPreferences sharedPreferences = ((sk2) o.e).a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
                    String string2 = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
                    if (string2 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(string2);
                            Date date = ja.l;
                            jaVar = n7w.E(jSONObject);
                        } catch (JSONException unused) {
                        }
                        if (jaVar != null) {
                            o.V(jaVar, false);
                        }
                        nsh f = yblVar.f();
                        string = ((ttm) f.d).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                        if (string != null) {
                            try {
                                rtmVar = new rtm(new JSONObject(string));
                            } catch (JSONException unused2) {
                            }
                            if (rtmVar != null) {
                                f.N(rtmVar, false);
                            }
                            Date date2 = ja.l;
                            if (n7w.P() && ((rtm) yblVar.f().b) == null && (N = n7w.N()) != null) {
                                if (n7w.P()) {
                                    yblVar.f().N(null, true);
                                } else {
                                    gvt.r(new l3l(), N.e);
                                }
                            }
                            Context b = j3c.b();
                            String str = j3c.c;
                            b.getClass();
                            if (gtt.c()) {
                                pt0 pt0Var2 = new pt0(b, str);
                                ScheduledThreadPoolExecutor h = pt0.h();
                                if (h == null) {
                                    xq0.q("Required value was null.");
                                    return null;
                                }
                                h.execute(new x8x(7, b, pt0Var2));
                            }
                            if (!bp6.a.contains(gtt.class)) {
                                try {
                                    Context b2 = j3c.b();
                                    ApplicationInfo applicationInfo = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 128);
                                    if ((applicationInfo != null ? applicationInfo.metaData : null) != null && applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                        pt0 pt0Var3 = new pt0(b2, (String) null);
                                        Bundle bundle = new Bundle();
                                        if (!gvt.z()) {
                                            bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                            Log.w("gtt", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                        }
                                        if (gtt.c()) {
                                            pt0Var3.w(bundle, "fb_auto_applink");
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused3) {
                                } catch (Throwable th) {
                                    bp6.a(gtt.class, th);
                                }
                            }
                            Context applicationContext = j3c.b().getApplicationContext();
                            applicationContext.getClass();
                            pt0Var = new pt0(applicationContext, (String) null);
                            if (!bp6.a.contains(pt0Var)) {
                                try {
                                    lt0.d(1);
                                } catch (Throwable th2) {
                                    bp6.a(pt0Var, th2);
                                }
                            }
                            return null;
                        }
                        rtmVar = null;
                        if (rtmVar != null) {
                        }
                        Date date22 = ja.l;
                        if (n7w.P()) {
                            if (n7w.P()) {
                            }
                        }
                        Context b3 = j3c.b();
                        String str2 = j3c.c;
                        b3.getClass();
                        if (gtt.c()) {
                        }
                        if (!bp6.a.contains(gtt.class)) {
                        }
                        Context applicationContext2 = j3c.b().getApplicationContext();
                        applicationContext2.getClass();
                        pt0Var = new pt0(applicationContext2, (String) null);
                        if (!bp6.a.contains(pt0Var)) {
                        }
                        return null;
                    }
                } else {
                    HashSet hashSet = j3c.a;
                }
                jaVar = null;
                if (jaVar != null) {
                }
                nsh f2 = yblVar.f();
                string = ((ttm) f2.d).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string != null) {
                }
                rtmVar = null;
                if (rtmVar != null) {
                }
                Date date222 = ja.l;
                if (n7w.P()) {
                }
                Context b32 = j3c.b();
                String str22 = j3c.c;
                b32.getClass();
                if (gtt.c()) {
                }
                if (!bp6.a.contains(gtt.class)) {
                }
                Context applicationContext22 = j3c.b().getApplicationContext();
                applicationContext22.getClass();
                pt0Var = new pt0(applicationContext22, (String) null);
                if (!bp6.a.contains(pt0Var)) {
                }
                return null;
            case 1:
                return oto.a;
            case 2:
                return pto.a;
            case 3:
                return qto.a;
            default:
                return rto.a;
        }
    }
}
