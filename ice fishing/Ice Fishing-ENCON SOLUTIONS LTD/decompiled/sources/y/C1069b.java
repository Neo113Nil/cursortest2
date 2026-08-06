package y;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.watchfacestudio.spraktum.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import z.C1091c;
import z.C1096h;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1069b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f8571c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f8572a = f8571c;

    /* renamed from: b, reason: collision with root package name */
    public final C1068a f8573b = new C1068a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f8572a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, C1096h c1096h) {
        this.f8572a.onInitializeAccessibilityNodeInfo(view, c1096h.f8618a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1091c) list.get(i3)).f8615a).getId() != i2; i3++) {
        }
        boolean performAccessibilityAction = this.f8572a.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }
}
