package F3;

import D.RunnableC0282a;
import O.X;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f959a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f960b;

    /* renamed from: c, reason: collision with root package name */
    public int f961c;

    /* renamed from: d, reason: collision with root package name */
    public Object f962d;

    /* renamed from: e, reason: collision with root package name */
    public Object f963e;

    public /* synthetic */ e() {
        this.f959a = 1;
    }

    public void a(int i) {
        switch (this.f959a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f963e;
                WeakReference weakReference = sideSheetBehavior.f36052p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f961c = i;
                    if (!this.f960b) {
                        View view = (View) sideSheetBehavior.f36052p.get();
                        RunnableC0282a runnableC0282a = (RunnableC0282a) this.f962d;
                        WeakHashMap weakHashMap = X.f2054a;
                        view.postOnAnimation(runnableC0282a);
                        this.f960b = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f963e;
                WeakReference weakReference2 = bottomSheetBehavior.f35849U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f961c = i;
                    if (!this.f960b) {
                        View view2 = (View) bottomSheetBehavior.f35849U.get();
                        p3.b bVar = (p3.b) this.f962d;
                        WeakHashMap weakHashMap2 = X.f2054a;
                        view2.postOnAnimation(bVar);
                        this.f960b = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(e eVar, M2.d[] dVarArr, boolean z3, int i) {
        this.f959a = 2;
        this.f963e = eVar;
        this.f962d = dVarArr;
        boolean z6 = false;
        if (dVarArr != null && z3) {
            z6 = true;
        }
        this.f960b = z6;
        this.f961c = i;
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f959a = 0;
        this.f963e = sideSheetBehavior;
        this.f962d = new RunnableC0282a(1, this);
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f959a = 3;
        this.f963e = bottomSheetBehavior;
        this.f962d = new p3.b(0, this);
    }
}
