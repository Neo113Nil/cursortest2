package G0;

import O.C0323b;
import P.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.icefishing.icefishinglive2.C5275R;

/* loaded from: classes.dex */
public final class g extends C0323b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1044e;

    public /* synthetic */ g(int i, Object obj) {
        this.f1043d = i;
        this.f1044e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r0.b() > 1) goto L14;
     */
    @Override // O.C0323b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z3;
        a aVar;
        switch (this.f1043d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) this.f1044e;
                a aVar2 = viewPager.f5349x;
                if (aVar2 != null) {
                    z3 = true;
                    break;
                }
                z3 = false;
                accessibilityEvent.setScrollable(z3);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = viewPager.f5349x) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(viewPager.f5351y);
                    accessibilityEvent.setToIndex(viewPager.f5351y);
                    break;
                }
                break;
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1044e).f36022w);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0323b
    public final void d(View view, k kVar) {
        int i = -1;
        boolean z3 = false;
        Object obj = this.f1044e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        switch (this.f1043d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                kVar.i(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                a aVar = viewPager.f5349x;
                if (aVar != null && aVar.b() > 1) {
                    z3 = true;
                }
                accessibilityNodeInfo.setScrollable(z3);
                if (viewPager.canScrollHorizontally(1)) {
                    kVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    kVar.a(8192);
                    break;
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f2409a);
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                kVar.k(jVar.f35967K0.getVisibility() == 0 ? jVar.y().getResources().getString(C5275R.string.mtrl_picker_toggle_to_year_selection) : jVar.y().getResources().getString(C5275R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f2409a);
                int i6 = MaterialButtonToggleGroup.f35898D;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i9 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i9) == view) {
                                i = i10;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i9) instanceof MaterialButton) && materialButtonToggleGroup.c(i9)) {
                                    i10++;
                                }
                                i9++;
                            }
                        }
                    }
                }
                kVar.j(P.j.a(0, 1, i, 1, ((MaterialButton) view).f35892H));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2409a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f36023x);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f36022w);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f2409a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f36028Q);
                break;
        }
    }

    @Override // O.C0323b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f1043d) {
            case 0:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.f1044e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f5351y - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f5351y + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
