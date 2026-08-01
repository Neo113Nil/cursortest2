package B0;

import O.C0026b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class m extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f60d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(int i, Object obj) {
        this.f60d = i;
        this.e = obj;
    }

    @Override // O.C0026b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f60d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f2549d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0026b
    public final void d(View view, P.f fVar) {
        int i;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        switch (this.f60d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((q) obj).j) {
                    fVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    break;
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                    break;
                }
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f891a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int i2 = MaterialButtonToggleGroup.f2432k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                            accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2429o));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                                i3++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f2429o));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = fVar.f891a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo3.setChecked(checkableImageButton.f2549d);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = fVar.f891a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f2560x);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = fVar.f891a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                accessibilityNodeInfo5.setHintText(materialCalendar.f2476h0.getVisibility() == 0 ? materialCalendar.k(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.k(R.string.mtrl_picker_toggle_to_day_selection));
                break;
        }
    }

    @Override // O.C0026b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f60d) {
            case 0:
                if (i == 1048576) {
                    q qVar = (q) this.e;
                    if (qVar.j) {
                        qVar.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
