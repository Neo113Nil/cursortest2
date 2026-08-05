package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class yv extends Mq3SeTnW {
    @Override // defpackage.Mq3SeTnW
    public final void MdtA4re8(View view, AccessibilityEvent accessibilityEvent) {
        super.MdtA4re8(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r5 != 16908346) goto L30;
     */
    @Override // defpackage.Mq3SeTnW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b2ZJblxo(View view, int i, Bundle bundle) {
        if (super.b2ZJblxo(view, i, bundle)) {
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
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max != nestedScrollView.getScrollY()) {
                        nestedScrollView.I5GHvsYW(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min != nestedScrollView.getScrollY()) {
                nestedScrollView.I5GHvsYW(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.Mq3SeTnW
    public final void wxUZMvaN(View view, nSmgoSB5 nsmgosb5) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = nsmgosb5.qoPGr6Ce;
        this.qoPGr6Ce.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            nsmgosb5.NCTxEWno(aZz0PFXp.P7K7Inc8);
            nsmgosb5.NCTxEWno(aZz0PFXp.b2ZJblxo);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            nsmgosb5.NCTxEWno(aZz0PFXp.VgvYg0wo);
            nsmgosb5.NCTxEWno(aZz0PFXp.Qr9iLBAD);
        }
    }
}
