package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C2657Lh;
import com.google.android.gms.internal.ads.InterfaceC2468Af;

/* loaded from: classes.dex */
public final class A implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4813n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4814u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4815v;

    public /* synthetic */ A(int i, Object obj, Object obj2) {
        this.f4813n = i;
        this.f4815v = obj;
        this.f4814u = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4813n) {
            case 0:
                V v9 = (V) this.f4814u;
                v9.k();
                C0467j.f((ViewGroup) v9.f4907c.f5050X.getParent(), ((B) this.f4815v).f4816n).e();
                break;
            default:
                ((C2657Lh) this.f4815v).n(view, (InterfaceC2468Af) this.f4814u, 10);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f4813n;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
