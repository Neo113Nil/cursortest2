package F;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f939n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f940u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f941v;

    public /* synthetic */ o(Object obj, int i, int i4) {
        this.f939n = i4;
        this.f941v = obj;
        this.f940u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f939n) {
            case 0:
                ((b) this.f941v).g(this.f940u);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f941v;
                View view = (View) sideSheetBehavior.f36820p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f940u, false);
                    break;
                }
                break;
        }
    }
}
