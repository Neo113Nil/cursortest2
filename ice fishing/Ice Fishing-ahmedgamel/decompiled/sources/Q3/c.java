package Q3;

import E2.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import e4.InterfaceC4481a;
import j4.C4620a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements InterfaceC4481a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2654c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2652a = i;
        this.f2653b = obj;
        this.f2654c = obj2;
    }

    @Override // e4.InterfaceC4481a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f2652a) {
            case 0:
                g gVar = (g) this.f2653b;
                String d9 = gVar.d();
                Context context = (Context) this.f2654c;
                C4620a c4620a = new C4620a();
                Context a9 = E.c.a(context);
                SharedPreferences sharedPreferences = a9.getSharedPreferences("com.google.firebase.common.prefs:" + d9, 0);
                boolean z6 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z6 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = a9.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a9.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z6 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                c4620a.f38487a = z6;
                return c4620a;
            case 1:
                T3.g gVar2 = (T3.g) this.f2653b;
                gVar2.getClass();
                T3.b bVar = (T3.b) this.f2654c;
                return bVar.f3174f.c(new M(bVar, gVar2));
            default:
                return new c4.h((Context) this.f2654c, (String) this.f2653b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f2652a = 2;
        this.f2654c = context;
        this.f2653b = str;
    }
}
