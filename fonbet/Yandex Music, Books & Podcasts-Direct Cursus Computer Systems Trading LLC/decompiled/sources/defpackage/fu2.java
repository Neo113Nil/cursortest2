package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
import com.yandex.plus.plaquesdk.plaque.api.models.u;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class fu2 extends a {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fu2(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r3.b() > 1) goto L12;
     */
    @Override // androidx.core.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        h2k h2kVar;
        switch (this.d) {
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).d);
                break;
            case 9:
                lgu lguVar = (lgu) this.e;
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(lgu.class.getName());
                h2k h2kVar2 = lguVar.e;
                if (h2kVar2 != null) {
                    z = true;
                    break;
                }
                z = false;
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (h2kVar = lguVar.e) != null) {
                    accessibilityEvent.setItemCount(h2kVar.b());
                    accessibilityEvent.setFromIndex(lguVar.f);
                    accessibilityEvent.setToIndex(lguVar.f);
                    break;
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.a
    public void d(View view, vb vbVar) {
        int i = this.d;
        int i2 = -1;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                vbVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = vbVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (!((ze3) obj).k) {
                    accessibilityNodeInfo2.setDismissable(false);
                    break;
                } else {
                    vbVar.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                    break;
                }
            case 2:
            default:
                super.d(view, vbVar);
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                vbVar.l(checkableImageButton.e);
                vbVar.m(checkableImageButton.d);
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo3 = vbVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo3.setTraversalAfter((View) ((ClockFaceView) obj).x.get(intValue - 1));
                }
                vbVar.q(ub.d(view.isSelected(), 0, 1, intValue, 1));
                vbVar.o(true);
                vbVar.b(qb.e);
                break;
            case 5:
                view.getClass();
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.b(new qb(16, ((s2e) obj).e.getString(R.string.main_landing_content_expand_description)));
                break;
            case 6:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.r;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i2 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                vbVar.q(ub.d(((MaterialButton) view).o, 0, 1, i2, 1));
                break;
            case 7:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                adh adhVar = (adh) obj;
                vbVar.b(new qb(16, adhVar.r.getVisibility() == 0 ? adhVar.getString(R.string.mtrl_picker_toggle_to_year_selection) : adhVar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 8:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.l(((NavigationMenuItemView) obj).x);
                break;
            case 9:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n(lgu.class.getName());
                lgu lguVar = (lgu) obj;
                h2k h2kVar = lguVar.e;
                if (h2kVar != null && h2kVar.b() > 1) {
                    z = true;
                }
                vbVar.w(z);
                if (lguVar.canScrollHorizontally(1)) {
                    vbVar.a(4096);
                }
                if (lguVar.canScrollHorizontally(-1)) {
                    vbVar.a(RemoteCameraConfig.Notification.ID);
                    break;
                }
                break;
            case 10:
                view.getClass();
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.l(true);
                vbVar.m(((u) obj).f);
                vbVar.n("android.widget.Switch");
                break;
        }
    }

    @Override // androidx.core.view.a
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 2:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    cf3 cf3Var = (cf3) this.e;
                    int i = cf3.j;
                    cf3Var.c();
                    break;
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.a
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i != 1048576) {
                    break;
                } else {
                    ((b1r) ((ju2) this.e)).a(3);
                    break;
                }
            case 1:
                if (i == 1048576) {
                    ze3 ze3Var = (ze3) this.e;
                    if (ze3Var.k) {
                        ze3Var.cancel();
                        break;
                    }
                }
                break;
            case 4:
                ClockFaceView clockFaceView = (ClockFaceView) this.e;
                ClockHandView clockHandView = clockFaceView.t;
                Rect rect = clockFaceView.u;
                if (i != 16) {
                    break;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(rect);
                    float centerX = rect.centerX();
                    float centerY = rect.centerY();
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    break;
                }
            case 9:
                lgu lguVar = (lgu) this.e;
                if (!super.g(view, i, bundle)) {
                    if (i == 4096) {
                        if (lguVar.canScrollHorizontally(1)) {
                            lguVar.setCurrentItem(lguVar.f + 1);
                            break;
                        }
                    } else if (i == 8192 && lguVar.canScrollHorizontally(-1)) {
                        lguVar.setCurrentItem(lguVar.f - 1);
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
