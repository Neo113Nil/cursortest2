package H3;

import A3.p;
import O.X;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1244a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1245b;

    /* renamed from: c, reason: collision with root package name */
    public int f1246c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1247d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1248e;

    public /* synthetic */ e() {
        this.f1244a = 1;
    }

    public void a(int i) {
        switch (this.f1244a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1248e;
                WeakReference weakReference = sideSheetBehavior.f36820p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1246c = i;
                    if (!this.f1245b) {
                        View view = (View) sideSheetBehavior.f36820p.get();
                        p pVar = (p) this.f1247d;
                        WeakHashMap weakHashMap = X.f2142a;
                        view.postOnAnimation(pVar);
                        this.f1245b = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1248e;
                WeakReference weakReference2 = bottomSheetBehavior.f36617U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1246c = i;
                    if (!this.f1245b) {
                        View view2 = (View) bottomSheetBehavior.f36617U.get();
                        r3.b bVar = (r3.b) this.f1247d;
                        WeakHashMap weakHashMap2 = X.f2142a;
                        view2.postOnAnimation(bVar);
                        this.f1245b = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(e eVar, O2.d[] dVarArr, boolean z6, int i) {
        this.f1244a = 2;
        this.f1248e = eVar;
        this.f1247d = dVarArr;
        boolean z9 = false;
        if (dVarArr != null && z6) {
            z9 = true;
        }
        this.f1245b = z9;
        this.f1246c = i;
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f1244a = 0;
        this.f1248e = sideSheetBehavior;
        this.f1247d = new p(2, this);
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f1244a = 3;
        this.f1248e = bottomSheetBehavior;
        this.f1247d = new r3.b(0, this);
    }
}
