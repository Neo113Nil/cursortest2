package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public interface zdk {
    /* JADX WARN: Multi-variable type inference failed */
    default void startDivAnimation() {
        ViewGroup viewGroup;
        int childCount;
        if (!(this instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) this).getChildCount()) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            zdk zdkVar = childAt instanceof zdk ? (zdk) childAt : null;
            if (zdkVar != null) {
                zdkVar.startDivAnimation();
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    default void stopDivAnimation() {
        ViewGroup viewGroup;
        int childCount;
        if (!(this instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) this).getChildCount()) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            zdk zdkVar = childAt instanceof zdk ? (zdk) childAt : null;
            if (zdkVar != null) {
                zdkVar.stopDivAnimation();
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }
}
