package F;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f220c;

    public /* synthetic */ m(int i, int i2, Object obj) {
        this.f218a = i2;
        this.f220c = obj;
        this.f219b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f218a) {
            case 0:
                ((b) this.f220c).g(this.f219b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f220c;
                View view = (View) sideSheetBehavior.f2576p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, this.f219b, false);
                    break;
                }
                break;
        }
    }
}
