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
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g1.C4522b;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0323b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2061c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2062a;

    /* renamed from: b, reason: collision with root package name */
    public final C0321a f2063b;

    public C0323b() {
        this(f2061c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2062a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C4522b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2062a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C4522b(7, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2062a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, P.k kVar) {
        this.f2062a.onInitializeAccessibilityNodeInfo(view, kVar.f2409a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2062a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2062a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(C5275R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z6 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= list.size()) {
                break;
            }
            P.f fVar = (P.f) list.get(i6);
            if (fVar.a() == i) {
                P.u uVar = fVar.f2406d;
                if (uVar != null) {
                    Class cls = fVar.f2405c;
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
                    z3 = uVar.a(view);
                }
            } else {
                i6++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = this.f2062a.performAccessibilityAction(view, i, bundle);
        }
        if (z3 || i != C5275R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C5275R.id.tag_accessibility_clickable_spans);
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
                    z6 = true;
                    break;
                }
                i10++;
            }
        }
        return z6;
    }

    public void h(View view, int i) {
        this.f2062a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2062a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0323b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2062a = accessibilityDelegate;
        this.f2063b = new C0321a(this);
    }
}
