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
import com.IceFishing.LiveIceFishing.C5248R;
import i1.C4585b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0328b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2149c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2150a;

    /* renamed from: b, reason: collision with root package name */
    public final C0326a f2151b;

    public C0328b() {
        this(f2149c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2150a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C4585b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2150a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C4585b(11, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2150a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, P.k kVar) {
        this.f2150a.onInitializeAccessibilityNodeInfo(view, kVar.f2340a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2150a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2150a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z6;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(C5248R.id.tag_accessibility_actions);
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
                P.u uVar = fVar.f2337d;
                if (uVar != null) {
                    Class cls = fVar.f2336c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e9) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e9);
                        }
                    }
                    z6 = uVar.f(view);
                }
            } else {
                i4++;
            }
        }
        z6 = false;
        if (!z6) {
            z6 = this.f2150a.performAccessibilityAction(view, i, bundle);
        }
        if (z6 || i != C5248R.id.accessibility_action_clickable_span || bundle == null) {
            return z6;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C5248R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i9 = 0;
            while (true) {
                if (clickableSpanArr == null || i9 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i9])) {
                    clickableSpan.onClick(view);
                    z9 = true;
                    break;
                }
                i9++;
            }
        }
        return z9;
    }

    public void h(View view, int i) {
        this.f2150a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2150a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0328b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2150a = accessibilityDelegate;
        this.f2151b = new C0326a(this);
    }
}
