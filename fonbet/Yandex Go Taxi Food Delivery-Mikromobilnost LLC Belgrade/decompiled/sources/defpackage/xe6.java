package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes11.dex */
public final class xe6 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public xe6(b1 b1Var, CostCenterField costCenterField, int i) {
        this.a = 1;
        this.d = b1Var;
        this.b = i;
        this.e = costCenterField.b;
        this.c = costCenterField.d;
    }

    public void a(int i) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.t0;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.t0.get()).postOnAnimation((uz) obj);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.I;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.I.get()).postOnAnimation((mmp0) obj);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public xe6(jkx jkxVar, KeyEvent keyEvent) {
        this.a = 2;
        this.e = jkxVar;
        this.b = jkxVar.a.length;
        this.c = false;
        this.d = keyEvent;
    }

    public xe6(SideSheetBehavior sideSheetBehavior) {
        this.a = 3;
        this.e = sideSheetBehavior;
        this.d = new mmp0(21, this);
    }

    public xe6(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new uz(6, this);
    }
}
