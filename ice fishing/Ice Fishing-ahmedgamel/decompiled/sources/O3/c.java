package O3;

import C2.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c4.InterfaceC0542a;
import h4.C4572a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC0542a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2338c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2336a = i;
        this.f2337b = obj;
        this.f2338c = obj2;
    }

    @Override // c4.InterfaceC0542a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f2336a) {
            case 0:
                g gVar = (g) this.f2337b;
                String d2 = gVar.d();
                Context context = (Context) this.f2338c;
                C4572a c4572a = new C4572a();
                Context a9 = E.c.a(context);
                SharedPreferences sharedPreferences = a9.getSharedPreferences("com.google.firebase.common.prefs:" + d2, 0);
                boolean z3 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z3 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = a9.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a9.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z3 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c4572a.f38018a = z3;
                return c4572a;
            case 1:
                R3.g gVar2 = (R3.g) this.f2337b;
                gVar2.getClass();
                R3.b bVar = (R3.b) this.f2338c;
                return bVar.f2719f.b(new N(bVar, gVar2));
            default:
                return new a4.h((Context) this.f2338c, (String) this.f2337b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f2336a = 2;
        this.f2338c = context;
        this.f2337b = str;
    }
}
