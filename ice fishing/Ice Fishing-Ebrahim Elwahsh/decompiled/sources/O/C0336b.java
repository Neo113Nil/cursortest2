package O;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.icefishing.icefishingliveapp.C5284R;
import g1.C4524d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0336b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2247c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2248a;

    /* renamed from: b, reason: collision with root package name */
    public final C0334a f2249b;

    public C0336b() {
        this(f2247c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2248a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C4524d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2248a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C4524d(8, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2248a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, P.k kVar) {
        this.f2248a.onInitializeAccessibilityNodeInfo(view, kVar.f2675a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2248a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2248a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z8;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(C5284R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z9 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            P.f fVar = (P.f) list.get(i4);
            if (fVar.a() == i) {
                P.u uVar = fVar.f2672d;
                if (uVar != null) {
                    Class cls = fVar.f2671c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e6) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e6);
                        }
                    }
                    z8 = uVar.f(view);
                }
            } else {
                i4++;
            }
        }
        z8 = false;
        if (!z8) {
            z8 = this.f2248a.performAccessibilityAction(view, i, bundle);
        }
        if (z8 || i != C5284R.id.accessibility_action_clickable_span || bundle == null) {
            return z8;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C5284R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i10 = 0;
            while (true) {
                if (clickableSpanArr == null || i10 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i10])) {
                    clickableSpan.onClick(view);
                    z9 = true;
                    break;
                }
                i10++;
            }
        }
        return z9;
    }

    public void h(View view, int i) {
        this.f2248a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2248a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0336b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2248a = accessibilityDelegate;
        this.f2249b = new C0334a(this);
    }
}
