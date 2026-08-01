package F;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f876n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f877u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f878v;

    public /* synthetic */ o(Object obj, int i, int i6) {
        this.f876n = i6;
        this.f878v = obj;
        this.f877u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f876n) {
            case 0:
                ((b) this.f878v).g(this.f877u);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f878v;
                View view = (View) sideSheetBehavior.f36052p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f877u, false);
                    break;
                }
                break;
        }
    }
}
