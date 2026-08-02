package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2677Lh;
import com.google.android.gms.internal.ads.InterfaceC2488Af;

/* loaded from: classes.dex */
public final class A implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4781n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4782u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4783v;

    public /* synthetic */ A(int i, Object obj, Object obj2) {
        this.f4781n = i;
        this.f4783v = obj;
        this.f4782u = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4781n) {
            case 0:
                V v9 = (V) this.f4782u;
                v9.k();
                C0471j.f((ViewGroup) v9.f4875c.f5018X.getParent(), ((B) this.f4783v).f4784n).e();
                break;
            default:
                ((C2677Lh) this.f4783v).n(view, (InterfaceC2488Af) this.f4782u, 10);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f4781n;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
