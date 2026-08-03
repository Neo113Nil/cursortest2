package i7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.t;
import d8.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3224c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f3222a = i10;
        this.f3223b = obj;
        this.f3224c = obj2;
    }

    @Override // w7.a
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f3222a) {
            case 0:
                g gVar = (g) this.f3223b;
                Context context = (Context) this.f3224c;
                String c3 = gVar.c();
                b8.a aVar = new b8.a();
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + c3, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f1042a = z10;
                return aVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                l7.g gVar2 = (l7.g) this.f3223b;
                l7.b bVar = (l7.b) this.f3224c;
                return bVar.f4218f.e(new t(bVar, gVar2));
            default:
                return new v((Context) this.f3224c, (String) this.f3223b);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f3222a = 2;
        this.f3224c = context;
        this.f3223b = str;
    }
}
