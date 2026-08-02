package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class dfq {
    public int a;
    public boolean b;
    public final bhp c = new bhp(2, this);
    public final /* synthetic */ SideSheetBehavior d;

    public dfq(SideSheetBehavior sideSheetBehavior) {
        this.d = sideSheetBehavior;
    }

    public final void a(int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        SideSheetBehavior sideSheetBehavior = this.d;
        weakReference = sideSheetBehavior.viewRef;
        if (weakReference != null) {
            weakReference2 = sideSheetBehavior.viewRef;
            if (weakReference2.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            weakReference3 = sideSheetBehavior.viewRef;
            ((View) weakReference3.get()).postOnAnimation(this.c);
            this.b = true;
        }
    }
}
