package B0;

import O.K;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54a;

    /* renamed from: b, reason: collision with root package name */
    public int f55b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f56c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f57d;
    public final /* synthetic */ B.c e;

    public k(SideSheetBehavior sideSheetBehavior) {
        this.f54a = 1;
        this.e = sideSheetBehavior;
        this.f57d = new D.a(3, this);
    }

    public final void a(int i) {
        Runnable runnable = this.f57d;
        B.c cVar = this.e;
        switch (this.f54a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar;
                WeakReference weakReference = bottomSheetBehavior.f2385U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f55b = i;
                    if (!this.f56c) {
                        WeakHashMap weakHashMap = K.f747a;
                        ((View) bottomSheetBehavior.f2385U.get()).postOnAnimation((j) runnable);
                        this.f56c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) cVar;
                WeakReference weakReference2 = sideSheetBehavior.f2576p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f55b = i;
                    if (!this.f56c) {
                        WeakHashMap weakHashMap2 = K.f747a;
                        ((View) sideSheetBehavior.f2576p.get()).postOnAnimation((D.a) runnable);
                        this.f56c = true;
                        break;
                    }
                }
                break;
        }
    }

    public k(BottomSheetBehavior bottomSheetBehavior) {
        this.f54a = 0;
        this.e = bottomSheetBehavior;
        this.f57d = new j(0, this);
    }
}
