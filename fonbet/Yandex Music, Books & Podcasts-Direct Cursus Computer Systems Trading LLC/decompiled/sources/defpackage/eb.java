package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.view.a;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes3.dex */
public final class eb extends a {
    public final /* synthetic */ int d;

    public /* synthetic */ eb(int i) {
        this.d = i;
    }

    @Override // androidx.core.view.a
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 4:
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

    @Override // androidx.core.view.a
    public final void d(View view, vb vbVar) {
        int scrollRange;
        switch (this.d) {
            case 0:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                break;
            case 1:
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.p(null);
                break;
            case 2:
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.w(false);
                break;
            case 3:
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.p(null);
                break;
            case 4:
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                vbVar.n(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    vbVar.w(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        vbVar.b(qb.j);
                        vbVar.b(qb.o);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        vbVar.b(qb.i);
                        vbVar.b(qb.q);
                        break;
                    }
                }
                break;
            case 5:
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Switch");
                vbVar.l(true);
                wvr wvrVar = view instanceof wvr ? (wvr) view : null;
                vbVar.m(wvrVar != null && wvrVar.a.isChecked());
                break;
            case 6:
                AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
                this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(false);
                break;
            case 7:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 8:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 9:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 10:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 11:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 12:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 13:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.TextView");
                break;
            case 14:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 15:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 16:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 17:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 18:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.TextView");
                break;
            case 19:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 20:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 21:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            case 22:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
            default:
                view.getClass();
                this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
                vbVar.n("android.widget.Button");
                vbVar.b(qb.e);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r6 != 16908346) goto L32;
     */
    @Override // androidx.core.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 4:
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
                                nestedScrollView.w(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.w(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
