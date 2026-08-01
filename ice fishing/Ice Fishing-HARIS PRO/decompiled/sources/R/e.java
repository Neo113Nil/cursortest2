package R;

import O.C0026b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class e extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1003d;

    public /* synthetic */ e(int i) {
        this.f1003d = i;
    }

    @Override // O.C0026b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1003d) {
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

    @Override // O.C0026b
    public final void d(View view, P.f fVar) {
        int scrollRange;
        switch (this.f1003d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f785a;
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                fVar.h(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        fVar.b(P.d.f883g);
                        fVar.b(P.d.f885k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        fVar.b(P.d.f882f);
                        fVar.b(P.d.f886l);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f785a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f891a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f785a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = fVar.f891a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f785a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = fVar.f891a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // O.C0026b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f1003d) {
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
