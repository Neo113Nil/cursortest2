package androidx.activity;

import android.window.OnBackInvokedCallback;
import h.LayoutInflaterFactory2C4533A;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4414b;

    public /* synthetic */ C(int i, Object obj) {
        this.f4413a = i;
        this.f4414b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4413a) {
            case 0:
                ((B) this.f4414b).invoke();
                break;
            case 1:
                ((LayoutInflaterFactory2C4533A) this.f4414b).F();
                break;
            default:
                ((Runnable) this.f4414b).run();
                break;
        }
    }
}
