package l6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import d8.s;
import java.util.List;
import m0.t;
import v.a0;
import v.k1;
import v.v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements m0.c, k1 {

    /* renamed from: g, reason: collision with root package name */
    public int f4202g;

    /* renamed from: h, reason: collision with root package name */
    public int f4203h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4204i;

    public m(Context context) {
        this.f4203h = 0;
        this.f4204i = context;
    }

    @Override // m0.c
    public void c(int i10, Object obj) {
        ((m0.c) this.f4204i).c(i10 + (this.f4203h == 0 ? this.f4202g : 0), obj);
    }

    @Override // m0.c
    public void d(Object obj) {
        this.f4203h++;
        ((m0.c) this.f4204i).d(obj);
    }

    @Override // m0.c
    public void e(Object obj, oc.e eVar) {
        ((m0.c) this.f4204i).e(obj, eVar);
    }

    @Override // m0.c
    public void f() {
        ((m0.c) this.f4204i).f();
    }

    @Override // m0.c
    public void g(int i10, Object obj) {
        ((m0.c) this.f4204i).g(i10 + (this.f4203h == 0 ? this.f4202g : 0), obj);
    }

    @Override // m0.c
    public Object getCurrent() {
        return ((m0.c) this.f4204i).getCurrent();
    }

    @Override // m0.c
    public void i(int i10, int i11, int i12) {
        int i13 = this.f4203h == 0 ? this.f4202g : 0;
        ((m0.c) this.f4204i).i(i10 + i13, i11 + i13, i12);
    }

    @Override // m0.c
    public void j(int i10, int i11) {
        ((m0.c) this.f4204i).j(i10 + (this.f4203h == 0 ? this.f4202g : 0), i11);
    }

    @Override // v.j1
    public v.n k(long j3, v.n nVar, v.n nVar2, v.n nVar3) {
        return ((s) this.f4204i).k(j3, nVar, nVar2, nVar3);
    }

    @Override // v.k1
    public int l() {
        return this.f4203h;
    }

    @Override // v.k1
    public int m() {
        return this.f4202g;
    }

    @Override // m0.c
    public void o() {
        if (!(this.f4203h > 0)) {
            t.c("OffsetApplier up called with no corresponding down");
        }
        this.f4203h--;
        ((m0.c) this.f4204i).o();
    }

    @Override // v.j1
    public v.n p(long j3, v.n nVar, v.n nVar2, v.n nVar3) {
        return ((s) this.f4204i).p(j3, nVar, nVar2, nVar3);
    }

    public synchronized int q() {
        PackageInfo packageInfo;
        if (this.f4202g == 0) {
            try {
                packageInfo = v6.b.a((Context) this.f4204i).f5771a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f4202g = packageInfo.versionCode;
            }
        }
        return this.f4202g;
    }

    public synchronized int r() {
        int i10 = this.f4203h;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.f4204i;
        PackageManager packageManager = context.getPackageManager();
        if (v6.b.a(context).f5771a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            this.f4203h = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f4203h = 2;
        return 2;
    }

    public m(m0.c cVar, int i10) {
        this.f4204i = cVar;
        this.f4202g = i10;
    }

    public m(int i10, int i11, v vVar) {
        this.f4202g = i10;
        this.f4203h = i11;
        this.f4204i = new s(new a0(i10, i11, vVar));
    }
}
