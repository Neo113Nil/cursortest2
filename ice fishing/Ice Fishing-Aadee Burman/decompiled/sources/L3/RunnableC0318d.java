package L3;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: L3.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0318d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1682n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1683u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1684v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1685w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1686x;

    public /* synthetic */ RunnableC0318d(int i, int i6, Object obj, Object obj2, String str) {
        this.f1682n = i6;
        this.f1685w = obj;
        this.f1683u = str;
        this.f1684v = i;
        this.f1686x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.f1682n) {
            case 0:
                ConcurrentHashMap concurrentHashMap = ((BinderC0320f) this.f1685w).f1691v.f1694c;
                String str = this.f1683u;
                r rVar = (r) concurrentHashMap.remove(str);
                if (rVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("targetPackage", str);
                    bundle.putInt("errorCode", this.f1684v);
                    bundle.putString("errorMessage", (String) this.f1686x);
                    rVar.f1732b.L(bundle);
                    break;
                } else {
                    Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Cannot report error.");
                    break;
                }
            default:
                r rVar2 = (r) ((g) this.f1685w).f1694c.get(this.f1683u);
                if (rVar2 != null && rVar2.a(this.f1684v) && (runnable = (Runnable) this.f1686x) != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
