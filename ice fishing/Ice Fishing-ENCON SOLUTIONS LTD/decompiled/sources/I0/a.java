package I0;

import a1.InterfaceC0090f;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements W0.b {

    /* renamed from: a, reason: collision with root package name */
    public b f718a;

    @Override // W0.b
    public final void onAttachedToEngine(W0.a binding) {
        i.e(binding, "binding");
        InterfaceC0090f interfaceC0090f = binding.f1856b;
        i.d(interfaceC0090f, "getBinaryMessenger(...)");
        Context context = binding.f1855a;
        i.d(context, "getApplicationContext(...)");
        this.f718a = new b(interfaceC0090f, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        i.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        i.b(contentResolver);
        b bVar = new b(packageManager, (ActivityManager) systemService, contentResolver, 0);
        b bVar2 = this.f718a;
        if (bVar2 != null) {
            bVar2.M(bVar);
        } else {
            i.i("methodChannel");
            throw null;
        }
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a binding) {
        i.e(binding, "binding");
        b bVar = this.f718a;
        if (bVar != null) {
            bVar.M(null);
        } else {
            i.i("methodChannel");
            throw null;
        }
    }
}
