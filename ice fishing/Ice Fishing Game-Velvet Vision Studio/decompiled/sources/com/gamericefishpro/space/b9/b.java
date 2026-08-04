package com.gamericefishpro.space.b9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.appsflyer.internal.d;
import com.gamericefishpro.space.c8.k;
import com.gamericefishpro.space.c8.n;
import com.gamericefishpro.space.e4.g;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.j8.e;
import com.gamericefishpro.space.pi.x1;
import com.gamericefishpro.space.s4.j;
import com.gamericefishpro.space.sa.h;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.u6.s;
import com.gamericefishpro.space.v8.c0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j, h {
    public Context a;

    public /* synthetic */ b(Context context, byte b) {
        this.a = context;
    }

    @Override // com.gamericefishpro.space.sa.i
    public Object a() {
        return this.a;
    }

    @Override // com.gamericefishpro.space.s4.j
    public void b(d5 d5Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new x1("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new d(this, d5Var, threadPoolExecutor, 6));
    }

    public k c() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.d = com.gamericefishpro.space.e8.a.a(n.a);
        g gVar = new g(context);
        kVar.e = gVar;
        kVar.i = com.gamericefishpro.space.e8.a.a(new s(1, gVar, new com.gamericefishpro.space.vb.c(8, gVar)));
        g gVar2 = kVar.e;
        kVar.v = new e(gVar2, 1);
        com.gamericefishpro.space.nh.a aVarA = com.gamericefishpro.space.e8.a.a(new l(kVar.v, com.gamericefishpro.space.e8.a.a(new e(gVar2, 0))));
        kVar.w = aVarA;
        com.gamericefishpro.space.v8.l lVar = new com.gamericefishpro.space.v8.l(5);
        g gVar3 = kVar.e;
        com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(gVar3, aVarA, lVar, 10);
        com.gamericefishpro.space.nh.a aVar = kVar.d;
        com.gamericefishpro.space.nh.a aVar2 = kVar.i;
        com.gamericefishpro.space.b1.d dVar = new com.gamericefishpro.space.b1.d(aVar, aVar2, cVar, aVarA, aVarA);
        com.gamericefishpro.space.b8.k kVar2 = new com.gamericefishpro.space.b8.k();
        kVar2.d = gVar3;
        kVar2.e = aVar2;
        kVar2.i = aVarA;
        kVar2.v = cVar;
        kVar2.w = aVar;
        kVar2.y = aVarA;
        kVar2.z = aVarA;
        com.gamericefishpro.space.tb.s sVar = new com.gamericefishpro.space.tb.s();
        sVar.d = aVar;
        sVar.e = aVarA;
        sVar.i = cVar;
        sVar.v = aVarA;
        kVar.y = com.gamericefishpro.space.e8.a.a(new com.gamericefishpro.space.a8.c(dVar, kVar2, sVar, 4));
        return kVar;
    }

    public ApplicationInfo d(int i, String str) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo e(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean f() {
        Context context = this.a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.y(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public b(Context context, int i) {
        switch (i) {
            case 4:
                this.a = context.getApplicationContext();
                break;
            default:
                c0.g(context);
                Context applicationContext = context.getApplicationContext();
                c0.g(applicationContext);
                this.a = applicationContext;
                break;
        }
    }
}
