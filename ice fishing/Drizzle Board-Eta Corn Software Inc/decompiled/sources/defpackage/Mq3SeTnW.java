package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.kolosta.rejin.jilosa.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class Mq3SeTnW {
    public static final View.AccessibilityDelegate MdtA4re8 = new View.AccessibilityDelegate();
    public final i7xS8jrb NCTxEWno;
    public final View.AccessibilityDelegate qoPGr6Ce;

    public Mq3SeTnW(View.AccessibilityDelegate accessibilityDelegate) {
        this.qoPGr6Ce = accessibilityDelegate;
        this.NCTxEWno = new i7xS8jrb(this);
    }

    public void MdtA4re8(View view, AccessibilityEvent accessibilityEvent) {
        this.qoPGr6Ce.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public tg0 NCTxEWno(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.qoPGr6Ce.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new tg0(1, accessibilityNodeProvider);
        }
        return null;
    }

    public boolean P7K7Inc8(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.qoPGr6Ce.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void Qr9iLBAD(View view, int i) {
        this.qoPGr6Ce.sendAccessibilityEvent(view, i);
    }

    public void VgvYg0wo(View view, AccessibilityEvent accessibilityEvent) {
        this.qoPGr6Ce.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean b2ZJblxo(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        for (int i2 = 0; i2 < list.size() && ((aZz0PFXp) list.get(i2)).qoPGr6Ce() != i; i2++) {
        }
        boolean performAccessibilityAction = this.qoPGr6Ce.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    public void jb9XjC4I(View view, AccessibilityEvent accessibilityEvent) {
        this.qoPGr6Ce.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean qoPGr6Ce(View view, AccessibilityEvent accessibilityEvent) {
        return this.qoPGr6Ce.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void wxUZMvaN(View view, nSmgoSB5 nsmgosb5) {
        this.qoPGr6Ce.onInitializeAccessibilityNodeInfo(view, nsmgosb5.qoPGr6Ce);
    }

    public Mq3SeTnW() {
        this(MdtA4re8);
    }
}
