package M0;

import android.window.OnBackInvokedCallback;
import h.LayoutInflaterFactory2C0159B;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f611b;

    public /* synthetic */ d(int i, Object obj) {
        this.f610a = i;
        this.f611b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f610a) {
            case 0:
                ((b) this.f611b).a();
                break;
            case 1:
                C1.a aVar = (C1.a) this.f611b;
                D1.i.e(aVar, "$onBackInvoked");
                aVar.c();
                break;
            case 2:
                ((LayoutInflaterFactory2C0159B) this.f611b).C();
                break;
            default:
                ((Runnable) this.f611b).run();
                break;
        }
    }
}
