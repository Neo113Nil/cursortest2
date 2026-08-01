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
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0026b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f784c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f785a;

    /* renamed from: b, reason: collision with root package name */
    public final C0025a f786b;

    public C0026b() {
        this(f784c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f785a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public B.b b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f785a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new B.b(9, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f785a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, P.f fVar) {
        this.f785a.onInitializeAccessibilityNodeInfo(view, fVar.f891a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f785a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f785a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            P.d dVar = (P.d) list.get(i2);
            if (dVar.a() == i) {
                P.o oVar = dVar.f890d;
                if (oVar != null) {
                    Class cls = dVar.f889c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z2 = oVar.a(view);
                }
            } else {
                i2++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f785a.performAccessibilityAction(view, i, bundle);
        }
        if (z2 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z2;
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
                    z3 = true;
                    break;
                }
                i4++;
            }
        }
        return z3;
    }

    public void h(View view, int i) {
        this.f785a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f785a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0026b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f785a = accessibilityDelegate;
        this.f786b = new C0025a(this);
    }
}
