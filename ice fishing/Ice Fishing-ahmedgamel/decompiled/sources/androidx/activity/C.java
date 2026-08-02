package androidx.activity;

import android.window.OnBackInvokedCallback;
import h.LayoutInflaterFactory2C4537A;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4382b;

    public /* synthetic */ C(int i, Object obj) {
        this.f4381a = i;
        this.f4382b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4381a) {
            case 0:
                ((B) this.f4382b).invoke();
                break;
            case 1:
                ((LayoutInflaterFactory2C4537A) this.f4382b).F();
                break;
            default:
                ((Runnable) this.f4382b).run();
                break;
        }
    }
}
