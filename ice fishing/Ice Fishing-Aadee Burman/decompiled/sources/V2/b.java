package V2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.emoji2.text.i;
import androidx.emoji2.text.k;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t8.g;
import y1.C5219n;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import y1.x;

/* loaded from: classes.dex */
public final class b implements i, InterfaceC5224s {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3272n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f3273u;

    public /* synthetic */ b(Context context, int i) {
        this.f3272n = i;
        this.f3273u = context;
    }

    @Override // androidx.emoji2.text.i
    public void a(g gVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k(0, this, gVar, threadPoolExecutor));
    }

    public ApplicationInfo b(int i, String str) {
        return this.f3273u.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return this.f3273u.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f3273u;
        if (callingUid == myUid) {
            return a.q(context);
        }
        if (!T2.b.f() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(x xVar) {
        switch (this.f3272n) {
            case 2:
                return new C5219n(this.f3273u, 0);
            default:
                return new C5219n(this.f3273u, 1);
        }
    }

    public b(Context context) {
        this.f3272n = 1;
        this.f3273u = context.getApplicationContext();
    }
}
