package kotlin.text;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class CatchingFishAndroidX {
    public static final View.AccessibilityDelegate CatchingFishCoroutine = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate CatchingFishParcelableFAB;
    public final CatchingFishAppCompat CatchingFishSnackbar;

    public CatchingFishAndroidX() {
        this(CatchingFishCoroutine);
    }

    public void CatchingFishCoroutine(View view, AccessibilityEvent accessibilityEvent) {
        this.CatchingFishParcelableFAB.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void CatchingFishDaggerWebsocket(View view, AccessibilityEvent accessibilityEvent) {
        this.CatchingFishParcelableFAB.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void CatchingFishLayout(View view, AccessibilityEvent accessibilityEvent) {
        this.CatchingFishParcelableFAB.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean CatchingFishParcelableFAB(View view, AccessibilityEvent accessibilityEvent) {
        return this.CatchingFishParcelableFAB.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void CatchingFishReduxKtor(View view, CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        this.CatchingFishParcelableFAB.onInitializeAccessibilityNodeInfo(view, catchingFishViewJUnitJUnit.CatchingFishParcelableFAB);
    }

    public CatchingFishServiceHilt CatchingFishSnackbar(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.CatchingFishParcelableFAB.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new CatchingFishServiceHilt(4, accessibilityNodeProvider);
        }
        return null;
    }

    public void CatchingFishViewModelFAB(View view, int i) {
        this.CatchingFishParcelableFAB.sendAccessibilityEvent(view, i);
    }

    public boolean CatchingFishViewModelScope(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            CatchingFishBundleContext catchingFishBundleContext = (CatchingFishBundleContext) list.get(i2);
            if (catchingFishBundleContext.CatchingFishParcelableFAB() == i) {
                Class cls = catchingFishBundleContext.CatchingFishCoroutine;
                CatchingFishFluxBiometric catchingFishFluxBiometric = catchingFishBundleContext.CatchingFishReduxKtor;
                if (catchingFishFluxBiometric != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception unused) {
                        }
                    }
                    z = catchingFishFluxBiometric.CatchingFishSnackbar(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.CatchingFishParcelableFAB.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
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
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    public boolean CatchingFishWorkManager(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.CatchingFishParcelableFAB.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public CatchingFishAndroidX(View.AccessibilityDelegate accessibilityDelegate) {
        this.CatchingFishParcelableFAB = accessibilityDelegate;
        this.CatchingFishSnackbar = new CatchingFishAppCompat(this);
    }
}
