package O;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.IceFishing.LiveIceFishing.C5248R;
import i1.C4585b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: O.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0328b f2148a;

    public C0326a(C0328b c0328b) {
        this.f2148a = c0328b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2148a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C4585b b9 = this.f2148a.b(view);
        if (b9 != null) {
            return (AccessibilityNodeProvider) b9.f38152u;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int i;
        P.k kVar = new P.k(accessibilityNodeInfo);
        WeakHashMap weakHashMap = X.f2142a;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(P.d(view));
        } else {
            tag = view.getTag(C5248R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i4 = 0;
        boolean z6 = bool != null && bool.booleanValue();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z6);
        } else {
            kVar.h(1, z6);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(P.c(view));
        } else {
            tag2 = view.getTag(C5248R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z9 = bool2 != null && bool2.booleanValue();
        if (i6 >= 28) {
            accessibilityNodeInfo.setHeading(z9);
        } else {
            kVar.h(2, z9);
        }
        CharSequence e9 = X.e(view);
        if (i6 >= 28) {
            accessibilityNodeInfo.setPaneTitle(e9);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e9);
        }
        if (i6 >= 30) {
            tag3 = S.b(view);
        } else {
            tag3 = view.getTag(C5248R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i6 >= 30) {
            P.g.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f2148a.d(view, kVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i6 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(C5248R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                    if (((WeakReference) sparseArray.valueAt(i9)).get() == null) {
                        arrayList.add(Integer.valueOf(i9));
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sparseArray.remove(((Integer) arrayList.get(i10)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C5248R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(C5248R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(C5248R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i11 = 0;
                while (i11 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i11];
                    int i12 = i4;
                    while (true) {
                        if (i12 >= sparseArray2.size()) {
                            i = P.k.f2339c;
                            P.k.f2339c = i + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i12)).get())) {
                                i = sparseArray2.keyAt(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i11]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i11];
                    Spanned spanned = (Spanned) text;
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i11++;
                    i4 = 0;
                }
            }
        }
        List list = (List) view.getTag(C5248R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            kVar.b((P.f) list.get(i13));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2148a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f2148a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f2148a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2148a.i(view, accessibilityEvent);
    }
}
