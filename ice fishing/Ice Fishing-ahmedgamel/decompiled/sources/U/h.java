package U;

import O.C0328b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public final class h extends C0328b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3243d;

    public /* synthetic */ h(int i) {
        this.f3243d = i;
    }

    @Override // O.C0328b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3243d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0328b
    public final void d(View view, P.k kVar) {
        int scrollRange;
        switch (this.f3243d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                kVar.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        kVar.b(P.f.i);
                        kVar.b(P.f.f2332m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        kVar.b(P.f.f2328h);
                        kVar.b(P.f.f2333n);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f2150a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2340a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (!DrawerLayout.l(view)) {
                    accessibilityNodeInfo2.setParent(null);
                    break;
                }
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f2150a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = kVar.f2340a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            case 3:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f2150a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = kVar.f2340a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate5 = this.f2150a;
                AccessibilityNodeInfo accessibilityNodeInfo5 = kVar.f2340a;
                accessibilityDelegate5.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // O.C0328b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f3243d) {
            case 0:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i != 4096) {
                        if (i != 8192 && i != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
