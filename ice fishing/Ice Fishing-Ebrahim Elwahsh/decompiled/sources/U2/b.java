package U2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Process;
import y1.C5227b;
import y1.InterfaceC5232g;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;

/* loaded from: classes.dex */
public final class b implements InterfaceC5245t, InterfaceC5232g {

    /* renamed from: n, reason: collision with root package name */
    public final Context f3280n;

    public /* synthetic */ b(Context context) {
        this.f3280n = context;
    }

    @Override // y1.InterfaceC5232g
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // y1.InterfaceC5232g
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResourceFd(i);
    }

    public ApplicationInfo c(int i, String str) {
        return this.f3280n.getPackageManager().getApplicationInfo(str, i);
    }

    @Override // y1.InterfaceC5232g
    public void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    public PackageInfo e(int i, String str) {
        return this.f3280n.getPackageManager().getPackageInfo(str, i);
    }

    public boolean f() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f3280n;
        if (callingUid == myUid) {
            return a.l(context);
        }
        if (!S2.b.f() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        return new C5227b(this.f3280n, this);
    }
}
