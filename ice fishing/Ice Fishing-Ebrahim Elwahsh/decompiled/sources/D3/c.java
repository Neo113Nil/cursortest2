package D3;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f689n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f690u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f691v;

    public /* synthetic */ c(Object obj, int i, int i4) {
        this.f689n = i4;
        this.f691v = obj;
        this.f690u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f689n) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f691v;
                View view = (View) sideSheetBehavior.f36217p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f690u, false);
                    break;
                }
                break;
            default:
                ((F.b) this.f691v).g(this.f690u);
                break;
        }
    }
}
