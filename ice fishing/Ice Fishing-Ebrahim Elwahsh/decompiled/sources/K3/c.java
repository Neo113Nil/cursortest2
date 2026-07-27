package K3;

import B2.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d4.C4458a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Y3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1616c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f1614a = i;
        this.f1615b = obj;
        this.f1616c = obj2;
    }

    @Override // Y3.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f1614a) {
            case 0:
                g gVar = (g) this.f1615b;
                String d2 = gVar.d();
                Context context = (Context) this.f1616c;
                C4458a c4458a = new C4458a();
                Context a9 = E.c.a(context);
                SharedPreferences sharedPreferences = a9.getSharedPreferences("com.google.firebase.common.prefs:" + d2, 0);
                boolean z8 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z8 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = a9.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a9.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z8 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c4458a.f37201a = z8;
                return c4458a;
            case 1:
                N3.g gVar2 = (N3.g) this.f1615b;
                gVar2.getClass();
                N3.b bVar = (N3.b) this.f1616c;
                return bVar.f2159f.b(new N(bVar, gVar2));
            default:
                return new W3.h((Context) this.f1616c, (String) this.f1615b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f1614a = 2;
        this.f1616c = context;
        this.f1615b = str;
    }
}
