package A1;

import E2.M;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.ads.WP;
import d2.C4459a;
import h.C4543G;
import i1.C4585b;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.c1;
import t7.InterfaceC5045a;

/* renamed from: A1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266h implements y, InterfaceC0268j, androidx.emoji2.text.i {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f59n;

    /* renamed from: u, reason: collision with root package name */
    public Context f60u;

    public /* synthetic */ C0266h() {
        this.f59n = 4;
    }

    @Override // A1.InterfaceC0268j
    public Class a() {
        return InputStream.class;
    }

    @Override // A1.InterfaceC0268j
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResource(i);
    }

    @Override // androidx.emoji2.text.i
    public void c(A8.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.k(0, this, bVar, threadPoolExecutor));
    }

    @Override // A1.InterfaceC0268j
    public void d(Object obj) {
        ((InputStream) obj).close();
    }

    public A6.d e() {
        Context context = this.f60u;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        A6.d dVar = new A6.d();
        dVar.f204u = C4459a.a(b2.k.f5542a);
        C4585b c4585b = new C4585b(24, context);
        dVar.f205v = c4585b;
        dVar.f206w = C4459a.a(new S0.e(8, c4585b, new C4585b(17, c4585b)));
        C4585b c4585b2 = (C4585b) dVar.f205v;
        dVar.f207x = new I0.j(26, c4585b2);
        InterfaceC5045a a9 = C4459a.a(new WP((I0.j) dVar.f207x, C4459a.a(new C4543G(c4585b2))));
        dVar.f208y = a9;
        O2.i iVar = new O2.i(19);
        C4585b c4585b3 = (C4585b) dVar.f205v;
        b3.e eVar = new b3.e(27, c4585b3, a9, iVar);
        InterfaceC5045a interfaceC5045a = (InterfaceC5045a) dVar.f204u;
        InterfaceC5045a interfaceC5045a2 = (InterfaceC5045a) dVar.f206w;
        dVar.f209z = C4459a.a(new b3.e(24, new M(interfaceC5045a, interfaceC5045a2, eVar, a9, a9, 6), new c1(c4585b3, interfaceC5045a2, a9, eVar, interfaceC5045a, a9, a9), new S0.i(interfaceC5045a, a9, eVar, a9, 6)));
        return dVar;
    }

    public ApplicationInfo f(int i, String str) {
        return this.f60u.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo g(int i, String str) {
        return this.f60u.getPackageManager().getPackageInfo(str, i);
    }

    public boolean h() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f60u;
        if (callingUid == myUid) {
            return X2.a.m(context);
        }
        if (!V2.b.f() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    @Override // A1.y
    public x j(E e9) {
        switch (this.f59n) {
            case 0:
                return new C0260b(this.f60u, this);
            default:
                return new C0260b(this.f60u, e9.a(Integer.class, InputStream.class));
        }
    }

    public /* synthetic */ C0266h(Context context, int i) {
        this.f59n = i;
        this.f60u = context;
    }

    public C0266h(Context context) {
        this.f59n = 3;
        this.f60u = context.getApplicationContext();
    }
}
