package A3;

import O.C0328b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes2.dex */
public final class a extends C0328b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f95e;

    public /* synthetic */ a(int i, Object obj) {
        this.f94d = i;
        this.f95e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r0.b() > 1) goto L12;
     */
    @Override // O.C0328b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z6;
        G0.a aVar;
        switch (this.f94d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f95e).f36790w);
                break;
            case 1:
            default:
                super.c(view, accessibilityEvent);
                break;
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) this.f95e;
                G0.a aVar2 = viewPager.f5314x;
                if (aVar2 != null) {
                    z6 = true;
                    break;
                }
                z6 = false;
                accessibilityEvent.setScrollable(z6);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = viewPager.f5314x) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(viewPager.f5316y);
                    accessibilityEvent.setToIndex(viewPager.f5316y);
                    break;
                }
                break;
        }
    }

    @Override // O.C0328b
    public final void d(View view, P.k kVar) {
        int i = -1;
        boolean z6 = false;
        Object obj = this.f95e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
        switch (this.f94d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f36791x);
                accessibilityNodeInfo.setChecked(checkableImageButton.f36790w);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2340a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f36796Q);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f2340a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                kVar.i(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                G0.a aVar = viewPager.f5314x;
                if (aVar != null && aVar.b() > 1) {
                    z6 = true;
                }
                accessibilityNodeInfo3.setScrollable(z6);
                if (viewPager.canScrollHorizontally(1)) {
                    kVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    kVar.a(8192);
                    break;
                }
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f2340a);
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                kVar.k(jVar.f36730F0.getVisibility() == 0 ? jVar.y().getResources().getString(C5248R.string.mtrl_picker_toggle_to_year_selection) : jVar.y().getResources().getString(C5248R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, kVar.f2340a);
                int i4 = MaterialButtonToggleGroup.f36666D;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i6 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i6) == view) {
                                i = i9;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.c(i6)) {
                                    i9++;
                                }
                                i6++;
                            }
                        }
                    }
                }
                kVar.j(P.j.a(0, 1, i, 1, ((MaterialButton) view).f36660H));
                break;
        }
    }

    @Override // O.C0328b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f94d) {
            case 2:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.f95e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f5316y - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f5316y + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
