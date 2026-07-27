package w;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.icecatchbiger.hookfrostmaster.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import x.C0287c;
import x.C0292h;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0264b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3049c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3050a = f3049c;

    /* renamed from: b, reason: collision with root package name */
    public final C0263a f3051b = new C0263a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3050a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, C0292h c0292h) {
        this.f3050a.onInitializeAccessibilityNodeInfo(view, c0292h.f3088a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C0287c) list.get(i3)).f3085a).getId() != i2; i3++) {
        }
        boolean performAccessibilityAction = this.f3050a.performAccessibilityAction(view, i2, bundle);
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
