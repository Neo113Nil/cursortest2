package G0;

import O.C0336b;
import P.j;
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
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes.dex */
public final class f extends C0336b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1188e;

    public /* synthetic */ f(int i, Object obj) {
        this.f1187d = i;
        this.f1188e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r0.b() > 1) goto L14;
     */
    @Override // O.C0336b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z8;
        a aVar;
        switch (this.f1187d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) this.f1188e;
                a aVar2 = viewPager.f5461x;
                if (aVar2 != null) {
                    z8 = true;
                    break;
                }
                z8 = false;
                accessibilityEvent.setScrollable(z8);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = viewPager.f5461x) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(viewPager.f5463y);
                    accessibilityEvent.setToIndex(viewPager.f5463y);
                    break;
                }
                break;
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1188e).f36187w);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0336b
    public final void d(View view, k kVar) {
        int i = -1;
        boolean z8 = false;
        Object obj = this.f1188e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        switch (this.f1187d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                kVar.i(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                a aVar = viewPager.f5461x;
                if (aVar != null && aVar.b() > 1) {
                    z8 = true;
                }
                accessibilityNodeInfo.setScrollable(z8);
                if (viewPager.canScrollHorizontally(1)) {
                    kVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    kVar.a(8192);
                    break;
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f2675a);
                com.google.android.material.datepicker.k kVar2 = (com.google.android.material.datepicker.k) obj;
                kVar.k(kVar2.f36132K0.getVisibility() == 0 ? kVar2.y().getResources().getString(C5284R.string.mtrl_picker_toggle_to_year_selection) : kVar2.y().getResources().getString(C5284R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f2675a);
                int i4 = MaterialButtonToggleGroup.f36061D;
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
                kVar.j(j.a(0, 1, i, 1, ((MaterialButton) view).f36055H));
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2675a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f36188x);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f36187w);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f2675a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f36193Q);
                break;
        }
    }

    @Override // O.C0336b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f1187d) {
            case 0:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.f1188e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f5463y - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f5463y + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
