package N3;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1961n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1962u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1963v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1964w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1965x;

    public /* synthetic */ d(int i, int i4, Object obj, Object obj2, String str) {
        this.f1961n = i4;
        this.f1964w = obj;
        this.f1962u = str;
        this.f1963v = i;
        this.f1965x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.f1961n) {
            case 0:
                ConcurrentHashMap concurrentHashMap = ((f) this.f1964w).f1970v.f1973c;
                String str = this.f1962u;
                o oVar = (o) concurrentHashMap.remove(str);
                if (oVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("targetPackage", str);
                    bundle.putInt("errorCode", this.f1963v);
                    bundle.putString("errorMessage", (String) this.f1965x);
                    oVar.f2005b.K(bundle);
                    break;
                } else {
                    Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Cannot report error.");
                    break;
                }
            default:
                o oVar2 = (o) ((g) this.f1964w).f1973c.get(this.f1962u);
                if (oVar2 != null && oVar2.a(this.f1963v) && (runnable = (Runnable) this.f1965x) != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
