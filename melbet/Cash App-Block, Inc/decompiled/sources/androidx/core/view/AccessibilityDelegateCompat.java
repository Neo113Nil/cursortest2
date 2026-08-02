package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import coil3.Extras;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final AccessibilityDelegateAdapter mBridge;
    public final View.AccessibilityDelegate mOriginalDelegate;

    public final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {
        public final AccessibilityDelegateCompat mCompat;

        public AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.mCompat = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.mCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            Extras.Key accessibilityNodeProvider = this.mCompat.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f61default;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.mCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            wrap.setScreenReaderFocusable(ViewCompat.Api28Impl.isScreenReaderFocusable(view));
            Boolean bool = (Boolean) new ViewCompat.AnonymousClass3(1).get(view);
            wrap.setHeading(bool != null && bool.booleanValue());
            wrap.setPaneTitle(ViewCompat.Api28Impl.getAccessibilityPaneTitle(view));
            wrap.setStateDescription((CharSequence) new ViewCompat.AnonymousClass3(0).get(view));
            this.mCompat.onInitializeAccessibilityNodeInfo(view, wrap);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (int i = 0; i < list.size(); i++) {
                wrap.addAction((AccessibilityNodeInfoCompat.AccessibilityActionCompat) list.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.mCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.mCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.mCompat.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.mCompat.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.mCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new AccessibilityDelegateAdapter(this);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public Extras.Key getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new Extras.Key(accessibilityNodeProvider);
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
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
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (AccessibilityNodeInfoCompat.AccessibilityActionCompat) list.get(i2);
            if (accessibilityActionCompat.getId() == i) {
                Class cls = accessibilityActionCompat.mViewCommandArgumentClass;
                AccessibilityViewCommand accessibilityViewCommand = accessibilityActionCompat.mCommand;
                if (accessibilityViewCommand != null) {
                    if (cls != null) {
                        try {
                            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(cls.getDeclaredConstructor(null).newInstance(null));
                            throw null;
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = accessibilityViewCommand.perform(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            ClickableSpan[] clickableSpans = AccessibilityNodeInfoCompat.getClickableSpans(view.createAccessibilityNodeInfo().getText());
            int i4 = 0;
            while (true) {
                if (clickableSpans == null || i4 >= clickableSpans.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpans[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat() {
        this(DEFAULT_DELEGATE);
    }
}
